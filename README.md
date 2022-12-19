![example workflow](https://github.com/jan-szczuka5/io-projekt/actions/workflows/ci.yml/badge.svg)
# Building info
### Repozytorium na projekt z inżynierii oprogramowania grupy I2-1-Alfa (BuildingInfo).
## Opis Projektu:
Dla administratorów budynków, którzy pragną optymalizować koszty zarządzania budynkami. Nasza aplikacja Building Info umożliwi pozyskanie informacji o parametrach budynku na poziomie pomieszczeń, kondygnacji oraz całych budynków. Aplikacja będzie dostępna poprzez GUI a także jako zdalne API dzięki czemu można ją zintegrować z istniejącymi narzędziami.
## Struktura danych:
* Lokalizacja to budynek, poziom, lub pomieszczenie  
* Budynek może składać się z poziomów, a te z pomieszczeń  
* Każda lokalizacja jest charakteryzowana przez:  
  - id – unikalny identyfikator  
  - name – opcjonalna nazwa lokalizacji  
* Pomieszczenie dodatkowo jest charakteryzowane przez:  
  - area - powierzchnia w m^2  
  - cube - kubatura pomieszczenia w m^3  
  - heating - poziom zużycia energii ogrzewania  
  - light – łączna moc oświetlenia  

## Członkowie grupy:  
*Jan Szczuka, nr indeksu: 148075,*  
*Szymon Pasternak, nr indeksu: 148146,*  
*Julia Mularczyk, nr indeksu: 148062,*  
*Hanna Pieniążek, nr indeksu: 148159.*  

Tablica z zadaniami: [Trello](https://trello.com/b/tkpaYw29)

## Zasada działania **REST**:

Do obsługi obecnej wersji zalecane jest używanie aplikacji [**Postman**](https://www.postman.com/downloads/). W aplikacji należy wybrać zapytanie typu _POST_ i wkleić zawartość pliku .json do okna **Body** typu _Text_.

![example.png](https://github.com/jan-szczuka5/io-projekt/blob/main/example.png)

Następnie należy wpisać **ht<span>tp://</span>localhost:8080/KOMENDA**. Przy każdej nowej komendzie należy wkleić zawartość pliku .json.

### Dostępne komendy:

**getArea/{id}** - zwraca powierzchnię lokalizacji o podanym numerze id,  
**getCube/{id}** - zwraca kubaturę lokalizacji o podanym numerze id,  
**getLightPerArea/{id}** - zwraca moc oświetlania w przeliczeniu na jednostkę powierzchni lokalizacji o podanym numerze id.

## Diagram UML:
![Diagram.png](https://github.com/jan-szczuka5/io-projekt/blob/main/Diagram.png)
