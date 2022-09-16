package com.sonata.MyServiceImpl;

import java.util.ArrayList;
import java.util.List;

import com.sonata.MyService.MyServiceIntf;

public class MyServiceImpla {
private MyServiceIntf myService;


MyServiceImpla(){}
MyServiceImpla(MyServiceIntf mySer)
{
this.myService = mySer;	
}

public List<String> retriveRelated(String user)
{
List<String>	filteredValue = new ArrayList<String>();
List<String>	allToDo = myService.retrieveUsers(user);
for (String all : allToDo){
    if(all.contains("Spring")) {
        filteredValue.add(all);
    }
}
return filteredValue;
}
}


