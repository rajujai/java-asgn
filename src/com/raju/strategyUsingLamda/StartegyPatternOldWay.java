package com.raju.strategyUsingLamda;

import java.util.Arrays;
import java.util.List;

public class StartegyPatternOldWay {
	public static void main(String[] args) {

	    List<Strategy> strategies = 
	        Arrays.asList(
	          new LazyStrategy(), 
	          new FastStrategy()
	        );
	                      
	    for(Strategy stg : strategies){
	      stg.performTask();
	    }
	  }
}
