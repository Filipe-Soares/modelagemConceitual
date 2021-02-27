package com.modelagemConceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelagemConceitual.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
