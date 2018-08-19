package com.idc.homedoctor.web.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.idc.homedoctor.model.Accounth;
import com.idc.homedoctor.service.AccountServiceImpl;

@RestController
public class HomeController 
{
	@Autowired
	AccountServiceImpl accountServiceImpl;
	
	@GetMapping("/all")
	public List<Accounth> findAll()
	{
		return accountServiceImpl.findall();
		
	}
	@DeleteMapping("/delete-{id}")
	public void delete(@PathVariable int id)
	{
		accountServiceImpl.delete(id);
	}

}
