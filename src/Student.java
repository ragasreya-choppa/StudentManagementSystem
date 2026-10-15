public class Student
{
    private int ID;
    private String name;
    private String course;
    private int age;

    public Student(int ID, String name, String course, int age)
    {
        this.ID = ID;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public int getStudentID()
    {
        return ID;
    }

    public String getName()
    {
        return name;
    }

    public String getCourse()
    {
        return course;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setCourse(String course)
    {
        this.course = course;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

}

