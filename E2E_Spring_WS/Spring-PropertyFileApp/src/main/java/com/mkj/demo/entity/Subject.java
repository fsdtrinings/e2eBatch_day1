package com.mkj.demo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component  // it is the replacement of whole <bean> tag in the xml file
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {

	@Value("${subject.name}")
	private String subjectName;
	@Value("${subject.weight}")
	private int weightage;
	@Value("${trainer.name}")
	private String instructorName;
}
