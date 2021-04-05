package com.knoldus.springbootassignment;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ControllerTest {

  @Test
  public void getCurrentTime() {

	TimeController obj = new TimeController();
	Calendar cal = Calendar.getInstance();
	Date date = cal.getTime();
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	String result = "Running,{" + dateFormat.format(date) + '}';

	Assert.assertEquals(result, obj.getCurrentTime());

  }
}