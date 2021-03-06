package com.example.springlogin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Set;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @Column(name = "user_name")
    @Length(min = 5, message = "*Username deve ter pelo menos 5 caracteres")
    @NotEmpty(message = "*Por favor, preencha o campo username")
    private String userName;

    @Column(name = "email")
    @Email(message = "*Por favor, user um email valido")
    @NotEmpty(message = "*Por favor, preencha o campo email")
    private String email;

    @Column(name = "password")
    @Length(min = 5, message = "*Senha deve ter pelo menos 5 caracteres")
    @NotEmpty(message = "*Por favor, preencha o campo senha")
    private String password;

    @Column(name = "name")
    @NotEmpty(message = "*Por favor, preencha o campo nome")
    private String name;

    @Column(name = "last_name")
    @NotEmpty(message = "*Por favor, preencha o campo utimo nome")
    private String lastName;

    @Column(name = "active")
    private Boolean active;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

}
