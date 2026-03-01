package dev.zeroone.CadastroDeUsuarios.Tarefas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TarefaController {

    @GetMapping("/tarefa")
    public String contruind() {
        return "Esta em construção";
    }
}
