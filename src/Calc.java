class Main {
    public static String calc(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Неверный формат ввода");
        }

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String op = parts[1];

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new IllegalArgumentException("Числа должны быть в диапазоне от 0 до 10");
        }

        int result;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Неверная операция");
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите выражение (или 'exit' для выхода): ");
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) break;
                System.out.println(calc(input));
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                break; // или продолжить, в зависимости от требований к обработке ошибок
            }
        }
    }
}
