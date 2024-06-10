package OOP.ThirdExercise;

import java.time.Year;

public class Person {

    public final String name;
    final String sex;
    public final String religion;
    final String languageSpoken;
    String job;
    final String nationality;
    final String EGN;
    String countryOfResidence;

    String dateOfBirth;
    int age;

    public Person (String name, String sex, String religion, String languageSpoken,
                  String job, String nationality, String EGN, String countryOfResidence) {

        this.name = name;
        this.sex = sex;
        validateSex(sex);
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        this.EGN = EGN;
        validateEGN(EGN);
        this.countryOfResidence = countryOfResidence;
        this.age = setAge(EGN);
        this.dateOfBirth = setDateOfBirth(EGN);

        }

        public int setAge(String egn) {

            String birthYear = EGN.substring(0,2);
            String birthMonths = EGN.substring(2, 4);
            int parsedBirthMonths = Integer.parseInt(birthMonths);

            int userYear = Integer.parseInt(birthYear);
            int currentYear = Year.now().getValue();

            if (parsedBirthMonths > 40) {
                userYear += 2000;
            } else {
                userYear += 1900;
            }
            int age = currentYear - userYear;
            return age;

        }

        public String setDateOfBirth(String egn) {
            String birthDays = EGN.substring(4,6);
            String birthMonth = EGN.substring(2,4);
            int birthMonthDigits = Integer.parseInt(birthMonth);
            if (birthMonthDigits > 40 ) {
                birthMonthDigits -= 40;
            }
            dateOfBirth = "Date of birth is " + birthDays + birthMonthDigits;
            return dateOfBirth;
        }

    private void validateSex(String sex) {
        String male = "male";
        String female = "female";
        if (!sex.equals(male) && !sex.equals(female)) {
            throw new RuntimeException("Invalid sex. Should be Male or Female.");
            }
        }

        public void validateEGN(String egn) {
            if (egn.length() != 10) {
                throw new RuntimeException("EGN entered is invalid");
            }
        }

    public void sayHello() {
        switch (this.languageSpoken) {
            case "Bulgarian" -> System.out.println("Здравей!");
            case "Italian" -> System.out.println("Buongiorno!");
            default -> System.out.println("Hello!");
        }

    }


    public boolean celebrateEaster() {
            if (religion.equals("Catholic") || religion.equals("Orthodox")) {
                System.out.println("I celebrate Easter!");
                return true;
            } else {
                System.out.println("I don't celebrate Easter!");
                return false;
            }
        }

        public boolean isAdult() {
            return switch (countryOfResidence) {
                case "Bulgaria", "Italy", "UK" -> age >= 18;
                case "USA" -> age >= 21;
                default -> throw new RuntimeException("No info about your " + countryOfResidence);
            };
        }

        public boolean canTakeLoan() {
            return isAdult() && job != null;
        }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Sex: ").append(sex).append("\n");
        sb.append("Nationality: ").append(nationality).append("\n");
        sb.append("Birth day: ").append(dateOfBirth).append("\n");
        sb.append("Job: " ).append(job).append("\n");
        sb.append("Age: ").append(age).append("\n");
        return sb.toString();
    }


    }







