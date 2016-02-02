package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;
 
@Service
public class MoodService implements MoodServiceInterface {
	
	
	private List<String> moodList;
	private HashMap<String,String> reasonMap;
	private int moodId;
	private Random random;	
 
	@PostConstruct
	public void init() {
		moodList = new LinkedList<String>();
		moodList.add("happy");
		moodList.add("sad");
		moodList.add("angry");
		
		reasonMap= new HashMap<String,String>();
		reasonMap.put("happy","Reason for happy");
		reasonMap.put("sad","Reason for sad");
		reasonMap.put("angry","Reason for angry");
	}
	
	
	
    public Mood getCurrentMood() {
    	random = new Random();
    	moodId = random.nextInt(moodList.size());
        return new Mood(moodList.get(moodId));
    }


	public String getCurrentMoodReason(String mood) {
		// TODO Auto-generated method stub
		return reasonMap.get(mood);
	}
	
	public String getAbout() {
		// TODO Auto-generated method stub
		return "nothing";
	}
}
