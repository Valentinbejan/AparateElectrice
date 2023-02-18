package pachet.emil.gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import pachet.emil.clase.Aspirator;
import pachet.emil.clasefilter.AspiratorFilter;
import pachet.emil.clasegeneratoare.GeneratorAspiratoare;

public class PanelAspiratoare extends JPanel {
	private static final long serialVersionUID = 5656L;
	private static JTextField metoda1TextField;
	private static JComboBox<String> comboBox2;

	public PanelAspiratoare() {
		metoda1TextField = new JTextField();
		comboBox2 = new JComboBox<>();
		setLayout(null); // absolute
		adaugaButoaneImportExport();
		adaugaGenerarea();
		adaugaFiltrarea();
	}

	private void adaugaButoaneImportExport() {
		JButton btnExport = new JButton("Export");
		btnExport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (GUI.getListaAspiratoare().isEmpty()) {
					GUI.afisare("Eroare export: lista este goala.");
					return;
				}
				JFileChooser jFileChooser = GUI.getjFileChooser();
				int option = jFileChooser.showSaveDialog(btnExport);
				if (option == JFileChooser.APPROVE_OPTION) {
					File file = jFileChooser.getSelectedFile();
					GUI.serialize(GUI.getListaAspiratoare(), file);
					GUI.afisare("Fisierul " + GUI.getjFileChooser().getSelectedFile().getPath()
							+ " a fost exportat cu success.");
				}
			}
		});
		btnExport.setRequestFocusEnabled(false);
		btnExport.setFont(GUI.getFontButoane());
		btnExport.setBounds(217, 21, 100, 25);
		add(btnExport);

		JButton btnImport = new JButton("Import");
		btnImport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser jFileChooser = GUI.getjFileChooser();
				int option = jFileChooser.showOpenDialog(btnImport);
				if (option == JFileChooser.APPROVE_OPTION) {
					File file = jFileChooser.getSelectedFile();
					ArrayList<Aspirator> lista = GUI.deserialize(file, Aspirator.class);
					if (lista != null) {
						GUI.setListaAspiratoare(lista);
						GUI.afisare("Fisierul " + GUI.getjFileChooser().getSelectedFile().getPath()
								+ " a fost importat cu success.");
					} else {
						GUI.afisare("Eroare import: Fisier " + GUI.getjFileChooser().getSelectedFile().getPath()
								+ " nu este unul valid.");
					}
				}
			}
		});
		btnImport.setRequestFocusEnabled(false);
		btnImport.setFont(GUI.getFontButoane());
		btnImport.setBounds(47, 21, 100, 25);
		add(btnImport);
	}

	private void adaugaGenerarea() {
		JLabel labelGenerare = new JLabel("Nr. aspiratoare:");
		labelGenerare.setFont(GUI.getFontLabel());
		labelGenerare.setHorizontalAlignment(SwingConstants.LEFT);
		labelGenerare.setBounds(47, 73, 149, 22);
		add(labelGenerare);

		JTextField textFieldGenerare;
		textFieldGenerare = new JTextField();
		textFieldGenerare.setFont(GUI.getFontTextField());
		textFieldGenerare.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldGenerare.setBounds(217, 72, 100, 25);
		textFieldGenerare.setColumns(10);
		add(textFieldGenerare);

		JButton btnGenerare = new JButton("Genereaza");
		btnGenerare.setFont(GUI.getFontButoane());
		btnGenerare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String textcaseta = textFieldGenerare.getText();
				if (!GUI.isInteger(textcaseta)) {
					return;
				}
				GUI.setListaAspiratoare(GeneratorAspiratoare.genereaza(Integer.parseInt(textcaseta)));
				GUI.afisare(GUI.getListaAspiratoare());
				System.gc();
			}
		});
		btnGenerare.setBounds(47, 122, 100, 30);
		btnGenerare.setRequestFocusEnabled(false);
		add(btnGenerare);

		JButton bntAfisareElemGenerate = new JButton("Afisare");
		bntAfisareElemGenerate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI.afisare(GUI.getListaAspiratoare());
			}
		});

		bntAfisareElemGenerate.setRequestFocusEnabled(false);
		bntAfisareElemGenerate.setFont(GUI.getFontButoane());
		bntAfisareElemGenerate.setBounds(217, 122, 100, 30);
		add(bntAfisareElemGenerate);
	}

	private void adaugaFiltrarea() {
		JLabel labelFiltrare = new JLabel("Filtreza dupa: ");
		labelFiltrare.setFont(GUI.getFontLabel());
		labelFiltrare.setHorizontalAlignment(SwingConstants.CENTER);
		labelFiltrare.setBounds(118, 171, 100, 22);
		add(labelFiltrare);

		JLabel metoda1FiltrareLabel = new JLabel("Capacitate de colectare <=");
		metoda1FiltrareLabel.setFont(GUI.getFontLabel());
		metoda1FiltrareLabel.setHorizontalAlignment(SwingConstants.LEFT);
		metoda1FiltrareLabel.setBounds(46, 213, 161, 31);
		add(metoda1FiltrareLabel);

		metoda1TextField.setFont(GUI.getFontTextField());
		metoda1TextField.setHorizontalAlignment(SwingConstants.CENTER);
		metoda1TextField.setBounds(217, 216, 100, 25);
		metoda1TextField.setColumns(10);
		add(metoda1TextField);

		JLabel metoda2Label = new JLabel("Clasa emisiilor de praf:");
		metoda2Label.setFont(GUI.getFontLabel());
		metoda2Label.setHorizontalAlignment(SwingConstants.LEFT);
		metoda2Label.setBounds(47, 267, 160, 31);
		add(metoda2Label);

		comboBox2.setModel(GUI.comboBoxModel(GeneratorAspiratoare.getClaseEmisiPraf()));
		comboBox2.setBounds(217, 270, 100, 25);
		comboBox2.setFont(GUI.getFontComboBox());
		add(comboBox2);

		JButton btnFiltrare = new JButton("Filtreaza");
		btnFiltrare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (GUI.getListaAspiratoare() == null) {
					return;
				}
				ArrayList<Aspirator> listaFiltrata = new ArrayList<>();

				String textDinCaseta1 = metoda1TextField.getText();
				String textDinCaseta2 = comboBox2.getModel().getSelectedItem().toString();

				boolean saFacutPrimaFiltrare = false;
				boolean saFacutADouaFiltrare = false;
				if (GUI.isInteger(textDinCaseta1)) {
					listaFiltrata = AspiratorFilter.filtreazaDupaCapacitateaDeColectare(GUI.getListaAspiratoare(),
							Integer.parseInt(textDinCaseta1));
					saFacutPrimaFiltrare = true;
				}

				if (!textDinCaseta2.equals("oricare")) {
					char caracterDinCaseta2 = textDinCaseta2.charAt(0);
					if (saFacutPrimaFiltrare) {
						listaFiltrata = AspiratorFilter.filtreazaDupaClasaEmisiilorDePraf(listaFiltrata,
								caracterDinCaseta2);
					} else {
						listaFiltrata = AspiratorFilter.filtreazaDupaClasaEmisiilorDePraf(GUI.getListaAspiratoare(),
								caracterDinCaseta2);
					}
					saFacutADouaFiltrare = true;
				}

				if (!saFacutPrimaFiltrare && !saFacutADouaFiltrare) {
					listaFiltrata = GUI.getListaAspiratoare();
				}
				
				GUI.afisareFiltrare(listaFiltrata);
			}
		});
		btnFiltrare.setFont(GUI.getFontButoane());
		btnFiltrare.setBounds(118, 324, 100, 30);
		btnFiltrare.setRequestFocusEnabled(false);
		add(btnFiltrare);
	}

}
