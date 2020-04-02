package ProjektiAPI.ProjektiAPI.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface KyselyRepository extends CrudRepository<Kysely, Long> {
	List<Kysely> findByQuestion(@Param("question") String question);
	List<Kysely> findByContent(@Param("content") String content);
	List<Kysely> findByContent1(@Param("content1") String content1);
	List<Kysely> findByContent2(@Param("content2") String content2);
	
}