package com.estafet.insurance.claim;

public class ClaimAdjust {
	
	
	public Claim rate(Claim claim) {
		
		if ("Travel".equals(claim.infotype)) {
			return claim;
		} else 	if ("House".equals(claim.infotype)) {		
			int newval = (int) (claim.getClaimAmount() - (claim.getClaimAmount()*0.1));
			claim.setClaimAmount(newval);
			return claim;
		} else {
			throw new IllegalArgumentException("Claim type not recognised");
		}
		
		
	}

}
