package br.com.gabriel.votingSystem.controller;


import br.com.gabriel.votingSystem.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;


@RestController
@RequestMapping("/api/v1/schedules")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping
    public ResponseEntity<?> save() throws UnknownHostException {

        return new ResponseEntity<>(InetAddress.getLocalHost(), HttpStatus.ACCEPTED);
    }


}