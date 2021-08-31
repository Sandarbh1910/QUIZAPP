/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp_Pojo;

/**
 *
 * @author Sandarbh Taran
 */
public class StudentScore {
    
    private String language;
    private double perc;

    public String getSubject() {
        return language;
    }

    public void setSubject(String language) {
        this.language = language;
    }

    public double getPerc() {
        return perc;
    }

    public void setPerc(double perc) {
        this.perc = perc;
    }

}
