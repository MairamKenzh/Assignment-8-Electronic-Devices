package org.example.demo1;

public class Laptop extends Device {
    private final int ramSize; // in GB
    private final String processorType;

    public Laptop(String name, double price, double weight, int ramSize, String processorType) {
        super(name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public int getRamSize() {
        return ramSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    @Override
    public String toString() {
        return "Laptop - " + super.toString() + ", RAM: " + ramSize + "GB, Processor: " + processorType;
    }
}
