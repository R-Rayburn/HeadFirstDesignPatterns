package RemoteProxy;

import java.rmi.Naming;

public class GumballMachineTestDrive {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("RemoteProxy.GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            int count = Integer.parseInt(args[1]);
            GumballMachine gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind( args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
