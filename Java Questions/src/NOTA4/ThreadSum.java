package NOTA4;

class ThreadSum extends Thread {
    private int[] array;
    private int start;
    private int end;
    private int threadID;
    private int partialSum;

    public ThreadSum(int[] array, int start, int end, int threadID) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.threadID = threadID;
        this.partialSum = 0;
    }

    public int getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadID + " somando elementos de índice " + start + " a " + (end - 1));
        for (int i = start; i < end; i++) {
            System.out.print(array[i] + " ");
            partialSum += array[i];
        }
        System.out.println("\nThread " + threadID + " soma parcial: " + partialSum);
    }
}
