package org.kukkit.command;

import org.kukkit.ext.FindingException;

import java.util.HashMap;
import java.util.Map;

/**
 * A object that parses parameters.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public class Parameter {
    /**
     * The parameter map from {@link Integer} to parameter.
     */
    private final Map<Integer, String> parameterMap = new HashMap<>();

    /**
     * Constructs a new {@link Parameter} parser from arguments given.
     * @param args the args
     */
    public Parameter(String[] args) {
        int currentIndex = 0;
        while (currentIndex != (args.length - 1)) {
            parameterMap.put(currentIndex + 1, args[currentIndex]);
            currentIndex++;
        }
    }

    /**
     * Retrieves a parameter from the parameter map from the specified index.
     * @param index this index starts from 1. the index from the parameter map to get
     * @return the parameter
     */
    public String get(int index) throws FindingException {
        if (parameterMap.containsKey(index)) {
            return parameterMap.get(index);
        }
        throw new FindingException();
    }

    /**
     * Retrieves the length of the parameters given.
     * @return the length
     */
    public int length() {
        return parameterMap.size();
    }

    /**
     * Combines parameters from the beginning specified index to ending specified index.
     * @param start the start index. starts from 1.
     * @param end the end index. starts from 1.
     * @return the combined parameters
     * @throws FindingException if the parameters cannot be found
     */
    public String combine(int start, int end) throws FindingException {
        int currentIndex = start;
        StringBuilder builder = new StringBuilder();
        while (currentIndex != end) {
            builder.append(get(currentIndex) + " ");
            currentIndex++;
        }
        return builder.toString();
    }
}
