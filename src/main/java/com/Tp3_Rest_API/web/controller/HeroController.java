package com.Tp3_Rest_API.web.controller;

import com.Tp3_Rest_API.dao.IHeroDAO;
import com.Tp3_Rest_API.model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class HeroController {

    @Autowired
    private IHeroDAO dao ;

    @GetMapping(value = "/heroes")
    public Collection<Hero> getHeroes(){return this.dao.get();}

    @GetMapping(value = "/heroes/{id}")
    public Hero getHero(@PathVariable int id){
        return this.dao.get(id);
    }

    @PostMapping(value = "/heroes")
    public void addHero(@RequestBody Hero h){
        this.dao.post(h);
    }

    @PutMapping(value = "/heroes/{id}")
    public void updateHero(@RequestBody Hero h, @PathVariable int id){
        this.dao.put(h,id);
    }

    @DeleteMapping(value = "/heroes/{id}")
    public void deleteHero(@PathVariable int id){
        this.dao.delete(id);
    }

}