/*
Описати класи marriage.Man і marriage.Woman, що наслідують клас marriage.Person.
Обидва класи мають властивості:
firstName
lastName
age
partner
інші властивості, які ви вважаєте необхідними
Обидва класи мають методи:
конструктор, який включає всі поля
сеттер і геттер на полі age, та інші властивості, де це необхідно
isRetired (повертає true, якщо вік більше пенсійного порогу 60 для жінок та 65 для чоловіків)
registerPartnership (мається на увазі, що дружина приймає прізвище чоловіка)
deregisterPartnership (як вхідний параметр приймає boolean: повернення до попереднього прізвища)
За бажанням доповнити один або обидва класи будь-якими властивостями та/або методами.
 */

import marriage.Man;
import marriage.Person;
import marriage.Woman;

public class Main {

  public static void main(String[] args) {
    Man man1 = new Man("Robert", "Plant", 64, null);
    System.out.printf("%s, %s\n", man1, man1.getPartnerName());
    Woman woman1 = new Woman("Maureen", "Wilson", 61, man1);
    System.out.printf("%s, %s\n", man1, man1.getPartnerName());
    System.out.printf("%s, %s\n", woman1, woman1.getPartnerName());
    System.out.printf("%s has maiden name %s\n", woman1, woman1.getMaidenName());
    woman1.deregisterPartnership(true);
    System.out.printf("%s, %s\n", man1, man1.getPartnerName());
    System.out.printf("%s, %s\n", woman1, woman1.getPartnerName());
    man1.registerPartnership(man1);
    System.out.printf("%s, %s\n", man1, man1.getPartnerName());
    System.out.printf("%s, %s\n", woman1, woman1.getPartnerName());
    man1.registerPartnership(woman1);
    System.out.printf("%s, %s\n", man1, man1.getPartnerName());
    System.out.printf("%s, %s\n", woman1, woman1.getPartnerName());
    woman1.deregisterPartnership(false);
    System.out.printf("%s, %s\n", man1, man1.getPartnerName());
    System.out.printf("%s, %s\n", woman1, woman1.getPartnerName());
    System.out.printf("%s %s\n", man1, man1.isRetired() ? "is retired" : "is not retired");
    System.out.printf("%s %s\n", woman1, woman1.isRetired() ? "is retired" : "is not retired");
  }

}
