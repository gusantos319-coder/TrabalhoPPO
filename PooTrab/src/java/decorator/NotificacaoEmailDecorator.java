package decorator;

import model.IServico;

/**
 *
 * @author Usuario
 */
public class NotificacaoEmailDecorator extends ServicoDecorator {

    private static final double VALOR_ADICIONAL = 10.0;

    public NotificacaoEmailDecorator(IServico servico) {
        super(servico);
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + " + Notificação por E-mail";
    }

    @Override
    public double getPreco() {
        return servico.getPreco() + VALOR_ADICIONAL;
    }

}
