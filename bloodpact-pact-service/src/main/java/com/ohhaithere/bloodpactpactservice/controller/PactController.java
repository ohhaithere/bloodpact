package com.ohhaithere.bloodpactpactservice.controller;

import com.ohhaithere.bloodpactpactservice.dto.PactDto;
import com.ohhaithere.bloodpactpactservice.service.PactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/pact")
@RequiredArgsConstructor
public class PactController {

    private final PactService pactService;

    @PostMapping
    public PactDto createPact(@RequestBody PactDto pactDto) {
        return pactService.savePact(pactDto);
    }

    @PutMapping
    public PactDto updatePact(@RequestBody PactDto pactDto) {
        return pactService.updatePact(pactDto);
    }

    @GetMapping("/{id}")
    public PactDto gePact(@PathVariable UUID id) {
        return pactService.getPact(id);
    }


}
