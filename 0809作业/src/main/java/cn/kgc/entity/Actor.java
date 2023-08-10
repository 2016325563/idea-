package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor {
    private Integer actorId;
    private String actorName;
    private String stageName;
    private String representativeWorks;
    private Integer age;
    private String gender;

    // Getter and setter methods for each field
    // ...
}