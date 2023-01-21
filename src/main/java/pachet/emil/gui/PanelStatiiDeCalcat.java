package pachet.emil.gui;

import java.awt.Font;
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

import pachet.clasegeneratoare.emil.GeneratorStatiiCalcat;
import pachet.emil.clase.StatieCalcat;
import pachet.emil.clasefilter.StatieCalcatFilter;

public class PanelStatiiDeCalcat extends JPanel {
	private static final long serialVersionUID = 5656L;
	private JComboBox<String> comboBox1 = new JComboBox<>();
	private JComboBox<String> comboBox2 = new JComboBox<>();

	public PanelStatiiDeCalcat() {
		setLayout(null); //absolute
		adaugaButoaneImportExport();
		adaugaGenerarea();
		adaugaFiltrarea();
	}

	private void adaugaButoaneImportExport() {
		JButton btnExport = new JButton("Export");
		btnExport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (GUI.getListaStatiiDeCalcat().isEmpty() == true) {
					GUI.afisare("Eroare export: lista este goala.");
					return;
				}
				JFileChooser jFileChooser = GUI.getjFileChooser();
				int option = jFileChooser.showSaveDialog(btnExport);
				if (option == JFileChooser.APPROVE_OPTION) {
					File file = jFileChooser.getSelectedFile();
					GUI.serialize(GUI.getListaStatiiDeCalcat(), file);
					GUI.afisare("Fisierul " + GUI.getjFileChooser().getSelectedFile().getPath()
							+ " a fost exportat cu success.");
				}
			}
		});
		btnExport.setRequestFocusEnabled(false);
		btnExport.setFont(new Font("Arial", Font.BOLD, 12));
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
					ArrayList<StatieCalcat> lista = GUI.deserialize(file, StatieCalcat.class);
					if (lista != null) {
						GUI.setListaStatiiDeCalcat(lista);
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
		btnImport.setFont(new Font("Arial", Font.BOLD, 12));
		btnImport.setBounds(47, 21, 100, 25);
		add(btnImport);

	}

	private void adaugaGenerarea() {
		JLabel labelGenerare = new JLabel("Nr. statii de calcat:");
		labelGenerare.setFont(new Font("Arial", Font.BOLD, 12));
		labelGenerare.setHorizontalAlignment(SwingConstants.LEFT);
		labelGenerare.setBounds(47, 73, 149, 22);
		add(labelGenerare);

		JTextField textFieldGenerare;
		textFieldGenerare = new JTextField();
		textFieldGenerare.setFont(new Font("Arial", Font.BOLD, 13));
		textFieldGenerare.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldGenerare.setBounds(217, 72, 100, 25);
		textFieldGenerare.setColumns(10);
		add(textFieldGenerare);

		JButton btnGenerare = new JButton("Genereaza");
		btnGenerare.setFont(new Font("Arial", Font.BOLD, 12));
		btnGenerare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String textcaseta = textFieldGenerare.getText();
				if (!GUI.isInteger(textcaseta)) {
					return;
				}
				GUI.setListaStatiiDeCalcat(GeneratorStatiiCalcat.genereaza(Integer.parseInt(textcaseta)));
				GUI.afisare(GUI.getListaStatiiDeCalcat());
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
				if (GUI.getListaStatiiDeCalcat() != null) {
					GUI.afisare(GUI.getListaStatiiDeCalcat());
				}
			}
		});
		bntAfisareElemGenerate.setRequestFocusEnabled(false);
		bntAfisareElemGenerate.setFont(new Font("Arial", Font.BOLD, 12));
		bntAfisareElemGenerate.setBounds(217, 122, 100, 30);
		add(bntAfisareElemGenerate);
	}

	private void adaugaFiltrarea() {
		JLabel labelFiltrare = new JLabel("Filtreza dupa: ");
		labelFiltrare.setFont(new Font("Arial", Font.BOLD, 14));
		labelFiltrare.setHorizontalAlignment(SwingConstants.CENTER);
		labelFiltrare.setBounds(118, 171, 100, 22);
		add(labelFiltrare);

		JLabel metoda1FiltrareLabel = new JLabel("Material talpa:");
		metoda1FiltrareLabel.setFont(new Font("Arial", Font.BOLD, 12));
		metoda1FiltrareLabel.setHorizontalAlignment(SwingConstants.LEFT);
		metoda1FiltrareLabel.setBounds(46, 213, 161, 31);
		add(metoda1FiltrareLabel);

		comboBox1.setModel(GUI.comboBoxModel(GeneratorStatiiCalcat.getLista_materiale_talpa()));
		comboBox1.setBounds(217, 216, 100, 25);
		add(comboBox1);

		JLabel metoda2Label = new JLabel("Dupa functie: ");
		metoda2Label.setFont(new Font("Arial", Font.BOLD, 12));
		metoda2Label.setHorizontalAlignment(SwingConstants.LEFT);
		metoda2Label.setBounds(47, 267, 160, 31);
		add(metoda2Label);

		comboBox2.setModel(GUI.comboBoxModel(GeneratorStatiiCalcat.getLista_functii()));
		comboBox2.setBounds(217, 270, 100, 25);
		add(comboBox2);

		JButton btnFiltrare = new JButton("Filtreaza");
		btnFiltrare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (GUI.getListaStatiiDeCalcat() == null) {
					return;
				}
				ArrayList<StatieCalcat> listaFiltrata = new ArrayList<>();
				String textDinCaseta1 = comboBox1.getModel().getSelectedItem().toString();
				String textDinCaseta2 = comboBox2.getModel().getSelectedItem().toString();
				boolean saFacutPrimaFiltrare = false;
				boolean saFacutADouaFiltrare = false;
				if (textDinCaseta1.equals("oricare") == false) {
					listaFiltrata = StatieCalcatFilter.filtreazaDupaMaterialTalpa(GUI.getListaStatiiDeCalcat(),
							textDinCaseta1);
					saFacutPrimaFiltrare = true;
				}
				if (textDinCaseta2.equals("oricare") == false) {
					if (saFacutPrimaFiltrare) {
						listaFiltrata = StatieCalcatFilter.filtreazaDupaFunctie(listaFiltrata, textDinCaseta2);
					} else {
						listaFiltrata = StatieCalcatFilter.filtreazaDupaFunctie(GUI.getListaStatiiDeCalcat(),
								textDinCaseta2);
					}
					saFacutADouaFiltrare = true;
				}
				if (saFacutPrimaFiltrare == false && saFacutADouaFiltrare == false) {
					listaFiltrata = GUI.getListaStatiiDeCalcat();
				}

				GUI.afisare(listaFiltrata);
				System.gc();
			}
		});

		btnFiltrare.setFont(new Font("Arial", Font.BOLD, 12));
		btnFiltrare.setBounds(118, 324, 100, 30);
		btnFiltrare.setRequestFocusEnabled(false);
		add(btnFiltrare);
	}

}
