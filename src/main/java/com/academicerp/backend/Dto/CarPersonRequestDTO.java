package com.academicerp.backend.Dto;

public class CarPersonRequestDTO {

    private String carName;
    private String firstName;
    private String lastName;

    public CarPersonRequestDTO(String carName, String firstName, String lastName) {
        this.carName = carName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public CarPersonRequestDTO() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "CarPersonRequestDTO{" +
                "carName='" + carName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
