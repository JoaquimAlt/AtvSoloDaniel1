package atvdanielo;
import java.util.Locale;
import java.util.Scanner;

public class preco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int custoFab, porcDist, valDist, porcImp, valImp, preco;
		
		System.out.print("Informe o custo de fábrica: ");
		custoFab = sc.nextInt();
		
		porcDist = 15;
		porcImp = 20;
		
		if (custoFab < 12000) {
			porcDist = 5;
			porcImp = 0;
		}
		else {
			if (custoFab < 25000) {
				porcDist = 10;
				porcImp = 15;
			}
			else {
				porcDist = 15;
				porcImp = 20;
			}
		}
	
	valDist = custoFab * porcDist / 100;
	valImp = custoFab * porcImp / 100;
	preco = custoFab * valDist + valImp;
	
	System.out.print("Preço ao consumidor: " + preco + " reais");
	sc.close();
	}

}
