package com.cc.java;

public class Cat {
 
   private String name;
   private String furColor;
   private int age;
   private boolean isFemale;
   private int counter;

 
    public Cat(String name, String furColor, int age, boolean isFemale) {
    this.name = name;
    this.furColor = furColor;
    this.age = age;
    this.isFemale = isFemale;
    }

    public String getStringAttributes(String flag) {
        switch (flag) {
            case "#name":
                return name;
            case "#color":
                return furColor;      
            default:
                return "#!Error";
        }
    }

    public String getAge() {
        if (isFemale) {
            return Integer.toString(age);
        } else {
            return checkEscalationLevel();
        }
    }

    private String checkEscalationLevel() {

        counter ++;

        switch (counter) {
            case 1:
            return "Was soll die Frage?";
            case 2:
            return "Sag ich nicht.";
            case 3:
            return"Lass mich in Ruhe.";        
            default:
                return "Hast Du Lack gesoffen?";
        }
        
    }



    



    


    
}
