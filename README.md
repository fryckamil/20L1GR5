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


![tekst alternatywny](https://lh3.googleusercontent.com/zQDAdPP4OLkzUQGT_3l-LUN7-0cI76KEeO1ibr32UOvUHNqOg_zIccURSiBWlSxkbq3JrdXEQm-yplmetgB7eTQHGvMMCTnhYE78dy_sBFYVaAPSM3jwkrctVU_2SMWQFZ3VUs7XeJGBhVumw5nfcMqentSYEBRQEjXNA9sMb3GcbCt4nNSbHnYcnVTCo6hwvHqJoaYmZY_MMCVKE8wRsYuDIL7Yep4YXWHJbYSpFLx91_7xqpqQEJqOVCFcMl0Y36UI-Ggy-KytmSRzLlHJxDl9sG-7scsbT-ZFwIORjWgAu2Xd1IlD62OJ6GFiaQzCTCXVAxuOsnU9ssuAi_0FaZu2JzDFjILV4pHa8SvE8vKKnC8NKuRtqHaX2ZQw-th0tCKqpoYM3c1uNLXpd2J3jA0htPXWwyu9QsDJRpBhBydVCQ5sw-ewMdECltl1roT4i-KzOI8ChBbCB_FPTVZ6-nwfvYEIcrk9tls-BH8A6L0SQe8gc-odcASpSvawk4cCdlmrmXDN5G4wiyTsAsmFtADMrgAbUkY1M_D6IYOvIPlBukSPzY1ZPEJszgoFwwSq8ThgSHK0fIeVyWyU4wG4Cmt5lvQ_Ewcc-JKFFgvMgh0ULrYkF74lSJyR9IpaHc77tMP5PBR9EUGlEg_UE5ODx8jMkllEyb7WbVajhNmMuern-0j3d6F8xv5KTjU=w655-h400-no)


System nosi nazwę Biblioteka. Jest to aplikacja dzięki której można wypożyczyć książkę. Aktorami w tym systemie są: bibliotekarz czyli osoba zarządzająca biblioteką, użytkownik czyli osoba która założyła konto. W skład tego systemu wchodzą następujące przypadki użycia:
-rejestracja użytkownika – umożliwia założenie konta przez potencjalnego użytkownika. Może to uczynić użytkownik oraz bibliotekarz
- dodanie książki do bazy – dodać książkę do bazy może bibliotekarz
- zwrot książki – umożliwia zwrócenie wypożyczonej przez użytkownika  książki.
- wypożyczenie książki – umożliwia wypożyczenie przez użytkownika książki.
- wyświetlenie możliwych książek do wypożyczenia -  wyświetla użytkownikowi możliwe do wypożyczenia książki
- wyświetlenie gatunków literackich – może to zrobić użytkownik


#### Diagram klas



![tekst alternatywny](https://lh3.googleusercontent.com/SR1pm1qjDGThkT4-4rwZqxQkU2TpAHEwYdCoqWq2fKhl22xJG5AdnmyR9Cie1vXe6V91UPMwOQf80iaRp-xDfUSIIdIo7CoRMBvV6A-vfjA_mkCgIli-tCMyqJcYfst8dvnqNUFKF6XfJonQX1i4MeMfs7xjed7vy4I3FofVsc4jTFe7a1xCgYLXDJ1CqL-UqIqHkwfHIdXa-9NFXbSLQSHItt_NM5VYAve4fyw9QLHlzc3Nd7QMKZ2D8xxDhiMSd-7IU-esaQmr4ZiF94AWTCprpe_R9OTP1Gjf0l-HIJDwjqgvFweaC87njwJM_1L_UhoGIHCNRBbq_RhnxMkpiDdgouyo4whLgK08TrZ6-ilAd7vlhyCXb4y9YTeMoX1KPyXNTbO8O8Hj7hx8gkVap2nv8TsUMr_8sF1ZTqydDS1e1nONG7ioOHqngCVMMWRt2j5jrfUu3bQp9KahohvqkkrUIA0PdQYdbmAumgk1COrtxhyyUfGpjYP2I9eERK1GsIPsrfLq5_Rb4kSgh5LJ_kh39a9hzPFAo-5L8EWK6uKi03y0bM_zFK03NDoXffVBSb23oFzcwYKZF_Te8FIqc8C3fING2vM5LKMsR0KwQ5m6OtsMlQu6DshMnpdzFzNSixzGKROWZIkU_S5DqMSmJzDa6ALUc6bW5CMou6ST2WjdCm8gS055adFj5kY=w734-h373-no)



#### Diagram aktywności

![tekst alternatywny](https://lh3.googleusercontent.com/VybIH9gIxbC7BWrD-42OdRDkBCGxaPPuEUQwCKqSRX09d3ckfm9IysONLSQzGEqF6TgO72LWhoaZse5MK7y9zEr4qU_5Gbgrn5TQQBrO4yBX4F8v22UrEh45G8Z49A-JrfyG-ZtW8xoUZXwua-3lWhl-v_XeRwxFT_gqAy273VktXGoaTt6nflBzlWOZwPSIaJL_EdQ2pczqRygk06rsX9QYHVBNZCq7b_98s_vCDyMisl8C0ShYBL1XGYoD3-PwDGiukYywpdstOYsjNJAG-Rt8XN9f8ELD0SN5fR0ytOC-tBhn7MI05KLmkefmA5a6NJ9lXUZqu6ueQXTcdPuc6d6z4kK0ZMVxX9Jgu46RIyGQr_HCp1LM2_b1IWJRhAGH_i6KttizdsknyYbHUp7mjuddrh5T1FHuoDwA7olN0d3fC4OIVaMxehr8q9efXIFj8JM-4ygxJwFs1hj5hzLsOxS3YVZ6aa4k5mLexGcWcpDO9OWd1_tUe5_ngwV6q2qiczhq_GOlyD0K3KAU6DoaZYrY7D51G1mr76cLND5FEbUJBzlAYzliWXk708SzIB6lJ3YPXy6YVlZV7vJdpiF1WvDGc81o2caa9UVQbrzbNFseBwrJmp5PwXQrKS_-0oMSm31s-S7c9E2zOlOMoRPFVy-R6fwkShDBDvm2IVPHAHCi7i8bPkbyd00KJnk=w564-h695-no)



#### Diagram sekwencji

![tekst alternatywny](https://lh3.googleusercontent.com/Fihn1R0wHRC4qFx1r783f8ErYfLgf9Ivf8Ba6lmn5yrwu9VyIiNGqYOAmcuunco3WY0bIaoqjLA0bqj-HnbB1FR5r5Uj1YksvJdFrnENuHXoqLN8CB-4YS7SJLLz227PxPsYTj944kHaM05WaOX1g78q1lJ6HFNvF469EZvl2kCStbJo-LuFh4iCKfCjHoNisUnE--UjEQWbw12yRnrHh-hQu5WXBAyFcwEa22xR0Y7loE-O_r1hNbzNIOAjUAyS1ihfPHLwxui5y8DYXEeuwdz17vql8ktpz7b6P4JNub4oBU7fdcCX2m9KTKqKhlIB5ln8NtYow3b3KRSpQb3OQbiaYgCzQ-5osRAdXBOb8kFPpMNrHaKkajTaFnodA2BYeOYwSM1W9x8mXmrORBTLoFfZrqt3FgjvJpGsQCNr3FdgEb884c4wiQ7TefbEn1YBncB6ovPTrUF271dz3m2WhMtqBe8jyCEEeP8HTq-HfMiXuPoF2RRXm6f2yz1o59AzCvCWwxPCNrPLB3NcYgviRLODIjykWPpyXBddFyUeVVBrQ22FTzKSIFjV-QlJM-qR-LKYxJEMTSVrr7NYdPku8_dlkaTfO4r2D3biRAA4vFfG-Sa5b390ZIVjzSZYgFRbdj9bMvUZKx3dSjyC1r1LJpvMKFXGkv8zLtX5MdMteWdiZK3B0MptbkHBNAQ=w688-h543-no)
