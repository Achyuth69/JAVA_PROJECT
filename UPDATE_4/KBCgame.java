package project;

import java.util.Scanner;

public class KBCgame {
	private static final int PRIZE_AMOUNT = 1000; // Amount awarded for each correct answer
    private static final int MAX_QUESTIONS = 10; // Number of questions to be asked
    private static Scanner scanner = new Scanner(System.in); // Declare scanner here for use

    public static void main(String[] args) {
        System.out.println("Welcome to the KBC Quiz Show!");
        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

        // Select question set based on first letter of user's name
        char firstChar = userName.toUpperCase().charAt(0);
        Question[] questions = selectQuestionSet(firstChar);
        
        int totalScore = 0;

        // Ask questions
        for (int i = 0; i < Math.min(questions.length, MAX_QUESTIONS); i++) {
            Question question = questions[i];
            question.displayQuestion();
            
            System.out.print("Your answer (1-" + question.getOptions().length + "): ");
            int userAnswer = scanner.nextInt();

            // Check the answer
            if (question.isAnswerCorrect(userAnswer)) {
                totalScore += PRIZE_AMOUNT; // Add to score if correct
                System.out.println("Correct! You've score is $" + PRIZE_AMOUNT + ". Total score: $" + totalScore);
            } else {
                System.out.println("Wrong answer! Game over. Your total score is $" + totalScore);
                return; // End the game
            }
        }

        // End of game
        System.out.println("Congratulations! You've answered all questions correctly. Your total score is $" + totalScore);
    }


    public static Question[] selectQuestionSet(char firstChar) {
        switch (firstChar) {
            case 'A': return createQuestionSetA();
            case 'B': return createQuestionSetB();
            case 'C': return createQuestionSetC();
            case 'D': return createQuestionSetD();
            case 'E': return createQuestionSetE();
            case 'F': return createQuestionSetF();
            case 'G': return createQuestionSetG();
            case 'H': return createQuestionSetH();
            case 'I': return createQuestionSetI();
            case 'J': return createQuestionSetJ();
            case 'K': return createQuestionSetK();
            case 'L': return createQuestionSetL();
            case 'M': return createQuestionSetM();
            case 'N': return createQuestionSetN();
            case 'O': return createQuestionSetO();
            case 'P': return createQuestionSetP();
            case 'Q': return createQuestionSetQ();
            case 'R': return createQuestionSetR();
            case 'S': return createQuestionSetS();
            case 'T': return createQuestionSetT();
            case 'U': return createQuestionSetU();
            case 'V': return createQuestionSetV();
            case 'W': return createQuestionSetW();
            case 'X': return createQuestionSetX();
            case 'Y': return createQuestionSetY();
            case 'Z': return createQuestionSetZ();
            default:  return createQuestionSetDefault(); // Default set if letter is not A-Z
        }
    }
    
    // Include the createQuestionSet methods (A-Z) and createQuestionSetDefault here...
    
    public static Question[] createQuestionSetA() {
        return new Question[]{
            new Question("What is the capital of Australia?", new String[]{"Sydney", "Melbourne", "Canberra", "Perth"}, 3),
            new Question("Which country is famous for its Maple Leaf?", new String[]{"Canada", "USA", "Germany", "Australia"}, 1),
            new Question("Which planet is known as the Blue Planet?", new String[]{"Mars", "Earth", "Venus", "Jupiter"}, 2),
            new Question("In which year did World War II end?", new String[]{"1939", "1941", "1945", "1950"}, 3),
            new Question("Who wrote 'Pride and Prejudice'?", new String[]{"Jane Austen", "George Orwell", "Mark Twain", "Emily Bronte"}, 1),
            new Question("What is the boiling point of water?", new String[]{"100°C", "80°C", "120°C", "50°C"}, 1),
            new Question("Who painted the Mona Lisa?", new String[]{"Vincent Van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Claude Monet"}, 2),
            new Question("Which gas is most abundant in the Earth's atmosphere?", new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Helium"}, 3),
            new Question("What is the capital city of Japan?", new String[]{"Kyoto", "Tokyo", "Osaka", "Hiroshima"}, 2),
            new Question("Who developed the theory of general relativity?", new String[]{"Isaac Newton", "Albert Einstein", "Galileo", "Marie Curie"}, 2)
        };
    }
    
    public static Question[] createQuestionSetB() {
        return new Question[]{
            new Question("What is the currency of Brazil?", new String[]{"Dollar", "Real", "Peso", "Euro"}, 2),
            new Question("Who discovered gravity?", new String[]{"Isaac Newton", "Albert Einstein", "Galileo", "Copernicus"}, 1),
            new Question("Which planet is closest to the Sun?", new String[]{"Venus", "Mars", "Mercury", "Jupiter"}, 3),
            new Question("What is the largest ocean on Earth?", new String[]{"Atlantic", "Indian", "Arctic", "Pacific"}, 4),
            new Question("Which element is represented by the symbol 'O'?", new String[]{"Oxygen", "Gold", "Iron", "Magnesium"}, 1),
            new Question("Who was the first President of the USA?", new String[]{"Abraham Lincoln", "George Washington", "Thomas Jefferson", "John Adams"}, 2),
            new Question("Which country hosted the 2016 Olympics?", new String[]{"China", "Brazil", "Japan", "USA"}, 2),
            new Question("Who invented the telephone?", new String[]{"Alexander Graham Bell", "Thomas Edison", "Nikola Tesla", "Albert Einstein"}, 1),
            new Question("Which country is known for the Eiffel Tower?", new String[]{"Spain", "France", "Germany", "Italy"}, 2),
            new Question("What is the square root of 144?", new String[]{"10", "11", "12", "13"}, 3)
        };
    }

    public static Question[] createQuestionSetC() {
        return new Question[]{
            new Question("What is the capital of Canada?", new String[]{"Ottawa", "Toronto", "Vancouver", "Montreal"}, 1),
            new Question("Which metal is liquid at room temperature?", new String[]{"Iron", "Mercury", "Copper", "Aluminium"}, 2),
            new Question("What is the fastest land animal?", new String[]{"Cheetah", "Lion", "Tiger", "Horse"}, 1),
            new Question("Who was the first man to step on the moon?", new String[]{"Buzz Aldrin", "Yuri Gagarin", "Neil Armstrong", "John Glenn"}, 3),
            new Question("Which country is famous for pizza?", new String[]{"France", "Italy", "Germany", "Spain"}, 2),
            new Question("Which is the smallest planet in the solar system?", new String[]{"Venus", "Mars", "Mercury", "Earth"}, 3),
            new Question("Which chemical element has the symbol 'H'?", new String[]{"Helium", "Hydrogen", "Oxygen", "Nitrogen"}, 2),
            new Question("What is the tallest mountain in the world?", new String[]{"K2", "Kangchenjunga", "Mount Everest", "Makalu"}, 3),
            new Question("Who wrote 'To Kill a Mockingbird'?", new String[]{"Mark Twain", "Harper Lee", "George Orwell", "Ernest Hemingway"}, 2),
            new Question("What is the speed of light?", new String[]{"299,792,458 meters per second", "150,000,000 meters per second", "100,000,000 meters per second", "299,792 kilometers per second"}, 1)
        };
    }

    public static Question[] createQuestionSetD() {
        return new Question[]{
            new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Venus", "Jupiter"}, 2),
            new Question("What is the chemical symbol for gold?", new String[]{"Au", "Ag", "Fe", "Hg"}, 1),
            new Question("Who was the first female Prime Minister of the UK?", new String[]{"Theresa May", "Margaret Thatcher", "Angela Merkel", "Indira Gandhi"}, 2),
            new Question("What is the square root of 169?", new String[]{"12", "13", "14", "15"}, 2),
            new Question("Who is known as the father of computers?", new String[]{"Alan Turing", "Charles Babbage", "Steve Jobs", "Bill Gates"}, 2),
            new Question("Which gas is necessary for photosynthesis?", new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"}, 2),
            new Question("Who discovered penicillin?", new String[]{"Alexander Fleming", "Marie Curie", "Isaac Newton", "Albert Einstein"}, 1),
            new Question("Which country is home to the Great Barrier Reef?", new String[]{"Australia", "New Zealand", "Fiji", "Indonesia"}, 1),
            new Question("Who painted the ceiling of the Sistine Chapel?", new String[]{"Michelangelo", "Leonardo da Vinci", "Raphael", "Donatello"}, 1),
            new Question("In which year did the Titanic sink?", new String[]{"1912", "1905", "1920", "1915"}, 1)
        };
    }
    public static Question[] createQuestionSetE() {
        return new Question[]{
            new Question("What is the capital of Egypt?", new String[]{"Cairo", "Alexandria", "Giza", "Luxor"}, 1),
            new Question("Which element is represented by the symbol 'E'?", new String[]{"Einsteinium", "Europium", "Erbium", "Estradiol"}, 1),
            new Question("Who wrote the novel 'East of Eden'?", new String[]{"John Steinbeck", "F. Scott Fitzgerald", "Ernest Hemingway", "Jane Austen"}, 1),
            new Question("What is the largest living species of lizard?", new String[]{"Komodo dragon", "Saltwater crocodile", "Black mamba", "Green anaconda"}, 1),
            new Question("Which country is known for its Easter Island?", new String[]{"Chile", "Argentina", "Brazil", "Peru"}, 1),
            new Question("Who was the first President of the European Commission?", new String[]{"Walter Hallstein", "Jean Monnet", "Robert Schuman", "Konrad Adenauer"}, 1),
            new Question("What is the chemical formula for ethanol?", new String[]{"C2H5OH", "C2H6O", "CH3OH", "CH4O"}, 1),
            new Question("Which ancient city was the capital of the Inca Empire?", new String[]{"Cuzco", "Machu Picchu", "Lima", "Santiago"}, 1),
            new Question("Who wrote the play 'Electra'?", new String[]{"Sophocles", "Euripides", "Aeschylus", "Aristophanes"}, 1),
            new Question("What is the smallest country in Europe?", new String[]{"Vatican City", "Monaco", "San Marino", "Liechtenstein"}, 1)
        };
    }

    public static Question[] createQuestionSetF() {
        return new Question[]{
            new Question("What is the capital of France?", new String[]{"Paris", "Lyon", "Marseille", "Bordeaux"}, 1),
            new Question("Which element is represented by the symbol 'F'?", new String[]{"Fluorine", "Francium", "Fermium", "Flerovium"}, 1),
            new Question("Who wrote the novel 'Frankenstein'?", new String[]{"Mary Shelley", "Jane Austen", "Charlotte Bronte", "Emily Bronte"}, 1),
            new Question("What is the largest living species of frog?", new String[]{"Goliath frog", "African bullfrog", "American bullfrog", "European common frog"}, 1),
            new Question("Which country is known for its Ferrari cars?", new String[]{"Italy", "Germany", "France", "Spain"}, 1),
            new Question("Who was the first female astronaut in space?", new String[]{"Valentina Tereshkova", "Sally Ride", "Helen Sharman", "Claudie Haignere"}, 1),
            new Question("What is the chemical formula for formaldehyde?", new String[]{"HCHO", "CH3OH", "C2H5OH", "CH4O"}, 1),
            new Question("Which ancient city was the capital of the Frankish Empire?", new String[]{"Soissons", "Reims", "Paris", "Tournai"}, 1),
            new Question("Who wrote the play 'Faust'?", new String[]{"Johann Wolfgang von Goethe", "Friedrich Schiller", "Gotthold Ephraim Lessing", "Heinrich Heine"}, 1),
            new Question("What is the smallest bird in the world?", new String[]{"Bee hummingbird", "Bumblebee hummingbird", "Fairy bluebird", "Fairy pitta"}, 1)
        };
    }
    public static Question[] createQuestionSetG() {
        return new Question[]{
            new Question("What is the capital of Greece?", new String[]{"Athens", "Thessaloniki", "Patras", "Heraklion"}, 1),
            new Question("Which gas do plants absorb from the atmosphere?", new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"}, 2),
            new Question("Who painted the 'Girl with a Pearl Earring'?", new String[]{"Johannes Vermeer", "Pablo Picasso", "Vincent Van Gogh", "Claude Monet"}, 1),
            new Question("What is the largest continent on Earth?", new String[]{"Africa", "Asia", "North America", "Europe"}, 2),
            new Question("Which instrument is used to measure atmospheric pressure?", new String[]{"Thermometer", "Barometer", "Hygrometer", "Anemometer"}, 2),
            new Question("Who is known as the 'Father of Geometry'?", new String[]{"Euclid", "Archimedes", "Pythagoras", "Newton"}, 1),
            new Question("What is the hardest natural substance on Earth?", new String[]{"Gold", "Iron", "Diamond", "Quartz"}, 3),
            new Question("Which planet is known for its rings?", new String[]{"Earth", "Mars", "Saturn", "Jupiter"}, 3),
            new Question("What is the main ingredient in guacamole?", new String[]{"Tomato", "Avocado", "Pepper", "Onion"}, 2),
            new Question("Which ocean is the largest?", new String[]{"Atlantic", "Indian", "Arctic", "Pacific"}, 4)
        };
    }

    public static Question[] createQuestionSetH() {
        return new Question[]{
            new Question("What is the capital of Hungary?", new String[]{"Budapest", "Prague", "Bratislava", "Warsaw"}, 1),
            new Question("Which vitamin is produced when a person is exposed to sunlight?", new String[]{"Vitamin A", "Vitamin B12", "Vitamin C", "Vitamin D"}, 4),
            new Question("Who discovered the law of gravity?", new String[]{"Isaac Newton", "Albert Einstein", "Galileo Galilei", "Niels Bohr"}, 1),
            new Question("What is the chemical symbol for hydrogen?", new String[]{"H", "He", "O", "N"}, 1),
            new Question("Which mammal is known to lay eggs?", new String[]{"Platypus", "Dolphin", "Kangaroo", "Elephant"}, 1),
            new Question("What is the largest organ in the human body?", new String[]{"Heart", "Liver", "Skin", "Lung"}, 3),
            new Question("Which country is known as the Land of the Midnight Sun?", new String[]{"Norway", "Sweden", "Finland", "Iceland"}, 1),
            new Question("What is the primary language spoken in Brazil?", new String[]{"Spanish", "Portuguese", "English", "French"}, 2),
            new Question("Who wrote 'Hamlet'?", new String[]{"Charles Dickens", "William Shakespeare", "Leo Tolstoy", "Mark Twain"}, 2),
            new Question("What is the largest desert in the world?", new String[]{"Sahara", "Arabian", "Gobi", "Antarctic"}, 4)
        };
    }

    public static Question[] createQuestionSetI() {
        return new Question[]{
            new Question("What is the capital of Italy?", new String[]{"Rome", "Milan", "Venice", "Florence"}, 1),
            new Question("Which Italian city is famous for its canals?", new String[]{"Rome", "Venice", "Milan", "Naples"}, 2),
            new Question("What is the main ingredient in risotto?", new String[]{"Wheat", "Rice", "Barley", "Corn"}, 2),
            new Question("Who painted the Sistine Chapel ceiling?", new String[]{"Leonardo da Vinci", "Michelangelo", "Raphael", "Caravaggio"}, 2),
            new Question("Which ancient civilization built the pyramids?", new String[]{"Greeks", "Romans", "Egyptians", "Mayans"}, 3),
            new Question("What is the Italian word for 'hello'?", new String[]{"Ciao", "Hola", "Bonjour", "Hallo"}, 1),
            new Question("What is the currency of Italy?", new String[]{"Euro", "Lira", "Dollar", "Pound"}, 1),
            new Question("Which Italian city is known for its art and architecture?", new String[]{"Florence", "Milan", "Rome", "Venice"},  1),
            new Question("Who wrote 'Inferno'?", new String[]{"Dante Alighieri", "Giovanni Boccaccio", "Petrarch", "Niccolò Machiavelli"}, 1),
            new Question("What is the largest island in the Mediterranean Sea?", new String[]{"Sicily", "Sardinia", "Corsica", "Crete"}, 1)
        };
    }

    public static Question[] createQuestionSetJ() {
        return new Question[]{
            new Question("What is the capital of Japan?", new String[]{"Tokyo", "Osaka", "Nagoya", "Sapporo"}, 1),
            new Question("Which Japanese city is famous for its electronics?", new String[]{"Tokyo", "Osaka", "Nagoya", "Akihabara"}, 1),
            new Question("What is the main ingredient in sushi?", new String[]{"Rice", "Fish", "Seaweed", "Soy sauce"}, 1),
            new Question("Who is the founder of the Japanese company Sony?", new String[]{"Masaru Ibuka", "Akio Morita", "Soichiro Honda", "Jusuke Shibuno"}, 2),
            new Question("Which Japanese martial art is known for its emphasis on discipline?", new String[]{"Karate", "Judo", "Aikido", "Kendo"}, 1),
            new Question("What is the Japanese word for 'goodbye'?", new String[]{"Sayonara", "Arigatou", "Konnichiwa", "Ohayou"}, 1),
            new Question("What is the currency of Japan?", new String[]{"Yen", "Dollar", "Euro", "Pound"}, 1),
            new Question("Which Japanese city is known for its temples and shrines?", new String[]{"Kyoto", "Tokyo", "Osaka", "Nara"}, 1),
            new Question("Who wrote 'The Tale of Genji'?", new String[]{"Murasaki Shikibu", "Yoshida Kenko", "Bashō", "Hokusai"}, 1),
            new Question("What is the largest island in Japan?", new String[]{"Honshu", "Hokkaido", "Kyushu", "Shikoku"}, 1)
        };
    }

    public static Question[] createQuestionSetK() {
        return new Question[]{
            new Question("What is the capital of Kenya?", new String[]{"Nairobi", "Mombasa", "Kisumu", "Eldoret"}, 1),
            new Question("Which African country is known for its coffee?", new String[]{"Ethiopia", "Kenya", "Tanzania", "Uganda"}, 2),
            new Question("What is the main ingredient in kimchi?", new String[]{"Cabbage", "Carrot", "Onion", "Garlic"}, 1),
            new Question("Who is the founder of the Korean company Samsung?", new String[]{"Lee Byung-chul", "Chung Ju-yung", "Kim Woo-choong", "Shin Kyuk-ho"}, 1),
            new Question("Which Korean martial art is known for its emphasis on kicking?", new String[]{"Taekwondo", "Karate", "Judo", "Kendo"}, 1),
            new Question("What is the Korean word for 'hello'?", new String[]{"Annyeonghaseyo", "Konnichiwa", "Ni hao", "Bonjour"}, 1),
            new Question("What is the currency of South Korea?", new String[]{"Won", "Dollar", "Euro", "Yen"}, 1),
            new Question("Which Korean city is known for its technology and innovation?", new String[]{"Seoul", "Busan", "Daegu", "Incheon"}, 1),
            new Question("Who wrote 'The Korea Times'?", new String[]{"Hwang Jong-yong", "Kim Dong-choon", "Park Jin-hee", "Lee O-young"}, 1),
            new Question("What is the largest island in Korea?", new String[]{"Jeju Island", "Ganghwa Island", "Geoje Island", "Heuksando Island"}, 1)
        };
    }

    public static Question[] createQuestionSetL() {
        return new Question[]{
            new Question("What is the capital of Luxembourg?", new String[]{"Luxembourg City", "Esch-sur-Alzette", "Differdange", "Echternach"}, 1),
            new Question("Which European country is known for its chocolate?", new String[]{"Belgium", "Switzerland", "France", "Luxembourg"}, 1),
            new Question("What is the main ingredient in lasagna?", new String[]{"Pasta", "Meat", "Cheese", "Tomato sauce"}, 1),
            new Question("Who is the founder of the Linux operating system?", new String[]{"Linus Torvalds", "Richard Stallman", "Steve Jobs", "Bill Gates"}, 1),
            new Question("Which language is spoken in Luxembourg?", new String[]{"Luxembourgish", "French", "German", "English"}, 1),
            new Question("What is the Luxembourgish word for 'hello'?", new String[]{"Moï", "Bonjour", "Guten Tag", "Hello"}, 1),
            new Question("What is the currency of Luxembourg?", new String[]{"Euro", "Dollar", "Pound", "Franc"}, 1),
            new Question("Which Luxembourgish city is known for its medieval architecture?", new String[]{"Luxembourg City", "Esch-sur-Alzette", "Differdange", "Echternach"}, 1),
            new Question("Who wrote 'The Luxembourg Times'?", new String[]{"Unknown", "Jean-Claude Juncker", "Xavier Bettel", "Etienne Schneider"}, 1),
            new Question("What is the largest city in Luxembourg?", new String[]{"Luxembourg City", "Esch-sur-Alzette", "Differdange", "Echternach"}, 1)
        };
    }

    public static Question[] createQuestionSetM() {
        return new Question[]{
            new Question("What is the capital of Mexico?", new String[]{"Mexico City", "Guadalajara", "Monterrey", "Puebla"}, 1),
            new Question("Which ancient civilization built the pyramids of Teotihuacan?", new String[]{"Aztecs", "Mayans", "Olmecs", "Toltecs"}, 4),
            new Question("What is the main ingredient in mole?", new String[]{"Chocolate", "Cinnamon", "Cumin", "Coriander"}, 1),
            new Question("Who is the founder of the Mexican company Cemex?", new String[]{"Lorenzo Zambrano", "Carlos Slim", "Ricardo Salinas", "Emilio Azcárraga"}, 1),
            new Question("Which Mexican holiday is celebrated on November 1st?", new String[]{"Día de los Muertos", "Cinco de Mayo", "Navidad", "Semana Santa"}, 1),
            new Question("What is the Mexican word for 'hello'?", new String[]{"Hola", "Buenos días", "Buenas tardes", "Buenas noches"}, 1),
            new Question("What is the currency of Mexico?", new String[]{"Peso", "Dollar", "Euro", "Pound"}, 1),
            new Question("Which Mexican city is known for its beaches and resorts?", new String[]{"Cancun", "Tulum", "Playa del Carmen", "Cozumel"}, 1),
            new Question("Who wrote 'The Labyrinth of Solitude'?", new String[]{"Octavio Paz", "Carlos Fuentes", "Juan Rulfo", "Laura Esquivel"}, 1),
            new Question("What is the largest state in Mexico?", new String[]{"Chihuahua", "Sonora", "Sinaloa", "Durango"}, 1)
        };
    }

    public static Question[] createQuestionSetN() {
        return new Question[]{
            new Question("What is the capital of Norway?", new String[]{"Oslo", "Bergen", "Trondheim", "Stavanger"}, 1),
            new Question("Which Norwegian explorer discovered the South Pole?", new String[]{"Roald Amundsen", "Robert Falcon Scott", "Ernest Shackleton", "Fridtjof Nansen"}, 1),
            new Question("What is the main ingredient in Norwegian brown cheese?", new String[]{"Goat's milk", "Cow's milk", "Sheep's milk", "Reindeer milk"}, 1),
            new Question("Who is the founder of the Norwegian company Statoil?", new String[]{"Unknown", "Harald Norvik", "Helge Lund", "Eldar Sætre"}, 1),
            new Question("Which Norwegian festival is celebrated on May 17th?", new String[]{"Syttende Mai", "Midsummer", "Easter", "Christmas"}, 1),
            new Question("What is the Norwegian word for 'hello'?", new String[]{"Hei", "Hallo", "Hej", "Hi"}, 1),
            new Question("What is the currency of Norway?", new String[]{"Krone", "Dollar", "Euro", "Pound"}, 1),
            new Question("Which Norwegian city is known for its fjords and waterfalls?", new String[]{"Flåm", "Geiranger", "Ålesund", "Bergen"}, 1),
            new Question("Who wrote 'Peer Gynt'?", new String[]{"Henrik Ibsen", "Bjørnstjerne Bjørnson", " Jonas Lie", "Alexander Kielland"}, 1),
            new Question("What is the largest island in Norway?", new String[]{"Spitsbergen", "Senja", "Kvaløya", "Ringvassøy"}, 1)
        };
    }

    public static Question[] createQuestionSetO() {
        return new Question[]{
            new Question("What is the capital of Oman?", new String[]{"Muscat", "Salalah", "Sohar", "Nizwa"}, 1),
            new Question("Which ancient city was the capital of the Oman Empire?", new String[]{"Muscat", "Salalah", "Sohar", "Nizwa"}, 1),
            new Question("What is the main ingredient in Omani halwa?", new String[]{"Dates", "Nuts", "Spices", "Flour"}, 1),
            new Question("Who is the Sultan of Oman?", new String[]{"Haitham bin Tariq Al Said", "Qaboos bin Said Al Said", "Fahd bin Mahmoud Al Said", "Shihab bin Tariq Al Said"}, 1),
            new Question("Which Omani festival is celebrated on November 18th?", new String[]{"National Day", "Eid al-Fitr", "Eid al-Adha", "Nowruz"}, 1),
            new Question("What is the Omani word for 'hello'?", new String[]{"مرحبا (Marhaba)", "سلام (Salaam)", "هلا (Halla)", "مرسي (Marssi)"}, 1),
            new Question("What is the currency of Oman?", new String[]{"Rial", "Dollar", "Euro", "Pound"}, 1),
            new Question("Which Omani city is known for its souks and traditional architecture?", new String[]{"Muscat", "Salalah", "Sohar", "Nizwa"}, 1),
            new Question("Who wrote 'The History of Oman'?", new String[]{"Unknown", "John C. Wilkinson", "Uzi Rabi", "J.E. Peterson"}, 1),
            new Question("What is the largest city in Oman?", new String[]{"Muscat", "Salalah", "Sohar", "Nizwa"}, 1)
        };
    }

    public static Question[] createQuestionSetP() {
        return new Question[]{
            new Question("What is the capital of Peru?", new String[]{"Lima", "Cusco", "Arequipa", "Trujillo"}, 1),
            new Question("Which ancient civilization built Machu Picchu?", new String[]{"Incas", "Aztecs", "Mayans", "Chavin"}, 1),
            new Question("What is the main ingredient in Peruvian ceviche?", new String[]{"Fish", "Shrimp", "Octopus", "Crab"}, 1),
            new Question("Who is the founder of the Peruvian company Backus?", new String[]{"Unknown", "Enrique Ayulo", "José Andrés", "Francisco Pardo"}, 1),
            new Question("Which Peruvian festival is celebrated on June 24th?", new String[]{"Inti Raymi", "Fiestas de la Vendimia", "Fiestas Patrias", "Navidad"}, 1),
            new Question("What is the Peruvian word for 'hello'?", new String[]{"Hola", "Buenos días", "Buenas tardes", "Buenas noches"}, 1),
            new Question("What is the currency of Peru?", new String[]{"Sol", "Dollar", "Euro", "Pound"}, 1),
            new Question("Which Peruvian city is known for its textiles and traditional crafts?", new String[]{"Cusco", "Lima", "Arequipa", "Puno"}, 1),
            new Question("Who wrote 'The Royal Commentaries of the Incas'?", new String[]{"Inca Garcilaso de la Vega", "Pedro Cieza de León", "Juan de Betanzos", "Diego de Landa"}, 1),
            new Question("What is the largest city in Peru?", new String[]{"Lima", "Cusco", "Arequipa", "Trujillo"}, 1)
        };
    }

    public static Question[] createQuestionSetQ() {
        return new Question[]{
            new Question("What is the capital of Qatar?", new String[]{"Doha", "Al Wakrah", "Al Rayyan", "Umm Salal"}, 1),
            new Question("Which ancient city was the capital of the Qatar Empire?", new String[]{"Al Zubarah", "Al Thakira", "Umm Salal", "Al Wakrah"}, 1),
            new Question("What is the main ingredient in Qatari machboos?", new String[]{"Rice", "Meat", "Spices", "Vegetables"}, 1),
            new Question("Who is the Emir of Qatar?", new String[]{"Tamim bin Hamad Al Thani", "Hamad bin Khalifa Al Thani", "Khalifa bin Hamad Al Thani", "Abdullah bin Jassim Al Thani"}, 1),
            new Question("Which Qatari festival is celebrated on December 18th?", new String[]{"National Day", "Eid al-Fitr", "Eid al-Adha", "Nowruz"}, 1),
            new Question("What is the Qatari word for 'hello'?", new String[]{"مرحبا (Marhaba)", "سلام (Salaam)", "هلا (Halla)", "مرسي (Marssi)"}, 1),
            new Question("What is the currency of Qatar?", new String[]{"Riyal", "Dollar", "Euro", "Pound"}, 1),
            new Question("Which Qatari city is known for its souks and traditional architecture?", new String[]{"Doha", "Al Wakrah", "Al Rayyan", "Umm Salal"}, 1),
            new Question("Who wrote 'The History of Qatar'?", new String[]{"Unknown", "J.G. Lorimer", "Uzi Rabi", "J.E. Peterson"}, 1),
            new Question("What is the largest city in Qatar?", new String[]{"Doha", "Al Wakrah", "Al Rayyan", "Umm Salal"}, 1)
        };
    }

    public static Question[] createQuestionSetR() {
        return new Question[]{
            new Question("What is the capital of Romania?", new String[]{"Bucharest", "Cluj-Napoca", "Timișoara", "Iași"}, 1),
            new Question("Which ancient civilization built the city of Alba Iulia?", new String[]{"Dacians", "Romans", "Greeks", "Slavs"}, 1),
            new Question("What is the main ingredient in Romanian sarmale?", new String[]{"Meat", "Rice", "Cabbage", "Onion"}, 1),
            new Question("Who is the founder of the Romanian company Dacia?", new String[]{"Unknown", "Renault", "Volkswagen", "Ford"}, 1),
            new Question("Which Romanian festival is celebrated on December 1st?", new String[]{"National Day", "Easter", "Christmas", "New Year's Eve"}, 1),
            new Question("What is the Romanian word for 'hello'?", new String[]{"Bună ziua", "Bună dimineața", "Bună seara", "La revedere"}, 1),
            new Question("What is the currency of Romania?", new String[]{"Leu", "Dollar", "Euro", "Pound"}, 1),
            new Question("Which Romanian city is known for its medieval architecture?", new String[]{"Brașov", "Sibiu", "Sighișoara", "Târgu Mureș"}, 1),
            new Question("Who wrote 'The History of Romania'?", new String[]{"Unknown", "Nicolae Iorga", "Vlad Georgescu", "Ștefan Pascu"}, 1),
            new Question("What is the largest city in Romania?", new String[]{"Bucharest", "Cluj-Napoca", "Timișoara", "Iași"}, 1)
        };
    }

    public static Question[] createQuestionSetS() {
        return new Question[]{
            new Question("What is the capital of Saudi Arabia?", new String[]{"Riyadh", "Jeddah", "Mecca", "Medina"}, 1),
            new Question("Which ancient city was the capital of the Saudi Empire?", new String[]{"Diriyah", "Riyadh", "Jeddah", "Mecca"}, 1),
            new Question("What is the main ingredient in Saudi Arabian kebabs?", new String[]{"Lamb", "Chicken", "Beef", "Fish"}, 1),
            new Question("Who is the King of Saudi Arabia?", new String[]{"Salman bin Abdulaziz Al Saud", "Abdullah bin Abdulaziz Al Saud", "Fahd bin Abdulaziz Al Saud", "Khalid bin Abdulaziz Al Saud"}, 1),
            new Question("Which Saudi Arabian festival is celebrated on September 23rd?", new String[]{"National Day", "Eid al-Fitr", "Eid al-Adha", "Nowruz"}, 1),
            new Question("What is the Saudi Arabian word for 'hello'?", new String[]{"مرحبا (Marhaba)", "سلام (Salaam)", "هلا (Halla)", "مرسي (Marssi)"}, 1),
            new Question("What is the currency of Saudi Arabia?", new String[]{"Riyal", "Dollar", "Euro", "Pound"}, 1),
            new Question("Which Saudi Arabian city is known for its holy sites?", new String[]{"Mecca", "Medina", "Riyadh", "Jeddah"}, 1),
            new Question("Who wrote 'The History of Saudi Arabia'?", new String[]{"Unknown", "Hatoon al-Fassi", "Madawi Al-Rasheed", "Robert Lacey"}, 1),
            new Question("What is the largest city in Saudi Arabia?", new String[]{"Riyadh", "Jeddah", "Mecca", "Medina"}, 1)
        };
    }

    public static Question[] createQuestionSetT() {
        return new Question[]{
            new Question("What is the capital of Turkey?", new String[]{"Ankara", "Istanbul", "Izmir", "Bursa"}, 1),
            new Question("Which ancient civilization built the city of Ephesus?", new String[]{"Greeks", "Romans", "Ottomans", "Hittites"}, 1),
            new Question("What is the main ingredient in Turkish doner kebab?", new String[]{"Lamb", "Beef", "Chicken", "Vegetables"}, 1),
            new Question("Who is the founder of the Turkish company Turkcell?", new String[]{"Unknown", "Mehmet Emin Karamehmet", "Cem Uzan", "Fatih Özmen"}, 1),
            new Question("Which Turkish festival is celebrated on October 29th?", new String[]{"Republic Day", "Eid al-Fitr", "Eid al-Adha", "Nowruz"}, 1),
            new Question("What is the Turkish word for 'hello'?", new String[]{"Merhaba", "Selam", "İyi bayramlar", "İyi akşamlar"}, 1),
            new Question("What is the currency of Turkey?", new String[]{"Lira", "Dollar", "Euro", "Pound"}, 1),
            new Question("Which Turkish city is known for its historic mosques?", new String[]{"Istanbul", "Ankara", "Izmir", "Bursa"}, 1),
            new Question("Who wrote 'The History of Turkey'?", new String[]{"Unknown", "İlber Ortaylı", "Halil İnalcık", "Norman Stone"}, 1),
            new Question("What is the largest city in Turkey?", new String[]{"Istanbul", "Ankara", "Izmir", "Bursa"}, 1)
        };
    }

    public static Question[] createQuestionSetU() {
        return new Question[]{
            new Question("What is the capital of Uganda?", new String[]{"Kampala", "Entebbe", "Jinja", "Mbarara"}, 1),
            new Question("Which ancient kingdom was located in Uganda?", new String[]{"Buganda", "Bunyoro", "Ankole", "Toro"}, 1),
            new Question("What is the main ingredient in Ugandan matooke?", new String[]{"Bananas", "Cassava", "Potatoes", "Sweet potatoes"}, 1),
            new Question("Who is the President of Uganda?", new String[]{"Yoweri Museveni", "Milton Obote", "Idi Amin", "Paul Kagame"}, 1),
            new Question("Which Ugandan festival is celebrated on October 9th?", new String[]{"Independence Day", "Eid al-Fitr", "Eid al-Adha", "Nowruz"}, 1),
            new Question("What is the Ugandan word for 'hello'?", new String[]{"Jambo", "Habari", "Mzuri", "Sawa"}, 1),
            new Question("What is the currency of Uganda?", new String[]{"Shilling", "Dollar", "Euro", "Pound"}, 1),
            new Question("Which Ugandan city is known for its national parks?", new String[]{"Kampala", "Entebbe", "Jinja", "Mbarara"}, 1),
            new Question("Who wrote 'The History of Uganda'?", new String[]{"Unknown", "Samwiri Lwanga-Lunyiigo", "John A. Rowe", "M.S.M. Kiwanuka"}, 1),
            new Question("What is the largest city in Uganda?", new String[]{"Kampala", "Entebbe", "Jinja", "Mbarara"}, 1)
        };
    }

    public static Question[] createQuestionSetV() {
        return new Question[]{
            new Question("What is the capital of Vietnam?", new String[]{"Hanoi", "Ho Chi Minh City", "Da Nang", "Hue"}, 1),
            new Question("Which ancient dynasty ruled Vietnam?", new String[]{"Nguyen", "Tran", "Ly", "Ho"}, 1 ),
            new Question("What is the main ingredient in Vietnamese pho?", new String[]{"Beef", "Chicken", "Pork", "Shrimp"}, 1),
            new Question("Who is the founder of the Vietnamese company Vinamilk?", new String[]{"Unknown", "Trần Quang Đạo", "Nguyễn Đình Cung", "Lê Văn Kiểm"}, 1),
            new Question("Which Vietnamese festival is celebrated on January 1st?", new String[]{"Tết Nguyên Đán", "Eid al-Fitr", "Eid al-Adha", "Nowruz"}, 1),
            new Question("What is the Vietnamese word for 'hello'?", new String[]{"Xin chào", "Chào anh", "Chào chị", "Tạm biệt"}, 1),
            new Question("What is the currency of Vietnam?", new String[]{"Dong", "Dollar", "Euro", "Pound"}, 1),
            new Question("Which Vietnamese city is known for its ancient architecture?", new String[]{"Hoi An", "Hue", "Hanoi", "Ho Chi Minh City"}, 1),
            new Question("Who wrote 'The History of Vietnam'?", new String[]{"Unknown", "Nguyễn Khắc Viện", "Trần Huy Liệu", "Phan Huy Lê"}, 1),
            new Question("What is the largest city in Vietnam?", new String[]{"Ho Chi Minh City", "Hanoi", "Da Nang", "Hue"}, 1)
        };
    }

    public static Question[] createQuestionSetW() {
        return new Question[]{
            new Question("What is the capital of Wales?", new String[]{"Cardiff", "Swansea", "Newport", "Bangor"}, 1),
            new Question("Which ancient tribe inhabited Wales?", new String[]{"Celts", "Romans", "Vikings", "Anglo-Saxons"}, 1),
            new Question("What is the main ingredient in Welsh rarebit?", new String[]{"Cheese", "Bread", "Eggs", "Meat"}, 1),
            new Question("Who is the founder of the Welsh company Brains Brewery?", new String[]{"Unknown", "Samuel Arthur Brain", "William Brain", "John Brain"}, 1),
            new Question("Which Welsh festival is celebrated on March 1st?", new String[]{"St. David's Day", "Eid al-Fitr", "Eid al-Adha", "Nowruz"}, 1),
            new Question("What is the Welsh word for 'hello'?", new String[]{"Shwmae", "Croeso", "Helo", "Bore da"}, 1),
            new Question("What is the currency of Wales?", new String[]{"Pound", "Dollar", "Euro", "Yen"}, 1),
            new Question("Which Welsh city is known for its castles?", new String[]{"Caernarfon", "Conwy", "Cardiff", "Swansea"}, 1),
            new Question("Who wrote 'The History of Wales'?", new String[]{"Unknown", "John Davies", "Gwyn Alf Williams", "Kenneth O. Morgan"}, 1),
            new Question("What is the largest city in Wales?", new String[]{"Cardiff", "Swansea", "Newport", "Bangor"}, 1)
        };
    }

    public static Question[] createQuestionSetX() {
        return new Question[]{
            new Question("What is the capital of Xinjiang?", new String[]{"Ürümqi", "Kashgar", "Aksu", "Khotan"}, 1),
            new Question("Which ancient Silk Road city was located in Xinjiang?", new String[]{"Samarkand", "Bukhara", "Khiva", "Kashgar"}, 1),
            new Question("What is the main ingredient in Xinjiang kebabs?", new String[]{"Lamb", "Beef", "Chicken", "Pork"}, 1),
            new Question("Who is the Chairman of the Xinjiang Uyghur Autonomous Region?", new String[]{"Unknown", "Shohrat Zakir", "Nur Bekri", "Zhang Chunxian"}, 1),
            new Question("Which Xinjiang festival is celebrated on March 21st?", new String[]{"Nowruz", "Eid al-Fitr", "Eid al-Adha", "Chinese New Year"}, 1),
            new Question("What is the Uyghur word for 'hello'?", new String[]{"ئەسسالامۇ ئەلەيكۇم (Assalamu alaykum)", "ئەھلى (Ehli)", "ئەھلىكۇم (Ehlikum)", "ئەھلىكىز (Ehlikiz)"}, 1),
            new Question("What is the currency of China?", new String[]{"Renminbi", "Dollar", "Euro", "Pound"}, 1),
            new Question("Which Xinjiang city is known for its ancient architecture?", new String[]{"Kashgar", "Ürümqi", "Aksu", "Khotan"}, 1),
            new Question("Who wrote 'The History of Xinjiang'?", new String[]{"Unknown", "James A. Millward", "Gardner Bovingdon", "Justin Jon Rudelson"}, 1),
            new Question("What is the largest city in Xinjiang?", new String[]{"Ürümqi", "Kashgar", "Aksu", "Khotan"}, 1)
        };
    }

    public static Question[] createQuestionSetY() {
        return new Question[]{
            new Question("What is the capital of Yemen?", new String[]{"Sana'a", "Aden", "Taiz", "Hodeida"}, 1),
            new Question("Which ancient kingdom was located in Yemen?", new String[]{"Saba", "Qataban", "Himyar", "Hadramaut"}, 1),
            new Question("What is the main ingredient in Yemeni saltah?", new String[]{"Meat", "Rice", "Vegetables", "Spices"}, 1),
            new Question("Who is the President of Yemen?", new String[]{"Unknown", "Ali Abdullah Saleh", "Abdrabbuh Mansur Hadi", "Abdul-Malik al-Houthi"}, 1),
            new Question("Which Yemeni festival is celebrated on May 22nd?", new String[]{"Unity Day", "Eid al-Fitr", "Eid al-Adha", "Nowruz"}, 1),
            new Question("What is the Yemeni word for 'hello'?", new String[]{"مرحبا (Marhaba)", "سلام (Salaam)", "هلا (Halla)", "مرسي (Marssi)"}, 1),
            new Question("What is the currency of Yemen?", new String[]{"Rial", "Dollar", "Euro", "Pound"}, 1),
            new Question("Which Yemeni city is known for its ancient architecture?", new String[]{"Sana'a", "Aden", "Taiz", "Hodeida"}, 1),
            new Question("Who wrote 'The History of Yemen'?", new String[]{"Unknown", "Robert D. Burrowes", "Manfred W. Wenner", "Paul Dresch"}, 1),
            new Question("What is the largest city in Yemen?", new String[]{"Sana'a", "Aden", "Taiz", "Hodeida"}, 1)
        };
    }

    public static Question[] createQuestionSetZ() {
        return new Question[]{
		new Question("Who was the first Emperor of India?", new String[]{"Ashoka", "Chandragupta Maurya", "Akbar", "Shivaji"}, 2),
	    new Question("Which Indian leader is known for his role in the Non-Cooperation Movement?", new String[]{"Mahatma Gandhi", "Jawaharlal Nehru", "Subhas Chandra Bose", "Sardar Patel"}, 1),
	    new Question("What is the name of the movement led by Mahatma Gandhi for India's independence?", new String[]{"Quit India Movement", "Civil Disobedience Movement", "Non-Cooperation Movement", "Swadeshi Movement"}, 1),
        new Question("In Hindu mythology, who is known as the god of destruction?", new String[]{"Brahma", "Vishnu", "Shiva", "Ganesha"}, 3),
        new Question("What is the name of the epic poem that narrates the Kurukshetra War?", new String[]{"Ramayana", "Mahabharata", "Bhagavad Gita", "Puranas"}, 2),
        new Question("What is the sacred text of Hindu philosophy that consists of a conversation between Prince Arjuna and Lord Krishna?", new String[]{"Vedas", "Upanishads", "Bhagavad Gita", "Puranas"}, 3),
        new Question("Who directed the famous Indian film 'Sholay'?", new String[]{"Rajkumar Hirani", "Satyajit Ray", "Ramesh Sippy", "Yash Chopra"}, 3),
        new Question("Which Indian movie features the song 'Jai Ho'?", new String[]{"Dabangg", "3 Idiots", "Slumdog Millionaire", "Chennai Express"}, 3),
        new Question("Who is known as the 'King of Bollywood'?", new String[]{"Aamir Khan", "Shah Rukh Khan", "Salman Khan", "Akshay Kumar"}, 2),
        new Question("Which movie is based on the life of the Indian mathematician Srinivasa Ramanujan?", new String[]{"The Man Who Knew Infinity", "A Beautiful Mind", "Good Will Hunting", "The Theory of Everything"}, 1)
        };
    }
    public static Question[] createQuestionSetDefault() {
        return new Question[]{
            new Question("What is the capital of France?", new String[]{"Paris", "London", "Berlin", "Madrid"}, 1),
            new Question("Which planet is known as the Red Planet?", new String[]{"Mars", "Venus", "Jupiter", "Saturn"}, 1),
            new Question("Who wrote 'Romeo and Juliet'?", new String[]{"William Shakespeare", "Charles Dickens", "Mark Twain", "Jane Austen"}, 1),
            new Question("What is the chemical symbol for water?", new String[]{"H2O", "O2", "CO2", "NaCl"}, 1),
            new Question("What is the largest mammal in the world?", new String[]{"Blue Whale", "Elephant", "Giraffe", "Great White Shark"}, 1),
            new Question("What year did the Titanic sink?", new String[]{"1912", "1905", "1920", "1898"}, 1),
            new Question("What is the hardest natural substance on Earth?", new String[]{"Diamond", "Gold", "Iron", "Copper"}, 1),
            new Question("Which country is known as the Land of the Rising Sun?", new String[]{"Japan", "China", "Korea", "Thailand"}, 1),
            new Question("What is the longest river in the world?", new String[]{"Nile", "Amazon", "Yangtze", "Mississippi"}, 2),
            new Question("What is the main ingredient in guacamole?", new String[]{"Avocado", "Tomato", "Onion", "Pepper"}, 1)
        };
    }  
}