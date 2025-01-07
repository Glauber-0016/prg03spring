package br.com.ifba;

import br.com.ifba.curso.view.AddCursoUI;
import br.com.ifba.curso.view.CursoUI;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Prg03springApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
                new SpringApplicationBuilder(Prg03springApplication.class)
                        .headless(false).run(args);

        CursoUI telaCursoSave = context.getBean(CursoUI.class);
        telaCursoSave.setVisible(true);
        
    }

}
