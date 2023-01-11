package com.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.entity.Visit;
import com.sales.service.IVisitService;

@CrossOrigin
@RestController
@RequestMapping("/api/visit")
public class VisitController {

	@Autowired
	private IVisitService visitService;
	
	@PostMapping
	public ResponseEntity<?> addVisitDetails(@RequestBody Visit visit) {
		visitService.addVisitDetails(visit);
		return ResponseEntity.status(HttpStatus.OK).body("Visitor " + visit.getCust_name() + " details saved successfully!!!");
	}
	
	@GetMapping
	public ResponseEntity<?> gettAllVisits() {
		List<Visit> visits = visitService.getAllVisits();
		
		if(visits.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Visit list in empty!!!");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(visits);
		}
	}
	
}
