# Workshop_02
<h2>Warsztaty II JAVA - OOP, MySQL, Hasła </h2>
<i>Szkoła programowania <br>
Celem warsztatów jest napisanie obiektowej, bazodanowej warstwy aplikacji dla szkoły
programowania.
Aplikacja będzie zawierać część potencjalnych funkcjonalności – przechowywanie rozwiązań do
zadań, wykonywanych przez kursantów.
Podczas kolejnych warsztatów zajmiemy się oprogramowaniem interfejsu użytkownika dla naszej
aplikacji.
Werykacja działania powinna nastąpić poprzez wywołanie metod w programach opisanych w
dalszej części.</i>

<br>
<h3>Zadanie 1</h3>

Przygotuj folder pod aplikację.

Załóż nowe repozytorium git na GitHubie i nową bazę danych.

Pamiętaj o robieniu backupów bazy danych (najlepiej co każde ćwiczenie) i tworzeniu commitów (również co każde ćwiczenie).

Stwórz plik .gitignore i dodaj do niego wszystkie podstawowe dane: (pliki *.*~, katalog z danymi twojego IDE, jeżeli istnieje itp.).

Utwórz klasę zawierającą metodę o sygnaturze:

public static Connection getConnection() throws SQLException

która będzie zwracała utworzone połączenie z bazą danych.

<br>
<h3>Zadanie 2</h3>

Podczas ćwiczeń z wykładowcą, stwórz szkielet aplikacji oraz klasy User i UserDao (na podstawie schematu z prezentacji).


W klasie UserDao wykorzystaj utworzoną wcześniej klasę z metodą zwracającą obiekt klasy Connection do zestawiania połączenia z bazą danych. 
Dzięki temu w klasach DAO nie będzie trzeba powtarzać kodu odpowiedzialnego za zestawianie połączenia z bazą danych.

<br>
<h3>Zadanie 3</h3>

Stwórz wszystkie tabele w bazie danych potrzebne do działania programu.
Pamiętaj o dodaniu kluczy głównych oraz powiązań między tabelami.

<br>
<h3>Zadanie 4</h3>

Utwórz implementację pozostałych klas:
<ul>
<li>Group</li>
<li>Exercise</li>
<li>Solution</li>
</ul>
Dla każdej klasy utwórz klasę DAO oraz metody:
<ul>
<li>create</li>
<li>read</li>
<li>update</li>
<li>delete</li>
<li>ndAll</li>
</ul>

<br>
<h3>Zadanie 5</h3>

Utwórz implementację dodatkowych metod realizujących zadania:

pobranie wszystkich rozwiązań danego użytkownika (dopisz metodę <b>findAllByUserId</b> do klasy
SolutionDao),

pobranie wszystkich rozwiązań danego zadania, posortowanych od najnowszego do najstarszego
(dopisz metodę <b>findAllByExerciseId</b> do klasy SolutionDao),

pobranie wszystkich członków danej grupy (dopisz metodę <b>findAllByGroupId</b> do klasy UserDao ).

<br>
<h2>Programy Administracyjne </h2>

<br>
<h3>Zadanie 1</h3>

<h4>Program 1 – zarządzanie użytkownikami</h4>

Program po uruchomieniu wyświetli na konsoli
listę wszystkich użytkowników.

Następnie wyświetli:

"Wybierz jedną z opcji:
<ul>
<li><b>add</b> – dodanie użytkownika,</li>
<li><b>edit</b> – edycja użytkownika,</li>
<li><b>delete</b> – usunięcie użytkownika,</li>
<li><b>quit</b> – zakończenie programu.
"</li></ul>

Po wpisaniu i zatwierdzeniu jednej z opcji
program odpyta o odpowiednie dane:
<ul>
<li>jeśli wybrano <b>add</b> – program zapyta
o wszystkie dane, występujące w klasie USER,
oprócz id,</li>
<li>w przypadku <b>edit</b> – o wszystkie dane
występujące w klasie User oraz id,</li>
<li>po wybraniu <b>delete</b> – zapyta o id
użytkownika, którego należy usunąć.
 </li></ul>
 
Po wykonaniu dowolnej z opcji, program ponownie wyświetli listę danych i zada pytanie o wybór
opcji.


<br>
<h3>Zadanie 2</h3>

<h4>Program 2 – zarządzanie zadaniami</h4>

Program po uruchomieniu wyświetli na konsoli
listę wszystkich zadań.

Następnie wyświetli w konsoli napis:

"Wybierz jedną z opcji:
<ul>
<li><b>add</b> – dodanie zadania,</li>
<li><b>edit</b> – edycja zadania,</li>
<li><b>delete</b> – usunięcie zadania,</li>
<li><b>quit</b> – zakończenie programu.
"</li></ul>

Po wpisaniu i zatwierdzeniu odpowiedniej opcji
program odpyta o następujące dane:

<ul>
<li>w przypadku <b>add</b> – o wszystkie dane
występujące w klasie Exercise bez id ,</li>
<li>po wybraniu <b>edit</b> – wszystkie dane
występujące w klasie Exercise oraz id ,</li>
<li>jeśli wybrano <b>delete</b> – zapyta o id zadania
które należy usunąć.</li>
</ul>

Po wykonaniu dowolnej z opcji, program ponownie wyświetli listę danych i zada pytanie o wybór
opcji.

<br>
<h3>Zadanie 3</h3>

<h4>Program 3 – zarządzanie grupami</h4>

Program po uruchomieniu wyświetli na konsoli
listę wszystkich grup.

Następnie wyświetli w konsoli napis:

"Wybierz jedną z opcji:
<ul>
<li><b>add</b> – dodanie grupy,</li>
<li><b>edit</b> – edycja grupy,</li>
<li><b>delete</b> – usunięcie grupy,</li>
<li><b>quit</b> – zakończenie programu.
"</li></ul>

Po wpisaniu i zatwierdzeniu odpowiedniej opcji
program odpyta o dane i wykona odpowiednią
operacje:

<ul>
<li><b>add</b> – wszystkie dane występujące w klasie
Group , bez id ,
</li>
<li><b>edit</b> – wszystkie dane występujące w klasie
Group oraz id ,</li>
<li>delete – id grupy którą należy usunąć.</li>
</ul>

Po wykonaniu dowolnej z opcji, program ponownie wyświetli listę danych i zada pytanie o wybór
opcji.

<br>
<h3>Zadanie 4</h3>

<h4>Program 4 – przypisywanie zadań</h4>

Program po uruchomieniu wyświetli w konsoli
napis

"Wybierz jedną z opcji:
<ul>
<li><b>add</b> – przypisanie zadań do użytkowników,</li>
<li><b>view</b> - przeglądanie rozwiązań danego
użytkownika,</li>
<li><b>quit</b> – zakończenie programu.
"</li></ul>

Po wpisaniu i zatwierdzeniu odpowiedniej opcji
program odpyta o dane:

<ul>
<li>jeśli wybrano <b>add</b> – wyświetli listę wszystkich
użytkowników, odpyta o id, następnie
wyświetli listę wszystkich zadań i zapyta o id
zadania, utworzy i zapisze obiekt typu <b>Solution</b>
.
Pole <i>created</i> wypełni się automatycznie,
a pola <i>updated</i> i <i>description</i> mają zostać
puste.</li>
<li><b>view</b> – zapyta o id użytkownika, którego
rozwiązania chcemy zobaczyć.</li>
</ul>

Po wykonaniu dowolnej z opcji, program ponownie zada pytanie o wybór opcji.

<br>
<h2>Program Użytkownika </h2>

<br>
<h3>Zadanie 1</h3>

Dodawanie rozwiązań

Program przyjmie jeden parametr, podawany
podczas uruchamiania z konsoli lub IDE,
symbolizujący identykator Użytkownika.

<i>Pamiętaj, że parametry takie pobieramy z tablicy args
parametrów metody main.</i> public static void main(String[] args)

Program, po uruchomieniu, wyświetli w konsoli
napis:

"Wybierz jedną z opcji:
<ul>
<li><b>add</b> – dodawanie rozwiązania,</li>
<li><b>view</b> – przeglądanie swoich rozwiązań.
"
</li>
</ul>

<br>
<h3>Zadanie 2</h3>

Dodawanie rozwiązań

Po wybraniu odpowiedniej opcji, program odpyta o dane i wykona odpowiednią operację:
<ul><li>po wybraniu add – wyświetli listę zadań, do których Użytkownik nie dodał jeszcze rozwiązania,
a następnie odpyta o id zadania, do którego ma zostać dodane rozwiązanie.
Pole created zostanie wypełnione automatycznie, więc Użytkownik zostanie odpytany jeszcze
tylko o rozwiązanie zadania,</li>
<li>w przypadku wybrania quit – program zakończy działanie. </li>
</ul>

Dla uproszczenia przyjmujemy, że dodanego rozwiązania nie możemy usuwać, ani edytować.
W przypadku próby dodania rozwiązania, które już istnieje czyli Użytkownik poda id z zakresu innego
niż zaprezentowany w programie, program ma wyświetlić odpowiedni komunikat.


<br>
<h3>Zadanie Dodatkowe</h3>

Dodatkowe funkcjonalności
Zastanów się jakie dodatkowe programy warto
by było dopisać

eżeli masz pomysł na inne potrzebne metody
lub klasy, to dopisz je do swojego programu.

Przykładowe możliwości rozwoju:
<ul><li>oceny i komentarze do rozwiązań zadań,</li>
<li>umiejętności przypisywane do Użytkowników</li></ul>







































































