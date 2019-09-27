public class Person
{
  private Name name;
  private MyDate birthday;
  private char gender;


  public Person(Name name, MyDate birthday, char gender)
  {
    this.name = name;
    this.birthday = birthday;
    this.gender = gender;
  }

  public Person(Name name, char gender)
  {
    this.name = name;
    this.gender = gender;
    this.birthday= new MyDate();
  }

  public Person(char gender)
  {
    this.gender = gender;
    this.birthday= new MyDate();
  }

  public Name getName()
  {
    return name;
  }

  public int getAge(){
    MyDate now = new MyDate();
    return this.birthday.yearsBetween(now);
  }

  public MyDate getBirthday()
  {
    return new MyDate(birthday.getDay(),birthday.getMonth(),birthday.getYear());
  }

  public char getGender()
  {
    return gender;
  }

  public void setName(Name name)
  {
    this.name = name;
  }

//  public void setBirthday(MyDate birthday)
//  {
//    this.birthday = birthday;
//  }

  public void setGender(char gender)
  {
    this.gender = gender;
  }

  @Override public String toString()
  {
    return "Person{" + "name='" + name + '\'' + ", gae=" + birthday + ", gender="
        + gender + '}';
  }

  public String getAgeStatus()
  {
    if (this.getAge() < 0)
    {
      return "Error";
    }
    else if (this.getAge() >= 0 && this.getAge() <= 12)
    {
      return "Child";
    }
    else if (this.getAge() > 12 && this.getAge() <= 19)
    {
      return "Teenager";
    }
    else if (this.getAge() > 19 && this.getAge() <= 65)
    {
      return "Adult";
    }
    else
    {
      return "Senior citizen";
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return getGender() == person.getGender() &&
            getName().equals(person.getName()) &&
            getBirthday().equals(person.getBirthday());
  }
}
