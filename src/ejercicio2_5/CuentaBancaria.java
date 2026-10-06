package ejercicio2_5
        ;
public class CuentaBancaria {

    // Atributo que define los nombres del titular de la cuenta bancaria
    String nombresTitular;

    // Atributo que define los apellidos del titular de la cuenta bancaria
    String apellidosTitular;

    // Atributo que define el número de la cuenta bancaria
    int numeroCuenta;

    // Tipo de cuenta como un valor enumerado
    enum tipo {
        AHORROS,
        CORRIENTE
    }

    // Atributo que define el tipo de cuenta bancaria
    tipo tipoCuenta;

    float saldo = 0;

    // Atributo que define el porcentaje de interés mensual
    float porcentajeInteresMensual;

    CuentaBancaria(String nombresTitular,
                   String apellidosTitular,
                   int numeroCuenta,
                   tipo tipoCuenta,
                   float porcentajeInteresMensual) {

        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.porcentajeInteresMensual = porcentajeInteresMensual;
    }
    
    void imprimir() {

        System.out.println(
                "Nombres del titular = " + nombresTitular
        );

        System.out.println(
                "Apellidos del titular = " + apellidosTitular
        );

        System.out.println(
                "Número de cuenta = " + numeroCuenta
        );

        System.out.println(
                "Tipo de cuenta = " + tipoCuenta
        );

        System.out.println(
                "Saldo = $" + saldo
        );

        System.out.println(
                "Porcentaje de interés mensual = "
                + porcentajeInteresMensual + "%"
        );
    }

    void consultarSaldo() {

        System.out.println(
                "El saldo actual es = $" + saldo
        );
    }

    boolean consignar(int valor) {

        // El valor a consignar debe ser mayor que cero
        if (valor > 0) {

            saldo = saldo + valor;

            System.out.println(
                    "Se ha consignado $" + valor
                    + " en la cuenta. El nuevo saldo es $"
                    + saldo
            );

            return true;

        } else {

            System.out.println(
                    "El valor a consignar debe ser mayor que cero."
            );

            return false;
        }
    }

    boolean retirar(int valor) {

        if ((valor > 0) && (valor <= saldo)) {

            saldo = saldo - valor;

            System.out.println(
                    "Se ha retirado $" + valor
                    + " en la cuenta. El nuevo saldo es $"
                    + saldo
            );

            return true;

        } else {

            System.out.println(
                    "El valor a retirar debe ser menor que "
                    + "el saldo actual."
            );

            return false;
        }
    }

    float calcularNuevoSaldo() {

        float interes = saldo * porcentajeInteresMensual / 100;

        return saldo + interes;
    }

    public static void main(String args[]) {

        CuentaBancaria cuenta = new CuentaBancaria(
                "Pedro",
                "Pérez",
                123456789,
                tipo.AHORROS,
                1.0f
        );

        cuenta.imprimir();

        System.out.println();

        cuenta.consignar(200000);

        cuenta.consignar(300000);

        cuenta.retirar(400000);

        System.out.println();

        cuenta.consultarSaldo();

        System.out.println();

        System.out.println(
                "El nuevo saldo aplicando el interés es = $"
                + cuenta.calcularNuevoSaldo()
        );
    }
}