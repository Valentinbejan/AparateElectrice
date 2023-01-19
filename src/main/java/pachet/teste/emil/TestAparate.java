package pachet.teste.emil;

import pachet.clase.emil.*;

public class TestAparate {

	public static void main(String[] args) {
		Aspirator aspirator = new Aspirator();
		RobotBucatarie robotBucatarie = new RobotBucatarie();
		Televizor televizor = new Televizor();
		StatieCalcat statieCalcat = new StatieCalcat();

		System.out.println("Aspirator: " + aspirator);
		System.out.println("Robot de bucatarie: " + robotBucatarie);
		System.out.println("Televizor: " + televizor);
		System.out.println("Statie de calcat: " + statieCalcat);

	}
}
