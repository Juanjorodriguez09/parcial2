class Main {
    public static void main(String[] args) {
        TipoTenis.mostrarTenis();
        System.out.println();

        for (TipoTenis tenis : TipoTenis.values()) {
            tenis.usarTenis();
        }
    }
}

