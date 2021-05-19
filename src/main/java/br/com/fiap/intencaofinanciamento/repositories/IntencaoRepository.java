package br.com.fiap.intencaofinanciamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.intencaofinanciamento.entities.Intencao;

@Repository
public interface IntencaoRepository extends JpaRepository<Intencao, Long>{

}
