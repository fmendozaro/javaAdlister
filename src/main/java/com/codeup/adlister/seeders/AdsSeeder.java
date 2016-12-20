package com.codeup.adlister.seeders;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

/**
 * Created by Fer on 12/13/16.
 */
public class AdsSeeder {
    public static void main(String[] args){
        Ad ad = new Ad(2,"My first Ad", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse sodales augue vitae porttitor pharetra. Duis pretium urna ut est lacinia semper. Integer tristique felis nisl, in porttitor turpis pretium laoreet. Donec tempor consequat nunc, in lacinia ex consectetur nec. Donec congue eros ut nisl maximus, ac fringilla purus semper. Ut tempus consequat tellus, ut eleifend est egestas sed. Duis in lorem elementum, ornare ligula ut, gravida lectus. Morbi vitae mi consequat, egestas ligula id, auctor sem. Praesent elementum purus vel orci volutpat fringilla. Nulla lobortis velit eget tortor faucibus, quis euismod orci gravida. ");
        DaoFactory.getAdsDao().insert(ad);
        ad = new Ad(1,"Something i just wanted to say", "Some rubbish Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse sodales augue vitae porttitor pharetra. Duis pretium urna ut est lacinia semper. Integer tristique felis nisl, in porttitor turpis pretium laoreet. Donec tempor consequat nunc, in lacinia ex consectetur nec. Donec congue eros ut nisl maximus, ac fringilla purus semper. Ut tempus consequat tellus, ut eleifend est egestas sed. Duis in lorem elementum, ornare ligula ut, gravida lectus. Morbi vitae mi consequat, egestas ligula id, auctor sem. Praesent elementum purus vel orci volutpat fringilla. Nulla lobortis velit eget tortor faucibus, quis euismod orci gravida. ");
        DaoFactory.getAdsDao().insert(ad);
    }
}
