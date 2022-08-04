
public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.saldo);
		
		
		primeiraConta.saca(50);
		System.out.println(primeiraConta.saldo);	
		
		Conta segundaConta = new Conta();
		System.out.println("O saldo inicial da segunda conta e de " + segundaConta.saldo);
		
		primeiraConta.transfere(50, segundaConta);
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		
		segundaConta.transfere(20, primeiraConta);
		System.out.println(primeiraConta.saldo);
	}
	
	
}
