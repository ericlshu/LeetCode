import domain.ListNode;
import domain.TreeNode;
import org.junit.Test;
import solution.collection.*;
import solution.design.*;

/**
 * Description :
 *
 * @author Eric L SHU
 * @date 2021-03-27 14:27
 * @since JDK 1.8
 */
public class CollectionTest
{
    @Test
    public void testP0381()
    {
        P0381InsertDeleteAndGetRandom.RandomizedCollection randomizedCollection = new P0381InsertDeleteAndGetRandom.RandomizedCollection();
        System.out.println("result = " + randomizedCollection.insert(21));
    }

    @Test
    public void test0142()
    {
        P0142LinkedListCycleTwo p0142 = new P0142LinkedListCycleTwo();
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(p0142.detectCycle1(node1).val);
        System.out.println(p0142.detectCycle2(node1).val);
    }

    @Test
    public void testP0143()
    {
        P0143ReorderList p0143 = new P0143ReorderList();
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        p0143.reorderList_1(head1);
        System.out.println("head1 = " + head1);
        p0143.reorderList_2(head2);
        System.out.println("head2 = " + head2);
    }

    @Test
    public void testP0206()
    {
        P0206ReverseLinkedList obj = new P0206ReverseLinkedList();
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(0, node1);

        System.out.println("ListNode = " + head);

        head = obj.reverseListByIteration(head);
        System.out.println("ListNode = " + head);

        head = obj.reverseListByRecursion(head);
        System.out.println("ListNode = " + head);

        head = obj.reverseListByStack(head);
        System.out.println("ListNode = " + head);
    }

    @Test
    public void test0203()
    {
        P0203RemoveLinkedListElements obj = new P0203RemoveLinkedListElements();

        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(6, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);

        ListNode result = obj.removeElements_recursion(head, 6);
        while (result != null)
        {
            System.out.println(result.val);
            result = result.next;
        }

        System.out.println("result = " + obj.removeElements_iteration(null, 1));
    }

    @Test
    public void test0021()
    {
        P0021MergeTwoSortedLists obj = new P0021MergeTwoSortedLists();

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = obj.mergeTwoLists(l1, l2);
        while (result != null)
        {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    public void test0083()
    {
        P0083RemoveDuplicatesFromSortedList obj = new P0083RemoveDuplicatesFromSortedList();

        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(3, null)))));

        ListNode result = obj.deleteDuplicates(head);
        while (result != null)
        {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    public void test0160()
    {
        P0160IntersectionOfTwoLinkedLists p0160 = new P0160IntersectionOfTwoLinkedLists();
        ListNode listA = new ListNode(4);
        ListNode node1 = new ListNode(1);
        listA.next = node1;

        ListNode listB = new ListNode(5);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(1);
        listB.next = node2;
        node2.next = node3;

        ListNode intersect = new ListNode(8, new ListNode(4, new ListNode(5, null)));
        node1.next = intersect;
        node3.next = intersect;

        System.out.println(p0160.getIntersectionNode_hash(listA, listB));
        System.out.println(p0160.getIntersectionNode_pointers(listA, listB));
    }

    @Test
    public void test0706()
    {
        P0706DesignHashMap.MyHashMapArray myHashMapArray = new P0706DesignHashMap.MyHashMapArray();
        myHashMapArray.put(1, 1);                       // myHashMap 现在为 [[1,1]]
        myHashMapArray.put(2, 2);                       // myHashMap 现在为 [[1,1], [2,2]]
        System.out.println(myHashMapArray.get(1));      // 返回 1 ，myHashMap 现在为 [[1,1], [2,2]]
        System.out.println(myHashMapArray.get(3));      // 返回 -1（未找到），myHashMap 现在为 [[1,1], [2,2]]
        myHashMapArray.put(2, 1);                       // myHashMap 现在为 [[1,1], [2,1]]（更新已有的值）
        System.out.println(myHashMapArray.get(2));      // 返回 1 ，myHashMap 现在为 [[1,1], [2,1]]
        myHashMapArray.remove(2);                   // 删除键为 2 的数据，myHashMap 现在为 [[1,1]]
        System.out.println(myHashMapArray.get(2));      // 返回 -1（未找到），myHashMap 现在为 [[1,1]]

        P0706DesignHashMap.MyHashMapNode myHashMapNode = new P0706DesignHashMap.MyHashMapNode();
        myHashMapNode.put(1, 1);                        // myHashMap 现在为 [[1,1]]
        myHashMapNode.put(2, 2);                        // myHashMap 现在为 [[1,1], [2,2]]
        System.out.println(myHashMapNode.get(1));       // 返回 1 ，myHashMap 现在为 [[1,1], [2,2]]
        System.out.println(myHashMapNode.get(3));       // 返回 -1（未找到），myHashMap 现在为 [[1,1], [2,2]]
        myHashMapNode.put(2, 1);                        // myHashMap 现在为 [[1,1], [2,1]]（更新已有的值）
        System.out.println(myHashMapNode.get(2));       // 返回 1 ，myHashMap 现在为 [[1,1], [2,1]]
        myHashMapNode.remove(2);                    // 删除键为 2 的数据，myHashMap 现在为 [[1,1]]
        System.out.println(myHashMapNode.get(2));       // 返回 -1（未找到），myHashMap 现在为 [[1,1]]
    }

    @Test
    public void test0002()
    {
        P0002AddTwoNumbers p0002 = new P0002AddTwoNumbers();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode l3 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode l4 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
        System.out.println(p0002.addTwoNumbers_1(l1, l2));
        System.out.println(p0002.addTwoNumbers_2(l3, l4));
    }

    @Test
    public void test0082()
    {
        P0082RemoveDuplicatesFromSortedListII p0082 = new P0082RemoveDuplicatesFromSortedListII();
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5)))))));
        ListNode head2 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3)))));
        ListNode head3 = new ListNode(1, new ListNode(1, new ListNode(1)));
        System.out.println(p0082.deleteDuplicates_1(head1));
        System.out.println(p0082.deleteDuplicates_2(head2));
        System.out.println(p0082.deleteDuplicates_3(head3));
    }

    @Test
    public void test0024()
    {
        P0024SwapNodesInPairs p0024 = new P0024SwapNodesInPairs();
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        System.out.println(p0024.swapPairs_recursion(head1));
        System.out.println(p0024.swapPairs_iteration(head2));
    }

    @Test
    public void test0707()
    {
        P0707SinglyLinkedList singlyLinkedList = new P0707SinglyLinkedList();
        singlyLinkedList.addAtHead(1);
        singlyLinkedList.addAtTail(3);
        singlyLinkedList.addAtIndex(1, 2); // 链表变为1-> 2-> 3
        singlyLinkedList.get(1);                    // 返回2
        singlyLinkedList.deleteAtIndex(1);          // 现在链表是1-> 3
        singlyLinkedList.get(1);                    // 返回3

        P0707DoublyLinkedList doublyLinkedList = new P0707DoublyLinkedList();
        doublyLinkedList.addAtHead(1);
        doublyLinkedList.addAtTail(3);
        doublyLinkedList.addAtIndex(1, 2); // 链表变为1-> 2-> 3
        doublyLinkedList.get(1);                    // 返回2
        doublyLinkedList.deleteAtIndex(1);          // 现在链表是1-> 3
        doublyLinkedList.get(1);                    // 返回3
    }

    @Test
    public void test0402()
    {
        P0402RemoveKDigits obj = new P0402RemoveKDigits();
        System.out.println("result = " + obj.removeKDigits("1432219", 3));
        System.out.println("result = " + obj.removeKDigits("10200", 1));
        System.out.println("result = " + obj.removeKDigits("10", 1));
        System.out.println("result = " + obj.removeKDigits("112", 1));
        System.out.println("result = " + obj.removeKDigits("5337", 2));
        System.out.println("result = " + obj.removeKdigits("996414363788153611534713021581934201828636847894114849949764848271145953346100425440564423705308160608336170309768131340987930561551032020085493444465193544083073070710550651127384420202284715693947961741503230801612259019643388373415242532432185095002546192236830917993656777205823895681565852256661971230933778711000024814024862198372554113821624993211934165249722752734719691558487424574765564337372811477100217812101347653217612856122765119173245525855698821566350946703626535675961447286537950070232309338175661044886376964501660879051008236994257987635984443260693570528423799185358552969157600544593174335218787781718110810765931666630909480297931136268524627123881164837747134261839114812308843935942493318281655037982696342444307736930338827080002496328501487998593220246931465776355431146576624189988605175259891929732507016317655984650530976168048173443438950167245619478608361175049157970111851326742552782365977460421387684737230598259483015657194376107329076625454990429534998668137411573010033710052009923142650775310294379489312556171534171488223559283185985175332417196410027122048741610016042692165669282207674747131355167179974913633602047641542649890046713635410974334848221184836421075476585814506168217699647670325211388515708227291347624600142654332272017247240043384945523972800905681647861097215714362061983828148490338569873387874733357726669332188108224828489946104917056651555163847994594185945591368279411063876895016418511017432985825754663038649066737884966282889208674221939501808101313966129138511125938076491529720682792999341134636697145756136459293656529218088367256823900260755593209957048801497645833796975053034745500290598281168364692033704284493304422815631355689357426692433442186039944179557034850598621323596887762903782103929553107858745282052037885597154938524059913802902742681435579703984418511579775206894404302651440297897885110427958791745673813585106947495129389346879793050991495754642206298049425505641647868088568978098638241216595480343955397354070692794576786139092223718488922947549332990911646568710862690843245295125447474341235471897299937583376220380986994488157016449346512927190676832277274388089559695435423191978835673697338673642503531366978651071822829296559183622118323278275713547875356115017319438561550038537323398195949395247191695611106985716765623293608032822154675340585047281277315155989411436378270109555790924514058213521267065504383151760496923162104908997026130787025357167359018061715228530210355973167033904785714856779982079227739388293714608386112144464175289135752847767378370464396954085234344149163429796888201978364586376949915409982916903451942054524392398273829530398103677122445901559403943875549117866524781119542971855441063841745924516808750837378747358100687678662149246348855138288088801619309872766025708728607521198130424145503963584338935927775417566732068828767467317077669662680961043200619379135058930288335921375403960643751555139797647281809270830604811275221182400261406256473137839010739384192402499290009627220342739526836359195401697322208549781013081264466718851860322954908450601165671659456779756729813213621619494184058523787885846028026123988768742882937560555594575382711972058675063136771607559907363473147150426072438786937801443680838000809678429661935398237704279670911327702304850361432233633878762449588995775380691751230046519525887112870087911596820425819438129628823752933484625232570811404575673486120697469433298422642918235706712683745806516963111146243583042352619458946276682671927566064412644856280974809200628570076403969102149705566234165659407896366573497351500438361942420619942340442626042843502962583972082871587354777395156158900931675553892621705766090823651992423523561977067543610850791772231446627014248480706073190780683031904427372021863648180217928606905717334324395139767598077785131512068011843007296859107657855863738316995951783526101503832838234568812936477630224116862526406481206902511209026313708255253542132975494304419894193624068882421804136403970054622890028371780866831434412547225280753151879109949869294630632823506776441053124847708188512687551830867299045244889011022873101698658557253589764536281710384140044154696351242550448902458900501159012436034893849200679230870450706164295101145874939553849033571113020685955489215042221710960985484132080888315607449968997838441183181856941426207969840045221064344285132158818835427588888625760364154210977624139072904170049364416092382046171005868764870614975861066319837401395555732726266811869692721133153485530527084537163130108111947269042314064554328656844770369609535644063901157863233885856047165043847789128124107299089495811437221203189548498465356769128685265265010781935023935240624715341541048998157346486500356086111133272220408641460912860202053049700985100455821309899816653930764806609077424691071932194756184556181" +
                        "15516353495211289597815564506193368287178714208989206470099207227171770619580227427772058576958549342547850566371060314330889132466260972915500785842700966615103949831075688522846389635990078358138687466663099265099431775674237640711466272609872329090894406587154198409486434056948991642623725868520261081714501891452704954562834244485695899485150794033902595303371632597184940525684558272222395813587950566598836575728711404672894869851301199508345442816914540274231773573695049117433232750564343477296571911336451338765122801905492189124021699698020217831160061375249740348841211772476455089061870953510480256335713228323198782026742817220321247980121667780800877801219532811542139900480803615083739957513418528009253849655053312995534574307148952727627870318872325094411860749809155407484065987101730385346571248798467212335910821152286411077915790397497756477613051365987943518909759211252763081626026136209474490841118337332773116122063152414208776801671614382203998310801791046109980464795153775904284579208046765170299376571712696359391195309011046580945099118345329164807866461624513459858969478261348365746242842254100449074846018162381649508771205692387943049083877156128753239386498305599949138477358461424273464036997642435352074743094695564535693378173888280633866732018710701060752702258884562187458492514181027419045608607139753797741693225900923436163273291784047946102859573341135995351940672974945745062320931107916232460722010886651827074516009065280667168017782964663521168472263155891094369134584611694802620433621767214124173962636180142978128638945692419270222518432363382128100260544917455244318162619360808797214154001396840051520865249909119773623276044783996235484958441702533661095335337458603732924068113476544273220040621287278168707393471504842692312354782265568742305367773635557008065688109790648713350572351799924638273829816187626279342407486758617884199669669286080608957640162096427744397522103026413782698158732581790000716751490076906346484023835702438474105176931779065689980130347837155056303467742499515965713045957954225592059807462917282749105358673064716135765849677591608061323905019687616579401117839719269327243007586938365568212311638431283680946079388989080798521721770825311237382299640977231722390040018733060008726711369177955792504805871660952275133036361448257222162174106121886956846208577175900217031085260775753651365765038925717954695019720235653672968689019573262654460436772900765775615489257834882352941349073672575670561593061387879337673233294306479935031268311515186416299622966578517978675818927585118344348361158710756313053131716293124192982037977789379782122120656399498488608931743952536041546453299501041577456229618221253519224906611827751220393777623642577532653929191439603183004880021982807536023221789599010502125687724004685177438516674638976736887749480118357141229355178588718777866510629202733751110559334924038607709059709853979249569510212755627954315025008066453716096825677236680969921750877126730256949811077056975031686370565845816981036167892330455103497165407984322792515265566483796338273488042877728447328933645773410093062365682687268013318931065552717013674172822704288279197461978805944285413220284999303849740540429893025407810120053701999064303195562726870079068213843151094378846458471168159763363401468459072474435300433314015701363633705309153196187013664717617975618648227816754951474354742056233896619815305871556180590934191775446450232435064334173434855333465262160341517250209548644211312373841441024747539900101488865742679168673356769004244781832745045012713439497231232255815861738982590755401780194874615548229070120796893835181030047378827641086164272219294123942746140207443292075817414598536256892540490923602419336928186124051416665048479530882042184097629985897052425322145715174649893481917612568426372077919256931921063600255204010662044398922537796993713110889134889921360833579323314386803074533058134342770923839546994120322442157750203621967931319597649960815556196358566683782572730174920215034531104191490057838260392829741446722127017532444082857280503217574522928285094747407153894570747792487061998260753833304433675066923630595212677695003060727653119915126939127827754432456052655283764591328484359469704894122366077507922825301623961196207923544095047285011474898262448957681893278273601046641810135121516552187096005252171171905022763076761687166299014789581539855448453229411352775826042558462563147630238335355859149814380543807473386539264830261256996173935860136236427622918234260408201158550118527706241993700526213016072648406003487895118011337828945314863348154387066988573131543747121745028364818130265528614742576976975564213718421245904443000581698214695522541683926528961160986876871840844632069685227319014872180179370554032205521013345746425253133686231659075343389374580200717637698542920298315739628019867736462368334051114029380922339886663078026309916370486909128253195100898377068612057592121356555290537815049586626181680384845905180029133497372417653664436161971980137048236053329456957495141918670077299206755740534997886723627476115663811233372206043170460623060506091246306386543951687123557178508806912199010111871"
                , 1000));
    }

    @Test
    public void test0232()
    {
        P0232MyQueue1 myQueue1 = new P0232MyQueue1();

        myQueue1.push(1); // queue is: [1]
        myQueue1.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue1.peek(); // return 1
        myQueue1.pop(); // return 1, queue is [2]
        myQueue1.empty(); // return false

        P0232MyQueue2 myQueue2 = new P0232MyQueue2();

        myQueue2.push(1); // queue is: [1]
        myQueue2.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue2.peek(); // return 1
        myQueue2.pop(); // return 1, queue is [2]
        myQueue2.empty(); // return false
    }

    @Test
    public void test0155()
    {
        P0155MinStack1 minStack1 = new P0155MinStack1();
        minStack1.push(-2);
        minStack1.push(0);
        minStack1.push(-3);
        System.out.println(minStack1.getMin());
        minStack1.pop();
        System.out.println(minStack1.top());
        System.out.println(minStack1.getMin());

        System.out.println("---------------------------------");

        P0155MinStack2 minStack2 = new P0155MinStack2();
        minStack2.push(-2);
        minStack2.push(0);
        minStack2.push(-3);
        System.out.println(minStack2.getMin());
        minStack2.pop();
        System.out.println(minStack2.top());
        System.out.println(minStack2.getMin());
    }

    @Test
    public void test1249()
    {
        P1249MinimumRemoveToMakeValidParentheses p1249 = new P1249MinimumRemoveToMakeValidParentheses();
        System.out.println(p1249.minRemoveToMakeValid_1("lee(t(c)o)de)"));
        System.out.println(p1249.minRemoveToMakeValid_2("a)b(c)d"));
        System.out.println(p1249.minRemoveToMakeValid_3("))(("));
    }

    @Test
    public void test1823()
    {
        P1823FindTheWinnerOfTheCircularGame p1823 = new P1823FindTheWinnerOfTheCircularGame();
        System.out.println(p1823.findTheWinner_queue(5, 2));
        System.out.println(p1823.findTheWinner_recursion(5, 2));
        System.out.println(p1823.findTheWinner_iteration(5, 2));
    }

    @Test
    public void test0025()
    {
        P0025ReverseNodesInKGroup p0025 = new P0025ReverseNodesInKGroup();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))));
        System.out.println(p0025.reverseKGroup_1(head, 2));
        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))));
        System.out.println(p0025.reverseKGroup_2(head, 3));
    }

    @Test
    public void test1376()
    {
        P1367LinkedListInBinaryTree p1376 = new P1367LinkedListInBinaryTree();
        ListNode head = new ListNode(1, new ListNode(4, new ListNode(2, new ListNode(9))));
        TreeNode root = new TreeNode(1,
                new TreeNode(4,
                        null,
                        new TreeNode(2,
                                new TreeNode(1),
                                null)),
                new TreeNode(4,
                        new TreeNode(2,
                                new TreeNode(6),
                                new TreeNode(8,
                                        new TreeNode(1),
                                        new TreeNode(3))),
                        null));
        System.out.println(p1376.isSubPath(head, root));
    }

    @Test
    public void testP0019()
    {
        P0019RemoveNthNodeFromEndOfList obj = new P0019RemoveNthNodeFromEndOfList();
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode node = obj.removeNthFromEnd_stack(node1, 3);
        System.out.println("node = " + node);
    }

    @Test
    public void test0373()
    {
        P0373FindKPairsWithSmallestSums p0373 = new P0373FindKPairsWithSmallestSums();
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int[] nums3 = {1, 1, 2};
        int[] nums4 = {1, 2, 3};
        int[] nums5 = {1, 2};
        int[] nums6 = {3};
        System.out.println(p0373.kSmallestPairs_1(nums1, nums2, 3));
        System.out.println(p0373.kSmallestPairs_2(nums3, nums4, 2));
        System.out.println(p0373.kSmallestPairs_2(nums5, nums6, 3));
    }

    @Test
    public void test0138()
    {
        P0138CopyListWithRandomPointer.Node node5 = new P0138CopyListWithRandomPointer.Node(1, null);
        P0138CopyListWithRandomPointer.Node node4 = new P0138CopyListWithRandomPointer.Node(10, node5);
        P0138CopyListWithRandomPointer.Node node3 = new P0138CopyListWithRandomPointer.Node(11, node4);
        P0138CopyListWithRandomPointer.Node node2 = new P0138CopyListWithRandomPointer.Node(13, node3);
        P0138CopyListWithRandomPointer.Node node1 = new P0138CopyListWithRandomPointer.Node(7, node2);
        node1.setRandom(null);
        node2.setRandom(node1);
        node3.setRandom(node5);
        node4.setRandom(node3);
        node5.setRandom(node1);
        P0138CopyListWithRandomPointer p0138 = new P0138CopyListWithRandomPointer();
        System.out.println(p0138.copyRandomList_1(node1));
        System.out.println(p0138.copyRandomList_2(node1));
    }
}
