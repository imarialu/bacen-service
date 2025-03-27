package com.bootcamp.bacen_service.service;

import com.bootcamp.bacen_service.dto.ChaveRequestDTO;
import com.bootcamp.bacen_service.dto.ChaveResponseDTO;
import com.bootcamp.bacen_service.model.Chave;
import org.springframework.stereotype.Component;

@Component // Serve para o Spring entender que essa classe é um componente
public class ChaveService {

    public ChaveResponseDTO criarChave(final ChaveRequestDTO chaveRequestDTO){
        Chave chave = Chave.builder()
                .chave(chaveRequestDTO.getChave())
                .ativa(ChaveRequestDTO.getAtiva())
                .build();

    }
}
