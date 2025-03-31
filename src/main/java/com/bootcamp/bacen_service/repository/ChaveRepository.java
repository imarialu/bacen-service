package com.bootcamp.bacen_service.repository;

import com.bootcamp.bacen_service.model.Chave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ChaveRepository extends JpaRepository<Chave, UUID> {

    // Os métodos estão sendo escritos pelo Jpa
    boolean existsByChave(final String chave); // Vai verificar se existe chave

    Optional<Chave> findByChave(final String chavePesquisada); //
}
