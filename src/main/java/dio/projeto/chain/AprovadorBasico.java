package dio.projeto.chain;

import dio.projeto.model.Despesa;
import org.springframework.stereotype.Component;

@Component
public class AprovadorBasico extends AbstractAprovador {

    @Override
    public void aprovar(Despesa despesa) {
        if (despesa.getValor() <= 1000) {
            despesa.setStatus("Aprovado pelo Aprovador Básico");
        } else if (next != null) {
            next.aprovar(despesa);
        }
    }
}