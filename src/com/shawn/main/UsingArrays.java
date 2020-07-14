package com.shawn.main;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import java.util.Arrays;

public class UsingArrays {
    private int[] intArray = new int[]{1, 2, 3, 4, 5, 6};
    private double[] doubleArray = new double[]{8.4D, 9.3D, 0.2D, 7.9D, 3.4D};
    private int[] filledIntArray = new int[10];
    private int[] intArrayCopy;

    public UsingArrays() {
        this.intArrayCopy = new int[this.intArray.length];
        Arrays.fill(this.filledIntArray, 7);
        Arrays.sort(this.doubleArray);
        System.arraycopy(this.intArray, 0, this.intArrayCopy, 0, this.intArray.length);
    }

    public void printArrays() {
        System.out.print("doubleArray: ");
        double[] var5;
        int var4 = (var5 = this.doubleArray).length;

        int var3;
        for (var3 = 0; var3 < var4; ++var3) {
            double doubleValue = var5[var3];
            System.out.printf("%.1f ", doubleValue);
        }

        System.out.print("\nintArray: ");
        int[] var7;
        var3 = (var7 = this.intArray).length;

        int var2;
        int intValue;
        for (var2 = 0; var2 < var3; ++var2) {
            intValue = var7[var2];
            System.out.printf("%d ", intValue);
        }

        System.out.print("\nfilledIntArray: ");
        var3 = (var7 = this.filledIntArray).length;

        for (var2 = 0; var2 < var3; ++var2) {
            intValue = var7[var2];
            System.out.printf("%d ", intValue);
        }

        System.out.print("\nintArrayCopy: ");
        var3 = (var7 = this.intArrayCopy).length;

        for (var2 = 0; var2 < var3; ++var2) {
            intValue = var7[var2];
            System.out.printf("%d ", intValue);
        }

        System.out.println("\n");
    }

    public int searchForInt(int value) {
        return Arrays.binarySearch(this.intArray, value);
    }

    public void printEquality() {
        boolean b = Arrays.equals(this.intArray, this.intArrayCopy);
        System.out.printf("intArray %s intArrayCopy\n", b ? "==" : "!=");
        b = Arrays.equals(this.intArray, this.filledIntArray);
        System.out.printf("intArray %s filledIntArray\n", b ? "==" : "!=");
    }

    public static void main(String[] args) {
        UsingArrays usingArrays = new UsingArrays();
        usingArrays.printArrays();
        usingArrays.printEquality();
        int location = usingArrays.searchForInt(5);
        if (location >= 0) {
            System.out.printf("Found 5 at element %d in intArray\n", location);
        } else {
            System.out.println("5 not found in intArray");
        }

        location = usingArrays.searchForInt(8763);
        if (location >= 0) {
            System.out.printf("Found 8763 at element %d in intArray\n", location);
        } else {
            System.out.println("8763 not found in intArray");
        }

    }
}
