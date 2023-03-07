package Behavioural.Observer;

public class SpreadSheet implements Observer {
    private DataSource dataSource; //Pull

    public SpreadSheet(DataSource dataSource) { //Pull
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet got notified: " + dataSource.getValue()); //Pull
    }

    //push
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet got notified " + value);
    }
}
