package week3assignment;

public class Movie1 {

		private int id;
		private String title;
		private double duration;
		private int price;

		public Movie1(int id, String title, double duration, int price) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
		this.price = price;
		}



		public int getId() {
		return id;
		}



		public void setId(int id) {
		this.id = id;
		}



		public String getTitle() {
		return title;
		}



		public void setTitle(String title) {
		this.title = title;
		}



		public double getDuration() {
		return duration;
		}



		public void setDuration(double duration) {
		this.duration = duration;
		}



		public int getPrice() {
		return price;
		}



		public void setPrice(int price) {
		this.price = price;
		}



		@Override
		public String toString() {
		return "MovieApp [id=" + id + ", title=" + title + ", duration=" + duration + ", price=" + price + "]";
		}



		public int compareTo(Movie1 o) {
		// TODO Auto-generated method stub
		return this.title.compareTo(o.title);
		}







		}


