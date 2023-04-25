package com.github.tecuilacat.softwaretechnik.zusammenfassung.b_simplefactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        Dokument gutschrift = SimpleFactory.createDokument(DokumentType.GUTSCHRIFT);
        Dokument lieferschein = SimpleFactory.createDokument(DokumentType.LIEFERSCHEIN);
        Dokument rechnung = SimpleFactory.createDokument(DokumentType.RECHNUNG);

        System.out.println(gutschrift instanceof Gutschrift);
        System.out.println(lieferschein instanceof Lieferschein);
        System.out.println(rechnung instanceof Rechnung);

        System.out.println(" ");

        System.out.println(gutschrift instanceof Lieferschein);
        System.out.println(lieferschein instanceof Rechnung);
        System.out.println(rechnung instanceof Gutschrift);
    }

}
