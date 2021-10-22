package br.com.forum.forum.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.forum.forum.model.Curso;
import br.com.forum.forum.model.Topico;

@Controller
public class HelloController {
    
    @GetMapping(value="/")
    public String getMethodName() {
        return "A Hello Word !";
    }

    @RequestMapping("/Topicos")
    public List<Topico> lista(){
        Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programação"));

        return Arrays.asList(topico, topico, topico);
    }
}
    