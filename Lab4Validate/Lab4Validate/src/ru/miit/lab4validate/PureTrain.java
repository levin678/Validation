package ru.miit.lab4validate;


public class PureTrain {
    private String nomTR = null;     // ����� ������

    private Integer idPoezd;    // ������������� ������

    private String type = null;     // ��� ������

    private Integer npp;       // ����������� �������

    private String esrStV = null;    // ��� ������� ������ ������

    private String esrFinV = null;      // ��� ������� ���������� ������

    private Integer vesGruz;          // ��� ����� � ������

    private Double udl;         // �������� ����� ������

    public PureTrain() {
    }

    public String getNomTR() {
        return nomTR;
    }

    public void setNomTR(String nomTR) {
        this.nomTR = nomTR;
    }

    public Integer getIdPoezd() {
        return idPoezd;
    }

    public void setIdPoezd(Integer idPoezd) {
        this.idPoezd = idPoezd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNpp() {
        return npp;
    }

    public void setNpp(Integer npp) {
        this.npp = npp;
    }

    public String getEsrStV() {
        return esrStV;
    }

    public void setEsrStV(String esrStV) {
        this.esrStV = esrStV;
    }

    public String getEsrFinV() {
        return esrFinV;
    }

    public void setEsrFinV(String esrFinV) {
        this.esrFinV = esrFinV;
    }

    public Integer getVesGruz() {
        return vesGruz;
    }

    public void setVesGruz(Integer vesGruz) {
        this.vesGruz = vesGruz;
    }

    public Double getUdl() {
        return udl;
    }

    public void setUdl(Double udl) {
        this.udl = udl;
    }
}
