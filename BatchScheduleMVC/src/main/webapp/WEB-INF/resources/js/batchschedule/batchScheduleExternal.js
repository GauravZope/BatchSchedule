var j = jQuery.noConflict();
//( document ).ready(function() {
function onload(){
j("#costCenterTypeHeaderId").select2({
		placeholder: "Select Location",
		width: '170px',

		data:{ results: '', text: 'name' },
		formatResult: function(result) {
			if ( ! isJsonString(result.id))
				result.id = JSON.stringify(result.id);
			return result.name;
		}
	});
	j("#"+supplocationTypeAheadId).select2("val", gridSupportLoc);
	j("#"+supplocationTypeAheadId).change(function() {
		gTypeAheadSuppLocation(supplocationTypeAheadId,rowNo);
	});
}
//});

function gTypeAheadSuppLocation(comId,cid){
	supLocId = j("#"+comId).select2('data').id;
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