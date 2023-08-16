package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheese;

    private boolean extraToppings;

    private boolean paperBag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price = 300;
            bill = "Base Price Of The Pizza: 300 \n";
        }else{
            price = 400;
            bill = "Base Price Of The Pizza: 400 \n";
        }
        extraCheese = false;
        extraToppings = false;
        paperBag = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese){
            price += 80;
            bill += "Extra Cheese Added: 80 \n";
            extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppings){
            if(isVeg){
                price += 70;
                bill += "Extra Toppings Added: 70 \n";
            }else{
                price += 120;
                bill += "Extra Toppings Added: 120 \n";
            }
            extraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperBag){
            price += 20;
            bill += "Paperbag Added: 20 \n";
            paperBag = true;
        }

    }

    public String getBill(){
        // your code goes here
        bill += "Total Price: "+ price +"\n";
        return this.bill;
    }
}
