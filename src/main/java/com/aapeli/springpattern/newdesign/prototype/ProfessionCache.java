package com.aapeli.springpattern.newdesign.prototype;

import javax.print.Doc;
import java.util.Hashtable;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 4:16 PM
 * @project IntelliJ IDEA
 */
public class ProfessionCache {
    private static Hashtable<Integer, Profession> professionMap = new Hashtable<>();

    public static Profession getCloneNewProfession(int id) {
        Profession cachedProfessionInstance = professionMap.get(id);
        return (Profession) cachedProfessionInstance.cloningMethod();
    }

    public static void loadProfession() {
        Doctor doctor = new Doctor();
        doctor.id = 1;
        professionMap.put(doctor.id, doctor);
        Engineer engineer = new Engineer();
        engineer.id = 2;
        professionMap.put(engineer.id, engineer);
    }
}
