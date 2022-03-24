public class Person {

    private String name;
    private int age;
    private char gender;

    public String getName(){
        if (gender == 'M'){
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
