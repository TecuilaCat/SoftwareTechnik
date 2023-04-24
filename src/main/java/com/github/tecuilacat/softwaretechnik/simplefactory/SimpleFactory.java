package com.github.tecuilacat.softwaretechnik.simplefactory;

public class SimpleFactory {

    public static Dokument createDokument(DokumentType type) {
        return switch (type) {
            case GUTSCHRIFT -> new Gutschrift();
            case LIEFERSCHEIN -> new Lieferschein();
            case RECHNUNG -> new Rechnung();
        };
    }

}
