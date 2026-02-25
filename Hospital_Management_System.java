class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showDetails() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

class Doctor extends Person {
    String specialization;

    Doctor(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Specialization : " + specialization);
        System.out.println("Role : Doctor - Provides treatment");
    }
}

class Patient extends Person {
    String disease;

    Patient(String name, int id, String disease) {
        super(name, id);
        this.disease = disease;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Disease : " + disease);
        System.out.println("Role : Patient - Receiving treatment");
    }
}

class Main {
    public static void main(String[] args) {

        Person p1 = new Doctor("Dr. Kumar", 101, "Cardiology");
        Person p2 = new Patient("Anitha", 201, "Fever");

        p1.showDetails();
        System.out.println();
        p2.showDetails();
    }
}
