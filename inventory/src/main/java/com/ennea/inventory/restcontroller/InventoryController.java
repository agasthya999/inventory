package com.ennea.inventory.restcontroller;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ennea.inventory.dto.Productdto;
import com.ennea.inventory.model.Product;
import com.ennea.inventory.repository.ProductRepository;
import com.ennea.inventory.service.ImportData;

import java.util.List;
@RestController
public class InventoryController {
  @Autowired
	private ImportData importdata;
   @Autowired
   private ProductRepository productRepository;
   @GetMapping("/readexceldata")
	public void readExcelData() {
		productRepository.saveAll(this.importdata.excelimport());
		System.out.println("bhai jaaaaaaaaaaaaaaaan");
	}
    
   @GetMapping("/getproduct")
     public List<Productdto> getproducts(@RequestParam String sup,@RequestParam (required = false) String productname){
	   List<Product> productlist=productRepository.findBysupllier(sup);
	   List<Productdto> productdtolist=new ArrayList<>();
	   Iterator<Product> itr=productlist.iterator();
	   
	   while(itr.hasNext()) {
		   Product product=itr.next();
		   long id=product.getId();
		   String productName=product.getProductName();
		    String code=product.getCode();
		    int stock=product.getStock();
		    String supllier=product.getSupllier();
		    if(productname==null ||productname.contentEquals(productname))
		    {
		   productdtolist.add(new Productdto( id, productName, 
				  code, stock,
				   supllier));
		    }
		   
	   }
	   
	   return productdtolist;
     }
   
}
