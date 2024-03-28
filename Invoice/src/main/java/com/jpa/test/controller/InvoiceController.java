package com.jpa.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jpa.test.entities.Invoice;
import com.jpa.test.services.InvoiceService;

@RestController
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceService;
	
	@GetMapping("/invoice")
	public ResponseEntity<List<Invoice>> getInvoice() {
		return this.invoiceService.getAllInvoice();
	}
	
	@GetMapping("/invoice/{id}")
	public ResponseEntity<Optional<Invoice>> getInvoice(@PathVariable int id) {
		 return invoiceService.getInvoiceById(id);
		 }
	
	@PostMapping("/invoice")
	public ResponseEntity<Object>addInvoice(@RequestBody Invoice invoice) {
		return this.invoiceService.addInvoice(invoice);
	}
	
	
	@PutMapping("/invoice/{id}")
    public ResponseEntity<Invoice> updateInvoice(@RequestBody Invoice invoice, @PathVariable int id) {
        return invoiceService.updateInvoice(id, invoice);
    }
	
	@DeleteMapping("/invoice/{id}")
	 public ResponseEntity<Integer> deleteInvoice(@PathVariable int id) {
		 return invoiceService.deleteById(id);
		 }
	}



