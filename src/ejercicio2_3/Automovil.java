package ejercicio2_3;

public class Automovil {

    // Atributo que define la marca de un automóvil
    String marca;

    // Atributo que define el modelo de un automóvil
    int modelo;

    // Atributo que define el motor de un automóvil
    int motor;

    // Tipo de combustible como un valor enumerado
    enum tipoCom {
        GASOLINA,
        BIOETANOL,
        DIESEL,
        BIODIESEL,
        GAS_NATURAL
    }

    // Atributo que define el tipo de combustible
    tipoCom tipoCombustible;

    // Tipo de automóvil como un valor enumerado
    enum tipoA {
        CIUDAD,
        SUBCOMPACTO,
        COMPACTO,
        FAMILIAR,
        EJECUTIVO,
        SUV
    }

    // Atributo que define el tipo de automóvil
    tipoA tipoAutomovil;

    // Atributo que define el número de puertas
    int numeroPuertas;

    // Atributo que define la cantidad de asientos
    int cantidadAsientos;

    // Atributo que define la velocidad máxima
    int velocidadMaxima;

    // Color del automóvil como un valor enumerado
    enum tipoColor {
        BLANCO,
        NEGRO,
        ROJO,
        NARANJA,
        AMARILLO,
        VERDE,
        AZUL,
        VIOLETA
    }

    // Atributo que define el color
    tipoColor color;

    // Atributo que define la velocidad actual
    int velocidadActual = 0;

    // Atributo que determina si el automóvil es automático
    boolean automatico;

    // Atributo que almacena el valor total de las multas
    int multa = 0;

    // Valor de cada multa
    final int VALOR_MULTA = 100000;

    Automovil(String marca, int modelo, int motor,
              tipoCom tipoCombustible,
              tipoA tipoAutomovil,
              int numeroPuertas,
              int cantidadAsientos,
              int velocidadMaxima,
              tipoColor color,
              boolean automatico) {

        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.automatico = automatico;
    }

    // GETTERS

    String getMarca() {
        return marca;
    }

    int getModelo() {
        return modelo;
    }

    int getMotor() {
        return motor;
    }

    tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }

    int getNumeroPuertas() {
        return numeroPuertas;
    }

    int getCantidadAsientos() {
        return cantidadAsientos;
    }

    int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    tipoColor getColor() {
        return color;
    }

    int getVelocidadActual() {
        return velocidadActual;
    }

    boolean getAutomatico() {
        return automatico;
    }

    int getValorMultas() {
        return multa;
    }

    // SETTERS

    void setMarca(String marca) {
        this.marca = marca;
    }

    void setModelo(int modelo) {
        this.modelo = modelo;
    }

    void setMotor(int motor) {
        this.motor = motor;
    }

    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    void setColor(tipoColor color) {
        this.color = color;
    }

    void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    void acelerar(int incrementoVelocidad) {

        // La velocidad no puede superar la velocidad máxima
        if (velocidadActual + incrementoVelocidad <= velocidadMaxima) {

            velocidadActual = velocidadActual + incrementoVelocidad;

        } else {

            System.out.println(
                    "No se puede incrementar a una velocidad superior "
                    + "a la máxima del automóvil."
            );

            // Se genera una multa por intentar superar la velocidad máxima
            multa = multa + VALOR_MULTA;

            System.out.println(
                    "Se ha generado una multa de $" + VALOR_MULTA
            );
        }
    }

    void desacelerar(int decrementoVelocidad) {

        // La velocidad no puede ser negativa
        if (velocidadActual - decrementoVelocidad >= 0) {

            velocidadActual = velocidadActual - decrementoVelocidad;

        } else {

            System.out.println(
                    "No se puede decrementar a una velocidad negativa."
            );
        }
    }

    void frenar() {
        velocidadActual = 0;
    }

    double calcularTiempoLlegada(double distancia) {

        if (velocidadActual == 0) {

            System.out.println(
                    "No se puede calcular el tiempo porque "
                    + "el automóvil está detenido."
            );

            return 0;
        }

        return distancia / velocidadActual;
    }

    boolean tieneMultas() {
        return multa > 0;
    }

    int valorTotalMultas() {
        return multa;
    }

    void imprimir() {

        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
        System.out.println("Velocidad actual = " + velocidadActual);
        System.out.println("¿Es automático? = " + automatico);
        System.out.println("Valor total de multas = $" + multa);
    }

    public static void main(String args[]) {

        Automovil auto1 = new Automovil(
                "Ford",
                2018,
                3,
                tipoCom.DIESEL,
                tipoA.EJECUTIVO,
                5,
                6,
                250,
                tipoColor.NEGRO,
                true
        );

        // Mostrar los datos del automóvil
        auto1.imprimir();

        System.out.println();

        // Colocar la velocidad actual en 100 km/h
        auto1.setVelocidadActual(100);
        System.out.println(
                "Velocidad actual = " + auto1.getVelocidadActual()
        );

        // Aumentar la velocidad en 20 km/h
        auto1.acelerar(20);
        System.out.println(
                "Velocidad actual = " + auto1.getVelocidadActual()
        );

        // Disminuir la velocidad en 50 km/h
        auto1.desacelerar(50);
        System.out.println(
                "Velocidad actual = " + auto1.getVelocidadActual()
        );

        // Frenar
        auto1.frenar();
        System.out.println(
                "Velocidad actual = " + auto1.getVelocidadActual()
        );

        // Probar que no se puede desacelerar por debajo de cero
        auto1.desacelerar(20);

        System.out.println();

        // Probar una aceleración que supera la velocidad máxima
        auto1.setVelocidadActual(240);
        auto1.acelerar(20);

        System.out.println();

        // Determinar si el automóvil tiene multas
        if (auto1.tieneMultas()) {
            System.out.println("El automóvil tiene multas.");
        } else {
            System.out.println("El automóvil no tiene multas.");
        }

        // Mostrar el valor total de las multas
        System.out.println(
                "Valor total de multas = $"
                + auto1.valorTotalMultas()
        );
    }
}