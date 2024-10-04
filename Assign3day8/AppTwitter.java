package Assign3day8;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppTwitter {
	private List<Twitter> tweetList;

    public AppTwitter() {
        tweetList = new ArrayList<Twitter>();
        
        
     }
    //Listing  in current Month
    public void listTweetsinCurrntMonth() {
    	YearMonth currentMonth = YearMonth.now();
    	
    	tweetList.stream().filter(tweet -> YearMonth.from(tweet.getDateOfPost()).equals(currentMonth)).forEach(System.out::println);
    }
    
    public void listtweetbyhashtag(String hashtag) {
    	tweetList.stream().filter(tweet -> tweet.getHashtags().contains(hashtag)).forEach(System.out::println);
    }
    
    public void countTweetbySubject() {
    	Map<String, Long> tweetcountsubj = tweetList.stream().collect(Collectors.groupingBy(Twitter::getSubject, Collectors.counting()));
    	tweetcountsubj.forEach((subject, cnt) ->
    	System.out.println("Subject : " +subject+ "Count: " +cnt));
    	
    }
    
    public void listTweetsbyViews() {
    	tweetList.stream().filter(tweet -> tweet.getViews() >= 10000).forEach(System.out::println);
    }
    public void top5Tweets() {
    	tweetList.stream().sorted(Comparator.comparingInt(Twitter::getViews).reversed()).limit(5).forEach(System.out::println);
    	
    }
    
    
    
    
    public void addTweet(Twitter tweet) {
    	tweetList.add(tweet);
    	
    }

}
