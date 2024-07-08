module Program_25 () where 

main = print $ show v_b
data B_B a b = C_D | C_E B_A ((B_A,B_A)) | C_F B_A | C_G
data B_A = C_A Int B_A | C_B B_A B_A | C_C B_A B_A

v_a :: B_B Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B (C_A _ _) (C_B _ _),C_C (C_A _ _) (C_C _ _))) -> 0 
  C_E (C_C (C_A _ _) _) ((C_B (C_A _ _) (C_B _ _),C_B (C_C _ _) (C_C _ _))) -> 1 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_C (C_C _ _) _,C_A _ (C_C _ _))) -> 2 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_A _ (C_B _ _),C_C (C_B _ _) (C_C _ _))) -> 3 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_B _ (C_C _ _),C_C (C_A _ _) (C_A _ _))) -> 4 
  C_E (C_A _ _) ((C_B _ _,C_A _ (C_A _ _))) -> 5 
  C_E (C_C _ (C_A _ _)) ((C_A _ (C_C _ _),C_C (C_A _ _) (C_A _ _))) -> 6 
  C_E (C_B _ (C_C _ _)) ((C_A _ (C_C _ _),C_C (C_C _ _) _)) -> 7 
  C_E _ ((C_C (C_A _ _) _,C_C _ (C_B _ _))) -> 8 
  C_E (C_C (C_C _ _) _) ((C_C _ (C_A _ _),C_A _ (C_C _ _))) -> 9 
  C_E (C_A _ (C_B _ _)) ((C_B (C_A _ _) (C_A _ _),C_C _ (C_C _ _))) -> 10 
  C_E (C_B _ (C_C _ _)) ((C_B _ (C_C _ _),C_C (C_C _ _) (C_C _ _))) -> 11 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_B (C_A _ _) (C_A _ _),C_A _ _)) -> 12 
  C_E (C_C _ (C_A _ _)) ((C_C (C_A _ _) (C_B _ _),C_B _ _)) -> 13 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_B (C_A _ _) (C_C _ _),C_B (C_C _ _) (C_C _ _))) -> 14 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_B (C_C _ _) _,C_C _ (C_C _ _))) -> 15 
  C_E (C_C (C_C _ _) _) ((C_A _ (C_C _ _),C_B _ (C_A _ _))) -> 16 
  C_E (C_C _ (C_A _ _)) ((C_C _ (C_C _ _),C_C (C_A _ _) (C_B _ _))) -> 17 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_B (C_A _ _) (C_B _ _),C_A _ _)) -> 18 
  C_E (C_A _ _) ((C_B (C_C _ _) (C_B _ _),C_C (C_B _ _) (C_A _ _))) -> 19 
  C_E (C_B _ (C_C _ _)) ((C_B (C_B _ _) (C_A _ _),C_B (C_A _ _) (C_A _ _))) -> 20 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_C (C_B _ _) (C_A _ _),C_B _ (C_C _ _))) -> 21 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_C (C_A _ _) (C_A _ _),C_C _ (C_B _ _))) -> 22 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C _ _,C_C (C_B _ _) (C_B _ _))) -> 23 
  C_E (C_C (C_C _ _) _) ((C_C (C_C _ _) (C_A _ _),C_A _ _)) -> 24 
  C_E (C_B _ (C_C _ _)) ((C_C (C_A _ _) (C_C _ _),C_B (C_A _ _) (C_A _ _))) -> 25 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_B _ (C_A _ _),C_C _ (C_C _ _))) -> 26 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B (C_B _ _) _,C_B _ _)) -> 27 
  C_E (C_B _ (C_B _ _)) ((C_A _ (C_A _ _),C_A _ (C_C _ _))) -> 28 
  C_E (C_B (C_B _ _) _) ((C_C (C_C _ _) (C_C _ _),C_B _ (C_B _ _))) -> 29 
  C_E (C_C _ (C_B _ _)) ((C_C (C_C _ _) (C_B _ _),C_B (C_A _ _) (C_A _ _))) -> 30 
  C_E (C_C _ (C_C _ _)) ((C_B (C_B _ _) (C_B _ _),C_C (C_A _ _) (C_A _ _))) -> 31 
  C_E _ ((C_A _ (C_B _ _),C_C (C_B _ _) _)) -> 32 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_C _ (C_C _ _),C_C _ _)) -> 33 
  C_E (C_A _ (C_C _ _)) ((C_C (C_B _ _) (C_A _ _),C_A _ _)) -> 34 
  C_E (C_B _ (C_B _ _)) ((C_B (C_A _ _) (C_B _ _),C_C (C_A _ _) _)) -> 35 
  C_E (C_A _ (C_C _ _)) ((C_B (C_C _ _) (C_C _ _),C_B (C_B _ _) (C_A _ _))) -> 36 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_B (C_B _ _) _,C_B (C_B _ _) (C_B _ _))) -> 37 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_C (C_C _ _) (C_A _ _),C_B (C_A _ _) _)) -> 38 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_C (C_B _ _) (C_A _ _),C_B (C_A _ _) (C_B _ _))) -> 39 
  C_E (C_C (C_A _ _) _) ((C_B _ (C_A _ _),C_C (C_B _ _) (C_A _ _))) -> 40 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_B _ (C_C _ _),C_C (C_B _ _) (C_C _ _))) -> 41 
  C_E (C_C (C_C _ _) _) ((C_B (C_C _ _) (C_C _ _),C_B _ (C_B _ _))) -> 42 
  C_E (C_B (C_A _ _) _) ((C_C (C_A _ _) (C_B _ _),C_B (C_A _ _) (C_C _ _))) -> 43 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B _ (C_A _ _),C_C (C_C _ _) (C_C _ _))) -> 44 
  C_E (C_C _ (C_A _ _)) ((C_C (C_B _ _) (C_A _ _),C_C (C_C _ _) (C_A _ _))) -> 45 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_C (C_A _ _) (C_A _ _),C_B (C_B _ _) (C_B _ _))) -> 46 
  C_E _ ((C_B (C_A _ _) (C_B _ _),C_B _ _)) -> 47 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B _ _,C_B (C_A _ _) (C_B _ _))) -> 48 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_A _ (C_A _ _),C_C (C_A _ _) (C_C _ _))) -> 49 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_B (C_B _ _) (C_B _ _),C_B (C_C _ _) (C_A _ _))) -> 50 
  C_E (C_C (C_C _ _) _) ((C_B _ _,C_B _ (C_B _ _))) -> 51 
  C_E (C_C (C_C _ _) _) ((C_C (C_C _ _) (C_C _ _),C_A _ (C_B _ _))) -> 52 
  C_E _ ((C_C (C_C _ _) (C_A _ _),C_B (C_A _ _) (C_A _ _))) -> 53 
  C_E (C_B _ (C_B _ _)) ((C_A _ (C_B _ _),C_C _ (C_A _ _))) -> 54 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_C (C_B _ _) (C_A _ _),C_C (C_C _ _) (C_C _ _))) -> 55 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_C (C_B _ _) (C_C _ _),C_C _ _)) -> 56 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_C (C_B _ _) _,C_C (C_C _ _) (C_B _ _))) -> 57 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_B (C_A _ _) _,C_B _ (C_A _ _))) -> 58 
  C_E (C_C (C_C _ _) _) ((C_A _ (C_C _ _),C_B (C_C _ _) _)) -> 59 
  C_E (C_C (C_A _ _) _) ((C_B (C_A _ _) (C_C _ _),C_B (C_B _ _) (C_A _ _))) -> 60 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_C (C_A _ _) _,C_B _ (C_C _ _))) -> 61 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_C (C_A _ _) (C_C _ _),C_A _ _)) -> 62 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_C _ _,C_B (C_C _ _) (C_C _ _))) -> 63 
  C_E (C_C _ (C_A _ _)) ((C_B (C_A _ _) _,C_C (C_C _ _) (C_B _ _))) -> 64 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_C _ (C_C _ _),C_B _ _)) -> 65 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_C (C_A _ _) (C_C _ _),C_B (C_A _ _) _)) -> 66 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_C _ (C_A _ _),C_A _ (C_B _ _))) -> 67 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B _ (C_C _ _),C_B _ (C_B _ _))) -> 68 
  C_E (C_B (C_A _ _) _) ((C_C _ (C_B _ _),C_C (C_B _ _) (C_C _ _))) -> 69 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_B (C_B _ _) (C_C _ _),C_B _ (C_A _ _))) -> 70 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B (C_A _ _) _,C_B (C_B _ _) (C_A _ _))) -> 71 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C (C_A _ _) (C_A _ _),C_B (C_B _ _) _)) -> 72 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_B (C_B _ _) (C_A _ _),C_A _ _)) -> 73 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_B _ (C_A _ _),C_C (C_C _ _) _)) -> 74 
  C_E (C_C _ (C_A _ _)) ((C_B (C_A _ _) (C_B _ _),C_C _ (C_C _ _))) -> 75 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_C _ (C_B _ _),C_C (C_B _ _) (C_C _ _))) -> 76 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_B _ (C_C _ _),C_B (C_C _ _) (C_B _ _))) -> 77 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B (C_C _ _) _,C_B (C_B _ _) (C_B _ _))) -> 78 
  C_E (C_A _ (C_B _ _)) ((C_C (C_B _ _) (C_A _ _),C_B _ (C_A _ _))) -> 79 
  C_E (C_B (C_C _ _) _) ((C_C _ (C_B _ _),C_A _ (C_A _ _))) -> 80 
  C_E (C_B _ (C_B _ _)) ((C_C (C_C _ _) (C_C _ _),C_B (C_A _ _) (C_B _ _))) -> 81 
  C_E (C_B _ (C_B _ _)) ((C_B (C_B _ _) (C_B _ _),C_B (C_B _ _) (C_A _ _))) -> 82 
  C_E (C_B (C_A _ _) _) ((C_B (C_B _ _) (C_B _ _),C_C (C_A _ _) (C_C _ _))) -> 83 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_C (C_B _ _) (C_A _ _),C_B (C_C _ _) (C_C _ _))) -> 84 
  C_E (C_B (C_A _ _) _) ((C_C _ (C_B _ _),C_C (C_C _ _) (C_B _ _))) -> 85 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B (C_A _ _) (C_A _ _),C_B (C_A _ _) (C_A _ _))) -> 86 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_B _ (C_C _ _),C_B _ (C_A _ _))) -> 87 
  C_E (C_C _ (C_C _ _)) ((C_A _ (C_C _ _),C_C (C_B _ _) _)) -> 88 
  C_E (C_A _ (C_C _ _)) ((C_C (C_C _ _) (C_B _ _),C_A _ _)) -> 89 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_B (C_A _ _) _,C_C (C_C _ _) (C_A _ _))) -> 90 
  C_E (C_B _ (C_A _ _)) ((C_A _ (C_C _ _),C_B (C_B _ _) _)) -> 91 
  C_E (C_B (C_A _ _) _) ((C_C (C_A _ _) (C_B _ _),C_B _ (C_A _ _))) -> 92 
  C_E (C_C (C_B _ _) _) ((C_C (C_A _ _) _,C_C (C_A _ _) _)) -> 93 
  C_E (C_B _ (C_B _ _)) ((C_B (C_B _ _) _,C_B _ _)) -> 94 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_B (C_B _ _) (C_A _ _),C_A _ (C_C _ _))) -> 95 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_C _ (C_A _ _),C_C (C_C _ _) _)) -> 96 
  C_E (C_A _ (C_A _ _)) ((C_C (C_A _ _) (C_C _ _),C_B (C_A _ _) (C_C _ _))) -> 97 
  C_E (C_B _ (C_B _ _)) ((C_C (C_B _ _) (C_A _ _),C_C _ (C_C _ _))) -> 98 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_C (C_A _ _) _,C_C (C_C _ _) _)) -> 99 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_C (C_A _ _) _,C_B (C_B _ _) (C_B _ _))) -> 100 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_B (C_B _ _) (C_B _ _),C_C (C_C _ _) (C_A _ _))) -> 101 
  C_E (C_A _ _) ((C_C (C_B _ _) (C_C _ _),C_B (C_A _ _) (C_B _ _))) -> 102 
  C_E (C_A _ (C_B _ _)) ((C_C (C_C _ _) (C_B _ _),C_C _ _)) -> 103 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_C _ (C_C _ _),C_B _ (C_A _ _))) -> 104 
  C_E (C_B (C_B _ _) _) ((C_B _ _,C_B (C_B _ _) (C_A _ _))) -> 105 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_C (C_C _ _) _,C_B (C_B _ _) (C_A _ _))) -> 106 
  C_E (C_A _ (C_A _ _)) ((C_A _ (C_B _ _),C_C _ (C_B _ _))) -> 107 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B (C_A _ _) (C_C _ _),C_B (C_C _ _) (C_A _ _))) -> 108 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_B (C_A _ _) _,C_B _ (C_C _ _))) -> 109 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_C (C_B _ _) (C_C _ _),C_C _ (C_B _ _))) -> 110 
  C_E (C_B (C_A _ _) _) ((C_A _ (C_B _ _),C_B (C_B _ _) (C_A _ _))) -> 111 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_C (C_A _ _) (C_B _ _),C_B (C_B _ _) (C_A _ _))) -> 112 
  C_E (C_C (C_C _ _) _) ((C_B (C_B _ _) (C_A _ _),C_C _ (C_A _ _))) -> 113 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_C _ _,C_C _ (C_C _ _))) -> 114 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B _ _,C_C (C_C _ _) (C_A _ _))) -> 115 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_C (C_B _ _) _,C_C (C_C _ _) _)) -> 116 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_C _ (C_A _ _),C_C (C_A _ _) (C_A _ _))) -> 117 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C (C_A _ _) (C_A _ _),C_C (C_B _ _) (C_A _ _))) -> 118 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_B _ _,C_C (C_C _ _) (C_C _ _))) -> 119 
  C_E (C_A _ _) ((C_B (C_C _ _) (C_C _ _),C_C (C_B _ _) (C_B _ _))) -> 120 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_B (C_A _ _) (C_A _ _),C_B (C_B _ _) _)) -> 121 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_B _ (C_C _ _),C_B _ (C_A _ _))) -> 122 
  C_E (C_B _ _) ((C_C (C_B _ _) (C_B _ _),C_B _ (C_C _ _))) -> 123 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_C _ (C_C _ _),C_B _ (C_C _ _))) -> 124 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_C _ (C_C _ _),C_B (C_C _ _) (C_B _ _))) -> 125 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_C (C_A _ _) _,C_B _ _)) -> 126 
  C_E (C_C _ (C_B _ _)) ((C_B _ _,C_C (C_A _ _) (C_C _ _))) -> 127 
  C_E (C_B _ (C_A _ _)) ((C_B _ (C_A _ _),C_B (C_A _ _) (C_C _ _))) -> 128 
  C_E (C_A _ (C_B _ _)) ((C_A _ (C_A _ _),C_B _ (C_A _ _))) -> 129 
  C_E (C_B _ (C_B _ _)) ((C_C _ (C_B _ _),C_B (C_B _ _) _)) -> 130 
  C_E (C_C _ (C_A _ _)) ((C_C (C_C _ _) (C_A _ _),C_C (C_C _ _) (C_A _ _))) -> 131 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_B _ (C_C _ _),C_C (C_C _ _) (C_C _ _))) -> 132 
  C_E (C_C _ (C_C _ _)) ((C_B (C_C _ _) (C_B _ _),C_C _ (C_B _ _))) -> 133 
  C_E (C_B _ (C_C _ _)) ((C_C _ _,C_A _ _)) -> 134 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_C _ (C_C _ _),C_B _ (C_C _ _))) -> 135 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_B (C_B _ _) (C_C _ _),C_A _ (C_A _ _))) -> 136 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_C (C_B _ _) (C_C _ _),C_B (C_B _ _) _)) -> 137 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_B (C_B _ _) (C_A _ _),C_C (C_B _ _) (C_C _ _))) -> 138 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_B (C_C _ _) _,C_B (C_C _ _) (C_A _ _))) -> 139 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_C (C_A _ _) (C_C _ _),C_C (C_C _ _) (C_B _ _))) -> 140 
  C_E (C_C _ (C_A _ _)) ((C_B (C_C _ _) (C_B _ _),C_B (C_B _ _) _)) -> 141 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_B _ _,C_B (C_B _ _) (C_C _ _))) -> 142 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_B (C_A _ _) (C_B _ _),C_B (C_B _ _) (C_A _ _))) -> 143 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_C (C_B _ _) (C_A _ _),C_B _ _)) -> 144 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_C _ (C_A _ _),C_C _ (C_A _ _))) -> 145 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_C (C_B _ _) _,C_C (C_A _ _) (C_C _ _))) -> 146 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_C _ (C_A _ _),C_C _ _)) -> 147 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B (C_B _ _) _,C_C (C_C _ _) (C_A _ _))) -> 148 
  C_E (C_C (C_B _ _) _) ((C_B (C_A _ _) (C_C _ _),C_C _ (C_A _ _))) -> 149 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_B (C_A _ _) (C_A _ _),C_B _ (C_A _ _))) -> 150 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C _ _,C_B (C_B _ _) (C_B _ _))) -> 151 
  C_E (C_B _ (C_C _ _)) ((C_C (C_B _ _) (C_A _ _),C_B _ (C_B _ _))) -> 152 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_C (C_C _ _) _,C_C _ (C_B _ _))) -> 153 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_B (C_C _ _) (C_C _ _),C_A _ (C_A _ _))) -> 154 
  C_E (C_A _ (C_C _ _)) ((C_B (C_C _ _) (C_B _ _),C_B _ _)) -> 155 
  C_E (C_C (C_B _ _) _) ((C_C (C_C _ _) (C_A _ _),C_A _ (C_A _ _))) -> 156 
  C_E (C_C _ (C_B _ _)) ((C_C (C_C _ _) _,C_B (C_C _ _) (C_B _ _))) -> 157 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B (C_B _ _) (C_C _ _),C_C _ (C_C _ _))) -> 158 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_C _ (C_B _ _),C_B (C_A _ _) (C_C _ _))) -> 159 
  C_E (C_C _ (C_B _ _)) ((C_B (C_C _ _) _,C_C (C_C _ _) (C_A _ _))) -> 160 
  C_E _ ((C_B (C_A _ _) (C_B _ _),C_C (C_A _ _) (C_A _ _))) -> 161 
  C_E (C_C _ (C_A _ _)) ((C_C (C_B _ _) (C_C _ _),C_C (C_A _ _) (C_B _ _))) -> 162 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_B (C_B _ _) (C_B _ _),C_B (C_C _ _) (C_C _ _))) -> 163 
  C_E (C_C _ (C_A _ _)) ((C_B _ (C_A _ _),C_B (C_A _ _) (C_A _ _))) -> 164 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B _ (C_A _ _),C_C (C_C _ _) _)) -> 165 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_B (C_B _ _) (C_A _ _),C_A _ _)) -> 166 
  C_E (C_C _ (C_A _ _)) ((C_C (C_A _ _) (C_A _ _),C_B (C_A _ _) (C_C _ _))) -> 167 
  C_E (C_B (C_A _ _) _) ((C_B _ _,C_B (C_A _ _) (C_A _ _))) -> 168 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_A _ _,C_C (C_B _ _) (C_A _ _))) -> 169 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_C (C_B _ _) (C_C _ _),C_C _ (C_C _ _))) -> 170 
  C_E (C_B (C_B _ _) _) ((C_A _ (C_B _ _),C_C (C_A _ _) _)) -> 171 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_C (C_C _ _) (C_C _ _),C_B (C_C _ _) (C_C _ _))) -> 172 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_C (C_C _ _) (C_A _ _),C_B (C_C _ _) (C_B _ _))) -> 173 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C (C_C _ _) _,C_B _ (C_C _ _))) -> 174 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_C _ _,C_C (C_A _ _) _)) -> 175 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_C _ (C_C _ _),C_C (C_C _ _) (C_A _ _))) -> 176 
  C_E (C_C _ (C_B _ _)) ((C_B (C_A _ _) (C_B _ _),C_B (C_A _ _) (C_B _ _))) -> 177 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_C (C_B _ _) (C_B _ _),C_C _ _)) -> 178 
  C_E (C_B _ (C_B _ _)) ((C_C (C_C _ _) (C_A _ _),C_B (C_C _ _) (C_C _ _))) -> 179 
  C_E (C_B (C_C _ _) _) ((C_B (C_B _ _) (C_C _ _),C_C (C_C _ _) (C_B _ _))) -> 180 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_B (C_C _ _) (C_C _ _),C_B (C_C _ _) (C_B _ _))) -> 181 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C (C_A _ _) (C_B _ _),C_C (C_A _ _) (C_A _ _))) -> 182 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_B (C_C _ _) (C_A _ _),C_B (C_A _ _) (C_B _ _))) -> 183 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C (C_A _ _) (C_C _ _),C_C (C_A _ _) _)) -> 184 
  C_E _ ((C_B (C_B _ _) (C_C _ _),C_B (C_B _ _) (C_C _ _))) -> 185 
  C_E (C_C _ (C_C _ _)) ((C_C (C_A _ _) (C_B _ _),C_A _ _)) -> 186 
  C_E (C_C _ _) ((C_B (C_C _ _) (C_C _ _),C_C (C_A _ _) (C_C _ _))) -> 187 
  C_E (C_A _ _) ((C_B (C_C _ _) (C_A _ _),C_B (C_A _ _) (C_C _ _))) -> 188 
  C_E (C_C _ _) ((C_B (C_B _ _) _,C_B (C_C _ _) _)) -> 189 
  C_E (C_C _ _) ((C_B (C_C _ _) (C_B _ _),C_B (C_A _ _) (C_C _ _))) -> 190 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_B (C_B _ _) _,C_A _ (C_B _ _))) -> 191 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B (C_B _ _) _,C_B (C_B _ _) (C_B _ _))) -> 192 
  C_E (C_C (C_C _ _) _) ((C_B (C_A _ _) (C_B _ _),C_B _ _)) -> 193 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_B (C_C _ _) (C_C _ _),C_C _ (C_B _ _))) -> 194 
  C_E (C_A _ (C_C _ _)) ((C_C (C_B _ _) (C_A _ _),C_B (C_A _ _) _)) -> 195 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_A _ _,C_B (C_B _ _) (C_A _ _))) -> 196 
  C_E (C_A _ _) ((C_C (C_A _ _) (C_B _ _),C_B _ (C_C _ _))) -> 197 
  C_E (C_C _ (C_B _ _)) ((C_B (C_C _ _) (C_A _ _),C_B (C_C _ _) (C_B _ _))) -> 198 
  C_E (C_B (C_B _ _) _) ((C_C (C_C _ _) _,C_B (C_C _ _) (C_A _ _))) -> 199 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_B _ (C_C _ _),C_C (C_A _ _) _)) -> 200 
  C_E (C_C _ _) ((C_B (C_B _ _) (C_A _ _),C_B (C_C _ _) _)) -> 201 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C (C_C _ _) (C_B _ _),C_C (C_A _ _) (C_C _ _))) -> 202 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_C _ (C_B _ _),C_B (C_C _ _) (C_B _ _))) -> 203 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C _ (C_B _ _),C_B _ (C_A _ _))) -> 204 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_B (C_C _ _) (C_C _ _),C_B (C_C _ _) (C_B _ _))) -> 205 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_C (C_C _ _) (C_B _ _),C_C _ (C_C _ _))) -> 206 
  C_E (C_A _ (C_B _ _)) ((C_B (C_B _ _) (C_C _ _),C_B (C_C _ _) _)) -> 207 
  C_E (C_A _ _) ((C_B _ _,C_B (C_B _ _) (C_A _ _))) -> 208 
  C_E (C_B (C_A _ _) _) ((C_B (C_A _ _) (C_A _ _),C_C _ (C_A _ _))) -> 209 
  C_E (C_A _ (C_C _ _)) ((C_B (C_C _ _) (C_C _ _),C_B (C_C _ _) _)) -> 210 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_A _ (C_C _ _),C_C _ (C_C _ _))) -> 211 
  C_E (C_B _ (C_B _ _)) ((C_B _ (C_C _ _),C_C (C_C _ _) (C_A _ _))) -> 212 
  C_E (C_B (C_C _ _) _) ((C_B (C_A _ _) (C_A _ _),C_C (C_C _ _) (C_C _ _))) -> 213 
  C_E (C_B (C_C _ _) _) ((C_C _ (C_B _ _),C_C (C_B _ _) (C_A _ _))) -> 214 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C (C_C _ _) (C_C _ _),C_A _ (C_B _ _))) -> 215 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_C _ (C_B _ _),C_B (C_B _ _) (C_C _ _))) -> 216 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_C (C_A _ _) (C_B _ _),C_C (C_A _ _) (C_B _ _))) -> 217 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_C _ (C_A _ _),C_C (C_C _ _) (C_A _ _))) -> 218 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_C (C_A _ _) (C_C _ _),C_B (C_C _ _) (C_B _ _))) -> 219 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_C (C_A _ _) _,C_C (C_B _ _) _)) -> 220 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_B (C_A _ _) (C_A _ _),C_B (C_B _ _) (C_C _ _))) -> 221 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_C _ (C_A _ _),C_B (C_B _ _) (C_A _ _))) -> 222 
  C_E (C_C (C_C _ _) _) ((C_B (C_A _ _) _,C_A _ (C_A _ _))) -> 223 
  C_E (C_C _ (C_C _ _)) ((C_C (C_C _ _) (C_B _ _),C_B (C_C _ _) (C_B _ _))) -> 224 
  C_E (C_C _ _) ((C_B (C_A _ _) (C_B _ _),C_C (C_B _ _) (C_B _ _))) -> 225 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B (C_B _ _) _,C_C (C_A _ _) (C_C _ _))) -> 226 
  C_E (C_B _ (C_C _ _)) ((C_A _ (C_A _ _),C_B _ _)) -> 227 
  C_E (C_C (C_B _ _) _) ((C_C (C_C _ _) _,C_C (C_C _ _) (C_B _ _))) -> 228 
  C_E (C_C _ (C_B _ _)) ((C_B (C_C _ _) (C_C _ _),C_C (C_B _ _) _)) -> 229 
  C_E (C_B _ _) ((C_C (C_B _ _) _,C_A _ _)) -> 230 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B (C_C _ _) (C_B _ _),C_C _ (C_C _ _))) -> 231 
  C_E (C_B _ _) ((C_C (C_C _ _) (C_C _ _),C_C (C_B _ _) (C_A _ _))) -> 232 
  C_E _ ((C_C (C_B _ _) (C_B _ _),C_B (C_B _ _) (C_B _ _))) -> 233 
  C_E (C_B (C_A _ _) _) ((C_C (C_C _ _) _,C_C _ _)) -> 234 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B _ (C_B _ _),C_B (C_A _ _) (C_C _ _))) -> 235 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_B (C_C _ _) (C_C _ _),C_C (C_B _ _) (C_A _ _))) -> 236 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_B (C_C _ _) (C_B _ _),C_C _ (C_B _ _))) -> 237 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_A _ (C_A _ _),C_A _ _)) -> 238 
  C_E (C_B _ (C_A _ _)) ((C_A _ _,C_B (C_A _ _) (C_B _ _))) -> 239 
  C_E (C_B (C_C _ _) _) ((C_C _ (C_A _ _),C_C (C_B _ _) _)) -> 240 
  C_E (C_A _ (C_B _ _)) ((C_B (C_C _ _) (C_A _ _),C_C (C_C _ _) (C_B _ _))) -> 241 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_A _ _,C_C (C_A _ _) (C_A _ _))) -> 242 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_C (C_A _ _) (C_C _ _),C_C (C_C _ _) (C_C _ _))) -> 243 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_C _ (C_A _ _),C_B (C_C _ _) _)) -> 244 
  C_E (C_C (C_B _ _) _) ((C_C (C_B _ _) (C_C _ _),C_A _ (C_A _ _))) -> 245 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_B (C_B _ _) (C_A _ _),C_B (C_A _ _) _)) -> 246 
  C_E (C_C _ (C_B _ _)) ((C_C _ (C_C _ _),C_B _ (C_C _ _))) -> 247 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B (C_A _ _) (C_A _ _),C_C (C_B _ _) (C_A _ _))) -> 248 
  C_E (C_A _ _) ((C_B _ _,C_C (C_C _ _) (C_C _ _))) -> 249 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_C _ (C_C _ _),C_C _ (C_A _ _))) -> 250 
  C_E (C_A _ (C_A _ _)) ((C_C (C_A _ _) _,C_A _ _)) -> 251 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B (C_C _ _) (C_A _ _),C_B (C_B _ _) (C_A _ _))) -> 252 
  C_E (C_C _ (C_A _ _)) ((C_B (C_C _ _) _,C_A _ _)) -> 253 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_B (C_C _ _) (C_A _ _),C_A _ (C_C _ _))) -> 254 
  C_E (C_B _ (C_B _ _)) ((C_A _ _,C_C (C_A _ _) _)) -> 255 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_A _ (C_A _ _),C_C _ (C_B _ _))) -> 256 
  C_E (C_B _ _) ((C_C _ (C_B _ _),C_A _ (C_A _ _))) -> 257 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_A _ (C_A _ _),C_C _ _)) -> 258 
  C_E (C_B (C_B _ _) _) ((C_C (C_C _ _) (C_C _ _),C_A _ (C_C _ _))) -> 259 
  C_E (C_B (C_C _ _) _) ((C_C (C_B _ _) (C_A _ _),C_B _ (C_A _ _))) -> 260 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_C _ (C_C _ _),C_C (C_B _ _) (C_B _ _))) -> 261 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_C (C_B _ _) (C_C _ _),C_A _ (C_C _ _))) -> 262 
  C_E (C_C _ _) ((C_B (C_B _ _) (C_B _ _),C_B (C_B _ _) (C_C _ _))) -> 263 
  C_E (C_B _ (C_C _ _)) ((C_C (C_B _ _) (C_B _ _),C_C (C_B _ _) (C_B _ _))) -> 264 
  C_E (C_A _ (C_C _ _)) ((C_B (C_A _ _) (C_C _ _),C_B (C_A _ _) (C_B _ _))) -> 265 
  C_E _ ((C_C (C_B _ _) (C_B _ _),C_C (C_A _ _) (C_A _ _))) -> 266 
  C_E (C_B _ _) ((C_B _ _,C_B _ (C_C _ _))) -> 267 
  C_E (C_A _ (C_A _ _)) ((C_B _ (C_A _ _),C_B (C_A _ _) (C_A _ _))) -> 268 
  C_E (C_C (C_A _ _) _) ((C_B _ (C_B _ _),C_C (C_A _ _) (C_C _ _))) -> 269 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_A _ (C_B _ _),C_B _ (C_C _ _))) -> 270 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B (C_A _ _) (C_B _ _),C_C (C_B _ _) (C_B _ _))) -> 271 
  C_E (C_A _ (C_B _ _)) ((C_A _ _,C_C (C_B _ _) (C_B _ _))) -> 272 
  C_E (C_B (C_A _ _) _) ((C_B (C_A _ _) (C_C _ _),C_B (C_B _ _) (C_A _ _))) -> 273 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C (C_C _ _) (C_C _ _),C_B _ (C_C _ _))) -> 274 
  C_E (C_C (C_A _ _) _) ((C_C (C_C _ _) (C_B _ _),C_B _ (C_A _ _))) -> 275 
  C_E (C_A _ (C_B _ _)) ((C_B (C_A _ _) (C_C _ _),C_C (C_C _ _) (C_B _ _))) -> 276 
  C_E (C_B _ _) ((C_B (C_A _ _) _,C_B (C_C _ _) (C_A _ _))) -> 277 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_C (C_B _ _) (C_A _ _),C_A _ (C_C _ _))) -> 278 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_A _ _,C_C (C_B _ _) (C_C _ _))) -> 279 
  C_E (C_C _ (C_C _ _)) ((C_C (C_A _ _) (C_C _ _),C_B _ (C_B _ _))) -> 280 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_C _ (C_A _ _),C_B _ (C_B _ _))) -> 281 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_B (C_B _ _) (C_A _ _),C_B (C_C _ _) _)) -> 282 
  C_E (C_A _ _) ((C_C (C_B _ _) (C_C _ _),C_B (C_B _ _) (C_B _ _))) -> 283 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_B _ (C_A _ _),C_B (C_B _ _) _)) -> 284 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_C (C_A _ _) (C_C _ _),C_A _ (C_A _ _))) -> 285 
  C_E (C_A _ (C_C _ _)) ((C_B (C_C _ _) _,C_C _ _)) -> 286 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_C _ _,C_B _ _)) -> 287 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_C (C_B _ _) (C_C _ _),C_C (C_A _ _) (C_B _ _))) -> 288 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_C (C_C _ _) (C_C _ _),C_B (C_B _ _) _)) -> 289 
