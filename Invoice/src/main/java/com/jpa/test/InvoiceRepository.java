package com.jpa.test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.jpa.test.entities.Invoice;


@Repository
public interface InvoiceRepository extends CrudRepository<Invoice , Integer>{
  
}
