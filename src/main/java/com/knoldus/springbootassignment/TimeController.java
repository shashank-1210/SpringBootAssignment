package com.knoldus.springbootassignment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TimeController {
  /**
   * This method will give the current time on calling /status API>
   * @return Current Time
   */

  @GetMapping("/status")
  public String getCurrentTime() {
	Calendar cal = Calendar.getInstance();
	Date date = cal.getTime();
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	String formattedDate = dateFormat.format(date);
	return "Running,{" + formattedDate + "}";

  }

}
