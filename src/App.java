public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setAge(26);
        cliente.setName("Ana");
        cliente.setPhone(1212343456);
        cliente.setCredito(5000);
        

        System.out.println("Edad del cliente: "+cliente.getAge() +"\nNombre del cliente: "+cliente.getName());
        System.out.println("Telefono del cliente: "+cliente.getPhone() +"\nCredito del cliente: "+cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setAge(28);
        trabajador.setName("Rosa");
        trabajador.setPhone(1212343456);
        trabajador.setSalario(10000);
        System.out.println("----------------------------------------");
        System.out.println("Edad del trabajador: "+trabajador.getAge() +"\nNombre del trabajador: "+trabajador.getName());
        System.out.println("Telefono del trabajador: "+trabajador.getPhone() +"\nCredito del trabajador: "+trabajador.getSalario());
    }
}
class Persona {
    private int age;
    private String name;
    private int phone;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    

}

class Cliente extends Persona {
    private int credito; 

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
