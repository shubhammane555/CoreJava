package com.shubham.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Phnno {
	String countrycode, phnnum;

	Phnno(String countrycode, String phnnum) {
		this.countrycode = countrycode;
		this.phnnum = phnnum;
	}

	public String toString() {
		return countrycode + "" + phnnum;
	}

}

class Indphnno extends Phnno {
	public static final String phno = null;

	Indphnno(String phnno) {
		super("+91", phnno);
	}
}

class person {
	String Firstname, Lastname, email, password;
	Indphnno[] phnno;
	Date dateofbirth;

	person(String Firstname, String Lastname, String email, String password, Indphnno[] phnno, Date dateofbirth) {
		this.Firstname = Firstname;
		this.Lastname = Lastname;
		this.email = email;
		this.password = password;
		this.phnno = phnno;
		this.dateofbirth = dateofbirth;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String Firstname) {
		this.Firstname = Firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String Lastname) {
		this.Lastname = Lastname;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String passsword) {
		this.password = password;
	}

	public Date dateofbirth() {
		return dateofbirth;
	}

	public void setdateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;

	}

	public Indphnno[] getphnno() {
		return phnno;
	}

	public void setphnno(Indphnno[] phnno) {
		this.phnno = phnno;
	}

	public String toString() {
		return "person[email=" + email + ",Firstname=" + Firstname + ",Lastname=" + Lastname + ",password=" + password
				+ ",phnno=" + Arrays.toString(phnno) + "]";
	}

}

class validation {
	static boolean isAlphabet(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!(Character.isLetter(s.charAt(i))))
				return false;
		}
		return true;
	}

	static boolean isvalidphnno(String phnno) {
		if (phnno.length() != 10)
			return false;
		for (int i = 0; i < phnno.length(); i++) {
			if (!(Character.isDigit(phnno.charAt(i))))
				return false;
		}
		return true;
	}

	static boolean isvalidemail(String email) {
		int dot = 0;
		int at = 0;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == ' ')
				return false;
			if (email.charAt(i) == '@')
				at++;
			if (email.charAt(i) == '.')
				dot++;
		}
		return (dot > 0 && at > 0);
	}

	static boolean isvalidpassword(String password) {
		if (password.length() < 8 || password.length() > 16)
			return false;
		int digits = 0;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i)))
				digits++;
		}
		return digits > 0;
	}

	static boolean isvaliddate(Date dateofbirth) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateofbirth);
		return ((cal.get(Calendar.MONTH) >= 1 || cal.get(Calendar.MONTH) <= 12)
				&& (cal.get(Calendar.DATE) >= 1 || cal.get(Calendar.DATE) <= 31)
				&& (cal.get(Calendar.YEAR) >= 1999 || cal.get(Calendar.YEAR) <= 2009));
	}

	static void validate(person p) throws IllegalArgumentException {
		if (!isAlphabet(p.getFirstname()))
			throw new IllegalArgumentException("First name can only contain alphabates");
		if (!isAlphabet(p.getLastname()))
			throw new IllegalArgumentException("last name can only contain alphabates");
		if (!isvalidemail(p.getemail()))
			throw new IllegalArgumentException(
					"amail should cantain an (.) and (@) and should not have spaces in between");
		if (!isvalidpassword(p.getpassword()))
			throw new IllegalArgumentException(
					"password should be greter thn 8 and less then 16 and cantain one digit");
		Indphnno[] phnno = p.getphnno();
		for (int i = 0; i < phnno.length; i++) {
			if (!isvalidphnno(phnno[i].phnnum))
				throw new IllegalArgumentException("phn no should be 10 digits");
		}
		if (!isvaliddate(p.dateofbirth)) {
			throw new IllegalArgumentException("Invalid dob");
		}
	}

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name");
		String Firstname = sc.next();
		System.out.println("enter last name");
		String Lastname = sc.next();
		System.out.println("enter email");
		String email = sc.next();
		System.out.println("enter password");
		String password = sc.next();
		System.out.println("enter phn no");
		int n = sc.nextInt();
		Indphnno[] phnno = new Indphnno[n];
		System.out.println("enter " + n + "phn no");
		for (int i = 0; i < n; i++) {
			phnno[i] = new Indphnno(sc.next());
		}
		System.out.println("enter dob");
		Date date = new SimpleDateFormat("dd-MM-yyyy").parse(sc.next());
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println("p.format(dateOfBirth) ");

		person p1 = new person(Firstname, Lastname, email, password, phnno, date);
		try {
			validate(p1);
			String fullname = p1.getFirstname();
			System.out.println("full name" + fullname);
			System.out.println(p1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());

		}

	}
}