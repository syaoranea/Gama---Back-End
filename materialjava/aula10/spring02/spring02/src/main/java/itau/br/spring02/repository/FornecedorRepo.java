package itau.br.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import itau.br.spring02.model.Fornecedor;


public interface FornecedorRepo extends CrudRepository<Fornecedor, Long>{
    
}
