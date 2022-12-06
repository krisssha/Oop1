public class Человек {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public String getTown() {
        return this.town;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Привет! Меня зовут " + getName() + "! Я из города " + getTown() + "! Я родился в " +
                getYearOfBirth() + " году." + " Я работаю на должности " + getJobTitle() + ". Будем знакомы!";
    }

    public Человек(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null || name.equals("")) {
            name = "Информация не указана";
        }
        this.name = name;

        if (town == null || town.equals("")) {
            town = "Информация не указана";
        }
        this.town = town;

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (jobTitle == null || jobTitle.equals("")) {
            jobTitle = "Информация не указана"; }
            this.jobTitle = jobTitle;

    }
}