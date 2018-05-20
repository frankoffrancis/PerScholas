function clickImg(e) {
			var img = e.target;
			//console.log(img.src);
			var image = document.getElementById('image');
			image.src = img.src;

			var imgViewer = document.getElementById('imgViewer');
			imgViewer.style.display = 'block';
		};
		function initPage() {
			var imgs = document.getElementsByTagName("img");
			for(var i=0;i<imgs.length;++i) {
				var img = imgs[i];
				img.addEventListener('click', clickImg);
			}
		}
		function closeViewer() {
			var viewer = document.getElementById('imgViewer');
			viewer.style.display = 'none';
		}
