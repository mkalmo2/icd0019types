Andmetüübid

1. Kloonige projekt aadressilt https://github.com/mkalmo2/icd0019types

   Kopeerige kataloog src/types enda reposse (icd0019) kataloogi src.
   Kopeerige fail pmd-rules.xml enda repo juurkataloogi.   
    
   Veenduge, et kood kompileerub.
    
     Kui valite Idea-s Build menüüst -> Rebuild project peaks tulema teade 
     "Compilation completed successfully ..."
 
2. Avage klass Order.java ja arvake, mida see kood väljastab.
   Kontrollimiseks käivitage main() meetod.
   
3. Avage klass Overload.java. Kirjutage main() meetodisse väljakutsed 
   kõigi kolme meetodi käivitamiseks.
   
   Kontrollige tulemust käivitades main() meetodi.
   
4. Avage klass StackTrace.java. Käivitage main() meetod.
   Leidke programmi väljundi abil rida, mis vea tekitas.
   
5. Kirjutage faili Code.java sum() meetodi sisu. Meetod võtab sisendina 
   täisarvude massiivi (array) ja tagastab elementide summa.
   
   nt. ```sum(new int[] {1, 2, 3});``` tagastab 6
   
6. Kirjutage faili Code.java average() meetodi sisu. Meetod võtab sisendina 
   täisarvude massiivi ja tagastab elementide keskmise väärtuse.
   
   nt. ```average(new int[] {1, 2});``` tagastab 1.5

7. Kirjutage faili Code.java meetodi minimumElement() sisu. Meetod võtab 
   sisendina täisarvude massiivi ja tagastab väiksema elemendi. Kui massiiv 
   on tühi, tagastatakse null.
   
   ```minimumElement(new int[] {1, 2});``` tagastab 1
   
   ```minimumElement(new int[] {});``` tagastab null-i

8. Kirjtage faili Code.java meetodi asString() sisu.
   Meetod võtab argumentideks massiivi ja tagastab massiivi sisu kujutava sõne.
   Elemendid on eraldatud koma ja tühikuga.
   
   ```asString(new int[] { 1, 3, -2, 9 })``` tagastab "1, 3, -2, 9"

   Sõnele saab liita teisi sõnesid, int-e ja char-e operaatoriga +.

   Ilus ei ole teha asju ülearu ja seda pärast parandama hakata. 
   Nt. teha string "1, 2, " ja siis lõpust ", " eemaldada.   

9. Mood on statistika mõiste ja tähendab kõige sagedamini esinevat väärtust.

   Kirjutage faili Code.java mode() meetodi sisu.

   Meetodi argumendiks on sõne ja meetod tagastab kõige enam esineva sümboli.
   Tühja sõne puhul tagastab meetod väärtuse null.
   Kui on kaks või rohkem enim esinevat sümbolit, siis pole oluline, 
   milline neist tagastada.
   
   Näiteks:
   
     sõne "abcb" mood on 'b'
     sõne "abccbc" mood on 'c'
     sõne "abcacbaca" mood on 'a'
     sõne "" mood on null
     sõne "ab" mood on 'a'

10. Kirjutage faili Code.java squareDigits() meetodi sisu.

    squareDigits() võtab sõne tüüpi argumendi, otsib sealt seest üles 
    numbrid, võtab need ruutu ja tagastab muudetud sõne.
   
    ```squareDigits("2")``` on "4"
    
    ```squareDigits("a2b")``` on "a4b"
    
    ```squareDigits("a22b")``` on "a44b"
    
    ```squareDigits("a9b2")``` on "a81b4"
    
    Sõnest saate sümbolite massiivi "mingi sõne".toCharArray().
    
    ```Character.isDigit(c)``` ütleb kas Character tüüpi muutuja on number.
    
    ```Character.toString(c)``` teeb Character tüüpi muutuja sõneks.
    
    ```Integer.parseInt(s)``` teisendab sõne Integer-iks (kui sõne on number).
    
    Sõnele saab liita teisi sõnesid, Integer-e ja Character-e operaatoriga +.
    
    ```"abc" + 'd'``` annab "abcd"
    
    ```"abc" + 1``` annab "abc1"

11. Veenduge, et saate aru nimeruumi mõttest ja sellest, kuidas erinevates 
    nimeruumides paiknevatele klassidele viidata.
    
    Klassis namespace.Main on näide erinevate juhtude kohta.
    
    Pöörake tähelepanu võtmesõnade "package" ja "import" kasutamisele. 
    Veenduge, et saate aru nende tähendusest.    

12. Paigaldage ja seadistage Idea stiilikontrolli pistikprogramm (PMD).

    Settings -> Plugins -> Marketplace
    
    Trükkige PMD ja vajutage "Install".

    Reeglid on failis pmd-rules.xml
    
    Settings -> PMD -> + ja lisage reeglite fail (pmd-rules.xml).

13. Klassis types.Pmd on halva koodi näited, mis ei vasta muuhulgas Pmd
    reeglitele. Proovige aru saada, mis Pmd-le ei meeldi ja kuidas seda 
    parandada.
    
    Muutke koodi nii, et käitumine jääks samaks aga kood vastaks Pmd 
    reeglitele.

14. Failis Code.java on meetod isIsolated(row, col), milles 
    küsitakse kahemõõtmeline maatriks ja trükitakse see välja. Väljatrükkimise
    asemel vastake, kas antud positsioonil ei ole ühtegi true väärtusega naabrit.

    Igal ruudul on kuni 8 naabrit (äärtes vähem).

    Näiteks:
    
      0NNN0  
      0NXN0  
      0NNN0  
      00000  
        
    X-il on märgitud N-tähega 8 naabrit.

    Ruudu (row; col) naabrite kontrollimiseks peate kontrollima ruute:
    
    (row - 1; col-1)  
    (row - 1; col)  
    (row - 1; col+1)  
    (row; col - 1)  
    jne.

    Kui ruut asub nurgas nt. (0; 0), siis row - 1 ei ole lubatud indeks ja seda 
    kontrollida ei saa. See tähendab ka seda, et seal naabrit ei saa olla.
    
    Oodatud tulemus on kaks sellist ruutu: (row=0; col=9) (ülemine nurk)
    ja (row=5; col=7).

15. Meetod isolatedSquareCount() peaks lugema kokku kui palju on eelmises 
    ülesandes kirjeldatud ruute.    
   
16. Commit-ige muudatused ja push-ige need Github'i. 
    
    Lisage commit-ile tag ex02.
    
    Veenduge tulemuste lehelt, et tulemus on positiivne.

Ülesannete seletused (1-13): https://youtu.be/x5PR_4z4rF8
