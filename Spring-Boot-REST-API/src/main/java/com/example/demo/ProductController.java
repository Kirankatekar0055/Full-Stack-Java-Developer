package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController 
{
	private static Map<String, Product> productrepos=new HashMap<String,Product>();
	
	static
	{
		Product honey=new Product();
		honey.setId("1");
		honey.setName("Honey");
		productrepos.put(honey.getId(), honey);
		
		Product almond=new Product();
		almond.setId("2");
		almond.setName("Almond");
		productrepos.put(almond.getId(), almond);
		
	}
	
	
	
	@RequestMapping(value="product/{id}",method=RequestMethod.DELETE)
    public ResponseEntity<Object>delete(@PathVariable("id")String id)
    {
		productrepos.remove(id);
		return new ResponseEntity<>("Product Deleted...",HttpStatus.OK);
    	
    }
	
	
	
	@RequestMapping(value="product/{id}",method=RequestMethod.PUT)
    public ResponseEntity<Object>update(@PathVariable("id")String id,@RequestBody Product product)
    {
		productrepos.remove(id);
		product.setId(id);
		productrepos.put(id, product);
		return new ResponseEntity<>("Product Updated...",HttpStatus.OK);
    	
    }
	
	
	
	@RequestMapping(value = "product" ,method=RequestMethod.POST)
	public ResponseEntity<Object>create(@RequestBody Product product)
	{
		productrepos.put(product.getId(), product);
		return new ResponseEntity<>("Product Created...",HttpStatus.CREATED);
	}
	
	
	
	@RequestMapping(value = "product")
	public ResponseEntity<Object> getProduct()
	{
		return new ResponseEntity<>(productrepos.values(),HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value="product/{id}",method=RequestMethod.GET)
    public ResponseEntity<Object>select(@PathVariable("id")String id)
    {
		
		return new ResponseEntity<>(productrepos.get(id),HttpStatus.OK);
    	
    }
	
	
	
	
	
	
	
	
}
