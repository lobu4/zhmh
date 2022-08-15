<template>
  <div class="about">
    <h1>This is an about page</h1>
    <h1>{{msg}}</h1>
    <h1>{{stu}}</h1>
    <h1>{{stu.sid}}</h1>
    <h1>{{stu.password}}</h1>
  </div>

</template>

<script>
export default {
  data() {
    return {
      msg: '欺负小海妈',
      stu: null
    };
  },
  created(){
    //请求查询数据
    fetch("http://localhost:8081/student/findStudentById?id=1").then(res => res.json()).then(res =>{
      console.log(res);
      this.stu = res
    })
  },
}
</script>
