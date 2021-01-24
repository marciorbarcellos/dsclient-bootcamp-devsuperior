package com.devsuperior.dsclient.resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria", "063.642.554-63", 7500.00, null, 2));
		list.add(new Client(2L, "Leo", "012.617.852-35", 8200.00, null, 1));
		return ResponseEntity.ok().body(list);
	}
}
