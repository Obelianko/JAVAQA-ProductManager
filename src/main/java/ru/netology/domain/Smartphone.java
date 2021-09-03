package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)


public class Smartphone extends Product {
    private String Manufacturer;


    public Smartphone(int id, String name, int price, String Manufacturer) {
        super(id, name, price);
        this.Manufacturer = Manufacturer;
    }

}
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Smartphone that = (Smartphone) o;
//        return Objects.equals(manufacturer, that.manufacturer);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), manufacturer);
//    }

