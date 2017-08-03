new Vue({
    el: '#app',
    data: {
        count: 1,
        goods: {
            title: '',
            price: 0,
            stock: 0,
            description: ''
        }
    },
    mounted: function () {
        this.$nextTick(function () {
            this.loadGoods();
        })
    },
    methods: {
        loadGoods: function () {
            var params = hash2Object(window.location.hash);
            this.$http.get(base_path + '/goods/find.do?id=' + params.id, {emulateJSON: true}).then(
                function (response) {
                    var result = response.body;
                    if (result.status === 0) {
                        this.goods = result.data;
                    }
                }
            );
        },
        countDown: function () {
            this.count = this.count <= 1 ? 1 : Number(this.count) - 1;
        },
        countUp: function () {
            this.count = this.count >= this.goods.stock ? this.goods.stock : 1 + Number(this.count);
        }
    },
    computed:{
        formatPrice:function () {
            return this.goods.price.toFixed(2);
        }
    }
});