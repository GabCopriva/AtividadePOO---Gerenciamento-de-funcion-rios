package correcaoatividadadeaula10;

public class Gerente extends Funcionario{    //Classe pública pois ela será acessada por outros métodos e classes
    
    private double bonus;

    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);      //Chama o construtor da classe pai
        this.bonus = bonus;
    }

    
    public double getSalarioFinal(){
        return this.getSalarioFinal() + this.bonus;
    }
    
}
