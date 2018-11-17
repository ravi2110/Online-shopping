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
	case 'All Products':
		$('#products').addclass('active');
		break;
	default:
		$('#products').addclass('active');
		$('#a_'+menu).addclass('active')
		break;
	}
});