package br.com.forum.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.forum.forum.model.Curso;
import br.com.forum.forum.model.Topico;

@RestController
@ResponseBody
public class HelloController {

    @RequestMapping("/Topicos")
    public List<Topico> lista(){
        Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));

        return Arrays.asList(topico, topico, topico);
    }
}
    