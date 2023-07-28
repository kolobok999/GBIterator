import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Task 1

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponent(new Component("Penicillin", "0.5 mg", 15))
                .addComponent(new Component("Water", "1.2 mg", 4));

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponent(new Component("Sugar", "0.8 mg", 12))
                .addComponent(new Component("Water", "1.5 mg", 3));

        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponent(new Component("Sugar", "0.8 mg", 24))
                .addComponent(new Component("Water", "1.5 mg", 6));

        Pharmacy pharmacy4 = new Pharmacy();
        pharmacy4.addComponent(new Component("Sugar", "0.8 mg", 24))
                .addComponent(new Component("Water", "1.5 mg", 6));

        Pharmacy pharmacy5 = new Pharmacy();
        pharmacy5.addComponent(new Component("Salt", "0.8 mg", 24))
                .addComponent(new Component("Water", "1.5 mg", 6));

        Pharmacy pharmacy6 = new Pharmacy();
        pharmacy6.addComponent(new Component("Salt", "0.8 mg", 24))
                .addComponent(new Component("Water", "1.5 mg", 6));

        List<Pharmacy> listPharmacy = new ArrayList<>();
        listPharmacy.add(pharmacy1);
        listPharmacy.add(pharmacy2);
        listPharmacy.add(pharmacy3);
        listPharmacy.add(pharmacy4);
        listPharmacy.add(pharmacy5);
        listPharmacy.add(pharmacy6);

        //Task 2
        Set<Pharmacy> result = new HashSet<>(listPharmacy);
        System.out.println(result.size());

        //Task 3
        System.out.println("Сортировка:");
        System.out.println(listPharmacy);
        Collections.sort(listPharmacy);
        System.out.println(listPharmacy);









    }
}
