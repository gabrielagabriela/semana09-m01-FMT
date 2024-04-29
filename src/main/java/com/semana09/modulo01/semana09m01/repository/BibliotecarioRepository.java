package com.semana09.modulo01.semana09m01.repository;

import com.semana09.modulo01.semana09m01.model.Bibliotecario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Integer> {

    @Modifying
    @Query("UPDATE Bibliotecario l SET l.nome = :nome, l.email = :email, l.senha = :senha  WHERE l.id = :id")
    int updateBibliotecarioById(Integer id, String nome, String email, String senha);

}
