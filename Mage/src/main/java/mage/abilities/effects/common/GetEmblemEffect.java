/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
 */
package mage.abilities.effects.common;

import java.util.List;
import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.command.Emblem;

/**
 *
 * @author nantuko
 */
public class GetEmblemEffect extends OneShotEffect {

    private final Emblem emblem;

    public GetEmblemEffect(Emblem emblem) {
        super(Outcome.Benefit);
        this.emblem = emblem;
        this.staticText = "You get an emblem with \"" + +'"';
    }

    public GetEmblemEffect(final GetEmblemEffect effect) {
        super(effect);
        this.emblem = effect.emblem;
    }

    @Override
    public GetEmblemEffect copy() {
        return new GetEmblemEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        MageObject sourceObject = game.getObject(source.getSourceId());
        if (sourceObject == null) {
            return false;
        }
        game.addEmblem(emblem, sourceObject, source);
        return true;
    }

    public String getText() {
        StringBuilder sb = new StringBuilder();
        sb.append("You get an emblem with \"");
        List<String> rules = emblem.getAbilities().getRules(null);
        if (rules.size() == 1) {
            sb.append(rules.get(0));
            sb.append('"');
        } else if (rules.size() == 2) {
            for (String s : rules) {
                sb.append(s);
                sb.append("\" and \"");
            }
            sb.append('"');
        }
        sb.append('.');
        return sb.toString();
    }
}
