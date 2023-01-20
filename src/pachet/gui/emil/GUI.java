package pachet.gui.emil;

import java.awt.Color;
import java.awt.EventQueue;
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

import pachet.clase.emil.Aspirator;
import pachet.clase.emil.RobotBucatarie;
import pachet.clase.emil.StatieCalcat;
import pachet.clase.emil.Televizor;

public class GUI extends JFrame {

	private static final long serialVersionUID = 5656L;
	private static JTextArea textArea = new JTextArea();
	private static JFileChooser jFileChooser = new JFileChooser();
	private static ArrayList<Aspirator> listaAspiratoare = new ArrayList<>();
	private static ArrayList<RobotBucatarie> listaRobotiDeBucatarie = new ArrayList<>();
	private static ArrayList<StatieCalcat> listaStatiiDeCalcat = new ArrayList<>();
	private static ArrayList<Televizor> listaTelevizoare = new ArrayList<>();

	/**
	 * Create the frame.
	 */

	public GUI() {
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

		Icon aspiratorIcon = null;
		Icon robotDeBucatarieIcon = null;
		Icon statieDeCalcatIcon = null;
		Icon televizorIcon = null;

		boolean exportInJarFile = false;

		if (exportInJarFile) {
			aspiratorIcon = getImageIconInJar("/res/aspirator.png");
			robotDeBucatarieIcon = getImageIconInJar("/res/robotbucatarie.png");
			statieDeCalcatIcon = getImageIconInJar("/res/statiedecalcat.png");
			televizorIcon = getImageIconInJar("/res/televizor.png");
		} else {
			aspiratorIcon = getImageIcon("res/aspirator.png");
			robotDeBucatarieIcon = getImageIcon("res/robotbucatarie.png");
			statieDeCalcatIcon = getImageIcon("res/statiedecalcat.png");
			televizorIcon = getImageIcon("res/televizor.png");
		}

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

	// metode incarcare Icon-uri
	public ImageIcon getImageIcon(String path) {
		return new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(40, 40, 1));
	}

	public ImageIcon getImageIconInJar(String classPath) {

		return new ImageIcon(new ImageIcon(getClass().getResource(classPath)).getImage().getScaledInstance(40, 40, 1));
	}

	// metode folosite in JPanels
	public static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void afisare(String text) {
		if (text == null)
			return;
		GUI.textArea.setText(text);
	}

	public static <T> void afisare(ArrayList<T> objects) {
		if (objects == null)
			return;
		StringBuilder textString = new StringBuilder();
		for (Object obj : objects)
			textString.append(obj.toString());
		GUI.textArea.setText(textString.toString());
		System.gc();
	}

	public static DefaultComboBoxModel<String> comboBoxModel(String[] lista) {
		String[] listaNoua = new String[lista.length + 1];
		listaNoua[0] = "oricare";
		for (int i = 1; i < listaNoua.length; i++)
			listaNoua[i] = lista[i - 1];
		return new DefaultComboBoxModel<String>(listaNoua);
	}

	public static <T> void serialize(T object, File file) {
		if (object instanceof Serializable == false) {
			return;
		}
		String filePath = file.getAbsolutePath();
		// FOS implementeaza Closeable -> poate fi declarat in try
		// pentru a se inchide dupa executia blocului try
		try (FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(object);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public static <T> ArrayList<T> deserialize(File file, T tempObj) {
		String filePath = file.getAbsolutePath();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String primaLinie = reader.readLine();
			// testez daca prima linie a fisierului serializat
			// contine numele clasei
			if (primaLinie != null && primaLinie.contains(tempObj.getClass().getName())) {
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
	public static JFileChooser getjFileChooser() {
		return jFileChooser;
	}

	public static ArrayList<RobotBucatarie> getListaRobotiDeBucatarie() {
		return listaRobotiDeBucatarie;
	}

	public static void setListaRobotiDeBucatarie(ArrayList<RobotBucatarie> listaRobotiDeBucatarie) {
		GUI.listaRobotiDeBucatarie = listaRobotiDeBucatarie;
	}

	public static ArrayList<StatieCalcat> getListaStatiiDeCalcat() {
		return listaStatiiDeCalcat;
	}

	public static void setListaStatiiDeCalcat(ArrayList<StatieCalcat> listaStatiiDeCalcat) {
		GUI.listaStatiiDeCalcat = listaStatiiDeCalcat;
	}

	public static ArrayList<Televizor> getListaTelevizoare() {
		return listaTelevizoare;
	}

	public static void setListaTelevizoare(ArrayList<Televizor> listaTelevizoare) {
		GUI.listaTelevizoare = listaTelevizoare;
	}

	public static ArrayList<Aspirator> getListaAspiratoare() {
		return listaAspiratoare;
	}

	public static void setListaAspiratoare(ArrayList<Aspirator> listaAspiratoare) {
		GUI.listaAspiratoare = listaAspiratoare;
	}

}
