package dbo;

/**
 * Description: Class of user entity for store data into database
 * @autor Denys Shabelnyk
 * @since 0.3.1.4
 */
public class User {

    private int id;
    private String name;

    public User(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d,name=%s]",id,name);
    }
}
