package es.eoi.humillator2000.web.dto;

import es.eoi.humillator2000.data.entity.Match;
import es.eoi.humillator2000.data.entity.UserHasClub;

import java.util.Set;

public class ClubRoleDTO {
    private Integer id;
    private String name;


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

}
