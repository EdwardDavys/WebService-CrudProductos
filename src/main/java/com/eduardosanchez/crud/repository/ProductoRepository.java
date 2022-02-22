package com.eduardosanchez.crud.repository;

import com.eduardosanchez.crud.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProductoRepository extends JpaRepository <Producto,Integer>{
    Optional<Producto> finByNombre(String nombre);

    boolean existsByNombre(String nombre);

}