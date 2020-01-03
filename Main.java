import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static Car[] carArray;
	public static int numOfCar;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean exit = true;
		Car question;
		double choise;

		do {
			System.out.println("1-Create a car catalog\n" + "2-Select car\n" + "3-Exit!\n");
			int menuChoise = scan.nextInt();
			switch (menuChoise) {
			case 1:
				System.out.println("How many car create do you want?");
				numOfCar = scan.nextInt();
				carArray = new Car[numOfCar]; // Car[2]
				for (int i = 0; i < numOfCar; i++) {
					question = new Car(JOptionPane.showInputDialog("Enter brand"),
							Integer.parseInt(JOptionPane.showInputDialog("Enter model")),
							Double.parseDouble(JOptionPane.showInputDialog("Enter mileage")),
							JOptionPane.showInputDialog("Enter color"));
					carArray[i] = question;
				}
				break;
			case 2:
				System.out.println("How many km at least do you want");
				choise = scan.nextDouble();

				for (int i = 0; i < numOfCar; i++) {
					if (choise > carArray[i].mileage) {

						System.out.println("Question:" + carArray[i].brand + ", " + carArray[i].model + ","
								+ carArray[i].mileage + "," + carArray[i].getColor());

					}

				}

				break;

			case 4:
				System.out.println("Exited!");
				exit = false;
				break;
			default:
				System.out.println("Wrong entrance!");
			}
		} while (exit);
	}
}