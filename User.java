
public class User {
  
  private int year;
  private String first;
  private String last;
  private int id;
  private int age;
  
  @Override
  public String toString() {
    return "User [year=" + year + ", first=" + first + ", last=" + last + ", id=" + id + ", age=" + age + "]";
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getId() {
    return id;
  }

  public User(int year, String first, String last, int id, int age) {
    super();
    this.year = year;
    this.first = first;
    this.last = last;
    this.id = id;
    this.age = age;
  }
  

}
