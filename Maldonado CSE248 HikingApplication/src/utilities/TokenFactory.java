package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import history_module.History;
import history_module.HistoryToken;
import trail_module.Level;
import trail_module.Type;
import user_module.UserType;

public class TokenFactory {
	private static ArrayList<String> trailNames = new ArrayList<String>();
	
	//UserTokens
	public static String spitUsername() {
		int length = 10;
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
		          +"lmnopqrstuvwxyz!@#$%&";
				Random rnd = new Random();
				StringBuilder sb = new StringBuilder(length);
				for (int i = 0; i < length; i++)
					sb.append(chars.charAt(rnd.nextInt(chars.length())));
				return sb.toString();
	}
	
	public static String spitPassword() {
		int length = 5;
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
		          +"lmnopqrstuvwxyz!@#$%&";
				Random rnd = new Random();
				StringBuilder sb = new StringBuilder(length);
				for (int i = 0; i < length; i++)
					sb.append(chars.charAt(rnd.nextInt(chars.length())));
				return sb.toString();
	}
	
	public static UserType spitUserType() {
		Random rnd = new Random();
		if(rnd.nextBoolean()) {
			return UserType.ADMIN;
		}else {
			return UserType.GEN;
		}
	}
	
	//TrailTokens
	
	public static History spitHistory() {
		History history = new History();
		Random rand = new Random();
		history.addAll(spitHistoryTokens(rand.nextInt(10)));
		return  history;
	}
	
	public static Collection<HistoryToken> spitHistoryTokens(int size) {
		LinkedList<HistoryToken> historyTokens = new LinkedList<HistoryToken>();
		Random rand = new Random();
		Iterator<String> ite = trailNames.iterator();

		for(int i = 0; i <size;i++) {
			if(ite.hasNext()) {
				historyTokens.add(new HistoryToken(ite.next(),rand.nextLong(),rand.nextDouble(),rand.nextDouble()));
			}else {
				ite = trailNames.iterator();
			}
		}
		return historyTokens;
	}
	
	
	public static String spitTrailName() {
		int length = 5;
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
		          +"lmnopqrstuvwxyz!@#$%&";
				Random rnd = new Random();
				StringBuilder sb = new StringBuilder(length);
				for (int i = 0; i < length; i++)
					sb.append(chars.charAt(rnd.nextInt(chars.length())));
				trailNames.add(sb.toString());
				return sb.toString();
	}
	
	public static String spitAddress() {
		int length = 5;
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
		          +"lmnopqrstuvwxyz!@#$%&";
				Random rnd = new Random();
				StringBuilder sb = new StringBuilder(length);
				for (int i = 0; i < length; i++)
					sb.append(chars.charAt(rnd.nextInt(chars.length())));
				return sb.toString();
	}
	
	public static double spitLength() {
		Random rand = new Random();
		return rand.nextDouble();
	}
	
	public static double spitGain() {
		Random rand = new Random();
		return rand.nextDouble();
	}
	
	public static Level spitLevel() {
		Random rnd = new Random();
		if(rnd.nextBoolean()) {
			return Level.EASY;
		}else {
			if(rnd.nextBoolean()) {
				return Level.HARD;
			}else {
				return Level.MODERATE;
			}
		}
	}
	
	public static Type spitType() {
		Random rnd = new Random();
		if(rnd.nextBoolean()) {
			return Type.LOOP;
		}else {
			if(rnd.nextBoolean()) {
				return Type.OUT_AND_BACK;
			}else {
				return Type.POINT_TO_POINT;
			}
		}
	}
	
	

}
