package br.adega.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.adega.model.Bebida;

@Repository
public interface BebidaRepository extends CrudRepository<Bebida, Integer> {

}
