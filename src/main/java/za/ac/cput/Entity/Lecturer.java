package za.ac.cput.Entity;

public class Lecturer {
    private String name, surname, id;

    private Lecturer (Builder builder){
        this.name=builder.name;
        this.surname=builder.surname;
        this.id=builder.id;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public static class Builder{
        private String name, surname, id;

        public Builder setName(String name) {
            this.name = name;

            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;

            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;

        }

        public Lecturer build(){
            return new Lecturer(this);
        }

        public Builder copy(Lecturer lecturer){
            this.name= lecturer.name;
            this.surname= lecturer.surname;
            this.id= lecturer.id;
            return this;
        }
    }
}
