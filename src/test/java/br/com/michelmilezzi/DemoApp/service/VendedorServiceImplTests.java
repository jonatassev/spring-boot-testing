package br.com.michelmilezzi.DemoApp.service;

import br.com.michelmilezzi.DemoApp.domain.Venda;
import br.com.michelmilezzi.DemoApp.domain.Vendedor;

public class VendedorServiceImplTests implements VendedorServiceTests{

	@Override
	public Venda verificaSalario(Vendedor vendedor) {

		if (vendedor.getVenda().getPreço() >= 5000.0 && vendedor.getVenda().getPreço() <= 10000.0) {
			vendedor.setComissao(vendedor.getSalario()*0.02);
		} else if (vendedor.getVenda().getPreço() >= 10000.0 && vendedor.getVenda().getPreço() <= 20000.0) {
			vendedor.setComissao(vendedor.getSalario()*0.025);
		} else if (vendedor.getVenda().getPreço() >= 20000.0 && vendedor.getVenda().getPreço() <= 30000.0) {
			vendedor.setComissao(vendedor.getSalario()*0.03);
		} else if (vendedor.getVenda().getPreço() >= 30000.0) {
			vendedor.setComissao(vendedor.getSalario()*0.05 + 1000.0);
		}
		return vendedor.getVenda();

	}

}
