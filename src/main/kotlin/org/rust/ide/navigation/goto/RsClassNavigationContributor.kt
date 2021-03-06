package org.rust.ide.navigation.goto

import org.rust.lang.core.psi.ext.RsNamedElement
import org.rust.lang.core.stubs.index.RsGotoClassIndex

class RsClassNavigationContributor
    : RsNavigationContributorBase<RsNamedElement>(RsGotoClassIndex.KEY, RsNamedElement::class.java)

