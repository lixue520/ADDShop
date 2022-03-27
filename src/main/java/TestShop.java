/**
 * @Author qin
 * @Data 20:40
 * @Version 1.0
 */
public class TestShop {
    public TestShop() {

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

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    @Override
    public String toString() {
        return "TestShop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", man='" + man + '\'' +
                '}';
    }
    @TM
    int id;
    String name;

    public TestShop(int id, String name, String man) {

        this.id = id;
        this.name = name;
        this.man = man;
    }

    String man;
}
