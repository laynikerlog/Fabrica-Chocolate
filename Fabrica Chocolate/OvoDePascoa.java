// Interface para os produtos OvoDePascoa
interface OvoDePascoa {
    void exibirInfo();
}

// Implementações concretas para os ovos de páscoa
class Alpino implements OvoDePascoa {
    @Override
    public void exibirInfo() {
        System.out.println("Nestle - Alpino 337g");
        // Informações adicionais do Alpino
    }
}

class Crocante implements OvoDePascoa {
    @Override
    public void exibirInfo() {
        System.out.println("Garoto - Crocante 215g");
        // Informações adicionais do Crocante
    }
}

class ALeite implements OvoDePascoa {
    @Override
    public void exibirInfo() {
        System.out.println("Lacta - A Leite 170g");
        // Informações adicionais do A Leite
    }
}

// Interface para a fábrica abstrata
interface FabricaDeOvosDePascoa {
    OvoDePascoa criarOvoDePascoa();
}

// Implementações concretas para as fábricas Nestle, Garoto e Lacta
class FabricaNestle implements FabricaDeOvosDePascoa {
    @Override
    public OvoDePascoa criarOvoDePascoa() {
        return new Alpino();
    }
}

class FabricaGaroto implements FabricaDeOvosDePascoa {
    @Override
    public OvoDePascoa criarOvoDePascoa() {
        return new Crocante();
    }
}

class FabricaLacta implements FabricaDeOvosDePascoa {
    @Override
    public OvoDePascoa criarOvoDePascoa() {
        return new ALeite();
    }
}
