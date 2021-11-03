/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kpsingh
 */
public class Community {
    String communityName;
    House houseNumber;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public House getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(House houseNumber) {
        this.houseNumber = houseNumber;
    }
    
}
