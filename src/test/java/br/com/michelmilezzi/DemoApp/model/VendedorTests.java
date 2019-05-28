package br.com.michelmilezzi.DemoApp.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.michelmilezzi.DemoApp.domain.Vendedor;
import br.com.michelmilezzi.DemoApp.service.VendedorServiceTests;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VendedorTests {
	
	@Autowired
	VendedorServiceTests vendedorService;
	
	@Test
	public void verificaSalario(Vendedor vendedor) {
		vendedor.setNome("Edvaldo");
		vendedor.setSalario(1200.0);
		
		vendedorService.verificaSalario(vendedor);
	}
	
}
