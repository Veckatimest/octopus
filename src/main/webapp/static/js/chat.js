function MessagePool(settings){
	if (!settings){
		console.error("You must provide settings")
		return;
	}
	if (!settings.container) {
		console.error("You must provide container")
		return;
	}
	this.container = document.getElementById(settings.container);
	//this.message_class = settings.message_class;
	this.text_class = settings.text_class;
	this.messages = []

	this.pushMessage = function(message){
		this.messages.push(message);
		var htm_message = document.createElement("div");
		var head = document.createElement("h3");
		var head_text = document.createTextNode(message.sender);
		head.appendChild(head_text);
		var content = document.createElement("p");
		var content_text = document.createTextNode(message.text);
		content.appendChild(content_text);
		htm_message.appendChild(head);
		htm_message.appendChild(content);
		htm_message.className = "message_container";
		//content.className = "message_caption";
		//head.className = "message_text"
		this.container.appendChild(htm_message)
	}

}