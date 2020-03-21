# Biblioteka



Interdyscyplinarne Centrum Modelowania Komputerowego
Wydział Matematyczno – Przyrodniczy
Uniwersytet Rzeszowski


### Przedmiot: 
Programowanie zespołowe




### Dokumentacja projektu: 

Biblioteka




### Wykonał: 

Tymoteusz Wołkanowski

Norbert Świder

Damian Banuch

Pavlo Labuda

Kamil Fryc





### Prowadzący: 

dr inż. Marcin Ochab

Rzeszów 2020





## Specyfikacja projektu


### Temat i zakres projektu / systemu
#### Temat projektu
Główny temat projektu to  biblioteka dzięki której będzie możliwe wypożyczenie książki na dowolny okres czasu.  Jego nazwa to „Biblioteka”. Będzie można założyć konto użytkownika oraz zwrócić wypożyczoną książkę.
#### Zakres projektu
Projekt obejmuje wykonanie aplikacji  desktopowej poświęconej bibliotece za pomocą języka Java w której skład będą wchodzić interfejs graficzny użytkownika wykonany  za pomocą technologii JavaFX oraz moduł odpowiedzialny za mechanikę aplikacji wykonany za pomocą elementów języka Java.  Projekt obejmuje r ównież  wykonanie bazy danych wypożyczalni książek. Elementem łączącym te dwa moduły jest wysłanie poprzez formularze dostępne na stronie internetowej danych do bazy dzięki językowi Java z elementami SQL. 
#### Funkcjonalności
a)	Formularz, który użytkownik wypełnia aby wypożyczyć dowolną książkę z bazy danych

b)	Formularz który użytkownik wypełnia aby dodać swoje konto do bazy danych

c)	Logowanie

d)	Strona startowa aplikacji 

e)	Formularz, który użytkownik wypełnia aby zwrócić wypożyczoną  książkę

f)	Baza danych wypożyczalni książek

g)	Zapisywanie procesu zakładania kont, wypożyczenia książki oraz zwrotu książko do odpowiednich  plików tekstowych (raporty)


#### Wymagania stawiane aplikacji / systemowi
•	System powinien współpracować z bazą danych

•	Interfejs przyjazny użytkownikowi

•	Mobilność / Responsywność

•	Prostota wizualna

•	Łatwość dostępu do aplikacji

•	Czytelność




#### Panele / zakładki systemu, które będą oferowały potrzebne funkcjonalności

##### •	Formularz dzięki któremu będzie można zwrócić książkę

Dzięki temu formularzowi użytkownik będzie mógł zwrócić wypożyczoną przez siebie książkę. Aby to uczynić należy wypełnić formularz podając swój login oraz wypożyczoną przez siebie książkę.



##### •	Formularz dodający konto do bazy

Ta funkcjonalność będzie oferowała możliwość dodania potencjalnemu klientowi swojego konta do bazy danych. Będzie to formularz który będzie składał się pól tekstowych takich jak: imię, nazwisko, login, hasło i numer telefonu. 


##### •	Formularz dodający wypożyczenie do bazy

Dzięki tej funkcjonalności będzie możliwość wypożyczenia książki z bazy danych przez potencjalnego klienta który będzie chciał ją wypożyczyć. Będzie to formularz składający się z pola tekstowego „Podaj swój login”, z listy dzięki której będzie można wybrać książkę, która jest dostępna w bazie, oraz pól typu „data” – data wypożyczenia , data zwrotu.

##### •	Baza danych „Wypożyczalnia książek”

Ten panel projektu będzie zawierał bazę danych o nazwie „Biblioteka” składającą się z tabel: Klienci, Książki, Wypożyczenia. Tabela Książki będzie wyświetlana na stronie internetowej projektu, dzięki której potencjalny klient może np. zobaczyć jaką książkę może wypożyczyć. Będzie administrowana przez bibliotekarza.

##### •	Logowanie 

Dzięki tej funkcjonalności będzie możliwość zalogowania się. Aby jednak to zrobić trzeba mieć wcześniej założone konto użytkownika. W celu zalogowania trzeba wypełnić formularz podając login oraz hasło. Ta funkcjonalność będzie obsługiwana zarówno przez bibliotekarza jak i użytkownika.


##### •	Zapisywanie procesu zakładania kont, wypożyczenia książki oraz zwrotu książko do odpowiednich  plików tekstowych (generowanie raportów)

Każdy proces zakładania konta przez potencjalnego użytkownika, każdy  proces wypożyczenia książki oraz każdy proces zwrotu książki jest także zapisywany do odpowiednich plików tekstowych. Są to odpowiednio: uzytkownicy, wypozyczenia, zwroty. Generowaniem raportów będzie zajmował się bibliotekarz. Te raporty będą do wglądu dla administracji systemu.


#### Użytkownicy aplikacji i ich uprawnienia
##### •	Bibliotekarz  (Administrator)

Dodawanie rekordów do bazy danych 

Usuwanie rekordów z bazy danych

Aktualizacja rekordów bazy danych 

Przeglądanie zawartości aplikacji desktopowej

Zmienianie zawartości aplikacji desktopowej

Generowanie raportów


##### •	Użytkownik 

 Dodanie swojego konta do bazy danych 

Dokonanie swojego wypożyczenia książki do bazy danych

Przeglądanie zawartości aplikacji desktopowej

Zwrot wypożyczonej książki


#### Klienci aplikacji/systemu

Potencjalnymi odbiorcami aplikacji będą głównie klienci którzy będą mogli wypożyczyć książkę z bazy na określony okres czasu oraz ludzie którzy  zajmują się tematyką odnośnie książek czy biblioteki tacy jak np. czytelnicy, pisarze, aktorzy oraz ludzie którzy mają powiązania z książkami. Z aplikacji będą mogli korzystać także zwykli użytkownicy. Ta aplikacja będzie napisana językiem umożliwiająca zrozumienie zawartych na niej treści dla zwykłych użytkowników.

#### Wymagania funkcjonalne 

•	Możliwość dodania poprzez formularz  swojego konta użytkownika do systemu przez potencjalnego klienta 

•	Możliwość  logowania się poprzez formularz przez użytkownika jeśli posiada on konto w systemie 

•	Wypożyczenie dowolnej, dostępnej w bazie książki za pomocą formularza przez zalogowanego użytkownika na dowolny okres czasu

•	Zwrot wypożyczonej przez zalogowanego użytkownika książki  wypełniając formularz

•	Generowanie raportów czyli  zapisywanie procesu zakładania kont, wypożyczenia książki oraz zwrotu książki do odpowiednich  plików tekstowych

•	W przypadku niepoprawnego wypełnienia formularza wyświetlenie odpowiednich komunikatów 

•	Wyświetlenie możliwych do wypożyczenia książek w systemie za pomocą tabeli

•	Możliwość dokonywania zmian w systemie przez bibliotekarza (administratora)

•	Utworzenie bazy danych – Biblioteka – składającej się z trzech tabel: Klienci, Książki, Wypozyczenia

 
#### Wymagania niefunkcjonalne 

##### •	Posiadanie środowiska NetBeans IDE  w wersji 8.2 lub wyżej obsługujących maszynę wirtualną Java

Wymagania: 

- Procesor - 800MHz Intel Pentium III lub odpowiedni.

- Pamięć - 512 MB (system Windows i Ubuntu)/ 2GB (Macintosh OS X).

- Pojemność dysku – 750 MB (system Windows)/650MB (Ubuntu i Macintosh OX X) 

- Dowolny system operacyjny – Windows 7 lub wyżej/ Ubuntu 9.10/Macintosh OX X


##### •	Posiadanie oprogramowania Java w wersji 8

  Wymagania: 
  
- Procesor – Intel Pentium 2 266 MHz.

- Pamięć –  128 MB 

- Pojemność dysku – 124 MB  

- Dowolny system operacyjny – Windows Vista lub wyżej/ Oracle Linux 5.5+ lub Ubuntu 12.04 lub Red Hat Enterprise Linux 5.5+ lub Suse Linux Enterprise Server 10 SP2+, 11.x/Macintosh OX X 10.8.3+, 10.9+

##### •	XAMPP 7.3.11 (lub odpowiedni)

Wymagania: 

- RAM - 256MB

- Miejsce na dysku - 145MB

- System operacyjny – MAC OS X, Windows, Linux


##### •	Przeglądarka

Wymagania:

- Procesor - Intel Pentium 4 lub lepszy

- RAM - 2 GB

- System operacyjny – MAC OS X, Windows, Linux


 

##### •	Rozmiar

- Przestrzeń dyskowa – od 500 do 1500 KB

- pamięć RAM – od 512 MB do 2 GB 

##### •	Szybkość 

- Czas reakcji na zdarzenie wywołane przez użytkownika –  od <1 do 1 sekund

- Liczba przetworzonych transakcji na sekundę – od 1 do 3 sekund

 - Aplikacja uruchamia się w ciągu – od 1 do 6 sekund
 
##### •	Niezawodność 

- Średni czas bez awarii – aplikacja może generować błędy wtedy jeśli nie uruchomiono programu XAMPP lub odpowiedni

- Dostępność – aplikacja jest dostępna cały czas

- Częstość błędów – aplikacja może generować błędy wtedy jeśli nie uruchomiono programu XAMPP lub odpowiedni

##### •	Solidność 

- Czas uruchomienia po awarii – od 1 do 6 sekund

- Zdarzenia powodujące awarię – nie uruchomiono programu XAMPP lub odpowiedni

- Prawdopodobieństwo zniszczenia danych po awarii – brak możliwości zniszczenia danych po awarii



##### •	Łatwość użycia

- Czas szkolenia – od 2 do 5 min  aplikacja łatwa z użytkowaniu, posiada  podpisane przyciski oraz omówione pola formularza ponadto okna są odpowiednio podpisane

- Liczba stron dokumentacji/Liczba okien pomocy – od 20 do 30 stron

##### •	Przenośność 

- Liczba docelowych systemów – 3 ( Windows Vista lub wyżej/ Oracle Linux 5.5+ lub Ubuntu 12.04 lub Red Hat Enterprise Linux 5.5+ lub Suse Linux Enterprise Server 10 SP2+, 11.x/Macintosh OX X 10.8.3+, 10.9+)

- Procent kodu zależnego od platformy docelowej – 0%

- Koszt przeniesienia na nową platformę – 0%

##### •	Ustawa o ochronie danych osobowych z 10 maja 2018

##### •	Ustawa o prawie autorskim i prawach pokrewnych z dnia 4 lutego 1994 r.



 








## Wykorzystane technologie


#### •	Java

Współbieżny, oparty na klasach, obiektowy język programowania ogólnego zastosowania. Został stworzony przez firmę Sun Microsystems. Java jest językiem tworzenia programów źródłowych kompilowanych do kodu bajtowego, czyli postaci wykonywanej przez maszynę wirtualną. Język cechuje się silnym typowaniem. Jego podstawowe własnościami są maszyna wirtualna, zarządzanie pamięcią oraz duża część składni i słów kluczowych. Za jego pomocą będzie wykonana mechanika aplikacji desktopowej.



#### •	JavaFX

Rodzina technologii i produktów firmy Sun Microsystems, przeznaczonych głównie do tworzenia Rich Internet Application (aplikacji internetowych, oferujących bogaty, dynamiczny, jednoekranowy interfejs). W skład JavaFX wchodzi język skryptowy JavaFX Script oraz system dla urządzeń mobilnych Java ME. JavaFX pozwala tworzyć aplikacje, które wyglądają bardziej nowocześnie, są równie wydajne, a przy tym można zachować dużo większą czytelność kodu. Za jego pomocą będzie wykonany graficzny interfejs użytkownika.


#### •	SQL (Structured Query Language)

Strukturalny język zapytań używany do tworzenia, modyfikowania baz danych oraz do umieszczania i pobierania danych z baz danych. Język ten charakteryzuje się bardzo dużą popularnością. Co więcej jest on interpretowany przez wiele systemów baz danych takich jak: DB2, MySQL czy też Microsoft SQL Server. Jego zadaniem jest wysyłanie zapytań tzw. query do określonej bazy oraz dostarczeniu użytkownikowi wyników w postaci danych. Dzięki tej technologii będzie wykonana cała struktura bazy danych czyli tworzenie tabel, wyświetlanie zawartości tabel  w aplikacji, dodanie konta użytkownika do bazy, dodanie wypożyczenia do bazy.

#### •	JIRA

Zamknięte oprogramowanie firmy Atlassian służące do śledzenia błędów oraz zarządzania projektami. JIRA jest wykorzystywana w wielu projektach.

#### • Scene Builder

JavaFX Scene Builder. Narzędzie do projektowania wizualnego dla aplikacji JavaFX. JavaFX Scene Builder to wizualne narzędzie, które pozwala użytkownikom szybko projektować interfejsy użytkownika aplikacji JavaFX, bez kodowania.








## Graficzne przedstawienie funkcjonalności systemu


#### Diagram przypadków  użycia 


![tekst alternatywny](https://lh3.googleusercontent.com/p7zvkVFUgsixa6ykRGqSe21IG1aB8dwlHwOfj8wUayL70YznM6ALzUVMC1HQBxMUbTpytzGOKroC8utlKDy3aIHq5j4-gDRW9JSE1omtUizyxVeC8fQ32hOClCOR5PEYaOHANCm2FKR2sKrnVyjgvaK8Sjas7Emqvh0nDaU_XvR3Apx0PcTK7MD-oztRZn3TIa79OlVJHXWbImsHAHWq5OrdUJqL7VIVz_uIPtMY2b2bGdNRAbgZ8N1ZSuWgUbb04g9JmI-jJo5VBRi01kJJhbkjIkwYCALUbu0OlEwRhonOm8xCMDaPXTE43h04UqCB-C0igZitMRNkMvAVaC8HI07DL4FPyMh4nV4JNoyHWL6iP9GucvH5RO8dynVr8UFUkhVHwwwUIMImC0B99StrL4p4aMrhNrPNIUykCnSfbtVVeMkqVw02Xdl32jbQnU9GFn7nAmHn7pOhoSv-bRdq8bVz91gnPPiBHH15rN_kjVslU2HpRpHdTW3Pa8lD8P8fVkF_eTQ4IZVT_JvWugZUyDjpblt06Sc-m3JmN5Sty0g6Mu2fxGAVi5oDge9KDq2URyJVEIKamrTEGS76UooagPzUMgJ9_B9DjsfP4whAl02NJghDIq1X_xKz2PU-k_d5RS0YsV0y79WP17UrEX6xnkuX7qJB68WT4CK0M-p3TnunGHl-VnRie9vqaeU=w655-h400-no)


System nosi nazwę Biblioteka. Jest to aplikacja dzięki której można wypożyczyć książkę. Aktorami w tym systemie są: bibliotekarz czyli osoba zarządzająca biblioteką, użytkownik czyli osoba która założyła konto. W skład tego systemu wchodzą następujące przypadki użycia:
-rejestracja użytkownika – umożliwia założenie konta przez potencjalnego użytkownika. Może to uczynić użytkownik oraz bibliotekarz
- dodanie książki do bazy – dodać książkę do bazy może bibliotekarz
- zwrot książki – umożliwia zwrócenie wypożyczonej przez użytkownika  książki.
- wypożyczenie książki – umożliwia wypożyczenie przez użytkownika książki.
- wyświetlenie możliwych książek do wypożyczenia -  wyświetla użytkownikowi możliwe do wypożyczenia książki
- wyświetlenie gatunków literackich – może to zrobić użytkownik


#### Diagram klas



![tekst alternatywny](https://lh3.googleusercontent.com/7tj-Wf6qQuC3dI6n0mFN-6prWjmV406-3F9V388WmDiKYiBKMtNq1NJXPey4vDKrcIDBtnoh7RXCxBlLKZTPaRDeNAMQniKicG-r97HD4BQh-Y4OoBOaTDc3Wvpy4oCv9Vksha05HfPmUOaHbj3Vy8Wpi8mrL2u-SeTXFYF378OjrXuHiTna349O56qVzlOuh7x6R-oKWqQHs-fNBaw0Gms3SO80rkTFRmHJRnK6Z4m7623ISeSjNH6cYhiuoeZlP6204u61zs67E0o-gjCPC8eALLdUq4o1MlkI0uF_eLjirdiQAtXMGy6KHYe38B0SrpYZ_vokCa16udjutsArOa4cFPSmPE2b0FxmoGudVrmRC1db5GYW2aD68Jr9nN0-vj6z_BswQBKlgw9S2KItupfD8YHVWVuwPFPfrZYIsbRF5CREW67kgaWPovosfjeDhfPVkR_t13tDpYfj1WvxETD1abfxQRSTqNQpIsve_NvE7cK8rVEdWJOkJO9H8nean0m7VjeNfravDtfHfHOH3VARVuRGu_74tSQwRydbuHjmOa4WZWRX1kLXKtXjbQHzZHm0SuV-kSyscm-1LPAQehZ94PspVklw48UaskVJlxEbY7L9b54HwSHGFZXUrNhk-39Uv8J1NJglIfTGO1Qms-e8V-qGnt48_R-itPRr0kaA0mcD_XMEeFVSGkU=w734-h373-no)



#### Diagram aktywności

![tekst alternatywny](https://lh3.googleusercontent.com/5kBTuIXcU3O5TUU5c7ZDsaXaqoJg-TZHzJ_6dyb2-qCSlIpYp5qBtzx_cq7hGDSatlfvHoK-SZdkDWXjzkicTFa2DyULxi6GOtvxeoH8dCSqdnl_K92iQIDWmN5BfzQm_qKHQnZO1KhxMRckbfHUgJycsg0cS7W05ANnGeNsGWcojWdkcgQ6hZRFEFI-5panE1Vtu7PDkfq3UPH6TbRIHjUaOKYKetH9MEWxfczeIaEplNa2NpBWEW7VcfbdUa5m1crwrHMI7MSbnUFZnYHLu6JT3Vq8ULQbTjXoOkigSrUo_mLlaDRjEJer4tRUBU6jwP-17m2lUK0Z8SCcXVMv-8A33XZQPwQMjjOEDWJaLl3AP8XCC3VcrZTIlFyW6FgCXrLyGPQBKd_7DRwBChcGld21jPaV3cw95GstQb8K6d79_tMXpqj5KIl2JFo9jFBRctA6RAU7htNJYMgG2yJxEo1pIJoj9VpzM0h20jChM6J2syGJ2SQB4gLXqgPolnYToS6JGZWRT4Wfq-okrvzdQjaK1lanPw_CRZMdTg7EbyK160oaLZYXMmeCftK7TdWgRenOR9HfCaQE0pp9U__tp2MapAswVdjxL3eRPSlcxIYuphfbhnINTqm3ewMlfhD0CgU79P884__QBSzOwE9ifF-ZbHSA3lx8MkylpzqdxO6m4tmbQi6U5Z4WjOE=w688-h543-no)



#### Diagram sekwencji

![tekst alternatywny](https://lh3.googleusercontent.com/Fihn1R0wHRC4qFx1r783f8ErYfLgf9Ivf8Ba6lmn5yrwu9VyIiNGqYOAmcuunco3WY0bIaoqjLA0bqj-HnbB1FR5r5Uj1YksvJdFrnENuHXoqLN8CB-4YS7SJLLz227PxPsYTj944kHaM05WaOX1g78q1lJ6HFNvF469EZvl2kCStbJo-LuFh4iCKfCjHoNisUnE--UjEQWbw12yRnrHh-hQu5WXBAyFcwEa22xR0Y7loE-O_r1hNbzNIOAjUAyS1ihfPHLwxui5y8DYXEeuwdz17vql8ktpz7b6P4JNub4oBU7fdcCX2m9KTKqKhlIB5ln8NtYow3b3KRSpQb3OQbiaYgCzQ-5osRAdXBOb8kFPpMNrHaKkajTaFnodA2BYeOYwSM1W9x8mXmrORBTLoFfZrqt3FgjvJpGsQCNr3FdgEb884c4wiQ7TefbEn1YBncB6ovPTrUF271dz3m2WhMtqBe8jyCEEeP8HTq-HfMiXuPoF2RRXm6f2yz1o59AzCvCWwxPCNrPLB3NcYgviRLODIjykWPpyXBddFyUeVVBrQ22FTzKSIFjV-QlJM-qR-LKYxJEMTSVrr7NYdPku8_dlkaTfO4r2D3biRAA4vFfG-Sa5b390ZIVjzSZYgFRbdj9bMvUZKx3dSjyC1r1LJpvMKFXGkv8zLtX5MdMteWdiZK3B0MptbkHBNAQ=w688-h543-no)
