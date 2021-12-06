package challenges.week_2.bubble_sort;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSortTests {

    @Test
    public void bubbleSortTest(){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,5,3,4,1,2);
        ArrayList<Integer> sortedList = new ArrayList<>();
        Collections.addAll(sortedList,1,2,3,4,5);
        assertEquals(sortedList, BubbleSort.sort(list));
    }

    @Test
    public void bubbleSortTest2(){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,4, 90, 52, 34, 100, 50, 71, 36, 75, 19, 5, 1, 73, 91, 15, 23, 99, 80, 84, 69, 20, 85, 45, 37, 53, 33, 97, 83, 10, 40, 30, 88, 77, 9, 29, 32, 2, 76, 17, 8, 58, 27, 86, 41, 3, 43, 68, 93, 98, 42, 89, 7, 66, 24, 38, 78, 14, 62, 55, 82, 26, 49, 94, 60, 35, 11, 74, 47, 13, 95, 87, 16, 44, 70, 56, 48, 54, 39, 12, 18, 64, 96, 46, 51, 25, 81, 61, 72, 79, 6, 22, 67, 28, 59, 65, 57, 92, 63, 21, 31);
        ArrayList<Integer> sortedList = new ArrayList<>();
        Collections.addAll(sortedList,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100);
        Long startTime = System.currentTimeMillis();
        BubbleSort.sort(list);
        Long endTime = System.currentTimeMillis();
        System.out.println("Sorting took " + (endTime - startTime) + " milliseconds for " + list.size() + " elements");
        assertEquals(sortedList, BubbleSort.sort(list));
    }

    @Test
    public void bubbleSortTest3(){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,107, 940, 179, 151, 673, 339, 85, 414, 399, 19, 101, 29, 428, 401, 957, 862, 245, 216, 563, 879, 52, 954, 500, 166, 878, 552, 359, 857, 335, 452, 404, 450, 141, 578, 566, 347, 883, 491, 98, 973, 62, 150, 718, 787, 631, 645, 530, 897, 840, 717, 597, 885, 808, 330, 621, 337, 709, 360, 888, 996, 802, 914, 828, 624, 590, 664, 754, 159, 941, 925, 152, 948, 663, 767, 554, 845, 794, 188, 989, 21, 323, 714, 873, 872, 440, 611, 449, 884, 955, 584, 243, 277, 773, 219, 173, 193, 859, 711, 478, 378, 625, 76, 686, 160, 402, 459, 781, 656, 143, 372, 605, 798, 918, 112, 240, 550, 864, 87, 916, 312, 774, 343, 247, 65, 510, 991, 517, 987, 356, 968, 464, 880, 324, 162, 391, 301, 983, 133, 628, 890, 168, 200, 601, 238, 78, 113, 685, 230, 865, 581, 326, 461, 741, 91, 190, 915, 735, 299, 18, 2, 25, 89, 833, 606, 929, 471, 953, 694, 531, 950, 411, 592, 591, 191, 83, 646, 615, 282, 608, 145, 572, 946, 821, 31, 650, 136, 623, 762, 406, 905, 525, 488, 696, 661, 813, 660, 264, 995, 7, 992, 825, 102, 50, 657, 92, 292, 586, 363, 129, 137, 913, 209, 822, 502, 945, 276, 793, 843, 370, 366, 712, 875, 549, 679, 437, 350, 373, 613, 792, 930, 974, 649, 524, 231, 707, 573, 254, 832, 93, 559, 797, 289, 632, 355, 565, 876, 724, 489, 580, 819, 680, 980, 115, 142, 184, 575, 53, 483, 205, 354, 750, 543, 971, 871, 367, 702, 528, 169, 207, 340, 903, 40, 860, 171, 183, 764, 33, 616, 217, 681, 38, 556, 155, 79, 16, 515, 760, 420, 290, 487, 791, 77, 990, 383, 675, 444, 842, 158, 501, 364, 382, 369, 486, 392, 799, 745, 756, 295, 154, 937, 473, 523, 653, 197, 462, 807, 863, 733, 100, 175, 387, 975, 97, 956, 596, 665, 917, 726, 293, 704, 215, 729, 492, 106, 589, 617, 527, 806, 779, 24, 641, 474, 189, 118, 633, 824, 431, 296, 73, 434, 278, 777, 725, 170, 84, 503, 639, 642, 567, 481, 861, 988, 804, 999, 220, 720, 654, 570, 561, 788, 670, 899, 222, 518, 644, 636, 262, 438, 695, 812, 342, 544, 847, 485, 96, 302, 34, 103, 454, 748, 815, 753, 110, 536, 593, 1000, 744, 671, 984, 667, 870, 789, 558, 258, 506, 476, 910, 734, 68, 72, 318, 47, 732, 43, 585, 723, 201, 811, 555, 855, 820, 831, 117, 770, 634, 610, 909, 666, 26, 849, 81, 705, 397, 88, 435, 691, 288, 786, 499, 783, 180, 39, 603, 147, 579, 738, 94, 785, 648, 235, 442, 199, 963, 659, 736, 676, 699, 761, 630, 456, 285, 672, 892, 114, 495, 329, 801, 374, 204, 70, 710, 396, 144, 250, 380, 683, 64, 993, 687, 30, 817, 111, 28, 926, 529, 516, 730, 362, 551, 140, 577, 560, 587, 265, 157, 206, 557, 130, 257, 317, 9, 771, 120, 331, 123, 562, 919, 778, 268, 841, 810, 341, 319, 835, 850, 357, 134, 453, 514, 164, 627, 740, 60, 998, 345, 132, 313, 867, 600, 270, 677, 311, 805, 468, 757, 126, 246, 221, 848, 651, 960, 252, 934, 796, 484, 344, 381, 32, 229, 430, 521, 446, 520, 75, 896, 3, 443, 423, 67, 119, 739, 692, 891, 249, 128, 44, 932, 564, 192, 922, 598, 682, 57, 427, 609, 8, 261, 269, 41, 286, 574, 348, 866, 768, 458, 737, 790, 472, 214, 977, 498, 203, 379, 662, 195, 721, 48, 447, 548, 981, 242, 416, 747, 816, 599, 708, 540, 755, 522, 979, 818, 297, 902, 394, 10, 765, 361, 629, 907, 74, 104, 904, 274, 465, 969, 568, 829, 393, 298, 893, 952, 772, 889, 294, 186, 795, 6, 994, 346, 234, 148, 658, 470, 698, 858, 45, 56, 582, 12, 619, 413, 226, 933, 352, 475, 46, 519, 422, 181, 316, 716, 583, 959, 482, 131, 22, 911, 814, 507, 241, 177, 314, 153, 852, 368, 122, 490, 445, 539, 303, 836, 182, 961, 868, 622, 626, 376, 469, 844, 853, 429, 964, 571, 196, 921, 713, 174, 178, 927, 419, 970, 463, 13, 287, 936, 512, 504, 823, 643, 332, 390, 901, 425, 300, 291, 11, 809, 466, 398, 854, 837, 263, 211, 479, 432, 967, 441, 731, 377, 542, 947, 86, 742, 224, 271, 800, 385, 281, 233, 886, 588, 410, 949, 448, 882, 417, 421, 272, 701, 121, 365, 533, 139, 27, 305, 412, 334, 218, 912, 509, 138, 451, 424, 306, 982, 640, 526, 253, 728, 436, 780, 697, 187, 351, 894, 259, 978, 273, 546, 275, 939, 505, 538, 321, 537, 569, 906, 232, 328, 763, 830, 99, 55, 23, 116, 82, 156, 477, 494, 202, 349, 826, 457, 944, 388, 244, 433, 71, 1, 389, 604, 943, 228, 576, 35, 42, 51, 400, 827, 985, 769, 135, 496, 635, 751, 227, 194, 395, 986, 59, 674, 176, 834, 972, 267, 752, 545, 513, 439, 958, 54, 966, 535, 678, 165, 418, 308, 965, 338, 877, 213, 838, 255, 620, 887, 304, 881, 607, 758, 49, 706, 256, 655, 167, 460, 743, 384, 898, 405, 61, 325, 161, 928, 553, 371, 237, 309, 942, 931, 727, 924, 310, 722, 652, 618, 776, 4, 307, 36, 976, 749, 403, 455, 426, 223, 782, 66, 689, 951, 703, 109, 602, 532, 266, 638, 612, 210, 185, 759, 95, 37, 108, 163, 248, 595, 766, 614, 146, 803, 212, 895, 386, 198, 668, 669, 14, 541, 962, 900, 283, 534, 90, 493, 690, 260, 358, 839, 547, 923, 407, 284, 127, 935, 336, 746, 279, 327, 719, 149, 684, 280, 408, 409, 105, 5, 938, 846, 851, 375, 125, 15, 124, 700, 508, 997, 239, 467, 647, 775, 333, 415, 856, 320, 17, 225, 715, 208, 511, 688, 251, 58, 172, 20, 637, 908, 920, 63, 480, 594, 236, 693, 69, 322, 869, 353, 315, 874, 784, 80, 497);
        ArrayList<Integer> sortedList = new ArrayList<>();
        Collections.addAll(sortedList,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, 384, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480, 481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514, 515, 516, 517, 518, 519, 520, 521, 522, 523, 524, 525, 526, 527, 528, 529, 530, 531, 532, 533, 534, 535, 536, 537, 538, 539, 540, 541, 542, 543, 544, 545, 546, 547, 548, 549, 550, 551, 552, 553, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567, 568, 569, 570, 571, 572, 573, 574, 575, 576, 577, 578, 579, 580, 581, 582, 583, 584, 585, 586, 587, 588, 589, 590, 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606, 607, 608, 609, 610, 611, 612, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 625, 626, 627, 628, 629, 630, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 657, 658, 659, 660, 661, 662, 663, 664, 665, 666, 667, 668, 669, 670, 671, 672, 673, 674, 675, 676, 677, 678, 679, 680, 681, 682, 683, 684, 685, 686, 687, 688, 689, 690, 691, 692, 693, 694, 695, 696, 697, 698, 699, 700, 701, 702, 703, 704, 705, 706, 707, 708, 709, 710, 711, 712, 713, 714, 715, 716, 717, 718, 719, 720, 721, 722, 723, 724, 725, 726, 727, 728, 729, 730, 731, 732, 733, 734, 735, 736, 737, 738, 739, 740, 741, 742, 743, 744, 745, 746, 747, 748, 749, 750, 751, 752, 753, 754, 755, 756, 757, 758, 759, 760, 761, 762, 763, 764, 765, 766, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786, 787, 788, 789, 790, 791, 792, 793, 794, 795, 796, 797, 798, 799, 800, 801, 802, 803, 804, 805, 806, 807, 808, 809, 810, 811, 812, 813, 814, 815, 816, 817, 818, 819, 820, 821, 822, 823, 824, 825, 826, 827, 828, 829, 830, 831, 832, 833, 834, 835, 836, 837, 838, 839, 840, 841, 842, 843, 844, 845, 846, 847, 848, 849, 850, 851, 852, 853, 854, 855, 856, 857, 858, 859, 860, 861, 862, 863, 864, 865, 866, 867, 868, 869, 870, 871, 872, 873, 874, 875, 876, 877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887, 888, 889, 890, 891, 892, 893, 894, 895, 896, 897, 898, 899, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935, 936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950, 951, 952, 953, 954, 955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971, 972, 973, 974, 975, 976, 977, 978, 979, 980, 981, 982, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996, 997, 998, 999, 1000);
        Long startTime = System.currentTimeMillis();
        BubbleSort.sort(list);
        Long endTime = System.currentTimeMillis();
        System.out.println("Sorting took " + (endTime - startTime) + " milliseconds for " + list.size() + " elements");
        assertEquals(sortedList, BubbleSort.sort(list));
    }

    @Test
    public void bubbleSortTest4(){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1934, 1142, 1062, 134, 1799, 1839, 151, 171, 1252, 405, 980, 433, 866, 685, 1902, 1091, 1813, 1757, 778, 1685, 1025, 1191, 959, 1906, 113, 632, 497, 446, 1450, 646, 647, 302, 1402, 414, 244, 217, 381, 1066, 1035, 58, 1452, 1674, 219, 1263, 1198, 143, 1005, 1464, 1698, 1820, 1500, 40, 1666, 101, 1804, 1480, 1244, 1296, 1090, 935, 612, 460, 650, 709, 599, 771, 934, 1791, 346, 826, 1109, 156, 1775, 682, 1922, 110, 1885, 530, 1313, 997, 689, 230, 1787, 984, 1228, 822, 225, 1381, 1527, 516, 919, 1720, 27, 840, 518, 384, 1000, 73, 587, 1, 1956, 557, 1653, 1141, 1138, 198, 153, 668, 1939, 1620, 1472, 720, 1447, 1547, 1828, 529, 905, 15, 1512, 911, 569, 1175, 284, 1777, 704, 29, 1375, 1438, 1419, 1196, 1371, 1259, 936, 136, 70, 1557, 836, 565, 455, 1420, 695, 1647, 351, 1095, 1519, 1811, 1814, 408, 1599, 662, 1907, 318, 926, 687, 332, 1076, 1061, 114, 451, 423, 1469, 1214, 281, 213, 528, 657, 1064, 1430, 481, 1598, 297, 1298, 1340, 329, 828, 353, 1233, 867, 1125, 754, 1976, 211, 607, 913, 1421, 1229, 1495, 1322, 1558, 357, 1844, 1741, 858, 1634, 1269, 1363, 1183, 1762, 426, 1981, 563, 680, 1617, 1418, 1601, 289, 916, 38, 942, 1607, 1497, 431, 1351, 1538, 1105, 648, 76, 1009, 863, 690, 1146, 741, 188, 1177, 989, 1014, 1897, 870, 99, 1975, 1872, 449, 1961, 1399, 844, 83, 205, 258, 681, 1455, 1474, 1260, 962, 904, 1325, 952, 735, 1305, 784, 144, 1283, 1959, 1433, 1104, 547, 666, 119, 981, 430, 1600, 1583, 515, 168, 1518, 23, 1085, 1084, 166, 1613, 1765, 382, 517, 363, 1769, 1873, 7, 774, 269, 1662, 1413, 1236, 1597, 1847, 1387, 724, 454, 1947, 1763, 176, 554, 1710, 1950, 1086, 722, 1272, 1510, 1912, 1896, 1211, 1425, 250, 277, 91, 864, 391, 458, 1800, 146, 1556, 600, 2000, 804, 1955, 746, 1624, 1395, 927, 1507, 1434, 499, 324, 887, 255, 380, 1568, 1670, 860, 906, 1655, 1416, 986, 678, 1423, 1915, 1895, 71, 604, 1435, 581, 549, 1567, 538, 421, 933, 845, 1152, 1049, 807, 157, 713, 483, 1176, 1654, 1938, 373, 1251, 1918, 1701, 1691, 524, 921, 180, 19, 1659, 677, 854, 502, 1234, 829, 467, 1170, 894, 566, 1384, 591, 1770, 1477, 24, 1533, 1184, 44, 77, 939, 1745, 92, 276, 793, 1179, 1853, 885, 718, 1997, 471, 1550, 1300, 150, 251, 1946, 1628, 452, 1270, 1834, 1070, 839, 1712, 126, 702, 869, 141, 356, 849, 1511, 1127, 245, 192, 221, 1630, 1154, 194, 1265, 520, 510, 1802, 1855, 1498, 366, 726, 1672, 1156, 148, 1843, 1748, 605, 462, 559, 638, 1563, 1274, 1262, 1440, 129, 1499, 507, 61, 1166, 848, 1876, 1883, 63, 203, 915, 1905, 1572, 1841, 1459, 1721, 78, 1044, 1424, 683, 1892, 1275, 506, 487, 390, 1937, 494, 750, 54, 149, 1522, 512, 1444, 1372, 241, 1611, 1331, 891, 553, 1243, 1925, 1878, 615, 1740, 1328, 1279, 1842, 1032, 389, 1875, 1982, 1254, 1231, 1735, 1868, 616, 617, 488, 28, 1453, 1991, 1136, 534, 1393, 392, 1123, 337, 342, 714, 1736, 652, 768, 1772, 659, 759, 1515, 670, 259, 1723, 627, 1936, 914, 1963, 235, 1153, 846, 1312, 1998, 1273, 1355, 152, 412, 1529, 890, 589, 786, 1668, 5, 492, 1124, 1810, 801, 1863, 1358, 228, 456, 1640, 1576, 988, 1589, 573, 884, 310, 184, 590, 1931, 694, 1851, 1315, 1093, 1536, 733, 330, 1139, 478, 1553, 1281, 1575, 1268, 979, 1693, 788, 1397, 1886, 1692, 69, 1758, 1411, 1995, 427, 998, 1667, 1900, 1704, 1911, 130, 1465, 473, 448, 1303, 169, 1178, 1496, 1199, 1160, 1335, 1695, 288, 1867, 1406, 1365, 167, 121, 910, 787, 1020, 1396, 212, 326, 163, 42, 1827, 17, 1445, 1299, 1203, 1451, 674, 224, 1537, 812, 84, 1226, 1870, 1405, 275, 1733, 1163, 1890, 922, 320, 1823, 1893, 1060, 196, 1747, 635, 97, 1578, 653, 1380, 1966, 1645, 872, 609, 1908, 596, 60, 818, 1756, 206, 214, 1717, 743, 1801, 633, 749, 993, 630, 1632, 830, 675, 1277, 1506, 1517, 874, 1249, 1019, 1492, 154, 1347, 899, 737, 383, 1112, 1374, 1326, 636, 1639, 8, 47, 883, 975, 1245, 1699, 813, 1864, 1544, 1541, 983, 257, 1403, 1412, 287, 485, 95, 1332, 1317, 1669, 1462, 728, 89, 1316, 425, 782, 696, 334, 1826, 1561, 531, 852, 26, 856, 343, 1485, 655, 1158, 742, 291, 1722, 955, 1869, 1849, 1264, 623, 1652, 626, 336, 1987, 621, 901, 969, 1829, 98, 1212, 1222, 535, 1862, 39, 411, 1150, 1856, 1054, 1746, 996, 379, 1367, 740, 1945, 1301, 1985, 1715, 377, 1221, 1295, 1952, 388, 1979, 1615, 25, 505, 1774, 465, 322, 1215, 725, 789, 1333, 1521, 1792, 1657, 1037, 1047, 474, 703, 1227, 1651, 1080, 1899, 597, 770, 1539, 857, 923, 200, 300, 1015, 239, 1180, 237, 1101, 1587, 1888, 1580, 1309, 634, 751, 861, 562, 752, 1415, 1219, 1391, 1891, 1592, 873, 234, 1549, 1570, 1815, 1562, 561, 399, 598, 1027, 1830, 1707, 1310, 1414, 777, 378, 974, 1209, 204, 1018, 1605, 1107, 1280, 1289, 323, 1789, 396, 669, 1343, 359, 1354, 1877, 1407, 823, 445, 1816, 1188, 344, 1709, 1266, 295, 1910, 1287, 711, 301, 103, 806, 990, 1115, 1949, 719, 298, 727, 748, 814, 1087, 444, 1432, 1671, 105, 190, 1524, 135, 1582, 882, 810, 1673, 438, 1784, 1378, 16, 174, 1110, 500, 1096, 1687, 370, 1024, 676, 1964, 1382, 335, 450, 1969, 1986, 142, 1457, 791, 1535, 832, 1923, 294, 1753, 775, 1705, 1192, 493, 14, 486, 1874, 802, 1641, 340, 386, 1033, 1861, 995, 1323, 811, 920, 1078, 1320, 625, 1140, 618, 1958, 642, 183, 1376, 1026, 1398, 437, 1795, 1588, 931, 1143, 1023, 265, 385, 593, 1364, 1267, 1481, 1449, 564, 1428, 1648, 1282, 831, 364, 1571, 56, 576, 67, 1505, 1944, 1206, 881, 738, 1642, 699, 1446, 1690, 68, 943, 945, 1186, 1972, 12, 1852, 1488, 1526, 11, 865, 46, 992, 671, 1429, 398, 177, 132, 223, 1290, 1473, 1595, 459, 1887, 1569, 51, 1292, 1119, 293, 508, 1294, 2, 542, 558, 1189, 918, 1714, 1319, 651, 374, 147, 1436, 1681, 1439, 1665, 65, 948, 708, 893, 1818, 772, 819, 764, 94, 835, 1591, 1643, 1103, 815, 545, 124, 1509, 280, 1224, 1837, 745, 877, 1716, 572, 1978, 96, 1042, 803, 1514, 424, 568, 701, 395, 1074, 1854, 339, 1919, 238, 501, 693, 1308, 888, 1108, 1359, 64, 658, 649, 1036, 654, 732, 673, 436, 159, 560, 1431, 1307, 367, 31, 1649, 240, 1201, 1822, 1542, 688, 1817, 710, 309, 697, 1173, 602, 879, 1258, 1848, 902, 1116, 266, 767, 1941, 30, 1882, 355, 232, 272, 580, 1788, 783, 220, 513, 479, 1555, 1809, 578, 691, 956, 667, 1182, 723, 115, 1525, 106, 608, 1288, 1700, 1083, 1812, 937, 1478, 1346, 898, 282, 195, 712, 1531, 892, 1646, 210, 940, 93, 21, 574, 1761, 1120, 1475, 1865, 1271, 1417, 504, 229, 1806, 1460, 776, 809, 1349, 601, 1880, 1336, 780, 1971, 1682, 1831, 1627, 1204, 116, 122, 1764, 1954, 953, 862, 1238, 1610, 1884, 1390, 1149, 34, 1239, 185, 1638, 641, 765, 325, 766, 1953, 924, 1050, 1255, 1913, 731, 1426, 1782, 544, 842, 74, 753, 470, 1794, 773, 52, 686, 155, 394, 1028, 55, 624, 665, 672, 1783, 402, 1894, 1581, 191, 267, 33, 577, 345, 365, 286, 556, 1046, 1560, 1207, 1917, 1859, 314, 109, 619, 59, 1663, 215, 1489, 816, 1055, 799, 586, 447, 1989, 1696, 140, 231, 397, 1099, 876, 1278, 1285, 779, 1633, 1250, 1660, 1752, 262, 1471, 1167, 1559, 1324, 348, 338, 1241, 972, 1929, 1725, 1168, 958, 1386, 1824, 133, 18, 1330, 1585, 805, 316, 987, 1118, 1540, 1545, 1860, 82, 1098, 1751, 982, 1442, 896, 1151, 1920, 1022, 270, 1680, 1771, 181, 539, 87, 1594, 660, 794, 10, 3, 1579, 1622, 640, 664, 1171, 1003, 243, 781, 1059, 248, 1181, 13, 107, 1551, 1833, 951, 837, 1921, 4, 1132, 1256, 729, 679, 1443, 1205, 967, 1161, 440, 415, 1242, 533, 442, 628, 401, 1216, 645, 118, 1373, 1999, 762, 409, 1857, 495, 1040, 1836, 1388, 1344, 41, 1200, 1360, 1065, 477, 1960, 706, 1988, 1342, 1400, 1058, 1706, 1013, 1218, 1410, 930, 489, 610, 1051, 855, 1760, 584, 1240, 1487, 1232, 1785, 1718, 131, 1011, 1626, 306, 49, 1369, 991, 1504, 1190, 303, 1210, 1366, 1394, 567, 468, 1008, 1951, 756, 976, 889, 62, 978, 1635, 1404, 189, 1612, 1194, 256, 548, 525, 1491, 1636, 761, 1678, 88, 1048, 1779, 1006, 1100, 279, 333, 1835, 1339, 1689, 161, 614, 1297, 441, 973, 1846, 1253, 1786, 886, 1479, 570, 1135, 736, 631, 472, 1743, 1532, 1456, 1041, 66, 1476, 1220, 968, 1117, 1845, 1943, 1637, 410, 80, 1766, 1016, 1114, 1401, 1377, 1010, 1881, 137, 1361, 944, 111, 1798, 1466, 1501, 1586, 1185, 1081, 1284, 1482, 1053, 613, 961, 1933, 139, 546, 594, 550, 798, 1102, 1574, 1486, 1021, 1840, 1726, 403, 1131, 1437, 721, 1724, 1341, 949, 1858, 1780, 162, 705, 1291, 1889, 827, 606, 747, 1596, 1590, 755, 1187, 361, 950, 1790, 45, 32, 263, 1461, 249, 1614, 897, 1552, 1223, 178, 1879, 327, 1030, 1767, 1043, 541, 170, 72, 700, 847, 1719, 358, 1470, 1916, 253, 283, 707, 1974, 1012, 1217, 1165, 1821, 1311, 1072, 509, 86, 85, 1068, 1329, 75, 209, 1566, 434, 35, 1644, 466, 1602, 698, 1983, 1619, 964, 661, 299, 834, 1334, 1508, 620, 480, 1759, 1513, 1629, 304, 418, 371, 227, 603, 734, 1616, 6, 532, 825, 81, 400, 413, 1126, 175, 261, 1034, 242, 1546, 1128, 843, 1067, 1744, 79, 1202, 36, 43, 1129, 1609, 824, 637, 311, 1778, 1781, 1729, 1306, 575, 511, 769, 457, 296, 1502, 966, 1679, 247, 1711, 1932, 1002, 1825, 1148, 1318, 1755, 850, 187, 1145, 957, 1838, 469, 1803, 236, 475, 1193, 1996, 543, 254, 1483, 1097, 1593, 1356, 796, 127, 859, 226, 871, 1688, 393, 463, 1276, 523, 1052, 1926, 387, 305, 319, 1797, 1345, 104, 1155, 484, 522, 264, 1071, 1631, 611, 1133, 274, 1684, 579, 1968, 1144, 1383, 970, 252, 1871, 583, 1606, 1554, 165, 795, 730, 622, 1676, 1001, 977, 960, 1793, 519, 880, 354, 1677, 1650, 744, 1352, 1357, 1904, 1520, 1658, 1137, 1338, 328, 1159, 173, 417, 1749, 1007, 1353, 50, 833, 347, 1618, 1903, 435, 820, 1408, 1738, 1045, 1702, 592, 763, 582, 1901, 1286, 1739, 158, 53, 1088, 1927, 186, 1962, 1994, 1484, 1441, 851, 1948, 179, 817, 908, 1573, 57, 1750, 193, 419, 1122, 1608, 540, 1467, 1980, 536, 1683, 1079, 341, 841, 1796, 895, 1805, 1694, 1248, 182, 1773, 246, 1157, 1208, 800, 1147, 947, 285, 1528, 760, 555, 963, 853, 1348, 1661, 1257, 1737, 527, 758, 907, 317, 1162, 290, 128, 1728, 716, 273, 1516, 1197, 1458, 785, 1970, 909, 1029, 1957, 1992, 1075, 1928, 954, 644, 1914, 1548, 537, 1230, 1832, 808, 1732, 1623, 503, 526, 496, 360, 941, 1427, 321, 1731, 938, 202, 1584, 172, 1448, 312, 22, 1314, 797, 368, 498, 1924, 1039, 1379, 1063, 406, 278, 120, 875, 1038, 692, 1293, 588, 1327, 20, 123, 207, 1261, 407, 912, 656, 878, 112, 1468, 1965, 1664, 1121, 1742, 100, 663, 1130, 903, 376, 1494, 1056, 757, 350, 1302, 1977, 1534, 1503, 1604, 1237, 790, 1392, 1621, 838, 349, 1730, 1385, 552, 375, 108, 629, 1247, 917, 1754, 1073, 90, 1106, 1967, 199, 1089, 1370, 48, 868, 792, 1603, 352, 643, 946, 1727, 491, 1850, 208, 160, 1993, 999, 9, 1675, 1808, 715, 1069, 1350, 1077, 929, 1493, 1909, 1565, 420, 1174, 422, 1990, 1564, 1134, 1057, 271, 1713, 1697, 994, 1768, 965, 1930, 1656, 1111, 1213, 1031, 1490, 585, 1337, 1940, 684, 1094, 1321, 416, 372, 429, 1113, 595, 117, 521, 1686, 1984, 432, 985, 1807, 1898, 260, 1169, 1776, 331, 1172, 439, 1389, 1463, 1304, 490, 1409, 739, 292, 1577, 821, 1454, 1708, 482, 1362, 900, 315, 932, 1866, 1935, 308, 37, 102, 1530, 216, 1703, 201, 369, 1017, 125, 639, 1819, 1235, 145, 1225, 464, 928, 404, 571, 551, 138, 1368, 1625, 1543, 925, 461, 717, 1523, 1092, 197, 268, 1973, 233, 164, 453, 1942, 218, 362, 428, 1164, 1246, 222, 443, 1422, 313, 1195, 1082, 476, 307, 514, 971, 1004, 1734);
        ArrayList<Integer> sortedList = new ArrayList<>();
        Collections.addAll(sortedList,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, 384, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480, 481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514, 515, 516, 517, 518, 519, 520, 521, 522, 523, 524, 525, 526, 527, 528, 529, 530, 531, 532, 533, 534, 535, 536, 537, 538, 539, 540, 541, 542, 543, 544, 545, 546, 547, 548, 549, 550, 551, 552, 553, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567, 568, 569, 570, 571, 572, 573, 574, 575, 576, 577, 578, 579, 580, 581, 582, 583, 584, 585, 586, 587, 588, 589, 590, 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606, 607, 608, 609, 610, 611, 612, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 625, 626, 627, 628, 629, 630, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 657, 658, 659, 660, 661, 662, 663, 664, 665, 666, 667, 668, 669, 670, 671, 672, 673, 674, 675, 676, 677, 678, 679, 680, 681, 682, 683, 684, 685, 686, 687, 688, 689, 690, 691, 692, 693, 694, 695, 696, 697, 698, 699, 700, 701, 702, 703, 704, 705, 706, 707, 708, 709, 710, 711, 712, 713, 714, 715, 716, 717, 718, 719, 720, 721, 722, 723, 724, 725, 726, 727, 728, 729, 730, 731, 732, 733, 734, 735, 736, 737, 738, 739, 740, 741, 742, 743, 744, 745, 746, 747, 748, 749, 750, 751, 752, 753, 754, 755, 756, 757, 758, 759, 760, 761, 762, 763, 764, 765, 766, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786, 787, 788, 789, 790, 791, 792, 793, 794, 795, 796, 797, 798, 799, 800, 801, 802, 803, 804, 805, 806, 807, 808, 809, 810, 811, 812, 813, 814, 815, 816, 817, 818, 819, 820, 821, 822, 823, 824, 825, 826, 827, 828, 829, 830, 831, 832, 833, 834, 835, 836, 837, 838, 839, 840, 841, 842, 843, 844, 845, 846, 847, 848, 849, 850, 851, 852, 853, 854, 855, 856, 857, 858, 859, 860, 861, 862, 863, 864, 865, 866, 867, 868, 869, 870, 871, 872, 873, 874, 875, 876, 877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887, 888, 889, 890, 891, 892, 893, 894, 895, 896, 897, 898, 899, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935, 936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950, 951, 952, 953, 954, 955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971, 972, 973, 974, 975, 976, 977, 978, 979, 980, 981, 982, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996, 997, 998, 999, 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018, 1019, 1020, 1021, 1022, 1023, 1024, 1025, 1026, 1027, 1028, 1029, 1030, 1031, 1032, 1033, 1034, 1035, 1036, 1037, 1038, 1039, 1040, 1041, 1042, 1043, 1044, 1045, 1046, 1047, 1048, 1049, 1050, 1051, 1052, 1053, 1054, 1055, 1056, 1057, 1058, 1059, 1060, 1061, 1062, 1063, 1064, 1065, 1066, 1067, 1068, 1069, 1070, 1071, 1072, 1073, 1074, 1075, 1076, 1077, 1078, 1079, 1080, 1081, 1082, 1083, 1084, 1085, 1086, 1087, 1088, 1089, 1090, 1091, 1092, 1093, 1094, 1095, 1096, 1097, 1098, 1099, 1100, 1101, 1102, 1103, 1104, 1105, 1106, 1107, 1108, 1109, 1110, 1111, 1112, 1113, 1114, 1115, 1116, 1117, 1118, 1119, 1120, 1121, 1122, 1123, 1124, 1125, 1126, 1127, 1128, 1129, 1130, 1131, 1132, 1133, 1134, 1135, 1136, 1137, 1138, 1139, 1140, 1141, 1142, 1143, 1144, 1145, 1146, 1147, 1148, 1149, 1150, 1151, 1152, 1153, 1154, 1155, 1156, 1157, 1158, 1159, 1160, 1161, 1162, 1163, 1164, 1165, 1166, 1167, 1168, 1169, 1170, 1171, 1172, 1173, 1174, 1175, 1176, 1177, 1178, 1179, 1180, 1181, 1182, 1183, 1184, 1185, 1186, 1187, 1188, 1189, 1190, 1191, 1192, 1193, 1194, 1195, 1196, 1197, 1198, 1199, 1200, 1201, 1202, 1203, 1204, 1205, 1206, 1207, 1208, 1209, 1210, 1211, 1212, 1213, 1214, 1215, 1216, 1217, 1218, 1219, 1220, 1221, 1222, 1223, 1224, 1225, 1226, 1227, 1228, 1229, 1230, 1231, 1232, 1233, 1234, 1235, 1236, 1237, 1238, 1239, 1240, 1241, 1242, 1243, 1244, 1245, 1246, 1247, 1248, 1249, 1250, 1251, 1252, 1253, 1254, 1255, 1256, 1257, 1258, 1259, 1260, 1261, 1262, 1263, 1264, 1265, 1266, 1267, 1268, 1269, 1270, 1271, 1272, 1273, 1274, 1275, 1276, 1277, 1278, 1279, 1280, 1281, 1282, 1283, 1284, 1285, 1286, 1287, 1288, 1289, 1290, 1291, 1292, 1293, 1294, 1295, 1296, 1297, 1298, 1299, 1300, 1301, 1302, 1303, 1304, 1305, 1306, 1307, 1308, 1309, 1310, 1311, 1312, 1313, 1314, 1315, 1316, 1317, 1318, 1319, 1320, 1321, 1322, 1323, 1324, 1325, 1326, 1327, 1328, 1329, 1330, 1331, 1332, 1333, 1334, 1335, 1336, 1337, 1338, 1339, 1340, 1341, 1342, 1343, 1344, 1345, 1346, 1347, 1348, 1349, 1350, 1351, 1352, 1353, 1354, 1355, 1356, 1357, 1358, 1359, 1360, 1361, 1362, 1363, 1364, 1365, 1366, 1367, 1368, 1369, 1370, 1371, 1372, 1373, 1374, 1375, 1376, 1377, 1378, 1379, 1380, 1381, 1382, 1383, 1384, 1385, 1386, 1387, 1388, 1389, 1390, 1391, 1392, 1393, 1394, 1395, 1396, 1397, 1398, 1399, 1400, 1401, 1402, 1403, 1404, 1405, 1406, 1407, 1408, 1409, 1410, 1411, 1412, 1413, 1414, 1415, 1416, 1417, 1418, 1419, 1420, 1421, 1422, 1423, 1424, 1425, 1426, 1427, 1428, 1429, 1430, 1431, 1432, 1433, 1434, 1435, 1436, 1437, 1438, 1439, 1440, 1441, 1442, 1443, 1444, 1445, 1446, 1447, 1448, 1449, 1450, 1451, 1452, 1453, 1454, 1455, 1456, 1457, 1458, 1459, 1460, 1461, 1462, 1463, 1464, 1465, 1466, 1467, 1468, 1469, 1470, 1471, 1472, 1473, 1474, 1475, 1476, 1477, 1478, 1479, 1480, 1481, 1482, 1483, 1484, 1485, 1486, 1487, 1488, 1489, 1490, 1491, 1492, 1493, 1494, 1495, 1496, 1497, 1498, 1499, 1500, 1501, 1502, 1503, 1504, 1505, 1506, 1507, 1508, 1509, 1510, 1511, 1512, 1513, 1514, 1515, 1516, 1517, 1518, 1519, 1520, 1521, 1522, 1523, 1524, 1525, 1526, 1527, 1528, 1529, 1530, 1531, 1532, 1533, 1534, 1535, 1536, 1537, 1538, 1539, 1540, 1541, 1542, 1543, 1544, 1545, 1546, 1547, 1548, 1549, 1550, 1551, 1552, 1553, 1554, 1555, 1556, 1557, 1558, 1559, 1560, 1561, 1562, 1563, 1564, 1565, 1566, 1567, 1568, 1569, 1570, 1571, 1572, 1573, 1574, 1575, 1576, 1577, 1578, 1579, 1580, 1581, 1582, 1583, 1584, 1585, 1586, 1587, 1588, 1589, 1590, 1591, 1592, 1593, 1594, 1595, 1596, 1597, 1598, 1599, 1600, 1601, 1602, 1603, 1604, 1605, 1606, 1607, 1608, 1609, 1610, 1611, 1612, 1613, 1614, 1615, 1616, 1617, 1618, 1619, 1620, 1621, 1622, 1623, 1624, 1625, 1626, 1627, 1628, 1629, 1630, 1631, 1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641, 1642, 1643, 1644, 1645, 1646, 1647, 1648, 1649, 1650, 1651, 1652, 1653, 1654, 1655, 1656, 1657, 1658, 1659, 1660, 1661, 1662, 1663, 1664, 1665, 1666, 1667, 1668, 1669, 1670, 1671, 1672, 1673, 1674, 1675, 1676, 1677, 1678, 1679, 1680, 1681, 1682, 1683, 1684, 1685, 1686, 1687, 1688, 1689, 1690, 1691, 1692, 1693, 1694, 1695, 1696, 1697, 1698, 1699, 1700, 1701, 1702, 1703, 1704, 1705, 1706, 1707, 1708, 1709, 1710, 1711, 1712, 1713, 1714, 1715, 1716, 1717, 1718, 1719, 1720, 1721, 1722, 1723, 1724, 1725, 1726, 1727, 1728, 1729, 1730, 1731, 1732, 1733, 1734, 1735, 1736, 1737, 1738, 1739, 1740, 1741, 1742, 1743, 1744, 1745, 1746, 1747, 1748, 1749, 1750, 1751, 1752, 1753, 1754, 1755, 1756, 1757, 1758, 1759, 1760, 1761, 1762, 1763, 1764, 1765, 1766, 1767, 1768, 1769, 1770, 1771, 1772, 1773, 1774, 1775, 1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785, 1786, 1787, 1788, 1789, 1790, 1791, 1792, 1793, 1794, 1795, 1796, 1797, 1798, 1799, 1800, 1801, 1802, 1803, 1804, 1805, 1806, 1807, 1808, 1809, 1810, 1811, 1812, 1813, 1814, 1815, 1816, 1817, 1818, 1819, 1820, 1821, 1822, 1823, 1824, 1825, 1826, 1827, 1828, 1829, 1830, 1831, 1832, 1833, 1834, 1835, 1836, 1837, 1838, 1839, 1840, 1841, 1842, 1843, 1844, 1845, 1846, 1847, 1848, 1849, 1850, 1851, 1852, 1853, 1854, 1855, 1856, 1857, 1858, 1859, 1860, 1861, 1862, 1863, 1864, 1865, 1866, 1867, 1868, 1869, 1870, 1871, 1872, 1873, 1874, 1875, 1876, 1877, 1878, 1879, 1880, 1881, 1882, 1883, 1884, 1885, 1886, 1887, 1888, 1889, 1890, 1891, 1892, 1893, 1894, 1895, 1896, 1897, 1898, 1899, 1900, 1901, 1902, 1903, 1904, 1905, 1906, 1907, 1908, 1909, 1910, 1911, 1912, 1913, 1914, 1915, 1916, 1917, 1918, 1919, 1920, 1921, 1922, 1923, 1924, 1925, 1926, 1927, 1928, 1929, 1930, 1931, 1932, 1933, 1934, 1935, 1936, 1937, 1938, 1939, 1940, 1941, 1942, 1943, 1944, 1945, 1946, 1947, 1948, 1949, 1950, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1961, 1962, 1963, 1964, 1965, 1966, 1967, 1968, 1969, 1970, 1971, 1972, 1973, 1974, 1975, 1976, 1977, 1978, 1979, 1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000);
        Long startTime = System.currentTimeMillis();
        BubbleSort.sort(list);
        Long endTime = System.currentTimeMillis();
        System.out.println("Sorting took " + (endTime - startTime) + " milliseconds for " + list.size() + " elements");
        assertEquals(sortedList, BubbleSort.sort(list));
    }

}