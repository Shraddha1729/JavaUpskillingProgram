package Lesson9;



    public class Main {
        public static void main(String[] args) {
            SalariedEmployee Hugo = new SalariedEmployee ();
            HourlyEmployee Frida = new HourlyEmployee();

            Hugo.name = "Hugo Lifbom";
            Hugo.birthDate = "1980-08-05";
            Hugo.employeeId = 215640656;
            Hugo.annualSalary = 45000;
            Hugo.hireDate = "2016-07-01";
            System.out.println(Hugo);
            Hugo.isRetired = false;
            Hugo.retire();
            System.out.println("This month salary is " + Hugo.collectPay());
            Hugo.terminate("31.12.2025");

            System.out.println("-------------------------");
            Frida.name = "Frida Hansen";
            Frida.birthDate = "1984-11-10";
            Frida.employeeId=344667546;
            Frida.hireDate = "2016-07-01";
            System.out.println(Frida);
            Frida.hourlyPayRate = 7.46;
            System.out.println("Today salary is " + Frida.collectPay());
            System.out.println("Harry will get payed double: " + Frida.getDoublePay());
            Frida.terminate("03.08.2026");

        }

    }


