public class Drum implements Instrument{                                                                                                                                                 public String getName(){return "Drum";}                                                 public String getColor(){return "Black";}                                                public float getPrice(){return 18.000f;}                                                                                                                                          public String toString(){                                                                        return "Insturment : \n"+                                                                       "Name : "+getName()+"\n"+                                                                "Color : "+getColor()+"\n"+                                                              "Price : "+getPrice()+"\n";                                               }                                                                                        public void toPrint(){System.out.println(toString());}                           }   
