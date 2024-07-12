package SeleniumConcepts;

public class XpathAxes {

    public static void main(String[] args) {
        /**parent to child:
         *
         */
        //Direct child: /
        //direct child + indirect child : //

        // example : //div[@id='content']//form//input

        // Example : ////div[@id='content']/div--1
        //Example : //div[@id='content']//div--7

        ////div[@class='form-group'][1]/input

        /**
         * Child to parent
         */
        //option[@value='Albania']//parent::select

        /**
         * Ancestor
         * going to child to parent to grandparent
         */
        //option[@value='Albania']//ancestor::div
        // it will give direct parent and all indirect grand parent as well

        /**
         * Parent -sibling
         * Sibling : Following and preceding
         */
        //example: //a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']


    }
}
