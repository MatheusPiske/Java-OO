package bytebank;

public class Operacoes {
	public static void main(String[] args) {
		Conta conta1 = new Conta(45, 564);
		Conta conta2 = new Conta(45, 564);
		Conta conta3 = new Conta(45, 564);
		
		System.out.println("O número de contas criadas é: " + Conta.getTotal());
	}
}
