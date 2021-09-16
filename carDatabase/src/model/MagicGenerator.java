package model;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author David Wandratsch
 * @version 1.0, 14.01.2021
 */

public class MagicGenerator
{
    private static String[] names_m = {"Liam","Noah","William","James","Oliver","Benjamin","Elijah","Lucas","Mason","Logan","Alexander","Ethan","Jacob","Michael","Daniel","Henry","Jackson","Sebastian","Aiden","Matthew","Samuel","David","Joseph","Carter","Owen","Wyatt","John","Jack","Luke","Jayden","Dylan","Grayson","Levi","Isaac","Gabriel","Julian","Mateo","Anthony","Jaxon","Lincoln","Joshua","Christopher","Andrew","Theodore","Caleb","Ryan","Asher","Nathan","Thomas","Leo","Isaiah","Charles","Josiah","Hudson","Christian","Hunter","Connor","Eli","Ezra","Aaron","Landon","Adrian","Jonathan","Nolan","Jeremiah","Easton","Elias","Colton","Cameron","Carson","Robert","Angel","Maverick","Nicholas","Dominic","Jaxson","Greyson","Adam","Ian","Austin","Santiago","Jordan","Cooper","Brayden","Roman","Evan","Ezekiel","Xavier","Jose","Jace","Jameson","Leonardo","Bryson","Axel","Everett","Parker","Kayden","Miles","Sawyer","Jason","Declan","Weston","Micah","Ayden","Wesley","Luca","Vincent","Damian","Zachary","Silas","Gavin","Chase","Kai","Emmett","Harrison","Nathaniel","Kingston","Cole","Tyler","Bennett","Bentley","Ryker","Tristan","Brandon","Kevin","Luis","George","Ashton","Rowan","Braxton","Ryder","Gael","Ivan","Diego","Maxwell","Max","Carlos","Kaiden","Juan","Maddox","Justin","Waylon","Calvin","Giovanni","Jonah","Abel","Jayce","Jesus","Amir","King","Beau","Camden","Alex","Jasper","Malachi","Brody","Jude","Blake","Emmanuel","Eric","Brooks","Elliot","Antonio","Abraham","Timothy","Finn","Rhett","Elliott","Edward","August","Xander","Alan","Dean","Lorenzo","Bryce","Karter","Victor","Milo","Miguel","Hayden","Graham","Grant","Zion","Tucker","Jesse","Zayden","Joel","Richard","Patrick","Emiliano","Avery","Nicolas","Brantley","Dawson","Myles","Matteo","River","Steven","Thiago","Zane","Matias","Judah","Messiah","Jeremy","Preston","Oscar","Kaleb","Alejandro","Marcus","Mark","Peter","Maximus","Barrett","Jax","Andres","Holden","Legend","Charlie","Knox","Kaden","Paxton","Kyrie","Kyle","Griffin","Josue","Kenneth","Beckett","Enzo","Adriel","Arthur","Felix","Bryan","Lukas","Paul","Brian","Colt","Caden","Leon","Archer","Omar","Israel","Aidan","Theo","Javier","Remington","Jaden","Bradley","Emilio","Colin","Riley","Cayden","Phoenix","Clayton","Simon","Ace","Nash","Derek","Rafael","Zander","Brady","Jorge","Jake","Louis","Damien","Karson","Walker","Maximiliano","Amari","Sean","Chance","Walter","Martin","Finley","Andre","Tobias","Cash","Corbin","Arlo","Iker","Erick","Emerson","Gunner","Cody","Stephen","Francisco","Killian","Dallas","Reid","Manuel","Lane","Atlas","Rylan","Jensen","Ronan","Beckham","Daxton","Anderson","Kameron","Raymond","Orion","Cristian","Tanner","Kyler","Jett","Cohen","Ricardo","Spencer","Gideon","Ali","Fernando","Jaiden","Titus","Travis","Bodhi","Eduardo","Dante","Ellis","Prince","Kane","Luka","Kash","Hendrix","Desmond","Donovan","Mario","Atticus","Cruz","Garrett","Hector","Angelo","Jeffrey","Edwin","Cesar","Zayn","Devin","Conor","Warren","Odin","Jayceon","Romeo","Julius","Jaylen","Hayes","Kayson","Muhammad","Jaxton","Joaquin","Caiden","Dakota","Major","Keegan","Sergio","Marshall","Johnny","Kade","Edgar","Leonel","Ismael","Marco","Tyson","Wade","Collin","Troy","Nasir","Conner","Adonis","Jared","Rory","Andy","Jase","Lennox","Shane","Malik","Ari","Reed","Seth","Clark","Erik","Lawson","Trevor","Gage","Nico","Malakai","Quinn","Cade","Johnathan","Sullivan","Solomon","Cyrus","Fabian","Pedro","Frank","Shawn","Malcolm","Khalil","Nehemiah","Dalton","Mathias","Jay","Ibrahim","Peyton","Winston","Kason","Zayne","Noel","Princeton","Matthias","Gregory","Sterling","Dominick","Elian","Grady","Russell","Finnegan","Ruben","Gianni","Porter","Kendrick","Leland","Pablo","Allen","Hugo","Raiden","Kolton","Remy","Ezequiel","Damon","Emanuel","Zaiden","Otto","Bowen","Marcos","Abram","Kasen","Franklin","Royce","Jonas","Sage","Philip","Esteban","Drake","Kashton","Roberto","Harvey","Alexis","Kian","Jamison","Maximilian","Adan","Milan","Phillip","Albert","Dax","Mohamed","Ronin","Kamden","Hank","Memphis","Oakley","Augustus","Drew","Moises","Armani","Rhys","Benson","Jayson","Kyson","Braylen","Corey","Gunnar","Omari","Alonzo","Landen","Armando","Derrick","Dexter","Enrique","Bruce","Nikolai","Francis","Rocco","Kairo","Royal","Zachariah","Arjun","Deacon","Skyler","Eden","Alijah","Rowen","Pierce","Uriel","Ronald","Luciano","Tate","Frederick","Kieran","Lawrence","Moses","Rodrigo","Brycen","Leonidas","Nixon","Keith","Chandler","Case","Davis","Asa","Darius","Isaias","Aden","Jaime","Landyn","Raul","Niko","Trenton","Apollo","Cairo","Izaiah","Scott","Dorian","Julio","Wilder","Santino","Dustin","Donald","Raphael","Saul","Taylor","Ayaan","Duke","Ryland","Tatum","Ahmed","Moshe","Edison","Emmitt","Cannon","Alec","Danny","Keaton","Roy","Conrad","Roland","Quentin","Lewis","Samson","Brock","Kylan","Cason","Ahmad","Jalen","Nikolas","Braylon","Kamari","Dennis","Callum","Justice","Soren","Rayan","Aarav","Gerardo","Ares","Brendan","Jamari","Kaison","Yusuf","Issac","Jasiah","Callen","Forrest","Makai","Crew","Kobe","Bo","Julien","Mathew","Braden","Johan","Marvin","Zaid","Stetson","Casey","Ty","Ariel","Tony","Zain","Callan","Cullen","Sincere","Uriah","Dillon","Kannon","Colby","Axton","Cassius","Quinton","Mekhi","Reece","Alessandro","Jerry","Mauricio","Sam","Trey","Mohammad","Alberto","Gustavo","Arturo","Fletcher","Marcelo","Abdiel","Hamza","Alfredo","Chris","Finnley","Curtis","Kellan","Quincy","Kase","Harry","Kyree","Wilson","Cayson","Hezekiah","Kohen","Neil","Mohammed","Raylan","Kaysen","Lucca","Sylas","Mack","Leonard","Lionel","Ford","Roger","Rex","Alden","Boston","Colson","Briggs","Zeke","Dariel","Kingsley","Valentino","Jamir","Salvador","Vihaan","Mitchell","Lance","Lucian","Darren","Jimmy","Alvin","Amos","Tripp","Zaire","Layton","Reese","Casen","Colten","Brennan","Korbin","Sonny","Bruno","Orlando","Devon","Huxley","Boone","Maurice","Nelson","Douglas","Randy","Gary","Lennon","Titan","Denver","Jaziel","Noe","Jefferson","Ricky","Lochlan","Rayden","Bryant","Langston","Lachlan","Clay","Abdullah","Lee","Baylor","Leandro","Ben","Kareem","Layne","Joe","Crosby","Deandre","Demetrius","Kellen","Carl","Jakob","Ridge","Bronson","Jedidiah","Rohan","Larry","Stanley","Tomas","Shiloh","Thaddeus","Watson","Baker","Vicente","Koda","Jagger","Nathanael","Carmelo","Shepherd","Graysen","Melvin","Ernesto","Jamie","Yosef","Clyde","Eddie","Tristen","Grey","Ray","Tommy","Samir","Ramon","Santana","Kristian","Marcel","Wells","Zyaire","Brecken","Byron","Otis","Reyansh","Axl","Joey","Trace","Morgan","Musa","Harlan","Enoch","Henrik","Kristopher","Talon","Rey","Guillermo","Houston","Jon","Vincenzo","Dane","Terry","Azariah","Castiel","Kye","Augustine","Zechariah","Joziah","Kamryn","Hassan","Jamal","Chaim","Bodie","Emery","Branson","Jaxtyn","Kole","Wayne","Aryan","Alonso","Brixton","Madden","Allan","Flynn","Jaxen","Harley","Magnus","Sutton","Dash","Anders","Westley","Brett","Emory","Felipe","Yousef","Jadiel","Mordechai","Dominik","Junior","Eliseo","Fisher","Harold","Jaxxon","Kamdyn","Maximo","Caspian","Kelvin","Damari","Fox","Trent","Hugh","Briar","Franco","Keanu","Terrance","Yahir","Ameer","Kaiser","Thatcher","Ishaan","Koa","Merrick","Coen","Rodney","Brayan","London","Rudy","Gordon","Bobby","Aron","Marc","Van","Anakin","Canaan","Dario","Reginald","Westin","Darian","Ledger","Leighton","Maxton","Tadeo","Valentin","Aldo","Khalid","Nickolas","Toby","Dayton","Jacoby","Billy","Gatlin","Elisha","Jabari","Jermaine","Alvaro","Marlon","Mayson","Blaze","Jeffery","Kace","Braydon","Achilles","Brysen","Saint","Xzavier","Aydin","Eugene","Adrien","Cain","Kylo","Nova","Onyx","Arian","Bjorn","Jerome","Miller","Alfred","Kenzo","Kyng","Leroy","Maison","Jordy","Stefan","Wallace","Benicio","Kendall","Zayd","Blaine","Tristian","Anson","Gannon","Jeremias","Marley","Ronnie","Dangelo","Kody","Will","Bentlee","Gerald","Salvatore","Turner","Chad","Misael","Mustafa","Konnor","Maxim","Rogelio","Zakai","Cory","Judson","Brentley","Darwin","Louie","Ulises","Dakari","Rocky","Wesson","Alfonso","Payton","Dwayne","Juelz","Duncan","Keagan","Deshawn","Bode","Bridger","Skylar","Brodie","Landry","Avi","Keenan","Reuben","Jaxx","Rene","Yehuda","Imran","Yael","Alexzander","Willie","Cristiano","Heath","Lyric","Davion","Elon","Karsyn","Krew","Jairo","Maddux","Ephraim","Ignacio","Vivaan","Aries","Vance","Boden","Lyle","Ralph","Reign","Camilo","Draven","Terrence","Idris","Ira","Javion","Jericho","Khari","Marcellus","Creed","Shepard","Terrell","Ahmir","Camdyn","Cedric","Howard","Jad","Zahir","Harper","Justus","Forest","Gibson","Zev","Alaric","Decker","Ernest","Jesiah","Torin","Benedict","Bowie","Deangelo","Genesis","Harlem","Kalel","Kylen","Bishop","Immanuel","Lian","Zavier","Archie","Davian","Gus","Kabir","Korbyn","Randall","Benton","Coleman","Markus"};
    private static String[] names_f = {"Emma","Olivia","Ava","Isabella","Sophia","Charlotte","Mia","Amelia","Harper","Evelyn","Abigail","Emily","Elizabeth","Mila","Ella","Avery","Sofia","Camila","Aria","Scarlett","Victoria","Madison","Luna","Grace","Chloe","Penelope","Layla","Riley","Zoey","Nora","Lily","Eleanor","Hannah","Lillian","Addison","Aubrey","Ellie","Stella","Natalie","Zoe","Leah","Hazel","Violet","Aurora","Savannah","Audrey","Brooklyn","Bella","Claire","Skylar","Lucy","Paisley","Everly","Anna","Caroline","Nova","Genesis","Emilia","Kennedy","Samantha","Maya","Willow","Kinsley","Naomi","Aaliyah","Elena","Sarah","Ariana","Allison","Gabriella","Alice","Madelyn","Cora","Ruby","Eva","Serenity","Autumn","Adeline","Hailey","Gianna","Valentina","Isla","Eliana","Quinn","Nevaeh","Ivy","Sadie","Piper","Lydia","Alexa","Josephine","Emery","Julia","Delilah","Arianna","Vivian","Kaylee","Sophie","Brielle","Madeline","Peyton","Rylee","Clara","Hadley","Melanie","Mackenzie","Reagan","Adalynn","Liliana","Aubree","Jade","Katherine","Isabelle","Natalia","Raelynn","Maria","Athena","Ximena","Arya","Leilani","Taylor","Faith","Rose","Kylie","Alexandra","Mary","Margaret","Lyla","Ashley","Amaya","Eliza","Brianna","Bailey","Andrea","Khloe","Jasmine","Melody","Iris","Isabel","Norah","Annabelle","Valeria","Emerson","Adalyn","Ryleigh","Eden","Emersyn","Anastasia","Kayla","Alyssa","Juliana","Charlie","Esther","Ariel","Cecilia","Valerie","Alina","Molly","Reese","Aliyah","Lilly","Parker","Finley","Morgan","Sydney","Jordyn","Eloise","Trinity","Daisy","Kimberly","Lauren","Genevieve","Sara","Arabella","Harmony","Elise","Remi","Teagan","Alexis","London","Sloane","Laila","Lucia","Diana","Juliette","Sienna","Elliana","Londyn","Ayla","Callie","Gracie","Josie","Amara","Jocelyn","Daniela","Everleigh","Mya","Rachel","Summer","Alana","Brooke","Alaina","Mckenzie","Catherine","Amy","Presley","Journee","Rosalie","Ember","Brynlee","Rowan","Joanna","Paige","Rebecca","Ana","Sawyer","Mariah","Nicole","Brooklynn","Payton","Marley","Fiona","Georgia","Lila","Harley","Adelyn","Alivia","Noelle","Gemma","Vanessa","Journey","Makayla","Angelina","Adaline","Catalina","Alayna","Julianna","Leila","Lola","Adriana","June","Juliet","Jayla","River","Tessa","Lia","Dakota","Delaney","Selena","Blakely","Ada","Camille","Zara","Malia","Hope","Samara","Vera","Mckenna","Briella","Izabella","Hayden","Raegan","Michelle","Angela","Ruth","Freya","Kamila","Vivienne","Aspen","Olive","Kendall","Elaina","Thea","Kali","Destiny","Amiyah","Evangeline","Cali","Blake","Elsie","Juniper","Alexandria","Myla","Ariella","Kate","Mariana","Lilah","Charlee","Daleyza","Nyla","Jane","Maggie","Zuri","Aniyah","Lucille","Leia","Melissa","Adelaide","Amina","Giselle","Lena","Camilla","Miriam","Millie","Brynn","Gabrielle","Sage","Annie","Logan","Lilliana","Haven","Jessica","Kaia","Magnolia","Amira","Adelynn","Makenzie","Stephanie","Nina","Phoebe","Arielle","Evie","Lyric","Alessandra","Gabriela","Paislee","Raelyn","Madilyn","Paris","Makenna","Kinley","Gracelyn","Talia","Maeve","Rylie","Kiara","Evelynn","Brinley","Jacqueline","Laura","Gracelynn","Lexi","Ariah","Fatima","Jennifer","Kehlani","Alani","Ariyah","Luciana","Allie","Heidi","Maci","Phoenix","Felicity","Joy","Kenzie","Veronica","Margot","Addilyn","Lana","Cassidy","Remington","Saylor","Ryan","Keira","Harlow","Miranda","Angel","Amanda","Daniella","Royalty","Gwendolyn","Ophelia","Heaven","Jordan","Madeleine","Esmeralda","Kira","Miracle","Elle","Amari","Danielle","Daphne","Willa","Haley","Gia","Kaitlyn","Oakley","Kailani","Winter","Alicia","Serena","Nadia","Aviana","Demi","Jada","Braelynn","Dylan","Ainsley","Alison","Camryn","Avianna","Bianca","Skyler","Scarlet","Maddison","Nylah","Sarai","Regina","Dahlia","Nayeli","Raven","Helen","Adrianna","Averie","Skye","Kelsey","Tatum","Kensley","Maliyah","Erin","Viviana","Jenna","Anaya","Carolina","Shelby","Sabrina","Mikayla","Annalise","Octavia","Lennon","Blair","Carmen","Yaretzi","Kennedi","Mabel","Zariah","Kyla","Christina","Selah","Celeste","Eve","Mckinley","Milani","Frances","Jimena","Kylee","Leighton","Katie","Aitana","Kayleigh","Sierra","Kathryn","Rosemary","Jolene","Alondra","Elisa","Helena","Charleigh","Hallie","Lainey","Avah","Jazlyn","Kamryn","Mira","Cheyenne","Francesca","Antonella","Wren","Chelsea","Amber","Emory","Lorelei","Nia","Abby","April","Emelia","Carter","Aylin","Cataleya","Bethany","Marlee","Carly","Kaylani","Emely","Liana","Madelynn","Cadence","Matilda","Sylvia","Myra","Fernanda","Oaklyn","Elianna","Hattie","Dayana","Kendra","Maisie","Malaysia","Kara","Katelyn","Maia","Celine","Cameron","Renata","Jayleen","Charli","Emmalyn","Holly","Azalea","Leona","Alejandra","Bristol","Collins","Imani","Meadow","Alexia","Edith","Kaydence","Leslie","Lilith","Kora","Aisha","Meredith","Danna","Wynter","Emberly","Julieta","Michaela","Alayah","Jemma","Reign","Colette","Kaliyah","Elliott","Johanna","Remy","Sutton","Emmy","Virginia","Briana","Oaklynn","Adelina","Everlee","Megan","Angelica","Justice","Mariam","Khaleesi","Macie","Karsyn","Alanna","Aleah","Mae","Mallory","Esme","Skyla","Madilynn","Charley","Allyson","Hanna","Shiloh","Henley","Macy","Maryam","Ivanna","Ashlynn","Lorelai","Amora","Ashlyn","Sasha","Baylee","Beatrice","Itzel","Priscilla","Marie","Jayda","Liberty","Rory","Alessia","Alaia","Janelle","Kalani","Gloria","Sloan","Dorothy","Greta","Julie","Zahra","Savanna","Annabella","Poppy","Amalia","Zaylee","Cecelia","Coraline","Kimber","Emmie","Anne","Karina","Kassidy","Kynlee","Monroe","Anahi","Jaliyah","Jazmin","Maren","Monica","Siena","Marilyn","Reyna","Kyra","Lilian","Jamie","Melany","Alaya","Ariya","Kelly","Rosie","Adley","Dream","Jaylah","Laurel","Jazmine","Mina","Karla","Bailee","Aubrie","Katalina","Melina","Harlee","Elliot","Hayley","Elaine","Karen","Dallas","Irene","Lylah","Ivory","Chaya","Rosa","Aleena","Braelyn","Nola","Alma","Leyla","Pearl","Addyson","Roselyn","Lacey","Lennox","Reina","Aurelia","Noa","Janiyah","Jessie","Madisyn","Saige","Alia","Tiana","Astrid","Cassandra","Kyleigh","Romina","Stevie","Haylee","Zelda","Lillie","Aileen","Brylee","Eileen","Yara","Ensley","Lauryn","Giuliana","Livia","Anya","Mikaela","Palmer","Lyra","Mara","Marina","Kailey","Liv","Clementine","Kenna","Briar","Emerie","Galilea","Tiffany","Bonnie","Elyse","Cynthia","Frida","Kinslee","Tatiana","Joelle","Armani","Jolie","Nalani","Rayna","Yareli","Meghan","Rebekah","Addilynn","Faye","Zariyah","Lea","Aliza","Julissa","Lilyana","Anika","Kairi","Aniya","Noemi","Angie","Crystal","Bridget","Ari","Davina","Amelie","Amirah","Annika","Elora","Xiomara","Linda","Hana","Laney","Mercy","Hadassah","Madalyn","Louisa","Simone","Kori","Jillian","Alena","Malaya","Miley","Milan","Sariyah","Malani","Clarissa","Nala","Princess","Amani","Analia","Estella","Milana","Aya","Chana","Jayde","Tenley","Zaria","Itzayana","Penny","Ailani","Lara","Aubriella","Clare","Lina","Rhea","Bria","Thalia","Keyla","Haisley","Ryann","Addisyn","Amaia","Chanel","Ellen","Harmoni","Aliana","Tinsley","Landry","Paisleigh","Lexie","Myah","Rylan","Deborah","Emilee","Laylah","Novalee","Ellis","Emmeline","Avalynn","Hadlee","Legacy","Braylee","Elisabeth","Kaylie","Ansley","Dior","Paula","Belen","Corinne","Maleah","Martha","Teresa","Salma","Louise","Averi","Lilianna","Amiya","Milena","Royal","Aubrielle","Calliope","Frankie","Natasha","Kamilah","Meilani","Raina","Amayah","Lailah","Rayne","Zaniyah","Isabela","Nathalie","Miah","Opal","Kenia","Azariah","Hunter","Tori","Andi","Keily","Leanna","Scarlette","Jaelyn","Saoirse","Selene","Dalary","Lindsey","Marianna","Ramona","Estelle","Giovanna","Holland","Nancy","Emmalynn","Mylah","Rosalee","Sariah","Zoie","Blaire","Lyanna","Maxine","Anais","Dana","Judith","Kiera","Jaelynn","Noor","Kai","Adalee","Oaklee","Amaris","Jaycee","Belle","Carolyn","Della","Karter","Sky","Treasure","Vienna","Jewel","Rivka","Rosalyn","Alannah","Ellianna","Sunny","Claudia","Cara","Hailee","Estrella","Harleigh","Zhavia","Alianna","Brittany","Jaylene","Journi","Marissa","Mavis","Iliana","Jurnee","Aislinn","Alyson","Elsa","Kamiyah","Kiana","Lisa","Arlette","Kadence","Kathleen","Halle","Erika","Sylvie","Adele","Erica","Veda","Whitney","Bexley","Emmaline","Guadalupe","August","Brynleigh","Gwen","Promise","Alisson","India","Madalynn","Paloma","Patricia","Samira","Aliya","Casey","Jazlynn","Paulina","Dulce","Kallie","Perla","Adrienne","Alora","Nataly","Ayleen","Christine","Kaiya","Ariadne","Karlee","Barbara","Lillianna","Raquel","Saniyah","Yamileth","Arely","Celia","Heavenly","Kaylin","Marisol","Marleigh","Avalyn","Berkley","Kataleya","Zainab","Dani","Egypt","Joyce","Kenley","Annabel","Kaelyn","Etta","Hadleigh","Joselyn","Luella","Jaylee","Zola","Alisha","Ezra","Queen","Amia","Annalee","Bellamy","Paola","Tinley","Violeta","Jenesis","Arden","Giana","Wendy","Ellison","Florence","Margo","Naya","Robin","Sandra","Scout","Waverly","Janessa","Jayden","Micah","Novah","Zora","Ann","Jana","Taliyah","Vada","Giavanna","Ingrid","Valery","Azaria","Emmarie","Esperanza","Kailyn","Aiyana","Keilani","Austyn","Whitley","Elina","Kimora","Maliah"};
    private static String[] car = {"BMW;250 Isetta, 300 Isetta","BMW;600","BMW;700","BMW;i3","BMW;1-Series","BMW;1-Series","BMW;1-Series","BMW;2-Series","BMW;2-Series Gran Coupé","BMW;1-Series","BMW;New Class 1602, 1802, 2002","BMW;3-Series","BMW;3-Series, M3","BMW;3-Series, M3","BMW;3-Series, M3","BMW;3-Series, M3","BMW;3-Series, M3","BMW;4-Series, M4","BMW;3-Series, M3","BMW;4-Series, M4","BMW;3-Series GT","BMW;New Class 1500, 1600, 1800, 2000","BMW;5-Series","BMW;5-Series, M5","BMW;5-Series, M5","BMW;5-Series, M5","BMW;5-Series, M5","BMW;5-Series, M5","BMW;5-Series, M5","BMW;5-Series GT","BMW;6-Series GT","BMW;New Six CS","BMW;6-Series, M6","BMW;8-Series","BMW;6-Series, M6","BMW;6-Series, M6","BMW;8-Series","BMW;501","BMW;502","BMW;503","BMW;3200 CS","BMW;New Six","BMW;7-Series","BMW;7-Series","BMW;7-Series","BMW;7-Series","BMW;7-Series","BMW;7-Series","BMW;Z1","BMW;Z3, M","BMW;Z4","BMW;Z4","BMW;Z4","BMW;507","BMW;M1","BMW;Z8","BMW;i8","BMW;X1","BMW;X1","BMW;X2","BMW;X3","BMW;X3","BMW;X3","BMW;X4","BMW;X4","BMW;X5","BMW;X5","BMW;X5","BMW;X5","BMW;X6","BMW;X6","BMW;X6","BMW;X7","Cadillac;Cimarron","Cadillac;BLS","Cadillac;ATS","Cadillac;CT4, CT4-V","Cadillac;ELR","Cadillac;Catera","Cadillac;CTS, CTS-V","Cadillac;CTS, CTS-V","Cadillac;CTS, CTS-V","Cadillac;CT5, CT5-V","Cadillac;Series 60","Cadillac;Series 61","Cadillac;Series 61","Cadillac;Series 61","Cadillac;Series 61","Cadillac;Series 65","Cadillac;Series 62","Cadillac;Series 62","Cadillac;Series 62","Cadillac;Series 62","Cadillac;Series 62","Cadillac;6200","Cadillac;6200","Cadillac;Calais","Cadillac;Calais","Cadillac;Seville","Cadillac;Seville","Cadillac;Seville","Cadillac;Seville","Cadillac;Seville","Cadillac;STS","Cadillac;Sedan de Ville","Cadillac;Sedan de Ville","Cadillac;Sedan de Ville","Cadillac;Sedan de Ville","Cadillac;Sedan de Ville","Cadillac;Sedan de Ville","Cadillac;Sedan de Ville","Cadillac;Sedan de Ville","Cadillac;DTS","Cadillac;XTS","Cadillac;CT6, CT6-V","Cadillac;Coupe de Ville","Cadillac;Coupe de Ville","Cadillac;Coupe de Ville","Cadillac;Coupe de Ville","Cadillac;Coupe de Ville","Cadillac;Coupe de Ville","Cadillac;Series 60 (Sixty Special)","Cadillac;Series 60 (Sixty Special)","Cadillac;Series 60 (Sixty Special)","Cadillac;Series 60 (Sixty Special)","Cadillac;Series 60 (Sixty Special)","Cadillac;Series 60 (Sixty Special)","Cadillac;Series 60 (Sixty Special)","Cadillac;Series 60 (Sixty Special)","Cadillac;Series 60 (Sixty Special)","Cadillac;Series 60 (Sixty Special)","Cadillac;Series 60 (Sixty Special)","Cadillac;Fleetwood Brougham","Cadillac;Brougham","Cadillac;Fleetwood","Cadillac;Fleetwood","Cadillac;Series 75","Cadillac;Series 75","Cadillac;Series 75","Cadillac;Series 75","Cadillac;Series 75","Cadillac;Series 75","Cadillac;Series 75","Cadillac;Series 75","Cadillac;Series 75","Cadillac;Series 75","Cadillac;Fleetwood Limousine","Cadillac;Fleetwood 75","Cadillac;Eldorado","Cadillac;Eldorado","Cadillac;Eldorado","Cadillac;Eldorado","Cadillac;Eldorado","Cadillac;Eldorado","Cadillac;Eldorado","Cadillac;Eldorado","Cadillac;Eldorado","Cadillac;Eldorado","Cadillac;Eldorado","Cadillac;XT4","Cadillac;SRX","Cadillac;SRX","Cadillac;XT5","Cadillac;XT6","Cadillac;Escalade","Cadillac;Escalade","Cadillac;Escalade","Cadillac;Escalade","Cadillac;Allanté","Cadillac;XLR","Kia;Picanto","Kia;Picanto","Kia;Picanto","Kia;Ray","Kia;Pride","Kia;Pride","Kia;Rio","Kia;Rio","Kia;Rio","Kia;Rio","Kia;Soul","Kia;Soul","Kia;Soul","Kia;Pegas","Kia;Avella","Kia;Cee'd","Kia;Cee'd","Kia;Cee'd","Kia;Sephia","Kia;Sephia","Kia;Cerato / Spectra","Kia;Forte","Kia;Forte / K3","Kia;Forte / K3","Kia;Shuma","Kia;K4","Kia;Concord","Kia;Clarus","Kia;Magentis / Optima","Kia;Magentis / Optima","Kia;Magentis / Optima / K5","Kia;Magentis / Optima / K5","Kia;Magentis / Optima / K5","Kia;Stinger","Kia;Potentia","Kia;Potentia","Kia;Enterprise","Kia;Opirus / Amanti","Kia;Cadenza / K7","Kia;Cadenza / K7","Kia;Quoris / K9 / K900","Kia;Quoris / K9 / K900","Kia;Elan / Vegato","Kia;Venga","Kia;Carens","Kia;Carens / Rondo","Kia;Carens / Rondo","Kia;Joice","Kia;Carnival / Sedona","Kia;Carnival / Sedona","Kia;Carnival / Sedona","Kia;Retona","Kia;Stonic","Kia;KX Cross","Kia;Seltos","Kia;Niro","Kia;Sportage","Kia;Sportage","Kia;Sportage","Kia;Sorento","Kia;Sorento","Kia;Sorento","Kia;Sorento","Kia;Mohave / Borrego","Kia;Telluride","Kia;Bongo","Kia;Bongo Frontier","Kia;Bongo","Volkswagen;Fusca","Volkswagen;Gol","Volkswagen;Gol","Volkswagen;Gol","Volkswagen;Voyage / Fox","Volkswagen;Voyage","Volkswagen;Parati","Volkswagen;Parati","Volkswagen;Fox","Volkswagen;Virtus (Polo Sedan)","Volkswagen;Brasilia","Volkswagen;Apollo","Volkswagen;Logus","Volkswagen;Pointer","Volkswagen;Santana / Corsar","Volkswagen;Quantum","Volkswagen;SpaceFox / Suran / SportVan / Fox Plus","Volkswagen;T1 Kombi","Volkswagen;T2 Kombi","Volkswagen;SP2","Volkswagen;Saveiro","Volkswagen;Saveiro"};
    private static String[] color = {"Air Force Blue (Raf)","Air Force Blue (Usaf)","Air Superiority Blue","Alabama Crimson","Alice Blue","Alizarin Crimson","Alloy Orange","Almond","Amaranth","Amber","Amber (Sae/Ece)","American Rose","Amethyst","Android Green","Anti-Flash White","Antique Brass","Antique Fuchsia","Antique Ruby","Antique White","Ao (English)","Apple Green","Apricot","Aqua","Aquamarine","Army Green","Arsenic","Arylide Yellow","Ash Grey","Asparagus","Atomic Tangerine","Auburn","Aureolin","Aurometalsaurus","Avocado","Azure","Azure Mist/Web","Baby Blue","Baby Blue Eyes","Baby Pink","Ball Blue","Banana Mania","Banana Yellow","Barn Red","Battleship Grey","Bazaar","Beau Blue","Beaver","Beige","Big Dip Oâ€™Ruby","Bisque","Bistre","Bittersweet","Bittersweet Shimmer","Black","Black Bean","Black Leather Jacket","Black Olive","Blanched Almond","Blast-Off Bronze","Bleu De France","Blizzard Blue","Blond","Blue","Blue Bell","Blue (Crayola)","Blue Gray","Blue-Green","Blue (Munsell)","Blue (Ncs)","Blue (Pigment)","Blue (Ryb)","Blue Sapphire","Blue-Violet","Blush","Bole","Bondi Blue","Bone","Boston University Red","Bottle Green","Boysenberry","Brandeis Blue","Brass","Brick Red","Bright Cerulean","Bright Green","Bright Lavender","Bright Maroon","Bright Pink","Bright Turquoise","Bright Ube","Brilliant Lavender","Brilliant Rose","Brink Pink","British Racing Green","Bronze","Brown (Traditional)","Brown (Web)","Bubble Gum","Bubbles","Buff","Bulgarian Rose","Burgundy","Burlywood","Burnt Orange","Burnt Sienna","Burnt Umber","Byzantine","Byzantium","Cadet","Cadet Blue","Cadet Grey","Cadmium Green","Cadmium Orange","Cadmium Red","Cadmium Yellow","CafÃ© Au Lait","CafÃ© Noir","Cal Poly Green","Cambridge Blue","Camel","Cameo Pink","Camouflage Green","Canary Yellow","Candy Apple Red","Candy Pink","Capri","Caput Mortuum","Cardinal","Caribbean Green","Carmine","Carmine (M&P)","Carmine Pink","Carmine Red","Carnation Pink","Carnelian","Carolina Blue","Carrot Orange","Catalina Blue","Ceil","Celadon","Celadon Blue","Celadon Green","Celeste (Colour)","Celestial Blue","Cerise","Cerise Pink","Cerulean","Cerulean Blue","Cerulean Frost","Cg Blue","Cg Red","Chamoisee","Champagne","Charcoal","Charm Pink","Chartreuse (Traditional)","Chartreuse (Web)","Cherry","Cherry Blossom Pink","Chestnut","China Pink","China Rose","Chinese Red","Chocolate (Traditional)","Chocolate (Web)","Chrome Yellow","Cinereous","Cinnabar","Cinnamon","Citrine","Classic Rose","Cobalt","Cocoa Brown","Coffee","Columbia Blue","Congo Pink","Cool Black","Cool Grey","Copper","Copper (Crayola)","Copper Penny","Copper Red","Copper Rose","Coquelicot","Coral","Coral Pink","Coral Red","Cordovan","Corn","Cornell Red","Cornflower Blue","Cornsilk","Cosmic Latte","Cotton Candy","Cream","Crimson","Crimson Glory","Cyan","Cyan (Process)","Daffodil","Dandelion","Dark Blue","Dark Brown","Dark Byzantium","Dark Candy Apple Red","Dark Cerulean","Dark Chestnut","Dark Coral","Dark Cyan","Dark Electric Blue","Dark Goldenrod","Dark Gray","Dark Green","Dark Imperial Blue","Dark Jungle Green","Dark Khaki","Dark Lava","Dark Lavender","Dark Magenta","Dark Midnight Blue","Dark Olive Green","Dark Orange","Dark Orchid","Dark Pastel Blue","Dark Pastel Green","Dark Pastel Purple","Dark Pastel Red","Dark Pink","Dark Powder Blue","Dark Raspberry","Dark Red","Dark Salmon","Dark Scarlet","Dark Sea Green","Dark Sienna","Dark Slate Blue","Dark Slate Gray","Dark Spring Green","Dark Tan","Dark Tangerine","Dark Taupe","Dark Terra Cotta","Dark Turquoise","Dark Violet","Dark Yellow","Dartmouth Green","Davy'S Grey","Debian Red","Deep Carmine","Deep Carmine Pink","Deep Carrot Orange","Deep Cerise","Deep Champagne","Deep Chestnut","Deep Coffee","Deep Fuchsia","Deep Jungle Green","Deep Lilac","Deep Magenta","Deep Peach","Deep Pink","Deep Ruby","Deep Saffron","Deep Sky Blue","Deep Tuscan Red","Denim","Desert","Desert Sand","Dim Gray","Dodger Blue","Dogwood Rose","Dollar Bill","Drab","Duke Blue","Earth Yellow","Ebony","Ecru","Eggplant","Eggshell","Egyptian Blue","Electric Blue","Electric Crimson","Electric Cyan","Electric Green","Electric Indigo","Electric Lavender","Electric Lime","Electric Purple","Electric Ultramarine","Electric Violet","Electric Yellow","Emerald","English Lavender","Eton Blue","Fallow","Falu Red","Fandango","Fashion Fuchsia","Fawn","Feldgrau","Fern Green","Ferrari Red","Field Drab","Fire Engine Red","Firebrick","Flame","Flamingo Pink","Flavescent","Flax","Floral White","Fluorescent Orange","Fluorescent Pink","Fluorescent Yellow","Folly","Forest Green (Traditional)","Forest Green (Web)","French Beige","French Blue","French Lilac","French Lime","French Raspberry","French Rose","Fuchsia","Fuchsia (Crayola)","Fuchsia Pink","Fuchsia Rose","Fulvous","Fuzzy Wuzzy","Gainsboro","Gamboge","Ghost White","Ginger","Glaucous","Glitter","Gold (Metallic)","Gold (Web) (Golden)","Golden Brown","Golden Poppy","Golden Yellow","Goldenrod","Granny Smith Apple","Gray","Gray-Asparagus","Gray (Html/Css Gray)","Gray (X11 Gray)","Green (Color Wheel) (X11 Green)","Green (Crayola)","Green (Html/Css Green)","Green (Munsell)","Green (Ncs)","Green (Pigment)","Green (Ryb)","Green-Yellow","Grullo","Guppie Green","HalayÃ  ÃºBe","Han Blue","Han Purple","Hansa Yellow","Harlequin","Harvard Crimson","Harvest Gold","Heart Gold","Heliotrope","Hollywood Cerise","Honeydew","Honolulu Blue","Hooker'S Green","Hot Magenta","Hot Pink","Hunter Green","Iceberg","Icterine","Imperial Blue","Inchworm","India Green","Indian Red","Indian Yellow","Indigo","Indigo (Dye)","Indigo (Web)","International Klein Blue","International Orange (Aerospace)","International Orange (Engineering)","International Orange (Golden Gate Bridge)","Iris","Isabelline","Islamic Green","Ivory","Jade","Jasmine","Jasper","Jazzberry Jam","Jet","Jonquil","June Bud","Jungle Green","Kelly Green","Kenyan Copper","Khaki (Html/Css) (Khaki)","Khaki (X11) (Light Khaki)","Ku Crimson","La Salle Green","Languid Lavender","Lapis Lazuli","Laser Lemon","Laurel Green","Lava","Lavender Blue","Lavender Blush","Lavender (Floral)","Lavender Gray","Lavender Indigo","Lavender Magenta","Lavender Mist","Lavender Pink","Lavender Purple","Lavender Rose","Lavender (Web)","Lawn Green","Lemon","Lemon Chiffon","Lemon Lime","Licorice","Light Apricot","Light Blue","Light Brown","Light Carmine Pink","Light Coral","Light Cornflower Blue","Light Crimson","Light Cyan","Light Fuchsia Pink","Light Goldenrod Yellow","Light Gray","Light Green","Light Khaki","Light Pastel Purple","Light Pink","Light Red Ochre","Light Salmon","Light Salmon Pink","Light Sea Green","Light Sky Blue","Light Slate Gray","Light Taupe","Light Thulian Pink","Light Yellow","Lilac","Lime (Color Wheel)","Lime Green","Lime (Web) (X11 Green)","Limerick","Lincoln Green","Linen","Lion","Little Boy Blue","Liver","Lust","Magenta","Magenta (Dye)","Magenta (Process)","Magic Mint","Magnolia","Mahogany","Maize","Majorelle Blue","Malachite","Manatee","Mango Tango","Mantis","Mardi Gras","Maroon (Crayola)","Maroon (Html/Css)","Maroon (X11)","Mauve","Mauve Taupe","Mauvelous","Maya Blue","Meat Brown","Medium Aquamarine","Medium Blue","Medium Candy Apple Red","Medium Carmine","Medium Champagne","Medium Electric Blue","Medium Jungle Green","Medium Lavender Magenta","Medium Orchid","Medium Persian Blue","Medium Purple","Medium Red-Violet","Medium Ruby","Medium Sea Green","Medium Slate Blue","Medium Spring Bud","Medium Spring Green","Medium Taupe","Medium Turquoise","Medium Tuscan Red","Medium Vermilion","Medium Violet-Red","Mellow Apricot","Mellow Yellow","Melon","Midnight Blue","Midnight Green (Eagle Green)","Mikado Yellow","Mint","Mint Cream","Mint Green","Misty Rose","Moccasin","Mode Beige","Moonstone Blue","Mordant Red 19","Moss Green","Mountain Meadow","Mountbatten Pink","Msu Green","Mulberry","Mustard","Myrtle","Nadeshiko Pink","Napier Green","Naples Yellow","Navajo White","Navy Blue","Neon Carrot","Neon Fuchsia","Neon Green","New York Pink","Non-Photo Blue","North Texas Green","Ocean Boat Blue","Ochre","Office Green","Old Gold","Old Lace","Old Lavender","Old Mauve","Old Rose","Olive","Olive Drab #7","Olive Drab (Web) (Olive Drab #3)","Olivine","Onyx","Opera Mauve","Orange (Color Wheel)","Orange Peel","Orange-Red","Orange (Ryb)","Orange (Web Color)","Orchid","Otter Brown","Ou Crimson Red","Outer Space","Outrageous Orange","Oxford Blue","Pakistan Green","Palatinate Blue","Palatinate Purple","Pale Aqua","Pale Blue","Pale Brown","Pale Carmine","Pale Cerulean","Pale Chestnut","Pale Copper","Pale Cornflower Blue","Pale Gold","Pale Goldenrod","Pale Green","Pale Lavender","Pale Magenta","Pale Pink","Pale Plum","Pale Red-Violet","Pale Robin Egg Blue","Pale Silver","Pale Spring Bud","Pale Taupe","Pale Violet-Red","Pansy Purple","Papaya Whip","Paris Green","Pastel Blue","Pastel Brown","Pastel Gray","Pastel Green","Pastel Magenta","Pastel Orange","Pastel Pink","Pastel Purple","Pastel Red","Pastel Violet","Pastel Yellow","Patriarch","Payne'S Grey","Peach","Peach (Crayola)","Peach-Orange","Peach Puff","Peach-Yellow","Pear","Pearl","Pearl Aqua","Pearly Purple","Peridot","Periwinkle","Persian Blue","Persian Green","Persian Indigo","Persian Orange","Persian Pink","Persian Plum","Persian Red","Persian Rose","Persimmon","Peru","Phlox","Phthalo Blue","Phthalo Green","Piggy Pink","Pine Green","Pink","Pink Lace","Pink-Orange","Pink Pearl","Pink Sherbet","Pistachio","Platinum","Plum (Traditional)","Plum (Web)","Portland Orange","Powder Blue (Web)","Princeton Orange","Prune","Prussian Blue","Psychedelic Purple","Puce","Pumpkin","Purple Heart","Purple (Html/Css)","Purple Mountain Majesty","Purple (Munsell)","Purple Pizzazz","Purple Taupe","Purple (X11)","Quartz","Rackley","Radical Red","Rajah","Raspberry","Raspberry Glace","Raspberry Pink","Raspberry Rose","Raw Umber","Razzle Dazzle Rose","Razzmatazz","Red","Red-Brown","Red Devil","Red (Munsell)","Red (Ncs)","Red-Orange","Red (Pigment)","Red (Ryb)","Red-Violet","Redwood","Regalia","Resolution Blue","Rich Black","Rich Brilliant Lavender","Rich Carmine","Rich Electric Blue","Rich Lavender","Rich Lilac","Rich Maroon","Rifle Green","Robin Egg Blue","Rose","Rose Bonbon","Rose Ebony","Rose Gold","Rose Madder","Rose Pink","Rose Quartz","Rose Taupe","Rose Vale","Rosewood","Rosso Corsa","Rosy Brown","Royal Azure","Royal Blue (Traditional)","Royal Blue (Web)","Royal Fuchsia","Royal Purple","Royal Yellow","Rubine Red","Ruby","Ruby Red","Ruddy","Ruddy Brown","Ruddy Pink","Rufous","Russet","Rust","Rusty Red","Sacramento State Green","Saddle Brown","Safety Orange (Blaze Orange)","Saffron","Salmon","Salmon Pink","Sand","Sand Dune","Sandstorm","Sandy Brown","Sandy Taupe","Sangria","Sap Green","Sapphire","Sapphire Blue","Satin Sheen Gold","Scarlet","Scarlet (Crayola)","School Bus Yellow","Screamin' Green","Sea Blue","Sea Green","Seal Brown","Seashell","Selective Yellow","Sepia","Shadow","Shamrock Green","Shocking Pink","Shocking Pink (Crayola)","Sienna","Silver","Sinopia","Skobeloff","Sky Blue","Sky Magenta","Slate Blue","Slate Gray","Smalt (Dark Powder Blue)","Smokey Topaz","Smoky Black","Snow","Spiro Disco Ball","Spring Bud","Spring Green","St. Patrick'S Blue","Steel Blue","Stil De Grain Yellow","Stizza","Stormcloud","Straw","Sunglow","Sunset","Tan","Tangelo","Tangerine","Tangerine Yellow","Tango Pink","Taupe","Taupe Gray","Tea Green","Tea Rose (Orange)","Tea Rose (Rose)","Teal","Teal Blue","Teal Green","Telemagenta","TennÃ© (Tawny)","Terra Cotta","Thistle","Thulian Pink","Tickle Me Pink","Tiffany Blue","Tiger'S Eye","Timberwolf","Titanium Yellow","Tomato","Toolbox","Topaz","Tractor Red","Trolley Grey","Tropical Rain Forest","True Blue","Tufts Blue","Tumbleweed","Turkish Rose","Turquoise","Turquoise Blue","Turquoise Green","Tuscan Red","Twilight Lavender","Tyrian Purple","Ua Blue","Ua Red","Ube","Ucla Blue","Ucla Gold","Ufo Green","Ultra Pink","Ultramarine","Ultramarine Blue","Umber","Unbleached Silk","United Nations Blue","University Of California Gold","Unmellow Yellow","Up Forest Green","Up Maroon","Upsdell Red","Urobilin","Usafa Blue","Usc Cardinal","Usc Gold","Utah Crimson","Vanilla","Vegas Gold","Venetian Red","Verdigris","Vermilion (Cinnabar)","Vermilion (Plochere)","Veronica","Violet","Violet-Blue","Violet (Color Wheel)","Violet (Ryb)","Violet (Web)","Viridian","Vivid Auburn","Vivid Burgundy","Vivid Cerise","Vivid Tangerine","Vivid Violet","Warm Black","Waterspout","Wenge","Wheat","White","White Smoke","Wild Blue Yonder","Wild Strawberry","Wild Watermelon","Wine","Wine Dregs","Wisteria","Wood Brown","Xanadu","Yale Blue","Yellow","Yellow-Green","Yellow (Munsell)","Yellow (Ncs)","Yellow Orange","Yellow (Process)","Yellow (Ryb)","Zaffre","Zinnwaldite Brown"};
    private static String[] license = {"A","AM","B","B","B","BA","BB","BD","BD","BG","BH","BK","BL","BM","BM","BN","BP","BR","BZ","DL","DO","E","EF","EU","FB","FE","FF","FK","FR","FV","FW","G","GB","GD","GD","GF","GK","GM","GR","GS","GU","HA","HB","HE","HF","HL","HO","I","IL","IM","JE","JO","JU","JW","K","K","K","KB","KD","KF","KG","KI","KK","KL","KO","KR","KS","KU","L","LA","LB","LE","LF","LI","LL","LN","LZ","MA","MD","ME","MI","MT","MU","MZ","N","N","ND","ND","NK","NK","O","O","OD","OK","OP","OW","P","PE","PL","PT","RA","RE","RI","RO","S","S","S","SB","SD","SD","SE","SK","SL","SO","SP","SR","ST","SV","SW","SZ","St","T","T","TA","TD","TK","TU","UU","V","V","VB","VD","VI","VK","VK","VL","VO","W","W","W","WB","WD","WE","WK","WL","WN","WO","WT","WU","WY","WZ","ZE","ZT","ZW"};

    private static Random r = new Random();

    public static String getRandomManufacturer()
    {
       int i = r.nextInt(car.length);
       String[] split = car[i].split(";");
       if(split.length == 2)    //looks like a correct car string
           return split[0];
       else
           return "";
    }

    public static String getRandomModel(String manufacturer)
    {
        ArrayList<String> model = new ArrayList<>();

        for (String m : car) {
            String[] split = m.split(";");
            if (split.length == 2 && split[0].equals(manufacturer))
            {
                model.add(split[1]);
            }
        }

        int i = r.nextInt(model.size());
        return model.get(i);
    }

    public static String getRandomColor()
    {
        int i = r.nextInt(color.length);
        return color[i];
    }

    public static String getRandomLicensePlate()
    {
        StringBuilder sb = new StringBuilder();
        int i = r.nextInt(license.length);
        sb.append(license[i]);
        sb.append("-");
        sb.append(String.format("%03d", r.nextInt(1000)));
        sb.append((char)(r.nextInt(26) + 'a'));
        sb.append((char)(r.nextInt(26) + 'a'));
        return sb.toString().toUpperCase();
    }

    public static String getRandomName()
    {
        int i = 0;
        String name = "";

        //random boy or girl
        if(r.nextBoolean())
        {
            i = r.nextInt(names_m.length);
            name = names_m[i];
        }
        else {
            i = r.nextInt(names_f.length);
            name = names_f[i];
        }

        return name;
    }
}