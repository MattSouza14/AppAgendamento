package com.example.clinicproject;
import android.widget.EditText;

import java.io.Serializable;
public class PatientInfo  implements Serializable{
    private String completName;
    private String gender;
    private String dateBirth;
    private Integer cpf;
    private Integer cellPhoneNumber;
    private Integer landLine;
    private String email;
    private String address;
    private Integer houseNumber;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String cep;
    private String financialManager;
    private String cpfFinancialManager;
    private String observation;

    public PatientInfo(String completName, Integer cpf) {
        this.completName = completName;
        this.cpf = cpf;
    }

    public PatientInfo(String completName, Integer cpf, Integer cellPhoneNumber) {
        this.completName = completName;
        this.cpf = cpf;
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public PatientInfo(String completName, String gender, String dateBirth, Integer cpf,
                       Integer cellPhoneNumber, Integer landLine, String email, String address,
                       Integer houseNumber, String neighborhood, String city, String state, String cep) {
        this.completName = completName;
        this.gender = gender;
        this.dateBirth = dateBirth;
        this.cpf = cpf;
        this.cellPhoneNumber = cellPhoneNumber;
        this.landLine = landLine;
        this.email = email;
        this.address = address;
        this.houseNumber = houseNumber;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.cep = cep;
    }

    public PatientInfo(String completName, String gender, String dateBirth, Integer cpf,
                       Integer cellPhoneNumber, Integer landLine, String email, String address,
                       Integer houseNumber, String complement, String neighborhood, String city,
                       String state, String cep, String financialManager, String cpfFinancialManager,
                       String observation) {
        this.completName = completName;
        this.gender = gender;
        this.dateBirth = dateBirth;
        this.cpf = cpf;
        this.cellPhoneNumber = cellPhoneNumber;
        this.landLine = landLine;
        this.email = email;
        this.address = address;
        this.houseNumber = houseNumber;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.cep = cep;
        this.financialManager = financialManager;
        this.cpfFinancialManager = cpfFinancialManager;
        this.observation = observation;
    }

    public String getCompletName() {

        return completName;
    }

    public void setCompletName(String completName) {

        this.completName = completName;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public String getDateBirth()
    {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(Integer cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public Integer getLandLine() {
        return landLine;
    }

    public void setLandLine(Integer landLine) {
        this.landLine = landLine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getFinancialManager() {
        return financialManager;
    }

    public void setFinancialManager(String financialManager) {
        this.financialManager = financialManager;
    }

    public String getCpfFinancialManager() {
        return cpfFinancialManager;
    }

    public void setCpfFinancialManager(String cpfFinancialManager) {
        this.cpfFinancialManager = cpfFinancialManager;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}
