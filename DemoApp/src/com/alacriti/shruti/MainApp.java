package com.alacriti.shruti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainApp {

	public static void main(String[] args) {
		
		ArrayList<ClientVO> clientList = new ArrayList<>();
		
		ClientVO c1 = new ClientVO(1, 3, "Client1", 15);
		ClientVO c2 = new ClientVO(2, 1, "Client2", 25);
		ClientVO c3 = new ClientVO(3, 2, "Client3", 35);
		ClientVO c4 = new ClientVO(4, 1, "Client4", 45);
		ClientVO c5 = new ClientVO(5, 1, "Client5", 55);
		
		clientList.add(c1);
		clientList.add(c2);
		clientList.add(c3);
		clientList.add(c4);
		clientList.add(c5);
		
		Map<Integer,ArrayList<ClientVO>> clientMap = new HashMap<>();
		
		
		for (ClientVO clVO : clientList)
        {
            ArrayList<ClientVO> list = null;
            if (clientMap.containsKey(clVO.getParentId()))
            {
                list = clientMap.get(clVO.getParentId());
                list.add(clVO);
            }
            else
            {
                list = new ArrayList<ClientVO>();
                list.add(clVO);
                clientMap.put(clVO.getParentId(), list);
            }
        }
		
		System.out.println(clientMap);
		
	}

}
