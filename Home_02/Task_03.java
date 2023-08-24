package Home_02;
// Внутри класса Answer напишите метод answer, который распарсит json и, используя StringBuilder, создаст строки вида:

// Студент [фамилия] получил [оценка] по предмету [предмет].
// На вход метода answer подаются аргументы:

// String JSON
// String ELEMENT1
// String ELEMENT2
// String ELEMENT3

public class Task_03 {
    public static void main(String[] args) {
        String JSON = 
        "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
        "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
        "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String ELEMENT1 = "Студент ";
        String ELEMENT2 = " получил ";
        String ELEMENT3 = " по предмету ";

        StringBuilder result = new StringBuilder();
        String strnew = JSON.replaceAll("\"", "");
        strnew = strnew.replace("{", "").
                        replace("}", "").
                        replace("[", "").
                        replace("]", "");
        String[] elements = strnew.split(",");
        
        for(String element:elements){
            String[] str = element.split(":");
            if (str[0].equals("фамилия")){
                result.append(ELEMENT1).append(str[1]).append("");
            }
            else if (str[0].equals("оценка")){
                result.append(ELEMENT2).append(str[1]).append("");
            }
            else if (str[0].equals("предмет")){
                result.append(ELEMENT3).append(str[1]).append(". \n");
            }
        }
        System.out.println(result);
    } 
}
