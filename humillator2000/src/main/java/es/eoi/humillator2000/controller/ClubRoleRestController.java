package es.eoi.humillator2000.controller;

import es.eoi.humillator2000.data.entity.ClubRole;
import es.eoi.humillator2000.service.ClubRoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubRole")
public class ClubRoleRestController {

    private final ClubRoleService clubRoleService;


    public ClubRoleRestController(ClubRoleService clubRoleService) {
        this.clubRoleService = clubRoleService;
    }

    @GetMapping
    public List<ClubRole> findAll(){
        return clubRoleService.findAll();
    }

    @GetMapping("/{id}")
    public ClubRole findById(@PathVariable("id") Integer id){
        return clubRoleService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        clubRoleService.deleteById(id);
    }

    @PostMapping
    public ClubRole save(ClubRole clubRole){
        return clubRoleService.save(clubRole);
    }
    @PutMapping
    public ClubRole update(ClubRole clubRole){
        return clubRoleService.update(clubRole);
    }
}