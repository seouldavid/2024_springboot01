package com.ict.edu2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class SampleController {
    @GetMapping("/hello")
    public String getHello(){
        return "Hello, world";
    }
    @GetMapping("/hello2")
    public String[] getMethodName(){
        return new String[] {"Hello", "world"};
    }
    @GetMapping("/hello3")
    public SampleVO getHello3(){
        SampleVO svo = new SampleVO();
        svo.setName("고길동");
        svo.setAge("24");
        return svo;
    }
    @GetMapping("/hello4")
    public List<SampleVO> getHello4(){
        List<SampleVO> list = new ArrayList<>();
        SampleVO svo = new SampleVO();
        svo.setName("고길동");
        svo.setAge("24");
        list.add(svo);
        SampleVO svo2 = new SampleVO();
        svo2.setName("희동이");
        svo2.setAge("3");
        list.add(svo2);
        SampleVO svo3 = new SampleVO();
        svo3.setName("도우너");
        svo3.setAge("17");
        list.add(svo3);

        return list;
    }
    // 반환형이 객체일때
    @GetMapping("/hello5")
    public DataVO getHello5(String number) {
        List<SampleVO> list = new ArrayList<>();
        SampleVO svo = new SampleVO("고길동","24");
        list.add(svo);
        SampleVO svo2 = new SampleVO("희동이","3");
        list.add(svo2);
        SampleVO svo3 = new SampleVO("도우너","17");
        list.add(svo3);

        if(number.equals("1")){
            // dataVO.setResultCode(1);
            // dataVO.setMessage("성공");
            // dataVO.setData(list);
            return DataVO.success(list, "성공");
        } else{
            // dataVO.setResultCode(0);
            // dataVO.setMessage("실패");
            // dataVO.setData(null);
            return DataVO.success(0, "실패");
        }
        
    }

}