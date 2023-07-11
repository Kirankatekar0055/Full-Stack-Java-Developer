window.onload = () => {
    function buildClock() {
        const date = new Date();

        let hours = date.getHours(); 
        let minutes = date.getMinutes(); 
        let seconds = date.getSeconds(); 
		//let Session = date.getSession();

        hours = hours < 10 ? "0" + hours : hours;
        minutes = minutes < 10 ? "0" + minutes : minutes;
        seconds = seconds < 10 ? "0" + seconds : seconds;
		
		/*if(hours >=12)
		{
			Session.innerText = 'PM';
		}
		else
		{
            Session.innerText = 'AM';
        }
        if(hours > 12)
        {
           hours= hours-12;
        }*/		   

        document.querySelector('#clock-hours').innerText = hours;
        document.querySelector('#clock-minutes').innerText = minutes;
        document.querySelector('#clock-seconds').innerText = seconds;

        setTimeout(buildClock, 1000);
    }
    buildClock();
}