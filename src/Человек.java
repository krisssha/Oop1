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
}
