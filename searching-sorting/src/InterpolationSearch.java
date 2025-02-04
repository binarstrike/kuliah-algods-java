public class InterpolationSearch {

  public static int interpolationSearch(int[] arr, int x) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high && x >= arr[low] && x <= arr[high]) {
      int pos = low + ((x - arr[low]) * (high - low) / (arr[high] - arr[low]));

      if (arr[pos] == x) {
        return pos;
      } else if (arr[pos] < x) {
        low = pos + 1;
      } else {
        high = pos - 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] array = { 21, 23, 34, 54, 67, 81, 87, 98, 101 };
    int searchVal = 54; // 54 122

    int result = interpolationSearch(array, searchVal);

    if (result != -1) {
      System.out.printf("Nilai %d ditemukan di indeks %d", searchVal, result);
    } else {
      System.out.printf("Nilai %d tidak ditemukan di dalam array", searchVal);
    }
  }
}
