
// #messycode lol :)
// #420 cycles celebration 🎉🥳
import java.util.Scanner;
import java.util.List;

class Main {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);

    System.out.print("\033[H\033[2J");
    System.out.flush();
    int commandNum=0; //THIS IS A VERY IMPORTANT VARIABLE. MAKE SURE TO ADJUST THE PROGRAM ACCORDINGLY
    String item = "";
    int wallet = 0;
    int bank = 0;
    String dep = "";
    int deposit = 0;
    int invNum = 0;
    int breadNumber = 0;
    int chillNumber = 0;
    int cookieNumber = 0;
    int candyNumber = 0;
    int fishInv = 0;
    String with = "";
    String omgadragon = "";
    String memeChoice = "";
    String petName = "";
    double myShield = 1;
    double dankShield = 1;
    int defenseRaise = (int) (Math.random() * 30 + 1);
    int attackAmount = (int) (Math.random() * 60 + 1);
    int dankattack = (int) (Math.random() * 60 + 1);
    int dankdefense = (int) (Math.random() * 30 + 1);
    int dankMemerChoice = (int) (Math.random() * 2 + 1);
    int choosetypeohit = (int) (Math.random() * 4 + 0);
    int danktypeohit = (int) (Math.random() * 4 + 0);
    int withdraw = 0;
    int rareFishNum = 0;
    int exoticFishNum = 0;
    int legFishNum = 0;
    boolean petown = false;
    boolean laptop = false;
    boolean rifle = false;
    boolean pole = false;
    boolean dead = false;
    boolean daily = false;
    boolean keepPlaying = false;
    boolean rareFish = false;
    boolean exoticFish = false;
    boolean legendaryFish = false;
    boolean pet = false;
    boolean petRock = false;
    boolean petCat = false;
    boolean petDog = false;
    System.out.print("What is your name? ");
    String name = key.nextLine();
    System.out.println("");
    System.out.println(
        "Dank Memer here. Type in 'pls help' to learn more commands you can type in. Make sure you type in 'pls' before each command. Also, everytime you see this: '>> ', type in your command");
    System.out.print(">> ");
    String command = key.nextLine();
    while (dead == false || keepPlaying == true) {
      int total = bank + wallet;
      System.out.print("\033[H\033[2J");
      System.out.flush();
      System.out.println("");
      if (command.equalsIgnoreCase("pls help")) {
        System.out.println("DANK MEMER COMMAND LIST:");
        System.out.println("");
        System.out.println("💰  Currency: ");
        System.out.print("pls help currency");
        System.out.println("");
        System.out.println("");
        System.out.println("😄  Fun: ");
        System.out.print("pls help fun");
        System.out.println("");
        System.out.println("");
        System.out.println("🐶  Animals: ");
        System.out.println("pls help animals");
        System.out.println("");
        System.out.println("🎲  Games: ");
        System.out.println("pls help games");
        System.out.println("");
        System.out.println("Which command would you like to use next? ");
        System.out.print(">> ");
        command = key.nextLine();
      }
      if (command.equalsIgnoreCase("pls help currency")) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(
            "💰  Commands: bal(bal=balance), beg, buy, daily, inv (inv=inventory), deposit, fish, hunt, pet list, pet, pm(pm=postmeme), profile, search, sell, shop, store, use   (type 'pls help' if you need more help with commands)");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls help fun")) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out
            .println("😄  Commands: 8ball, asktrump, kill, joke (type 'pls help' if you need more help with commands)");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls help animals")) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(
            "🐶  Commands: ducc, foxxy, hootyboi, hoppyboi, kitty, lizzyboi, otter, pupper, snek (type 'pls help' if you need more help with commands)");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls help games")) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out
            .println("🎲  Commands: fight, guess, blackjack (type 'pls help' if you need more help with commands)");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls bal")) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(name + "'s balance:");
        System.out.println("----------");
        System.out.println("Wallet: " + wallet);
        System.out.println("Bank: " + bank);
        System.out.println("Total: " + total);
        System.out.println("");
        System.out.println("Type in 'pls help' if you need more help with bot commands.");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls beg")) {
        String[] begWords = { "your mom", "Minecraft Steve", "Donald Duck", "Thanos", "Bill Clinton", "Jeff Bezos",
            "a cactus", "a squid", "a chicken", "a carrot", "a book", "barack yo'mama", "Elon Musk", "a robber" };
        String[] extras = { "Cookie", "Fresh Bread", "Chill Pill" };
        String[] rejectWords = { "there. is. no. coins. for. you. ", "back in my day we used to work", "no",
            "i need my money to buy airpods" };
        int begWordsChoose = (int) (Math.random() * 12 + 0);
        int beg = (int) (Math.random() * 250 + 0);
        int begChance = (int) (Math.random() * 10 + 1);
        int extrasChoose = (int) (Math.random() * 50 + 1);
        int rejectChoose = (int) (Math.random() * 3 + 0);
        if (begChance == 1 || begChance == 2 || begChance == 3 || begChance == 4 || begChance == 5 || begChance == 6
            || begChance == 7)
          if (extrasChoose == 1 || extrasChoose == 2) {
            System.out
                .println(begWords[begWordsChoose] + " donated " + beg + " coins to @" + name + " and a 🍪  Cookie!");
            wallet += beg;
            cookieNumber += 1;
            invNum += 1;
          } else if (extrasChoose == 3 || extrasChoose == 4) {
            System.out.println(
                begWords[begWordsChoose] + " donated " + beg + " coins to @" + name + " and a 🍞  Fresh Bread!");
            wallet += beg;
            breadNumber += 1;
            invNum += 1;
          } else if (extrasChoose == 5 || extrasChoose == 6) {
            System.out.println(
                begWords[begWordsChoose] + " donated " + beg + " coins to @" + name + " and a 💊  Chill Pill!");
            wallet += beg;
            chillNumber += 1;
            invNum += 1;
          } else if (extrasChoose == 7) {
            System.out
                .println(begWords[begWordsChoose] + " donated " + beg + " coins to @" + name + " and a 🍬  Candy!");
            wallet += beg;
            candyNumber += 1;
            invNum += 1;
          } else {
            System.out.println(begWords[begWordsChoose] + " donated " + beg + " coins to @" + name);
            wallet += beg;
          }
        else
          System.out.println(begWords[begWordsChoose] + ": " + rejectWords[rejectChoose]);
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls shop")) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("MEME SHOP: ");
        System.out.println("----------");
        System.out.println("Fresh bread -- 10 coins");
        System.out.println("Chill Pill -- 10 coins");
        System.out.println("Cookie -- 10 coins");
        System.out.println("Candy -- 75 coins");
        System.out.println("");
        System.out.println("Fishing Pole -- 15,000 coins");
        System.out.println("Hunting Rifle -- 15,000 coins");
        System.out.println("");
        System.out
            .println("Type in 'pls store [item name]' to learn more about  a specific item or 'pls help' to get help");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls buy ")) {
        System.out.println(
            "what are you thinking, that item isn't even in the shop. you have to type in 'pls buy [item name]' ");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls daily")) {
        if (daily == true) {
          System.out.println("you already got your daily coins boi!");
          System.out.print(">> ");
          command = key.nextLine();
        } else {
          wallet += 1500;
          System.out.println("Here are your daily coins " + name);
          System.out.println("1500 coins were placed in your wallet! ");
          daily = true;
          System.out.print(">> ");
          command = key.nextLine();
        }
      } else if (command.equalsIgnoreCase("pls inv")) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("fresh bread - " + breadNumber);
        System.out.println("chill pill - " + chillNumber);
        System.out.println("cookies - " + cookieNumber);
        System.out.println("candy - " + candyNumber);
        if (pole == true) {
          System.out.println("Fishing Pole - 1");
        }
        if (rifle == true) {
          System.out.println("Hunting rifle - 1");
        }
        System.out.println("Fishing Pole - 0");
        System.out.println("Hunting Rifle - 0");
        System.out.println("Common Fish - " + fishInv);
        if (rareFish == true)
          System.out.println("Rare Fish - " + rareFishNum);
        if (exoticFish == true)
          System.out.println("Exotic Fish - " + exoticFishNum);
        if (legendaryFish == true)
          System.out.println("Legendary Fish - " + legFishNum);
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.contains("pls deposit ")) {
        dep = command.substring(12);
        deposit = Integer.parseInt(dep);
        if (deposit > wallet)
          System.out.println(
              "what are you doing, you don't have that much in your wallet, type in 'pls deposit [amount of coins]'");
        else {
          System.out.println(deposit + " coins deposited into your bank!");
          bank += deposit;
          wallet -= deposit;
        }
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.contains("pls withdraw ")) {
        with = command.substring(12);
        withdraw = Integer.parseInt(with);
        if (withdraw > bank)
          System.out.println(
              "what are you doing, you don't have that much in your bank, type in 'pls withdraw [amount of coins]'");
        else {
          System.out.println(withdraw + " coins withdrawn!");
          bank -= withdraw;
          wallet += withdraw;
        }
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls fish")) {
        int commonFishNum = (int) (Math.random() * 5 + 0);
        int rareFishChance = (int) (Math.random() * 150 + 1);
        int exoticFishChance = (int) (Math.random() * 400 + 1);
        int legendaryFishChance = (int) (Math.random() * 700 + 1);
        if (pole == false)
          System.out.println(
              "You're not good enough to catch fish with your bare hands, so you need to buy a fishing pole boyo ");
        else {
          if (rareFishChance == 100) {
            System.out.println("You caught 1 rare fish!");
            rareFish = true;
            rareFishNum += 1;
          }
          if (exoticFishChance == 400) {
            System.out.println("You caught 1 exotic fish!");
            exoticFish = true;
            exoticFishNum += 1;
          }
          if (legendaryFishChance == 700) {
            System.out.println("You caught 1 legendary fish! The rarest fish of all!");
            legendaryFish = true;
            legFishNum += 1;
          }
          if (commonFishNum == 0)
            System.out.println("all the fishies swam away..");
          else {
            System.out.println("You caught " + commonFishNum + "common fishes");
            fishInv += commonFishNum;
          }
        }
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls hunt")) {
        int rabbitChance = (int) (Math.random() * 20 + 1);
        int deerChance = (int) (Math.random() * 70 + 1);
        int duckChance = (int) (Math.random() * 130 + 1);
        int boarChance = (int) (Math.random() * 300 + 1);
        int dragonChance = (int) (Math.random() * 700 + 1);
        if (rifle == false)
          System.out.println(
              "You need to buy a hunting rifle to hunt boi, you're not strong enough to hunt with your bare hands");
        else {
          if (rabbitChance == 20)
            System.out.println("You went hunting in the woods and brought back a rabbit 🐇 !");
          if (deerChance == 70)
            System.out.println("You went hunting in the woods and brough back a deer 🦌 !");
          if (duckChance == 130)
            System.out.println("You went hunting in the woods and brought back a duck 🦆 !");
          if (boarChance == 300)
            System.out.println("You went hunting in the woods and brought back a boar 🐗 !");
          if (dragonChance == 700) {
            System.out.println("Heaven forbid you find something as innocent as a duck, IT'S A FRICKING DRAGON!!!");
            System.out.println("Quick, type in the phrase below: ");
            System.out.println("OMG IT'S A DRAGON");
            omgadragon = key.nextLine();
            if (omgadragon != "OMG IT'S A DRAGON") {
              System.out.println(
                  "The dragon killed you and you became burnt human wings...Since you died, you lost all the money in your wallet");
              wallet = 0;
            } else
              System.out.println("Cogratulations! You brought back a dragon 🐲 !");
          } else
            System.out.println("You couldn't find any animals to hunt in the forest...");
        }
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls pet list")) {
        System.out.println("Pet Rock - 2,500 coins");
        System.out.println("Crab - 10,000 coins");
        System.out.println("Dog - 30,000 coins");
        System.out.println("Cat - 35,000 coins");
        System.out.println("-----------------");
        System.out.println("type in pls buy pet [pet name] if you want a pet or type in 'pls help' for more help");
        System.out.println("> ");
        String petmaybe = key.nextLine();
        if (petmaybe.equalsIgnoreCase("pls buy pet rock") && petown == false) {
          if (wallet < 2500)
            System.out.println("You don't have enough money, but you might have enough money in your bank...");
          else {
            System.out.println("Now, type in the name you want to give your pet: ");
            petName = key.nextLine();
            System.out.println("You bought a pet rock! If you want to check it's stats type in 'pls pet'");
            petown = true;
          }
        }
        if (petmaybe.equalsIgnoreCase("pls buy crab") && petown == false) {
          if (wallet < 10000)
            System.out.println("You don't have enough money, but you might have enough money in your bank...");
          else {
            System.out.println("Now, type in the name you want to give your pet: ");
            petName = key.nextLine();
            System.out.println("You bought a pet crab! If you want to check it's stats type in 'pls pet'");
            petown = true;
          }
        }
        if (petmaybe.equalsIgnoreCase("pls buy dog") && petown == false) {
          if (wallet < 30000)
            System.out.println("You don't have enough money, but you might have enough money in your bank...");
          else {
            System.out.println("Now, type in the name you want to give your pet: ");
            petName = key.nextLine();
            System.out.println("You bought a pet dog! If you want to check it's stats type in 'pls pet'");
            petown = true;
          }
        }
        if (petmaybe.equalsIgnoreCase("pls buy cat") && petown == false) {
          if (wallet < 35000)
            System.out.println("You don't have enough money, but you might have enough money in your bank...");
          else {
            System.out.println("Now, type in the name you want to give your pet: ");
            petName = key.nextLine();
            System.out.println("You bought a pet cat! If you want to check it's stats type in 'pls pet'");
            petown = true;
          }
        }
        System.out.println(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls pet")) {
        System.out.println("YOUR PET'S STATS: ");
        System.out.println("Name: "+petName);
        System.out.println("(To see the things you can do with your pet, type 'pls pet actions')");
        System.out.println("Hunger: ");
      } else if (command.equalsIgnoreCase("pls pm")) {
        if (laptop == true) {
          int memeVotes = (int) (Math.random() * 3000 + 0);
          int noMemeVotes = (int) (Math.random() * 0 - 4000);
          int memeCoins = (int) (Math.random() * 300 + 0);
          int brokeLap = (int) (Math.random() * 40 + 0);
          System.out.println("What type of meme would you like to post? (Type in the letter): ");
          System.out.println("[n] Normie Meme");
          System.out.println("[e] Edgy Meme");
          System.out.println("[r] Repost Meme");
          System.out.println("[d] Dank Meme");
          System.out.print("> ");
          memeChoice = key.nextLine();
          if (memeChoice.equalsIgnoreCase("n")) {
            if (memeVotes >= 0)
              System.out
                  .println("Your meme got " + memeVotes + " upvotes. You get " + memeCoins + " coins from the ads.");
            else {
              if (brokeLap == 40)
                System.out.println("Your meme didn't get any upvotes, and it ended up with " + memeVotes
                    + " karma. You get 0 coins AND now your laptop is broken. oof ");
              else
                System.out.println("Your meme didn't get any upvotes and it ended up with " + noMemeVotes
                    + " karma. You get 0 coins, rip.");
            }
          }
        } else {
          System.out.println("boi you need to buy a laptop before you can start posting memes.");
        }
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls profile")) {
        System.out.println(name + "'s profile: ");
        System.out.println("---------------");
        System.out.println("Original Memer");
        System.out.println("");
        System.out.println("Coins: ");
        System.out.println("```````");
        System.out.println(wallet+" in wallet");
        System.out.println(bank+" in bank");
        System.out.println(wallet + " in wallet");
        System.out.println(bank + " in bank");
        System.out.println("");
        System.out.println("Inventory: ");
        System.out.println("```````````");
        System.out.println(invNum+" items in your inventory");
        System.out.println(">> ");
        command=key.nextLine();
      } else if (command.equalsIgnoreCase("pls search")) {
        String[] searchAreas = { "tree", "dumpster", "sewer", "couch", "pantry", "dresser", "dog", "grass",
            "laundrymat", "street" };
        int searchChoose1 = (int) (Math.random() * 9 + 0);
        int searchChoose2 = (int) (Math.random() * 9 + 0);
        int searchChoose3 = (int) (Math.random() * 9 + 0);
        int searchDeathChance = (int) (Math.random() * 100 + 1);
        System.out.println("Where would you like to search? (type in the name)");
        System.out.println(searchChoose1 + ", " + searchChoose2 + ", " + searchChoose3);
        String searchChoice = key.nextLine();
        if (searchChoice.equalsIgnoreCase("dumpster") || searchChoice.equalsIgnoreCase("sewer")) {

        }
        System.out.print("Type in a command >> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls sell")) {
        System.out.println(
            "my dude are you good? what are you selling? Type in 'pls sell [item name]' to properly sell something");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls use")) {
        System.out.println("boi, what are you using? type in 'pls use [item name]' to really use an item.");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.contains("pls 8ball ")) {
        String ball8question = command.substring(10);
        String[] ball8choices = { "As I see it, yes", "Ask again later", "Better not tell you now",
            "Concentrate and ask again", "Don't count on it", "It is certain. ", "It is decidedly so", "Unlikely",
            "My answer is no", "Outlook not so good", "Signs point to yes", "Very doubtful", "Without a doubt" };
        int choose8ball = (int) (Math.random() * 12 + 0);
        System.out.println(ball8choices[choose8ball]);
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls asktrump")) {
        System.out.println(
            "Do you even know what you are asking Mr. Trump? Hmmm? If you don't, he'll fire you. To properly ask Trump something, type in 'pls asktrump [question]'");
      } else if (command.equalsIgnoreCase("pls kill")) {
        String[] killOptions = { "measles", "coronavirus", "" };
      } else if (command.equalsIgnoreCase("pls ducc")) {
        System.out.println("🦆");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls foxxy")) {
        System.out.println("🦊");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls hootyboi")) {
        System.out.println("🦉");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls hoppyboi")) {
        System.out.println("🐰");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls kitty")) {
        System.out.println("😸");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls lizzyboi")) {
        System.out.println("🦎");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls otter")) {
        System.out.println("🦦");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls pupper")) {
        System.out.println("🐶");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls snek")) {
        System.out.println("🐍");
        System.out.print(">> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls fight")) {
        int dankMemerHealth = 100;
        int myHealth = 100;
        int fightChoice = 0;
        boolean ko = false;
        String[] typesOfHits = { " cRAzy pUnCH", "n incredible hit", " powerful punch", " knockout punch", "weak" };
        while (ko == false) {
          if (dankMemerHealth <= 0) {
            dankMemerHealth = 0;
            System.out.println(
                "\033[31;1mYou won the fight! But you don't get any money for beating up a weakling :)\033[0m");
            ko=true;
          }
          if (myHealth <= 0) {
            System.out.println(
                "\033[31;1mDank Memer won the fight! But he doesn't get any money for beating you up :)\033[0m");
            ko=true;
          }
          System.out.println("@\033[34m" + name + " What would you like to do: [1] Punch  [2] Defend  [3] End\033[34m");
          System.out.print("(Enter a number) >\033[34m");
          fightChoice = key.nextInt();
          if (fightChoice == 1) {
            System.out.println("");
            double myAttack = attackAmount * dankShield;
            double dankAttackDamage = dankattack *= myShield;
            dankMemerHealth -= myAttack;
            myHealth -= dankAttackDamage;
            System.out.println("\033[31mYou landed a" + typesOfHits[choosetypeohit] + " dealing " + myAttack
                + "! Dank Memer is left with " + dankMemerHealth + " health!\033[33m");
            if (dankMemerChoice == 1) {
              System.out.println("");
              System.out.println("Dank Memer landed a" + typesOfHits[danktypeohit] + " dealing " + dankAttackDamage
                  + "! You are left with " + myHealth + " health!\033[0m");
            } else if (dankMemerChoice == 2) {
              System.out.println("");
              System.out.println("Dank Memer increased his defense by " + defenseRaise + " levels!\033[0m");
              if (defenseRaise == 0)
                dankShield = 0;
              if (defenseRaise < 10 && defenseRaise > 0)
                dankShield = 0.87;
              if (defenseRaise < 18 && defenseRaise > 10)
                dankShield = 0.62;
              ;
              if (defenseRaise < 27 && defenseRaise > 18)
                dankShield = 0.5;
              if (defenseRaise < 30 && defenseRaise > 27)
                dankShield = 0.4;
            }
          }
          if (fightChoice == 2) {
            System.out.println("");
            System.out.println("\033[31mYou increased your defense by " + defenseRaise + " levels!\033[33m");
          if (defenseRaise == 0)
            myShield = 0;
          if (defenseRaise < 10 && defenseRaise > 0)
            myShield = 0.87;
          if (defenseRaise < 18 && defenseRaise > 10)
            myShield = 0.62;
          ;
          if (defenseRaise < 27 && defenseRaise > 18)
            myShield = 0.5;
          if (defenseRaise < 30 && defenseRaise > 27)
            myShield = 0.4;
          if (dankMemerChoice == 1) {
            System.out.println("");
            System.out.println("Dank Memer landed a\033[0m" + typesOfHits[danktypeohit] + " dealing \033[0m"+ dankattack + "! You are left with \033[0m" + (myHealth -= dankattack) + " health!\033[0m");
            }
          } if (dankMemerChoice == 2) {
            System.out.println("");
            System.out.println("\033[31mDank Memer increased his defense by " + defenseRaise + " levels!\033[0m");
            if (defenseRaise == 0)
              dankShield = 0;
            if (defenseRaise < 10 && defenseRaise > 0)
              dankShield = 0.87;
            if (defenseRaise < 18 && defenseRaise > 10)
              dankShield = 0.62;
            ;
            if (defenseRaise < 27 && defenseRaise > 18)
              dankShield = 0.5;
            if (defenseRaise < 30 && defenseRaise > 27)
              dankShield = 0.4;
          } 
        }
          if (fightChoice == 3) {
            System.out.println("");
            System.out.println("\033[31;1mYou backed down and ran away from the fight. :(\033[0m");
            ko=true;
          }
        }
      }
      System.out.println(">> ");
      command = key.nextLine();
      } if (command.equalsIgnoreCase("pls guess")) {
        boolean guessed = false;
        int numOfTries = 0;
        int secretNumber = (int) (Math.random() * 10 + 1);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Guess a number between 1 and 10: ");
        int guess = key.nextInt();
        while (guess != secretNumber) {
          numOfTries += 1;
          if (guess > secretNumber) {
            System.out.println("You guessed too high. Guess again. ");
            guess = key.nextInt();
          } else if (guess < secretNumber) {
            System.out.println("You guessed too low. Guess again. ");
            guess = key.nextInt();
          }
        }
        if (numOfTries == 1) {
          wallet += 10;
          System.out.println("Wow, that was amazing! Since you did a great job, you got 10 coins :D");
          System.out.flush();
        } else if (numOfTries == 2) {
          wallet += 6;
          System.out.println("Congrats on guessing the number in two tries :D You get 6 coins");
          System.out.flush();
        } else if (numOfTries == 3) {
          wallet += 3;
          System.out.println("You get 3 coins for guessing the number in 3 tries");
          System.out.flush();
        } else {
          System.out.println(
              "It took you so many tries to guess the number. HOW??? IT'S ONLY BETWEEN 1 AND 10!!! you don't get any coins rip lol");
          System.out.flush();
        }
        System.out.print("Type in a command >> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls buy hunting rifle")) {
        if (wallet <= 15000) {
          System.out.println(
              "bruh what are you doing, you don't have the money in your wallet, but if you withdraw the ammount needed from you wallet then you might be able to buy it ");
        } else if (rifle == true)
          System.out.println("You already bought this item! ");
        else {
          rifle = true;
          System.out.println("You bought 1 Hunting Rifle and paid 15000 coins.");
          invNum += 1;
        }
        System.out.print("Type in a command >> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls buy fishing pole")) {
        if (wallet <= 15000) {
          System.out.println(
              "bruh what are you doing, you don't have the money in your wallet, but if you withdraw the ammount needed from you wallet then you might be able to buy it ");
          System.out.print("Type in a command >> ");
          command = key.nextLine();
        } else if (pole == true)
          System.out.println("You already bought this item! ");
        else {
          invNum += 1;
          pole = true;
          System.out.println("You bought 1 Fishing Pole and paid 15000 coins.");
          System.out.print("Type in a command >> ");
          command = key.nextLine();
        }
      } else if (command.equalsIgnoreCase("pls buy fresh bread")) {
        if (wallet >= 10) {
          System.out.println("You bought 1 loaf of fresh bread for 10 coins.");
          System.out.println("(Hint: type in 'pls use fresh bread' to use it lol)");
          wallet -= 10;
          breadNumber += 1;
          invNum += 1;
        } else {
          System.out.println(
              "smh you don't have enough money in ur wallet to buy this boi. get at least 10 coins into your wallet and then buy this");
        }
        System.out.print("Type in a command >> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls buy chill pill")) {
        if (wallet >= 10) {
          System.out.println("You bought 1 chill pill for 10 coins. ");
          System.out.println("(Hint: type in 'pls use chill pill' to use it lol)");
          wallet -= 10;
          chillNumber += 1;
          invNum += 1;
        } else {
          System.out.println(
              "smh you don't have enough money in ur wallet to buy this boi. get at least 10 coins into your wallet and then buy this");
        }
        System.out.print("Type in a command >> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls buy cookie")) {
        if (wallet >= 10) {
          System.out.println("You bought 1 cookie for 10 coins.");
          System.out.println("(Hint: type in 'pls use cookie' to use it lol)");
          wallet -= 10;
          cookieNumber += 1;
          invNum += 1;
        } else {
          System.out.println(
              "smh you don't have enough money in ur wallet to buy this boi. get at least 10 coins into your wallet and then buy this");
        }
        System.out.print("Type in a command >> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls buy candy")) {
        if (wallet >= 75) {
          System.out.println("You bought 1 piece of candy for 75 coins.");
          System.out.println("(Hint: type in 'pls use candy' to use it lol)");
          wallet -= 75;
          candyNumber += 1;
          invNum += 1;
        } else {
          System.out.println(
              "you don't have enough money in ur wallet to buy this boi. get at least 75 coins in your wallet and then buy this");
        }
        System.out.print("Type in a command >> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls use fresh bread")) {
        if (breadNumber >= 1) {
          breadNumber -= 1;
          invNum -= 1;
          System.out.println("You ate some bread and felt your belly rise");
        } else
          System.out.println("smh you don't even have this item. check your inventory the next time lol ");
        System.out.print("Type in a command >> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls use chill pill")) {
        if (chillNumber >= 1) {
          chillNumber -= 1;
          invNum -= 1;
          System.out.println(
              "You took a deep breath and let it all out. Since you ran out of oxygen, you had a panic attack and nearly died. lol jk, the second part didn't happen");
        } else
          System.out.println("smh you don't even have this item. check your inventory the next time lol ");
        System.out.print("Type in a command >> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls use candy")) {
        if (candyNumber >= 1) {
          int candyBlessings = (int) (Math.random() * 500 + 1);
          candyNumber -= 1;
          invNum -= 1;
          System.out.println("You eat your candy and Dank Memer blesses you with " + candyBlessings + " coins");
        } else
          System.out.println("smh you don't even have this item. check your inventory the next time lol ");
        System.out.print("Type in a command >> ");
        command = key.nextLine();
      } else if (command.equalsIgnoreCase("pls sell fresh bread")) {
        if (breadNumber < 1)
          System.out
              .println("Who do you think you are trying to fool??? You don't even have a piece of bread to sell. ");
        else {
          breadNumber -= 1;
          invNum -= 1;
          System.out.println("You sold 1 loaf of bread for 6 coins");
          wallet += 6;
        }
      } else if (command.equalsIgnoreCase("pls sell chill pill")) {
        if (chillNumber < 1)
          System.out.println("Who do you think you are trying to fool??? You don't even have a chill pill to sell. ");
        else {
          chillNumber -= 1;
          invNum -= 1;
          System.out.println("You sold 1 chill pill for 6 coins");
          wallet += 6;
        }
      } else if (command.equalsIgnoreCase("pls sell cookie")) {
        if (cookieNumber < 1)
          System.out.println("Who do you think you are trying to fool??? You don't even have a cookie to sell. ");
        else {
          cookieNumber -= 1;
          invNum -= 1;
          System.out.println("You sold 1 cookie for 6 coins");
          wallet += 6;
        }
      } else if (command.equalsIgnoreCase("pls sell candy")) {
        if (candyNumber < 1)
          System.out
              .println("Who do you think you are trying to fool??? You don't even have a piece of candy to sell. ");
        else {
          candyNumber -= 1;
          invNum -= 1;
          System.out.println("You sold 1 piece of candy for 6 coins");
          wallet += 6;
        }
      } else if (command.equalsIgnoreCase("pls sell hunting rifle")) {
        if (rifle == false) {
          System.out.println("Nice one, you don't even have a hunting rifle lol. Come back when you have a real one ");
          System.out.println("Type in a command >> ");
          command = key.nextLine();
        } else {
          System.out.println(
              "You sold your one and only hunting rifle for 7500 c2oins. Now you don't have one. After all that work your rifle did for you, and now you just sell it off smh. ");
          wallet += 7500;
          rifle = false;
          System.out.println("Type in a command >> ");
          command = key.nextLine();
        }
      } else if (command.equalsIgnoreCase("pls sell fishing pole")) {
        if (pole == false) {
          System.out.println(
              "You can't pull that trick on me. I know you don't have a fishing pole lol. Come back when you have a real one ");
          System.out.println("Type in a command >> ");
          command = key.nextLine();
        } else {
          System.out.println("You sold your fishing pole for 7500 coins");
          wallet += 7500;
          pole = false;
          System.out.println("Please type in a command >> ");
          command = key.nextLine();
        }
      } else {
        System.out.println("");
        System.out.println(
            "boi, what are you doing, that isn't a command! (type 'pls help' if you need more help with commands)");
        System.out.print("Type in a command >> ");
        command = key.nextLine();
      }
    }
  }