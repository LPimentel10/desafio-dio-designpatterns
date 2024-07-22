package dio.projeto.service;

import dio.projeto.chain.AbstractAprovador;
import dio.projeto.model.Despesa;
import dio.projeto.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaServiceImpl implements DespesaService {

    @Autowired
    private DespesaRepository despesaRepository;

    @Autowired
    private AbstractAprovador chain;

    @Override
    public List<Despesa> listarTodas() {
        return despesaRepository.findAll();
    }

    @Override
    public Despesa criarDespesa(Despesa despesa) {
        chain.aprovar(despesa);
        return despesaRepository.save(despesa);
    }
}