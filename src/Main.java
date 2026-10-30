
void main() {
    Scanner input = new Scanner(System.in);
    System.out.print("Introduce el número de filas (n):");
    int n = input.nextInt();
    System.out.print("Introduce el número de columnas (m):");
    int m = input.nextInt();
    int[][] matriz = new int[n][m];
    int[] sumaColumnas = new int[m];
    System.out.println("Introduce los elementos de la matriz:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            matriz[i][j] = input.nextInt();
        }
    }
    for (int j = 0; j < m; j++) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][j];
        }
        sumaColumnas[j] = suma;
    }

    System.out.println("Suma de cada columna");
    for (int j = 0; j < m; j++) {
        System.out.println(sumaColumnas[j]);
    }
}

