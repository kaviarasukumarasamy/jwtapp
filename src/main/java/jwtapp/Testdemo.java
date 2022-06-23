package jwtapp;

import io.jsonwebtoken.Claims;

public class Testdemo {

	public static void main(String[] args) {
		JwtUtil util=new JwtUtil();
		String token = util.generateToken("123", "abc", "kavin");
		//String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMjMiLCJzdWIiOiJhYmMiLCJpc3MiOiJrYXZpbiJ9.OT2xyEDaJ4qz9-Zr_ssJd5ZtMTRatTfGYbBQnf3pYJw";
		System.out.println(token);
		Claims c=util.getClaims("kavin", token);
		System.out.println(c.getId());
		System.out.println(c.getSubject());
		System.out.println(c.getIssuer());
		System.out.println(c.getIssuedAt());
		System.out.println(c.getExpiration());
			}

}
