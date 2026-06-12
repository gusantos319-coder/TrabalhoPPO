package decorator;

import model.IServico;

/**
 *
 * @author Usuario
 */
public class GarantiaEstendidaDecorator extends ServicoDecorator {

    private static final double VALOR_ADICIONAL = 50.0;

    public GarantiaEstendidaDecorator(IServico servico) {
        super(servico);
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + " + Garantia Estendida";
    }

    @Override
    public double getPreco() {
        return servico.getPreco() + VALOR_ADICIONAL;
    }

}
