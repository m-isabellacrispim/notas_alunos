import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int I;
		double nota = 0;

		for (I = 0; I < 3; I++) {

			System.out.println("Digite sua nota");
			double num = sc.nextDouble();

			nota = nota + num;
		}

		System.out.printf("Sua Media ficou: %.2f\n", nota / 3);

		if (nota / 3 < 7)
			System.out.println("Reprovado");
		else
			System.out.println("Aprovado");

		sc.close();
	}

}
