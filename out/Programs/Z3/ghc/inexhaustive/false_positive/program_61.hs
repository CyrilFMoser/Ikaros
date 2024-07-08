module Program_7 () where 

 main = print $ show v_b
data B_B = C_D | C_E B_A B_B | C_F | C_G B_B
data B_A = C_A | C_B B_A B_A | C_C ((B_B,Bool)) B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_G (C_E _ (C_G _)) -> 1 
  C_G (C_E C_A (C_E _ _)) -> 2 
  C_G (C_E _ C_D) -> 3 
  C_G (C_G (C_G _)) -> 4 
  C_G (C_E (C_C _ _) C_D) -> 5 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E (C_B _ _) C_D) -> 6 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E (C_C _ _) C_F) -> 7 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E C_A C_F) -> 8 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E (C_B _ _) (C_E _ _)) -> 9 
  C_E (C_B _ C_A) (C_E (C_B _ _) (C_E _ _)) -> 10 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_G (C_G _)) -> 11 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E (C_B _ _) (C_G _)) -> 12 
  C_E (C_C ((C_F,_)) _) (C_E (C_C _ _) C_D) -> 13 
  C_E (C_C ((C_D,_)) C_F) C_D -> 14 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E C_A C_D) -> 15 
  C_E (C_B (C_C _ _) _) (C_E (C_C _ _) _) -> 16 
  C_E (C_B (C_C _ _) C_A) (C_E C_A C_F) -> 17 
  C_E (C_B _ _) (C_E (C_C _ _) C_F) -> 18 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E (C_C _ _) _) -> 19 
  C_E (C_C ((C_G _,_)) _) (C_E _ C_F) -> 20 
  C_E (C_B C_A (C_C _ _)) (C_E (C_B _ _) (C_E _ _)) -> 21 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E _ (C_E _ _)) -> 22 
  C_E (C_B (C_C _ _) _) (C_E (C_C _ _) C_D) -> 23 
  C_E (C_C _ C_F) (C_E (C_C _ _) C_F) -> 24 
  C_E (C_C ((C_F,_)) C_F) (C_E _ _) -> 25 
  C_E (C_B _ _) (C_E C_A _) -> 26 
  C_E (C_B _ C_A) (C_E (C_C _ _) C_D) -> 27 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E (C_C _ _) (C_E _ _)) -> 28 
  C_E (C_B (C_B _ _) _) (C_E (C_C _ _) C_F) -> 29 
  C_E (C_B _ (C_C _ _)) (C_E (C_B _ _) (C_E _ _)) -> 30 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E (C_B _ _) C_D) -> 31 
  C_E (C_C _ C_F) (C_G (C_E _ _)) -> 32 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E C_A C_D) -> 33 
  C_E (C_B C_A C_A) (C_E (C_B _ _) _) -> 34 
  C_E (C_B _ (C_C _ _)) (C_E (C_B _ _) _) -> 35 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E (C_C _ _) (C_E _ _)) -> 36 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E (C_B _ _) _) -> 37 
  C_E (C_B C_A (C_C _ _)) (C_G C_F) -> 38 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E C_A C_F) -> 39 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E (C_B _ _) (C_G _)) -> 40 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E C_A (C_G _)) -> 41 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E C_A _) -> 42 
  C_E (C_B (C_C _ _) _) (C_G C_D) -> 43 
  C_E (C_B C_A (C_C _ _)) _ -> 44 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E (C_C _ _) (C_E _ _)) -> 45 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E (C_C _ _) _) -> 46 
  C_E (C_C _ (C_E _ _)) (C_E _ _) -> 47 
  C_E (C_C _ C_D) (C_E (C_C _ _) C_D) -> 48 
  C_E (C_C ((C_D,_)) C_D) (C_E _ C_D) -> 49 
  C_E C_A (C_E (C_B _ _) C_D) -> 50 
  C_E (C_B (C_B _ _) _) (C_E C_A (C_E _ _)) -> 51 
  C_E (C_B (C_C _ _) C_A) (C_E (C_C _ _) (C_G _)) -> 52 
  C_E (C_B _ (C_C _ _)) (C_G C_F) -> 53 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E _ _) -> 54 
  C_E (C_B (C_B _ _) C_A) (C_G C_D) -> 55 
  C_E (C_C ((C_F,_)) C_F) (C_E (C_C _ _) C_D) -> 56 
  C_E (C_C ((C_E _ _,_)) C_D) (C_G (C_E _ _)) -> 57 
  C_E (C_C _ (C_G _)) (C_E C_A _) -> 58 
  C_E (C_B _ (C_C _ _)) (C_E (C_C _ _) C_F) -> 59 
  C_E (C_C ((C_F,_)) (C_E _ _)) C_D -> 60 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_G C_D) -> 61 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E (C_B _ _) C_F) -> 62 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E C_A C_D) -> 63 
  C_E (C_C ((C_D,_)) (C_G _)) (C_G (C_G _)) -> 64 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E (C_B _ _) (C_E _ _)) -> 65 
  C_E (C_C _ (C_G _)) (C_E C_A (C_E _ _)) -> 66 
  C_E (C_C ((C_E _ _,_)) _) (C_E (C_B _ _) C_D) -> 67 
  C_E (C_C _ (C_G _)) (C_E C_A C_D) -> 68 
  C_E (C_B (C_C _ _) _) (C_E C_A C_F) -> 69 
  C_E (C_B C_A (C_B _ _)) (C_E (C_B _ _) C_F) -> 70 
  C_E C_A (C_E (C_B _ _) (C_G _)) -> 71 
  C_E (C_C _ _) (C_E (C_C _ _) (C_G _)) -> 72 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E (C_B _ _) C_D) -> 73 
  C_E (C_C ((C_G _,_)) C_D) (C_E _ (C_G _)) -> 74 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_B _ _) (C_E _ _)) -> 75 
  C_E (C_B _ (C_B _ _)) (C_E C_A C_F) -> 76 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E (C_C _ _) C_D) -> 77 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_G _) -> 78 
  C_E (C_C ((C_F,_)) C_F) (C_G C_D) -> 79 
  C_E (C_B (C_B _ _) C_A) (C_E _ _) -> 80 
  C_E (C_C ((C_E _ _,_)) _) (C_E C_A (C_G _)) -> 81 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E _ C_F) -> 82 
  C_E C_A C_F -> 83 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_C _ _) C_D) -> 84 
  C_E (C_B _ (C_B _ _)) (C_E (C_B _ _) C_D) -> 85 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E (C_B _ _) (C_E _ _)) -> 86 
  C_E (C_C _ _) (C_E (C_B _ _) C_D) -> 87 
  C_E (C_B (C_C _ _) _) (C_E (C_B _ _) (C_G _)) -> 88 
  C_E (C_B _ (C_C _ _)) (C_E _ _) -> 89 
  C_E (C_B (C_B _ _) (C_C _ _)) _ -> 90 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E _ (C_G _)) -> 91 
  C_E (C_B (C_C _ _) C_A) (C_E (C_B _ _) _) -> 92 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E (C_C _ _) C_D) -> 93 
  C_E (C_C _ (C_E _ _)) (C_E (C_C _ _) C_F) -> 94 
  C_E (C_C _ _) (C_E (C_C _ _) (C_E _ _)) -> 95 
  C_E (C_C ((C_D,_)) _) (C_E _ (C_E _ _)) -> 96 
  C_E (C_C ((C_G _,_)) C_D) (C_E (C_B _ _) (C_E _ _)) -> 97 
  C_E (C_B C_A (C_B _ _)) (C_E _ (C_G _)) -> 98 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_G C_D) -> 99 
  C_E (C_C _ (C_E _ _)) (C_E (C_C _ _) _) -> 100 
  C_E _ C_D -> 101 
  C_E (C_C _ (C_E _ _)) (C_E _ (C_G _)) -> 102 
  C_E (C_C ((C_G _,_)) C_F) (C_E (C_C _ _) (C_E _ _)) -> 103 
  C_E (C_C _ (C_E _ _)) (C_G C_D) -> 104 
  C_E (C_B (C_B _ _) C_A) C_D -> 105 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E _ C_D) -> 106 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E C_A (C_G _)) -> 107 
  C_E (C_B (C_B _ _) C_A) (C_E (C_C _ _) _) -> 108 
  C_E _ (C_E (C_B _ _) (C_E _ _)) -> 109 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E _ C_D) -> 110 
  C_E (C_B (C_C _ _) C_A) (C_E C_A _) -> 111 
  C_E C_A (C_G (C_G _)) -> 112 
  C_E (C_B C_A (C_C _ _)) (C_E C_A (C_G _)) -> 113 
  C_E (C_C _ (C_G _)) (C_E (C_C _ _) (C_E _ _)) -> 114 
  C_E (C_B C_A C_A) (C_E (C_C _ _) C_D) -> 115 
  C_E (C_B C_A (C_B _ _)) (C_E _ C_D) -> 116 
  C_E (C_B _ C_A) C_D -> 117 
  C_E _ (C_E _ C_F) -> 118 
  C_E (C_B (C_C _ _) C_A) (C_E (C_B _ _) C_D) -> 119 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E _ C_D) -> 120 
  C_E (C_B (C_B _ _) _) (C_E (C_B _ _) (C_G _)) -> 121 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E (C_C _ _) (C_E _ _)) -> 122 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E _ (C_E _ _)) -> 123 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E _ C_D) -> 124 
  C_E (C_C ((C_G _,_)) C_F) _ -> 125 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_G (C_E _ _)) -> 126 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) _ -> 127 
  C_E (C_B (C_B _ _) C_A) (C_E C_A _) -> 128 
  C_E (C_C ((C_F,_)) C_F) (C_G (C_E _ _)) -> 129 
  C_E (C_B (C_C _ _) C_A) (C_G C_D) -> 130 
  C_E (C_C ((C_D,_)) C_F) (C_G C_D) -> 131 
  C_E (C_C ((C_F,_)) C_D) (C_E C_A _) -> 132 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E _ (C_G _)) -> 133 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E (C_C _ _) C_F) -> 134 
  C_E (C_B (C_C _ _) C_A) (C_E (C_B _ _) (C_G _)) -> 135 
  C_E (C_C _ (C_G _)) (C_E (C_B _ _) _) -> 136 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_B _ _) _) -> 137 
  C_E (C_B C_A (C_C _ _)) (C_G C_D) -> 138 
  C_E (C_C ((C_G _,_)) _) (C_E C_A _) -> 139 
  C_E (C_B C_A C_A) (C_G (C_G _)) -> 140 
  C_E (C_B C_A _) (C_E (C_C _ _) _) -> 141 
  C_E (C_C ((C_G _,_)) C_F) (C_E (C_B _ _) C_D) -> 142 
  C_E (C_C ((C_E _ _,_)) _) (C_E (C_B _ _) (C_E _ _)) -> 143 
  C_E C_A (C_G (C_E _ _)) -> 144 
  C_E (C_B _ C_A) (C_E (C_C _ _) (C_G _)) -> 145 
  C_E (C_B _ _) (C_E _ (C_E _ _)) -> 146 
  C_E (C_C _ (C_G _)) (C_E _ (C_G _)) -> 147 
  C_E (C_C _ _) C_D -> 148 
  C_E C_A (C_G C_D) -> 149 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E _ _) -> 150 
  C_E (C_C _ C_D) C_F -> 151 
  C_E (C_C ((C_E _ _,_)) _) (C_G C_F) -> 152 
  C_E (C_B _ (C_B _ _)) (C_E C_A C_D) -> 153 
  C_E (C_C ((C_F,_)) C_F) (C_E C_A (C_G _)) -> 154 
  C_E (C_B C_A C_A) (C_G (C_E _ _)) -> 155 
  C_E (C_C ((C_E _ _,_)) C_F) (C_G (C_E _ _)) -> 156 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E C_A C_D) -> 157 
  C_E (C_B _ C_A) (C_E (C_C _ _) C_F) -> 158 
  C_E (C_C ((C_F,_)) _) (C_G (C_E _ _)) -> 159 
  C_E (C_C _ C_F) (C_E _ _) -> 160 
  C_E (C_B _ (C_B _ _)) (C_E _ C_F) -> 161 
  C_E (C_C ((C_F,_)) _) (C_E (C_B _ _) C_D) -> 162 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E (C_B _ _) C_D) -> 163 
  C_E (C_B (C_B _ _) _) (C_E (C_B _ _) _) -> 164 
  C_E (C_B C_A (C_C _ _)) (C_E _ _) -> 165 
  C_E (C_C _ C_F) (C_G C_F) -> 166 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E C_A (C_G _)) -> 167 
  C_E (C_C _ C_D) (C_E C_A (C_G _)) -> 168 
  C_E (C_B (C_C _ _) _) (C_E _ (C_E _ _)) -> 169 
  C_E (C_C ((C_E _ _,_)) _) (C_E (C_B _ _) (C_G _)) -> 170 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E (C_C _ _) _) -> 171 
  C_E (C_C _ (C_G _)) _ -> 172 
  C_E (C_B _ (C_B _ _)) (C_E (C_B _ _) (C_G _)) -> 173 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E (C_B _ _) _) -> 174 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E _ C_F) -> 175 
  C_E (C_C _ C_F) (C_E _ (C_E _ _)) -> 176 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E C_A _) -> 177 
  C_E (C_C ((C_F,_)) _) (C_E C_A C_D) -> 178 
  C_E (C_C _ (C_E _ _)) (C_E C_A C_D) -> 179 
  C_E (C_C _ (C_G _)) (C_E (C_B _ _) (C_E _ _)) -> 180 
  C_E (C_B (C_C _ _) (C_B _ _)) _ -> 181 
  C_E (C_B _ (C_B _ _)) (C_E C_A (C_E _ _)) -> 182 
  C_E (C_C _ (C_G _)) (C_E _ C_D) -> 183 
  C_E (C_B _ (C_C _ _)) (C_G C_D) -> 184 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E C_A _) -> 185 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E C_A C_F) -> 186 
