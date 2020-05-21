-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: books_repository
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `birth_date` varchar(50) NOT NULL,
  `nationality` varchar(50) NOT NULL,
  `description` text NOT NULL,
  `images` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES (1,'Olga Tokarczuk','1962-01-29','Polish','Polska pisarka, eseistka, autorka scenariuszy, poetka, psycholog.\n\nLaureatka Nagrody Nobla w dziedzinie literatury za rok 2018, laureatka The Man Booker International Prize 2018 za powieść \"Bieguni\" (Flights) oraz dwukrotna laureatka Nagrody Literackiej „Nike” za powieści: \"Bieguni\" (2008) i \"Księgi Jakubowe\" (2015).\n\nWychowała się w Sulechowie, skąd przeniosła się z rodzicami do Kietrza, gdzie ukończyła Liceum Ogólnokształcące im. C.K. Norwida.\n\nJest absolwentką Wydziału Psychologii Uniwersytetu Warszawskiego. W czasie studiów jako wolontariuszka opiekowała się osobami chorymi psychicznie. Po studiach pracowała jako psychoterapeutka w poradni zdrowia psychicznego w Wałbrzychu. Gdy jej pierwsze utwory literackie zyskały popularność, zrezygnowała z pracy i po przeprowadzeniu się do Nowej Rudy poświęciła się pisaniu. Mieszka obecnie we Wrocławiu, także w Krajanowie koło Nowej Rudy, w Sudetach Środkowych. Pejzaż i kultura tych okolic przewija się w kilku jej utworach. Prowadzi warsztaty prozatorskie w Studium Literacko-Artystycznym na Uniwersytecie Jagiellońskim w Krakowie.\n\nByła współorganizatorem Festiwalu Opowiadania, podczas którego autorzy krótkich form literackich z Polski i zagranicy prezentują swoje utwory. Od 2008 prowadzi zajęcia z twórczego pisarstwa na Uniwersytecie Opolskim. Była członkinią Zielonych 2004 oraz redakcji „Krytyki Politycznej”.\n\nOd 2015 Olga Tokarczuk organizuje w Nowej Rudzie i okolicach Festiwal Góry Literatury przy współudziale Karola Maliszewskiego, Stowarzyszenia Kulturalnego „Góry Babel” oraz Gminy Nowa Ruda. W programie festiwalu znajdują się: akcje edukacyjne, debaty, koncerty, panele, pokazy, spotkania, Noworudzkie Spotkania z Poezją, warsztaty: filmowe, kulinarne, literackie; wystawy.','olga.jpg'),(3,'Sergiusz Piasecki','1901-04-01','Polish','Polski pisarz i publicysta.\nUrodził się i spędził młodość na terenie dzisiejszej Białorusi.\nJako młody chłopak obracał się w środowisku drobnych złodziei i włamywaczy.\nW niepodległej Polsce Piasecki pracował dla wywiadu RP, nie porzucając wszakże działalności kryminalnej. Szybko wpadł też w nałóg narkotyczny, co pociągnęło za sobą kolejne napady rozbójnicze w celu zdobycia pieniędzy na zakup kokainy. Takie życie musiało doprowadzić go za kratki. Został skazany na 15 lat więzienia, \"odsiedział\" 11 lat, z czego 2 lata w izolatce. Został ułaskawiony wskutek zabiegań znanych polskich pisarzy, którzy docenili jego twórczość literacką. Dopiero podczas odbywania tej kary nauczył się literackiej polszczyzny czytając Biblię i tygodnik \"Wiadomości literackie\". W 1937 roku prezydent RP, Ignacy Mościcki ułaskawił Sergiusza Piaseckiego.\nW czasie II wojny światowej działał w AK.\nPo wojnie wyjechał z Polski. Najpierw przybył do Włoch. Ostatecznie osiedlił się w Anglii. Zmarł w Londynie.\nWybrane dzieła autora: \"Piąty etap\" (Towarzystwo Wydawnicze \"Rój\", 1938), \"Trylogia złodziejska\": \"Jabłuszko\", \"Spojrzę ja w okno...\", \"Nikt nie da nam zbawienia...\" (pierwsze wydanie: Instytut Literacki w Rzymie, 1946-1947), \"Zapiski oficera Armii Czerwonej\" (Gryf Publications, 1957), \"Wieża Babel\" (I-II tom, Polska Fundacja Kulturalna 1964).','piasecki.jpg'),(4,'Terry Pratchett','1948-04-28','English','Angielski pisarz. Autor prześmiewczych powieści fantasy dziejących się w Świecie Dysku. Cierpiał na rzadką odmianę choroby Alzheimera. Ojciec Rhianny Pratchett – scenarzystki komiksów i gier komputerowych.\n\nDebiutował jako 13-latek w szkolnej gazetce. Pierwsze opowiadanie sprzedał dwa lata później. Jeszcze jako nastolatek porzuca szkołę i zarabia jako dziennikarz w „Bucks Free Press”. Pierwszą powieść opublikował w 1971 roku (Dywan) – dowcipna i przewrotna książka dla młodszego czytelnika zebrała pochlebne recenzje. Jednak pisarstwo traktował jako hobby do chwili stworzenia pierwszej książki z cyklu o Świecie Dysku.\n\n„The Colour Of Magic” (Kolor magii) przyniósł mu wielki rozgłos. „The Light Fantastic” (Blask fantastyczny) okazał się równie, a może nawet bardziej popularny. Trzecia część, „Equal Rites” (Równoumagicznienie), była już tak wyczekiwana przez czytelników, że zanim książka została opublikowana, czytano ją w BBC.\n\nPratchett napisał również trylogię dla dzieci „Book of the Nomes” (Księgi nomów). Jej bohaterami są małe istoty pozaziemskie uwięzione na naszej planecie i usiłujące z niej zbiec.\n\nDwie książki Pratchett napisał wspólnie z innymi autorami: „The Unadulterated Cat” (Kot w stanie czystym) (1989) z Gray Jolliffe i „Good Omens” (Dobry omen) (1990) z Neilem Gaimanem.\n\nBył wielokrotnie nagradzany. W 1994 roku otrzymał British Book Awards. W 1998 roku za zasługi dla literatury mianowano go kawalerem Orderu Imperium Brytyjskiego. Był doktorem honoris causa kilku uniwersytetów i jednym z najbardziej wpływowych twórców fantasy – na podstawie jego powieści powstają gry komputerowe, fabularne, komiksy i filmy.\n\nKsiążka Terryego Pratchetta Stephena i Baxtera „Długi Mars” została nominowana w Plebiscycie Książka Roku 2015 lubimyczytać.pl w kategorii Sci-fi.','pratchett.jpg'),(6,'Neil Gaiman','1960-11-10','English','Angielski pisarz, scenarzysta i redaktor, autor licznych powieści, opowiadań i komiksów fantasy, science fiction i grozy. W „Dictionary of Literary Biography” jest wymieniony jako jeden z najwybitniejszych żyjących pisarzy fantasy, urban fantasy i SF.\n\nOtrzymał wiele nagród i wyróżnień, m.in. Will Eisner Comic Industry Awards dla Najlepszego Pisarza, Najlepszą serię i Najlepszą powieść graficzną za „Sandmana”; Harvey Award dla Najlepszego Autora i Najlepszej Serii za „Sandmana”; GLAAD Award dla Najlepszego Komiksu 1996 za „Death: The Time of Your Life”; Eagle Award for Best Graphic Novel za „Violent Cases”;\nInternational Horror Critics Guild Award dla Najlepszego Zbioru Opowiadań za „Angels and Visitations”.\n\nKsiążka Neila Gaimana „Drażliwe tematy. Krótkie formy i punkty zapalne” została nominowana w Plebiscycie Książka Roku 2015 lubimyczytać.pl w kategorii Fantastyka, fantasy.','gaiman.jpg'),(7,'Brent Weeks','1977-03-07','American','Amerykański autor fantasy. Urodzony w stanie Montana. Zadebiutował serią książek \"Anioł Nocy\".','weeks.jpg'),(8,'Dmitry Glukhovsky','1979-07-12','Russian','Rosyjski pisarz, dziennikarz i felietonista.\n\nPracował dla Euronews TV, Deutche Welle i Russia Today. Pisze na łamach „Harper’s Bazaar”, „l’Officiel” i „Playboya”. Laureat nagrody Europejskiego Towarzystwa Fantastyki Naukowej. Należy do pokolenia rosyjskich literatów krytycznie oceniających politykę swojego kraju i wzywającego do jej pełnej demokratyzacji.\n\nNajwiększy rozgłos przyniosła mu postapokaliptyczna powieść „Metro 2033”, którą zaczął pisać w wieku 18 lat. Jej kolejne fragmenty publikował w internecie, pozwalając czytelnikom do pewnego stopnia wpływać na fabułę. Ten pionierski wówczas eksperyment interaktywny przyniósł mu rzeszę oddanych fanów. Ukończone dzieło opublikowano w Rosji w 2005 roku i okazało się wielkim bestsellerem, osiągając kilkusettysięczny nakład. Prawa do powieści „Metro 2033” zostały sprzedane do ponad 30 krajów; w oparciu o jej fabułę i pomysł powstały gry komputerowe, planowana jest również jej hollywoodzka ekranizacja. W Polsce nakład tej powieści przekroczył już 200 tys. egzemplarzy.\n\nGlukhovsky w 2009 roku wydał w Rosji kolejną postapokaliptyczną powieść, „Metro 2034”, a swój pomysł rozwinął w międzynarodowy projekt o nazwie „Uniwersum Metro 2033”. Pod jego szyldem, stosując się do ustalonych przez Glukhovsky’ego reguł, piszą i publikują autorzy z całego świata. Powieści Glukhovsky’ego oraz seria „Uniwersum Metro 2033” cieszą się w Polsce niesłabnącym zainteresowaniem i należą do najpoczytniejszych książek literatury postapokaliptycznej. W 2015 roku ukazała się wyczekiwana trzecia część trylogii – „Metro 2035”. Prawa do tłumaczenia powieści zostały wykupione przez wydawnictwa na długo przed jej ukończeniem. „Metro 2035” jest książką niezależną i również od niej można zacząć przygodę z cyklem Glukhovsky’ego.\n\nKsiążka Dmitrija Głuchowskiego „Futu.re” otrzymała tytuł Książki Roku 2015 lubimyczytać.pl w kategorii Sci-fi.\n\nKsiążka Dmitrija Głuchowskiego „Metro 2035” została nominowana w Plebiscycie Książka Roku 2015 lubimyczytać.pl w kategorii Fantastyka, fantasy.','glukhovsky.jpg'),(9,'Wieniedikt Jerofiejew','1938-10-24','Russian','Rosyjski pisarz i dramaturg. Autor utworów ukazujących satyryczno-groteskowy \nwizerunek sowieckich realiów społeczno-obyczajowych i politycznych. \nNajbardziej znany z poematu prozą Moskwa-Pietuszki. Dzieciństwo spędził na północy Rosji, w biednej rodzinie kolejarskiej mieszkającej przy stacji Pojakonda. Po zesłaniu ojca przebywał w domu dziecka w Kirowsku. Żyjąc w okresie zsyłek w obrębie koła podbiegunowego, na Półwyspie Kolskim, paradoksalnie dostąpił możliwości nauki pod okiem wykształconych nauczycieli wysyłanych tam przymusowo. Studia podejmował między innymi na Uniwersytecie Moskiewskim na wydziale filologicznym, skąd (podobnie jak i z innych uczelni) został wydalony. Pracował w rozmaitych zawodach, od kamieniarza po bibliotekarza, zaś swoje przemyślenia podczas robót w charakterze montera-łącznościowca, także te wynikające z problemu alkoholowego, opisał w utworze Moskwa-Pietuszki.\n\nPrzez długie lata jego twórczość była zakazana przez władze, krążyła w tak zwanym samizdacie, wydawana była jedynie za granicą. Dopiero pod koniec życia pisarz doczekał się powszechnej sławy w swym kraju.\n\nW 1987 przyjął chrzest w katolickim kościele św. Ludwika w Moskwie.\n\nZmarł na raka krtani.  ','jerofiejew.jpg'),(10,'Heather Morris','unknown','New Zealander','Nowozelandzka pisarka, obecnie mieszka w Australii.\n\nPracując w szpitalu państwowym w Melbourne, przez kilka lat czytała i pisała scenariusze, z których jednym zainteresował się uhonorowany Oscarem amerykański scenarzysta. W 2003 roku spotkała starszego pana, który „miał historię wartą opowiedzenia”. Dzień, w którym poznała Lalego Sokołowa, zmienił życie ich obojga. W miarę jak rozwijała się ich przyjaźń, Lale otwierał przed nią swą duszę, powierzając jej tajemnice życia w czasach Zagłady. Początkowo historia losów Lalego miała postać scenariusza, który zdobywał wiele wyróżnień w międzynarodowych konkursach, ostatecznie \njednak autorka przekształciła ją w debiutancką powieść \n„Tatuażysta z Auschwitz” (2018).  ','morris.jpg'),(11,'Truman Capote','1924-09-30','American','Prozaik amerykański, naprawdę nazywał się Truman Streckfus Persons. Wywodził się z Południa, dzieciństwo spędził w Luizjanie, Alabamie i Missisisipi. Po ukończeniu szkoły średniej przez pewien czas pracował jako goniec w redakcji tygodnika \"The New Yorker\", co stworzyło mu okazję do nawiązania pierwszych kontaktów literackich. Debiutował jako nowelista zbiorem \"Zatrzaśnij ostatnie drzwi\" (1943, \"Shut the Final Door\"), po którym wydał kilka jeszcze tomów opowiadań wyróżniających się subtelnością psychologicznego rysunku postaci, ulotnością nastroju i wdziękiem stylistycznym, ale uznaną pozycję literacką zdobył dzięki dwóm powieściom - \"Inne głosy, inne ściany\" (1948, \"Other Voices, Other Rooms\"), zawierającej wyraźne pierwiastki autobiograficzne opowieści o dojrzewaniu uczuciowym młodego chłopca, i \"Harfa traw\" (1951, \"The Grass Harp\"), której bohaterowie uciekają w dzieciństwo, chroniąc się w ten sposób przed okrucieństwem \"normalnego\" życia, i rezydują gromadnie w rozrosłym drzewie. Podobne przesłania zawiera głośna powieść \"Śniadanie u Tiffanyego\" (1958, \"Breakfast at Tiffanys\"), portretująca młodą dziewczynę, która nie chce stabilizacji i nawet na wizytówce umieszcza informację, że znajduje się permanentnie \"w podróży\". Natomiast ostatnia z szeroko znanych powieści Capotea, \"Z zimną krwią\" (1966, \"In Cold Blood\"), utrzymana jest w zupełnie odmiennym tonie i napisana inną techniką; jest to swoista \"powieść dokumentalna\" drobiazgowo rekonstruująca szczegóły krwawej zbrodni, popełnionej przez dwóch recydywistów na czteroosobowej rodzinie farmerskiej z Kansas, a następnie przedstawiająca równie szczegółowo przebieg procesu i zachowanie się zabójców przed i po wyroku, aż po sam dzień egzekucji. Najpełniej oryginalne utwory Capotea pierwszego okresu twórczości nie znalazły w zasadzie naśladowców, natomiast powieść \"Z zimną krwią\" dała na swój sposób początek fali \"powieści dokumentalnych\", które ze szczególnym zapałem uprawiać zaczął Mailer. Po ogromnym międzynarodowym sukcesie \"Z zimną krwią\" w twórczości Capotea nastąpiło swoiste \"zawirowanie\". Przez wiele lat pracował nad zamierzoną na Proustowską skalę powieścią \"Answered Prayers\", której nigdy nie ukończył (duży fragment ukazał się za życia autora w jednym z czasopism); zachowane 3 rozdziały wydano w 1987 roku, z podtytułem \"The Unfinished Novel\" (\"Wysłuchane modły. Powieść nie ukończona\"), w opracowaniu M.Foxa. Powieść, o wyraźnie autobiograficznym charakterze, portretująca nowojorskie środowisko artystyczne wraz z jego międzynarodowymi koneksjami, wywołała wzburzenie z powodu agresywnych i drastycznych charakterystyk wielu luminarzy amerykańskiego życia artystycznego i intelektualnego. ','capote.jpg'),(12,'Jarosław Grzędowicz','1965-05-03','Polish','Urodzony w 1965 roku, debiutował w 1982 na łamach tygodnika „Odgłosy” opowiadaniem \n\"Azyl dla starych pilotów\". Opublikowane w 1999 roku w Internecie opowiadanie \"Klub absolutnej karty kredytowej\" otrzymało nominację do Nagrody Elektrybałta, \na po publikacji w \"Wizjach alternatywnych\" 2002 także nominację do Nagrody Sfinksa. W 1990 roku wraz z Andrzejem Łaskim, \nKrzysztofem Sokołowskim, Dariuszem Zientalakiem i Rafałem Ziemkiewiczem założył magazyn literacki „Fenix”, \nw którym prowadził dział prozy polskiej, a od 1993 roku był jego redaktorem naczelnym. Pracuje jako dziennikarz, \nprowadzi stałą rubrykę naukowo-cywilizacyjną w \"Gazecie Polskiej\" i tłumaczy komiksy.','grzedowicz.jpg');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `author_book`
--

DROP TABLE IF EXISTS `author_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `author_book` (
  `book_id` int(11) NOT NULL,
  `author_id` int(11) NOT NULL,
  PRIMARY KEY (`book_id`,`author_id`),
  KEY `FK_BOOK_idx` (`book_id`),
  KEY `FK_AUTHOR` (`author_id`),
  CONSTRAINT `FK_AUTHOR` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`),
  CONSTRAINT `FK_BOOK_05` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author_book`
--

LOCK TABLES `author_book` WRITE;
/*!40000 ALTER TABLE `author_book` DISABLE KEYS */;
INSERT INTO `author_book` VALUES (1,1),(3,3),(4,4),(4,6),(5,7),(6,8),(7,9),(8,10),(9,11),(10,3),(11,1),(12,12),(13,12),(14,12),(15,12);
/*!40000 ALTER TABLE `author_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `release_date` varchar(20) NOT NULL,
  `description` text NOT NULL,
  `images` varchar(50) NOT NULL,
  `rating` double(10,2) DEFAULT '0.00',
  `votes` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK_CATEGORY` (`category_id`),
  CONSTRAINT `FK_CATEGORY` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'Księgi Jakubowe',1,'2014-10-23','Rok 1752. Do Rohatyna na Podolu przybywają kasztelanowa Katarzyna Kossakowska \ni towarzysząca jej poetka Elżbieta Drużbacka. Jednym z gości na powitalnej \nkolacji jest miejscowy proboszcz Benedykt Chmielowski, autor pierwszej polskiej \nencyklopedii. Ksiądz i poetka, osoby rozmiłowane w księgach, szybko znajdują wspólny \njęzyk – rozpoczynają rozmowę, którą później kontynuować będą w listach.','ksiegi.jpg',0.00,0),(3,'Kochanek Wielkiej Niedzwiedzicy',3,'2016-01-01','Zaraz po opublikowaniu powieści Kochanek Wielkiej Niedźwiedzicy (1937) \nzostała ona uznana za najpopularniejszą książkę roku, a miarą jej popularności \njest fakt, że do wybuchu II wojny światowej ukazały się trzy wydania polskie i \nkilkanaście przekładów na obce języki. Do dziś jest ona wznawiana w Polsce i \nza granicą. Na podstawie książki nakręcono również serial telewizyjny i film fabularny.','kochanek.jpg',0.00,0),(4,'Dobry Omen',2,'2019-05-16','Koniec świata jest już blisko! W serialu na podstawie niebiańsko \nudanej i piekielnie zabawnej powieści Pratchetta i Gaimana wystąpią \nDavid Tennant, Michael Sheen, Jon Hamm, Frances McDormand i Benedict \nCumerbatch! Premiera 31 maja 2019 roku w Amazon Prime.','dobryOmen.jpg',0.00,0),(5,'Droga Cienia',2,'2009-11-12','Dla Merkuriusza przetrwanie nie jest rzeczą pewną. Nie ma żadnej gwarancji przeżycia. \nJako szczur z ulicy wychował się w slumsach i nauczył się \nszybko oceniać ludzi. I podejmować ryzyko. Jednak żeby zostać przyjętym do terminu, \nMerkuriusz musi odrzucić swoje dawne życie i przyjąć nową tożsamość. \nJako Kylar Stern musi nauczyć się poruszać w świecie zabójców - \nw świecie niebezpiecznych polityków i dziwnej magii. \nI musi rozwijać talent do zabijania. ','drogaCienia.jpg',0.00,0),(6,'Metro 2033',2,'2018-10-17','Ten thriller SF, którego wartka akcja \ni niezwykle sugestywnie przedstawiony świat nie pozwolą \nci się od niego oderwać aż do ostatniej strony, to nie \ntylko wspaniała rozrywka i uczta dla czytelnika. \nTo także portret człowieka u schyłku cywilizacji; przejmująca \nanaliza jego niezmiennej natury. To obraz świata po końcu świata.\n ','metro2033.jpg',0.00,0),(7,'Moskwa — Pietuszki ',1,'2007-10-01','Moskwa- Pietuszki może w naiwnym odbiorze sprawiać wrażenie rwącego potoku \nbezwładnej, alkoholicznej maligny. To jednak pozór. W istocie mamy do \nczynienia z kunsztowną, wielopiętrową parabolą w szatach ludowego śmiechowiska; \nz opowieścią o bezwyjściowości rosyjskiego losu, z którego ucieczką jest jedynie \npijaństwo, ale i ono prowadzi donikąd. \n ','moskwa-pietuszki.jpg',0.00,0),(8,'Tatuażysta z Auschwitz',7,'2018-04-18','Lale Sokołow trafił do Auschwitz w 1942 roku jako dwudziestosześciolatek. \nJego zadaniem było tatuowanie numerów na przedramionach przybywających \ndo obozu więźniów. Naznaczanie ich. Pewnego dnia w kolejce stanęła młoda \nprzerażona dziewczyna – Gita. Lale zakochał się od pierwszego wejrzenia. \nI obiecał sobie, że bez względu na wszystko uratuje ją. \n ','tatuazystazAuschwitz.jpg',0.00,0),(9,'Gwiazdka',1,'1999-01-01','Wzruszające, zamknięte w dwóch opowiadaniach: \nTamta gwiazdka i Wspomnienie gwiazdkowe, pełne ciepła wspomnienia \nz dzieciństwa, przywołujące nastrój zbliżających się świąt Bożego Narodzenia, \nGwiazdki, oczekiwania na prezenty i radości obdarowywania nimi bliźnich. \nAle także historia pierwszych rozczarowań, jak wstrząsające odkrycie, że \nŚwięty Mikołaj nie istnieje. \n ','gwiazdka.jpg',0.00,0),(10,'Bogom Nocy Równi',3,'2008-01-01','Bogom nocy równi jest kontynuacją \"Piątego etapu\". Powieść ta napisana i wydana w rok po opuszczeniu więzienia przez Piaseckiego (1938) opowiada o przygodach pracowników i współpracowników polskiego wywiadu. Jej akcja rozgrywa się na pograniczu polsko-sowieckim i w Rosji sowieckiej w latach dwudziestych. Przebywając na emigracji autor wydał skróconą wersję książki (1950), łącząc niektóre wątki Piątego etapu i Bogom nocy równi w jeden tom. \nEdycja niniejsza jest oparta na ostatnim pełnym wydaniu książkowym z 1938 roku. \n ','bogomNocyRowni.jpg',0.00,0),(11,'Opowiadania bizarne',1,'2018-04-18','Świat staje się coraz bardziej bizarny.\nNajnowszy zbiór opowiadań Olgi Tokarczuk.\nZaskakujące i nieprzewidywalne opowiadania, dzięki którym inaczej spojrzymy na otaczającą nas rzeczywistość\n\nPochodzące z języka francuskiego słowo „bizarre” znaczy: dziwny, zmienny, ale też śmieszny i niezwykły. Taka właśnie – zadziwiająca i wymykająca się wszelkim kategoriom – jest najnowsza książka Olgi Tokarczuk.\n\nDziesięć opowiadań. Każde z nich toczy się w innej przestrzeni. Wołyń w epoce potopu szwedzkiego, współczesna Szwajcaria, odległa Azja i miejsca wyimaginowane.\n\nCzym jest poczucie dziwności i skąd ono pochodzi? Czy dziwność jest cechą świata, czy może jest w nas?\n\nZmienny rytm opowiadań sprawia, że czytelnik ani przez chwilę nie może być pewny tego, co wydarzy się na kolejnej stronie. Olga Tokarczuk wytrąca nas ze strefy komfortu, wskazując, że świat staje się coraz bardziej niepojęty.\n\nObecne w opowiadaniach elementy groteski, czarnego humoru, fantastyki i grozy unaoczniają, że w naszej rzeczywistości nic nie jest takim, jakim się wydaje.  \n ','opowiadaniaBizarne.jpg',0.00,0),(12,'Pan Lodowego Ogrodu - tom I',2,'2012-05-11','Vuko Drakkainen samotnie rusza na ratunek ekspedycji naukowej badającej człekopodobną cywilizację planety Midgaard. Pod żadnym pozorem nie może ingerować w rozwój nieznanej kultury. \n    Trafia na zły czas. Planeta powitała go mgłą i śmiercią. Dalej jest tylko gorzej. Trwa wojna bogów. Giną śmiertelnicy. Odwieczne reguły zostały złamane.','panLodowegoOgrodu-Tom1.jpg',0.00,0),(13,'Pan Lodowego Ogrodu - tom II',2,'2012-05-11','Planeta Midgaard. Główny bohater Vuko Drakkainen zostaje wysłany tu, by sprowadzić na ziemię grupę naukowców. \nNa miejscu okazuje się, że jeden z zaginionych, Pier van Dyken, nauczył się władać pierścieniami i zmienia planetę według swoich kaprysów... \nNa domiar złego Vuko przegrał pierwsze starcie z Pierem i został zamieniony w drzewo. Po uwolnieniu się nie jest juz tym samym człowiekiem. Poprzysiągł sobie jednak, że zgładzi tego, kto mu to zrobił...\nTymczasem młody cesarz Filar podróżuje z Brusem po ziemiach zniszczonych przez wojnę. Na swojej drodze spotyka kobietę z... przeszłości.','panLodowegoOgrodu-Tom2.jpg',0.00,0),(14,'Pan Lodowego Ogrodu - tom III',2,'2018-01-01','Vuko Drakkainen przybył na Midgaard z misją. Zastał wojnę, przez którą musiał zweryfikować plany, ale nie zrezygnował z nich. Jeśli interesuje Was, jak przebiega jego podróż przez obcą planetę, koniecznie posłuchajcie trzeciej odsłony „Pana Lodowego Ogrodu”.\nDoskonała powieść fantasy, w której autor przedstawia słuchaczom oryginalny, niezwykle przemyślany i doskonale skonstruowany, choć wypełniony przemocą świat. To historia cywilizacji, która łączy w sobie podejście racjonalne z przekonaniem o potędze magii. Wojna nie odbywa się tu między ludźmi czy im podobnymi. Mieszkańcy Midgaard wystąpili przeciwko bogom.\nZadanie, którego podjął się Vuko wciąż nie zostało wykonane, ale czy w okolicznościach, które zastał to w ogóle możliwe? Przejmująca historia i refleksja dotycząca władzy, która wciąga i deprawuje.\nZnakomita powieść, która w wersji audio ukazała się w wykonaniu Jacka Rozenka. Zarówno postaci, jak i fabuła należą do jednych z najbardziej oryginalnych w polskiej literaturze fantasy. Wszystkie tomy cieszą się ogromna popularnością i uznaniem odbiorców.\nPan Lodowego Ogrodu to powieść napisana z rozmachem godnym dzieł Hieronima Boscha, Stevena Spielberga, J.R.R. Tolkiena czy Georgea R.R. Martina.\nNikt nie wie, co się dzieje z grupą naukowców. Vuko Drakkainen ma ich odnaleźć i sprowadzić na Ziemię lub zabić i zatrzeć ślady. Z taką misją przybywa na Midgaard - świat kryjący w sobie rasę istot rozumnych oraz magię. Tymczasem, niektórzy już dawno zginęli, inni sięgnęli po magię i obwołali się bogami. Nikt nie chce wracać.\nŻaden z nich nie odda łatwo władzy, jaką zdobył. Vuko przemierza krainy Midgaardu szukając sojuszników by ukończyć misję. Czy wykona zadanie?\nPan Lodowego Ogrodu to czterotomowa powieść napisana przez Jarosława Grzędowicza. Premiera czwartego i ostatniego tomu będzie miała miejsce 30 listopada 2012 r. ','panLodowegoOgrodu-Tom3.jpg',0.00,0),(15,'Pan Lodowego Ogrodu - tom IV',2,'2012-11-30','\nTen cykl to właściwie jeden wielki, literacki popis możliwości kreacji współczesnego pisarza popkulturowego. Faszerowany efektami blockbuster z przesłaniem sprowadzony do postaci książki. Perspektywa opisu zmieniająca się w zależności od tempa akcji, wielotorowa fabuła, słowa kreślące dziwaczny, szalony wręcz obraz rodem z sennych widziadeł Hieronima Boscha. Supertechnologia w bezpardonowym pojedynku z magią. Akcja gna przez świat, który nie jest jedynie płaską dekoracją służącą za tło zmagań herosów. Odkrywamy skomplikowany mechanizm z barierami kulturowymi, obsesjami i pragnieniami, który zachowuje prawo do istnienia i funkcjonowania nawet bez galerii pierwszoplanowych postaci.\n\nTo już nie jest tylko forma rozrywki. Jarosław Grzędowicz błyskotliwie udowadnia, że uniwersalnym popowym kodem pisarz może mówić o rzeczach fundamentalnych i prowokować do wyciągania wniosków.','panLodowegoOgrodu-Tom4.jpg',0.00,0);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Belles-lettres'),(2,'Fantasy, SF'),(3,'Adventure'),(4,'Crime fiction'),(5,'Biography'),(6,'Poetry'),(7,'Historical novel');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `customer` (
  `name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('Adam','Sadam',2),('Dzasta','Fantasta',3),('Ilona','Niezona',4);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-21 20:17:23
