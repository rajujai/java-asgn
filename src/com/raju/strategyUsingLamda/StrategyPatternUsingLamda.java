package com.raju.strategyUsingLamda;

import java.util.Arrays;
import java.util.List;

public class StrategyPatternUsingLamda {
	public static void main(String[] args) {
	      
	    System.out.println("Strategy pattern on Steroids");
	    
	    List<Strategy> strategies = 
	      Arrays.asList(
	        () -> {System.out.println("Perform task a day before deadline!");},
	        () -> {System.out.println("Perform task now!");}
	      );
	    
	    strategies.forEach((elem) -> elem.performTask());
	  }
}
