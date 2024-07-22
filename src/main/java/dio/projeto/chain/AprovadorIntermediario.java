package dio.projeto.chain;

import dio.projeto.model.Despesa;
import org.springframework.stereotype.Component;

@Component
public class AprovadorIntermediario extends AbstractAprovador {

    @Override
    public void aprovar(Despesa despesa) {
        if (despesa.getValor() <= 5000) {
            despesa.setStatus("Aprovado pelo Aprovador Intermediário");
        } else if (next != null) {
            next.aprovar(despesa);
        }
    }
}