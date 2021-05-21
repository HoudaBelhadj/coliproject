package com.Colis.APIcoli;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ColiApiApplicationTests {
	/*  
	@Autowired
	private VoyageRepository voyageRepository;
	
	@Test
	public void testCreateVoyage() {
		Calendar c=Calendar.getInstance();
		c.set(Calendar.YEAR,2021);
		c.set(Calendar.MONTH,02); // le mois commence à 0
		c.set(Calendar.DATE,15);
		 
		Date d1=c.getTime();
		 
		c.set(Calendar.YEAR,2021);
		c.set(Calendar.MONTH,05); // le mois commence à 0
		c.set(Calendar.DATE,30);
		 
		Date d2=c.getTime();
		Voyage voy = new Voyage(d1,d2);
		voyageRepository.save(voy);
		
	}
	@Test
	public void testUpdateVoyage() {
		Calendar c=Calendar.getInstance();
		c.set(Calendar.YEAR,2021);
		c.set(Calendar.MONTH,03); // le mois commence à 0
		c.set(Calendar.DATE,20);
		 
		Date d3=c.getTime();
		
		Voyage voy=voyageRepository.findById(2L).get();
		voy.setDateDepart(d3);
		voyageRepository.save(voy);
		
	}
	@Test
	public void testDeleteVoyage() {
		voyageRepository.deleteById(1L);
		
		
	}
	@Test
	public void testFindVoyage() {
		Voyage voy=voyageRepository.findById(2L).get();
		System.out.println(voy);
		
	}
	@Test
	public void testFindAllVoyages() {
		List<Voyage> voyages = voyageRepository.findAll();
		for (Voyage voy : voyages)
		{System.out.println("sont:");
		System.out.println(voy);}
		
	}
	*/

}
