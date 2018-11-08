import java.util.Objects;

public class Person {


    String firstname;
    String lastname;

    Person(String firstname, String lastname)
    {
        this.firstname=firstname;
        this.lastname=lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    @Override
    public String toString(){
        return "firstname: "+getFirstname()+
                "\n lastname: "+ getLastname() + " \n";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstname, person.firstname) &&
                Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }



}
