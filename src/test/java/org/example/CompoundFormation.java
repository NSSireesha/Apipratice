package org.example;
import  java.util.Scanner;

public class CompoundFormation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read atomic masses of atoms A, B, C, D, and X
        int atomicMassA = scanner.nextInt();
        int atomicMassB = scanner.nextInt();
        int atomicMassC = scanner.nextInt() * 2; // Diatomic
        int atomicMassD = scanner.nextInt() * 2; // Diatomic
        int atomicMassX = scanner.nextInt();

        // Calculate the maximum number of molecules
        int maxMolecules = getMaxMolecules(atomicMassX, atomicMassA, atomicMassB, atomicMassC, atomicMassD);

        // Output the result
        System.out.println(maxMolecules);
    }

    public static int getMaxMolecules(int atomicMassX, int atomicMassA, int atomicMassB, int atomicMassC, int atomicMassD) {
        // Calculate the maximum number of molecules based on the atomic masses
        int maxMoleculesA = atomicMassX / atomicMassA;
        int maxMoleculesB = atomicMassX / atomicMassB;
        int maxMoleculesC = atomicMassX / atomicMassC;
        int maxMoleculesD = atomicMassX / atomicMassD;

        // Find the minimum of these values since we cannot break down the molecules
        return Math.min(maxMoleculesA, Math.min(maxMoleculesB, Math.min(maxMoleculesC, maxMoleculesD)));
    }
}
