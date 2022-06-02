package com.bl.bird_scentury;

public class Main {
    public static void main(String[] args){
        UserInterface userInterface = new UserInterface();
        userInterface.showMainMenu();
        Main mainClass = new Main();
        mainClass.handleUserSelection(userInterface.showMainMenu());
    }

    void handleUserSelection(int choice) {

        switch (choice) {
            case 1:
                addBird();

        }
    }

    void addBird(){
        BirdRepository birdRepository = new BirdRepository();

        Duck duck = new Duck();
        duck.name = "Duck";
        duck.id = "D001";
        duck.age = 4;
        duck.colour = "White";

        Parrot parrot = new Parrot();
        parrot.name = "Parrot";
        parrot.id = "PA001";
        parrot.age = 2;
        parrot.colour = "Green";

        Peacock peacock = new Peacock();
        peacock.name = "Peacock";
        peacock.id = "PE001";
        peacock.age = 4;
        peacock.colour = "Blue";

        Penguin penguin = new Penguin();
        penguin.name = "Penguin";
        peacock.id = "PN001";
        peacock.age = 5;
        peacock.colour = "Black and white";

        Ostrich ostrich = new Ostrich();
        ostrich.name = "Ostrich";
        ostrich.id = "O001";
        ostrich.age = 4;
        ostrich.colour = "Brown";

        birdRepository.add(duck);
        birdRepository.add(parrot);
        birdRepository.add(penguin);
        birdRepository.add(peacock);
        birdRepository.add(ostrich);
    }
}