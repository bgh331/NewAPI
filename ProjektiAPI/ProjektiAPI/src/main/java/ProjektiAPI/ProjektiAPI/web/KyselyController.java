package ProjektiAPI.ProjektiAPI.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ProjektiAPI.ProjektiAPI.utils.PopulateDB;


@RestController
public class KyselyController {
	@Autowired
	private PopulateDB populateDb;
	
	@PostMapping("reset")
	public ResponseEntity<String>  reset() {
		populateDb.populate();
		return ResponseEntity.ok("DB reset done");
	}
}