package com.company.factorydesignpattern;

interface Currency{

    String getSymbol();
}


class Ruppes implements  Currency {

    @Override
    public String getSymbol() {
        return "Rs.";
    }
}

class SGDoller implements  Currency {

    @Override
    public String getSymbol() {
        return "SGD";
    }
}


class USDoller implements  Currency {

    @Override
    public String getSymbol() {
        return "SGD";
    }
}

class CurrencyFactory{

    public static Currency  createCurrency(String currency){

        if(currency.equalsIgnoreCase("india")){
                return  new Ruppes();
        }else if(currency.equalsIgnoreCase("singapur")){
            return  new SGDoller();
        }else if(currency.equalsIgnoreCase("us")){
            return  new USDoller();
        }
        throw  new IllegalArgumentException();
    }

}

public class CurrencyDemo {
    public static void main(String[] args) {
        String test="abcd";
        char a[] = test.toCharArray();

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            System.out.println(test.charAt(i));
        }

        Thread t1 = (new Thread() {
            @Override
            public void run() {
                System.out.println("gello");
            }
        });

        t1.start();

        String curr = args[0];
        Currency currency = CurrencyFactory.createCurrency(curr);
        currency.getSymbol();
    }
}
