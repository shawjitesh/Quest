package sequencevalley.queue;

public class TimeNeededToBuyTickets {

    public int timeRequiredToBuy(int[] tickets, int k) { // optimized
        int time = 0;

        for (int i = 0; i < tickets.length; i++) {
            // If the current person is before or at the desired person 'k'
            if (i <= k) {
                // Buy the minimum of tickets available at person 'k' and the current person
                time += Math.min(tickets[k], tickets[i]);
            } else {
                // If the current person is after 'k', buy the minimum of
                // (tickets available at person 'k' - 1) and the current person
                time += Math.min(tickets[k] - 1, tickets[i]);
            }
        }

        return time;
    }

//    public int timeRequiredToBuy(int[] tickets, int k) { // brute
//        Queue<Integer> ticketsQueue = new LinkedList<>();
//
//        for (int i = 0; i < tickets.length; i++) {
//            ticketsQueue.offer(i);
//        }
//
//        int time = 0;
//
//        while (!ticketsQueue.isEmpty()) {
//            time++;
//
//            int front =  ticketsQueue.poll();
//
//            tickets[front]--;
//
//            if (k == front && tickets[front] == 0) {
//                return time;
//            }
//
//            if (tickets[front] != 0) {
//                ticketsQueue.offer(front);
//            }
//        }
//
//        return time;
//    }
}
