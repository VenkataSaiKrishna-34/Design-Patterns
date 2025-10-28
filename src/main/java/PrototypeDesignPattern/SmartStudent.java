package PrototypeDesignPattern;

public class SmartStudent extends Student implements Prototype{
    private int iq;
    private int rank;

    SmartStudent(int iq, int rank){
        this.iq = iq;
        this.rank = rank;
    }

    //This a copy constructor
    SmartStudent(SmartStudent smartStudent){
        super(smartStudent);
        this.iq = smartStudent.iq;
        this.rank = smartStudent.rank;
    }

    @Override
    public SmartStudent clone() {
        return new SmartStudent(this);
    }
}
