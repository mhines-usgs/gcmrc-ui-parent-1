package gov.usgs.cida.gcmrcservices.mb.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author kmschoep
 */
public class StationParam {
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(StationParam.class);

	protected final String groupId;
	protected final String groupName;
	protected final String beginPosition;
	protected final String endPosition;
	protected final String site;
	protected final String siteDisplayName;
	protected final String displayOrder;
	protected final String displayName;
	protected final String isVisible;
	protected final String isDownloadable;
	protected final String units;
	protected final String unitsShort;
	protected final String decimalPlaces;
	protected final String ppq;

	public StationParam() {
		this.groupId = null;
		this.groupName = null;
		this.beginPosition = null;
		this.endPosition = null;
		this.site = null;
		this.siteDisplayName = null;
		this.displayOrder = null;
		this.displayName = null;
		this.isVisible = null;
		this.isDownloadable = null;
		this.units = null;
		this.unitsShort = null;
		this.decimalPlaces = null;
		this.ppq = null;
	}

	public StationParam(String groupId
			, String groupName
			, String beginPosition
			, String endPosition
			, String site
			, String siteDisplayName
			, String displayOrder
			, String displayName
			, String isVisible
			, String isDownloadable
			, String units
			, String unitsShort
			, String decimalPlaces
			, String ppq
			) {
		this.groupId = groupId;
		this.groupName = groupName;
		this.beginPosition = beginPosition;
		this.endPosition = endPosition;
		this.site = site;
		this.siteDisplayName = siteDisplayName;
		this.displayOrder = displayOrder;
		this.displayName = displayName;
		this.isVisible = isVisible;
		this.isDownloadable = isDownloadable;
		this.units = units;
		this.unitsShort = unitsShort;
		this.decimalPlaces = decimalPlaces;
		this.ppq = ppq;
	}
	
	public String getPpq() {
		return ppq;
	}

	public String getGroupId() {
		return groupId;
	}

	public String getBeginPosition() {
		return beginPosition;
	}

	public String getEndPosition() {
		return endPosition;
	}

	public String getSite() {
		return site;
	}

	public String getSiteDisplayName() {
		return siteDisplayName;
	}

	public String getIsDownloadable() {
		return isDownloadable;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getUnits() {
		return units;
	}

	public String getUnitsShort() {
		return unitsShort;
	}

	public String getDecimalPlaces() {
		return decimalPlaces;
	}

	public String getIsVisible() {
		return isVisible;
	}

	public String getDisplayOrder() {
		return displayOrder;
	}

	
}