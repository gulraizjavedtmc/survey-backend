package com.gulraiz.survey.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gulraiz.survey.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, UUID> {

}
