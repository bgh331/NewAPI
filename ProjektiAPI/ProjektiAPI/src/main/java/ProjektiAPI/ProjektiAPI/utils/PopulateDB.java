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
		
		repository.save(new Kysely("Minkä kokoinen on Islanti?", "a) Iso", "b) Keskikokoinen", "c) Pieni"));
		
	}
}