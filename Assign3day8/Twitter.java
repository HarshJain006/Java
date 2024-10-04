package Assign3day8;
import java.time.LocalDate;
import java.util.Set;


public class Twitter {
	private String subject;
	private LocalDate dateOfPost;
	private int views;
	private Set<String> hashtags;
	public Twitter(String subject, LocalDate dateOfPost, int views, Set<String> hashtags) {
		super();
		this.subject = subject;
		this.dateOfPost = dateOfPost;
		this.views = views;
		this.hashtags = hashtags;
	}
	public String getSubject() {
		return subject;
	}

	public LocalDate getDateOfPost() {
		return dateOfPost;
	}
	
	public int getViews() {
		return views;
	}
	
	public Set<String> getHashtags() {
		return hashtags;
	}
	@Override
	public String toString() {
		return "Twitter [subject=" + subject + ", dateOfPost=" + dateOfPost + ", views=" + views + ", hashtags="
				+ hashtags + "]";
	}
	
	
	
	

}
