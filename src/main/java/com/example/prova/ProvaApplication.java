package com.example.prova;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.prova.model.*;
import com.example.prova.service.*;

@SpringBootApplication
public class ProvaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvaApplication.class, args);
    }

    /*@Bean
    CommandLineRunner run(ProjetoService projetoService,
                          TarefaService tarefaService,
                          UsuarioService usuarioService) {
        return args -> {
            // Criando Projeto
            Projeto projeto = new Projeto();
            projeto.setNome("Dr. Ana Souza");
            projeto.setDescricao("Projeto de Desenvolvimento de Software");
            projetoService.salvar(projeto);

            // Criando Usuario
            Usuario usuario = new Usuario();
            usuario.setNome("Dr. Carlos Pereira");
            usuario.setEmail("carlos.pereira@example.com");
           

            // Criando Tarefas
            Tarefa tarefa1 = new Tarefa();
            tarefa1.setTitulo("Desenvolvimento da UI");
            tarefa1.setDescricao("Desenvolver a interface do usuário");
            tarefa1.setStatus("Em andamento");            
            tarefa1.setUsuario(usuario);
            tarefa1.setProjeto(projeto);

            Tarefa tarefa2 = new Tarefa();
            tarefa2.setTitulo("Implementar a lógica de negócios");
            tarefa2.setDescricao("Implementar a lógica de negócios");
            tarefa2.setStatus("Em andamento");
            tarefa2.setUsuario(usuario);
            tarefa2.setProjeto(projeto);

            System.out.println("Dados inseridos com sucesso!");
        };
    } */

}
