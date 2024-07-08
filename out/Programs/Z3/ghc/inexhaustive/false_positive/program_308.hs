module Program_27 () where 

 main = print $ show v_b
data B_A = C_A B_A B_B
data B_B = C_B B_A | C_C | C_D B_A ((B_A,B_A))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_A (C_A _ _) (C_D _ _)) -> 0 
  C_B _ -> 1 
  C_B (C_A (C_A _ _) (C_B _)) -> 2 
  C_B (C_A (C_A _ _) C_C) -> 3 
  C_B (C_A _ C_C) -> 4 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_D _ _),C_A _ C_C)) -> 5 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) C_C,C_A _ _)) -> 6 
  C_D (C_A _ C_C) ((C_A (C_A _ _) _,C_A _ (C_B _))) -> 7 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A _ _)) -> 8 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 9 
  C_D (C_A _ _) ((C_A _ C_C,C_A (C_A _ _) C_C)) -> 10 
  C_D (C_A (C_A _ _) C_C) ((C_A _ _,C_A _ (C_B _))) -> 11 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ _,C_A _ (C_D _ _))) -> 12 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) _)) -> 13 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) C_C)) -> 14 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) _)) -> 15 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) _)) -> 16 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_B _))) -> 17 
  C_D (C_A _ (C_D _ _)) ((C_A _ _,C_A (C_A _ _) (C_B _))) -> 18 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_D _ _),C_A _ C_C)) -> 19 
  C_D (C_A _ C_C) ((C_A (C_A _ _) C_C,C_A _ (C_D _ _))) -> 20 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_B _))) -> 21 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) _,C_A _ (C_D _ _))) -> 22 
  C_D _ ((C_A _ (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 23 
  C_D (C_A _ _) ((C_A (C_A _ _) _,C_A _ C_C)) -> 24 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) _)) -> 25 
  C_D (C_A _ _) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_D _ _))) -> 26 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) C_C)) -> 27 
  C_D _ ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) C_C)) -> 28 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_B _),C_A _ (C_D _ _))) -> 29 
  C_D _ ((C_A _ _,C_A (C_A _ _) (C_B _))) -> 30 
  C_D (C_A _ (C_B _)) ((C_A _ (C_B _),C_A _ _)) -> 31 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) C_C)) -> 32 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_B _),C_A _ C_C)) -> 33 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) _)) -> 34 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) _,C_A _ (C_D _ _))) -> 35 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_D _ _),C_A _ (C_B _))) -> 36 
  C_D (C_A _ C_C) ((C_A _ (C_D _ _),C_A _ (C_B _))) -> 37 
  C_D _ ((C_A _ C_C,C_A _ _)) -> 38 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_D _ _),C_A _ _)) -> 39 
  C_D (C_A _ _) ((C_A (C_A _ _) _,C_A _ (C_D _ _))) -> 40 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) _,C_A (C_A _ _) _)) -> 41 
  C_D _ ((C_A (C_A _ _) C_C,C_A _ (C_B _))) -> 42 
  C_D (C_A _ C_C) ((C_A _ (C_B _),C_A (C_A _ _) (C_B _))) -> 43 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A _ C_C)) -> 44 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_D _ _),C_A (C_A _ _) _)) -> 45 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_B _))) -> 46 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) C_C)) -> 47 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 48 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ C_C,C_A (C_A _ _) (C_B _))) -> 49 
  C_D (C_A (C_A _ _) _) ((C_A _ _,C_A _ (C_D _ _))) -> 50 
  C_D (C_A _ C_C) ((C_A _ (C_D _ _),C_A _ (C_D _ _))) -> 51 
  C_D (C_A _ (C_B _)) ((C_A _ C_C,C_A (C_A _ _) (C_D _ _))) -> 52 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_D _ _),C_A _ _)) -> 53 
  C_D (C_A (C_A _ _) C_C) ((C_A _ _,C_A (C_A _ _) _)) -> 54 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_B _),C_A _ (C_B _))) -> 55 
  C_D (C_A _ _) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_B _))) -> 56 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ _,C_A (C_A _ _) _)) -> 57 
  C_D (C_A (C_A _ _) _) ((C_A _ C_C,C_A _ _)) -> 58 
  C_D (C_A _ _) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_D _ _))) -> 59 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) C_C,C_A _ (C_D _ _))) -> 60 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_D _ _),C_A _ C_C)) -> 61 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 62 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_B _),C_A _ (C_B _))) -> 63 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_B _),C_A (C_A _ _) _)) -> 64 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_B _),C_A _ (C_D _ _))) -> 65 
  C_D (C_A _ (C_B _)) ((C_A _ (C_B _),C_A (C_A _ _) (C_D _ _))) -> 66 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) _,C_A _ (C_B _))) -> 67 
  C_D (C_A _ (C_D _ _)) ((C_A _ _,C_A (C_A _ _) (C_D _ _))) -> 68 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) _,C_A _ (C_B _))) -> 69 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_D _ _),C_A (C_A _ _) C_C)) -> 70 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_B _))) -> 71 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) C_C,C_A (C_A _ _) C_C)) -> 72 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) _)) -> 73 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ _,C_A (C_A _ _) (C_B _))) -> 74 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) C_C,C_A _ _)) -> 75 
  C_D (C_A _ _) ((C_A _ _,C_A _ (C_B _))) -> 76 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_B _))) -> 77 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_D _ _),C_A _ (C_D _ _))) -> 78 
  C_D (C_A _ (C_B _)) ((C_A _ C_C,C_A _ (C_D _ _))) -> 79 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) C_C,C_A _ _)) -> 80 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_B _))) -> 81 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_B _))) -> 82 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_B _))) -> 83 
  C_D (C_A (C_A _ _) _) ((C_A _ _,C_A (C_A _ _) _)) -> 84 
  C_D _ ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_D _ _))) -> 85 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 86 
  C_D (C_A _ _) ((C_A _ C_C,C_A (C_A _ _) _)) -> 87 
  C_D (C_A _ _) ((C_A _ _,C_A _ C_C)) -> 88 
  C_D (C_A (C_A _ _) C_C) ((C_A _ C_C,C_A _ (C_B _))) -> 89 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_B _),C_A _ _)) -> 90 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) C_C)) -> 91 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A _ (C_D _ _))) -> 92 
  C_D (C_A _ C_C) ((C_A _ (C_B _),C_A _ C_C)) -> 93 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_D _ _),C_A _ (C_D _ _))) -> 94 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A _ _)) -> 95 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 96 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_D _ _))) -> 97 
  C_D (C_A (C_A _ _) C_C) ((C_A _ C_C,C_A _ (C_D _ _))) -> 98 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ _,C_A _ (C_B _))) -> 99 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_D _ _),C_A (C_A _ _) (C_B _))) -> 100 
  C_D (C_A _ (C_B _)) ((C_A _ C_C,C_A (C_A _ _) _)) -> 101 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) _,C_A _ _)) -> 102 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_B _),C_A _ (C_B _))) -> 103 
  C_D _ ((C_A (C_A _ _) _,C_A (C_A _ _) (C_B _))) -> 104 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) _,C_A _ C_C)) -> 105 
  C_D (C_A (C_A _ _) C_C) ((C_A _ _,C_A (C_A _ _) C_C)) -> 106 
  C_D (C_A _ (C_B _)) ((C_A _ (C_B _),C_A _ (C_D _ _))) -> 107 
  C_D _ ((C_A (C_A _ _) _,C_A _ _)) -> 108 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_D _ _),C_A (C_A _ _) C_C)) -> 109 
  C_D (C_A (C_A _ _) _) ((C_A _ _,C_A _ _)) -> 110 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_D _ _),C_A _ (C_D _ _))) -> 111 
  C_D (C_A _ C_C) ((C_A _ _,C_A (C_A _ _) (C_D _ _))) -> 112 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 113 
  C_D _ ((C_A _ (C_B _),C_A _ _)) -> 114 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ _,C_A (C_A _ _) C_C)) -> 115 
  C_D (C_A (C_A _ _) _) ((C_A _ C_C,C_A (C_A _ _) C_C)) -> 116 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ _,C_A _ C_C)) -> 117 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_D _ _))) -> 118 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) C_C,C_A _ (C_B _))) -> 119 
  C_D (C_A _ _) _ -> 120 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_B _))) -> 121 
  C_D (C_A _ _) ((C_A _ (C_B _),C_A _ (C_B _))) -> 122 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A _ (C_B _))) -> 123 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ _,C_A _ (C_B _))) -> 124 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_B _),C_A _ _)) -> 125 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_B _),C_A _ (C_D _ _))) -> 126 
  C_D (C_A _ _) ((C_A _ (C_B _),C_A _ C_C)) -> 127 
  C_D _ ((C_A (C_A _ _) C_C,C_A _ (C_D _ _))) -> 128 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ _,C_A (C_A _ _) C_C)) -> 129 
  C_D (C_A _ C_C) ((C_A _ (C_B _),C_A _ _)) -> 130 
  C_D (C_A _ (C_B _)) ((C_A _ (C_B _),C_A _ (C_B _))) -> 131 
  C_D (C_A _ C_C) ((C_A _ (C_D _ _),C_A _ _)) -> 132 
  C_D (C_A _ C_C) ((C_A _ C_C,C_A _ _)) -> 133 
  C_D (C_A _ (C_D _ _)) ((C_A _ _,C_A _ C_C)) -> 134 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) C_C)) -> 135 
  C_D _ ((C_A _ (C_D _ _),C_A _ (C_D _ _))) -> 136 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_D _ _),C_A _ C_C)) -> 137 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_B _))) -> 138 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_D _ _))) -> 139 
  C_D _ ((C_A _ C_C,C_A (C_A _ _) (C_D _ _))) -> 140 
  C_D _ ((C_A (C_A _ _) (C_D _ _),C_A _ _)) -> 141 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_D _ _))) -> 142 
  C_D (C_A (C_A _ _) _) ((C_A _ _,C_A (C_A _ _) (C_D _ _))) -> 143 
  C_D (C_A _ (C_B _)) ((C_A _ (C_B _),C_A (C_A _ _) C_C)) -> 144 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_D _ _),C_A _ _)) -> 145 
  C_D (C_A _ C_C) ((C_A (C_A _ _) _,C_A (C_A _ _) C_C)) -> 146 
  C_D (C_A _ (C_D _ _)) ((C_A _ _,C_A _ _)) -> 147 
  C_D _ ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) _)) -> 148 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) C_C,C_A _ C_C)) -> 149 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_B _),C_A _ (C_B _))) -> 150 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A _ C_C)) -> 151 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ (C_D _ _),C_A (C_A _ _) C_C)) -> 152 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ C_C,C_A (C_A _ _) (C_D _ _))) -> 153 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) _)) -> 154 
  C_D (C_A _ _) ((C_A _ _,C_A _ _)) -> 155 
  C_D (C_A (C_A _ _) C_C) ((C_A _ C_C,C_A (C_A _ _) (C_D _ _))) -> 156 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ C_C,C_A _ (C_B _))) -> 157 
  C_D _ ((C_A _ C_C,C_A (C_A _ _) (C_B _))) -> 158 
  C_D (C_A _ _) ((C_A (C_A _ _) C_C,C_A _ (C_B _))) -> 159 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 160 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_B _))) -> 161 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_D _ _),C_A _ C_C)) -> 162 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) C_C)) -> 163 
  C_D (C_A _ _) ((C_A _ _,C_A (C_A _ _) C_C)) -> 164 
  C_D _ ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 165 
  C_D _ ((C_A (C_A _ _) _,C_A _ (C_D _ _))) -> 166 
  C_D (C_A _ _) ((C_A (C_A _ _) C_C,C_A (C_A _ _) C_C)) -> 167 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_B _),C_A _ _)) -> 168 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_B _),C_A _ (C_B _))) -> 169 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_B _),C_A _ C_C)) -> 170 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_B _),C_A (C_A _ _) (C_D _ _))) -> 171 
  C_D (C_A (C_A _ _) C_C) ((C_A _ _,C_A _ C_C)) -> 172 
  C_D _ ((C_A _ (C_B _),C_A _ (C_B _))) -> 173 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) _)) -> 174 
  C_D (C_A (C_A _ _) _) ((C_A _ C_C,C_A (C_A _ _) (C_D _ _))) -> 175 
  C_D (C_A _ _) ((C_A _ (C_D _ _),C_A (C_A _ _) (C_B _))) -> 176 
  C_D (C_A _ C_C) ((C_A _ (C_B _),C_A (C_A _ _) C_C)) -> 177 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_B _))) -> 178 
  C_D _ ((C_A (C_A _ _) _,C_A (C_A _ _) C_C)) -> 179 
  C_D _ ((C_A _ (C_B _),C_A _ (C_D _ _))) -> 180 
  C_D (C_A (C_A _ _) (C_D _ _)) _ -> 181 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ C_C,C_A (C_A _ _) C_C)) -> 182 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_D _ _),C_A _ C_C)) -> 183 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ _,C_A _ _)) -> 184 
  C_D _ ((C_A (C_A _ _) _,C_A (C_A _ _) (C_D _ _))) -> 185 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_B _))) -> 186 
  C_D (C_A _ (C_B _)) _ -> 187 
  C_D (C_A (C_A _ _) C_C) _ -> 188 
  C_D _ ((C_A (C_A _ _) (C_B _),C_A _ _)) -> 189 
  C_D _ ((C_A _ _,C_A _ C_C)) -> 190 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) C_C)) -> 191 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A _ C_C)) -> 192 
  C_D _ ((C_A _ C_C,C_A _ C_C)) -> 193 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) _,C_A _ _)) -> 194 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_D _ _),C_A _ (C_D _ _))) -> 195 
  C_D (C_A _ _) ((C_A _ C_C,C_A (C_A _ _) (C_B _))) -> 196 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_D _ _),C_A _ _)) -> 197 
  C_D (C_A _ _) ((C_A _ _,C_A (C_A _ _) _)) -> 198 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_B _),C_A _ (C_B _))) -> 199 
  C_D (C_A _ C_C) ((C_A _ _,C_A _ (C_B _))) -> 200 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_B _),C_A _ (C_D _ _))) -> 201 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_B _),C_A _ C_C)) -> 202 
  C_D (C_A _ C_C) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_B _))) -> 203 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ (C_D _ _),C_A _ C_C)) -> 204 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_D _ _),C_A _ (C_B _))) -> 205 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_D _ _))) -> 206 
  C_D (C_A _ _) ((C_A _ C_C,C_A _ (C_D _ _))) -> 207 
  C_D (C_A _ (C_D _ _)) ((C_A _ C_C,C_A _ C_C)) -> 208 
  C_D _ ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) _)) -> 209 
  C_D (C_A _ _) ((C_A _ (C_B _),C_A _ (C_D _ _))) -> 210 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_D _ _))) -> 211 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_B _),C_A _ (C_D _ _))) -> 212 
  C_D (C_A _ (C_D _ _)) _ -> 213 
  C_D (C_A _ C_C) ((C_A (C_A _ _) _,C_A _ C_C)) -> 214 
  C_D (C_A _ C_C) ((C_A _ (C_D _ _),C_A (C_A _ _) C_C)) -> 215 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_B _),C_A _ C_C)) -> 216 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) C_C)) -> 217 
  C_D _ ((C_A (C_A _ _) C_C,C_A (C_A _ _) C_C)) -> 218 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_D _ _),C_A _ (C_D _ _))) -> 219 
  C_D _ ((C_A _ _,C_A _ (C_D _ _))) -> 220 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_B _))) -> 221 
  C_D _ ((C_A _ _,C_A (C_A _ _) (C_D _ _))) -> 222 
  C_D _ ((C_A _ (C_B _),C_A (C_A _ _) C_C)) -> 223 
  C_D (C_A _ (C_D _ _)) ((C_A _ C_C,C_A _ (C_B _))) -> 224 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_B _),C_A _ (C_B _))) -> 225 
  C_D (C_A (C_A _ _) _) _ -> 226 
  C_D _ ((C_A _ (C_D _ _),C_A (C_A _ _) C_C)) -> 227 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_B _),C_A (C_A _ _) (C_B _))) -> 228 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_D _ _))) -> 229 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ (C_B _),C_A (C_A _ _) C_C)) -> 230 
  C_D (C_A _ C_C) ((C_A _ _,C_A _ C_C)) -> 231 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ C_C,C_A _ C_C)) -> 232 
  C_D _ ((C_A _ C_C,C_A (C_A _ _) C_C)) -> 233 
  C_D (C_A _ (C_D _ _)) ((C_A _ C_C,C_A (C_A _ _) (C_D _ _))) -> 234 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_B _),C_A _ _)) -> 235 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A _ (C_B _))) -> 236 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_D _ _),C_A _ C_C)) -> 237 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_B _))) -> 238 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) C_C,C_A (C_A _ _) C_C)) -> 239 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ (C_B _),C_A _ C_C)) -> 240 
  C_D (C_A _ C_C) ((C_A _ (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 241 
  C_D _ ((C_A _ _,C_A (C_A _ _) _)) -> 242 
  C_D (C_A _ C_C) ((C_A _ _,C_A (C_A _ _) _)) -> 243 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_B _))) -> 244 
  C_D _ ((C_A (C_A _ _) (C_B _),C_A _ (C_B _))) -> 245 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_B _),C_A (C_A _ _) (C_B _))) -> 246 
  C_D (C_A _ C_C) ((C_A _ (C_B _),C_A (C_A _ _) _)) -> 247 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) C_C,C_A _ _)) -> 248 
  C_D (C_A _ (C_B _)) ((C_A _ _,C_A _ C_C)) -> 249 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A _ (C_D _ _))) -> 250 
  C_D (C_A _ C_C) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_D _ _))) -> 251 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ (C_B _),C_A (C_A _ _) (C_B _))) -> 252 
  C_D _ ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_B _))) -> 253 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_B _))) -> 254 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ (C_D _ _),C_A (C_A _ _) _)) -> 255 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) _,C_A (C_A _ _) _)) -> 256 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_B _),C_A (C_A _ _) _)) -> 257 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_D _ _),C_A _ (C_B _))) -> 258 
  C_D _ ((C_A (C_A _ _) (C_B _),C_A _ (C_D _ _))) -> 259 
  C_D _ ((C_A _ (C_B _),C_A (C_A _ _) (C_D _ _))) -> 260 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_D _ _),C_A _ (C_B _))) -> 261 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 262 
  C_D (C_A _ _) ((C_A _ (C_B _),C_A _ _)) -> 263 
  C_D (C_A _ _) ((C_A _ (C_B _),C_A (C_A _ _) C_C)) -> 264 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 265 
  C_D (C_A _ C_C) ((C_A (C_A _ _) _,C_A _ _)) -> 266 
  C_D (C_A _ _) ((C_A _ (C_D _ _),C_A (C_A _ _) C_C)) -> 267 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) _)) -> 268 
  C_D _ ((C_A (C_A _ _) (C_D _ _),C_A _ (C_B _))) -> 269 
  C_D _ ((C_A _ C_C,C_A _ (C_B _))) -> 270 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_B _),C_A _ (C_B _))) -> 271 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 272 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ _,C_A (C_A _ _) (C_D _ _))) -> 273 
  C_D _ ((C_A (C_A _ _) C_C,C_A _ _)) -> 274 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A _ _)) -> 275 
  C_D (C_A _ C_C) ((C_A _ C_C,C_A _ (C_D _ _))) -> 276 
  C_D (C_A _ _) ((C_A _ (C_D _ _),C_A _ (C_B _))) -> 277 
  C_D _ ((C_A _ _,C_A (C_A _ _) C_C)) -> 278 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) C_C,C_A _ (C_B _))) -> 279 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A _ C_C)) -> 280 
  C_D _ ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_B _))) -> 281 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) _,C_A (C_A _ _) C_C)) -> 282 
  C_D (C_A _ (C_B _)) ((C_A _ (C_D _ _),C_A (C_A _ _) _)) -> 283 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_D _ _),C_A (C_A _ _) C_C)) -> 284 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_B _),C_A (C_A _ _) C_C)) -> 285 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) C_C,C_A _ (C_D _ _))) -> 286 
  C_D (C_A _ _) ((C_A _ C_C,C_A _ (C_B _))) -> 287 
  C_D (C_A _ _) ((C_A _ C_C,C_A _ C_C)) -> 288 
  C_D _ ((C_A (C_A _ _) (C_D _ _),C_A _ (C_D _ _))) -> 289 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ (C_B _),C_A _ (C_B _))) -> 290 
  C_D _ ((C_A _ _,C_A _ _)) -> 291 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A _ (C_B _))) -> 292 
  C_D (C_A _ _) ((C_A (C_A _ _) _,C_A _ _)) -> 293 
  C_D (C_A (C_A _ _) _) ((C_A _ C_C,C_A (C_A _ _) _)) -> 294 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_D _ _),C_A _ (C_D _ _))) -> 295 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) _,C_A (C_A _ _) C_C)) -> 296 
  C_D (C_A _ (C_B _)) ((C_A _ (C_D _ _),C_A (C_A _ _) C_C)) -> 297 
  C_D (C_A _ (C_B _)) ((C_A _ (C_B _),C_A (C_A _ _) (C_B _))) -> 298 
  C_D (C_A (C_A _ _) (C_B _)) _ -> 299 
  C_D (C_A _ C_C) ((C_A _ (C_B _),C_A (C_A _ _) (C_D _ _))) -> 300 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) C_C,C_A (C_A _ _) _)) -> 301 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ (C_B _),C_A (C_A _ _) (C_D _ _))) -> 302 
  C_D (C_A _ (C_D _ _)) ((C_A _ C_C,C_A (C_A _ _) (C_B _))) -> 303 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_B _))) -> 304 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) _)) -> 305 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) _,C_A _ C_C)) -> 306 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_D _ _),C_A _ (C_B _))) -> 307 
  C_D (C_A _ C_C) ((C_A (C_A _ _) C_C,C_A (C_A _ _) C_C)) -> 308 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) _,C_A _ (C_D _ _))) -> 309 
  C_D (C_A _ (C_B _)) ((C_A _ (C_D _ _),C_A _ (C_B _))) -> 310 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_D _ _),C_A (C_A _ _) _)) -> 311 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_D _ _))) -> 312 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 313 
  C_D (C_A _ C_C) ((C_A _ C_C,C_A _ C_C)) -> 314 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_D _ _))) -> 315 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) _)) -> 316 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) _,C_A _ (C_B _))) -> 317 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_D _ _),C_A _ _)) -> 318 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_D _ _))) -> 319 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A _ (C_D _ _))) -> 320 
  C_D (C_A _ _) ((C_A _ (C_B _),C_A (C_A _ _) _)) -> 321 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) _,C_A (C_A _ _) _)) -> 322 
  C_D (C_A _ (C_B _)) ((C_A _ (C_D _ _),C_A _ (C_D _ _))) -> 323 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) _)) -> 324 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_D _ _),C_A (C_A _ _) _)) -> 325 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ C_C,C_A _ (C_D _ _))) -> 326 
  C_D (C_A _ (C_B _)) ((C_A _ _,C_A (C_A _ _) (C_D _ _))) -> 327 
  C_D (C_A _ (C_B _)) ((C_A _ C_C,C_A (C_A _ _) (C_B _))) -> 328 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_D _ _),C_A (C_A _ _) C_C)) -> 329 
  C_D (C_A _ C_C) ((C_A _ C_C,C_A (C_A _ _) C_C)) -> 330 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_B _),C_A (C_A _ _) _)) -> 331 
  C_D (C_A _ (C_B _)) ((C_A _ _,C_A (C_A _ _) C_C)) -> 332 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) C_C)) -> 333 
  C_D (C_A _ (C_B _)) ((C_A _ (C_D _ _),C_A (C_A _ _) (C_B _))) -> 334 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_B _))) -> 335 
  C_D (C_A _ _) ((C_A _ (C_B _),C_A (C_A _ _) (C_B _))) -> 336 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ C_C,C_A _ _)) -> 337 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ _,C_A _ (C_D _ _))) -> 338 
  C_D (C_A _ (C_B _)) ((C_A _ C_C,C_A (C_A _ _) C_C)) -> 339 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_B _),C_A _ _)) -> 340 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_B _),C_A _ (C_D _ _))) -> 341 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A _ (C_D _ _))) -> 342 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) _,C_A (C_A _ _) _)) -> 343 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_B _),C_A (C_A _ _) (C_D _ _))) -> 344 
  C_D (C_A _ (C_D _ _)) ((C_A _ C_C,C_A _ (C_D _ _))) -> 345 
  C_D _ ((C_A (C_A _ _) _,C_A _ (C_B _))) -> 346 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_D _ _),C_A _ (C_B _))) -> 347 
  C_D (C_A _ _) ((C_A (C_A _ _) C_C,C_A (C_A _ _) _)) -> 348 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_D _ _),C_A _ C_C)) -> 349 
  C_D (C_A _ _) ((C_A _ (C_D _ _),C_A _ _)) -> 350 
  C_D (C_A _ C_C) ((C_A _ C_C,C_A _ (C_B _))) -> 351 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_B _),C_A _ C_C)) -> 352 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_B _))) -> 353 
  C_D (C_A _ (C_D _ _)) ((C_A _ _,C_A (C_A _ _) _)) -> 354 
  C_D (C_A (C_A _ _) _) ((C_A _ _,C_A (C_A _ _) C_C)) -> 355 
  C_D _ ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_B _))) -> 356 
  C_D (C_A _ _) ((C_A _ C_C,C_A _ _)) -> 357 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_B _),C_A (C_A _ _) _)) -> 358 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) C_C,C_A _ C_C)) -> 359 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) _)) -> 360 
  C_D (C_A (C_A _ _) _) ((C_A _ _,C_A _ (C_B _))) -> 361 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_D _ _),C_A _ (C_D _ _))) -> 362 
  C_D (C_A _ C_C) ((C_A (C_A _ _) C_C,C_A _ _)) -> 363 
  C_D (C_A _ (C_B _)) ((C_A _ (C_B _),C_A _ C_C)) -> 364 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) C_C,C_A _ C_C)) -> 365 
  C_D (C_A _ C_C) ((C_A (C_A _ _) C_C,C_A _ (C_B _))) -> 366 
  C_D (C_A _ (C_B _)) ((C_A _ (C_D _ _),C_A _ C_C)) -> 367 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) C_C,C_A _ _)) -> 368 
  C_D (C_A (C_A _ _) _) ((C_A _ C_C,C_A _ (C_B _))) -> 369 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_B _),C_A _ _)) -> 370 
  C_D (C_A _ C_C) ((C_A _ (C_B _),C_A _ (C_D _ _))) -> 371 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_B _),C_A (C_A _ _) (C_D _ _))) -> 372 
  C_D (C_A _ (C_B _)) ((C_A _ _,C_A _ (C_D _ _))) -> 373 
  C_D _ ((C_A _ _,C_A _ (C_B _))) -> 374 
  C_D (C_A _ C_C) ((C_A _ (C_D _ _),C_A (C_A _ _) (C_B _))) -> 375 
  C_D (C_A _ (C_B _)) ((C_A _ _,C_A _ _)) -> 376 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_D _ _),C_A _ (C_B _))) -> 377 
  C_D _ ((C_A _ (C_B _),C_A (C_A _ _) (C_B _))) -> 378 
  C_D (C_A _ C_C) ((C_A _ C_C,C_A (C_A _ _) (C_D _ _))) -> 379 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_B _))) -> 380 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) _,C_A _ C_C)) -> 381 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_B _),C_A _ _)) -> 382 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ _,C_A _ C_C)) -> 383 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ C_C,C_A _ (C_B _))) -> 384 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) _,C_A _ _)) -> 385 
  C_D (C_A _ _) ((C_A _ _,C_A (C_A _ _) (C_B _))) -> 386 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_D _ _))) -> 387 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_B _),C_A _ (C_D _ _))) -> 388 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) _,C_A _ _)) -> 389 
  C_D (C_A _ (C_D _ _)) ((C_A _ _,C_A _ (C_D _ _))) -> 390 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ C_C,C_A _ C_C)) -> 391 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_B _),C_A _ C_C)) -> 392 
  C_D (C_A _ C_C) ((C_A (C_A _ _) C_C,C_A _ C_C)) -> 393 
  C_D (C_A _ (C_B _)) ((C_A _ C_C,C_A _ C_C)) -> 394 
  C_D (C_A (C_A _ _) _) ((C_A _ _,C_A (C_A _ _) (C_B _))) -> 395 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) C_C)) -> 396 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_B _),C_A (C_A _ _) C_C)) -> 397 
  C_D _ ((C_A _ (C_D _ _),C_A (C_A _ _) (C_B _))) -> 398 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_D _ _))) -> 399 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) _,C_A (C_A _ _) C_C)) -> 400 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_D _ _))) -> 401 
  C_D _ ((C_A (C_A _ _) _,C_A (C_A _ _) _)) -> 402 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_B _),C_A (C_A _ _) C_C)) -> 403 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) _,C_A (C_A _ _) C_C)) -> 404 
  C_D (C_A _ (C_B _)) ((C_A _ C_C,C_A _ _)) -> 405 
  C_D _ ((C_A _ C_C,C_A (C_A _ _) _)) -> 406 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) C_C)) -> 407 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) C_C)) -> 408 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) _)) -> 409 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) _)) -> 410 
  C_D (C_A (C_A _ _) C_C) ((C_A _ C_C,C_A _ _)) -> 411 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_D _ _))) -> 412 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) _,C_A _ C_C)) -> 413 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) _)) -> 414 
  C_D (C_A _ _) ((C_A (C_A _ _) _,C_A (C_A _ _) _)) -> 415 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_D _ _),C_A _ C_C)) -> 416 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) C_C)) -> 417 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_D _ _))) -> 418 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_B _))) -> 419 
  C_D _ ((C_A _ (C_D _ _),C_A _ C_C)) -> 420 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ _,C_A (C_A _ _) (C_D _ _))) -> 421 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) _,C_A _ _)) -> 422 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ (C_B _),C_A (C_A _ _) _)) -> 423 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) C_C)) -> 424 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_B _),C_A _ (C_B _))) -> 425 
  C_D (C_A _ (C_B _)) ((C_A _ _,C_A (C_A _ _) (C_B _))) -> 426 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_D _ _))) -> 427 
  C_D (C_A _ _) ((C_A (C_A _ _) _,C_A _ (C_B _))) -> 428 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) C_C,C_A _ (C_B _))) -> 429 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_D _ _),C_A _ _)) -> 430 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) _,C_A _ (C_D _ _))) -> 431 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ _,C_A _ _)) -> 432 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_B _),C_A _ (C_B _))) -> 433 
  C_D (C_A _ C_C) ((C_A _ (C_B _),C_A _ (C_B _))) -> 434 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ (C_D _ _),C_A _ _)) -> 435 
  C_D _ ((C_A _ C_C,C_A _ (C_D _ _))) -> 436 
  C_D (C_A _ (C_B _)) ((C_A _ C_C,C_A _ (C_B _))) -> 437 
  C_D (C_A _ C_C) ((C_A _ C_C,C_A (C_A _ _) (C_B _))) -> 438 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_D _ _),C_A _ (C_B _))) -> 439 
  C_D (C_A _ (C_D _ _)) ((C_A _ _,C_A (C_A _ _) C_C)) -> 440 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_D _ _),C_A (C_A _ _) (C_B _))) -> 441 
  C_D (C_A _ _) ((C_A _ (C_D _ _),C_A _ C_C)) -> 442 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) _,C_A _ (C_B _))) -> 443 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_D _ _),C_A (C_A _ _) (C_B _))) -> 444 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ (C_D _ _),C_A _ (C_B _))) -> 445 
  C_D (C_A _ C_C) _ -> 446 
  C_D _ ((C_A _ (C_D _ _),C_A _ (C_B _))) -> 447 
