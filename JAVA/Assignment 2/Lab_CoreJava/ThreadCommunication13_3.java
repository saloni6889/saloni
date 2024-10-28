//Use inter-thread communication methods like wait(), notify(), and notifyAll().

package Lab_CoreJava;

class SharedResource {
    private String item;
    private boolean isAvailable = false;
    public synchronized void produce(String value) throws InterruptedException {
        while (isAvailable) {
            wait(); 
        }
        item = value;
        System.out.println("Produced: " + item);
        isAvailable = true;
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!isAvailable) {
            wait(); 
        }
        System.out.println("Consumed: " + item);
        isAvailable = false;
        notify(); 
    }
}

class Producer extends Thread {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            sharedResource.produce("Item 1");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            sharedResource.consume();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ThreadCommunication13_3 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        producer.start();
        consumer.start();
    }
}
