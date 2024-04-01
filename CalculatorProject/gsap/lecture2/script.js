var tl = gsap.timeline();
tl.from("#nav img,#nav h3,#nav button",{
    y:-100,
    duration:0.8,
    delay:0.3,
    opacity:0,
    stagger:0.2
})
tl.from("#main h1",{
    y:100,
    opacity:0,
    stagger:0.5
})