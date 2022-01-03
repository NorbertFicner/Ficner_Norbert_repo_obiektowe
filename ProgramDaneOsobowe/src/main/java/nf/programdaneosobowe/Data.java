/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf.programdaneosobowe;

/**
 *
 * @author zalman
 */
public class Data {
    private String name,surname,classOfSchool,yearOfStarEducation;

    public Data(String name, String surname, String classOfSchool, String yearOfStarEducation) {
        this.name = name;
        this.surname = surname;
        this.classOfSchool = classOfSchool;
        this.yearOfStarEducation = yearOfStarEducation;
    }

    @Override
    public String toString() {
        return "Name - " + name + "; Surname - " + surname + "; Class - " + classOfSchool + "; Year Of Star Education - " + yearOfStarEducation ;
    }
    
    
}
