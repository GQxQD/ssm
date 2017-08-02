var navbar = new Vue({
    el: '#navbar',
    data: {
        isLogin: false
    }
});
var app = new Vue({
    el: '#app',
    data: {
        loadingText: '加载中...',
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
            this.loadingText = '加载中...';
            this.$http.get(base_path + '/goods/list.do').then(function (response) {
                console.log(response);
                var result = response.body;
                if (result.status == 0) {
                    this.goodsList = result.data;
                    this.goodsList.forEach(function (goods) {
                        goods.img = 'static/img/' + Math.ceil(Math.random() * 4) + '.jpg';
                    });
                    this.loadingText = '';
                } else {
                    loadingText = result.msg;
                }
            }, function (response) {
                // alert('数据加载失败！' + response.status);
                this.goodsList = null;
                this.loadingText = '数据加载失败！code:' + response.status;
            });
        }
    },
    computed: {
        loadingSuccess: function () {
            return this.loadingText == '';
        }
    }
})