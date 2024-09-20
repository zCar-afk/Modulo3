package Lista2;

public class principal {

	public static void main(String[] args) {
		Empregado objeto1 = new Empregado("Cristiano", "Ronaldo", 5000);
		Empregado empregado2 = new Empregado("Lionel", "Messi", 2000);
		
		System.out.println("Empregado 1 Antes do aumento: ");
		System.out.println("\nPrimeiro Nome : " + objeto1.getprimeironome());
		System.out.println("Sobrenome : " + objeto1.getsobrenome());
		System.out.println("Salário Mensal Inical: " + objeto1.getsalariomensal());
		System.out.println("Salário Anual : " +objeto1.getsalarioanual());
		System.out.println("\nDepois do aumento: ");
		System.out.println("\nSalário Mensal Final : " + objeto1.getaumento());
		System.out.println("Salário Anual Final: " + objeto1.getsalarioanualfinal());
		
		System.out.println("\n Enmpregado 2 Antes do Aumento: ");
		System.out.println("\nPrimeiro Nome : " + empregado2.getprimeironome());
		System.out.println("Sobrenome : " + empregado2.getsobrenome());
		System.out.println("Salário Mensal Inical: " + empregado2.getsalariomensal());
		System.out.println("Salário Anual : " +empregado2.getsalarioanual());
		System.out.println("\nDepois do aumento");
		System.out.println("\nSalário Mensal Final : " + empregado2.getaumento());
		System.out.println("Salário Anual Final: " + empregado2.getsalarioanualfinal());
	
	}
	
}
