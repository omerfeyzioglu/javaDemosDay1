package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 10;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {

				break;
			}
		}
		if (varMi) {
			System.out.println("dizide var");
		} else {
			System.out.println("dizide bulunmuyor.");
		}

	}

}