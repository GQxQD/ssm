var goods = new Vue({
    el: '#shop',
    data: {
        list: null
    },
    mounted: function () {
        // var _this = this;
        this.$nextTick(function () {
            this.getGoodsList();
        })
    },
    methods: {
        getGoodsList: function () {
            this.$http.get('/shop/goods/list.html').then(function (response) {
                console.log(response);
                this.list = response.body;
            });
        },
        deleteGoods: function (goods) {
            if (confirm('确认要删除' + goods.title + '吗？')) {
                this.$http.post('/shop/goods/delete.html', {id: goods.id},{emulateJSON: true}).then(function (response) {
                    console.log(response);
                    if (response.body.flag == 0) {
                        alert('删除成功！');
                        this.getGoodsList();
                    } else {
                        alert('删除失败，' + response.body.msg);
                    }
                });
            }
        }
    }
});

new Vue({
    el: '#addGoodsModal',
    data: {
        title: '',
        category: '',
        price: '',
        stock: '',
        description: ''
    },
    methods: {
        addGoods: function () {
            console.log(this.title);
            this.$http.post('/shop/goods/add.html', {
                title: this.title,
                category: this.category,
                price: this.price,
                stock: this.stock,
                description: this.description
            }, {emulateJSON: true}).then(function (response) {
                console.log(response);
                alert(response.body.msg);
                goods.getGoodsList();
            });
        }
    }
});

// goodsList.list = [{
//     "category": 0,
//     "description": "金罐加多寶，还是原来的配方，还是熟悉的味道！",
//     "id": 1,
//     "img": "",
//     "price": 0,
//     "stock": 0,
//     "title": "加多寶"
// }, {
//     "category": 100,
//     "description": "还是原来的配方，还是熟悉的味道！",
//     "id": 3,
//     "img": "",
//     "price": 4.5,
//     "stock": 500,
//     "title": "王老吉"
// }];