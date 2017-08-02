var navbar = new Vue({
   el:'#navbar',
   data:{
       isLogin:false
   }
});
var app = new Vue({
    el: '#app',
    data: {
        goodsList: [
            {
                title: 'AAA',
                price: 4.52,
                img: 'static/img/' + Math.ceil(Math.random() * 4) + '.jpg'
            }, {
                title: 'BBB',
                price: 4.52,
                img: 'static/img/' + Math.ceil(Math.random() * 4) + '.jpg'
            }, {
                title: 'CCC',
                price: 4.52,
                img: 'static/img/' + Math.ceil(Math.random() * 4) + '.jpg'
            }
        ]
    },
    mounted: function () {
        this.$nextTick(function () {
            this.getGoodsList();
        })
    },
    methods: {
        getGoodsList: function () {
            this.$http.get('/shop/goods/list.html').then(function (response) {
                console.log(response);
                this.goodsList = response.body;
                this.goodsList.forEach(function (goods) {
                    goods.img = 'static/img/' + Math.ceil(Math.random() * 4) + '.jpg';
                })
            }, function (response) {
                this.loadingText = '数据加载失败！';
            });
        }
    }
})