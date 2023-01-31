package com.example.ghasjavasb;

class Customer {
  private final String name;
  private final String id;

  public Customer(String name) {
    this.name = name;
    this.id = name.toUpperCase();
  }

	public String toUri() {
		return "https://localhost:2347/" + this.name;
	}

	public String toURI() {
		return "https://localhost:2347/" + this.name;
	}  

	public boolean equals(Object o) {
		if (o == null) return false;
		if (Customer.class != o.getClass()) return false;
		Customer other = (Customer)o;
		if (!this.name.equals(other.name)) return false;
		if (id != id) return false;  // CodeQL - should trigger "comparison of identical values"
		return true;
	}

}