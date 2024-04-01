// gsap.to("#box",{
// x:700,
// duration:2,
// delay:1,
// backgroundColor:"blue",
// rotate:45,
// scale:0.5,
// })
// gsap.from("#box", {
//     x: 700,
//     duration: 2,
//     delay: 1,
//     backgroundColor: "blue",
//     rotate: 45,
//     scale: 0.5,
// })
// gsap.to("h1", {
//     x: 700,
//     duration: 2,
//     delay: 1,
// color:"orange"
// })
// gsap.to("h2", {
//     x: 700,
//     duration: 2,
//     delay: 2,
// color:"purple"
// })
// gsap.to("h3", {
//     x: 700,
//     duration: 2,
//     delay: 3,
// color:"black"
// })
// gsap.from("h1", {
//     x: 700,
//     duration: 1,
//     delay: 0.5,
// // stagger:1,
// repeat:-1,
// yoyo:true

// })
// gsap.from("h2", {
//     x: 700,
//     duration: 2,
//     delay: 2,
// color:"purple"
// })
// gsap.from("h3", {
//     x: 700,
//     duration: 2,
//     delay: 3,
// color:"black"
// })
var tl = gsap.timeline();

tl.to("h1", {
    x: 600,
    duration:1
})
tl.to("h2", {
    x: 700,
    duration:1
    
})
tl.to("h3", {
    x: 800,
    duration:1

})