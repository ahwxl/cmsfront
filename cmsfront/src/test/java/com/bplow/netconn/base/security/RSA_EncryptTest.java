package com.bplow.netconn.base.security;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.io.IOUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;


@ContextConfiguration(locations = { "/applicationContext.xml" ,"/applicationContext-myclient.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class RSA_EncryptTest {
	
	@Autowired
	RSA_Encrypt rsa_Encrypt;
	
	@Autowired
	Sha1_MD Sha1_MD;
	
	@Ignore
	@Test
	public void geraterKeyPair() throws Exception{
		
		rsa_Encrypt.generateKeyPair();
	}
	
	@Test
	public void digest() throws IOException, Exception{
		InputStream in = this.getClass().getResourceAsStream("/file/CCF_20150703_1009337.zip");
		ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
		IOUtils.copy(in, byteStream);
		String str = Sha1_MD.digest(byteStream.toByteArray());
		System.out.println(str);
	}

}
