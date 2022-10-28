package lesson11;

    public class Task4 {
        private final Long a;
        private final int с;
        private final int m;

        private Long seed;

        public Task4 seed(Long seed) {
            this.seed = seed;
            return this;
        }
        public Task4(Long a, int с, int m) {
            this.a = a;
            this.с = с;
            this.m = m;
        }

        public long next() {
            return (a * seed + с) % m;
        }
    }


