package com.ict.edu2.domain.guestbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestBookVO {
  private String gb_idx,gb_name,gb_content,gb_email,gb_pwd,gb_regdate ;
}
