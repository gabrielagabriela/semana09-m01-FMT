package com.semana09.modulo01.semana09m01.repository;

import com.semana09.modulo01.semana09m01.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

    @Modifying
    @Query("UPDATE Livro l SET l.titulo = :titulo, l.autor = :autor WHERE l.id = :id")
    int updateLivroById(Integer id, String titulo, String autor);


}
