package com.bplow.netconn.base.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.springframework.stereotype.Service;

@Service
public class Sha1_MD {
	
	public String digest(byte[] contents) throws NoSuchAlgorithmException{
		
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");

        messageDigest.update(contents);

        return new String(Hex.encodeHex(messageDigest.digest())).toUpperCase();
	}
	

}
