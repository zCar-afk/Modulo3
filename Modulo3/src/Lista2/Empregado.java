package Lista2;

public class Empregado {
	public String primeironome;
	public String sobrenome;
	public int salariomensal;

public Empregado (String primeironome, String sobrenome, int salariomensal) {
	this.primeironome = primeironome;
	this.sobrenome = sobrenome;
	this.salariomensal = salariomensal;
}
	
public String getprimeironome() {
	return primeironome; 
}
public String getsobrenome() {
	return sobrenome;	
}
public double getsalariomensal() {
	return salariomensal;
}
public void setprimeironome(String primeironome) {
	 this.primeironome = primeironome;
}
public void setsobrenome(String sobrenome) {
	 this.sobrenome = sobrenome;
}
public void setsalariomensal(int salariomensal) {
	if(salariomensal >= 0) 
	this.salariomensal = salariomensal;
	else { this.salariomensal = 0;	// TODO Auto-generated method stub~
	}
	}
public double getsalarioanual() {
	return this.salariomensal * 12;
	
}
public double getaumento( ) {
	return this.salariomensal * 1.1;
}
public double getsalarioanualfinal() {
	return getaumento() * 12;
}
}

