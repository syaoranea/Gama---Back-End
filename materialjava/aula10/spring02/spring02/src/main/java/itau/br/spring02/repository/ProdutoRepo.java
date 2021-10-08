package itau.br.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import itau.br.spring02.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Long>{

    
    
}
