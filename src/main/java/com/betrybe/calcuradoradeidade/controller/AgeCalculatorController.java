package com.betrybe.calcuradoradeidade.controller;

import com.betrybe.calcuradoradeidade.dto.DateDto;
import com.betrybe.calcuradoradeidade.service.AgeCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Age calculator controller.
 */
@RestController
@RequestMapping("/calculateAge")
public class AgeCalculatorController implements AgeCalculatorControllerInterface {
  private AgeCalculatorService service;

  @Autowired
  public AgeCalculatorController(AgeCalculatorService service) {
    this.service = service;
  }

  @GetMapping
  @Override
  public ResponseEntity<DateDto> calculateAge(@RequestParam String date,
      @RequestParam(required = false) String orDefaultAge) {
    int age = service.calculateAge(date);
    return ResponseEntity.ok(new DateDto(age));
  }
}