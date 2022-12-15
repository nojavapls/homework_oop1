public class Human {

    private int birthDate;
    private String name;
    private String city;
    private String jobTitle;


    public Human(int birthDate, String name, String city, String jobTitle) {
        if (birthDate < 0)
            this.birthDate = 0;
        else
            this.birthDate = birthDate;
        if (name == null || name.length() == 0 )
            this.name = "Информация не указана";
        else
            this.name = name;
        if (city == null || city.length() == 0)
            this.city = "Информация не указана";
        else
            this.city = city;
        if (jobTitle == null || jobTitle.length() == 0)
            this.jobTitle = "Информация не указана";
        else
            this.jobTitle = jobTitle;
    }

    public String getName() {
        return this.name;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public int getbirthDate() {
        return this.birthDate;
    }

    public String getCity() {
        return this.city;
    }


    public void setName(String name) {
//        if (name)
            this.name = name;
//        else
//            throw new IllegalArgumentException("Incorrect name");
    }

    public void setCity(String city) {
//        if (city)
            this.city = city;
//        else
//            throw new IllegalArgumentException("Incorrect city");
    }

    public void setBirthDate(int birthDate) {
//        if (birthDate && birthDate > 0)
            this.birthDate = birthDate;
//        else
//            throw new IllegalArgumentException("Incorrect name");
    }

    public String toString() {
        return "Привет! Меня зовут " + this.name + ". Я из города " + this.city + ". Я родился в " + this.birthDate + " году. Я работаю на должности " + this.jobTitle+ ". Будем знакомы!";
    }
}
