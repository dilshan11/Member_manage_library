/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.library.model;

/**
 *
 * @author ASUS™
 */
public class Member {
    private String memberid;
    private String name;
    private String addrss;
    private String status;

    public Member() {
    }

    public Member(String memberid, String name, String addrss, String status) {
        this.memberid = memberid;
        this.name = name;
        this.addrss = addrss;
        this.status = status;
    }

    /**
     * @return the memberid
     */
    public String getMemberid() {
        return memberid;
    }

    /**
     * @param memberid the memberid to set
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the addrss
     */
    public String getAddrss() {
        return addrss;
    }

    /**
     * @param addrss the addrss to set
     */
    public void setAddrss(String addrss) {
        this.addrss = addrss;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
