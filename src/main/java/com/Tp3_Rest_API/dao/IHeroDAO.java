package com.Tp3_Rest_API.dao;

import com.Tp3_Rest_API.model.Hero;

import java.util.Collection;

public interface IHeroDAO {
    Collection<Hero> get();
    Hero get(int id);
    Hero post(Hero h);
    Hero put(Hero newHero, int id);
    boolean  delete(int id);
}
