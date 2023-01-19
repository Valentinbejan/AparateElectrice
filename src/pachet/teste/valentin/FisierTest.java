
package pachet.teste.valentin;

import pachet.clase.valentin.*;

public class FisierTest {
	public static void main(String args[]) {
		MasinaSpalatRufe masina1 = new MasinaSpalatRufe();
		masina1.setNumeProdus("Masina de spalat rufe");
		masina1.setProducator("Samsung");
		masina1.setPret(2700);
		masina1.setCuloare("alba");
		masina1.setPutereConsumata(5500);
		masina1.setCapacicate(15);
		masina1.setRotatii(700);
		System.out.println(masina1);

		MasinaSpalatRufe masina2 = new MasinaSpalatRufe("Masina de spalat rufe 2", "Samsung", 3000, "alba", 4700);
		masina2.setCapacicate(12);
		masina2.setRotatii(750);
		System.out.println(masina2);

		MasinaSpalatVase vase1 = new MasinaSpalatVase();
		vase1.setNumeProdus("Masina de spalat vase");
		vase1.setProducator("LG");
		vase1.setPret(4000);
		vase1.setCuloare("rosie");
		vase1.setPutereConsumata(5200);
		vase1.setNumarSeturi(12);
		vase1.setLatimeCuva(16.0);
		System.out.println(vase1);

		MasinaSpalatVase vase2 = new MasinaSpalatVase("Masina de spalat vase 2", "BOSCH", 3500, "neagra", 4800);
		vase2.setNumarSeturi(15);
		vase2.setLatimeCuva(18);
		System.out.println(vase2);

		System.out.println(masina1.calculeazaPretConsumPeLuna(2) + " [W] pe Luna");
		System.out.println(masina1.calculeazaPretConsumPeZi(2) + " [W] pe Zi");
		System.out.println(masina2.calculeazaPretConsumPeLuna(2) + " [W] pe Luna");
		System.out.println(masina2.calculeazaPretConsumPeZi(2) + " [W] pe Zi");

		System.out.println(vase1.calculeazaPretConsumPeLuna(2) + " [W] pe Luna");
		System.out.println(vase2.calculeazaPretConsumPeZi(2) + " [W] pe Zi");
		System.out.println(vase2.calculeazaPretConsumPeLuna(2) + " [W] pe Luna");
		System.out.println(vase2.calculeazaPretConsumPeZi(2) + " [W] pe Zi");

	}
}
