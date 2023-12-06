package com.betrybe.calcuradoradeidade.service;

import com.betrybe.calcuradoradeidade.exception.FutureDateException;
import java.time.LocalDate;
import java.time.Period;
import org.springframework.stereotype.Service;

/**
 * Aqui nessa classe devem ser implementados os métodos para atender aos requisitos do exercício,
 * sinta-se à vontade para criar métodos privados para te auxiliar nas validações.
 */
@Service
public class AgeCalculatorService {

  /**
   * Calculate age int.
   *
   * @param date the date
   * @return the int
   */
  public int calculateAge(String date) {
    LocalDate localDate = LocalDate.parse(date);
    LocalDate now = LocalDate.now();
    int age = Period.between(localDate, now).getYears();
    if (age < 0) {
      throw  new FutureDateException("This is a future date.");
    }
    return age;
  }

  public int calculateAgeWithDefault(String date, int defaultAge) {
    // TODO method implementation
    return -1;
  }
}
