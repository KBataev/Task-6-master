package web.model;

public class Car {
    
    private int series;
    private String model;
    private int year;

    public Car(int series, String model, int year) {
        this.series = series;
        this.model = model;
        this.year = year;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "series=" + series +
                ", model='" + model +
                "', year=" + year;
    }
}
