package java12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsUpdateWithTeeing {
    public static void main(String[] args) {
        Double mean = Stream.of(1,2,3,4,5)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i), Collectors.counting(), (sum, count) -> sum / count));
        System.out.println(mean);

        Result collect = Stream.of(5, 10, 8, 20, 7).collect(Collectors.teeing(
                Collectors.counting(),
                Collectors.filtering(n -> Integer.parseInt(n.toString()) > 10, Collectors.toList()),
                (count, filteredList) -> new Result(count, filteredList)));
        System.out.println(collect.toString());

    }

    public static class Result {
        private Long count;
        private List<Integer> filtered;

        Result(Long count, List<Integer> filtered) {
            this.count = count;
            this.filtered = filtered;
        }

        public Long getCount() {
            return count;
        }

        public void setCount(Long count) {
            this.count = count;
        }

        public List<Integer> getFiltered() {
            return filtered;
        }

        public void setFiltered(List<Integer> filtered) {
            this.filtered = filtered;
        }

        @Override
        public String toString() {
            return "Result{count=" + count + ", filtered=" + filtered +'}';
        }
    }
}
