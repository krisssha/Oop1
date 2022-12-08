public class Human {
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
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

        public void setTown (String town){
            if (town == null || town.isEmpty() || town.isBlank()) {
                town = "Информация не указана";
            }
            this.town = town;
        }

        public void setJobTitle (String jobTitle){
            this.jobTitle = jobTitle;
        }

        public String toString () {
            return "Привет! Меня зовут " + getName() + "! Я из города " + getTown() + "! Я родился в " +
                    getYearOfBirth() + " году." + " Я работаю на должности " + getJobTitle() + ". Будем знакомы!";
        }

    public Human(String name, String town, int yearOfBirth, String jobTitle){
            if (name == null || name.equals("")) {
                name = "Информация не указана";
            }
            this.name = name;

            setTown(town);
            setYearOfBirth(yearOfBirth);

            if (jobTitle == null || jobTitle.equals("")) {
                jobTitle = "Информация не указана";
            }
            this.jobTitle = jobTitle;

        }
    }