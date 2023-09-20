package alex.oscure.springboot.learnspringboot2;

public class Course {
    private long id;
    private String name;
    private String nickname;

    public Course(long id, String name, String nickname) {
        super();
        this.id = id;
        this.name = name;
        this.nickname = nickname;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
