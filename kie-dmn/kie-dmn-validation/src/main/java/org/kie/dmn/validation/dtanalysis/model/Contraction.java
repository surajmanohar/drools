/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.dmn.validation.dtanalysis.model;

import java.util.Collections;
import java.util.List;

public class Contraction {

    public final int rule;
    public final int pairedRule;
    public final int adjacentDimension;
    public final List<Interval> dimensionAsContracted;

    public Contraction(int rule, int pairedRule, int adjacentDimension, List<Interval> dimensionAsContracted) {
        super();
        this.rule = rule;
        this.pairedRule = pairedRule;
        this.adjacentDimension = adjacentDimension;
        this.dimensionAsContracted = Collections.unmodifiableList(dimensionAsContracted);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + adjacentDimension;
        result = prime * result + pairedRule;
        result = prime * result + rule;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contraction other = (Contraction) obj;
        if (adjacentDimension != other.adjacentDimension)
            return false;
        if (pairedRule != other.pairedRule)
            return false;
        if (rule != other.rule)
            return false;
        return true;
    }

}
