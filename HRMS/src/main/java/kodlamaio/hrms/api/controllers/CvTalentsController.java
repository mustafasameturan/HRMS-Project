package kodlamaio.hrms.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvTalentService;
import kodlamaio.hrms.entities.concretes.CvTalent;

@RestController
@RequestMapping("/api/cvtalents")
public class CvTalentsController {
	
	private CvTalentService cvTalentService;

	@Autowired
	public CvTalentsController(CvTalentService cvTalentService) {
		super();
		this.cvTalentService = cvTalentService;
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		var result = this.cvTalentService.getAll();
		
		if (!result.isSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/getbyid")
	public ResponseEntity<?> getById(int cvTalentId){
		var result = this.cvTalentService.getById(cvTalentId);
		
		if (!result.isSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		
		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody CvTalent cvTalent){
		var result = this.cvTalentService.add(cvTalent);
		
		if (!result.isSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		
		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(int cvTalentId){
		var result = this.cvTalentService.delete(cvTalentId);

		if (!result.isSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		
		return ResponseEntity.ok(result);
	}
	
}

