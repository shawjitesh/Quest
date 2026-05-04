package sequencevalley.queue;

public class NumberOfStudentsUnableToEatLunch {

    public int countStudents(int[] students, int[] sandwiches) { // optimized
        int circleStudentCount = 0;
        int squareStudentCount = 0;

        // Count the number of students who want each type of sandwich
        for (int student : students) {
            if (student == 0) {
                circleStudentCount++;
            } else {
                squareStudentCount++;
            }
        }

        // Serve sandwiches to students
        for (int sandwich : sandwiches) {
            // No student wants the circle sandwich on top of the linearshoal.stack
            if (sandwich == 0 && circleStudentCount == 0) {
                return squareStudentCount;
            }
            // No student wants the square sandwich on top of the linearshoal.stack
            if (sandwich == 1 && squareStudentCount == 0) {
                return circleStudentCount;
            }
            // Decrement the count of the served sandwich type
            if (sandwich == 0) {
                circleStudentCount--;
            } else {
                squareStudentCount--;
            }
        }
        // Every student received a sandwich
        return 0;
    }

//    public int countStudents(int[] students, int[] sandwiches) { // brute
//        int len = students.length;
//        Queue<Integer> studentPreferenceQueue = new LinkedList<>();
//        Stack<Integer> sandwichStack = new Stack<>();
//
//        for (int i = 0; i < len; i++) {
//            studentPreferenceQueue.offer(students[i]);
//            sandwichStack.push(sandwiches[len - i - 1]);
//        }
//
//        int lastServed = 0;
//        while (!studentPreferenceQueue.isEmpty() && lastServed < studentPreferenceQueue.size()) {
//            if(Objects.equals(sandwichStack.peek(), studentPreferenceQueue.peek())) {
//                sandwichStack.pop();
//                studentPreferenceQueue.poll();
//                lastServed = 0;
//            } else {
//                studentPreferenceQueue.offer(studentPreferenceQueue.poll());
//                lastServed++;
//            }
//        }
//
//        return studentPreferenceQueue.size();
//    }
}
