package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString

public class Country {
    public String name;
    public double size;
    public int numberOfCitizens;
    public String contient;
    
   


   // public Country(String name, double size, int numberOfCitizens, String contient) {
    //    this.name = name;
     //   this.size = size;
      //  this.numberOfCitizens = numberOfCitizens;
      //  this.contient = contient;
    }

  //  @Override
   // public String toString() {
      //  return "Country{" +
       //         "name='" + name + '\'' +
        //        ", size=" + size +
         //       ", numberOfCitizens=" + numberOfCitizens +
         //       ", contient='" + contient + '\'' +
         //       '}';
  //  }
//}

  //functions:
 public void printCountrySize() {
        System.out.println (String.format ("The country size is %d, size"));
    }
    public void printSizePerCitizen()   {
        System.out.println (String.format ("The size of citizens is %d", numberOfCitizens));
    }
}
