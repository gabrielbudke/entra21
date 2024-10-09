package bean;

public class CustomerBean {
    private Integer id;
    private String name, dateOfBirth, document;
    private Boolean active;

    public CustomerBean() {
    }

    public CustomerBean(String name, String dateOfBirth, String document) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.document = document;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}
