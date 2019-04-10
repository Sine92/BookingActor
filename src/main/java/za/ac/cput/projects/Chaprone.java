package za.ac.cput.projects;

public class Chaprone {

    private String chapName;
    private String chapNumber;

    public Chaprone()
    {

    }
    public Chaprone(Builder build)
    {
        this.chapName = build.chapName;
        this.chapNumber = build.chapNumber;


    }

    public String getChapName() {
        return chapName;
    }

    public String getChapNumber() {
        return chapNumber;
    }

    public static class Builder{
        private String chapName;
        private String chapNumber;

        public Builder chapName(String value)
        {
            this.chapName = value;
            return this;
        }
        public Builder chapNumer(String value)
        {
            this.chapNumber = value;
            return this;
        }
        public Chaprone build()
        {
            return new Chaprone(this);
        }

    }
}
