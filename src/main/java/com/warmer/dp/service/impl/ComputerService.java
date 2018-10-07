package com.warmer.dp.service.impl;

public class ComputerService {
	private FacadeCPU cpu;  
    private FacadeMemory memory;  
    private FacadeDisk disk;  
      
    public ComputerService(){  
        cpu = new FacadeCPU();  
        memory = new FacadeMemory();  
        disk = new FacadeDisk();  
    }  
      
    public void startup(){  
        System.out.println("start the computer!");  
        cpu.startup();  
        memory.startup();  
        disk.startup();  
        System.out.println("start computer finished!");  
    }  
      
    public void shutdown(){  
        System.out.println("begin to close the computer!");  
        cpu.shutdown();  
        memory.shutdown();  
        disk.shutdown();  
        System.out.println("computer closed!");  
    }  
}
