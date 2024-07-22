package dio.projeto.chain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChainConfig {

    @Bean
    public AprovadorBasico chain() {
        AprovadorBasico aprovadorBasico = new AprovadorBasico();
        AprovadorIntermediario aprovadorIntermediario = new AprovadorIntermediario();
        AprovadorAvancado aprovadorAvancado = new AprovadorAvancado();

        aprovadorBasico.setNext(aprovadorIntermediario);
        aprovadorIntermediario.setNext(aprovadorAvancado);
        return aprovadorBasico;
    }
}