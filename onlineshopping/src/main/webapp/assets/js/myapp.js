$(function(){
	//solving active menu problem
	switch(menu){
	case 'About Us':
		$('#about').addclass('active');
		break;
	case 'Contact Us':
		$('#contact').addclass('active');
		break;
	case 'Home':
		$('#home').addclass('active');
		break;
	default:
		$('#home').addclass('active');
		break;
	}
});