 VARIABLES
        a[5], b[5], resultat[5]: enters
        i: enter

INICI
        // Llegir l'array a
        PER i DES DE 0 FINS 4 FER
            ESCRIURE "Introdueix a[", i, "]: "
            LLEGIR a[i]
        FI PER

Llegir l'array b
        PER i DES DE 0 FINS 4 FER
            ESCRIURE "Introdueix b[", i, "]: "
            LLEGIR b[i]
        FI PER
        PER i DES DE 0 FINS 4 FER
            resultat[i] <- a[i] + b[i]
        FI PER
ESCRIURE "a: "
        PER i DES DE 0 FINS 4 FER
            ESCRIURE a[i]
        FI PER

ESCRIURE "b: "
        PER i DES DE 0 FINS 4 FER
            ESCRIURE b[i]
        FI PER

ESCRIURE "resultat: "
        PER i DES DE 0 FINS 4 FER
            ESCRIURE resultat[i]
        FI PER
    FI