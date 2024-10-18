package correcaoatividadadeaula10;

public class Departamento {
    
    private Funcionario[] funcionários = new Funcionario[10];
    int counter = 0;
    
    public void addFuncionario(Funcionario f){
        if(counter == this.funcionários.length){
            System.out.println("Limite de funcionários atingido!");
            return;
        }
         for( int i = 0; i < this.funcionários.length; i++){
            if(funcionários[i] == null){
                this.funcionários[i] = f;
                break;
            }
        }
    }
    
    
    public double calcularFolhaPagamento(){
        double totalFolha = 0.0;
        for(Funcionario f : this.funcionários){
            totalFolha = totalFolha + f.getSalarioFinal();
        }
        return totalFolha;
    }
}
