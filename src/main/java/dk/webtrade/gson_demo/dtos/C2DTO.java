package dk.webtrade.gson_demo.dtos;

import java.util.ArrayList;
import java.util.List;

public class C2DTO {

    List<String> listOfC1StringRepresentation = new ArrayList<>();



    public C2DTO(List<String> listOfC1StringRepresentation) {
        this.listOfC1StringRepresentation = listOfC1StringRepresentation;
    }

    public List<String> getListOfC1StringRepresentation() {
        return listOfC1StringRepresentation;
    }

    public void setListOfC1StringRepresentation(List<String> listOfC1StringRepresentation) {
        this.listOfC1StringRepresentation = listOfC1StringRepresentation;
    }

    @Override
    public String toString() {
        return "C2DTO{" +
                "listOfC1StringRepresentation=" + listOfC1StringRepresentation +
                '}';
    }
}
