package pachet.emil.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import pachet.emil.clase.Aspirator;
import pachet.emil.clase.RobotBucatarie;
import pachet.emil.clase.StatieCalcat;
import pachet.emil.clase.Televizor;

public class GUI extends JFrame {

	private static final long serialVersionUID = 5656L;

	private static ArrayList<Aspirator> listaAspiratoare;
	private static ArrayList<RobotBucatarie> listaRobotiDeBucatarie;
	private static ArrayList<StatieCalcat> listaStatiiDeCalcat;
	private static ArrayList<Televizor> listaTelevizoare;
	private static JTextArea textArea;
	private static JFileChooser jFileChooser;
	private static Font fontButoane;
	private static Font fontTextField;
	private static Font fontLabel;
	private static Font fontComboBox;

	/**
	 * Create the frame.
	 */

	public GUI() {

		listaAspiratoare = new ArrayList<>();
		listaRobotiDeBucatarie = new ArrayList<>();
		listaStatiiDeCalcat = new ArrayList<>();
		listaTelevizoare = new ArrayList<>();

		jFileChooser = new JFileChooser();

		fontButoane = new Font("Arial", Font.BOLD, 12);
		fontTextField = new Font("Arial", Font.BOLD, 13);
		fontLabel = new Font("Arial", Font.BOLD, 12);
		fontComboBox = new Font("Arial", Font.BOLD, 13);

		textArea = new JTextArea();
		textArea.setFont(new Font("TimesNewRoman", Font.PLAIN, 14));

		setTitle("Aparate Electrice");
		setResizable(false);
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 600);

		JPanel backgroundJPanel;
		backgroundJPanel = new JPanel();
		backgroundJPanel.setBackground(Color.DARK_GRAY);
		backgroundJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(backgroundJPanel);
		backgroundJPanel.setLayout(null);

		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(384, 5, 525, 546);
		backgroundJPanel.add(scrollPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 374, 546);

		backgroundJPanel.add(tabbedPane);

		Icon aspiratorIcon = loadImageIcon("/icons/aspirator.png");
		Icon robotDeBucatarieIcon = loadImageIcon("/icons/robotbucatarie.png");
		Icon statieDeCalcatIcon = loadImageIcon("/icons/statiedecalcat.png");
		Icon televizorIcon = loadImageIcon("/icons/televizor.png");

		tabbedPane.setFont(new Font("Arial", Font.BOLD, 12));
		tabbedPane.addTab("Aspiratoare", aspiratorIcon, new PanelAspiratoare());
		tabbedPane.addTab("Roboti de bucatarie", robotDeBucatarieIcon, new PanelRobotiDeBucatarie());
		tabbedPane.addTab("Statii de calcat", statieDeCalcatIcon, new PanelStatiiDeCalcat());
		tabbedPane.addTab("Televizoare", televizorIcon, new PanelTelevizoare());

		// tabbedPane.setFocusable(false);

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// metoda incarcare Icon-uri

	static ImageIcon loadImageIcon(String absolutePath) {
		URL url = GUI.class.getResource(absolutePath);
		Image image = new ImageIcon(url).getImage().getScaledInstance(40, 40, Image.SCALE_FAST); // 40 x 40 pixeli
		return new ImageIcon(image);

	}

	// metode folosite in JPanels
	static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	static void afisare(String text) {
		if (text == null)
			return;
		textArea.setText(text);
		System.gc();
	}

	static <T> void afisare(ArrayList<T> objects) {
		if (objects == null)
			return;

		if (objects.size() == 0) {
			textArea.setText("Eroare afisare: Nici un aparat electric de acest tip nu a fost generat.");
			return;
		}
		StringBuffer sir = new StringBuffer();
		for (Object obj : objects)
			sir.append(obj.toString());
		textArea.setText(sir.toString());
		System.gc();

	}

	static <T> void afisareFiltrare(ArrayList<T> objects) {

		if (objects.size() == 0) {
			textArea.setText("Filtrare: Nu a fost gasit nici un aparat electric.");
			return;
		}

		afisare(objects);
		if (objects.size() == 1) {
			textArea.append("A fost gasit un singur aparat electric.\n\n");
		} else {
			textArea.append("Au fost gasite " + objects.size() + " aparate electrice.\n\n");
		}

	}

	static DefaultComboBoxModel<String> comboBoxModel(String[] lista) {
		String[] listaNoua = new String[lista.length + 1];
		listaNoua[0] = "oricare";
		for (int i = 1; i < listaNoua.length; i++)
			listaNoua[i] = lista[i - 1];
		return new DefaultComboBoxModel<String>(listaNoua);
	}

	static <T> void serialize(T object, File file) {
		if (object != null && object instanceof Serializable == false) {
			return;
		}
		String filePath = file.getAbsolutePath();
		// FOS implementeaza Closeable -> poate fi declarat in try
		// pentru a se inchide dupa executia blocului try
		try (FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(object);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	static <T> ArrayList<T> deserialize(File file, Class<T> tClass) {
		String filePath = file.getAbsolutePath();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String primaLinie = reader.readLine();
			// testez daca prima linie a fisierului serializat
			// contine numele clasei
			if (primaLinie != null && primaLinie.contains(tClass.getName())) {
				FileInputStream fis = new FileInputStream(filePath);
				ObjectInputStream ois = new ObjectInputStream(fis);
				ArrayList<T> array = (ArrayList<T>) ois.readObject();
				ois.close();
				fis.close();
				return array;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

	// Getteri si setteri
	static JFileChooser getjFileChooser() {
		return jFileChooser;
	}

	static ArrayList<RobotBucatarie> getListaRobotiDeBucatarie() {
		return listaRobotiDeBucatarie;
	}

	static void setListaRobotiDeBucatarie(ArrayList<RobotBucatarie> listaRobotiDeBucatarie) {
		GUI.listaRobotiDeBucatarie = listaRobotiDeBucatarie;
	}

	static ArrayList<StatieCalcat> getListaStatiiDeCalcat() {
		return listaStatiiDeCalcat;
	}

	static void setListaStatiiDeCalcat(ArrayList<StatieCalcat> listaStatiiDeCalcat) {
		GUI.listaStatiiDeCalcat = listaStatiiDeCalcat;
	}

	static ArrayList<Televizor> getListaTelevizoare() {
		return listaTelevizoare;
	}

	static void setListaTelevizoare(ArrayList<Televizor> listaTelevizoare) {
		GUI.listaTelevizoare = listaTelevizoare;
	}

	static ArrayList<Aspirator> getListaAspiratoare() {
		return listaAspiratoare;
	}

	static void setListaAspiratoare(ArrayList<Aspirator> listaAspiratoare) {
		GUI.listaAspiratoare = listaAspiratoare;
	}

	static Font getFontButoane() {
		return fontButoane;
	}

	static Font getFontTextField() {
		return fontTextField;
	}

	static Font getFontLabel() {
		return fontLabel;
	}

	static Font getFontComboBox() {
		return fontComboBox;
	}

}
