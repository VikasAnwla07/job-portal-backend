package com.jobportal.Job.Portal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    private String title;
    private String comapny;
    private String location;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Boolean working;
    private String description;
}
