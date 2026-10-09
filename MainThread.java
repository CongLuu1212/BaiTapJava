public class MainThread {
    public static void main(String[] args) {
        // Bai 1: Tinh chu vi va dien tich hinh tron
        Circle circle = new Circle(5.5);

        System.out.println("===== BAI 1: HINH TRON =====");
        System.out.println("Ban kinh hinh tron: " + circle.getRadius());
        System.out.println("Dien tich hinh tron: " + circle.getArea());
        System.out.println("Chu vi hinh tron: " + circle.getPerimeter());

        // Bai 2: Kiem tra ket qua hoc tap sinh vien
        StudentMark student1 = new StudentMark(
                "Nguyen Van An", 80, 75, 8.0);

        StudentMark student2 = new StudentMark(
                "Tran Van Binh", 70, 35, 7.0);

        System.out.println();
        System.out.println("===== BAI 2: KET QUA HOC TAP =====");

        System.out.println("--- Sinh vien 1 ---");
        student1.displayResult();

        System.out.println("--- Sinh vien 2 ---");
        student2.displayResult();
    }
}