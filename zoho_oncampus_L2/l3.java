import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class l3 {
    static class person {
        private String name;
        private char gender;
        private String Father;
        private String Mother;

        public person(String name, char gender, String father, String mother) {
            this.name = name;
            this.gender = gender;
            Father = father;
            Mother = mother;
        }
    }

    public static void main(String[] args) {
        person persons[] = new person[6];
        persons[0] = new person("Surya", 'M', "Sivakumar", "Sivakami");
        persons[1] = new person("Sivakumar", 'M', "Siva_Father", "Siva_mother");
        persons[2] = new person("Karthick", 'M', "Sivakumar", "Sivakami");
        persons[3] = new person("Jyothika_Mother", 'F', "Siva_Father", "Siva_Mother");
        persons[4] = new person("Jyothika", 'F', "Jyothika_Father", "Jyothika_Mother");
        persons[5] = new person("Nagma", 'F', "Jyothika_Father", "Jyothika_Mother");
        //persons[6] = new person("abc", 'F', "Siva_Father", "Siva_Mother");//for Dad Sibilings testing
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name :");
        String name = sc.nextLine();
        String dad = "", mom  = "";
        char gen = ' ';
        for (int q= 0; q < persons.length; q++) {
            if (persons[q].name.equals(name)) {
                dad = persons[q].Father;
                mom = persons[q].Mother;
                gen = persons[q].gender;
                break;
            }
        }
        String dad_parents= "", mom_parents = "";
        System.out.println(dad + " " + mom);
        for (int a = 0; a < persons.length; a++) {
            if (persons[a].name.equals(dad)) {
                dad_parents = persons[a].Father;
            }
            if (persons[a].name.equals(mom)) {
                mom_parents = persons[a].Father;
            }
        }
        System.out.println(dad_parents + " " + mom_parents);
        ArrayList<String> dad_sibilings = new ArrayList<>();
        ArrayList<String> mom_sibilings = new ArrayList<>();
        ArrayList<String> sibilings_child = new ArrayList<>();
        if(!dad_parents.equals("")) {
            for (int i = 0; i < persons.length; i++) {
                if (persons[i].Father.equals(dad_parents) && (!persons[i].name.equals(dad))) {
                    dad_sibilings.add(persons[i].name);
                }
            }
            while (!dad_sibilings.isEmpty()) {
                for (int j = 0; j < persons.length; j++) {
                    if (persons[j].Father.equals(dad_sibilings.get(0)) || persons[j].Mother.equals(dad_sibilings.get(0))) {
                        if(persons[j].gender != gen) {
                            sibilings_child.add(persons[j].name);
                        }
                    }
                }
                dad_sibilings.remove(0);
            }
        }
        if (!mom_parents.equals("")) {
            for (int t = 0; t < persons.length; t++) {
                if (persons[t].Father.equals(mom_parents) && (!persons[t].name.equals(mom))) {
                    mom_sibilings.add(persons[t].name);
                }
            }
            while (!mom_sibilings.isEmpty()) {
                for (int j = 0; j < persons.length; j++) {
                    if (persons[j].Father.equals(mom_sibilings.get(0)) || persons[j].Mother.equals(mom_sibilings.get(0))) {
                        if(persons[j].gender != gen) {
                            sibilings_child.add(persons[j].name);
                        }
                    }
                }
                mom_sibilings.remove(0);
            }
        }
        System.out.print("Output : ");
        System.out.println(sibilings_child);
    }
}
