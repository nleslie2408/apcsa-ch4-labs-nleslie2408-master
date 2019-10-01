package NameProject;

public class Name {

    private String first;
    private String middle;
    private String last;




    public Name(String first, String middle, String last){
        this.first=first;
        this.middle=middle;
        this.last=last;
    }

    public String getFirst(){
        return this.first;
    }

    public String getMiddle(){
        return this.middle;
    }

    public String getLast(){
        return this.last;
    }

    public String firstMiddleLast(){
        String nameF= this.first+" "+this.middle+" "+this.last;
        return nameF;
    }

    public String lastFirstMiddle(){
        String nameL= this.last+", "+this.first+" "+this.middle;
        return nameL;
    }

    public boolean equals(Name otherName){
        String myName = firstMiddleLast();
        String oName = otherName.firstMiddleLast();
        return myName.equalsIgnoreCase(oName);
    }

    public String initials(){
        String FI= getFirst().substring(0,1);
        String MI= getMiddle().substring(0,1);
        String LI= getLast().substring(0,1);
        String initial=FI+MI+LI;
        return initial;
    }

    public int length(){
        String overall= this.first+this.middle+this.last;
        int len=overall.length();
        return len;
    }


}
