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


![Diagram przypadków  użycia](/na_githuba/src/uml/diagram_przypadków_uzyucia.PNG)


System nosi nazwę Biblioteka. Jest to aplikacja dzięki której można wypożyczyć książkę. Aktorami w tym systemie są: bibliotekarz czyli osoba zarządzająca biblioteką, użytkownik czyli osoba która założyła konto. W skład tego systemu wchodzą następujące przypadki użycia:
-rejestracja użytkownika – umożliwia założenie konta przez potencjalnego użytkownika. Może to uczynić użytkownik oraz bibliotekarz
- dodanie książki do bazy – dodać książkę do bazy może bibliotekarz
- zwrot książki – umożliwia zwrócenie wypożyczonej przez użytkownika  książki.
- wypożyczenie książki – umożliwia wypożyczenie przez użytkownika książki.
- wyświetlenie możliwych książek do wypożyczenia -  wyświetla użytkownikowi możliwe do wypożyczenia książki
- wyświetlenie gatunków literackich – może to zrobić użytkownik


#### Diagram klas



![Diagram klas](/na_githuba/src/uml/diagram_klas.PNG)



#### Diagram aktywności

![Diagram aktywności](/na_githuba/src/uml/diagram_aktywnosi.PNG)



#### Diagram sekwencji

![Diagram sekwencji](/na_githuba/src/uml/diagram_sekwencjii.PNG)
