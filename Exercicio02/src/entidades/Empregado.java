package entidades;

public class Empregado {

    public String nome;
    public double salarioBruto;
    public double desconto;

    public double salarioLiquido(){
        return salarioBruto - desconto;
    }

    public void salarioLiquido(double porcentagem){
        salarioBruto += salarioBruto * porcentagem/100;
    }

    public String toString(){
        return nome + ", R$ " + String.format("%.2f", salarioLiquido());
    }
}
