package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HW_1_1_Braichenko {                                         // Первый пункт задания


      public String[] numberss = {"1","2","3","4","5","6","7","8"};      // Массив данных

    public List<String> listConverter (String[] ConvertingArray) {       // Метод для конфертации массив->список
        List<String> listNumbers = new ArrayList<>();
        int i = 0;
        while (i != 6) {
            if (i == 3) {
                i++;
                continue;
            }

            listNumbers.add(ConvertingArray[i]);
            i++;
        }
        return listNumbers;                                             // Возврат списка данных
    }

}

