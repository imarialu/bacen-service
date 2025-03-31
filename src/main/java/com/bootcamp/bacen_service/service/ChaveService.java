package com.bootcamp.bacen_service.service;

import com.bootcamp.bacen_service.dto.ChaveRequestDTO;
import com.bootcamp.bacen_service.dto.ChaveResponseDTO;
import com.bootcamp.bacen_service.repository.ChaveRepository;
import com.bootcamp.bacen_service.model.Chave;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component // Serve para o Spring entender que essa classe é um componente
@RequiredArgsConstructor
public class ChaveService {

    private final ChaveRepository chaveRepository;

    public ChaveResponseDTO criarChave(final ChaveRequestDTO chaveRequestDTO) { // Irá criar a chave recebendo o ChaveResquestDTO
        Chave chave = Chave.builder()
                .chave(chaveRequestDTO.getChave())
                .ativa(chaveRequestDTO.getAtiva())
                .build();

        chave = chaveRepository.save(chave); // Salva a chave

        return ChaveResponseDTO.builder()
                .chave(chave.getChave())
                .ativa(chave.getAtiva())
                .build();
    }
}
