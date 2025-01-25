package com.enviro.assessment.grad001.kaelobrandonmokalake.wastemanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class wasteController {

    
    // The following methods uses a variable to store and return 
    // infomation to the web display screen and implements 
    // GET methods
    @GetMapping({ "/home" })
    public String wasteinfo() {
        String wasteDefinition = """
                <html>

                <head><title>Waste Management</title>
                <style>
                h1{
                  padding: 10px;
                }

                h3 {
                border: 1px solid grey;
                border-radius: 8px;
                padding: 5px;
                }

                .sidenav {
                height: 100%;
                width: 200px;
                position: fixed;
                z-index: 1;
                top: 0;
                left: 0;
                background-color: #111;
                overflow-x: hidden;
                padding-top: 20px;
                }

                .sidenav a {
                padding: 6px 6px 6px 32px;
                text-decoration: none;
                font-size: 25px;
                color: #818181;
                display: block;
                }

                .sidenav a:hover {
                color: #f1f1f1;
                }

                .main {
                margin-left: 200px;
                }

                @media screen and (max-height: 450px) {
                .sidenav {padding-top: 15px;}
                .sidenav a {font-size: 18px;}
                }
                </style>
                </head>
                       <body>
                       
                        <div class="sidenav">
                        <a href="home" target="_self">Introduction</a>
                        <a href="wasteCategory" target="_self">Category</a>
                        <a href="wasteDisposalTips" target="_self">tips</a>
                        <a href="wasteRecyclingGuides" target="_self">guides</a>
                        <a href="edit" target="_self">Edit Info</a>
                        </div>

                       <div class= "main"><h1>What is Waste</h2>

                      <h3>
                      <p style="font-family:'Courier New'">Waste is defined as unwanted and unusable materials and is regarded as a substance which is of no use.
                      Waste that we see in our surroundings is also known as garbage. Garbage is mainly considered as a solid
                       waste that includes wastes from our houses, schools, offices, etc (municipal wastes)
                        and wastes from industries and factories (industrial wastes). <br><br>What constitutes waste depends on the eye of the beholder; 
                        one person's waste can be a resource for another person. Though waste is a physical object, its generation is a physical process.
                        Waste has been a major environmental issue everywhere since forever. Everyone creates waste, although some people 
                        are very environmentally conscious and create lee of it. Likewise, some countries do a very good job of creating less waste and
                        managing the rest. Others are pretty horrible and have created huge environmental problems for the people and animals living there.<br><br>
                        All over the world, communities handle their waste or trash differently. Some common methods of managing their
                         waste include landfilling, recycling, and composting. Other communities strongly embark on waste reduction
                          and litter prevention/control aimed at reducing the production of waste in the first place. Some communities 
                          also engage in waste-to-energy plants and hazardous waste disposal programs.
                        </p>
                        </h3></div>
                       </body>

                </html>""";
        return wasteDefinition;
    }

    @GetMapping("wasteCategory")
    public String wasteCategoryInfo() {
        
        String wasteCategory =  """
                <html>

                <head><title>Waste Management</title>
                <style>
                h1{
                  padding: 10px;
                }

                h3 {
                border: 1px solid grey;
                border-radius: 8px;
                padding: 5px;
                }

                .sidenav {
                height: 100%;
                width: 200px;
                position: fixed;
                z-index: 1;
                top: 0;
                left: 0;
                background-color: #111;
                overflow-x: hidden;
                padding-top: 20px;
                }

                .sidenav a {
                padding: 6px 6px 6px 32px;
                text-decoration: none;
                font-size: 25px;
                color: #818181;
                display: block;
                }

                .sidenav a:hover {
                color: #f1f1f1;
                }

                .main {
                margin-left: 200px; 
                }

                @media screen and (max-height: 450px) {
                .sidenav {padding-top: 15px;}
                .sidenav a {font-size: 18px;}
                }
                </style>
                </head>
                       <body>
                       
                        <div class="sidenav">
                        <a href="home" target="_self">Introduction</a>
                        <a href="wasteCategory" target="_self">Category</a>
                        <a href="wasteDisposalTips" target="_self">tips</a>
                        <a href="wasteRecyclingGuides" target="_self">guides</a>
                        <a href="edit" target="_self">Edit Info</a>
                        </div>

                       <div class= "main"><h1>Sources of Waste</h2>

                      <h3>
                      <p style="font-family:'Courier New'"> Sources of waste can be broadly classified into four types: Industrial, Commercial, Domestic, and Agricultural.
                      
                        <br><br>
                        <u>Industrial Waste</u><br>
                        These are the wastes created in factories and industries. Most industries dump their wastes in rivers and seas 
                        which cause a lot of pollution. <br>
                        Example: plastic, glass, etc.

                        <br><br>
                        <u>Commercial  Waste</u><br>
                        Commercial wastes are produced in schools, colleges, shops, and offices.<br>
                        Example: plastic, paper, etc.


                        <br><br>
                        <u>Domestic Waste</u><br>
                        The different household wastes which are collected during household activities like cooking, cleaning, etc. are known as domestic wastes.
                        <br>Example: leaves, vegetable peels, excreta, etc.

                        <br><br>
                        <u>Agricultural Waste</u><br>
                        Various wastes produced in the agricultural field are known as agricultural wastes.<br>
                        Example: cattle waste, weed, husk, etc.
                        </p>
                        </h3></div>
                       </body>

                </html>
                """;

                return wasteCategory;
    }

    @GetMapping("wasteRecyclingGuides")
    public String wasteGuidesInfo() {

        String wasteRecyclingGuides = """
                
        <html>

                <head><title>Waste Management</title>
                <style>
                h1{
                  padding: 10px;
                }

                h3 {
                border: 1px solid grey;
                border-radius: 8px;
                padding: 5px;
                }

                .sidenav {
                height: 100%;
                width: 200px;
                position: fixed;
                z-index: 1;
                top: 0;
                left: 0;
                background-color: #111;
                overflow-x: hidden;
                padding-top: 20px;
                }

                .sidenav a {
                padding: 6px 6px 6px 32px;
                text-decoration: none;
                font-size: 25px;
                color: #818181;
                display: block;
                }

                .sidenav a:hover {
                color: #f1f1f1;
                }

                .main {
                margin-left: 200px; 
                }

                @media screen and (max-height: 450px) {
                .sidenav {padding-top: 15px;}
                .sidenav a {font-size: 18px;}
                }
                </style>
                </head>
                       <body>
                       
                        <div class="sidenav">
                        <a href="home" target="_self">Introduction</a>
                        <a href="wasteCategory" target="_self">Category</a>
                        <a href="wasteDisposalTips" target="_self">tips</a>
                        <a href="wasteRecyclingGuides" target="_self">guides</a>
                        <a href="edit" target="_self">Edit Info</a>
                        </div>

                       <div class= "main"><h1>Guidelines to waste management</h2>

                      <h3>
                      <p style="font-family:'Courier New'">
                      <u>Prevention</u> is a conscious approach of acquiring and using materials judiciously. Discouraging excessive orders 
                      and procurement aligned with utilization period and expiry dates whilst managing hazardous material inventory 
                      with optimized procurement practices. Where feasible remove hazardous waste creation from processes.
                      <br><br><u>Reuse</u> promotes safe pathways in support of the circular economy through elimination of 
                      waste, recirculation of products and regenerative natural systems.
                      <br><br><u>Recycling</u> allows for environmentally responsible reclamation and processing of waste, either in alignment 
                      with original or for co-processing purposes. All recycling should be in a manner which ensures the protection 
                      of human health and the environment. <br><br><u>Recovery</u> processes such as energy from waste ensures that the embodied 
                      energy used to manufacture the material is recovered back into the system. Although undesirable, recovery may 
                      be the only viable alternative to disposal. <br><br><u>Disposal</u> is the least desirable process and may involve landfill, 
                      incineration, or other non-recovery disposal methods.

                        </p>
                        </h3></div>
                       </body>

                </html>
                """;

        return wasteRecyclingGuides;
    }
    @GetMapping("wasteDisposalTips")
    public String wasteDisposalTipsInfo() {

        String wasteDisposal = """
                <html>

                <head><title>Waste Management</title>
                <style>
                h1{
                  padding: 10px;
                }

                h3 {
                border: 1px solid grey;
                border-radius: 8px;
                padding: 5px;
                }

                .sidenav {
                height: 100%;
                width: 200px;
                position: fixed;
                z-index: 1;
                top: 0;
                left: 0;
                background-color: #111;
                overflow-x: hidden;
                padding-top: 20px;
                }

                .sidenav a {
                padding: 6px 6px 6px 32px;
                text-decoration: none;
                font-size: 25px;
                color: #818181;
                display: block;
                }

                .sidenav a:hover {
                color: #f1f1f1;
                }

                .main {
                margin-left: 200px; 
                }

                @media screen and (max-height: 450px) {
                .sidenav {padding-top: 15px;}
                .sidenav a {font-size: 18px;}
                }
                </style>
                </head>
                       <body>
                       
                        <div class="sidenav">
                        <a href="home" target="_self">Introduction</a>
                        <a href="wasteCategory" target="_self">Category</a>
                        <a href="wasteDisposalTips" target="_self">tips</a>
                        <a href="wasteRecyclingGuides" target="_self">guides</a>
                        <a href="edit" target="_self">Edit Info</a>
                        </div>

                       <div class= "main"><h1>Recycling tips</h2>

                      <h3>
                      <p style="font-family:'Courier New'">
                      Recycling does not have to be a chore, with a few simple changes it can be seamlessly integrated into everyday
                       life. Just follow our simple tips below and start making a difference. The more you recycle, the better it is 
                       for the environment and the better it is for your pocket. Even if you do recycle your waste, there’s probably still 
                       more items that you can recycle or reuse than you realise. Recycling doesn’t have to be difficult; follow 
                       these simple tips to recycle more at home, work, and school.


                       <br><br>
                       <u>Recycling at home </u>
                       <br>Have a system: keep a recycling bag, box, or bin next to your rubbish bin as a reminder for everyone in your house to recycle.

                       <br>Flatten cardboard boxes: you can fit more into your recycling box or bin that way

                       <br>Recycle plastic bottles: don’t forget items like shampoo and mouthwash bottles. Most councils will accept most types of plastic in recycling, though if in doubt, the label on the bottle should tell you it it’s recyclable.

                       <br>Recycle all paper and cardboard: it’s not just newspapers that you can recycle; envelopes, wrapping paper, birthday cards (as long as they don’t contain glitter) and phone books can all be recycled. All types of cardboard can be recycled, so don’t forget the toilet roll tubes and drinks cartons.

                       <br><br>
                       <u> Recycling at school</u>

                       <br>Have recycling points stationed around the school: if possible, have a recycling bin, bag, or container in every room. Offices, staff rooms, and kitchen are areas where a lot of waste is generated and potentially thrown away. Have a recycling container next to general waste bins as a prompt to get people to think before they throw.
                       <br>Get everyone involved: teachers should lead by example by recycling as much as possible and encouraging pupils to be involved as well. All school staff, such as cleaners and teaching assistants should be involved so that everyone knows the expectations across the board.
                       <br>Improve awareness of recycling: use posters to raise awareness of the importance of recycling and clearly label recycling points.
                       <br>Review and monitor: keep track of recycling levels and use this information to motivate people to keep the effort going, and to make changes to recycling activities if necessary.
                       
                       <br><br>
                       <u> Recycling at work</u>
                       <br>Set up a recycling scheme: it reduces waste being sent to landfill, saves energy, benefits the planet, and saves your company money. Promote your scheme with posters placed around your workplace. Station recycling containers in convenient locations.
                        <br>Recycle for charity: some items such as mobile phones, computer equipment, stamps and printer cartridges can all be recycled to help to raise funds for charities.
                       </p>
                        </h3></div>
                       </body>

                </html>
                """;

        return wasteDisposal;
    }

    @GetMapping("edit")
    public String editDataInfo() {
        return "edit";
    }
    
}