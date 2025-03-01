package api.produtos.springcourse.produtosapi.repository;

import api.produtos.springcourse.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
