/**
 * Created by fionera on 16-10-9.
 */
actionApp.directive('datePicker',function () {
    return{
        restrict:'AC',
        link:function (scope, elem, attrs) {
            elem.datepicker();
        }
    }
});