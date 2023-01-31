package com.example.ghasjavasb;

class Customer {
  private final String name;

  public Customer(String name) {
    this.name = name;
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
		if (!name.equals(o.name)) return false;
		if (id != id) return false;  // CodeQL - should trigger "comparison of identical values"
		return true;
	}

}