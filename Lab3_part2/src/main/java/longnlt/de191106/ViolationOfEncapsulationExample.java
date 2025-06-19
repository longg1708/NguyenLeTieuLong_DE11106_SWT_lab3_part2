package longnlt.de191106;

import java.util.logging.Logger;

class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void display() {
        Logger logger = Logger.getLogger(User.class.getName());
        logger.info("Name: " + name + ", Age: " + age);
    }
}
