package sequencevalley.queue;

public class Main {

    public static void main(String[] args) {
        int numberOfStudentsUnableToEat = new NumberOfStudentsUnableToEatLunch().countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1});
        System.out.println(numberOfStudentsUnableToEat);

        int time = new TimeNeededToBuyTickets().timeRequiredToBuy(new int[]{2, 3, 2}, 2);
        System.out.println(time);

        ImplementQueueUsingStacks implementQueueUsingStacks = new ImplementQueueUsingStacks();
        implementQueueUsingStacks.push(1);
        implementQueueUsingStacks.push(2);
        System.out.println(implementQueueUsingStacks.peek());
        System.out.println(implementQueueUsingStacks.pop());
        System.out.println(implementQueueUsingStacks.empty());
    }
}
