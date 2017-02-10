public class NumberRange {
    public static void main(String[] args) {
        Range range = new Range(2, 35);
        System.out.println(range.isInside(5));
        System.out.print(range.length());
    }

    static class Range {
        private double from;
        private double to;

        public Range(double a, double b) {
            this.from = a;
            this.to = b;
            if (a > b){
                this.to = a;
                this.from = b;
            }
        }

        public double length() {
            return Math.abs(to -from);
        }

        public boolean isInside(double inputNumber) {
            return inputNumber > from && inputNumber < to;
        }
    }
}
