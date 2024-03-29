package models;

public class Maker {
    private Long id;
    private String makerName;

    public Maker(Long id, String makerName) {
        this.id = id;
        this.makerName = makerName;
    }

    public Maker(String makerName) {
        this.makerName = makerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }
}
