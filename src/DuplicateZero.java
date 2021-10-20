public class DuplicateZero {
        public void duplicateZeros(int[] arr) {
            int len = arr.length - 1, pd = 0;
            for (int i = 0; i <= len - pd; i++) {
                if (arr[i] == 0) {
                    if (i == len - pd) {
                        arr[len] = 0;
                        len = len - 1;
                        break;
                    }
                    pd++;
                }
            }
            int j = len - pd;
            for (; j >= 0; j--) {
                if (arr[j] == 0) {
                    arr[j + pd] = 0;
                    pd--;
                    arr[j + pd] = 0;
                } else {
                    arr[j + pd] = arr[j];
                }
            }
        }
}
