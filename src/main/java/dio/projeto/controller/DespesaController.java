package dio.projeto.controller;

import dio.projeto.model.Despesa;
import dio.projeto.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/despesas")
public class DespesaController {

    @Autowired
    private DespesaService despesaService;

    @GetMapping
    public List<Despesa> listarTodas() {
        return despesaService.listarTodas();
    }

    @PostMapping
    public Despesa criarDespesa(@RequestBody Despesa despesa) {
        return despesaService.criarDespesa(despesa);
    }
}