package integracao.bancodedados.contatos;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

	//procurar pela primeira palavra
	Contato findFirstByNome(String nome);
	
	//Ignorar maiúsculas
	List<Contato> findAllByNomeIgnoreCaseContaining(String nome);
	
	//Selecionar por ordem ascendente 
	@Query(value = "SELECT c FROM Contato c ORDER BY nome")
	Stream<Contato> buscaTodosContatos();
	
	//ordena por ordem alfabetica, e depois verificar uma palavra
	 @Query(value = "SELECT * FROM contato ORDER BY nome", nativeQuery = true)
	 List<Contato>  buscaTodosContatos2(String string);


}
