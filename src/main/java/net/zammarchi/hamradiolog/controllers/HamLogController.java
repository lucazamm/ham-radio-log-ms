package net.zammarchi.hamradiolog.controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.zammarchi.hamradiolog.api.Response;
import net.zammarchi.hamradiolog.db.repository.*;



@RestController
@RequestMapping("/hamlog")
@CrossOrigin
public class HamLogController {

    private static final Logger logger = LogManager.getLogger(HamLogController.class);


    @Autowired HamLogRepository repository;

    @GetMapping
    //@RequestMapping("/")
    public ResponseEntity<Response> test(){
        logger.debug("test -- start");
        
        return new ResponseEntity<Response>(new Response(Response.KO, Response.KO_MESSAGE),HttpStatus.OK);
    }



}
