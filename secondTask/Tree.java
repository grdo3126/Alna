package secondTask;

public class Tree {

   Structure structure;

   public Tree(Structure structure){
       this.structure = structure;
   }

    protected void makeTheTree(){

        // CONNECTING PARENT NODES WITH CHILDREN

        structure.getRootNode().branchList.add(structure.getNode11());
        structure.getRootNode().branchList.add(structure.getNode12());
        structure.getRootNode().branchList.add(structure.getNode13());

        structure.getNode11().branchList.add(structure.getNode111());
        structure.getNode11().branchList.add(structure.getNode112());
        structure.getNode11().branchList.add(structure.getNode113());

        structure.getNode13().branchList.add(structure.getNode131());

        structure.getNode112().branchList.add(structure.getNode1121());

    }

    protected int countHeight(Branch tree){

        int height = 1;

        if(tree.branchList.size() == 0) {
            return 0;
        }

        else {
            for(Branch branch : tree.branchList) {
                height = Math.max(height, countHeight(branch));
            }
           return height + 1;
        }
    }

}
