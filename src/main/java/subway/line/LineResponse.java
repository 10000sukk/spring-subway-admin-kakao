package subway.line;

import subway.station.StationDao;
import subway.station.StationResponse;

import java.util.List;
import java.util.stream.Collectors;

public class LineResponse {
    private Long id;
    private String name;
    private String color;
    private int extraFare;
    private List<StationResponse> stations;
    StationDao stationDao;
    LineDao lineDao;
    public LineResponse(){

    }
    public LineResponse(Line line){
        this.id = line.getId();
        this.name = line.getName();
        this.color = line.getColor();
        this.stations = stationDao.getStationResponseList(
                lineDao.getStations(line));

    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public List<StationResponse> getStations() {
        return stations;
    }

    public int getExtraFare() {
        return extraFare;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setExtraFare(int extraFare) {
        this.extraFare = extraFare;
    }

    public void setStations(List<StationResponse> stations) {
        this.stations = stations;
    }
}
