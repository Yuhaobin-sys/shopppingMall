package com.changgou.oauth;

import org.junit.Test;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.jwt.crypto.sign.RsaVerifier;

public class ParseJwtTest {

    @Test
    public void parseJwt(){
        //基于公钥去解析jwt
        String jwt="eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJhcHAiXSwibmFtZSI6bnVsbCwiaWQiOm51bGwsImV4cCI6MTYyNzgxMTg4MywiYXV0aG9yaXRpZXMiOlsiYWNjb3VudGFudCIsInVzZXIiLCJzYWxlc21hbiJdLCJqdGkiOiI5OTdlNmNjNC1iNDI3LTQ2OGYtOWU1OC1iZWM5YmI1YmMwNzQiLCJjbGllbnRfaWQiOiJjaGFuZ2dvdSIsInVzZXJuYW1lIjoiYWRtaW4ifQ.HtAkyLW7NPaSDHcAoNZEqUb5GhpiYPBuXIygfAJ2BBtbjMJJU966lN_b7NcVdBT9T4eAuxIA-Cm8EnboKFrbzc6Z82l7rcq_5BlEnM8wJ5hLRAstav8JhHgt831VPA-2WxYNtHPWW-oik_rK73Z1lKZIJjX71A49Pj-FYXReiusV2u8vemAXSwcaNxaE9ByVzNZ_P64Y_2RBVXX8FUyXnR1GQ0lwphpF4Duu2qGN9E3X8tn7tAowNuynoQmyKxY4zEkFPt1vnUJBKkA0f4Y6b_iIxjqtLHEg4vQ_033WoUx8ESesS_ow8A9JO_McnXjBSz20iUUPMFDiRrb1pqbn0g";
        String publicKey ="-----BEGIN PUBLIC KEY-----MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAii+mk3UgITDTzE1rqzVJEulnodpolepL+2dOLVsMW8WwMfZE1To/3FvQ3xG6KtjG4Q+BZuDaiep8OF/mB6nLEihE6bNBHEmPeO90pXBo3+er3M/duVa0908dE9ZiV2duSeBFPMY3DAa7f40gkU03Q7ywfg8WAtz6Sej9lLcsGd5wPwdUtxoUOhO/lmZXo8/1SnciXtbekeRCmh8ulOdHIy0IlEJrwOcnGUkw0/hTyTQmzNI21cwfTN04A/7fqyZ7phbKvLeabVGd9dy0xt1a9C8e74/HdsRCHfbu1l/uEHeC0mmTDYOPfBFUwKv5ZwftCQF6zfA0FbLlIFrPtiKKdwIDAQAB-----END PUBLIC KEY-----";

        Jwt token = JwtHelper.decodeAndVerify(jwt, new RsaVerifier(publicKey));

        String claims = token.getClaims();
        System.out.println(claims);
        //{"scope":["app"],"name":null,"id":null,"exp":1627811883,"authorities":["accountant","user","salesman"],"jti":"997e6cc4-b427-468f-9e58-bec9bb5bc074","client_id":"changgou","username":"admin"}

    }
}
