package com.Tp3_Rest_API.dao;


import com.Tp3_Rest_API.model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class HeroDAO implements IHeroDAO {
    private Map<Integer, Hero> heroes;
    private int lastId;
    @Autowired
    public HeroDAO(){
        lastId = 0 ;
        this.heroes = new HashMap<>();
        lastId++;
        this.heroes.put(lastId, new Hero(
                lastId,
                "mark",
                "human",
                "fire",
                10));
        lastId++;
        this.heroes.put(lastId, new Hero(
                lastId,
                "ziak",
                "lizard",
                "water",
                50));
        lastId++;
        this.heroes.put(lastId, new Hero(
                lastId,
                "romeo",
                "lizard",
                "wind",
                10));
    }

    @Override
    public Collection<Hero> get() {
        return heroes.values();
    }

    @Override
    public Hero get(int id) {
        return heroes.get(id);
    }

    @Override
    public Hero post(Hero h) {
        lastId++;
        h.setId(lastId);
        heroes.put(lastId,h);
        return h;
    }

   @Override
    public Hero put(Hero nH, int id) {
        if(contains(id)){
            Hero newHero = get(id);
            if(nH.getHp() > 0 ) newHero.setHp(nH.getHp());
            if(nH.getFraction() != null ) newHero.setFraction(nH.getFraction());
            if(nH.getName() != null ) newHero.setName(nH.getName());
            if(nH.getPower() != null ) newHero.setPower(nH.getPower());
            return newHero;
        }else{
            return null;
        }
    }

   /* @Override
    public Hero put(Hero newHero, int id) {
        if(contains(id)){
            newHero.setId(id);
            heroes.put(id, newHero);
            return newHero;
        }else{
            return null;
        }
    }
*/
    public boolean contains(int id) {
        return heroes.containsKey(id);
    }

    @Override
    public boolean  delete(int id) {
        if(contains(id)){
            heroes.remove(id);
            return true;
        }else{
            return false;
        }
    }
}
