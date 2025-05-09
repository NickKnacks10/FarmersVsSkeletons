public class Icon{
    private String firstRow;
    private String secondRow;
    private String thirdRow;

    public Icon(String firstRow, String secondRow, String thirdRow){
        this.firstRow = firstRow;
        this.secondRow = secondRow;
        this.thirdRow = thirdRow;
    }

    public String getFirst(){
        return firstRow;
    }

    public String getSecond(){
        return secondRow;
    }

    public String getThird(){
        return thirdRow;
    }

}