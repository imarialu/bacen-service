package com.bootcamp.bacen_service.model;

import jakarta.persistence.*;
import java.util.UUID;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Chave {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // Gera o Id
    private UUID id;
    @Column
    private String chave;
    @Column
    private Boolean ativa;

}
