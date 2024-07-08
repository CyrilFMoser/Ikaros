module Program_11 () where 

 main = print $ show v_b
data B_B = C_D | C_E B_A B_B | C_F | C_G B_B
data B_A = C_A | C_B B_A B_A | C_C ((B_B,Bool)) B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E (C_C _ _) C_D) -> 0 
  C_E (C_C ((C_F,_)) _) C_F -> 1 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E (C_C _ _) (C_E _ _)) -> 2 
  C_E (C_C ((C_D,_)) C_F) (C_G C_F) -> 3 
  C_E (C_B C_A _) (C_E C_A (C_G _)) -> 4 
  C_E (C_C ((C_F,_)) _) (C_E (C_B _ _) C_F) -> 5 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E (C_B _ _) C_F) -> 6 
  C_E (C_C ((C_D,_)) C_D) (C_E C_A C_D) -> 7 
  C_E (C_B _ (C_C _ _)) (C_E (C_B _ _) C_F) -> 8 
  C_E (C_B (C_B _ _) C_A) (C_E C_A (C_G _)) -> 9 
  C_E (C_B _ (C_C _ _)) (C_E _ C_D) -> 10 
  C_E (C_C ((C_F,_)) C_F) (C_E (C_C _ _) _) -> 11 
  C_E (C_C ((C_D,_)) (C_G _)) C_D -> 12 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E C_A C_D) -> 13 
  C_E (C_C ((C_D,_)) _) (C_E _ C_F) -> 14 
  C_E (C_C _ _) (C_E (C_B _ _) (C_E _ _)) -> 15 
  C_E (C_C _ C_F) (C_E (C_B _ _) (C_E _ _)) -> 16 
  C_E (C_C ((C_E _ _,_)) _) (C_E (C_C _ _) _) -> 17 
  C_E (C_C _ (C_E _ _)) (C_E (C_B _ _) (C_E _ _)) -> 18 
  C_E (C_C _ (C_E _ _)) C_F -> 19 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E (C_C _ _) C_F) -> 20 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_G C_F) -> 21 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E _ (C_E _ _)) -> 22 
  C_E (C_C ((C_F,_)) C_F) (C_G _) -> 23 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E (C_B _ _) _) -> 24 
  C_E (C_C _ _) (C_E (C_B _ _) C_F) -> 25 
  C_E (C_B (C_B _ _) (C_C _ _)) C_F -> 26 
  C_E (C_C ((C_G _,_)) _) (C_E (C_C _ _) (C_E _ _)) -> 27 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E (C_B _ _) C_F) -> 28 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E (C_C _ _) (C_E _ _)) -> 29 
  C_E (C_B (C_B _ _) C_A) (C_E (C_B _ _) _) -> 30 
  C_E (C_C ((C_F,_)) _) (C_E (C_C _ _) _) -> 31 
  C_E (C_C ((C_F,_)) C_D) C_F -> 32 
  C_E (C_C ((C_D,_)) C_F) _ -> 33 
  C_E (C_C ((C_F,_)) _) (C_E _ _) -> 34 
  C_E (C_C ((C_F,_)) C_D) (C_E (C_C _ _) C_D) -> 35 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E _ (C_G _)) -> 36 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E C_A _) -> 37 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E _ _) -> 38 
  C_E (C_B _ _) (C_E C_A (C_E _ _)) -> 39 
  C_E (C_B C_A _) (C_E _ (C_E _ _)) -> 40 
  C_E (C_B _ (C_B _ _)) (C_G (C_E _ _)) -> 41 
  C_E (C_B C_A _) (C_E _ _) -> 42 
  C_E (C_C ((C_G _,_)) _) (C_E C_A (C_E _ _)) -> 43 
  C_E (C_B _ _) C_D -> 44 
  C_E (C_B (C_B _ _) _) (C_E C_A (C_G _)) -> 45 
  C_E (C_C ((C_E _ _,_)) _) (C_E (C_B _ _) C_F) -> 46 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E _ (C_G _)) -> 47 
  C_E (C_B (C_B _ _) _) (C_E _ _) -> 48 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E (C_B _ _) _) -> 49 
  C_E (C_B (C_C _ _) (C_C _ _)) C_F -> 50 
  C_E (C_C ((C_E _ _,_)) _) (C_E _ (C_E _ _)) -> 51 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_G (C_E _ _)) -> 52 
  C_E (C_C ((C_D,_)) C_F) (C_E _ (C_E _ _)) -> 53 
  C_E (C_C _ (C_E _ _)) (C_E C_A _) -> 54 
  C_E (C_C ((C_G _,_)) _) (C_G C_F) -> 55 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E (C_B _ _) (C_G _)) -> 56 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E (C_C _ _) (C_G _)) -> 57 
  C_E (C_C ((C_D,_)) C_D) (C_E _ (C_E _ _)) -> 58 
  C_E (C_B C_A C_A) (C_E (C_C _ _) _) -> 59 
  C_E (C_B (C_C _ _) _) (C_E _ (C_G _)) -> 60 
  C_E (C_B _ (C_C _ _)) (C_E _ C_F) -> 61 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_G C_F) -> 62 
  C_E (C_B _ _) (C_G C_F) -> 63 
  C_E (C_B _ _) (C_E (C_B _ _) (C_G _)) -> 64 
  C_E (C_B _ _) C_F -> 65 
  C_E (C_C ((C_F,_)) C_D) (C_G (C_G _)) -> 66 
  C_E (C_B C_A (C_C _ _)) C_F -> 67 
  C_E (C_B C_A _) (C_E _ (C_G _)) -> 68 
  C_E (C_C _ C_F) (C_E (C_C _ _) C_D) -> 69 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E C_A _) -> 70 
  C_E (C_B C_A (C_B _ _)) (C_E _ C_F) -> 71 
  C_E (C_B _ C_A) (C_E C_A C_F) -> 72 
  C_E (C_B C_A (C_B _ _)) (C_G (C_G _)) -> 73 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E (C_C _ _) C_D) -> 74 
  C_E (C_C ((C_D,_)) C_D) (C_E C_A C_F) -> 75 
  C_E (C_B _ C_A) (C_E (C_B _ _) C_D) -> 76 
  C_E C_A (C_E (C_C _ _) (C_E _ _)) -> 77 
  C_E (C_B C_A (C_B _ _)) (C_G (C_E _ _)) -> 78 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_G C_D) -> 79 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E (C_B _ _) C_F) -> 80 
  C_E (C_C ((C_F,_)) (C_G _)) (C_G (C_G _)) -> 81 
  C_E (C_C _ C_F) (C_E (C_B _ _) _) -> 82 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E C_A (C_E _ _)) -> 83 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E (C_C _ _) C_F) -> 84 
  C_E (C_C ((C_G _,_)) C_F) (C_G (C_E _ _)) -> 85 
  C_E (C_C ((C_G _,_)) _) (C_E C_A C_D) -> 86 
  C_E (C_B C_A (C_C _ _)) (C_E (C_C _ _) C_D) -> 87 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E _ C_F) -> 88 
  C_E (C_C ((C_E _ _,_)) _) (C_E (C_C _ _) (C_E _ _)) -> 89 
  C_E (C_C ((C_G _,_)) C_F) (C_E (C_B _ _) C_F) -> 90 
  C_E (C_B C_A _) (C_E (C_C _ _) C_F) -> 91 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E (C_C _ _) C_F) -> 92 
  C_E (C_C ((C_F,_)) C_F) (C_E (C_C _ _) (C_G _)) -> 93 
  C_E (C_B C_A C_A) (C_E _ (C_E _ _)) -> 94 
  C_E (C_C _ _) (C_E _ _) -> 95 
  C_E (C_B C_A C_A) (C_E (C_B _ _) (C_G _)) -> 96 
  C_E (C_C ((C_G _,_)) C_D) (C_E (C_B _ _) C_D) -> 97 
  C_E (C_B _ (C_C _ _)) (C_E (C_C _ _) _) -> 98 
  C_E C_A (C_E _ C_D) -> 99 
  C_E (C_B (C_B _ _) C_A) (C_E (C_C _ _) C_F) -> 100 
  C_E (C_B _ C_A) (C_E _ (C_E _ _)) -> 101 
  C_E (C_C _ C_F) (C_E (C_B _ _) C_D) -> 102 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E (C_C _ _) _) -> 103 
  C_E (C_C ((C_E _ _,_)) _) (C_E C_A (C_E _ _)) -> 104 
  C_E C_A (C_E (C_C _ _) C_F) -> 105 
  C_E (C_B _ _) (C_E (C_C _ _) C_D) -> 106 
  C_E (C_B _ (C_C _ _)) (C_E (C_C _ _) (C_G _)) -> 107 
  C_E (C_B C_A (C_C _ _)) (C_E (C_B _ _) C_D) -> 108 
  C_E (C_B _ _) (C_G (C_E _ _)) -> 109 
  C_E (C_C ((C_F,_)) _) (C_E _ C_F) -> 110 
  C_E (C_B C_A _) (C_E (C_B _ _) (C_G _)) -> 111 
  C_E (C_C ((C_D,_)) C_F) (C_E _ _) -> 112 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E _ C_D) -> 113 
  C_E (C_C ((C_D,_)) C_F) (C_E (C_C _ _) (C_E _ _)) -> 114 
  C_E (C_C ((C_F,_)) C_F) (C_E _ (C_E _ _)) -> 115 
  C_E (C_C ((C_G _,_)) C_F) (C_E _ (C_G _)) -> 116 
  C_E (C_C _ C_F) C_D -> 117 
  C_E (C_B (C_C _ _) _) C_D -> 118 
  C_E (C_C ((C_G _,_)) C_F) (C_E (C_C _ _) (C_G _)) -> 119 
  C_E _ (C_E (C_C _ _) (C_G _)) -> 120 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E _ C_F) -> 121 
  C_E (C_B C_A _) (C_G C_D) -> 122 
  C_E _ (C_E (C_C _ _) C_F) -> 123 
  C_E (C_B C_A C_A) (C_E C_A (C_G _)) -> 124 
  C_E (C_C ((C_G _,_)) C_D) (C_G _) -> 125 
  C_E (C_C ((C_D,_)) _) (C_G C_D) -> 126 
  C_E (C_C ((C_E _ _,_)) (C_G _)) _ -> 127 
  C_E (C_B (C_C _ _) C_A) (C_G C_F) -> 128 
  C_E (C_B (C_C _ _) C_A) (C_E (C_C _ _) C_D) -> 129 
  C_E (C_B (C_B _ _) C_A) (C_E C_A C_F) -> 130 
  C_E (C_C _ C_F) (C_E C_A _) -> 131 
  C_E (C_B (C_C _ _) C_A) _ -> 132 
  C_E (C_C ((C_E _ _,_)) _) _ -> 133 
  C_E (C_C _ C_D) (C_E (C_B _ _) _) -> 134 
  C_E (C_B C_A (C_B _ _)) C_F -> 135 
  C_E (C_C ((C_F,_)) C_D) (C_E (C_B _ _) C_F) -> 136 
  C_E (C_C _ (C_E _ _)) (C_E C_A C_F) -> 137 
  C_E (C_C ((C_E _ _,_)) _) (C_E (C_C _ _) C_D) -> 138 
  C_E (C_C ((C_G _,_)) C_D) (C_E (C_C _ _) C_F) -> 139 
  C_E (C_B (C_B _ _) C_A) (C_E C_A C_D) -> 140 
  C_E (C_B (C_C _ _) _) (C_E (C_B _ _) (C_E _ _)) -> 141 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E (C_B _ _) C_D) -> 142 
  C_E (C_B _ (C_B _ _)) (C_E (C_B _ _) (C_E _ _)) -> 143 
  C_E (C_B (C_C _ _) _) (C_E _ C_F) -> 144 
  C_E (C_C _ (C_E _ _)) (C_E (C_C _ _) C_D) -> 145 
  C_E (C_B _ (C_C _ _)) (C_E C_A (C_G _)) -> 146 
  C_E C_A (C_E (C_B _ _) _) -> 147 
  C_E (C_B _ C_A) (C_G C_F) -> 148 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E C_A _) -> 149 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E _ _) -> 150 
  C_E (C_C ((C_D,_)) _) C_F -> 151 
  C_E (C_B (C_C _ _) _) (C_E (C_C _ _) C_F) -> 152 
  C_E (C_C _ _) _ -> 153 
  C_E (C_C ((C_F,_)) (C_G _)) C_D -> 154 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E (C_B _ _) (C_G _)) -> 155 
  C_E (C_C ((C_E _ _,_)) C_D) _ -> 156 
  C_E (C_C ((C_D,_)) C_D) (C_E (C_C _ _) C_F) -> 157 
  C_E (C_C ((C_D,_)) C_F) (C_E C_A (C_E _ _)) -> 158 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E _ (C_E _ _)) -> 159 
  C_E (C_B (C_C _ _) _) C_F -> 160 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E C_A (C_E _ _)) -> 161 
  C_E (C_C ((C_F,_)) _) (C_E (C_B _ _) (C_E _ _)) -> 162 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_G (C_G _)) -> 163 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E (C_B _ _) C_F) -> 164 
  C_E (C_C ((C_D,_)) _) _ -> 165 
  C_E (C_B _ (C_B _ _)) (C_E (C_B _ _) _) -> 166 
  C_E C_A (C_E C_A _) -> 167 
  C_E (C_C _ (C_E _ _)) (C_G C_F) -> 168 
  C_E (C_C _ C_F) (C_E (C_B _ _) C_F) -> 169 
  C_E (C_B _ (C_B _ _)) (C_G _) -> 170 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E _ C_D) -> 171 
  C_E (C_B C_A C_A) (C_E (C_C _ _) C_F) -> 172 
  C_E (C_C ((C_D,_)) C_D) (C_G C_F) -> 173 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E C_A (C_G _)) -> 174 
  C_E (C_C ((C_G _,_)) (C_E _ _)) _ -> 175 
  C_E (C_B _ C_A) (C_E (C_B _ _) _) -> 176 
  C_E (C_C _ (C_E _ _)) (C_E _ (C_E _ _)) -> 177 
  C_E (C_B _ C_A) (C_G (C_G _)) -> 178 
  C_E (C_C ((C_D,_)) C_D) (C_E C_A (C_E _ _)) -> 179 
  C_E (C_B (C_B _ _) C_A) C_F -> 180 
  C_E (C_B _ _) (C_E C_A C_F) -> 181 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E _ (C_E _ _)) -> 182 
  C_E (C_C ((C_D,_)) C_D) (C_E C_A _) -> 183 
  C_E (C_C ((C_D,_)) C_D) (C_G C_D) -> 184 
  C_E (C_C ((C_D,_)) _) (C_E (C_B _ _) (C_G _)) -> 185 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_G C_F) -> 186 
  C_E (C_C ((C_F,_)) (C_E _ _)) _ -> 187 
  C_E (C_C ((C_F,_)) _) _ -> 188 
  C_E (C_B _ (C_C _ _)) C_F -> 189 
  C_E C_A (C_E _ (C_E _ _)) -> 190 
  C_E (C_C _ C_D) (C_G C_D) -> 191 
  C_E (C_B _ (C_C _ _)) (C_G (C_G _)) -> 192 
  C_E (C_C _ C_D) (C_E (C_B _ _) (C_G _)) -> 193 
  C_E (C_B _ _) (C_E (C_C _ _) (C_G _)) -> 194 
  C_E (C_C ((C_G _,_)) C_F) (C_E (C_C _ _) C_F) -> 195 
  C_E (C_C ((C_G _,_)) C_F) (C_E (C_C _ _) _) -> 196 
  C_E (C_C ((C_D,_)) (C_G _)) (C_G (C_E _ _)) -> 197 
  C_E (C_C ((C_E _ _,_)) C_F) _ -> 198 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E C_A _) -> 199 
  C_E (C_C ((C_F,_)) (C_G _)) C_F -> 200 
  C_E (C_C ((C_F,_)) (C_E _ _)) C_F -> 201 
  C_E (C_C ((C_G _,_)) C_F) (C_E _ C_F) -> 202 
  C_E (C_B C_A (C_B _ _)) (C_E C_A (C_G _)) -> 203 
  C_E (C_C ((C_G _,_)) C_F) (C_E (C_C _ _) C_D) -> 204 
  C_E (C_C _ _) (C_E (C_B _ _) _) -> 205 
  C_E (C_C ((C_E _ _,_)) _) (C_E _ (C_G _)) -> 206 
  C_E (C_C ((C_G _,_)) C_D) (C_E (C_C _ _) _) -> 207 
  C_E (C_C _ _) (C_E _ C_D) -> 208 
  C_E (C_C _ C_F) (C_G C_D) -> 209 
  C_E (C_C _ C_D) (C_E (C_B _ _) (C_E _ _)) -> 210 
  C_E (C_B _ C_A) (C_G _) -> 211 
  C_E (C_B (C_C _ _) _) (C_G _) -> 212 
  C_E (C_B (C_C _ _) _) (C_E (C_B _ _) C_D) -> 213 
  C_E C_A (C_E C_A C_F) -> 214 
  C_E (C_C ((C_G _,_)) C_F) (C_E _ C_D) -> 215 
  C_E (C_C ((C_G _,_)) C_D) (C_E _ C_F) -> 216 
  C_E (C_C ((C_F,_)) _) (C_E _ (C_E _ _)) -> 217 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E _ C_D) -> 218 
  C_E (C_C ((C_E _ _,_)) C_D) (C_G _) -> 219 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E (C_C _ _) (C_E _ _)) -> 220 
  C_E (C_C _ C_F) (C_E _ C_F) -> 221 
  C_E (C_B (C_C _ _) C_A) (C_E _ (C_G _)) -> 222 
  C_E (C_B C_A C_A) (C_E (C_C _ _) (C_G _)) -> 223 
  C_E (C_C ((C_E _ _,_)) _) (C_E _ C_F) -> 224 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E (C_B _ _) C_D) -> 225 
  C_E (C_C ((C_D,_)) C_D) (C_E _ C_F) -> 226 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E (C_C _ _) C_D) -> 227 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E _ (C_E _ _)) -> 228 
  C_E (C_C ((C_G _,_)) _) (C_E (C_C _ _) C_F) -> 229 
  C_E (C_C ((C_F,_)) C_F) C_F -> 230 
  C_E (C_C ((C_F,_)) C_F) C_D -> 231 
  C_E (C_B C_A (C_C _ _)) (C_E C_A _) -> 232 
  C_E (C_C _ (C_E _ _)) (C_E (C_C _ _) (C_G _)) -> 233 
  C_E (C_C ((C_G _,_)) (C_E _ _)) C_F -> 234 
  C_E (C_C _ _) (C_E (C_C _ _) C_F) -> 235 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E C_A (C_G _)) -> 236 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E C_A (C_E _ _)) -> 237 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E (C_C _ _) C_D) -> 238 
  C_E (C_B _ C_A) (C_E _ (C_G _)) -> 239 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_G _) -> 240 
  C_E (C_B (C_C _ _) C_A) (C_E (C_C _ _) (C_E _ _)) -> 241 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_G (C_E _ _)) -> 242 
  C_E (C_C ((C_G _,_)) _) (C_G (C_G _)) -> 243 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E C_A (C_G _)) -> 244 
  C_E (C_B _ C_A) (C_E _ C_D) -> 245 
  C_E (C_C ((C_D,_)) C_D) _ -> 246 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E _ _) -> 247 
  C_E (C_B _ (C_C _ _)) (C_E C_A _) -> 248 
  C_E (C_B C_A (C_B _ _)) (C_E (C_B _ _) C_D) -> 249 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E _ (C_G _)) -> 250 
  C_E (C_B C_A _) (C_E (C_B _ _) C_D) -> 251 
  C_E (C_B _ (C_C _ _)) (C_E C_A C_F) -> 252 
  C_E (C_B _ C_A) _ -> 253 
  C_E (C_B C_A (C_C _ _)) (C_E (C_B _ _) (C_G _)) -> 254 
  C_E _ (C_E _ (C_G _)) -> 255 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E C_A (C_G _)) -> 256 
  C_E (C_C _ C_D) _ -> 257 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_G _) -> 258 
  C_E (C_C ((C_G _,_)) C_F) (C_E C_A (C_E _ _)) -> 259 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E _ _) -> 260 
  C_E (C_C _ (C_E _ _)) C_D -> 261 
  C_E (C_B _ (C_C _ _)) (C_E (C_C _ _) C_D) -> 262 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) C_F -> 263 
  C_E _ (C_G (C_E _ _)) -> 264 
  C_E (C_C _ (C_E _ _)) (C_E C_A (C_E _ _)) -> 265 
  C_E (C_B C_A C_A) (C_E C_A C_F) -> 266 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E (C_C _ _) (C_G _)) -> 267 
  C_E (C_C _ C_D) (C_G (C_E _ _)) -> 268 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_G (C_E _ _)) -> 269 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E _ (C_E _ _)) -> 270 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E (C_C _ _) (C_G _)) -> 271 
  C_E (C_B C_A (C_B _ _)) (C_E (C_B _ _) (C_G _)) -> 272 
  C_E (C_C _ C_F) (C_E C_A (C_G _)) -> 273 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_G (C_E _ _)) -> 274 
  C_E (C_B C_A (C_B _ _)) (C_E (C_C _ _) (C_E _ _)) -> 275 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E _ C_F) -> 276 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E (C_B _ _) (C_G _)) -> 277 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E C_A (C_E _ _)) -> 278 
  C_E (C_B _ (C_C _ _)) (C_E (C_B _ _) C_D) -> 279 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_C _ _) C_F) -> 280 
  C_E (C_C ((C_G _,_)) _) (C_E (C_C _ _) (C_G _)) -> 281 
  C_E _ (C_E (C_B _ _) _) -> 282 
