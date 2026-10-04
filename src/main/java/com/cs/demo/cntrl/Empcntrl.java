package com.cs.demo.cntrl;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Empcntrl {
	@GetMapping("")
	String empapi() {
		return "EMPOLOYEE REST API...";
	}
	@GetMapping("/eget")
	String getemp() {
		return "ALL EMPOLOYEE LIST HERE...";
	}
	@PostMapping("/esave")
	String saveemp() {
		return "SAVE EMPOLOYEE HERE...";
	}
 	@PutMapping("eupdate")
	String updateemp() {
 		return "UPDATE EMPOLOYEE HERE...";
	}
	@DeleteMapping("/edelete")
	String deleteemp() {
		return "DELETE EMPOLOYEE HERE...";
	}
}
