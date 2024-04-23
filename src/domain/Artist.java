package domain;

/**
 * Клас Artist представляє працівника, який є митець. Він розширює клас Employee
 * та додає функціонал для управління навичками, характерними для митця.
 */
public class Artist extends Employee {

    /**
     * Конструктор, що створює митця з вказаними навичками, ім'ям, посадою, рівнем та відділом.
     *
     * @param skills    Масив рядків, які представляють навички митця.
     * @param name      Ім'я митця.
     * @param jobTitle  Посада митця.
     * @param level     Рівень митця у організації.
     * @param dept      Відділ, до якого належить митець.
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Конструктор, що створює митця з вказаними навичками.
     *
     * @param skills Масив рядків, які представляють навички митця.
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }
    
    /**
     * Конструктор, що створює митця зі значеннями за замовчуванням та пустим масивом навичок.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Повертає рядкове представлення митця, включаючи їх основну інформацію
     * та навички.
     *
     * @return Рядок, що містить інформацію та навички митця.
     */
    @Override
    public String toString() {
        return super.toString()+"\nНавички: "+getSkills();
    }

    private String[] skills;

    /**
     * Повертає навички митця у вигляді масиву рядків.
     *
     * @return Масив рядків, що представляє навички митця.
     */
    public String[] getSkillsList() {
        return skills;
    }

    /**
     * Встановлює навички митця на вказаний масив рядків.
     *
     * @param skills Масив рядків, що представляє навички митця.
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    // Приватні методи зазвичай не документуються в Javadoc.
    private String getSkills() {
        String s = "";
        for (String e : skills) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }
}
