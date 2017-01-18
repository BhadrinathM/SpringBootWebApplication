package com.demo.main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootWebApplication implements CommandLineRunner {

    @Autowired
    DeveloperRepository developerRepository;

    @Autowired
    SkillRepository skillRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
			Skill javascript = new Skill("javascript", "Javascript language skill");
			Skill ruby = new Skill("ruby", "Ruby language skill");
			Skill emberjs = new Skill("emberjs", "Emberjs framework");
			Skill angularjs = new Skill("angularjs", "Angularjs framework");

			skillRepository.save(javascript);
			skillRepository.save(ruby);
			skillRepository.save(emberjs);
			skillRepository.save(angularjs);

			List<Developer> developers = new LinkedList<Developer>();
			developers.add(new Developer("Raj", "Kumar", "Raj.Kumar@example.com", 
					Arrays.asList(new Skill[] { javascript, ruby })));
			developers.add(new Developer("Sam", "Yadav", "Sam.Yadav@example.com", 
					Arrays.asList(new Skill[] { emberjs, ruby })));
			developers.add(new Developer("Roshan", "Lal", "Roshan.Lal@example.com", 
					Arrays.asList(new Skill[] { angularjs, ruby })));
			developers.add(new Developer("Rajesh", "Gajodhar", "G.Rajesh@example.com", 
					Arrays.asList(new Skill[] { emberjs, angularjs, javascript })));
			developers.add(new Developer("Thiness", "Kumar", "Thiness@example.com", 
					Arrays.asList(new Skill[] { emberjs })));
			developerRepository.save(developers);
	}

}
