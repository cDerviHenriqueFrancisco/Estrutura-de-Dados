public class Main {
    class Person {
        String name;
        String phone;
        String address;
        String cpf;
    
        Person(String name, String phone, String address, String cpf) {
            this.name = name;
            this.phone = phone;
            this.address = address;
            this.cpf = cpf;
        }
    
        @Override
        public String toString() {
            return "Person{name='" + name + "', phone='" + phone + "', address='" + address + "', cpf='" + cpf + "'}";
        }
    }
    
}

class Node {
    Person person;
    Node next;

    Node(Person person) {
        this.person = person;
        this.next = null;
    }
}

import java.util.ArrayList;
import java.util.List;

class JosephusProblem {

    private Node head;
    
    public void createList(List<Person> people) {
        if (people == null || people.size() == 0) return;
        
        head = new Node(people.get(0));
        Node current = head;

        for (int i = 1; i < people.size(); i++) {
            current.next = new Node(people.get(i));
            current = current.next;
        }

        current.next = head; 
    }

    public Person solveJosephus(int m) {
        if (head == null || m <= 0) return null;

        Node current = head;
        Node previous = null;

        while (current.next != head) {
            current = current.next;
        }

        while (current.next != current) { 
            
            for (int i = 1; i < m; i++) {
                previous = current;
                current = current.next;
            }

           previous.next = current.next;
            current = previous.next;
        }

        return current.person; 
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            people.add(new Person("Person" + i, "Phone" + i, "Address" + i, "CPF" + i));
        }

        JosephusProblem jp = new JosephusProblem();
        jp.createList(people);
        int m = 3;

        Person survivor = jp.solveJosephus(m);
        System.out.println("A pessoa sobrevivente é: " + survivor);
    }
}
