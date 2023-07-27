public class Manufacturer {

    private String name;
    private String country;
    private String legalStatus;

    public Manufacturer(String name, String country, String legalStatus) {
        this.name = name;
        this.country = country;
        this.legalStatus = legalStatus;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLegalStatus() {
        return legalStatus;
    }

    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", legalStatus='" + legalStatus + '\'' +
                '}';
    }
}
