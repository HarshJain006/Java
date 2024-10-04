package Assign3day8;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class TwitterCalling {
    public static void main(String[] args) {
        AppTwitter app = new AppTwitter();

        // Sample tweets with hashtags
        Set<String> hashtags1 = new HashSet<>(Set.of("#punerains", "#flood", "#weatherupdate"));
        Set<String> hashtags2 = new HashSet<>(Set.of("#sports", "#cricket", "#t20worldcup"));
        Set<String> hashtags3 = new HashSet<>(Set.of("#tech", "#ai", "#machinelearning"));
        
        // Add tweets to the app
        app.addTweet(new Twitter("Pune Rains", LocalDate.of(2024, 10, 1), 15000, hashtags1));
        app.addTweet(new Twitter("Cricket Match", LocalDate.of(2024, 9, 30), 12000, hashtags2));
        app.addTweet(new Twitter("AI Innovations", LocalDate.of(2024, 10, 2), 5000, hashtags3));
        app.addTweet(new Twitter("Weather Update", LocalDate.of(2024, 10, 3), 17000, hashtags1));
        app.addTweet(new Twitter("Cricket Finale", LocalDate.of(2024, 8, 15), 30000, hashtags2));

        // 1. List all tweets posted in the current month
        System.out.println("Tweets posted in the current month:");
        app.listTweetsinCurrntMonth();

        // 2. List all tweets for a hashtag
        System.out.println("\nTweets with hashtag #cricket:");
        app.listtweetbyhashtag("#cricket");

        // 3. Count the number of tweets by subject
        System.out.println("\nTweet count by subject:");
        app.countTweetbySubject();

        // 4. List the tweets that got more than 10k views
        System.out.println("\nTweets with more than 10k views:");
        app.listTweetsbyViews();

        // 5. Print the top 5 trending tweets
        System.out.println("\nTop 5 trending tweets:");
        app.top5Tweets();
    }
}
