import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 집합 A와 B의 원소 개수 입력
        int aSize = scanner.nextInt();
        int bSize = scanner.nextInt();

        // 집합 A와 B 생성
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        // 집합 A의 원소 입력
        for (int i = 0; i < aSize; i++) {
            setA.add(scanner.nextInt());
        }

        // 집합 B의 원소 입력
        for (int i = 0; i < bSize; i++) {
            setB.add(scanner.nextInt());
        }

        int symmetricDifferenceSize = 0;

        for (int num : setA) {
            if (!setB.contains(num)) {
                symmetricDifferenceSize++;
            }
        }

        for (int num : setB) {
            if (!setA.contains(num)) {
                symmetricDifferenceSize++;
            }
        }

        // 결과 출력
        System.out.println(symmetricDifferenceSize);

        scanner.close();
    }
}
