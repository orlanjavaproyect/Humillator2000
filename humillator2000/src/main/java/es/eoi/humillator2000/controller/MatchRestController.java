package es.eoi.humillator2000.controller;


import es.eoi.humillator2000.data.entity.Match;
import es.eoi.humillator2000.service.MatchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/match")
public class MatchRestController {

    private final MatchService matchService;

    public MatchRestController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping
    public List<Match> findAll(){
        return matchService.findAll();
    }

    @GetMapping("/{id}")
    public Match findById(@PathVariable("id") Integer id){
        return matchService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        matchService.deleteById(id);
    }

    @PostMapping
    public Match save(Match match){
        return matchService.save(match);
    }
    @PutMapping
    public Match update(Match match){
        return matchService.update(match);
    }
}