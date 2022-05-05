<template>
  <div class="test-c">
    <h3>{{ name }}</h3>
    <button @click="show">show me</button>
    <p> message : {{ message }}</p>
    <button @click="message+= 'you'">click me</button>
  </div>
</template>

<script>
export default {

  props: ['in'],
  data() {
    return {
      message: 'lover~',
      name: 'Goooooooooooooooooole'
    }
  },
  methods: {

    show() {
      console.log('调用了test 的show' + this.in)
      console.log('调用了test 的show' + this.name)
    }
  }

}
</script>

<style scoped>

</style>