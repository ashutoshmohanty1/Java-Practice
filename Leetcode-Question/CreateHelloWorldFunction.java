/* https://leetcode.com/problems/create-hello-world-function/ */

/**
 * CreateHelloWorldFunction
 */
public class CreateHelloWorldFunction {

    var CreateHelloWorld = function() {
        return function(...args) {
            return "Hello World";
        }
    };
}

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */