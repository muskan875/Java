package com.jpa.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.jpa.test.InvoiceRepository;
import com.jpa.test.entities.Invoice;

@Service
public class InvoiceService {
	
	@Autowired
	public InvoiceRepository invoiceRepository;
	
	public ResponseEntity<List<Invoice>> getAllInvoice() {
		List<Invoice> list = (List<Invoice>) invoiceRepository.findAll();
		if (list.size() <= 0) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    }

	    return ResponseEntity.ok(list);	
	}
	
	
	
	 public ResponseEntity<Optional<Invoice>> getInvoiceById(int id) {
	    	
			Optional<Invoice> invoice = invoiceRepository.findById(id);
	    	if(invoice==null) {
	    	 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    	}
			return ResponseEntity.ok(invoice);
	    	
	    }
  
	 
	 
	 public ResponseEntity<Object> addInvoice(Invoice add) {
		
		    int total = add.getPrice() * add.getQuantity() + add.getShipping() + add.getPackaging();
		    int tax = (total * add.getTaxPercentage()) / 100;
		    int afterTax = total + tax;
		    
		    add.setTotal(total);
		    add.setTax(tax);
		    add.setAfterTax(afterTax);
		    
		    if(add.getName().isEmpty() || add.getProduct().isEmpty() ||  add.getMobno() > 9999999999L ||
		            add.getPackaging() == 0 || add.getPrice() == 0 || add.getQuantity() == 0 || add.getShipping() == 0
		           ) {
		        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		    }
		    
		    if( add.getTaxPercentage() == 0 || add.getTaxPercentage() > 25 || add.getTaxPercentage() > -100) {
		    	return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Tax percentage should not be 0 , negative value or more than 25 percentage");
	    }
		    
	        Invoice savedInvoice = invoiceRepository.save(add);
	        return ResponseEntity.status(HttpStatus.CREATED).body(savedInvoice);
	}
	
	 
	 
	
	
	
	 public ResponseEntity<Invoice> updateInvoice(int id, Invoice invoiceDetails) {
	       Invoice updateInvoice = invoiceRepository.findById(id).orElse(null);
	       
	       if (updateInvoice == null) {
	           return ResponseEntity.notFound().build();
	       }
	       int total = invoiceDetails.getPrice() * invoiceDetails.getQuantity() + invoiceDetails.getShipping() + invoiceDetails.getPackaging();
		    int tax = (total * invoiceDetails.getTaxPercentage()) / 100;
		    int afterTax = total + tax;
		    
		    invoiceDetails.setTotal(total);
		    invoiceDetails.setTax(tax);
		    invoiceDetails.setAfterTax(afterTax);
		    
	       updateInvoice.setId(invoiceDetails.getId());
	       updateInvoice.setName(invoiceDetails.getName());
	       updateInvoice.setProduct(invoiceDetails.getProduct());
	       updateInvoice.setMobno(invoiceDetails.getMobno());
	       updateInvoice.setPrice(invoiceDetails.getPrice());
	       updateInvoice.setQuantity(invoiceDetails.getQuantity());
	       updateInvoice.setTaxPercentage(invoiceDetails.getTaxPercentage());	      
	       updateInvoice.setPackaging(invoiceDetails.getPackaging());
	       updateInvoice.setShipping(invoiceDetails.getShipping());
	       updateInvoice.setTotal(invoiceDetails.getTotal());
	       updateInvoice.setTax(invoiceDetails.getTax());
	       updateInvoice.setAfterTax(invoiceDetails.getAfterTax()); 
	       
	       invoiceRepository.save(updateInvoice);
	       
	       return ResponseEntity.ok(updateInvoice);
	   }
	 
	 
	 public ResponseEntity<Integer> deleteById( int id) {
		    Optional<Invoice> optionalInvoice = invoiceRepository.findById(id);
		    if (optionalInvoice.isEmpty()) {
		        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		    }
		    invoiceRepository.deleteById(id);
		    return ResponseEntity.status(HttpStatus.OK).build();
		}

}
