/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan32.daftarfilm;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menampilkan daftar film.
 */
public class Film {
    String filmName;
    String filmGenre;
    Double filmRating;
    int filmDuration;
    
    void nowPlaying() {
        System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println();
        System.out.println("Judul Film : Venom");
        System.out.println("Genre Film : Action, Horror, Scifi");
        System.out.println("Rating FIlm: 8.5");
        System.out.println("Duration Film : 120 Menit");
        System.out.println();
        System.out.println("Judul Film : Small Foot");
        System.out.println("Genre Film : Animation");
        System.out.println("Rating FIlm: 9.0");
        System.out.println("Duration Film : 96 Menit");
        System.out.println();
        System.out.println("Judul Film : Crazy Rich Asian");
        System.out.println("Genre Film : Comedy");
        System.out.println("Rating FIlm: 7.8");
        System.out.println("Duration Film : 119 Menit");
        System.out.println();
        System.out.println("Judul Film : Asih");
        System.out.println("Genre Film : Horror");
        System.out.println("Rating FIlm: 6.0");
        System.out.println("Duration Film : 100 Menit");
        System.out.println();
    }
}
