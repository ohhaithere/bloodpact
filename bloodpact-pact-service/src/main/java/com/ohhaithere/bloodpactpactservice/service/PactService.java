package com.ohhaithere.bloodpactpactservice.service;

import com.ohhaithere.bloodpactpactservice.dto.PactDto;
import com.ohhaithere.bloodpactpactservice.mapper.PactMapper;
import com.ohhaithere.bloodpactpactservice.model.Pact;
import com.ohhaithere.bloodpactpactservice.repository.PactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PactService {

    private final PactRepository pactRepository;
    private final PactMapper pactMapper;

    public PactDto savePact(PactDto pactDto) {
        Pact pact = pactMapper.mapDtoToPact(pactDto);
        pact.setId(UUID.randomUUID());
        return pactMapper.mapPactToDto(pactRepository.save(pact));
    }

    public PactDto updatePact(PactDto pactDto) {
        Pact pact = pactMapper.mapDtoToPact(pactDto);
        return pactMapper.mapPactToDto(pactRepository.save(pact));
    }

    public PactDto getPact(UUID id) {
        return pactMapper.mapPactToDto(pactRepository.getOne(id));
    }

}
