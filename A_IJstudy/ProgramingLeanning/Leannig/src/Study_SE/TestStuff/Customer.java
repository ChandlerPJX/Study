package Study_SE.TestStuff;

public class Customer {
    private int id;
    private int score;
    private String name;

    public Customer() {

    }

    public Customer(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
