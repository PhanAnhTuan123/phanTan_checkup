package vn.com.leaseLink.entity;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Treatment implements Serializable {
    private Doctor doctor;
    private Patient patient;
    private LocalDate startDate;
    private LocalDate endDate;
    private String diagnosis;
}
