package dev.zeroone.CadastroDeUsuarios.Tarefas.Model;

import dev.zeroone.CadastroDeUsuarios.Usuarios.Model.UsuarioModel;
import jakarta.persistence.*;

import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "tb_tarefas")
public class TarefaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String dificuldade;

   @OneToMany(mappedBy = "tarefa")
    private List<UsuarioModel> usuarios;


    public UsuarioModel getUsuario() {
        return (UsuarioModel) usuarios;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuarios = Collections.singletonList(usuario);
    }


    public TarefaModel() {
    }

    public TarefaModel(String descricao, String dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
