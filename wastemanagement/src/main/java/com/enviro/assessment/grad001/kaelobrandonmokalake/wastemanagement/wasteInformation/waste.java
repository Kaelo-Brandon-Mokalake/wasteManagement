package com.enviro.assessment.grad001.kaelobrandonmokalake.wastemanagement.wasteInformation;

import com.enviro.assessment.grad001.kaelobrandonmokalake.wastemanagement.wasteController;

public class waste extends wasteController{

    private String title;
    private String body;


    // our getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    // This is a method that interacts with our database
    // to exchange data back and forth
    public String info(){
    
        String data;

        // information is pulled from the database to the 
        // web wher users can update, add, delete

        
    }
}
