# yuteng-unice

Ca y est - [la grippe est arrivée](https://france3-regions.francetvinfo.fr/provence-alpes-cote-d-azur/bouches-du-rhone/marseille/sante-ca-y-est-epidemie-grippe-est-arrivee-paca-1388901.html) chez nous ! This project is a simulation of a flu ([influenza](http://en.wikipedia.org/wiki/Influenza)) epidemic. Obviously this will be a simplification of real-world epidemics. The simulation consists of both a disease model describing characteristics of the illness, and a social model describing how people interact with each other.

We start with the basic element of the simulation – a person. We'll abstract away most of the details we associate with people since only a few qualities interest us. At any given time, a person can be in one (or more) of several states:

- Healthy: healthy people can become sick only after they come in contact with people who are contagious. But not always - this depends on the infection rate of the disease, only some percentage of exposed people may become ill.
- Infected: after contact with a contagious person, a healthy person may become infected. An infected person carries the various but displays no symptoms. An infected person may also become contagious after an incubation period.
- Sick: an infected person may become sick, ie, they display symptoms of the disease. They remain infected.
- Contagious: a few days (let's say two days - this is the incubation time) after infection, a sick person becomes contagious and may transmit the disease to other people with whom they come into contact. They remain infected.
- Recovering: some time after becoming contagious (let's say three days for our simulation, a person either gets over the illness and starts recovering, or...dies of the illness. A recovering person is no longer infected nor contagious and becomes healthy again after three more days. A recovered person cannot be re-infected.
- Dead: depending on the mortality rate of the disease, a person may recover or die. A dead person stays dead.

For the moment, the times in the simulation disease model are fixed, eg, becoming contagious takes two days after infection. However, the infection and mortality rates remain to be determined.

The simulation also consists of three other elements: chickens, ducks and pigs. These have much the same behaviour as people, they can be in the same states and they can be infectious (chickens and ducks can infect each other with the [H5N1](http://en.wikipedia.org/wiki/Influenza_A_virus_subtype_H5N1) virus, pigs infect pigs with the [H1N1](http://en.wikipedia.org/wiki/Influenza_A_virus_subtype_H1N1) virus ) with different incubation times and mortality rates. However, infected animals never die of the infection. Rarely, an animal can infect a person with its virus, which people can then pass on to other people as described above.

The social model describes the behaviour of the simulation elements. They all live together on a two-dimensional grid and are in contact with other elements situated within a neighbourhood on the grid. The notion of neighbourhood is a parameter of the simulation, eg, this can be the 4-neighbourhood of row and column neighbours, or the 8-neighbourhood which includes diagonal neighbours, or some other neighbourhood. An element does not necessarily contact all of its neighbours; perhaps a fixed number or some percentage. Contagious elements can infect healthy elements they come into contact with, within the rules given above.

The simulation itself proceeds by steps of a day at a time. The grid is initialized with all people being healthy, but with some animals already being sick with their specific virus. At the first step, each element determines which state they should next assume, and so on. The simulation ends when there is no more change, all entities are either healthy or dead.

Note that this in *not a graphics simulation*, everything should work from the command line and the only output permitted is from System.out.print[ln]. You will have to come up with some way to visually represent entities in their different states on the grid.

## Variants

There are lots of possibilities, including:

- Individual characteristics which can affect the infection rate, eg, different inherent resistance to the disease, or different habits such as frequent hand-washing.
- Individual characteristics which can affect the mortality rate, eg, a general fitness level.
- Someone who has been exposed and has recovered develops antibodies which confer resistance to infection.
- Different population patterns, ie, not every grid point has to be populated.
- Some individuals may be vaccinated against the viruses.
- Elements may move on the grid.
- Changing weather can change infection rates.
- Invent your own...

## Constraints

- The development language is Java.
- Code must be professional - clean and commented.
- Code must be tested.
- You must implement at least one variant. But...still no graphic interfaces.
- Code work will be undergitversion control at [github](https://github.com/). Code should be committed frequently.
- Project delivery is on github.
- Along with the code, deliverables also include a Readme.txt file with instructions on how to run the application from the command line.
- You work individually. You may collaborate to some extent, but each submission is individual (it's really too bad to have to mention this!).

### Unconstraints

- Use the development tool of your choice. You will get the most support using Sublime Text 3.
- Use the operating system of your choice. You will get the most support using Linux.
- Use the hardware of your choice.



# 流感流行

就是这样 - [流感已经到](https://france3-regions.francetvinfo.fr/provence-alpes-cote-d-azur/bouches-du-rhone/marseille/sante-ca-y-est-epidemie-grippe-est-arrivee-paca-1388901.html)了我们身上！这个项目是对流感（[流感](http://en.wikipedia.org/wiki/Influenza)）流行的模拟。显然这将是对现实世界流行病的简化。模拟是描述疾病特征的疾病模型，描述人们如何相互作用的社会模型。

我们从模拟的基本元素开始 - 一个人。我们将抽象出大部分与人交往的细节。在任何时候，一个人可以处于几个州中的一个（或多个）：

- 健康：健康的人在接触到有传染性的人后会生病。但并不总是 - 这是关于疾病的感染率，只有一部分人可能会生病。
- 感染：与传染病人接触后，健康人可能会感染。感染者携带各种物品，但没有症状。感染者在潜伏期后也可能变得具有传染性。
- 生病：感染者可能会生病，即他们表现出疾病的症状。他们仍然感染。
- 传染性：感染后几天，病人会变得具有传染性，并可能将疾病传染给与他们接触的其他人。他们仍然感染。
- 恢复：在感染后的一段时间（对我们的模拟来说“让我们说”），“恢复的人不再感染并且传染并且变得健康”更多的人不能再被感染。
- 死亡：根据疾病的死亡率，一个人可能会康复或死亡。死者死亡。

目前，模拟疾病的时间是固定的，例如，在感染两天后变得具有传染性。然而，感染率和死亡率仍有待确定。

模拟也由三个要素组成：鸡，鸭和猪。这些行为与他们的行为大致相同，并且它们可能具有传染性（鸡和鸭可以 通过不同的孵育时间和死亡率与[H5N1](http://en.wikipedia.org/wiki/Influenza_A_virus_subtype_H5N1)  病毒，感染了[H1N1](http://en.wikipedia.org/wiki/Influenza_A_virus_subtype_H1N1)病毒的猪相互感染  ）。但是，感染的动物不会死于感染。很少，动物可以用病毒感染一个人，然后人们可以传染给其他人。

社交模型描述了模拟元素的行为。他们一起生活在一个二维网格上，并与网格上一个邻域内的其他元素接触。邻域的概念是模拟的参数，例如，它可以是行和列邻居的4邻域，或者包括对角邻居或某个其他邻域的8邻域。一个元素不需要联系它的所有邻居; 也许是一个固定的数字或一些比例。按照上述规则，传染性元素可以感染他们接触到的健康元素。

模拟本身一次一天的步骤。电网正在健康，但有些动物因其特定病毒而感染病毒。在第一步，他们应该承担什么，等等。模拟在没有变化时结束，所有实体都健康或死亡。

请注意，这*不是图形模拟*，所有内容都应该来自命令行以及System.out.print [ ln ]允许的唯一输出。你将不得不想出一些方法来在网格上以不同的状态直观地表示它们。

## 变种

有很多可能性，包括：

- 这会影响感染率，例如对疾病的内在抵抗力，或不同的习惯，如频繁洗手。
- 可能影响死亡率的个体特征，例如一般健康水平。
- 有人已经被暴露并遇到过
- 不同的人口模式，即不是每个网格点都必须填充。
- 有些病人可能接种了病毒疫苗。
- 元素可以在网格上移动。
- 天气变化会改变感染率。
- 发明你自己的...

## 约束

- 开发语言是Java。
- 代码必须专业 - 清洁和评论。
- 代码必须经过测试。
- 您必须至少有一个变体。但是......仍然没有图形界面。
- 代码工作将在[github的](https://github.com/)[git](https://people.irisa.fr/Anthony.Baire/git/git-for-beginners-handout.pdf)版本控制下进行。代码应该经常提交。
- 项目交付在github上。
- 与代码一起，可交付成果还包含一个Readme.txt文件，其中包含有关如何从命令行运行应用程序的说明。
- 你单独工作。你可以在某种程度上进行协作，但每一次提交都是单独的（这真的太糟糕了，不得不提这个！）。

### Unconstraints

- 使用您选择的开发工具。您将使用Sublime Text 3获得最多的支持。
- 使用您选择的操作系统。您将获得最多使用Linux的支持。
- 使用您选择的硬件