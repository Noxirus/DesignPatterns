package Behavioural.Observer;

public interface Observer {
    void update();

    //push
    void update(int value);
}
//There are times where certain objects need to listen or "observe" another thing to see when something has been updated
//In this case, the datasource contains values (a DB for example) and the sheets and charts are added to this source to listen to
//When the source updates it will notify the observers this has happened and they can respond accordingly with their own functionality

       /*
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

        */