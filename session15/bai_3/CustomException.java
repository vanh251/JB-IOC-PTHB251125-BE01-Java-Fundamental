package session15.bai_3;

class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}

class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}