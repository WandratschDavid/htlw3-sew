package model;

import java.io.*;
import java.util.*;

public class Phonebook
{
    public List<Person> persons = new LinkedList<Person>();

    String fileName = "D:\\Schuljahr 2020_21\\SEW\\Exercises\\csvAdressbuch\\src\\Phonebook.csv";


    public Phonebook()
    {
        addPerson("Franz Ferdinand", "Wels 4600", "+43 676 71954173");
        addPerson("Petra Maier", "Vöcklabruck 4840", "+43 660 19165080");
        addPerson("Fritz Mitterhuber", "Pasching 4061", "+43 650 81910258");
        addPerson("Susanne Huber", "Attersee 4864", "+43 676 49843183");
        addPerson("Alex Baumberger", "Linz 4020", "+43 660 64163818");

        sortList();
    }

    public void loadCSV()
    {
        try (BufferedReader bR = new BufferedReader(new FileReader(fileName)))
        {
            persons.clear();

            String line;
            String splitBy = ";";

            while ((line = bR.readLine()) != null)
            {
                String[] fileInput = line.split(splitBy);

                addPerson(fileInput[0], fileInput[1], fileInput[2]);
            }
        }
        catch (IOException ioE)
        {
            ioE.printStackTrace();
        }
    }

    public void saveCSV()
    {
        try (BufferedWriter bW = new BufferedWriter(new FileWriter(fileName)))
        {
            bW.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public Person getPerson(int indexOfPerson)
    {
        return persons.get(indexOfPerson - 1);
    }

    public void addPerson(String name, String address, String phoneNum)
    {
        Person person = new Person();

        person.setName(name);
        person.setAddress(address);
        person.setPhoneNum(phoneNum);

        persons.add(person);
    }

    public void deletePerson(int index)
    {
        persons.remove(index - 1);
    }

    public void editPerson(String name, String address, String phoneNum, int index)
    {
        persons.get(index - 1).setName(name);
        persons.get(index - 1).setAddress(address);
        persons.get(index - 1).setPhoneNum(phoneNum);
    }

    public void sortList()
    {
        Comparator<Person> personNameComparator = new Comparator<Person>()
        {
            @Override
            public int compare(Person person1, Person person2)
            {
                return person1.getName().compareTo(person2.getName());
            }
        };

        persons.sort(personNameComparator);
    }

    public int getSize() {return persons.size();}
}