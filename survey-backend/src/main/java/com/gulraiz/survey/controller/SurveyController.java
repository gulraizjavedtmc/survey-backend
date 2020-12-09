package com.gulraiz.survey.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gulraiz.common.ApiResponse;
import com.gulraiz.survey.dto.AddSurveyDto;
import com.gulraiz.survey.model.Survey;
import com.gulraiz.survey.service.SurveyService;

@RestController
@RequestMapping("/survey")
public class SurveyController {

	@Autowired private SurveyService surveyService;

	@GetMapping("/")
	public ResponseEntity<List<Survey>> getAllSurvey() {
		List<Survey> dtos = surveyService.getAllSurvey();
		return new ResponseEntity<List<Survey>>(dtos, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Survey> getSurvey(@PathVariable UUID id) {
		Survey survey = surveyService.getSurvey(id);
		return new ResponseEntity<Survey>(survey, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<ApiResponse> addSurvey(@RequestBody @Valid AddSurveyDto dto) {
		surveyService.addSurvey(dto);
		return new ResponseEntity<>(new ApiResponse(true, "Survey has been submitted."), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ApiResponse> deleteSurvey(@PathVariable UUID id){
		surveyService.deleteSurvey(id);
		return new ResponseEntity<>(new ApiResponse(true, "Survey has been deleted."), HttpStatus.OK);
		
	}
	
}
