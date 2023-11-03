package com.smilegate.migration.dto;

import lombok.Data;

@Data
public class UserDto {
	
	private String user_id ; 
	private String nickname ; 
	private String profile_url ; 
	private String is_active ; 
	private String is_online ; 
	private String created_at ; 
	private String last_seen_at ; 
	private String metadata ; 

	

}
