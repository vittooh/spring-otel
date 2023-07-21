package com.digitalbricklayer.springotel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.stereotype.Service;

@Service
public class SaudacaoService {

    private Logger logger = LoggerFactory.getLogger(SaudacaoService.class);

    @NewSpan("LOGAR-ITERACAO")
    public void logaInteracao() {
        logger.info("Saudacao Chamada");
    }
}