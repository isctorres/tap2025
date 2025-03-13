package com.example.tap2025.componentes;

import java.util.Random;

public class Hilo extends Thread{

    public Hilo(String nombre){
        super(nombre);
    }

    @Override
    public void run() {
        super.run();
        for (int i = 1; i <= 10 ; i++) {
            try {
                sleep((long)(Math.random()*3000));
            } catch (InterruptedException e) {
            }
            System.out.println("El corredor "+ this.getName() + "llegó al KM "+i);
        }
    }
}
