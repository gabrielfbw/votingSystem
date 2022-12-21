package br.com.gabriel.votingSystem.service.impl;

import br.com.gabriel.votingSystem.model.ScheduleDto;
import br.com.gabriel.votingSystem.service.ScheduleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Override
    public ResponseEntity<?> createSchedule(ScheduleDto scheduleDto) {

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
