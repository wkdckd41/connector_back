package com.connector.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ProfileIdDto {
    private UserDto user;
    private String company;
    private String location;
    private String bio;
    private List<String> skills;
    private List<ExperienceDto> experiences;
    private List<EducationDto> educations;
}