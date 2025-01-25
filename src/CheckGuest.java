import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        System.out.println("Come ti chiami?");
        String nome = input.nextLine();

        boolean trovato = false;

        for (int i = 0; i < invitati.length; i++) {
            if (nome.equals(invitati[i])) {
                trovato = true;
            }
        }

        if (trovato) {
            System.out.println("Entra!!");
        } else {
            System.out.println("Fuori!!");
        }

    }
}
