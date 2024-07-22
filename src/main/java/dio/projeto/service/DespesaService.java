package dio.projeto.service;

import dio.projeto.model.Despesa;

import java.util.List;

public interface DespesaService {
    List<Despesa> listarTodas();
    Despesa criarDespesa(Despesa despesa);
}