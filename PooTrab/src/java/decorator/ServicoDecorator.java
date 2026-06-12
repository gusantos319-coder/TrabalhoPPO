package decorator;

import model.IServico;

/**
 *
 * @author Usuario
 */
public abstract class ServicoDecorator implements IServico {

    protected IServico servico;

    public ServicoDecorator(IServico servico) {
        this.servico = servico;
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao();
    }

    @Override
    public double getPreco() {
        return servico.getPreco();
    }

}
