package fun.chaoxi.wing.module.model.bean;

import java.util.List;

/**
 * @author Wing Gao
 * @date 2018/12/18 15:02
 * @description
 */
public class BookDetailBean {
    /**
     * rating : {"max":10,"numRaters":1534,"average":"8.7","min":0}
     * subtitle :
     * author : ["周志华"]
     * pubdate : 2016-1-1
     * tags : [{"count":2495,"name":"机器学习","title":"机器学习"},{"count":1146,"name":"人工智能","title":"人工智能"},{"count":617,"name":"数据挖掘","title":"数据挖掘"},{"count":550,"name":"计算机","title":"计算机"},{"count":489,"name":"数据分析","title":"数据分析"},{"count":482,"name":"MachineLearning","title":"MachineLearning"},{"count":404,"name":"计算机科学","title":"计算机科学"},{"count":351,"name":"AI","title":"AI"}]
     * origin_title :
     * image : https://img1.doubanio.com/view/subject/m/public/s28735609.jpg
     * binding : 平装
     * translator : []
     * catalog : 目录
     第1章 1
     1.1 引言 1
     1.2 基本术 2
     1.3 假设空间 4
     1.4 归纳偏好 6
     1.5 发展历程 10
     1.6 应用现状 13
     1.7 阅读材料 16
     习题 19
     参考文献 20
     休息一会儿 22
     第2章 模型评估与选择 23
     2.1 经验误差与过拟合 23
     2.2 评估方法 24
     2.2.1 留出法 25
     2.2.2 交叉验证法 26
     2.2.3 自助法 27
     2.2.4 调参与最终模型 28
     2.3 性能度量 28
     2.3.1 错误率与精度 29
     2.3.2 查准率、查全率与F1 30
     2.3.3 ROC与AUC 33
     2.3.4 代价敏感错误率与代价曲线 35
     2.4 比较检验 37
     2.4.1 假设检验 37
     2.4.2 交叉验证t检验 40
     2.4.3 McNemar检验 41
     2.4.4 Friedman检验与后续检验 42
     2.5 偏差与方差 44
     2.6 阅读材料 46
     习题 48
     参考文献 49
     休息一会儿 51
     第3章 线性模型 53
     3.1 基本形式 53
     3.2 线性回归 53
     3.3 对数几率回归 57
     3.4 线性判别分析 60
     3.5 多分类学习 63
     3.6 类别不平衡问题 66
     3.7 阅读材料 67
     习题 69
     参考文献 70
     休息一会儿 72
     第4章 决策树 73
     4.1 基本流程 73
     4.2 划分选择 75
     4.2.1 信息增益 75
     4.2.2 增益率 77
     4.2.3 基尼指数 79
     4.3 剪枝处理 79
     4.3.1 预剪枝 80
     4.3.2 后剪枝 82
     4.4 连续与缺失值 83
     4.4.1 连续值处理 83
     4.4.2 缺失值处理 85
     4.5 多变量决策树 88
     4.6 阅读材料 92
     习题 93
     参考文献 94
     休息一会儿 95
     第5章 神经网络 97
     5.1 神经元模型 97
     5.2 感知机与多层网络 98
     5.3 误差逆传播算法 101
     5.4 全局最小与局部极小 106
     5.5 其他常见神经网络 108
     5.5.1 RBF网络 108
     5.5.2 ART网络 108
     5.5.3 SOM网络 109
     5.5.4 级联相关网络 110
     5.5.5 Elman网络 111
     5.5.6 Boltzmann机 111
     5.6 深度学习 113
     5.7 阅读材料 115
     习题 116
     参考文献 117
     休息一会儿 120
     第6章 支持向量机 121
     6.1 间隔与支持向量 121
     6.2 对偶问题 123
     6.3 核函数 126
     6.4 软间隔与正则化 129
     6.5 支持向量回归 133
     6.6 核方法 137
     6.7 阅读材料 139
     习题 141
     参考文献 142
     休息一会儿 145
     第7章 贝叶斯分类器 147
     7.1 贝叶斯决策论 147
     7.2 极大似然估计 149
     7.3 朴素贝叶斯分类器 150
     7.4 半朴素贝叶斯分类器 154
     7.5 贝叶斯网 156
     7.5.1 结构 157
     7.5.2 学习 159
     7.5.3 推断 161
     7.6 EM算法 162
     7.7 阅读材料 164
     习题 166
     参考文献 167
     休息一会儿 169
     第8章 集成学习 171
     8.1 个体与集成 171
     8.2 Boosting 173
     8.3 Bagging与随机森林 178
     8.3.1 Bagging 178
     8.3.2 随机森林 179
     8.4 结合策略 181
     8.4.1 平均法 181
     8.4.2 投票法 182
     8.4.3 学习法 183
     8.5 多样性 185
     8.5.1 误差--分歧分解 185
     8.5.2 多样性度量 186
     8.5.3 多样性增强 188
     8.6 阅读材料 190
     习题 192
     参考文献 193
     休息一会儿 196
     第9章 聚类 197
     9.1 聚类任务 197
     9.2 性能度量 197
     9.3 距离计算 199
     9.4 原型聚类 202
     9.4.1 k均值算法 202
     9.4.2 学习向量量化 204
     9.4.3 高斯混合聚类 206
     9.5 密度聚类 211
     9.6 层次聚类 214
     9.7 阅读材料 217
     习题 220
     参考文献 221
     休息一会儿 224
     第10章 降维与度量学习 225
     10.1 k近邻学习 225
     10.2 低维嵌入 226
     10.3 主成分分析 229
     10.4 核化线性降维 232
     10.5 流形学习 234
     10.5.1 等度量映射 234
     10.5.2 局部线性嵌入 235
     10.6 度量学习 237
     10.7 阅读材料 240
     习题 242
     参考文献 243
     休息一会儿 246
     第11章 特征选择与稀疏学习 247
     11.1 子集搜索与评价 247
     11.2 过滤式选择 249
     11.3 包裹式选择 250
     11.4 嵌入式选择与L$_1$正则化 252
     11.5 稀疏表示与字典学习 254
     11.6 压缩感知 257
     11.7 阅读材料 260
     习题 262
     参考文献 263
     休息一会儿 266
     第12章 计算学习理论 267
     12.1 基础知识 267
     12.2 PAC学习 268
     12.3 有限假设空间 270
     12.3.1 可分情形 270
     12.3.2 不可分情形 272
     12.4 VC维 273
     12.5 Rademacher复杂度 279
     12.6 稳定性 284
     12.7 阅读材料 287
     习题 289
     参考文献 290
     休息一会儿 292
     第13章 半监督学习 293
     13.1 未标记样本 293
     13.2 生成式方法 295
     13.3 半监督SVM 298
     13.4 图半监督学习 300
     13.5 基于分歧的方法 304
     13.6 半监督聚类 307
     13.7 阅读材料 311
     习题 313
     参考文献 314
     休息一会儿 317
     第14章 概率图模型 319
     14.1 隐马尔可夫模型 319
     14.2 马尔可夫随机场 322
     14.3 条件随机场 325
     14.4 学习与推断 328
     14.4.1 变量消去 328
     14.4.2 信念传播 330
     14.5 近似推断 331
     14.5.1 MCMC采样 331
     14.5.2 变分推断 334
     14.6 话题模型 337
     14.7 阅读材料 339
     习题 341
     参考文献 342
     休息一会儿 345
     第15章 规则学习 347
     15.1 基本概念 347
     15.2 序贯覆盖 349
     15.3 剪枝优化 352
     15.4 一阶规则学习 354
     15.5 归纳逻辑程序设计 357
     15.5.1 最小一般泛化 358
     15.5.2 逆归结 359
     15.6 阅读材料 363
     习题 365
     参考文献 366
     休息一会儿 369
     第16章 强化学习 371
     16.1 任务与奖赏 371
     16.2 $K$-摇臂赌博机 373
     16.2.1 探索与利用 373
     16.2.2 $\epsilon $-贪心 374
     16.2.3 Softmax 375
     16.3 有模型学习 377
     16.3.1 策略评估 377
     16.3.2 策略改进 379
     16.3.3 策略迭代与值迭代 381
     16.4 免模型学习 382
     16.4.1 蒙特卡罗强化学习 383
     16.4.2 时序差分学习 386
     16.5 值函数近似 388
     16.6 模仿学习 390
     16.6.1 直接模仿学习 391
     16.6.2 逆强化学习 391
     16.7 阅读材料 393
     习题 394
     参考文献 395
     休息一会儿 397
     附录 399
     A 矩阵 399
     B 优化 403
     C 概率分布 409
     后记 417
     索引 419
     * pages : 425
     * images : {"small":"https://img1.doubanio.com/view/subject/s/public/s28735609.jpg","large":"https://img1.doubanio.com/view/subject/l/public/s28735609.jpg","medium":"https://img1.doubanio.com/view/subject/m/public/s28735609.jpg"}
     * alt : https://book.douban.com/subject/26708119/
     * id : 26708119
     * publisher : 清华大学出版社
     * isbn10 : 7302423288
     * isbn13 : 9787302423287
     * title : 机器学习
     * url : https://api.douban.com/v2/book/26708119
     * alt_title :
     * author_intro : 周志华，南京大学教授，计算机科学与技术系副主任，软件新技术国家重点实验室常务副主任，机器学习与数据挖掘研究所（LAMDA）所长，校、系学术委员会委员；ACM杰出科学家，IEEE Fellow，IAPR Fellow，中国计算机学会会士；长江学者特聘教授，国家杰出青年基金获得者。2007年创建南京大学机器学习与数据挖掘研究所（LAMDA），2010年11月任软件新技术国家重点实验室常务副主任，2013年5月任计算机系副主任。
     * summary : 机器学习是计算机科学与人工智能的重要分支领域. 本书作为该领域的入门教材，在内容上尽可能涵盖机器学习基础知识的各方面。 为了使尽可能多的读者通过本书对机器学习有所了解, 作者试图尽可能少地使用数学知识. 然而, 少量的概率、统计、代数、优化、逻辑知识似乎不可避免. 因此, 本书更适合大学三年级以上的理工科本科生和研究生, 以及具有类似背景的对机器学 习感兴趣的人士. 为方便读者, 本书附录给出了一些相关数学基础知识简介.
     全书共16 章，大致分为3 个部分：第1 部分（第1～3 章）介绍机器学习的基础知识；第2 部分（第4～10 章）讨论一些经典而常用的机器学习方法（决策树、神经网络、支持向量机、贝叶斯分类器、集成学习、聚类、降维与度量学习）；第3 部分（第11～16 章）为进阶知识，内容涉及特征选择与稀疏学习、计算学习理论、半监督学习、概率图模型、规则学习以及强化学习等.前3章之外的后续各章均相对独立, 读者可根据自己的兴趣和时间情况选择使用. 根据课时情况, 一个学期的本科生课程可考虑讲授前9章或前10章; 研究生课程则不妨使用全书.
     书中除第1章外, 每章都给出了十道习题. 有的习题是帮助读者巩固本章学习, 有的是为了引导读者扩展相关知识. 一学期的一般课程可使用这些习题, 再辅以两到三个针对具体数据集的大作业. 带星号的习题则有相当难度, 有些并无现成答案, 谨供富有进取心的读者启发思考.
     本书可作为高等院校计算机、自动化及相关专业的本科生或研究生教材，也可供对机器学习感兴趣的研究人员和工程技术人员阅读参考。
     * price : 88.00元
     */

    private RatingBean rating;
    private String subtitle;
    private String pubdate;
    private String origin_title;
    private String image;
    private String binding;
    private String catalog;
    private String pages;
    private ImagesBean images;
    private String alt;
    private String id;
    private String publisher;
    private String isbn10;
    private String isbn13;
    private String title;
    private String url;
    private String alt_title;
    private String author_intro;
    private String summary;
    private String price;
    private List<String> author;
    private List<TagsBean> tags;
    private List<?> translator;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getOrigin_title() {
        return origin_title;
    }

    public void setOrigin_title(String origin_title) {
        this.origin_title = origin_title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlt_title() {
        return alt_title;
    }

    public void setAlt_title(String alt_title) {
        this.alt_title = alt_title;
    }

    public String getAuthor_intro() {
        return author_intro;
    }

    public void setAuthor_intro(String author_intro) {
        this.author_intro = author_intro;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public List<TagsBean> getTags() {
        return tags;
    }

    public void setTags(List<TagsBean> tags) {
        this.tags = tags;
    }

    public List<?> getTranslator() {
        return translator;
    }

    public void setTranslator(List<?> translator) {
        this.translator = translator;
    }

    public static class RatingBean {
        /**
         * max : 10
         * numRaters : 1534
         * average : 8.7
         * min : 0
         */

        private int max;
        private int numRaters;
        private String average;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public int getNumRaters() {
            return numRaters;
        }

        public void setNumRaters(int numRaters) {
            this.numRaters = numRaters;
        }

        public String getAverage() {
            return average;
        }

        public void setAverage(String average) {
            this.average = average;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class ImagesBean {
        /**
         * small : https://img1.doubanio.com/view/subject/s/public/s28735609.jpg
         * large : https://img1.doubanio.com/view/subject/l/public/s28735609.jpg
         * medium : https://img1.doubanio.com/view/subject/m/public/s28735609.jpg
         */

        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class TagsBean {
        /**
         * count : 2495
         * name : 机器学习
         * title : 机器学习
         */

        private int count;
        private String name;
        private String title;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
