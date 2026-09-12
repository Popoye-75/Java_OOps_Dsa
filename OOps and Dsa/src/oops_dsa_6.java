// import java.util.Queue;
// import java.util.Stack;
// import java.util.TreeSet;
// import java.util.HashSet;
// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.PriorityQueue;

// /* Question 5 -->  Music Playlist */
class Playlist {
    static class Node {
        String data;
        Node next = null;
        Node prev = null;

        Node(String data) {
            this.data = data;
        }
    }

    private Node head;

    void addFrist(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
    }
}
// /* Question 4 --> University student registry */
// class Student implements Comparable<Student> {
// private String name;
// private int roll;
// Student(String name, int roll) {
// this.name = name;
// this.roll = roll;
// }
// public int getRoll() {
// return roll;
// }
// public String getName() {
// return name;
// }
// @Override
// public String toString(){
// return "Name --> " + name + " Roll --> "+ roll;
// }
// @Override
// public boolean equals(Object o) {
// if (this == o)
// return true;
// if (o == null || getClass() != o.getClass())
// return false;
// Student student = (Student) o;
// return this.roll == student.roll; // Agar roll String hai toh
// this.roll.equals(student.roll) use karein
// }
// @Override
// public int hashCode() {
// return Integer.hashCode(roll); // Agar roll String hai toh Objects.hash(roll)
// use karein
// }
// @Override
// public int compareTo(Student s) {
// int nameComparision = this.name.compareTo(s.name);
// if (nameComparision != 0) {
// return nameComparision;
// }
// return Integer.compare(this.roll, s.roll);
// }
// }
// class University {
// private HashSet<Student> studentSet = new HashSet<>();
// private TreeSet<Student> studentAlpha = new TreeSet<>();
// private String universityName;
// private static University instance;
// private University(String university) {
// this.universityName = university;
// }
// public static University getInstance(String universityName) {
// if (instance == null) {
// instance = new University(universityName);
// }
// return instance;
// }
// public void addStudent(Student s) {
// if (s == null) {
// return;
// }
// studentSet.add(s);
// studentAlpha.add(s);
// }
// public String getUniversityName() {
// return universityName;
// }
// public void displayStudents() {
// for(Student std : studentAlpha){
// System.out.println(std.toString());
// }
// }
// }

// /* Question 3 --> Food Delivery System */
// class Order{
// private String orderId;
// private String orderStatus;
// Order(String orderId,String orderStatus){
// this.orderStatus = orderStatus;
// this.orderId = orderId;
// }
// public String getOrderId(){
// return orderId;
// }
// public void updateStatus(String status){
// this.orderStatus = status;
// }
// public String getOrderStatus(){
// return orderStatus;
// }
// }
// class Restro{
// private String restroName;
// private HashMap<String,Order> order = new HashMap<>();
// private Queue<Order> newOrder = new LinkedList<>();
// Restro(String restroName){
// this.restroName = restroName;
// }
// public String getRestroName(){
// return restroName;
// }
// public void addOrder(Order o){
// if(o == null){
// return;
// }
// order.put(o.getOrderId(),o);
// newOrder.offer(o);
// o.updateStatus("Order Placed ...");
// }
// public void processOrder(){
// if(newOrder.isEmpty()){
// return;
// }
// Order o = newOrder.poll();
// o.updateStatus("Under Processing ....");
// }
// public String getOrder(String orderId){
// if(!order.containsKey(orderId)){
// return "Order not exists";
// }
// Order ord = order.get(orderId);
// return "Order Id: "+ord.getOrderId()+" Order Status: "+ord.getOrderStatus();
// }
// }

// /* Question 2 --> Browser Back & Forward History */
// class History {
// private String url;
// private String visitedPage;
// History(String url, String visitedPage) {
// this.url = url;
// this.visitedPage = visitedPage;
// }
// public String getUrl() {
// return url;
// }
// public String getPage() {
// return visitedPage;
// }
// }
// class Browser {
// private Stack<History> backwardStack = new Stack<>();
// private Stack<History> forwardStack = new Stack<>();
// private History history;
// private String browserName;
// Browser(String name) {
// this.browserName = name;
// }
// public String getBrowserName() {
// return browserName;
// }
// public void visit(String url, String pageName) {
// if (url != null && pageName != null) {
// backwardStack.push(new History(url, pageName));
// }
// forwardStack.clear();
// return;
// }
// public String forward() {
// if (!forwardStack.isEmpty()) {
// history = forwardStack.pop();
// backwardStack.push(history);
// return history.getPage() + " " + history.getUrl();
// }
// return "There is no history !";
// }
// public String back() {
// if (!backwardStack.isEmpty()) {
// history = backwardStack.pop();
// forwardStack.push(history);
// return history.getPage() + " " + history.getUrl();
// }
// return "There is no previous History !";
// }
// }

// /* Question 1 --> Hospital Emergency Queue */
// enum EmergencyLevel {
// HIGH, // Index Original = 0
// MEDIUM, // Index Original = 1
// LOW // Index Original = 2
// }
// class Patient implements Comparable<Patient> {
// private int id;
// private String name;
// private EmergencyLevel emergencyLevel;
// Patient(int id, String name, EmergencyLevel emLevel) {
// this.id = id;
// this.name = name;
// this.emergencyLevel = emLevel;
// }
// public int getId() {
// return id;
// }
// public String getName() {
// return name;
// }
// public EmergencyLevel getLevel() {
// return emergencyLevel;
// }
// @Override
// public int compareTo(Patient p) {
// return this.emergencyLevel.compareTo(p.emergencyLevel);
// }
// }
// class Hospital {
// private String hospitalName;
// private HashMap<Integer, Patient> map = new HashMap<>();
// private PriorityQueue<Patient> pList = new PriorityQueue<>();
// Hospital(String hospitalName) {
// this.hospitalName = hospitalName;
// }
// public String getHospitalName() {
// return hospitalName;
// }
// public void addPatient(Patient p) {
// if (p != null) {
// map.put(p.getId(), p);
// pList.offer(p);
// }
// return;
// }
// public String isRegistered(int id) {
// if (map.containsKey(id)) {
// return "Already registered ..";
// }
// return "Patient not exist";
// }
// public Patient treatPatient() {
// Patient patient = pList.poll();
// if (patient != null) {
// return map.remove(patient.getId());
// }
// return patient;
// }
// }

public class oops_dsa_6 {
    public static void main(String[] args) {

        // /* Question 1 --> Hospital Emergency Queue */
        // Hospital hospital = new Hospital("City Care Hospital");
        // // Patients added in random order
        // hospital.addPatient(new Patient(101, "Alice", EmergencyLevel.LOW));
        // hospital.addPatient(new Patient(102, "Bob", EmergencyLevel.HIGH));
        // hospital.addPatient(new Patient(103, "Charlie", EmergencyLevel.MEDIUM));
        // System.out.println("ID 102 check: " + hospital.isRegistered(102)); // Quick
        // O(1) registration check
        // // Processing order according to priority (HIGH -> MEDIUM -> LOW)
        // Patient treated1 = hospital.treatPatient();
        // System.out.println("Treated First: " + treated1.getName() + " (" +
        // treated1.getLevel() + ")");
        // Patient treated2 = hospital.treatPatient();
        // System.out.println("Treated Second: " + treated2.getName() + " (" +
        // treated2.getLevel() + ")");
        // Patient treated3 = hospital.treatPatient();
        // System.out.println("Treated Third: " + treated3.getName() + " (" +
        // treated3.getLevel() + ")");

        // /* Question 2 --> Browser Back & Forward History */
        // Browser myBrowser = new Browser("Chrome");
        // System.out.println("Browser Started: " + myBrowser.getBrowserName());
        // myBrowser.visit("https://google.com", "Google Home");
        // myBrowser.visit("https://github.com", "GitHub Dashboard");
        // myBrowser.visit("https://stackoverflow.com", "StackOverflow Q&A");
        // System.out.println("\n--- Going Back ---");
        // System.out.println("Current Page: " + myBrowser.back());
        // System.out.println("Current Page: " + myBrowser.back());
        // System.out.println("\n--- Going Forward ---");
        // System.out.println("Current Page: " + myBrowser.forward());
        // System.out.println("\n--- Visiting New Page from GitHub ---");
        // myBrowser.visit("https://leetcode.com", "LeetCode Problems");
        // System.out.println("Trying to go Forward: " + myBrowser.forward());

        // /* Question 3 --> Food Delivery System */
        // Restro restro = new Restro("Pizza Palace");
        // Order ord1 = new Order("ORD101", "Received");
        // Order ord2 = new Order("ORD102", "Received");
        // Order ord3 = new Order("ORD103", "Received");
        // restro.addOrder(ord1);
        // restro.addOrder(ord2);
        // restro.addOrder(ord3);
        // System.out.println(restro.getOrder("ORD101"));
        // restro.processOrder();
        // System.out.println(restro.getOrder("ORD101"));
        // System.out.println(restro.getOrder("ORD102"));
        // System.out.println(restro.getOrder("ORD999"));

        // /* Question 4 --> University student registry */
        // University uni = University.getInstance("Tony");
        // System.out.println("University Name --> "+ uni.getUniversityName());
        // Student s1 = new Student("Popoye", 24);
        // Student s2 = new Student("Stark", 47);
        // Student s3 = new Student("Steve", 40);
        // Student s4 = new Student("Natasha", 70);
        // Student s5 = new Student("Rahul", 101);
        // Student s6 = new Student("Amit", 102);
        // Student s7 = new Student("Rahul", 103);
        // Student s8 = new Student("Priya", 104);
        // uni.addStudent(s1);
        // uni.addStudent(s2);
        // uni.addStudent(s3);
        // uni.addStudent(s4);
        // uni.addStudent(s5);
        // uni.addStudent(s6);
        // uni.addStudent(s7);
        // uni.addStudent(s8);
        // System.out.println("Registered Student :-");
        // uni.displayStudents();

    }
}
