/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;


/**
 *
 * @author chanb
 */
public class CarbonFootprint extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        }
    public static void calculateFood(){
        Scanner input = new Scanner (System.in);
        String food;
        double quantity;
        double carbonOutput;
        System.out.print("Enter the kind of food that you ate : ");
        food = input.nextLine();
        food = food.toLowerCase();
        System.out.println(food);
        System.out.print("Enter the quantity you ate in kilograms: ");
        quantity = input.nextDouble();
        if (food.equals("lamb"))
        {
          carbonOutput = 39.2 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("beef"))
        {
          carbonOutput = 27 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("cheese"))
        {
          carbonOutput = 13.5 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("pork"))
        {
          carbonOutput = 12.1 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("turkey"))
        {
          carbonOutput = 10.9 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("chicken"))
        {
          carbonOutput = 6.9 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("tuna"))
        {
          carbonOutput = 6.1 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("eggs") || food.equals("egg"))
        {
          carbonOutput = 4.8 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("potatoes") || food.equals("potato"))
        {
          carbonOutput = 2.9 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("rice"))
        {
          carbonOutput = 2.7 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("nuts"))
        {
          carbonOutput = 2.3 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("beans") || food.equals("bean") || food.equals("tofu"))
        {
          carbonOutput = 2 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("vegetables") || food.equals("vegetable"))
        {
          carbonOutput = 2 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("milk"))
        {
          carbonOutput = 1.9 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("fruit"))
        {
          carbonOutput = 1.1 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
        if (food.equals("lentil") || food.equals("lentils"))
        {
          carbonOutput = 0.9 * quantity;
          System.out.println("Your carbon footprint is " + carbonOutput + " kilos.");
        }
    }
    
}
    
