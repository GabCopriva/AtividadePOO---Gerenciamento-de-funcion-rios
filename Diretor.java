package correcaoatividadadeaula10;

public class Diretor extends Gerente{
    private double porcentagemParticipacaoLucros;

    public Diretor(String nome, String cpf, double salarioBase, double bonus, double porcentagemParticipacaoLucros) {
        super(nome, cpf, salarioBase, bonus);
        this.porcentagemParticipacaoLucros = porcentagemParticipacaoLucros;
    }

    @Override
    public double getSalarioFinal() {
        return (super.getSalarioFinal() * this.porcentagemParticipacaoLucros);
        
    }
    
    
}
