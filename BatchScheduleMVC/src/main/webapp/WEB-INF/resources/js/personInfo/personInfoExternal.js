var j = jQuery.noConflict();

function onload(){
	loadStateSelect2();
	j("#cityTownFieldId").select2({
		placeholder: "Select City",
		width: '170px',
		data:{ results: '', text: 'name' },
		formatResult: function(result) {
			if ( ! isJsonString(result.id))
				result.id = JSON.stringify(result.id);
			return result.name;
		}
	});
//	j("#cityTownFieldId").select2("val", gridSupportLoc);
	j("#cityTownFieldId").change(function() {
		gTypeAheadCity();
	});
	
}

function loadStateSelect2() {
	j("#stateFieldId").select2({
		placeholder: "Select State",
		width: '170px',
		data:{ results: '', text: 'name' },
		formatResult: function(result) {
			if ( ! isJsonString(result.id))
				result.id = JSON.stringify(result.id);
			return result.name;
		}
	});
//	j("#stateFieldId").select2("val", gridSupportLoc);
	j("#stateFieldId").change(function() {
		gTypeAheadState();
	});
}

function gTypeAheadCity(comId,cid){
	supLocId = j("#cityTownFieldId").select2('data').id;
	toLocId=getComponent("toLocId",cid);
	toLocId.value = supLocId;

}

function gTypeAheadState(comId,cid){
	supLocId = j("#stateFieldId").select2('data').id;
	toLocId=getComponent("toLocId",cid);
	toLocId.value = supLocId;

}

function isJsonString(str) {
	try {
		JSON.parse(str);
	} catch (e) {
		return false;
	}
	return true;
}