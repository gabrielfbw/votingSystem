package br.com.gabriel.votingSystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleDto implements Serializable {
    private String title;
    private String description;

    public ScheduleDto(String description) {
        this.description = description;
    }


}
