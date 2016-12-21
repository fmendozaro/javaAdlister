package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.AdsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String q = request.getParameter("q");

        if(id != null){
            Ad ad = DaoFactory.getAdsDao().getById(Integer.parseInt(id));

            request.setAttribute("ad", ad);
            request.setAttribute("user", DaoFactory.getUsersDao().findById(ad.getUserId()));

            request.getRequestDispatcher("/WEB-INF/ads/show.jsp").forward(request, response);

        }

        if(q != null) {
            request.setAttribute("ads", DaoFactory.getAdsDao().all(q));
        }else{
            request.setAttribute("ads", DaoFactory.getAdsDao().all(""));
        }

        request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);
    }
}
