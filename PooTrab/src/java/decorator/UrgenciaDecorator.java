package decorator;

import model.IServico;

/**
 *
 * @author Usuario
 */
public class UrgenciaDecorator extends ServicoDecorator {

    private static final double VALOR_ADICIONAL = 80.0;

    public UrgenciaDecorator(IServico servico) {
        super(servico);
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + " + Urgência";
    }

    @Override
    public double getPreco() {
        return servico.getPreco() + VALOR_ADICIONAL;
    }

}
