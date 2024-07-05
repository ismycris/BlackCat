package model.Entity;

import javax.persistence.*;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 9b4857a634fed663df8707b1988046257f763fcd

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nome;
    @Column
    private String senha;
    @Column(name = "user_role")
    private boolean userRole;

<<<<<<< HEAD
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    List<Vendas> vendas;
=======
>>>>>>> 9b4857a634fed663df8707b1988046257f763fcd
    public Usuario() {

    }

    public Usuario(Long id, String nome, String senha, boolean userRole) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.userRole = userRole;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getUserRole() {
        return userRole;
    }

    public void setUserRole(boolean userRole) {
        this.userRole = userRole;
    }
    public boolean isUserRole() {
        return userRole;
    }


}
