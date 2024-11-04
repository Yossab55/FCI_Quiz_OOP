package Quiz;

public class Actor {
  private String name;
  private String gender;
  public Actor() {
    name = "";
    gender = "";
  }
  public Actor(String name, String gender) {
    setName(name);
    setGender(gender);
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public String getName() {
    return name;
  }
  public String getGender() {
    return gender;
  }
}
