public int NthPrime(int input) {

    int arr[] = new int[1000];  // assuming input <= 1000
    int c = 0;

    for (int i = 2; i <= input * 10; i++) {   
        int count = 0;

        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                count++;
            }
        }

        if (count == 2) {   
            arr[c] = i;
            c++;

            if (c == input) {   
                break;
            }
        }
    }

    return arr[input - 1];
}
