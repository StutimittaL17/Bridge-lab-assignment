class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = 0;
        this.price = 0.0;
    }

    void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    void displayDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name : " + movieName);
            System.out.println("Seat Number " + seatNumber);
            System.out.println("Price " + price);
    }

    public static void main(String[] args) {
        MovieTicket ob = new MovieTicket("Inglorious Basterds");
        ob.displayDetails();
        ob.bookTicket(12, 250.0);
        ob.displayDetails();
    }
}
