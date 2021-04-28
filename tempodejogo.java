package atvdanielo;
import java.util.Locale;
import java.util.Scanner;
public class tempodejogo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horai, horaf, horat;
		
		System.out.print("Hora Inicial: ");
		horai = sc.nextInt();
		
		System.out.print("Hora Final: ");
		horaf = sc.nextInt();
		
		if (horai < horaf) {
		horat = horaf - horai;
		}
		else {
        horat = (24 - horai) + horaf;
		}
	
		System.out.print("O JOGO DUROU: " + horat);
		sc.close();
	}

}
