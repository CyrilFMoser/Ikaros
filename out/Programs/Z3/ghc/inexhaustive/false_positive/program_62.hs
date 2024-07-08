module Program_8 () where 

 main = print $ show v_b
data B_B = C_D | C_E B_A B_B | C_F | C_G B_B
data B_A = C_A | C_B B_A B_A | C_C ((B_B,Bool)) B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_G (C_G C_F) -> 1 
  C_G (C_E (C_B _ _) (C_E _ _)) -> 2 
  C_G (C_E _ _) -> 3 
  C_G (C_E C_A C_D) -> 4 
  C_G (C_E C_A C_F) -> 5 
  C_G (C_E (C_B _ _) C_D) -> 6 
  C_G (C_G C_D) -> 7 
  C_G (C_E (C_B _ _) (C_G _)) -> 8 
  C_G (C_E (C_B _ _) C_F) -> 9 
  C_G (C_E _ C_F) -> 10 
  C_E (C_B _ (C_B _ _)) _ -> 11 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E (C_B _ _) (C_E _ _)) -> 12 
  C_E (C_C ((C_D,_)) _) (C_E (C_C _ _) _) -> 13 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E (C_B _ _) (C_E _ _)) -> 14 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E _ C_F) -> 15 
  C_E (C_B (C_B _ _) _) (C_E (C_C _ _) (C_G _)) -> 16 
  C_E (C_B C_A (C_B _ _)) (C_G C_F) -> 17 
  C_E (C_C ((C_D,_)) C_D) (C_E (C_B _ _) (C_E _ _)) -> 18 
  C_E (C_B _ _) (C_G C_D) -> 19 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E (C_B _ _) C_D) -> 20 
  C_E (C_C ((C_G _,_)) _) (C_G _) -> 21 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E _ (C_G _)) -> 22 
  C_E (C_C ((C_G _,_)) C_F) (C_E (C_B _ _) (C_E _ _)) -> 23 
  C_E (C_C ((C_D,_)) C_F) (C_E C_A C_D) -> 24 
  C_E (C_C ((C_G _,_)) C_D) (C_E (C_C _ _) (C_E _ _)) -> 25 
  C_E (C_B C_A (C_C _ _)) (C_E _ (C_G _)) -> 26 
  C_E (C_C ((C_G _,_)) C_D) C_F -> 27 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E C_A _) -> 28 
  C_E (C_B (C_B _ _) C_A) (C_E _ C_D) -> 29 
  C_E (C_C ((C_E _ _,_)) _) (C_G C_D) -> 30 
  C_E (C_B (C_B _ _) C_A) (C_E (C_C _ _) (C_G _)) -> 31 
  C_E (C_B C_A (C_B _ _)) (C_G C_D) -> 32 
  C_E (C_C ((C_D,_)) C_F) (C_E (C_C _ _) _) -> 33 
  C_E (C_B _ C_A) (C_E C_A (C_G _)) -> 34 
  C_E (C_C ((C_E _ _,_)) _) (C_E C_A _) -> 35 
  C_E (C_C ((C_F,_)) C_F) _ -> 36 
  C_E _ (C_E C_A C_D) -> 37 
  C_E (C_C ((C_F,_)) C_F) (C_E C_A (C_E _ _)) -> 38 
  C_E (C_C ((C_F,_)) C_D) (C_E (C_C _ _) (C_G _)) -> 39 
  C_E (C_C ((C_G _,_)) C_D) (C_E (C_C _ _) (C_G _)) -> 40 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E C_A C_F) -> 41 
  C_E (C_B (C_C _ _) C_A) (C_E (C_B _ _) C_F) -> 42 
  C_E (C_C _ C_F) (C_E (C_C _ _) (C_E _ _)) -> 43 
  C_E (C_B C_A C_A) (C_E (C_B _ _) (C_E _ _)) -> 44 
  C_E (C_C ((C_G _,_)) _) (C_E C_A C_F) -> 45 
  C_E (C_C ((C_D,_)) _) (C_E C_A (C_G _)) -> 46 
  C_E (C_C ((C_D,_)) C_D) (C_G (C_G _)) -> 47 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_G _) -> 48 
  C_E (C_C _ (C_E _ _)) (C_G _) -> 49 
  C_E _ (C_E C_A (C_E _ _)) -> 50 
  C_E (C_B _ _) (C_E (C_B _ _) _) -> 51 
  C_E (C_C _ C_D) C_D -> 52 
  C_E (C_C ((C_D,_)) C_D) (C_G _) -> 53 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E (C_B _ _) C_F) -> 54 
  C_E (C_C ((C_D,_)) _) (C_E _ (C_G _)) -> 55 
  C_E (C_B C_A (C_C _ _)) (C_E C_A (C_E _ _)) -> 56 
  C_E (C_C ((C_E _ _,_)) _) (C_E _ C_D) -> 57 
  C_E (C_C _ _) (C_G _) -> 58 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E _ C_D) -> 59 
  C_E (C_C ((C_F,_)) _) (C_E C_A (C_G _)) -> 60 
  C_E _ (C_G _) -> 61 
  C_E (C_C ((C_D,_)) C_F) (C_E (C_B _ _) (C_G _)) -> 62 
  C_E (C_C ((C_D,_)) C_D) (C_E (C_C _ _) _) -> 63 
  C_E _ (C_G C_F) -> 64 
  C_E (C_C ((C_F,_)) C_D) (C_E C_A (C_E _ _)) -> 65 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E _ (C_E _ _)) -> 66 
  C_E (C_B _ (C_C _ _)) (C_G _) -> 67 
  C_E (C_C _ C_F) (C_E C_A (C_E _ _)) -> 68 
  C_E (C_B C_A _) (C_E _ C_D) -> 69 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E (C_B _ _) (C_G _)) -> 70 
  C_E (C_C ((C_F,_)) _) (C_G (C_G _)) -> 71 
  C_E (C_C _ (C_G _)) (C_E (C_C _ _) C_F) -> 72 
  C_E (C_C _ (C_G _)) (C_G (C_E _ _)) -> 73 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E C_A (C_G _)) -> 74 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E (C_B _ _) (C_E _ _)) -> 75 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E C_A C_F) -> 76 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E _ (C_E _ _)) -> 77 
  C_E (C_B C_A _) (C_G (C_G _)) -> 78 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E (C_C _ _) (C_G _)) -> 79 
  C_E (C_C ((C_F,_)) C_F) (C_E _ C_F) -> 80 
  C_E (C_C ((C_D,_)) (C_G _)) (C_G C_F) -> 81 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E (C_B _ _) (C_E _ _)) -> 82 
  C_E (C_B (C_B _ _) C_A) (C_G (C_E _ _)) -> 83 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E _ (C_G _)) -> 84 
  C_E (C_B _ (C_B _ _)) (C_E _ (C_E _ _)) -> 85 
  C_E (C_C ((C_G _,_)) C_F) C_D -> 86 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E C_A (C_E _ _)) -> 87 
  C_E (C_C _ (C_G _)) (C_E (C_B _ _) C_D) -> 88 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_G C_D) -> 89 
  C_E (C_C _ _) (C_G C_D) -> 90 
  C_E (C_B C_A (C_C _ _)) (C_E (C_B _ _) C_F) -> 91 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E (C_C _ _) C_D) -> 92 
  C_E (C_C ((C_G _,_)) C_F) (C_G (C_G _)) -> 93 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E _ _) -> 94 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E (C_C _ _) (C_E _ _)) -> 95 
  C_E (C_C _ C_D) (C_E _ C_D) -> 96 
  C_E (C_C _ (C_G _)) (C_G C_F) -> 97 
  C_E (C_C ((C_G _,_)) _) (C_E (C_B _ _) _) -> 98 
  C_E (C_C ((C_E _ _,_)) _) C_D -> 99 
  C_E (C_C _ _) (C_G C_F) -> 100 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_G C_F) -> 101 
  C_E (C_C _ C_D) (C_E (C_C _ _) (C_G _)) -> 102 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E C_A C_D) -> 103 
  C_E (C_B (C_C _ _) _) (C_E (C_C _ _) (C_G _)) -> 104 
  C_E (C_C ((C_G _,_)) _) (C_E _ _) -> 105 
  C_E (C_C ((C_G _,_)) C_D) (C_E C_A C_F) -> 106 
  C_E (C_C ((C_F,_)) C_D) (C_G _) -> 107 
  C_E (C_C ((C_D,_)) C_F) (C_E _ C_D) -> 108 
  C_E (C_B _ _) (C_E _ (C_G _)) -> 109 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E (C_C _ _) C_F) -> 110 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E (C_C _ _) _) -> 111 
  C_E (C_B _ (C_B _ _)) C_D -> 112 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_G _) -> 113 
  C_E (C_B C_A C_A) (C_E _ C_F) -> 114 
  C_E (C_C _ C_D) (C_G C_F) -> 115 
  C_E C_A (C_E _ (C_G _)) -> 116 
  C_E (C_C ((C_F,_)) _) (C_E _ C_D) -> 117 
  C_E (C_C _ _) (C_E C_A C_D) -> 118 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E C_A C_D) -> 119 
  C_E (C_B C_A _) (C_G _) -> 120 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E (C_C _ _) C_F) -> 121 
  C_E (C_C _ (C_G _)) (C_G (C_G _)) -> 122 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E C_A C_F) -> 123 
  C_E (C_C ((C_F,_)) C_D) (C_G C_F) -> 124 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E _ C_D) -> 125 
  C_E (C_B C_A C_A) (C_E C_A _) -> 126 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E _ (C_G _)) -> 127 
  C_E (C_C ((C_G _,_)) C_D) (C_G C_F) -> 128 
  C_E _ (C_E (C_C _ _) (C_E _ _)) -> 129 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E C_A C_D) -> 130 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E (C_B _ _) (C_G _)) -> 131 
  C_E (C_C ((C_F,_)) _) (C_G _) -> 132 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_G C_D) -> 133 
  C_E (C_C ((C_D,_)) C_F) (C_E C_A C_F) -> 134 
  C_E (C_B (C_B _ _) _) (C_E (C_C _ _) _) -> 135 
  C_E (C_C ((C_D,_)) C_F) (C_G (C_G _)) -> 136 
  C_E (C_C ((C_G _,_)) _) (C_E (C_B _ _) C_F) -> 137 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E (C_B _ _) (C_G _)) -> 138 
  C_E (C_C ((C_D,_)) C_F) (C_E (C_B _ _) C_D) -> 139 
  C_E (C_B C_A _) (C_E (C_B _ _) (C_E _ _)) -> 140 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E (C_B _ _) _) -> 141 
  C_E (C_C ((C_D,_)) _) (C_E C_A C_F) -> 142 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E (C_C _ _) _) -> 143 
  C_E (C_B (C_C _ _) C_A) C_D -> 144 
  C_E (C_B (C_B _ _) _) (C_G (C_G _)) -> 145 
  C_E (C_C _ _) (C_G (C_E _ _)) -> 146 
  C_E (C_B _ (C_B _ _)) (C_E _ (C_G _)) -> 147 
  C_E _ _ -> 148 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_G (C_E _ _)) -> 149 
  C_E (C_B (C_C _ _) C_A) (C_E _ C_F) -> 150 
  C_E (C_B C_A C_A) (C_E C_A (C_E _ _)) -> 151 
  C_E (C_B (C_B _ _) _) _ -> 152 
  C_E (C_C ((C_D,_)) C_F) (C_E (C_B _ _) C_F) -> 153 
  C_E (C_B C_A _) (C_E (C_B _ _) C_F) -> 154 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E (C_C _ _) C_F) -> 155 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E _ C_D) -> 156 
  C_E _ (C_E (C_C _ _) _) -> 157 
  C_E (C_B (C_B _ _) _) (C_G C_F) -> 158 
  C_E (C_C _ (C_E _ _)) (C_E (C_B _ _) (C_G _)) -> 159 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E (C_B _ _) _) -> 160 
  C_E (C_B C_A (C_C _ _)) (C_E (C_B _ _) _) -> 161 
  C_E (C_C ((C_D,_)) C_F) (C_E C_A (C_G _)) -> 162 
  C_E (C_C ((C_F,_)) C_D) (C_E _ C_F) -> 163 
  C_E (C_B _ C_A) C_F -> 164 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E (C_B _ _) _) -> 165 
  C_E (C_C ((C_D,_)) C_F) (C_E (C_B _ _) _) -> 166 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E (C_C _ _) (C_G _)) -> 167 
  C_E (C_C ((C_D,_)) (C_G _)) (C_G C_D) -> 168 
  C_E (C_C ((C_F,_)) C_D) (C_E _ (C_G _)) -> 169 
  C_E (C_C _ (C_G _)) (C_E (C_C _ _) (C_G _)) -> 170 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E (C_B _ _) C_F) -> 171 
  C_E (C_C ((C_F,_)) C_F) (C_E (C_B _ _) C_F) -> 172 
  C_E (C_B _ (C_B _ _)) (C_G (C_G _)) -> 173 
  C_E (C_B C_A (C_B _ _)) (C_E C_A (C_E _ _)) -> 174 
  C_E (C_C ((C_D,_)) C_D) (C_E (C_B _ _) (C_G _)) -> 175 
  C_E (C_C _ (C_G _)) (C_E (C_B _ _) C_F) -> 176 
  C_E (C_B (C_B _ _) C_A) (C_E (C_B _ _) (C_G _)) -> 177 
  C_E (C_C ((C_G _,_)) C_D) (C_E _ C_D) -> 178 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E C_A (C_G _)) -> 179 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E (C_C _ _) C_D) -> 180 
  C_E (C_B (C_B _ _) _) (C_E (C_C _ _) (C_E _ _)) -> 181 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_G _) -> 182 
  C_E (C_C _ _) (C_G (C_G _)) -> 183 
  C_E (C_B (C_C _ _) C_A) (C_E _ (C_E _ _)) -> 184 
  C_E (C_B (C_B _ _) C_A) (C_G _) -> 185 
  C_E (C_B C_A _) C_D -> 186 
  C_E (C_C ((C_E _ _,_)) C_D) C_D -> 187 
  C_E (C_B (C_B _ _) _) (C_E (C_C _ _) C_D) -> 188 
  C_E (C_B (C_C _ _) (C_C _ _)) C_D -> 189 
  C_E (C_C ((C_G _,_)) _) (C_E (C_C _ _) C_D) -> 190 
  C_E (C_C _ (C_G _)) (C_E (C_C _ _) C_D) -> 191 
  C_E (C_C ((C_D,_)) C_D) (C_E (C_B _ _) C_F) -> 192 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_G (C_E _ _)) -> 193 
  C_E C_A (C_G _) -> 194 
  C_E (C_C ((C_D,_)) _) (C_E _ _) -> 195 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E C_A C_F) -> 196 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E _ _) -> 197 
  C_E (C_B (C_B _ _) _) (C_G C_D) -> 198 
  C_E (C_B _ (C_B _ _)) (C_E (C_C _ _) (C_E _ _)) -> 199 
  C_E (C_C ((C_G _,_)) _) _ -> 200 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E C_A C_D) -> 201 
  C_E (C_C _ (C_G _)) (C_G _) -> 202 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_G (C_G _)) -> 203 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E C_A (C_G _)) -> 204 
  C_E (C_C _ (C_E _ _)) (C_E (C_B _ _) _) -> 205 
  C_E (C_B (C_B _ _) _) (C_G (C_E _ _)) -> 206 
  C_E (C_B (C_B _ _) _) (C_E (C_B _ _) C_F) -> 207 
  C_E (C_C ((C_F,_)) C_D) (C_E C_A C_F) -> 208 
  C_E (C_C ((C_G _,_)) C_F) (C_E (C_B _ _) (C_G _)) -> 209 
  C_E _ (C_G C_D) -> 210 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E _ _) -> 211 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_G C_D) -> 212 
  C_E (C_B (C_B _ _) _) (C_E (C_B _ _) (C_E _ _)) -> 213 
  C_E (C_C ((C_D,_)) _) (C_E (C_B _ _) (C_E _ _)) -> 214 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E (C_B _ _) _) -> 215 
  C_E (C_C ((C_E _ _,_)) C_D) (C_G C_D) -> 216 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E (C_C _ _) (C_G _)) -> 217 
  C_E (C_B (C_C _ _) _) (C_E _ _) -> 218 
  C_E (C_C ((C_F,_)) C_F) (C_E (C_B _ _) _) -> 219 
  C_E (C_C ((C_G _,_)) _) (C_G C_D) -> 220 
  C_E (C_C ((C_F,_)) C_F) (C_E _ C_D) -> 221 
  C_E (C_C ((C_F,_)) (C_G _)) (C_G _) -> 222 
  C_E C_A (C_G C_F) -> 223 
  C_E (C_C ((C_F,_)) C_D) (C_E _ _) -> 224 
  C_E (C_C ((C_F,_)) _) (C_E C_A C_F) -> 225 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_G (C_G _)) -> 226 
  C_E (C_C ((C_D,_)) _) (C_E (C_B _ _) _) -> 227 
  C_E (C_C ((C_G _,_)) C_D) (C_E C_A C_D) -> 228 
  C_E (C_C _ (C_G _)) C_F -> 229 
  C_E (C_B _ (C_C _ _)) (C_G (C_E _ _)) -> 230 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E _ _) -> 231 
  C_E (C_C ((C_F,_)) _) (C_E (C_B _ _) (C_G _)) -> 232 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E (C_C _ _) (C_E _ _)) -> 233 
  C_E (C_B _ _) (C_E (C_C _ _) _) -> 234 
  C_E (C_C _ _) (C_E _ C_F) -> 235 
  C_E (C_C ((C_D,_)) C_F) (C_E (C_C _ _) (C_G _)) -> 236 
  C_E (C_C ((C_E _ _,_)) _) (C_G _) -> 237 
  C_E (C_C _ C_D) (C_E (C_C _ _) _) -> 238 
  C_E (C_C _ (C_E _ _)) (C_E (C_C _ _) (C_E _ _)) -> 239 
  C_E (C_C ((C_D,_)) _) (C_G C_F) -> 240 
