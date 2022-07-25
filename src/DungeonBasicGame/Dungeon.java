package DungeonBasicGame;
import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {

        // System objects
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Enemy Variables
        String[] enemies = {"Skeleton", "Assassin", "Dragon", "Boss-Slime"};
        int enemyMaxHealth = 100;
        int enemyAttackDamage = 30;

        // User Varibales
        int userHealth = 100;
        int userAttackDamage = 35;
        int numOfHealPotions = 3;
        int healthPotionHealAmount = 25;
        int healPotionDropChance = 30;  //Percantage Chance of the drop a potion

        //User Info
        System.out.print("Enter Your Name : ");
        String userName = sc.nextLine();

        boolean running = true;

        System.out.println("Welcome To The Dungeon " + userName + "!");
        GAME:
        while (running) {
            System.out.println("\t=====================================");
            String enemy = enemies[rand.nextInt(0, enemies.length)];
            int enemyHealth = rand.nextInt(0, enemyMaxHealth);

            System.out.println("\t#" + enemy + " has appeared#");

            while (enemyHealth > 0) {
                System.out.println("\tPlayer HP : " + userHealth);
                System.out.println("\tEnemey Health : " + enemyHealth);
                System.out.println("\t1. *****Attack the " + enemy + "*****");
                System.out.println("\t2. *****Heal*****");
                System.out.println("\t3. *****Run!*****");
                System.out.println("\t------------------------------------------");
                System.out.print("\tInput your option : ");
                String input = sc.nextLine();

                if (input.equals("1")) {
                    System.out.println();
                    System.out.println("\tYou are ATTACKING the " + enemy);
                    int damageDealt = rand.nextInt(enemyAttackDamage);
                    int damageTaken = rand.nextInt(userAttackDamage);

                    enemyHealth -= damageDealt;
                    userHealth -= damageTaken;

                    System.out.println("\t\"*****BATTLE BEGINS\"*****");
                    System.out.println("\tYou have damaged " + damageDealt + " HP Of the enemy " + "in the battle,\n\tYou received " + damageTaken + " HP damage from the enemy");
                    System.out.println("\t------------------------------------------");
                    System.out.println("\tAfter the battle : " + "\n\tPlayer Health : " + userHealth + "\n\tEnemy Health : " + enemyHealth);
                    System.out.println("\t-----------------------------------------");

                    if (userHealth < 1) {
                        System.out.println("\tGAME END");
                        break;
                    }
                } else if (input.equals("2")) {
                    if (numOfHealPotions > 0) {
                        System.out.println("\t\"Healing\"");
                        userHealth += healthPotionHealAmount;
                        numOfHealPotions--;
                        System.out.println("\tYou drank a healing potion " + "\n\tYou are healing yourself for " + healthPotionHealAmount + " HP" + "\n\tYou have " + numOfHealPotions + " healing potions left with you.");
                    } else {
                        System.out.println("\tYou have " + numOfHealPotions + " healing potions left with you.");
                    }
                } else if (input.equals("3")) {
                    System.out.println("YOU RAN AWAY FROM " + enemy + "!");
                    continue GAME;
                } else {
                    System.out.println("Invalid Option.");
                }
            }
            if (userHealth < 1) {
                System.out.println("\tYou limp out of the dungeon, you are too weak to fight back the " + enemy);
            }
            System.out.println("\t=====================================");
            System.out.println("\tYou have defeated " + enemy);
            System.out.println("\tYou have " + userHealth + " HP left with you!");
            System.out.println("\t=====================================");
            if (rand.nextInt(100) < healPotionDropChance) {
                numOfHealPotions++;
                System.out.println("\tEnemy has dropped a healing Potion " + "\n\tCongratulations!");
                System.out.println("\tYou now have " + numOfHealPotions + " healing potion(s) left with you!");
                System.out.println("\t=====================================");
            }
            System.out.println("\t=====================================");
            System.out.println("\tWhat would you like to do?");
            System.out.println("\t1. Continue The Adventure");
            System.out.println("\t2. Exit The Dungeon");
            System.out.println("\t=====================================");
            System.out.print("\tEnter Your Choice : ");
            String input = sc.nextLine();

            while(!input.equals("1") && !input.equals("2")) {
                System.out.println("\tInvalid Output!");
                input = sc.nextLine();
            }

            if(input.equals("1")) {
                System.out.println("\tYou continue the adventure");
            } else if (input.equals("2")){
                System.out.println("\tYou exit the dungeon, successful from your adventure.");
                break;
            }
        }
        System.out.println('\t');
        System.out.println("\t************************");
        System.out.println("\tThank You For Playing");
        System.out.println("\t************************");
    }
    }

