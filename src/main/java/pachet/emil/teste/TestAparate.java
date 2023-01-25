package pachet.emil.teste;

import pachet.emil.clase.*;

public class TestAparate {

	public static void main(String[] args) {
		Aspirator aspirator1 = new Aspirator();
		RobotBucatarie robotBucatarie1 = new RobotBucatarie();
		Televizor televizor1 = new Televizor();
		StatieCalcat statieCalcat1 = new StatieCalcat();

		System.out.println("Aspirator: " + aspirator1);
		System.out.println("Robot de bucatarie: " + robotBucatarie1);
		System.out.println("Televizor: " + televizor1);
		System.out.println("Statie de calcat: " + statieCalcat1);

		Aspirator aspirator2 = new Aspirator("Aspirator32", "producator", 1234, "rosu", 1234, 'A', "vertical", "uscata",
				"plastic", "plastic", "HEPA", 123, 1234, 40, 3);
		Aspirator aspirator3 = new Aspirator(aspirator2);
		System.out.println(aspirator3);

	}
}
