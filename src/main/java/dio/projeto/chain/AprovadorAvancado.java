package dio.projeto.chain;

import dio.projeto.model.Despesa;
import org.springframework.stereotype.Component;

@Component
public class AprovadorAvancado extends AbstractAprovador {

    @Override
    public void aprovar(Despesa despesa) {
        despesa.setStatus("Aprovado pelo Aprovador Avançado");
    }
}