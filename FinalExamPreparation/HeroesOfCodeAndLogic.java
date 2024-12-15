package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String,Integer>heroesHP=new LinkedHashMap<>();
        Map<String,Integer>heroesMP=new LinkedHashMap<>();

        for(int i=1 ;i<=n ;i++){
            String heroInfo=scanner.nextLine();//"{hero name} {HP} {MP}"
            String []heroData=heroInfo.split("\\s+");
            String heroName=heroData[0];
            int hp=Integer.parseInt(heroData[1]);
            int mp=Integer.parseInt(heroData[2]);
//-	HP stands for hit points and MP for mana points
//-	a hero can have a maximum of 100 HP and 200 MP
            //правя си проверка за хп точките и мп точките
            if(hp <=100){
                heroesHP.put(heroName,hp);
            }
            if(mp <=200){
                heroesMP.put(heroName,mp);
            }
        }

        String command=scanner.nextLine();
        while (!command.equals("End")){
            if(command.contains("CastSpell")){
                //1."CastSpell – {hero name} – {MP needed} – {spell name}
                //•	If the hero has the required MP, he casts the spell, thus reducing his MP. Print this message:
                String heroName=command.split("\\s+-\\s+")[1];
                int mpNeeded=Integer.parseInt(command.split("\\s+-\\s+")[2]);
                String spellName=command.split("\\s+-\\s+")[3];
                //1.Да можем да направим магията трябва: текущото МP >= МPNeeded
                int currentMP=heroesMP.get(heroName);//mp на героя
                if(currentMP>=mpNeeded){
                    //manaPoint left--> от текущите вадя mpNeeded
                    int mpLeft=currentMP-mpNeeded;//точки останали след направата на магията
                    heroesMP.put(heroName,mpLeft);//Намаляваме стойността на Mp -->, he casts the spell, thus reducing his MP
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n",heroName,spellName,mpLeft);
                }else{
                    System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spellName);
                }
            }else if(command.contains("TakeDamage")){
                //2.TakeDamage – {hero name} – {damage} – {attacker}"
                String heroName=command.split("\\s+-\\s+")[1];
                int damage=Integer.parseInt(command.split("\\s+-\\s+")[2]);
                String attackerName=command.split("\\s+-\\s+")[3];
                //Reduce the hero HP by the given damage amount. If the hero is still alive (his HP is greater than 0) print
                int currentHP=heroesHP.get(heroName);
                //•	Reduce the hero HP by the given damage amount.
                currentHP=currentHP-damage;
                //If the hero is still alive (his HP is greater than 0) print:
                if(currentHP > 0){
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName,damage,attackerName,currentHP);
                    heroesHP.put(heroName,currentHP);
                }else{
                    //•	If the hero has died, remove him from your party and print
                    System.out.printf("%s has been killed by %s!%n",heroName,attackerName);
                    heroesHP.remove(heroName);
                    heroesMP.remove(heroName);
                }
            }else if(command.contains("Recharge")){
                //3."Recharge – {hero name} – {amount}"
                String heroName=command.split("\\s+-\\s+")[1];
                int amount=Integer.parseInt(command.split("\\s+-\\s+")[2]);
                //The hero increases his MP. If it brings the MP of the hero above the maximum value (200),
                // MP is increased to 200. (the MP can't go over the maximum value).
                int currentMP=heroesMP.get(heroName);
                currentMP=currentMP+amount;

                if(currentMP>200){
                    currentMP=200;
                }
                System.out.printf("%s recharged for %d MP!%n",heroName,currentMP-heroesMP.get(heroName));
                heroesMP.put(heroName,currentMP);

            }else if(command.contains("Heal")){
                //4.Heal – {hero name} – {amount}"
                String heroName=command.split("\\s+-\\s+")[1];
                int amount=Integer.parseInt(command.split("\\s+-\\s+")[2]);
                //The hero increases his HP. If a command is given that would bring the HP of the hero above the maximum value (100),
                // HP is increased to 100 (the HP can't go over the maximum value).
                int currentHP=heroesHP.get(heroName);
                currentHP=currentHP+amount;

                if(currentHP>100){
                    currentHP=100;
                }
                System.out.printf("%s healed for %d HP!%n",heroName,currentHP-heroesHP.get(heroName));
                heroesHP.put(heroName,currentHP);
            }
            command=scanner.nextLine();
        }

        heroesHP.entrySet()
                .forEach(entry -> {
                    String heroName = entry.getKey();
                    System.out.println(heroName);
                    System.out.println("  HP: "+ entry.getValue());
                    System.out.println("  MP: "+ heroesMP.get(heroName));
                });

    }
}
