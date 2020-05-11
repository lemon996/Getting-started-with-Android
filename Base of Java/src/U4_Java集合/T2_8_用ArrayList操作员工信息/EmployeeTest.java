package U4_Java集合.T2_8_用ArrayList操作员工信息;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "张三", 5000);
        Employee employee2 = new Employee(2, "李四", 5500);
        Employee employee3 = new Employee(3, "赵六", 4000);

        ArrayList list = new ArrayList();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("员工姓名\t员工薪资");
        for (int i = 0; i < list.size(); i++) {
            Employee employee = (Employee) list.get(i);
            System.out.println(employee.getName() + "\t" + employee.getSalary());
        }
    }
}
