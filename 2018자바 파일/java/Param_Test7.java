//4. �ΰ��� ���� �Է¹޾� �� ���� ������ 3�� ����̰ų� 7�� ����� ������ �հ� ���
class Param_Test7 {
    public static void main(String ar[]) {
        int n = Integer.parseInt(ar[0]);
        int m = Integer.parseInt(ar[1]);
        int max = 0, min = 0, total = 0, count = 0;

        if (n < m) {
            max = m;
            min = n;
        } else if (m < n) {
            max = n;
            min = m;
        }

        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                total += i;
                count++;
            }
        }
        System.out.println("n~m�� 3�� ����̰ų� 7�� ����� ������ ��: " + total);
        System.out.println("n~m�� 3�� ����̰ų� 7�� ����� ������ ���: " + total / count);
    }
}