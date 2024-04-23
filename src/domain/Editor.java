package domain;

/**
 * Клас Editor представляє редактора, який є типом митець. Розширює клас Artist
 * та додає функціонал для управління налаштуваннями редагування.
 */
public class Editor extends Artist {

    /**
     * Конструктор, що створює редактора з вказаними параметрами електронного редагування,
     * навичками, ім'ям, посадою, рівнем та відділом.
     *
     * @param electronicEditing Прапорець, що вказує на можливість електронного редагування.
     * @param skills            Масив рядків, які представляють навички редактора.
     * @param name              Ім'я редактора.
     * @param jobTitle          Посада редактора.
     * @param level             Рівень редактора у організації.
     * @param dept              Відділ, до якого належить редактор.
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор, що створює редактора з вказаними параметрами електронного редагування та навичками.
     *
     * @param electronicEditing Прапорець, що вказує на можливість електронного редагування.
     * @param skills            Масив рядків, які представляють навички редактора.
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор, що створює редактора з вказаним параметром електронного редагування.
     *
     * @param electronicEditing Прапорець, що вказує на можливість електронного редагування.
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Конструктор, що створює редактора зі значеннями за замовчуванням та електронним редагуванням за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення редактора, включаючи їх основну інформацію
     * та налаштування редагування.
     *
     * @return Рядок, що містить інформацію та налаштування редактора.
     */
    @Override
    public String toString() {
        String s = super.toString()+"\n Налаштування редагування: ";
        if (electronicEditing)
            s += "електронне";
        else
            s += "паперове";
        return s;
    }

    private boolean electronicEditing;

    /**
     * Повертає параметр електронного редагування редактора.
     *
     * @return Значення true, якщо редактор використовує електронне редагування, і false в іншому випадку.
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює параметр електронного редагування для редактора.
     *
     * @param electronic Параметр, що вказує на використання електронного редагування.
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
