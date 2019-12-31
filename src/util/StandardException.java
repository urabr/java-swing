package util;

class StandardException extends Exception {

    public StandardException() {
    }

    public StandardException(String mensagem) {
        super(mensagem);
    }

    public StandardException(Throwable causa) {
        super(causa);
    }

    public StandardException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
