package ProjektiAPI.ProjektiAPI.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ProjektiAPI.ProjektiAPI.domain.Kysely;
import ProjektiAPI.ProjektiAPI.domain.KyselyRepository;


@Component
public class PopulateDB {
	@Autowired
	private KyselyRepository repository; 
	
	public void populate() {
		repository.deleteAll();
		
		repository.save(new Kysely("Ajan ja tehtävien hallinta", "Teen tehtäväni sitä mukaan kun ne ilmestyy.", "Teen töistä aikataulun, jota pyrin noudattamaan.", 
				"Suunnittelen ja priorisoin säännölliset työtehtävät keskittyen olennaiseen."));
		repository.save(new Kysely("Stressinhallinta", "Tiedän kuinka stressiä voisi hallita, mutta tunnen itseni usein stressaantuneeksi.", "Saan usein hallittua omat stressitasoni.", 
				"Stressinhallintani voisi olla parempi työympäristössä."));
		
	}
}