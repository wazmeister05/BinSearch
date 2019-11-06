public class Adam {

    public static void main(String[] args){
        BinSearch binSearch = new BinSearch();
        int[] list = {1,2,3,4,5,6,7,8,9,10};

        long start = System.nanoTime();
        System.out.println("Value is at index " + binSearch.binSearch(list, 8));
        System.out.println("Binary Search took " + (System.nanoTime() - start) + " nanoseconds");

        start = System.nanoTime();
        System.out.println("Value is at index " + binSearch.binSearchRecursive(list, 0, list.length-1, 8));
        System.out.println("Recursive Binary Search took " + (System.nanoTime() - start) + " nanoseconds");

    }

}
