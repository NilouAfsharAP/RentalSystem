import java.util.*;

public class Rental{

    private Customer customer;
    private Movie movie;
    private Game game;
    private Book book;
    private long id;
    private Date rentalDate;
    private Date returnDate;

    public Rental(Movie movie , Customer customer , long id) {
        this.movie = movie;
        this.customer = customer;
        this.id = id;
        this.rentalDate = new Date();
    }

    public Rental(Game game , Customer customer , long id) {
        this.game = game;
        this.customer = customer;
        this.id = id;
        this.rentalDate = new Date();
    }

    public Rental(Book book , Customer customer , long id) {
        this.book = book;
        this.customer = customer;
        this.id = id;
        this.rentalDate = new Date();
    }

    public Customer getCustomer() {
        return customer;
    }

    public Movie getMovie() {
        return movie;
    }

    public Game getGame() {
        return game;
    }

    public Book getBook() {
        return book;
    }

    public long getId() {
        return id;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate){
        this.returnDate = returnDate;
    }

    public double calculateFee(){
        double feePerDay = 1.2;
        return (feePerDay*(returnDate.getDate()-rentalDate.getDay()));
    }

}