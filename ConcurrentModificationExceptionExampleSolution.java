public class ConcurrentModificationExceptionExampleSolution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        // Solution 1: Using an Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("b")) {
                iterator.remove();
            }
        }
        System.out.println("Solution 1: " + list);

        // Solution 2: Creating a new list
        list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> newList = new ArrayList<>();
        for (String item : list) {
            if (!item.equals("b")) {
                newList.add(item);
            }
        }
        list = newList; 
        System.out.println("Solution 2: " + list);
    }
}