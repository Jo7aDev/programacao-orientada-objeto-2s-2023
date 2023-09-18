class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void acelerar() {
        System.out.println("Acelerando o veículo.");
    }

    public void frear() {
        System.out.println("Freando o veículo.");
    }
}

class Carro extends Veiculo {
    public Carro(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void abrirPortas() {
        System.out.println("Abrindo as portas do carro.");
    }
}

class Moto extends Veiculo {
    public Moto(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void empinar() {
        System.out.println("Empinando a moto!");
    }
}

class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void trocarMarcha() {
        System.out.println("Trocando a marcha da bicicleta.");
    }
}

public class Executavel {
    public static void main(String[] args) {
        Carro carro = new Carro("Kia", "Sorento", 2018);
        Moto moto = new Moto("Honda", "CBR500R", 2021);
        Bicicleta bicicleta = new Bicicleta("Caloi", "Explorer", 2020);

        carro.acelerar();
        moto.acelerar();
        bicicleta.acelerar();

        carro.abrirPortas();
        moto.empinar();
        bicicleta.trocarMarcha();
    }
}
