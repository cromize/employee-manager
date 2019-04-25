package cz.vutbr.feec.empl;

public class AbstractEmployee {
  protected int id;
  protected String name;
  protected long salary;

  public AbstractEmployee(int id, String name, long salary) {
    super();
    this.setId(id);
    this.setName(name);
    this.setSalary(salary);
  }
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getSalary() {
    return salary;
  }

  public void setSalary(long salary) {
    this.salary = salary;
  }
}
