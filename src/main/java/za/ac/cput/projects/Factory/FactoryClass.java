package za.ac.cput.projects.Factory;

import za.ac.cput.projects.Chaprone;

public class FactoryClass {

    public static Chaprone createChaprone(String cname, String cnumb)
    {
       return new Chaprone.Builder().chapName(cname).chapNumer(cnumb).build();

    }
}
