package bytebank;

public class Conta {
    /* Um atributo privado não pode ser modificado nem lido */
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total; 
    
    // Construtor
    
    public Conta(int agencia, int numero) {
    	total++;
    	this.agencia = agencia;
    	this.numero = numero;
    }
    
    // Criação de métodos
    
    /* Manipular o valor */
    public void deposita (double valor) {
        this.saldo += valor;
    }
    public boolean saca (double valor) {
        // Não precisamos indicar a conta que o valor será sacado, uma vez que, na hora de chamar 
        //o método, ele já estará orientado a objeto (diferente da função).
        
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public boolean transfere (double valor, Conta conta) {
        if (this.saldo >= valor) {
            this.saca(valor);
            conta.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
    public double getSaldo () {
        double valor = this.saldo;
        return valor;
    }
    
    /* Manipular a agencia */
    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    /* Manipular o numero */
    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /* Manipular o titular */
    public Cliente getTitular() {
        return this.titular;
    }
    public void setTitular(Cliente cliente) {
        this.titular = cliente;
    }
    
    /* Manipular o total */
    public static int getTotal() {
    	return Conta.total;
    }
}

