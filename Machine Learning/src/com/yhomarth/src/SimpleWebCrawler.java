/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yhomarth.src;

import java.util.ArrayList;

/**
 *
 * @author y.reyes
 */
public class SimpleWebCrawler {
    private String topic;
    private String startingURL;
    private String urlLimiter;
    private final int pageLimit = 20;
    private ArrayList<String> visitedList = new ArrayList<>();
    private ArrayList<String> pageList = new ArrayList<>();
    
    public static void main(String[] args) {
            new SimpleWebCrawler();
    }
    
    public SimpleWebCrawler() {
            startingURL = " https://en.wikipedia.org/wiki/Bishop_Rock, " + "Isles_of_Scilly";
            urlLimiter = "Bishop_Rock";
            topic = "shipping route";
            visitPage(startingURL);
}
    
    public void visitPage(String url) {
        if (pageList.size() >= pageLimit) {
    
        }
        
    }//end of visitPage method
    
}//end of class
