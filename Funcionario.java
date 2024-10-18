
package correcaoatividadadeaula10;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    
    public double getSalarioFinal(){
        return this.getSalarioBase();
    }
    
    public Funcionario (){
        
    }
    
    public Funcionario(String nome, String cpf, double salarioBase){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    
    public double getSalarioBase() {
        return salarioBase;
    }
    public void aumentarSalario(){
        this.aumentarSalario(10.0);
    }
    public void aumentarSalario(double porcentagem){
        this.salarioBase = this.getSalarioBase() + (this.getSalarioBase() * (porcentagem/100));
    }
    
    public void aumentarSalario(double porcentagem, double bonusExtra){
        this.aumentarSalario(porcentagem);
        this.salarioBase = this.salarioBase + bonusExtra;
    }
    
}
