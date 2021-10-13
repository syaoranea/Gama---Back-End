package itau.br.spring02.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itau.br.spring02.model.Fornecedor;
import itau.br.spring02.repository.FornecedorRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/fornecedor")
public class FornecedorController {

    @Autowired // injeção de dependencia
    private FornecedorRepo repo;
    
    @GetMapping("/{codigo}")
    public ResponseEntity<Fornecedor> buscaFornecedor(@PathVariable long codigo){
        Fornecedor  fornecedor =  repo.findById(codigo).orElse(null);

        if (fornecedor != null) {
            return ResponseEntity.ok(fornecedor); // ok = 200 = sucesso
        }
        return ResponseEntity.notFound().build(); // not found = 404 nao achou o que pediu
    }

    @PostMapping("/novo")
    public ResponseEntity<Fornecedor> inserir(@RequestBody Fornecedor fornecedor){
        Fornecedor novoFornecedor = repo.save(fornecedor);

        //return ResponseEntity.ok(novoFornecedor);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoFornecedor);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Fornecedor> atualizar(@RequestBody Fornecedor fornecedor){
        long id = fornecedor.getCodigo();
        if (id == 0 ) {
            return ResponseEntity.badRequest().build();
        }

        Fornecedor  fornecedorEncontrado =  repo.findById(id).orElse(null);

        if (fornecedorEncontrado == null ) {
            return ResponseEntity.badRequest().build();
        }
        Fornecedor fornecedorAtualizado = repo.save(fornecedor);

        return ResponseEntity.ok(fornecedorAtualizado);
    }

    @DeleteMapping("/apagar/{codigo}")
    public ResponseEntity<Void> apagar(@PathVariable long codigo){
        Fornecedor  fornecedorEncontrado =  repo.findById(codigo).orElse(null);

        if (fornecedorEncontrado == null ) {
            //return ResponseEntity.notFound().build();
           // return ResponseEntity.status(404).build();
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        repo.deleteById(codigo);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Fornecedor>> listarTodos(){
        List<Fornecedor> lista = (List<Fornecedor>) repo.findAll();
        return ResponseEntity.ok(lista);
    }
    
}
