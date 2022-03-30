package org.generation.produtoRepository;

import java.util.List;

import org.generation.farmaciaModel.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryProduto extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);
	

}
