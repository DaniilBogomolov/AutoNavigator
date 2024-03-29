package models;

public class Transmission {
    private Long id;
    private TransmissionType transmissionType;

    public Transmission(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public Transmission(Long id, TransmissionType transmissionType) {
        this.id = id;
        this.transmissionType = transmissionType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }
}
