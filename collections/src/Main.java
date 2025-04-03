/*choosing the Right Collection

You are developing a social media application where:

    A user's posts should be stored in the order they were added and should allow duplicates.

    A list of unique followers should be stored in an efficient way.

    The top trending posts should be sorted based on likes.

Which Java collection(s) would you use for each requirement? Implement the classes and justify your choices.*/

import java.util.*;

class SocialMediaApp {
    private LinkedList<String> userPosts;
    private HashSet<String> followers;
    private TreeSet<Post> trendingPosts;

    public SocialMediaApp() {
        userPosts = new LinkedList<>();
        followers = new HashSet<>();
        trendingPosts = new TreeSet<>(Comparator.comparingInt(Post::getLikes).reversed());
    }

    public void addPost(String postContent) {
        userPosts.add(postContent);
    }

    public void addFollower(String username) {
        followers.add(username);
    }

    public void addTrendingPost(String content, int likes) {
        trendingPosts.add(new Post(content, likes));
    }

    public void displayTrendingPosts() {
        System.out.println("Top Trending Posts:");
        int count = 0;
        for (Post post : trendingPosts) {
            if (count >= 5) break;
            System.out.println(post);
            count++;
        }
    }

    public void displayUserPosts() {
        System.out.println("User Posts:");
        for (String post : userPosts) {
            System.out.println(post);
        }
    }

    public void displayFollowers() {
        System.out.println("Followers: " + followers);
    }
}

class Post implements Comparable<Post> {
    private String content;
    private int likes;

    public Post(String content, int likes) {
        this.content = content;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public int compareTo(Post other) {
        return Integer.compare(other.likes, this.likes);
    }

    @Override
    public String toString() {
        return content + " (Likes: " + likes + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        SocialMediaApp app = new SocialMediaApp();

        app.addPost("Hello World!");
        app.addPost("I won a Hackathon");
        app.addPost("I went for a tour!");

        app.addFollower("xyz");
        app.addFollower("abc");
        app.addFollower("lmn");
        app.addFollower("abc");

        app.addTrendingPost("Breaking News!", 120);
        app.addTrendingPost("Tomorrow is holiday!", 300);
        app.addTrendingPost("Sale sale sale!", 250);
        app.addTrendingPost("Gone for a vacation!", 400);
        app.addTrendingPost("i brought a new car!", 180);

        app.displayUserPosts();
        app.displayFollowers();
        app.displayTrendingPosts();
    }
}
