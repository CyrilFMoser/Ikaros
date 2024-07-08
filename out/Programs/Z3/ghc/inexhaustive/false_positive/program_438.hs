module Program_23 () where 

main = print $ show v_b
data B_A = C_A Int B_A | C_B B_A B_A | C_C B_A B_A
data B_B a b = C_D | C_E B_A ((B_A,B_A)) | C_F B_A | C_G

v_a :: B_B Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_F (C_C (C_A _ _) (C_A _ _)) -> 1 
  C_F (C_C (C_B _ _) (C_B _ _)) -> 2 
  C_F (C_A _ (C_C _ _)) -> 3 
  C_F (C_B (C_A _ _) (C_B _ _)) -> 4 
  C_F (C_B _ _) -> 5 
  C_F (C_B (C_B _ _) (C_A _ _)) -> 6 
  C_F (C_C (C_C _ _) (C_A _ _)) -> 7 
  C_F (C_C (C_A _ _) (C_C _ _)) -> 8 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C (C_B _ _) (C_C _ _),C_B (C_A _ _) (C_A _ _))) -> 9 
  C_E (C_B (C_A _ _) _) ((C_B (C_B _ _) (C_A _ _),C_C _ (C_A _ _))) -> 10 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_B _ (C_C _ _),C_C _ _)) -> 11 
  C_E (C_A _ (C_A _ _)) ((C_C _ (C_B _ _),C_B _ (C_C _ _))) -> 12 
  C_E _ ((C_C (C_B _ _) _,C_B (C_B _ _) (C_A _ _))) -> 13 
  C_E (C_A _ (C_A _ _)) ((C_C (C_A _ _) _,C_C _ _)) -> 14 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_C (C_B _ _) _,C_C (C_C _ _) (C_C _ _))) -> 15 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_B (C_A _ _) _,C_B (C_C _ _) _)) -> 16 
  C_E (C_C _ _) ((C_A _ _,C_B (C_A _ _) (C_A _ _))) -> 17 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_C _ (C_C _ _),C_C (C_A _ _) (C_B _ _))) -> 18 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_C (C_C _ _) (C_A _ _),C_C (C_B _ _) (C_A _ _))) -> 19 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C _ (C_B _ _),C_B (C_B _ _) (C_B _ _))) -> 20 
  C_E (C_C _ (C_B _ _)) ((C_B (C_B _ _) _,C_B _ _)) -> 21 
  C_E (C_B (C_A _ _) _) ((C_B _ (C_C _ _),C_C (C_C _ _) (C_A _ _))) -> 22 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C (C_C _ _) _,C_C _ _)) -> 23 
  C_E (C_B (C_A _ _) _) ((C_B (C_C _ _) _,C_B (C_A _ _) (C_B _ _))) -> 24 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_C _ (C_C _ _),C_B (C_C _ _) (C_A _ _))) -> 25 
  C_E (C_B _ (C_B _ _)) ((C_A _ (C_C _ _),C_B (C_C _ _) _)) -> 26 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_C (C_A _ _) (C_C _ _),C_C (C_B _ _) (C_B _ _))) -> 27 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_C _ (C_A _ _),C_B (C_B _ _) _)) -> 28 
  C_E (C_A _ (C_B _ _)) ((C_C (C_C _ _) _,C_B (C_B _ _) (C_B _ _))) -> 29 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_B (C_C _ _) (C_C _ _),C_B _ _)) -> 30 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B (C_B _ _) (C_B _ _),C_C _ _)) -> 31 
  C_E (C_C _ (C_B _ _)) ((C_B (C_C _ _) (C_B _ _),C_A _ (C_A _ _))) -> 32 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_A _ _,C_B (C_B _ _) (C_A _ _))) -> 33 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_C (C_A _ _) (C_A _ _),C_C (C_B _ _) (C_A _ _))) -> 34 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_B (C_C _ _) _,C_C (C_C _ _) (C_B _ _))) -> 35 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_B (C_C _ _) _,C_C (C_B _ _) (C_A _ _))) -> 36 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_B _ (C_B _ _),C_B (C_A _ _) _)) -> 37 
  C_E (C_A _ _) ((C_C (C_B _ _) (C_B _ _),C_B _ (C_C _ _))) -> 38 
  C_E (C_B (C_A _ _) _) ((C_C (C_B _ _) (C_A _ _),C_C (C_B _ _) (C_A _ _))) -> 39 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_B (C_A _ _) _,C_C (C_A _ _) (C_C _ _))) -> 40 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_B _ (C_A _ _),C_C (C_C _ _) (C_B _ _))) -> 41 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_B (C_C _ _) _,C_B (C_B _ _) _)) -> 42 
  C_E (C_C (C_A _ _) _) ((C_B _ _,C_B (C_A _ _) (C_A _ _))) -> 43 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_B _ _,C_C (C_C _ _) (C_B _ _))) -> 44 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_C _ _,C_B (C_B _ _) (C_A _ _))) -> 45 
  C_E (C_A _ _) ((C_B (C_B _ _) (C_B _ _),C_A _ _)) -> 46 
  C_E (C_C _ (C_B _ _)) ((C_B (C_A _ _) (C_A _ _),C_B _ (C_C _ _))) -> 47 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_B (C_A _ _) (C_B _ _),C_B (C_C _ _) (C_B _ _))) -> 48 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_C _ (C_B _ _),C_C (C_B _ _) (C_B _ _))) -> 49 
  C_E (C_A _ (C_A _ _)) ((C_B _ (C_C _ _),C_B _ (C_A _ _))) -> 50 
  C_E (C_B (C_C _ _) _) ((C_C _ (C_C _ _),C_C (C_A _ _) _)) -> 51 
  C_E (C_C _ (C_C _ _)) ((C_C (C_B _ _) (C_A _ _),C_B _ _)) -> 52 
  C_E (C_A _ (C_B _ _)) ((C_C (C_C _ _) (C_A _ _),C_B (C_C _ _) (C_A _ _))) -> 53 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_C (C_B _ _) (C_C _ _),C_C (C_A _ _) (C_C _ _))) -> 54 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_B _ _,C_B (C_C _ _) (C_B _ _))) -> 55 
  C_E (C_A _ _) ((C_A _ (C_B _ _),C_C (C_B _ _) _)) -> 56 
  C_E (C_B _ (C_C _ _)) ((C_B (C_C _ _) (C_A _ _),C_B (C_A _ _) _)) -> 57 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_C (C_C _ _) (C_C _ _),C_C (C_A _ _) (C_A _ _))) -> 58 
  C_E (C_B _ (C_B _ _)) ((C_C (C_A _ _) (C_B _ _),C_A _ (C_A _ _))) -> 59 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_B _ _,C_B (C_C _ _) (C_C _ _))) -> 60 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_B (C_B _ _) _,C_A _ (C_C _ _))) -> 61 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_B _ (C_A _ _),C_C _ (C_C _ _))) -> 62 
  C_E (C_B _ (C_B _ _)) ((C_C _ (C_B _ _),C_C (C_C _ _) (C_B _ _))) -> 63 
  C_E (C_C (C_A _ _) _) ((C_C (C_B _ _) (C_C _ _),C_C (C_B _ _) (C_C _ _))) -> 64 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C (C_A _ _) (C_B _ _),C_B (C_C _ _) (C_B _ _))) -> 65 
  C_E (C_A _ (C_A _ _)) ((C_C _ (C_C _ _),C_C (C_A _ _) (C_C _ _))) -> 66 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_C _ (C_B _ _),C_C (C_A _ _) (C_B _ _))) -> 67 
  C_E (C_A _ _) ((C_B (C_A _ _) (C_A _ _),C_B _ (C_A _ _))) -> 68 
  C_E (C_A _ _) ((C_C (C_C _ _) (C_C _ _),C_B (C_C _ _) (C_B _ _))) -> 69 
  C_E (C_B (C_A _ _) _) ((C_A _ _,C_B _ _)) -> 70 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_A _ (C_C _ _),C_C _ (C_B _ _))) -> 71 
  C_E (C_B (C_B _ _) _) ((C_B _ (C_A _ _),C_B (C_A _ _) (C_B _ _))) -> 72 
  C_E (C_A _ (C_B _ _)) ((C_B (C_B _ _) (C_B _ _),C_B _ (C_C _ _))) -> 73 
  C_E (C_C _ (C_A _ _)) ((C_B _ (C_A _ _),C_C (C_B _ _) (C_A _ _))) -> 74 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_C (C_A _ _) _,C_A _ (C_A _ _))) -> 75 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_C (C_C _ _) (C_A _ _),C_B _ (C_C _ _))) -> 76 
  C_E (C_B (C_B _ _) _) ((C_B (C_A _ _) (C_C _ _),C_C (C_C _ _) (C_A _ _))) -> 77 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_C (C_A _ _) _,C_C (C_B _ _) (C_C _ _))) -> 78 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B (C_A _ _) (C_C _ _),C_A _ (C_C _ _))) -> 79 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_C _ (C_A _ _),C_B (C_B _ _) (C_C _ _))) -> 80 
  C_E (C_B _ (C_A _ _)) ((C_B (C_A _ _) (C_A _ _),C_B _ (C_A _ _))) -> 81 
  C_E (C_B (C_A _ _) _) ((C_A _ (C_A _ _),C_B _ _)) -> 82 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_B _ (C_C _ _),C_B (C_A _ _) (C_B _ _))) -> 83 
  C_E (C_B _ _) ((C_C _ (C_B _ _),C_C (C_B _ _) (C_A _ _))) -> 84 
  C_E (C_A _ (C_C _ _)) ((C_B (C_A _ _) (C_B _ _),C_B (C_C _ _) (C_C _ _))) -> 85 
  C_E (C_B (C_B _ _) _) ((C_B _ (C_B _ _),C_B _ _)) -> 86 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_A _ (C_A _ _),C_C (C_C _ _) _)) -> 87 
  C_E (C_B _ (C_C _ _)) ((C_C _ (C_B _ _),C_B (C_B _ _) (C_C _ _))) -> 88 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_C (C_C _ _) (C_A _ _),C_C (C_C _ _) _)) -> 89 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_C _ (C_A _ _),C_C (C_B _ _) (C_B _ _))) -> 90 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_B (C_A _ _) _,C_C (C_B _ _) (C_A _ _))) -> 91 
  C_E (C_A _ (C_A _ _)) ((C_C _ (C_A _ _),C_B (C_B _ _) (C_B _ _))) -> 92 
  C_E (C_B (C_B _ _) _) ((C_B _ _,C_C (C_A _ _) (C_A _ _))) -> 93 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_C (C_B _ _) (C_C _ _),C_C _ (C_B _ _))) -> 94 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_C _ (C_A _ _),C_B _ (C_C _ _))) -> 95 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_C (C_A _ _) (C_C _ _),C_A _ (C_B _ _))) -> 96 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_B _ (C_A _ _),C_B (C_A _ _) (C_A _ _))) -> 97 
  C_E (C_C (C_B _ _) _) ((C_C (C_B _ _) (C_C _ _),C_C (C_C _ _) (C_A _ _))) -> 98 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_C (C_B _ _) _,C_B (C_A _ _) _)) -> 99 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_C (C_B _ _) (C_C _ _),C_C (C_B _ _) _)) -> 100 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_B (C_C _ _) (C_B _ _),C_B (C_B _ _) _)) -> 101 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C _ (C_A _ _),C_C (C_C _ _) (C_C _ _))) -> 102 
  C_E (C_C (C_B _ _) _) ((C_C (C_A _ _) (C_A _ _),C_B (C_C _ _) (C_B _ _))) -> 103 
  C_E (C_B _ _) ((C_A _ (C_A _ _),C_B (C_B _ _) (C_A _ _))) -> 104 
  C_E (C_A _ (C_C _ _)) ((C_B (C_C _ _) (C_B _ _),C_C (C_A _ _) _)) -> 105 
  C_E (C_A _ (C_A _ _)) ((C_A _ (C_B _ _),C_A _ (C_B _ _))) -> 106 
  C_E (C_C (C_B _ _) _) ((C_A _ (C_B _ _),C_C (C_B _ _) (C_B _ _))) -> 107 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B _ (C_A _ _),C_B (C_A _ _) _)) -> 108 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B _ (C_A _ _),C_C (C_B _ _) (C_C _ _))) -> 109 
  C_E (C_A _ _) ((C_C (C_C _ _) (C_A _ _),C_C (C_A _ _) (C_A _ _))) -> 110 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_C (C_A _ _) (C_A _ _),C_C (C_A _ _) (C_B _ _))) -> 111 
  C_E (C_C (C_A _ _) _) ((C_B (C_A _ _) (C_B _ _),C_B (C_A _ _) _)) -> 112 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_B _ (C_C _ _),C_B (C_B _ _) (C_B _ _))) -> 113 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B _ (C_A _ _),C_B _ (C_B _ _))) -> 114 
  C_E (C_C _ _) ((C_C _ (C_B _ _),C_C (C_C _ _) (C_B _ _))) -> 115 
  C_E (C_B _ (C_A _ _)) ((C_C (C_C _ _) (C_A _ _),C_B (C_B _ _) (C_A _ _))) -> 116 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_A _ (C_C _ _),C_B _ (C_B _ _))) -> 117 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_B (C_C _ _) (C_A _ _),C_C (C_C _ _) (C_C _ _))) -> 118 
  C_E (C_C _ (C_C _ _)) ((C_B (C_A _ _) (C_B _ _),C_C (C_A _ _) (C_C _ _))) -> 119 
  C_E (C_C (C_A _ _) _) ((C_C (C_B _ _) (C_C _ _),C_B (C_B _ _) _)) -> 120 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_A _ _,C_C (C_A _ _) (C_A _ _))) -> 121 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_B _ (C_C _ _),C_C (C_A _ _) (C_C _ _))) -> 122 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_B (C_A _ _) (C_A _ _),C_C _ (C_C _ _))) -> 123 
  C_E (C_C (C_B _ _) _) ((C_B _ (C_A _ _),C_C (C_C _ _) (C_B _ _))) -> 124 
  C_E (C_C _ (C_B _ _)) ((C_A _ (C_A _ _),C_C (C_C _ _) (C_A _ _))) -> 125 
  C_E (C_A _ (C_B _ _)) ((C_B _ _,C_B (C_A _ _) (C_A _ _))) -> 126 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C _ (C_B _ _),C_C (C_C _ _) (C_C _ _))) -> 127 
  C_E (C_C _ (C_C _ _)) ((C_B (C_A _ _) (C_B _ _),C_C _ (C_B _ _))) -> 128 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_A _ _,C_B (C_C _ _) (C_C _ _))) -> 129 
  C_E (C_B (C_C _ _) _) ((C_B (C_A _ _) (C_B _ _),C_B (C_A _ _) (C_B _ _))) -> 130 
  C_E (C_C (C_B _ _) _) ((C_C _ (C_C _ _),C_B (C_A _ _) (C_C _ _))) -> 131 
  C_E (C_A _ (C_B _ _)) ((C_B (C_C _ _) _,C_C (C_C _ _) (C_B _ _))) -> 132 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_B (C_B _ _) (C_A _ _),C_B (C_C _ _) _)) -> 133 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_C _ (C_C _ _),C_B (C_A _ _) _)) -> 134 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C (C_B _ _) (C_B _ _),C_B (C_C _ _) _)) -> 135 
  C_E (C_C _ (C_A _ _)) ((C_C _ (C_B _ _),C_C (C_A _ _) _)) -> 136 
  C_E (C_C _ (C_A _ _)) ((C_B (C_A _ _) (C_C _ _),C_B (C_A _ _) (C_B _ _))) -> 137 
  C_E (C_C _ (C_B _ _)) ((C_C (C_B _ _) (C_B _ _),C_B (C_B _ _) _)) -> 138 
  C_E (C_C (C_B _ _) _) ((C_B (C_A _ _) (C_C _ _),C_A _ (C_A _ _))) -> 139 
  C_E (C_A _ (C_A _ _)) ((C_C (C_B _ _) (C_A _ _),C_B (C_B _ _) (C_B _ _))) -> 140 
  C_E (C_B _ (C_C _ _)) ((C_C (C_C _ _) (C_B _ _),C_B (C_C _ _) (C_B _ _))) -> 141 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_B _ (C_B _ _),C_A _ (C_B _ _))) -> 142 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_B (C_B _ _) (C_B _ _),C_B (C_C _ _) (C_B _ _))) -> 143 
  C_E (C_B _ (C_B _ _)) ((C_B _ (C_A _ _),C_B _ (C_A _ _))) -> 144 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_B (C_A _ _) (C_A _ _),C_C (C_A _ _) (C_A _ _))) -> 145 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_B (C_B _ _) (C_B _ _),C_B (C_B _ _) (C_B _ _))) -> 146 
  C_E (C_B _ (C_A _ _)) ((C_A _ _,C_B (C_C _ _) (C_A _ _))) -> 147 
  C_E (C_B (C_B _ _) _) ((C_C (C_B _ _) (C_A _ _),C_C (C_C _ _) (C_C _ _))) -> 148 
  C_E (C_B (C_C _ _) _) ((C_B _ _,C_B _ _)) -> 149 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_B _ (C_B _ _),C_B _ (C_B _ _))) -> 150 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B (C_C _ _) (C_A _ _),C_C (C_A _ _) (C_B _ _))) -> 151 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_B (C_C _ _) (C_A _ _),C_A _ (C_A _ _))) -> 152 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_B _ (C_C _ _),C_B (C_C _ _) _)) -> 153 
  C_E (C_B (C_A _ _) _) ((C_B _ _,C_B _ (C_B _ _))) -> 154 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_A _ (C_C _ _),C_C (C_C _ _) _)) -> 155 
  C_E (C_A _ _) ((C_B (C_C _ _) (C_C _ _),C_C (C_A _ _) _)) -> 156 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B (C_C _ _) (C_C _ _),C_C (C_B _ _) _)) -> 157 
  C_E (C_A _ (C_C _ _)) ((C_C _ (C_C _ _),C_B (C_B _ _) (C_A _ _))) -> 158 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_A _ (C_B _ _),C_B (C_A _ _) (C_C _ _))) -> 159 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B _ (C_A _ _),C_C (C_C _ _) (C_A _ _))) -> 160 
  C_E (C_C (C_C _ _) _) ((C_B (C_C _ _) _,C_A _ _)) -> 161 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_B (C_A _ _) (C_C _ _),C_A _ (C_B _ _))) -> 162 
  C_E (C_B _ _) ((C_C (C_B _ _) (C_A _ _),C_B (C_A _ _) (C_C _ _))) -> 163 
  C_E (C_A _ (C_C _ _)) ((C_B (C_C _ _) (C_B _ _),C_B (C_C _ _) (C_B _ _))) -> 164 
  C_E (C_B (C_C _ _) _) ((C_C (C_C _ _) (C_A _ _),C_C _ (C_C _ _))) -> 165 
  C_E (C_B (C_C _ _) _) ((C_C _ (C_A _ _),C_B (C_B _ _) (C_B _ _))) -> 166 
  C_E (C_B _ _) ((C_B (C_C _ _) (C_C _ _),C_B (C_B _ _) (C_A _ _))) -> 167 
  C_E (C_C (C_B _ _) _) ((C_C (C_B _ _) _,C_A _ (C_B _ _))) -> 168 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_A _ _,C_B (C_C _ _) (C_C _ _))) -> 169 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_B (C_A _ _) (C_C _ _),C_B _ (C_B _ _))) -> 170 
  C_E (C_B _ (C_C _ _)) ((C_B (C_A _ _) _,C_B _ (C_A _ _))) -> 171 
  C_E (C_B _ (C_B _ _)) ((C_B (C_C _ _) (C_B _ _),C_C _ (C_A _ _))) -> 172 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_C (C_C _ _) _,C_B (C_A _ _) (C_A _ _))) -> 173 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_C _ (C_A _ _),C_B _ _)) -> 174 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_B (C_C _ _) (C_A _ _),C_C (C_A _ _) (C_C _ _))) -> 175 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_C (C_A _ _) _,C_A _ _)) -> 176 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_C _ (C_C _ _),C_B (C_B _ _) (C_A _ _))) -> 177 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_B (C_C _ _) (C_A _ _),C_B (C_B _ _) (C_B _ _))) -> 178 
  C_E _ ((C_C (C_A _ _) (C_B _ _),C_B _ (C_C _ _))) -> 179 
  C_E (C_B _ (C_B _ _)) ((C_A _ (C_B _ _),C_B (C_A _ _) (C_B _ _))) -> 180 
  C_E (C_C (C_A _ _) _) ((C_C (C_A _ _) _,C_C (C_A _ _) (C_C _ _))) -> 181 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C _ (C_A _ _),C_C _ (C_C _ _))) -> 182 
  C_E _ ((C_C (C_C _ _) (C_B _ _),C_B (C_A _ _) _)) -> 183 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_B _ _,C_B (C_B _ _) (C_C _ _))) -> 184 
  C_E _ ((C_C _ (C_B _ _),C_B (C_B _ _) (C_C _ _))) -> 185 
  C_E (C_B (C_B _ _) _) ((C_B (C_C _ _) _,C_C _ (C_B _ _))) -> 186 
  C_E (C_B (C_A _ _) _) ((C_B _ _,C_C (C_B _ _) (C_A _ _))) -> 187 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C (C_A _ _) (C_C _ _),C_A _ (C_B _ _))) -> 188 
  C_E (C_A _ (C_A _ _)) ((C_B (C_B _ _) (C_B _ _),C_B _ _)) -> 189 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_B (C_B _ _) (C_C _ _),C_B (C_B _ _) _)) -> 190 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C _ _,C_B (C_B _ _) (C_A _ _))) -> 191 
  C_E (C_C _ (C_B _ _)) ((C_C _ (C_C _ _),C_C _ (C_A _ _))) -> 192 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_A _ (C_B _ _),C_B (C_A _ _) _)) -> 193 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_C (C_A _ _) _,C_A _ (C_C _ _))) -> 194 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_C (C_B _ _) (C_B _ _),C_B (C_C _ _) (C_B _ _))) -> 195 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B (C_A _ _) _,C_B (C_C _ _) (C_C _ _))) -> 196 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_B _ (C_B _ _),C_B (C_C _ _) (C_A _ _))) -> 197 
  C_E (C_A _ (C_B _ _)) ((C_B (C_B _ _) (C_B _ _),C_B (C_A _ _) (C_C _ _))) -> 198 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_B _ (C_B _ _),C_C (C_A _ _) (C_A _ _))) -> 199 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_A _ (C_C _ _),C_C (C_A _ _) (C_B _ _))) -> 200 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_B (C_A _ _) (C_A _ _),C_B (C_A _ _) (C_A _ _))) -> 201 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_C (C_C _ _) (C_A _ _),C_C (C_A _ _) (C_A _ _))) -> 202 
  C_E (C_C (C_C _ _) _) ((C_C (C_B _ _) (C_B _ _),C_B (C_B _ _) (C_C _ _))) -> 203 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B (C_C _ _) _,C_A _ (C_A _ _))) -> 204 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_C (C_C _ _) (C_B _ _),C_C (C_B _ _) _)) -> 205 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_C (C_C _ _) (C_B _ _),C_B (C_B _ _) (C_A _ _))) -> 206 
  C_E (C_C _ (C_A _ _)) ((C_B _ (C_C _ _),C_C (C_C _ _) (C_A _ _))) -> 207 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_B _ (C_C _ _),C_C (C_C _ _) _)) -> 208 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_A _ (C_B _ _),C_C _ _)) -> 209 
  C_E (C_C (C_B _ _) _) ((C_B (C_C _ _) (C_B _ _),C_C (C_A _ _) (C_A _ _))) -> 210 
  C_E (C_C (C_C _ _) _) ((C_C (C_B _ _) (C_A _ _),C_C (C_B _ _) (C_C _ _))) -> 211 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_B (C_A _ _) (C_B _ _),C_A _ (C_B _ _))) -> 212 
  C_E (C_C _ (C_C _ _)) ((C_B _ (C_A _ _),C_B (C_B _ _) (C_C _ _))) -> 213 
  C_E (C_A _ (C_B _ _)) ((C_C (C_A _ _) _,C_B (C_A _ _) _)) -> 214 
  C_E (C_B _ _) ((C_C (C_B _ _) (C_A _ _),C_C _ (C_A _ _))) -> 215 
  C_E (C_A _ (C_A _ _)) ((C_C _ (C_B _ _),C_B (C_B _ _) (C_A _ _))) -> 216 
  C_E (C_C (C_C _ _) _) ((C_C (C_C _ _) (C_A _ _),C_B _ (C_A _ _))) -> 217 
  C_E (C_A _ (C_A _ _)) ((C_C (C_B _ _) (C_A _ _),C_B (C_A _ _) (C_C _ _))) -> 218 
  C_E (C_A _ (C_A _ _)) ((C_C _ (C_B _ _),C_B (C_C _ _) _)) -> 219 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_B (C_A _ _) (C_B _ _),C_B (C_A _ _) _)) -> 220 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_B _ (C_A _ _),C_B (C_B _ _) (C_C _ _))) -> 221 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_B (C_C _ _) (C_A _ _),C_A _ (C_C _ _))) -> 222 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_C (C_C _ _) _,C_B (C_A _ _) (C_C _ _))) -> 223 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_C (C_C _ _) (C_C _ _),C_C (C_B _ _) (C_C _ _))) -> 224 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_B (C_A _ _) (C_B _ _),C_A _ (C_B _ _))) -> 225 
  C_E (C_B (C_A _ _) _) ((C_B _ (C_A _ _),C_B (C_A _ _) (C_A _ _))) -> 226 
  C_E (C_B _ (C_B _ _)) ((C_C (C_B _ _) (C_C _ _),C_A _ _)) -> 227 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_B (C_B _ _) (C_C _ _),C_C (C_C _ _) _)) -> 228 
  C_E (C_A _ _) ((C_A _ _,C_B (C_B _ _) _)) -> 229 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_C (C_C _ _) (C_A _ _),C_B (C_A _ _) (C_A _ _))) -> 230 
  C_E (C_B _ (C_C _ _)) ((C_B (C_B _ _) (C_A _ _),C_C (C_A _ _) (C_B _ _))) -> 231 
  C_E (C_C (C_B _ _) _) ((C_C _ (C_B _ _),C_B _ (C_B _ _))) -> 232 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_B (C_C _ _) _,C_B (C_A _ _) (C_B _ _))) -> 233 
  C_E (C_A _ _) ((C_B (C_B _ _) (C_C _ _),C_B (C_B _ _) (C_B _ _))) -> 234 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_A _ (C_C _ _),C_C (C_B _ _) (C_A _ _))) -> 235 
  C_E (C_C (C_C _ _) _) ((C_A _ (C_C _ _),C_C (C_C _ _) (C_B _ _))) -> 236 
  C_E (C_C (C_B _ _) _) ((C_C _ (C_B _ _),C_B _ (C_C _ _))) -> 237 
  C_E (C_B _ (C_B _ _)) ((C_B _ _,C_B (C_C _ _) (C_C _ _))) -> 238 
  C_E _ ((C_C (C_A _ _) (C_A _ _),C_C (C_B _ _) (C_C _ _))) -> 239 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_B _ (C_C _ _),C_C (C_A _ _) (C_A _ _))) -> 240 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_C (C_C _ _) (C_B _ _),C_C (C_A _ _) _)) -> 241 
  C_E (C_C _ (C_C _ _)) ((C_B (C_A _ _) (C_B _ _),C_B (C_C _ _) (C_A _ _))) -> 242 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_C (C_A _ _) _,C_C (C_C _ _) (C_C _ _))) -> 243 
  C_E (C_B (C_A _ _) _) ((C_C _ (C_A _ _),C_C (C_A _ _) _)) -> 244 
  C_E (C_B (C_A _ _) _) ((C_C (C_B _ _) (C_C _ _),C_C (C_B _ _) (C_B _ _))) -> 245 
  C_E (C_C (C_B _ _) _) ((C_A _ (C_A _ _),C_C (C_B _ _) (C_B _ _))) -> 246 
  C_E (C_B (C_B _ _) _) ((C_B (C_A _ _) (C_C _ _),C_C (C_B _ _) _)) -> 247 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C (C_B _ _) (C_B _ _),C_B (C_A _ _) (C_B _ _))) -> 248 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_C (C_C _ _) _,C_B _ (C_C _ _))) -> 249 
  C_E (C_B (C_C _ _) _) ((C_B (C_C _ _) (C_A _ _),C_C (C_B _ _) (C_B _ _))) -> 250 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_C _ _,C_B _ (C_C _ _))) -> 251 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_B (C_A _ _) (C_C _ _),C_C (C_B _ _) _)) -> 252 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_B (C_B _ _) _,C_B (C_A _ _) (C_B _ _))) -> 253 
  C_E (C_C _ (C_B _ _)) ((C_A _ _,C_B (C_C _ _) (C_C _ _))) -> 254 
  C_E (C_C _ (C_A _ _)) ((C_B (C_A _ _) (C_A _ _),C_B (C_B _ _) (C_B _ _))) -> 255 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_B (C_B _ _) (C_A _ _),C_B (C_A _ _) (C_B _ _))) -> 256 
  C_E (C_B (C_A _ _) _) ((C_B (C_B _ _) _,C_B (C_A _ _) (C_C _ _))) -> 257 
  C_E (C_C (C_C _ _) _) ((C_C _ (C_B _ _),C_C (C_B _ _) _)) -> 258 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_B (C_B _ _) (C_A _ _),C_B (C_B _ _) (C_A _ _))) -> 259 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_B (C_A _ _) (C_C _ _),C_B (C_B _ _) _)) -> 260 
  C_E (C_A _ (C_B _ _)) ((C_C (C_C _ _) _,C_C (C_B _ _) _)) -> 261 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_C (C_A _ _) (C_B _ _),C_B (C_C _ _) (C_C _ _))) -> 262 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C (C_B _ _) (C_C _ _),C_A _ (C_A _ _))) -> 263 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_C (C_C _ _) _,C_B (C_A _ _) (C_C _ _))) -> 264 
  C_E (C_A _ (C_C _ _)) ((C_C (C_B _ _) (C_B _ _),C_A _ _)) -> 265 
  C_E (C_C _ (C_C _ _)) ((C_A _ (C_B _ _),C_C (C_A _ _) _)) -> 266 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_B (C_A _ _) (C_A _ _),C_A _ (C_B _ _))) -> 267 
  C_E (C_B _ (C_B _ _)) ((C_B _ (C_B _ _),C_B (C_C _ _) _)) -> 268 
  C_E (C_C (C_A _ _) _) ((C_C (C_A _ _) (C_A _ _),C_B (C_A _ _) (C_C _ _))) -> 269 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_A _ _,C_A _ (C_C _ _))) -> 270 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_A _ (C_A _ _),C_C _ (C_C _ _))) -> 271 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_B (C_C _ _) (C_C _ _),C_C (C_C _ _) (C_A _ _))) -> 272 
  C_E (C_C _ (C_B _ _)) ((C_B (C_A _ _) (C_C _ _),C_B (C_B _ _) (C_A _ _))) -> 273 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_B (C_C _ _) (C_B _ _),C_C (C_B _ _) _)) -> 274 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B (C_A _ _) (C_A _ _),C_C (C_B _ _) (C_B _ _))) -> 275 
  C_E _ ((C_C _ (C_A _ _),C_B _ (C_A _ _))) -> 276 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_B (C_C _ _) _,C_C (C_B _ _) _)) -> 277 
  C_E (C_B _ (C_A _ _)) ((C_C _ _,C_C _ (C_A _ _))) -> 278 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_B _ _,C_B (C_B _ _) _)) -> 279 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_B (C_C _ _) (C_A _ _),C_A _ (C_A _ _))) -> 280 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_A _ (C_B _ _),C_A _ (C_C _ _))) -> 281 
  C_E (C_C _ (C_C _ _)) ((C_B (C_B _ _) (C_A _ _),C_C _ (C_C _ _))) -> 282 
  C_E (C_A _ (C_C _ _)) ((C_B (C_B _ _) _,C_B (C_C _ _) (C_A _ _))) -> 283 
  C_E (C_A _ _) ((C_B (C_C _ _) (C_B _ _),C_B (C_B _ _) (C_B _ _))) -> 284 
  C_E (C_A _ (C_C _ _)) ((C_C _ (C_A _ _),C_B (C_B _ _) (C_B _ _))) -> 285 
  C_E (C_B (C_C _ _) _) ((C_C (C_B _ _) (C_A _ _),C_C (C_B _ _) (C_C _ _))) -> 286 
  C_E (C_B (C_B _ _) _) ((C_B (C_C _ _) _,C_B _ (C_C _ _))) -> 287 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_B _ (C_B _ _),C_B (C_A _ _) _)) -> 288 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_A _ (C_A _ _),C_B _ (C_A _ _))) -> 289 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_B (C_A _ _) (C_A _ _),C_B _ (C_C _ _))) -> 290 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_B (C_B _ _) (C_C _ _),C_B (C_C _ _) (C_A _ _))) -> 291 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_B (C_C _ _) (C_A _ _),C_C (C_A _ _) (C_B _ _))) -> 292 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_C (C_B _ _) _,C_B (C_B _ _) _)) -> 293 
  C_E (C_B _ (C_B _ _)) ((C_C (C_C _ _) _,C_B _ (C_C _ _))) -> 294 
  C_E (C_B _ (C_C _ _)) ((C_C (C_C _ _) _,C_C _ (C_A _ _))) -> 295 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_B (C_C _ _) (C_B _ _),C_B (C_A _ _) (C_C _ _))) -> 296 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_B (C_A _ _) (C_A _ _),C_C (C_B _ _) (C_A _ _))) -> 297 
  C_E (C_B _ (C_A _ _)) ((C_B (C_A _ _) (C_C _ _),C_B (C_A _ _) (C_C _ _))) -> 298 
  C_E (C_C (C_A _ _) _) ((C_C (C_B _ _) (C_C _ _),C_B (C_B _ _) (C_A _ _))) -> 299 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_C (C_B _ _) (C_C _ _),C_B (C_C _ _) _)) -> 300 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_A _ (C_A _ _),C_B (C_A _ _) (C_B _ _))) -> 301 
  C_E (C_B (C_C _ _) _) ((C_A _ (C_A _ _),C_C (C_A _ _) (C_A _ _))) -> 302 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_B (C_B _ _) _,C_A _ (C_B _ _))) -> 303 
  C_E (C_B _ _) ((C_C (C_A _ _) (C_C _ _),C_A _ _)) -> 304 
  C_E (C_C _ (C_C _ _)) ((C_A _ (C_C _ _),C_B _ (C_A _ _))) -> 305 
  C_E (C_B _ (C_B _ _)) ((C_B (C_C _ _) (C_C _ _),C_A _ (C_B _ _))) -> 306 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C (C_C _ _) (C_A _ _),C_C (C_A _ _) _)) -> 307 
  C_E (C_C _ (C_A _ _)) ((C_B _ _,C_B (C_C _ _) (C_B _ _))) -> 308 
  C_E (C_B (C_B _ _) _) ((C_B (C_A _ _) (C_A _ _),C_A _ (C_A _ _))) -> 309 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C (C_C _ _) (C_A _ _),C_B (C_C _ _) (C_C _ _))) -> 310 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_C _ (C_A _ _),C_C (C_C _ _) (C_A _ _))) -> 311 
  C_E (C_C _ _) ((C_C (C_C _ _) _,C_C (C_A _ _) (C_C _ _))) -> 312 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_C _ _,C_C (C_B _ _) (C_C _ _))) -> 313 
  C_E (C_C _ (C_C _ _)) ((C_C (C_A _ _) (C_B _ _),C_B _ (C_A _ _))) -> 314 
  C_E (C_B _ (C_B _ _)) ((C_B (C_B _ _) (C_A _ _),C_C (C_B _ _) (C_C _ _))) -> 315 
  C_E (C_A _ (C_B _ _)) ((C_B (C_B _ _) (C_B _ _),C_C (C_C _ _) _)) -> 316 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_C (C_B _ _) _,C_B _ (C_A _ _))) -> 317 
  C_E (C_B (C_A _ _) _) ((C_B (C_B _ _) (C_A _ _),C_C (C_A _ _) _)) -> 318 
  C_E _ ((C_C (C_A _ _) (C_B _ _),C_B _ _)) -> 319 
  C_E (C_A _ (C_B _ _)) ((C_C _ (C_B _ _),C_B (C_B _ _) (C_C _ _))) -> 320 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_C _ _,C_C (C_B _ _) (C_C _ _))) -> 321 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_B _ (C_B _ _),C_A _ (C_C _ _))) -> 322 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_C (C_A _ _) (C_B _ _),C_B _ (C_B _ _))) -> 323 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_A _ (C_B _ _),C_B (C_C _ _) (C_A _ _))) -> 324 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B (C_A _ _) _,C_B _ (C_C _ _))) -> 325 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_B (C_A _ _) (C_A _ _),C_C _ (C_A _ _))) -> 326 
  C_E (C_B _ (C_C _ _)) ((C_C (C_B _ _) (C_A _ _),C_B (C_C _ _) (C_B _ _))) -> 327 
  C_E (C_B _ _) ((C_B (C_A _ _) (C_B _ _),C_C (C_A _ _) _)) -> 328 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_C (C_C _ _) (C_B _ _),C_B (C_B _ _) (C_B _ _))) -> 329 
  C_E (C_A _ (C_B _ _)) ((C_C _ (C_A _ _),C_B (C_B _ _) (C_B _ _))) -> 330 
  C_E (C_C (C_A _ _) _) ((C_C (C_A _ _) (C_C _ _),C_C _ (C_A _ _))) -> 331 
  C_E (C_A _ (C_C _ _)) ((C_B (C_A _ _) (C_C _ _),C_C (C_C _ _) (C_B _ _))) -> 332 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_B (C_C _ _) (C_A _ _),C_C (C_C _ _) (C_B _ _))) -> 333 
  C_E (C_C _ (C_B _ _)) ((C_B (C_C _ _) (C_B _ _),C_B _ (C_C _ _))) -> 334 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B (C_B _ _) (C_C _ _),C_C (C_C _ _) (C_C _ _))) -> 335 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_C _ (C_A _ _),C_B (C_C _ _) _)) -> 336 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_B (C_B _ _) (C_C _ _),C_C (C_A _ _) (C_B _ _))) -> 337 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_B (C_C _ _) (C_A _ _),C_B (C_A _ _) (C_C _ _))) -> 338 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_B (C_A _ _) (C_A _ _),C_B _ (C_C _ _))) -> 339 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_C (C_A _ _) (C_A _ _),C_C (C_A _ _) (C_B _ _))) -> 340 
  C_E (C_C (C_A _ _) _) ((C_B (C_C _ _) (C_B _ _),C_B (C_B _ _) (C_C _ _))) -> 341 
  C_E (C_B _ (C_A _ _)) ((C_C (C_C _ _) (C_A _ _),C_B (C_B _ _) (C_B _ _))) -> 342 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_C (C_B _ _) (C_C _ _),C_A _ (C_A _ _))) -> 343 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_A _ (C_A _ _),C_B (C_A _ _) _)) -> 344 
  C_E (C_C (C_B _ _) _) ((C_A _ (C_A _ _),C_B (C_A _ _) (C_C _ _))) -> 345 
  C_E (C_C _ (C_C _ _)) ((C_C (C_C _ _) (C_C _ _),C_B (C_A _ _) (C_B _ _))) -> 346 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B (C_A _ _) _,C_B (C_B _ _) _)) -> 347 
  C_E (C_C _ (C_B _ _)) ((C_B _ (C_B _ _),C_C (C_C _ _) (C_C _ _))) -> 348 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_C (C_C _ _) (C_B _ _),C_B (C_B _ _) (C_A _ _))) -> 349 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_C _ (C_B _ _),C_B (C_B _ _) (C_B _ _))) -> 350 
  C_E (C_A _ (C_C _ _)) ((C_C (C_A _ _) (C_B _ _),C_B (C_B _ _) (C_C _ _))) -> 351 
  C_E (C_A _ (C_C _ _)) ((C_B (C_A _ _) (C_C _ _),C_C _ (C_B _ _))) -> 352 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_B _ _,C_C _ _)) -> 353 
  C_E (C_A _ _) ((C_C (C_C _ _) _,C_C (C_C _ _) (C_B _ _))) -> 354 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_B (C_A _ _) (C_C _ _),C_C (C_C _ _) _)) -> 355 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_B (C_A _ _) (C_A _ _),C_A _ (C_C _ _))) -> 356 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_B (C_C _ _) _,C_A _ _)) -> 357 
  C_E (C_A _ _) ((C_C (C_A _ _) _,C_B (C_C _ _) (C_A _ _))) -> 358 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B (C_C _ _) _,C_B (C_B _ _) _)) -> 359 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_A _ (C_B _ _),C_B _ (C_B _ _))) -> 360 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_A _ (C_B _ _),C_C (C_B _ _) (C_A _ _))) -> 361 
  C_E (C_B (C_B _ _) _) ((C_A _ (C_B _ _),C_A _ (C_B _ _))) -> 362 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_C (C_A _ _) _,C_B (C_C _ _) _)) -> 363 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_C (C_A _ _) _,C_C _ _)) -> 364 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_C (C_B _ _) (C_A _ _),C_B (C_B _ _) (C_C _ _))) -> 365 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_C (C_A _ _) (C_B _ _),C_B _ (C_B _ _))) -> 366 
  C_E (C_A _ _) ((C_C _ (C_C _ _),C_B (C_C _ _) (C_A _ _))) -> 367 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_C (C_A _ _) (C_B _ _),C_B (C_C _ _) (C_C _ _))) -> 368 
  C_E (C_C (C_A _ _) _) ((C_B (C_A _ _) _,C_C _ (C_A _ _))) -> 369 
  C_E (C_B _ (C_C _ _)) ((C_C (C_C _ _) (C_B _ _),C_B (C_C _ _) (C_A _ _))) -> 370 
  C_E (C_B _ (C_A _ _)) ((C_B _ (C_C _ _),C_B (C_C _ _) _)) -> 371 
  C_E (C_C (C_A _ _) _) ((C_C (C_A _ _) (C_A _ _),C_C _ (C_C _ _))) -> 372 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_A _ _,C_B (C_C _ _) _)) -> 373 
  C_E (C_A _ _) ((C_B _ (C_B _ _),C_A _ (C_B _ _))) -> 374 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_C (C_B _ _) _,C_C (C_A _ _) (C_C _ _))) -> 375 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B (C_C _ _) (C_B _ _),C_C _ (C_A _ _))) -> 376 
  C_E (C_A _ _) ((C_C (C_C _ _) (C_B _ _),C_C _ _)) -> 377 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_C _ (C_C _ _),C_B (C_B _ _) (C_B _ _))) -> 378 
  C_E (C_C _ (C_B _ _)) ((C_C (C_A _ _) _,C_C _ _)) -> 379 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_B (C_A _ _) (C_B _ _),C_B (C_A _ _) (C_B _ _))) -> 380 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_C _ _,C_C (C_B _ _) (C_B _ _))) -> 381 
  C_E (C_B (C_C _ _) _) ((C_C (C_C _ _) (C_C _ _),C_C (C_C _ _) (C_C _ _))) -> 382 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_C (C_C _ _) (C_B _ _),C_C (C_B _ _) (C_B _ _))) -> 383 
  C_E (C_C (C_A _ _) _) ((C_B _ (C_B _ _),C_B (C_C _ _) (C_B _ _))) -> 384 
  C_E (C_C _ (C_B _ _)) ((C_A _ (C_A _ _),C_C (C_A _ _) (C_A _ _))) -> 385 
  C_E (C_B (C_C _ _) _) ((C_C (C_B _ _) (C_A _ _),C_B (C_B _ _) (C_A _ _))) -> 386 
  C_E (C_B (C_B _ _) _) ((C_B (C_B _ _) (C_A _ _),C_B (C_C _ _) (C_C _ _))) -> 387 
  C_E (C_B (C_A _ _) _) ((C_C _ (C_A _ _),C_B (C_B _ _) (C_B _ _))) -> 388 
  C_E (C_C _ (C_A _ _)) ((C_C (C_A _ _) _,C_B (C_A _ _) (C_A _ _))) -> 389 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_A _ _,C_C (C_C _ _) _)) -> 390 
  C_E (C_B (C_A _ _) _) ((C_C (C_C _ _) (C_B _ _),C_B (C_C _ _) _)) -> 391 
  C_E (C_C (C_C _ _) _) ((C_B (C_B _ _) (C_C _ _),C_C (C_C _ _) (C_A _ _))) -> 392 
  C_E (C_A _ (C_B _ _)) ((C_A _ _,C_B (C_A _ _) (C_A _ _))) -> 393 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_C (C_B _ _) (C_C _ _),C_B _ (C_A _ _))) -> 394 
  C_E (C_B _ (C_A _ _)) ((C_B (C_B _ _) (C_A _ _),C_A _ (C_B _ _))) -> 395 
  C_E (C_C (C_C _ _) _) ((C_A _ _,C_B (C_A _ _) (C_A _ _))) -> 396 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_B (C_A _ _) (C_B _ _),C_B (C_B _ _) _)) -> 397 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_C _ (C_B _ _),C_C (C_A _ _) (C_A _ _))) -> 398 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C (C_C _ _) (C_B _ _),C_B (C_B _ _) (C_C _ _))) -> 399 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_B (C_B _ _) (C_A _ _),C_A _ (C_C _ _))) -> 400 
  C_E (C_C _ (C_B _ _)) ((C_A _ (C_C _ _),C_B (C_A _ _) _)) -> 401 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_C (C_B _ _) _,C_B (C_A _ _) (C_C _ _))) -> 402 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C _ (C_C _ _),C_A _ _)) -> 403 
  C_E (C_A _ (C_A _ _)) ((C_B _ (C_B _ _),C_B (C_C _ _) (C_C _ _))) -> 404 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_C (C_C _ _) (C_C _ _),C_C (C_C _ _) (C_A _ _))) -> 405 
  C_E (C_C _ _) ((C_C _ (C_B _ _),C_C (C_B _ _) (C_C _ _))) -> 406 
  C_E (C_B _ (C_A _ _)) ((C_B (C_C _ _) _,C_B (C_B _ _) (C_B _ _))) -> 407 
  C_E (C_A _ (C_B _ _)) ((C_C (C_C _ _) (C_A _ _),C_C _ (C_B _ _))) -> 408 
  C_E _ ((C_C (C_A _ _) (C_B _ _),C_C (C_A _ _) (C_A _ _))) -> 409 
  C_E (C_B (C_C _ _) _) ((C_C (C_A _ _) (C_C _ _),C_B _ (C_C _ _))) -> 410 
  C_E (C_C _ (C_C _ _)) ((C_C _ _,C_B (C_B _ _) (C_A _ _))) -> 411 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_C _ (C_B _ _),C_B (C_B _ _) (C_A _ _))) -> 412 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_B (C_B _ _) (C_B _ _),C_B (C_A _ _) (C_A _ _))) -> 413 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_B _ (C_C _ _),C_B _ (C_A _ _))) -> 414 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_C (C_C _ _) (C_B _ _),C_A _ _)) -> 415 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_B (C_C _ _) (C_A _ _),C_A _ _)) -> 416 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B (C_A _ _) (C_C _ _),C_B _ (C_C _ _))) -> 417 
  C_E (C_C (C_B _ _) _) ((C_B (C_B _ _) (C_C _ _),C_B (C_B _ _) (C_B _ _))) -> 418 
  C_E (C_A _ (C_C _ _)) ((C_B _ _,C_B (C_C _ _) (C_C _ _))) -> 419 
  C_E (C_C _ (C_B _ _)) ((C_B _ (C_A _ _),C_C (C_A _ _) (C_A _ _))) -> 420 
  C_E (C_C (C_A _ _) _) ((C_B (C_A _ _) (C_C _ _),C_B (C_A _ _) _)) -> 421 
  C_E (C_B _ _) ((C_C (C_A _ _) (C_B _ _),C_B _ (C_B _ _))) -> 422 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_B (C_A _ _) _,C_B (C_A _ _) _)) -> 423 
  C_E (C_A _ (C_A _ _)) ((C_C _ (C_B _ _),C_B _ (C_A _ _))) -> 424 
  C_E (C_C (C_A _ _) _) ((C_C (C_A _ _) _,C_C _ _)) -> 425 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B (C_C _ _) (C_A _ _),C_C (C_B _ _) _)) -> 426 
  C_E (C_A _ (C_B _ _)) ((C_C _ (C_A _ _),C_A _ (C_C _ _))) -> 427 
  C_E (C_A _ (C_B _ _)) ((C_B (C_A _ _) (C_C _ _),C_C (C_A _ _) _)) -> 428 
  C_E (C_C _ (C_A _ _)) ((C_B (C_A _ _) (C_C _ _),C_B _ _)) -> 429 
  C_E (C_B (C_B _ _) (C_B _ _)) ((C_C (C_B _ _) (C_B _ _),C_C (C_B _ _) _)) -> 430 
  C_E (C_C (C_C _ _) _) ((C_C _ _,C_C (C_A _ _) _)) -> 431 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_B (C_C _ _) _,C_B (C_A _ _) (C_A _ _))) -> 432 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_C (C_B _ _) (C_C _ _),C_B (C_A _ _) (C_C _ _))) -> 433 
  C_E (C_C (C_A _ _) _) ((C_B (C_A _ _) _,C_C (C_C _ _) (C_A _ _))) -> 434 
  C_E (C_C (C_B _ _) _) ((C_C (C_C _ _) (C_B _ _),C_A _ (C_B _ _))) -> 435 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_C (C_A _ _) (C_C _ _),C_C _ (C_A _ _))) -> 436 
  C_E (C_A _ _) ((C_B _ (C_C _ _),C_C (C_C _ _) (C_C _ _))) -> 437 
  C_E (C_B _ (C_C _ _)) ((C_B (C_B _ _) _,C_C (C_B _ _) (C_A _ _))) -> 438 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_B _ (C_A _ _),C_C (C_A _ _) (C_B _ _))) -> 439 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_C (C_A _ _) (C_B _ _),C_B (C_B _ _) (C_A _ _))) -> 440 
  C_E (C_B (C_B _ _) _) ((C_C (C_C _ _) (C_B _ _),C_B (C_A _ _) (C_B _ _))) -> 441 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_B (C_B _ _) _,C_C (C_A _ _) (C_C _ _))) -> 442 
  C_E (C_B _ (C_B _ _)) ((C_C (C_A _ _) (C_A _ _),C_A _ (C_A _ _))) -> 443 
  C_E (C_C (C_C _ _) _) ((C_A _ (C_C _ _),C_A _ (C_A _ _))) -> 444 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_A _ (C_A _ _),C_C (C_C _ _) (C_B _ _))) -> 445 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_B _ (C_A _ _),C_C (C_C _ _) (C_A _ _))) -> 446 
  C_E (C_B (C_C _ _) (C_A _ _)) ((C_B (C_A _ _) _,C_B (C_A _ _) _)) -> 447 
  C_E (C_B _ (C_A _ _)) ((C_C (C_A _ _) (C_C _ _),C_C (C_B _ _) (C_A _ _))) -> 448 
  C_E (C_C (C_B _ _) _) ((C_A _ (C_A _ _),C_C (C_B _ _) _)) -> 449 
  C_E (C_C _ (C_B _ _)) ((C_B (C_C _ _) (C_C _ _),C_A _ (C_A _ _))) -> 450 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_B (C_B _ _) _,C_B _ _)) -> 451 
  C_E (C_A _ (C_A _ _)) ((C_B (C_A _ _) (C_A _ _),C_B (C_C _ _) _)) -> 452 
  C_E (C_B (C_C _ _) _) ((C_B (C_A _ _) (C_C _ _),C_B _ (C_A _ _))) -> 453 
  C_E (C_C _ (C_C _ _)) ((C_B (C_A _ _) (C_B _ _),C_C _ (C_C _ _))) -> 454 
  C_E (C_C (C_C _ _) _) ((C_C (C_A _ _) (C_C _ _),C_B _ _)) -> 455 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_B (C_B _ _) _,C_B (C_B _ _) (C_A _ _))) -> 456 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_C (C_A _ _) (C_B _ _),C_B _ (C_A _ _))) -> 457 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_B (C_A _ _) (C_C _ _),C_C (C_A _ _) (C_B _ _))) -> 458 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_C (C_C _ _) (C_B _ _),C_A _ (C_A _ _))) -> 459 
  C_E (C_B _ _) ((C_C (C_A _ _) (C_B _ _),C_C (C_B _ _) (C_C _ _))) -> 460 
  C_E (C_B _ _) ((C_C (C_C _ _) (C_C _ _),C_C _ (C_B _ _))) -> 461 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_B (C_B _ _) (C_B _ _),C_C (C_C _ _) (C_A _ _))) -> 462 
  C_E (C_C (C_C _ _) _) ((C_C (C_A _ _) (C_C _ _),C_A _ (C_A _ _))) -> 463 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C _ (C_A _ _),C_C _ (C_B _ _))) -> 464 
  C_E (C_C (C_A _ _) _) ((C_B (C_B _ _) (C_A _ _),C_C (C_B _ _) (C_C _ _))) -> 465 
  C_E (C_B _ _) ((C_C _ (C_B _ _),C_C (C_C _ _) (C_C _ _))) -> 466 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C (C_B _ _) _,C_C (C_B _ _) (C_A _ _))) -> 467 
  C_E (C_B (C_B _ _) _) ((C_B (C_C _ _) (C_B _ _),C_B _ _)) -> 468 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B _ (C_A _ _),C_C (C_C _ _) (C_C _ _))) -> 469 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_C (C_A _ _) (C_B _ _),C_B (C_A _ _) (C_B _ _))) -> 470 
  C_E (C_C _ (C_B _ _)) ((C_A _ _,C_B (C_A _ _) _)) -> 471 
  C_E (C_B _ _) ((C_C (C_C _ _) _,C_C (C_C _ _) _)) -> 472 
  C_E (C_C (C_A _ _) _) ((C_B (C_C _ _) (C_C _ _),C_B _ (C_A _ _))) -> 473 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B _ (C_A _ _),C_C (C_B _ _) (C_A _ _))) -> 474 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_B (C_A _ _) (C_B _ _),C_C (C_C _ _) (C_B _ _))) -> 475 
  C_E (C_C _ (C_C _ _)) ((C_C _ (C_A _ _),C_C (C_A _ _) (C_A _ _))) -> 476 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_C (C_C _ _) (C_C _ _),C_C _ (C_C _ _))) -> 477 
  C_E (C_B _ (C_B _ _)) ((C_C (C_B _ _) (C_A _ _),C_B (C_B _ _) (C_B _ _))) -> 478 
  C_E (C_C _ (C_C _ _)) ((C_B (C_B _ _) (C_C _ _),C_A _ (C_B _ _))) -> 479 
  C_E (C_B (C_B _ _) _) ((C_B (C_C _ _) (C_B _ _),C_C (C_A _ _) (C_A _ _))) -> 480 
  C_E (C_C (C_C _ _) _) ((C_C (C_C _ _) _,C_B (C_A _ _) (C_B _ _))) -> 481 
  C_E (C_A _ (C_A _ _)) ((C_C (C_C _ _) _,C_B (C_C _ _) (C_B _ _))) -> 482 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_B (C_A _ _) _,C_B (C_C _ _) _)) -> 483 
  C_E (C_B _ _) ((C_C (C_C _ _) (C_C _ _),C_B (C_A _ _) (C_A _ _))) -> 484 
  C_E (C_B (C_A _ _) _) ((C_B _ (C_B _ _),C_C (C_A _ _) (C_C _ _))) -> 485 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_C (C_C _ _) (C_A _ _),C_B (C_A _ _) (C_B _ _))) -> 486 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_B (C_B _ _) _,C_A _ _)) -> 487 
  C_E (C_B _ _) ((C_B (C_B _ _) _,C_C (C_A _ _) _)) -> 488 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_C (C_C _ _) _,C_C (C_C _ _) (C_A _ _))) -> 489 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_B _ (C_B _ _),C_C (C_A _ _) _)) -> 490 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_B (C_B _ _) (C_B _ _),C_B (C_B _ _) _)) -> 491 
  C_E (C_A _ (C_C _ _)) ((C_B (C_C _ _) (C_A _ _),C_C (C_C _ _) (C_B _ _))) -> 492 
  C_E (C_C (C_C _ _) _) ((C_B (C_C _ _) (C_B _ _),C_B _ (C_B _ _))) -> 493 
  C_E (C_A _ _) ((C_B (C_B _ _) (C_B _ _),C_B _ (C_A _ _))) -> 494 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_B (C_B _ _) (C_B _ _),C_C (C_A _ _) (C_C _ _))) -> 495 
  C_E (C_A _ (C_A _ _)) ((C_C (C_A _ _) (C_C _ _),C_C (C_C _ _) _)) -> 496 
  C_E (C_B (C_A _ _) (C_B _ _)) ((C_B _ (C_B _ _),C_C _ (C_A _ _))) -> 497 
  C_E (C_C _ (C_A _ _)) ((C_C (C_B _ _) (C_A _ _),C_C (C_B _ _) (C_C _ _))) -> 498 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_B (C_A _ _) (C_C _ _),C_C (C_A _ _) _)) -> 499 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B (C_A _ _) _,C_C (C_C _ _) (C_B _ _))) -> 500 
  C_E (C_C (C_C _ _) (C_B _ _)) ((C_B _ (C_A _ _),C_B _ (C_B _ _))) -> 501 
  C_E (C_B (C_A _ _) _) ((C_A _ (C_B _ _),C_C (C_C _ _) (C_B _ _))) -> 502 
  C_E (C_C (C_B _ _) _) ((C_B _ (C_B _ _),C_C (C_C _ _) _)) -> 503 
  C_E (C_C (C_C _ _) (C_A _ _)) ((C_C _ (C_C _ _),C_B (C_B _ _) (C_C _ _))) -> 504 
  C_E (C_B (C_C _ _) _) ((C_B _ _,C_B _ (C_C _ _))) -> 505 
  C_E (C_C (C_A _ _) _) ((C_B (C_B _ _) (C_C _ _),C_B (C_C _ _) _)) -> 506 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_C (C_C _ _) _,C_C (C_A _ _) (C_C _ _))) -> 507 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_C (C_C _ _) (C_B _ _),C_C (C_A _ _) (C_B _ _))) -> 508 
  C_E (C_C (C_C _ _) (C_C _ _)) ((C_B (C_A _ _) (C_A _ _),C_C (C_C _ _) (C_C _ _))) -> 509 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_B (C_C _ _) (C_C _ _),C_C _ (C_A _ _))) -> 510 
  C_E (C_C _ (C_B _ _)) ((C_C _ _,C_C _ (C_A _ _))) -> 511 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_B (C_B _ _) _,C_B _ (C_B _ _))) -> 512 
  C_E (C_B (C_A _ _) _) ((C_B (C_C _ _) (C_A _ _),C_A _ (C_B _ _))) -> 513 
  C_E (C_C (C_B _ _) _) ((C_B (C_A _ _) (C_A _ _),C_B (C_B _ _) (C_A _ _))) -> 514 
  C_E (C_C (C_B _ _) (C_C _ _)) ((C_B (C_C _ _) (C_C _ _),C_C (C_A _ _) (C_C _ _))) -> 515 
  C_E (C_C (C_C _ _) _) ((C_C (C_A _ _) (C_B _ _),C_B (C_C _ _) (C_C _ _))) -> 516 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C (C_C _ _) (C_A _ _),C_C (C_B _ _) (C_C _ _))) -> 517 
  C_E (C_C (C_A _ _) (C_C _ _)) ((C_C (C_B _ _) (C_A _ _),C_B _ (C_B _ _))) -> 518 
  C_E (C_B _ (C_C _ _)) ((C_C (C_C _ _) _,C_B (C_B _ _) (C_B _ _))) -> 519 
  C_E (C_B _ (C_C _ _)) ((C_B (C_C _ _) (C_A _ _),C_C _ _)) -> 520 
  C_E (C_C (C_B _ _) _) ((C_B (C_B _ _) (C_B _ _),C_B (C_C _ _) (C_C _ _))) -> 521 
  C_E (C_B (C_C _ _) (C_C _ _)) ((C_C (C_C _ _) (C_C _ _),C_B (C_A _ _) _)) -> 522 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C (C_B _ _) (C_B _ _),C_C _ _)) -> 523 
  C_E (C_B (C_C _ _) (C_B _ _)) ((C_C (C_B _ _) (C_C _ _),C_B (C_B _ _) (C_A _ _))) -> 524 
  C_E (C_A _ (C_B _ _)) ((C_B (C_C _ _) (C_B _ _),C_B (C_B _ _) (C_C _ _))) -> 525 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_C _ _,C_C (C_B _ _) _)) -> 526 
  C_E (C_A _ _) ((C_B (C_B _ _) _,C_C (C_C _ _) (C_B _ _))) -> 527 
  C_E (C_A _ _) ((C_A _ (C_A _ _),C_C (C_C _ _) _)) -> 528 
  C_E (C_C (C_B _ _) (C_A _ _)) ((C_A _ (C_A _ _),C_B (C_B _ _) (C_C _ _))) -> 529 
