package main.java.in.aurosoft;

public class App {

	public static void main(String[] args) {
        CRUDOperations crudOperations = new CRUDOperations();
        crudOperations.insertEntity();
        crudOperations.findEntity();
        crudOperations.updateEntity();
        //crudOperations.removeEntity();
    }
}
