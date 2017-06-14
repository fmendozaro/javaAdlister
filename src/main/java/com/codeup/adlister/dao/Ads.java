package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all(String q);
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
    Ad getById(long id);
    List<Ad> getByUserId(Long userId);
    void updateAd(Ad ad);
    void delete(long id);
}
