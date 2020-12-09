package com.gulraiz.survey.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gulraiz.exception.ValidationException;
import com.gulraiz.survey.dto.AddSurveyDto;
import com.gulraiz.survey.model.Survey;
import com.gulraiz.survey.repository.SurveyRepository;

@Service
public class SurveyService {

	@Autowired private SurveyRepository surveyRepo;
	

	public void addSurvey(AddSurveyDto dto) {
		
		Survey survey = new Survey();
		survey.setDocumentId(dto.getDocumentId());
		survey.setEmail(dto.getEmail());
		survey.setComments(dto.getComments());
		survey.setPcFavoriteBrand(dto.getPcFavoriteBrand());
		survey.setReplyDateTime(LocalDateTime.now());
		
		surveyRepo.save(survey);
	}
	
	public List<Survey> getAllSurvey(){
		return surveyRepo.findAll();		
	}
	
	public Survey getSurvey(UUID id) {
		return surveyRepo.findById(id)
		.orElseThrow(() -> new ValidationException("Invalid survey ID"));
	}
	
	public void deleteSurvey(UUID id) {
		Survey survey = surveyRepo.findById(id)
				.orElseThrow(() -> new ValidationException("Invalid survey ID"));
		surveyRepo.delete(survey);
	}
	
}
