package br.com.gabriel.votingSystem.service;

import br.com.gabriel.votingSystem.model.ScheduleDto;
import org.springframework.http.ResponseEntity;

public interface ScheduleService {

    ResponseEntity<?> createSchedule(ScheduleDto scheduleDto);


}
