package dk.webtrade.gson_demo.dtos;

import java.util.ArrayList;
import java.util.List;

public class C2DTO {

    List<C1DTO> listOfC1 = new ArrayList<>();

    public C2DTO(List<C1DTO> listOfC1) {
        this.listOfC1 = listOfC1;
    }

    public List<C1DTO> getListOfC1() {
        return listOfC1;
    }

    public void setListOfC1(List<C1DTO> listOfC1) {
        this.listOfC1 = listOfC1;
    }

    @Override
    public String toString() {
        return "C2DTO{" +
                "listOfC1=" + listOfC1 +
                '}';
    }
}
