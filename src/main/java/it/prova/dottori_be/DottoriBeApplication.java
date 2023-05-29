package it.prova.dottori_be;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.dottori_be.model.Dottore;
import it.prova.dottori_be.repository.DottoreRepository;

@SpringBootApplication
public class DottoriBeApplication implements CommandLineRunner{

	@Autowired
	DottoreRepository repository;
	
	public static void main(String[] args)  {
		SpringApplication.run(DottoriBeApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
		repository.save(Dottore.builder().nome("Mattia").cognome("Zaccagnata").codiceDottore("MZ20").codFiscalePazienteAttualmenteInVisita("BNCSF").inServizio(true).inVisita(true).build());
repository.save(Dottore.builder().nome("Ciro").cognome("Ignobile").codiceDottore("CI17").codFiscalePazienteAttualmenteInVisita("CMNGL").inServizio(true).inVisita(false).build());
		repository.save(Dottore.builder().nome("Giuseppe").cognome("Biava").codiceDottore("GB20").codFiscalePazienteAttualmenteInVisita("DHHSH").inServizio(false).inVisita(false).build());
		
	}
}
