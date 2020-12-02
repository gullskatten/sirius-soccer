/**
 */
package soccer.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import soccer.League;
import soccer.MatchDay;
import soccer.Season;
import soccer.SoccerPackage;
import soccer.Standing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soccer.impl.SeasonImpl#getSeasonName <em>Season Name</em>}</li>
 *   <li>{@link soccer.impl.SeasonImpl#getLeague <em>League</em>}</li>
 *   <li>{@link soccer.impl.SeasonImpl#getMatchDay <em>Match Day</em>}</li>
 *   <li>{@link soccer.impl.SeasonImpl#getStanding <em>Standing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeasonImpl extends MinimalEObjectImpl.Container implements Season {
	/**
	 * The default value of the '{@link #getSeasonName() <em>Season Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasonName()
	 * @generated
	 * @ordered
	 */
	protected static final String SEASON_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSeasonName() <em>Season Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasonName()
	 * @generated
	 * @ordered
	 */
	protected String seasonName = SEASON_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatchDay() <em>Match Day</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchDay()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchDay> matchDay;

	/**
	 * The cached value of the '{@link #getStanding() <em>Standing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStanding()
	 * @generated
	 * @ordered
	 */
	protected Standing standing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoccerPackage.Literals.SEASON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeasonName() {
		return seasonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeasonName(String newSeasonName) {
		String oldSeasonName = seasonName;
		seasonName = newSeasonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.SEASON__SEASON_NAME, oldSeasonName, seasonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public League getLeague() {
		if (eContainerFeatureID() != SoccerPackage.SEASON__LEAGUE) return null;
		return (League)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeague(League newLeague, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLeague, SoccerPackage.SEASON__LEAGUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeague(League newLeague) {
		if (newLeague != eInternalContainer() || (eContainerFeatureID() != SoccerPackage.SEASON__LEAGUE && newLeague != null)) {
			if (EcoreUtil.isAncestor(this, newLeague))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLeague != null)
				msgs = ((InternalEObject)newLeague).eInverseAdd(this, SoccerPackage.LEAGUE__SEASON, League.class, msgs);
			msgs = basicSetLeague(newLeague, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.SEASON__LEAGUE, newLeague, newLeague));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchDay> getMatchDay() {
		if (matchDay == null) {
			matchDay = new EObjectContainmentWithInverseEList<MatchDay>(MatchDay.class, this, SoccerPackage.SEASON__MATCH_DAY, SoccerPackage.MATCH_DAY__SEASON);
		}
		return matchDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Standing getStanding() {
		return standing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStanding(Standing newStanding, NotificationChain msgs) {
		Standing oldStanding = standing;
		standing = newStanding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoccerPackage.SEASON__STANDING, oldStanding, newStanding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStanding(Standing newStanding) {
		if (newStanding != standing) {
			NotificationChain msgs = null;
			if (standing != null)
				msgs = ((InternalEObject)standing).eInverseRemove(this, SoccerPackage.STANDING__SEASON, Standing.class, msgs);
			if (newStanding != null)
				msgs = ((InternalEObject)newStanding).eInverseAdd(this, SoccerPackage.STANDING__SEASON, Standing.class, msgs);
			msgs = basicSetStanding(newStanding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.SEASON__STANDING, newStanding, newStanding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoccerPackage.SEASON__LEAGUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLeague((League)otherEnd, msgs);
			case SoccerPackage.SEASON__MATCH_DAY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatchDay()).basicAdd(otherEnd, msgs);
			case SoccerPackage.SEASON__STANDING:
				if (standing != null)
					msgs = ((InternalEObject)standing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoccerPackage.SEASON__STANDING, null, msgs);
				return basicSetStanding((Standing)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoccerPackage.SEASON__LEAGUE:
				return basicSetLeague(null, msgs);
			case SoccerPackage.SEASON__MATCH_DAY:
				return ((InternalEList<?>)getMatchDay()).basicRemove(otherEnd, msgs);
			case SoccerPackage.SEASON__STANDING:
				return basicSetStanding(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SoccerPackage.SEASON__LEAGUE:
				return eInternalContainer().eInverseRemove(this, SoccerPackage.LEAGUE__SEASON, League.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoccerPackage.SEASON__SEASON_NAME:
				return getSeasonName();
			case SoccerPackage.SEASON__LEAGUE:
				return getLeague();
			case SoccerPackage.SEASON__MATCH_DAY:
				return getMatchDay();
			case SoccerPackage.SEASON__STANDING:
				return getStanding();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoccerPackage.SEASON__SEASON_NAME:
				setSeasonName((String)newValue);
				return;
			case SoccerPackage.SEASON__LEAGUE:
				setLeague((League)newValue);
				return;
			case SoccerPackage.SEASON__MATCH_DAY:
				getMatchDay().clear();
				getMatchDay().addAll((Collection<? extends MatchDay>)newValue);
				return;
			case SoccerPackage.SEASON__STANDING:
				setStanding((Standing)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SoccerPackage.SEASON__SEASON_NAME:
				setSeasonName(SEASON_NAME_EDEFAULT);
				return;
			case SoccerPackage.SEASON__LEAGUE:
				setLeague((League)null);
				return;
			case SoccerPackage.SEASON__MATCH_DAY:
				getMatchDay().clear();
				return;
			case SoccerPackage.SEASON__STANDING:
				setStanding((Standing)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SoccerPackage.SEASON__SEASON_NAME:
				return SEASON_NAME_EDEFAULT == null ? seasonName != null : !SEASON_NAME_EDEFAULT.equals(seasonName);
			case SoccerPackage.SEASON__LEAGUE:
				return getLeague() != null;
			case SoccerPackage.SEASON__MATCH_DAY:
				return matchDay != null && !matchDay.isEmpty();
			case SoccerPackage.SEASON__STANDING:
				return standing != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (seasonName: ");
		result.append(seasonName);
		result.append(')');
		return result.toString();
	}

} //SeasonImpl
