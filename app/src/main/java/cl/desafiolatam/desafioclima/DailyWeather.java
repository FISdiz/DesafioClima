package cl.desafiolatam.desafioclima;

public class DailyWeather {

    private String city;
    private String date;
    private String image;
    private String temperature;
    private String measure;

    public DailyWeather(String city, String date, String image, String temperature, String measure) {
        this.city = city;
        this.date = date;
        this.image = image;
        this.temperature = temperature;
        this.measure = measure;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "DailyWeather{" +
                "city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", image='" + image + '\'' +
                ", temperature='" + temperature + '\'' +
                ", measure='" + measure + '\'' +
                '}';
    }
}
