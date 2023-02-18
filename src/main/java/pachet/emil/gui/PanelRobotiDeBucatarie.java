package pachet.emil.gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import pachet.emil.clase.RobotBucatarie;
import pachet.emil.clasefilter.RobotBucatarieFilter;
import pachet.emil.clasegeneratoare.GeneratorRobotiBucatarie;

public class PanelRobotiDeBucatarie extends JPanel {
	private static final long serialVersionUID = 5656L;
	private static JTextField metoda1TextField;
	private static JTextField metoda2TextField;

	public PanelRobotiDeBucatarie() {
		metoda1TextField = new JTextField();
		metoda2TextField = new JTextField();
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
				if (GUI.getListaRobotiDeBucatarie().isEmpty()) {
					GUI.afisare("Eroare export: lista este goala.");
					return;
				}
				JFileChooser jFileChooser = GUI.getjFileChooser();
				int option = jFileChooser.showSaveDialog(btnExport);
				if (option == JFileChooser.APPROVE_OPTION) {
					File file = jFileChooser.getSelectedFile();
					GUI.serialize(GUI.getListaRobotiDeBucatarie(), file);
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

					ArrayList<RobotBucatarie> lista = GUI.deserialize(file, RobotBucatarie.class);
					if (lista != null) {
						GUI.setListaRobotiDeBucatarie(lista);
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
		JLabel labelGenerare = new JLabel("Nr. roboti de bucatarie:");
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
				GUI.setListaRobotiDeBucatarie(GeneratorRobotiBucatarie.genereaza(Integer.parseInt(textcaseta)));
				GUI.afisare(GUI.getListaRobotiDeBucatarie());
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

				GUI.afisare(GUI.getListaRobotiDeBucatarie());

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

		JLabel metoda1FiltrareLabel = new JLabel("Numarul de viteze <=");
		metoda1FiltrareLabel.setFont(GUI.getFontLabel());
		metoda1FiltrareLabel.setHorizontalAlignment(SwingConstants.LEFT);
		metoda1FiltrareLabel.setBounds(46, 213, 161, 31);
		add(metoda1FiltrareLabel);

		metoda1TextField.setFont(GUI.getFontTextField());
		metoda1TextField.setHorizontalAlignment(SwingConstants.CENTER);
		metoda1TextField.setBounds(217, 216, 100, 25);
		metoda1TextField.setColumns(10);
		add(metoda1TextField);

		JLabel metoda2Label = new JLabel("Numarul de ustensile <=");
		metoda2Label.setFont(GUI.getFontLabel());
		metoda2Label.setHorizontalAlignment(SwingConstants.LEFT);
		metoda2Label.setBounds(47, 267, 160, 31);
		add(metoda2Label);

		metoda2TextField.setFont(GUI.getFontTextField());
		metoda2TextField.setHorizontalAlignment(SwingConstants.CENTER);
		metoda2TextField.setColumns(10);
		metoda2TextField.setBounds(217, 270, 100, 25);
		add(metoda2TextField);

		JButton btnFiltrare = new JButton("Filtreaza");
		btnFiltrare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (GUI.getListaRobotiDeBucatarie() == null) {
					return;
				}
				ArrayList<RobotBucatarie> listaFiltrata = new ArrayList<>();
				String textDinCaseta1 = metoda1TextField.getText();
				String textDinCaseta2 = metoda2TextField.getText();

				boolean saFacutPrimaFiltrare = false;
				boolean saFacutADouaFiltrare = false;

				if (GUI.isInteger(textDinCaseta1)) {
					listaFiltrata = RobotBucatarieFilter.filtreazaDupaNumarViteze(GUI.getListaRobotiDeBucatarie(),
							Integer.parseInt(textDinCaseta1));
					saFacutPrimaFiltrare = true;
				}

				if (GUI.isInteger(textDinCaseta2)) {
					if (saFacutPrimaFiltrare) {
						listaFiltrata = RobotBucatarieFilter.filtreazaDupaNumarUstensile(listaFiltrata,
								Integer.parseInt(textDinCaseta2));
					} else {
						listaFiltrata = RobotBucatarieFilter.filtreazaDupaNumarUstensile(
								GUI.getListaRobotiDeBucatarie(), Integer.parseInt(textDinCaseta2));
					}
					saFacutADouaFiltrare = true;
				}

				if (!saFacutPrimaFiltrare && !saFacutADouaFiltrare) {
					listaFiltrata = GUI.getListaRobotiDeBucatarie();
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