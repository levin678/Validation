package ru.miit.lab4validate;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Train {

    @NotNull (message="Номер для поезда должен быть задан")
    @Size(min = 6, message="Номер для поезда должен быть минимум 10 символов")
    private String nomTR = null;     // Номер поезда

    @NotNull (message="Идентификатор для поезда должен быть задан")
    @Min(value = 1, message = "Условная длина для поезда должна быть больше 1 условнго вагона")
    private Integer idPoezd;                // Идентификатор поезда

    @NotNull (message="Тип поезда должен быть задан")
    private String type = null;     // Тип поезда

    @Range(min = 1, max = 170, message="Колличество вагонов не должно быть не меньше 1 и не больше 170")
    private Integer npp;                  // Колличество вагонов

    @Size(min = 6, message="Станция старта для поезда должна быть минимум 6 символов")
    private String esrStV = null;    // ЕСР станции старта поезда

    @Size(min = 6, message="Станция назначения для поезда должна быть минимум 6 символов")
    private String esrFinV = null;    // ЕСР станции назначения вагона

    private Integer vesGruz;          // Вес груза в тоннах
    @NotNull (message="Условная длина для вагона должна быть задана")
    @Min(value = 1, message = "Условная длина для вагона должна быть больше 1 условнго вагона")
    private Double udl;         // Условная длина вагона

    public Train() {
    }


    public Integer getIdPoezd() {
        return idPoezd;
    }

    public void setIdPoezd(int idPoezd) {
        this.idPoezd = idPoezd;
    }

    public int getNpp() {
        return npp;
    }

    public void setNpp(int npp) {
        this.npp = npp;
    }

    public int getVesGruz() {
        return vesGruz;
    }

    public void setVesGruz(int vesGruz) {
        this.vesGruz = vesGruz;
    }

    public double getUdl() {
        return udl;
    }

    public void setUdl(double udl) {
        this.udl = udl;
    }

    public String getNomTR() {
        return nomTR;
    }

    public void setNomTR(String nomTR) {
        this.nomTR = nomTR;
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

    public void setVesGruz(Integer vesGruz) {
        this.vesGruz = vesGruz;
    }

    public void setUdl(Double udl) {
        this.udl = udl;
    }
}
