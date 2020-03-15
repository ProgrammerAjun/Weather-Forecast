package com.xiaozhuan.forecast.bean;

import java.util.List;

/**
 * 数据库的实体类信息
 */
public class WeatherBean {

    /**
     * error : 0
     * status : success
     * date : 2019-11-05
     * results : [{"currentCity":"北京","pm25":"45","index":[{"des":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","tipt":"穿衣指数","title":"穿衣","zs":"较冷"},{"des":"适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。","tipt":"洗车指数","title":"洗车","zs":"适宜"},{"des":"昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。","tipt":"感冒指数","title":"感冒","zs":"较易发"},{"des":"天气较好，无雨水困扰，较适宜进行各种运动，但因气温较低，在户外运动请注意增减衣物。","tipt":"运动指数","title":"运动","zs":"较适宜"},{"des":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。","tipt":"紫外线强度指数","title":"紫外线强度","zs":"中等"}],"weather_data":[{"date":"周二 11月05日 (实时：14℃)","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/qing.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"晴转多云","wind":"南风微风","temperature":"17 ~ 6℃"},{"date":"周三","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/qing.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"晴","wind":"西南风微风","temperature":"16 ~ 5℃"},{"date":"周四","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/qing.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"晴","wind":"东北风微风","temperature":"13 ~ 1℃"},{"date":"周五","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/qing.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"晴转多云","wind":"西风微风","temperature":"16 ~ 2℃"}]}]
     */

    private int error;
    private String status;
    private String date;
    private List<ResultsBean> results;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * currentCity : 北京
         * pm25 : 45
         * index : [{"des":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","tipt":"穿衣指数","title":"穿衣","zs":"较冷"},{"des":"适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。","tipt":"洗车指数","title":"洗车","zs":"适宜"},{"des":"昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。","tipt":"感冒指数","title":"感冒","zs":"较易发"},{"des":"天气较好，无雨水困扰，较适宜进行各种运动，但因气温较低，在户外运动请注意增减衣物。","tipt":"运动指数","title":"运动","zs":"较适宜"},{"des":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。","tipt":"紫外线强度指数","title":"紫外线强度","zs":"中等"}]
         * weather_data : [{"date":"周二 11月05日 (实时：14℃)","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/qing.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"晴转多云","wind":"南风微风","temperature":"17 ~ 6℃"},{"date":"周三","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/qing.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"晴","wind":"西南风微风","temperature":"16 ~ 5℃"},{"date":"周四","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/qing.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"晴","wind":"东北风微风","temperature":"13 ~ 1℃"},{"date":"周五","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/qing.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"晴转多云","wind":"西风微风","temperature":"16 ~ 2℃"}]
         */

        private String currentCity;
        private String pm25;
        private List<IndexBean> index;
        private List<WeatherDataBean> weather_data;

        public String getCurrentCity() {
            return currentCity;
        }

        public void setCurrentCity(String currentCity) {
            this.currentCity = currentCity;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public List<IndexBean> getIndex() {
            return index;
        }

        public void setIndex(List<IndexBean> index) {
            this.index = index;
        }

        public List<WeatherDataBean> getWeather_data() {
            return weather_data;
        }

        public void setWeather_data(List<WeatherDataBean> weather_data) {
            this.weather_data = weather_data;
        }

        public static class IndexBean {
            /**
             * des : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
             * tipt : 穿衣指数
             * title : 穿衣
             * zs : 较冷
             */

            private String des;
            private String tipt;
            private String title;
            private String zs;

            public String getDes() {
                return des;
            }

            public void setDes(String des) {
                this.des = des;
            }

            public String getTipt() {
                return tipt;
            }

            public void setTipt(String tipt) {
                this.tipt = tipt;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getZs() {
                return zs;
            }

            public void setZs(String zs) {
                this.zs = zs;
            }
        }

        public static class WeatherDataBean {
            /**
             * date : 周二 11月05日 (实时：14℃)
             * dayPictureUrl : http://api.map.baidu.com/images/weather/day/qing.png
             * nightPictureUrl : http://api.map.baidu.com/images/weather/night/duoyun.png
             * weather : 晴转多云
             * wind : 南风微风
             * temperature : 17 ~ 6℃
             */

            private String date;
            private String dayPictureUrl;
            private String nightPictureUrl;
            private String weather;
            private String wind;
            private String temperature;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDayPictureUrl() {
                return dayPictureUrl;
            }

            public void setDayPictureUrl(String dayPictureUrl) {
                this.dayPictureUrl = dayPictureUrl;
            }

            public String getNightPictureUrl() {
                return nightPictureUrl;
            }

            public void setNightPictureUrl(String nightPictureUrl) {
                this.nightPictureUrl = nightPictureUrl;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }
        }
    }
}
