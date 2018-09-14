/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.geometry.core.internal;

/** This class consists exclusively of static vector utility methods.
 */
public final class Vectors {

    /** Private constructor. */
    private Vectors() {}

    /** Get the L<sub>1</sub> norm for the vector with the given components.
     * This is defined as the sum of the absolute values of all vector components.
     * @param x vector component
     * @return L<sub>1</sub> norm for the vector with the given components
     * @see <a href="http://mathworld.wolfram.com/L1-Norm.html">L1 Norm</a>
     */
    public static double norm1(final double x) {
        return Math.abs(x);
    }

    /** Get the L<sub>1</sub> norm for the vector with the given components.
     * This is defined as the sum of the absolute values of all vector components.
     * @param x1 first vector component
     * @param x2 second vector component
     * @return L<sub>1</sub> norm for the vector with the given components
     * @see <a href="http://mathworld.wolfram.com/L1-Norm.html">L1 Norm</a>
     */
    public static double norm1(final double x1, final double x2) {
        return Math.abs(x1) + Math.abs(x2);
    }

    /** Get the L<sub>1</sub> norm for the vector with the given components.
     * This is defined as the sum of the absolute values of all vector components.
     * @param x1 first vector component
     * @param x2 second vector component
     * @param x3 third vector component
     * @return L<sub>1</sub> norm for the vector with the given components
     * @see <a href="http://mathworld.wolfram.com/L1-Norm.html">L1 Norm</a>
     */
    public static double norm1(final double x1, final double x2, final double x3) {
        return Math.abs(x1) + Math.abs(x2) + Math.abs(x3);
    }

    /** Get the L<sub>2</sub> norm (commonly known as the Euclidean norm) for the vector
     * with the given components. This corresponds to the common notion of vector magnitude
     * or length and is defined as the square root of the sum of the squares of all vector components.
     * @param x vector component
     * @return L<sub>2</sub> norm for the vector with the given components
     * @see <a href="http://mathworld.wolfram.com/L2-Norm.html">L2 Norm</a>
     */
    public static double norm(final double x) {
        return Math.abs(x);
    }

    /** Get the L<sub>2</sub> norm (commonly known as the Euclidean norm) for the vector
     * with the given components. This corresponds to the common notion of vector magnitude
     * or length and is defined as the square root of the sum of the squares of all vector components.
     * @param x1 first vector component
     * @param x2 second vector component
     * @return L<sub>2</sub> norm for the vector with the given components
     * @see <a href="http://mathworld.wolfram.com/L2-Norm.html">L2 Norm</a>
     */
    public static double norm(final double x1, final double x2) {
        return Math.hypot(x1, x2);
    }

    /** Get the L<sub>2</sub> norm (commonly known as the Euclidean norm) for the vector
     * with the given components. This corresponds to the common notion of vector magnitude
     * or length and is defined as the square root of the sum of the squares of all vector components.
     * @param x1 first vector component
     * @param x2 second vector component
     * @param x3 third vector component
     * @return L<sub>2</sub> norm for the vector with the given components
     * @see <a href="http://mathworld.wolfram.com/L2-Norm.html">L2 Norm</a>
     */
    public static double norm(final double x1, final double x2, final double x3) {
        return Math.sqrt(normSq(x1, x2, x3));
    }

    /** Get the square of the L<sub>2</sub> norm (also known as the Euclidean norm)
     * for the vector with the given components. This is equal to the sum of the squares of
     * all vector components.
     * @param x vector component
     * @return square of the L<sub>2</sub> norm for the vector with the given components
     * @see #norm(double)
     */
    public static double normSq(final double x) {
        return x * x;
    }

    /** Get the square of the L<sub>2</sub> norm (also known as the Euclidean norm)
     * for the vector with the given components. This is equal to the sum of the squares of
     * all vector components.
     * @param x1 first vector component
     * @param x2 second vector component
     * @return square of the L<sub>2</sub> norm for the vector with the given components
     * @see #norm(double, double)
     */
    public static double normSq(final double x1, final double x2) {
        return (x1 * x1) + (x2 * x2);
    }

    /** Get the square of the L<sub>2</sub> norm (also known as the Euclidean norm)
     * for the vector with the given components. This is equal to the sum of the squares of
     * all vector components.
     * @param x1 first vector component
     * @param x2 second vector component
     * @param x3 third vector component
     * @return square of the L<sub>2</sub> norm for the vector with the given components
     * @see #norm(double, double, double)
     */
    public static double normSq(final double x1, final double x2, final double x3) {
        return (x1 * x1) + (x2 * x2) + (x3 * x3);
    }

    /** Get the L<sub>&infin;</sub> norm for the vector with the given components. This is defined
     * as the maximum of the absolute values of all vector components.
     * @param x vector component
     * @return L<sub>&infin;</sub> norm for the vector with the given components
     * @see <a href="http://mathworld.wolfram.com/L-Infinity-Norm.html">L<sub>&infin;</sub> Norm</a>
     */
    public static double normInf(final double x) {
        return Math.abs(x);
    }

    /** Get the L<sub>&infin;</sub> norm for the vector with the given components. This is defined
     * as the maximum of the absolute values of all vector components.
     * @param x1 first vector component
     * @param x2 second vector component
     * @return L<sub>&infin;</sub> norm for the vector with the given components
     * @see <a href="http://mathworld.wolfram.com/L-Infinity-Norm.html">L<sub>&infin;</sub> Norm</a>
     */
    public static double normInf(final double x1, final double x2) {
        return Math.max(Math.abs(x1), Math.abs(x2));
    }

    /** Get the L<sub>&infin;</sub> norm for the vector with the given components. This is defined
     * as the maximum of the absolute values of all vector components.
     * @param x1 first vector component
     * @param x2 second vector component
     * @param x3 third vector component
     * @return L<sub>&infin;</sub> norm for the vector with the given components
     * @see <a href="http://mathworld.wolfram.com/L-Infinity-Norm.html">L<sub>&infin;</sub> Norm</a>
     */
    public static double normInf(final double x1, final double x2, final double x3) {
        return Math.max(Math.max(Math.abs(x1), Math.abs(x2)), Math.abs(x3));
    }
}