package domain;

/**
 * Клас Manager представляє керівника, який є типом працівника. Розширює клас Employee
 * та додає функціонал для управління списком підлеглих.
 */
public class Manager extends Employee {

    /**
     * Конструктор, що створює керівника з вказаними списком підлеглих,
     * ім'ям, посадою, рівнем та відділом.
     *
     * @param employees Масив працівників, які є підлеглими керівника.
     * @param name      Ім'я керівника.
     * @param jobTitle  Посада керівника.
     * @param level     Рівень керівника у організації.
     * @param dept      Відділ, до якого належить керівник.
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає рядкове представлення керівника, включаючи його основну інформацію
     * та список підлеглих.
     *
     * @return Рядок, що містить інформацію про керівника та його підлеглих.
     */
    @Override
    public String toString() {
        return super.toString()+"\nПідлеглі: "+getEmployees(); 
    }

    /**
     * Конструктор, що створює керівника з вказаним списком підлеглих.
     *
     * @param employees Масив працівників, які є підлеглими керівника.
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Конструктор, що створює керівника зі значеннями за замовчуванням та пустим списком підлеглих.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Повертає рядок, що містить імена підлеглих керівника.
     *
     * @return Рядок з іменами підлеглих керівника.
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список підлеглих для керівника.
     *
     * @param employees Масив працівників, які є підлеглими керівника.
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає список підлеглих керівника.
     *
     * @return Масив працівників, які є підлеглими керівника.
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
