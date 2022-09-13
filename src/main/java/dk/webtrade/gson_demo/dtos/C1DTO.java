package dk.webtrade.gson_demo.dtos;

import java.util.ArrayList;
import java.util.List;

public class C1DTO {

    List<C2DTO> listOfC2 = new ArrayList<>();

    public C1DTO(List<C2DTO> listOfC2) {
        this.listOfC2 = listOfC2;
    }

    public List<C2DTO> getListOfC2() {
        return listOfC2;
    }

    public void setListOfC2(List<C2DTO> listOfC2) {
        this.listOfC2 = listOfC2;
    }

    @Override
    public String toString() {
        return "C1DTO{" +
                "listOfC2=" + listOfC2 +
                '}';
    }
}
