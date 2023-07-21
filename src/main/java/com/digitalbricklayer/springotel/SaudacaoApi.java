package com.digitalbricklayer.springotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/v1/saudacao")
public class SaudacaoApi {

    private final SaudacaoService saudacaoService;

    public SaudacaoApi(@Autowired SaudacaoService saudacaoService) {
        this.saudacaoService = saudacaoService;
    }

    @GetMapping
    public String dizOi(){
        saudacaoService.logaInteracao();
        return "Ola, a hora atual é " + LocalDateTime.now();
    }
}