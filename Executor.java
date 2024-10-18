package correcaoatividadadeaula10;

public class Executor {
    public static void main(String[] args) {
        
        Departamento dept = new Departamento();
        dept.addFuncionario(new Funcionario("João","12345678", 1000.00));
        dept.addFuncionario(new Funcionario("João","12345678", 1000.00));
        dept.addFuncionario(new Funcionario("João","12345678", 1000.00));
        dept.addFuncionario(new Diretor("João","12345678", 1000.00, 2500.00, 10.00));
        
        System.out.println("Total folha: " + dept.calcularFolhaPagamento());
    }
}
