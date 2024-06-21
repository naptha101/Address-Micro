package com.example.Address.response;



public class AddressResponse {

    private int id;
    private int employee_id;
    private String lane1;
    private String lane2;
    private String lane3;

    public String getZip() {
        return zip;
    }

    public String getLane3() {
        return lane3;
    }

    public void setLane3(String lane3) {
        this.lane3 = lane3;
    }

    public String getLane2() {
        return lane2;
    }

    public void setLane2(String lane2) {
        this.lane2 = lane2;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLane1() {
        return lane1;
    }

    public void setLane1(String lane1) {
        this.lane1 = lane1;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String zip;

}
