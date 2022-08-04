
public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if(this.saldo >= valor) {
			saca(valor);
			contaDestino.deposita(valor);
			System.out.println("depositado com sucesso");
			return true;
		}else {
			System.out.println("saldo insulficiente, deposite no mínimo" + (valor -= this.saldo) + "para depositar esse valor");
			return false;
		}
	}
	
}
