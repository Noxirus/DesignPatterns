package Observer;

public class Chart implements Observer{
    private DataSource dataSource; //Pull

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got updated: " + dataSource.getValue()); //Pull
    }

    //Push
    @Override
    public void update(int value) {
        System.out.println("Chart got updated " + value);
    }
}
