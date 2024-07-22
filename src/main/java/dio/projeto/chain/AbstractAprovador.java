package dio.projeto.chain;

import dio.projeto.model.Despesa;

public abstract class AbstractAprovador {
    protected AbstractAprovador next;

    public void setNext(AbstractAprovador next) {
        this.next = next;
    }

    public abstract void aprovar(Despesa despesa);
}