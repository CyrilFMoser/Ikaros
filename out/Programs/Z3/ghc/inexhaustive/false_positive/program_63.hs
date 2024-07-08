module Program_9 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A B_A | C_C ((B_B,Bool)) B_B
data B_B = C_D | C_E B_A B_B | C_F | C_G B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G (C_E C_A _) -> 0 
  C_G (C_E (C_C _ _) C_F) -> 1 
  C_G (C_G _) -> 2 
  C_E (C_B C_A C_A) (C_G C_F) -> 3 
  C_E (C_C _ (C_E _ _)) (C_E _ C_F) -> 4 
  C_E (C_C ((C_E _ _,_)) _) (C_E C_A C_D) -> 5 
  C_E C_A (C_E C_A (C_G _)) -> 6 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E _ C_F) -> 7 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E C_A C_F) -> 8 
  C_E (C_C _ C_F) (C_E C_A C_F) -> 9 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E (C_B _ _) _) -> 10 
  C_E (C_B C_A (C_C _ _)) (C_E C_A C_F) -> 11 
  C_E (C_B C_A (C_C _ _)) (C_E (C_C _ _) (C_E _ _)) -> 12 
  C_E (C_B C_A (C_C _ _)) (C_E _ (C_E _ _)) -> 13 
  C_E _ (C_E C_A C_F) -> 14 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E (C_C _ _) _) -> 15 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E C_A (C_G _)) -> 16 
  C_E (C_C ((C_D,_)) C_F) (C_G (C_E _ _)) -> 17 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_G C_F) -> 18 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E (C_C _ _) C_D) -> 19 
  C_E (C_C _ C_D) (C_G (C_G _)) -> 20 
  C_E (C_B (C_C _ _) C_A) (C_E C_A (C_E _ _)) -> 21 
  C_E _ (C_E (C_C _ _) C_D) -> 22 
  C_E (C_B _ (C_C _ _)) C_D -> 23 
  C_E (C_B C_A (C_B _ _)) (C_E (C_C _ _) C_F) -> 24 
  C_E (C_B (C_C _ _) C_A) (C_E (C_C _ _) C_F) -> 25 
  C_E (C_B C_A _) (C_E (C_C _ _) C_D) -> 26 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_G (C_G _)) -> 27 
  C_E (C_B (C_B _ _) _) (C_G _) -> 28 
  C_E (C_C ((C_G _,_)) C_F) C_F -> 29 
  C_E (C_C ((C_D,_)) _) (C_E C_A C_D) -> 30 
  C_E (C_B C_A C_A) (C_G _) -> 31 
  C_E (C_C ((C_F,_)) C_D) (C_E C_A (C_G _)) -> 32 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E _ C_D) -> 33 
  C_E (C_B _ (C_B _ _)) (C_E (C_C _ _) C_D) -> 34 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E _ (C_G _)) -> 35 
  C_E (C_B _ C_A) (C_E C_A C_D) -> 36 
  C_E (C_C ((C_F,_)) C_F) (C_E (C_B _ _) (C_E _ _)) -> 37 
  C_E C_A (C_E (C_C _ _) _) -> 38 
  C_E (C_B _ (C_C _ _)) (C_E C_A C_D) -> 39 
  C_E (C_C _ (C_E _ _)) (C_G (C_G _)) -> 40 
  C_E (C_C ((C_G _,_)) _) C_D -> 41 
  C_E (C_B (C_B _ _) _) (C_E C_A C_F) -> 42 
  C_E (C_C ((C_D,_)) (C_G _)) C_F -> 43 
  C_E (C_C ((C_E _ _,_)) _) (C_E (C_C _ _) C_F) -> 44 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_G C_F) -> 45 
  C_E (C_C ((C_E _ _,_)) C_F) (C_G (C_G _)) -> 46 
  C_E (C_B _ _) _ -> 47 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E (C_B _ _) (C_E _ _)) -> 48 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E C_A (C_G _)) -> 49 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E (C_B _ _) C_F) -> 50 
  C_E (C_B C_A (C_B _ _)) (C_E _ (C_E _ _)) -> 51 
  C_E (C_C _ C_F) _ -> 52 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E (C_B _ _) C_D) -> 53 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_B _ _) C_F) -> 54 
  C_E (C_B (C_C _ _) _) (C_E _ C_D) -> 55 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_G C_D) -> 56 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E _ _) -> 57 
  C_E (C_C ((C_D,_)) (C_E _ _)) C_D -> 58 
  C_E (C_C ((C_E _ _,_)) (C_G _)) C_F -> 59 
  C_E (C_B _ C_A) (C_E C_A _) -> 60 
  C_E (C_B _ (C_B _ _)) (C_E (C_B _ _) C_F) -> 61 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_C _ _) (C_E _ _)) -> 62 
  C_E (C_B C_A _) (C_E C_A C_F) -> 63 
  C_E (C_C ((C_F,_)) C_D) (C_E (C_B _ _) C_D) -> 64 
  C_E (C_C ((C_F,_)) (C_G _)) (C_G C_F) -> 65 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E _ (C_G _)) -> 66 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E C_A _) -> 67 
  C_E (C_B (C_B _ _) _) C_D -> 68 
  C_E (C_B (C_B _ _) _) (C_E (C_B _ _) C_D) -> 69 
  C_E (C_B _ C_A) (C_E C_A (C_E _ _)) -> 70 
  C_E (C_C _ _) (C_E (C_C _ _) C_D) -> 71 
  C_E (C_B _ (C_B _ _)) (C_E (C_C _ _) (C_G _)) -> 72 
  C_E C_A (C_E (C_C _ _) C_D) -> 73 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E _ C_D) -> 74 
  C_E (C_C ((C_G _,_)) C_F) (C_E _ (C_E _ _)) -> 75 
  C_E (C_C ((C_G _,_)) _) (C_E _ (C_E _ _)) -> 76 
  C_E (C_B _ _) (C_G (C_G _)) -> 77 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E (C_C _ _) C_D) -> 78 
  C_E (C_B (C_B _ _) C_A) (C_E (C_C _ _) C_D) -> 79 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E (C_C _ _) (C_G _)) -> 80 
  C_E (C_C ((C_F,_)) C_D) (C_E (C_B _ _) _) -> 81 
  C_E (C_C _ (C_G _)) C_D -> 82 
  C_E (C_B (C_C _ _) _) (C_E (C_B _ _) C_F) -> 83 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E (C_C _ _) (C_E _ _)) -> 84 
  C_E (C_C _ C_F) (C_E (C_B _ _) (C_G _)) -> 85 
  C_E (C_B C_A C_A) (C_E (C_B _ _) C_D) -> 86 
  C_E (C_C _ C_D) (C_E C_A C_F) -> 87 
  C_E (C_B _ (C_B _ _)) (C_E C_A (C_G _)) -> 88 
  C_E (C_C ((C_D,_)) C_F) (C_E C_A _) -> 89 
  C_E (C_B (C_B _ _) _) (C_E _ (C_E _ _)) -> 90 
  C_E (C_C ((C_D,_)) _) (C_E (C_C _ _) C_D) -> 91 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E C_A C_F) -> 92 
  C_E (C_B C_A _) (C_G (C_E _ _)) -> 93 
  C_E (C_C ((C_D,_)) C_D) (C_E (C_C _ _) C_D) -> 94 
  C_E (C_B (C_C _ _) _) (C_E C_A _) -> 95 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E (C_C _ _) C_F) -> 96 
  C_E (C_B (C_C _ _) C_A) (C_E _ _) -> 97 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E (C_B _ _) (C_E _ _)) -> 98 
  C_E (C_B C_A _) (C_E _ C_F) -> 99 
  C_E (C_C _ C_F) (C_E (C_C _ _) _) -> 100 
  C_E (C_C ((C_F,_)) _) (C_E C_A _) -> 101 
  C_E (C_C ((C_D,_)) _) (C_E _ C_D) -> 102 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E C_A _) -> 103 
  C_E (C_C ((C_D,_)) _) (C_G (C_G _)) -> 104 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E (C_C _ _) C_D) -> 105 
  C_E (C_B (C_C _ _) C_A) (C_G _) -> 106 
  C_E (C_C ((C_E _ _,_)) C_F) (C_G _) -> 107 
  C_E (C_B _ (C_B _ _)) C_F -> 108 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E (C_B _ _) (C_G _)) -> 109 
  C_E (C_B C_A (C_B _ _)) (C_E (C_B _ _) (C_E _ _)) -> 110 
  C_E (C_C ((C_D,_)) C_F) (C_E (C_C _ _) C_D) -> 111 
  C_E (C_C _ (C_G _)) (C_E C_A C_F) -> 112 
  C_E (C_B (C_C _ _) (C_B _ _)) C_D -> 113 
  C_E (C_B (C_B _ _) C_A) (C_E C_A (C_E _ _)) -> 114 
  C_E (C_B C_A (C_B _ _)) _ -> 115 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E (C_C _ _) _) -> 116 
  C_E (C_B C_A C_A) _ -> 117 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_B _ _) (C_G _)) -> 118 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_G _) -> 119 
  C_E (C_C ((C_F,_)) C_D) (C_E (C_C _ _) C_F) -> 120 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E _ (C_E _ _)) -> 121 
  C_E (C_C ((C_F,_)) C_D) (C_E _ (C_E _ _)) -> 122 
  C_E (C_C ((C_F,_)) C_D) (C_E (C_B _ _) (C_E _ _)) -> 123 
  C_E (C_B C_A (C_B _ _)) (C_E _ _) -> 124 
  C_E (C_C ((C_D,_)) _) (C_E (C_C _ _) C_F) -> 125 
  C_E (C_B C_A (C_B _ _)) (C_E C_A C_D) -> 126 
  C_E (C_B _ _) (C_E _ C_D) -> 127 
  C_E (C_C ((C_G _,_)) C_D) (C_E (C_B _ _) C_F) -> 128 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E (C_C _ _) _) -> 129 
  C_E (C_C _ (C_G _)) (C_E C_A (C_G _)) -> 130 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E _ C_F) -> 131 
  C_E (C_B (C_B _ _) (C_B _ _)) C_D -> 132 
  C_E (C_C ((C_D,_)) _) C_D -> 133 
  C_E _ (C_E (C_B _ _) (C_G _)) -> 134 
  C_E (C_B _ (C_B _ _)) (C_G C_F) -> 135 
  C_E (C_B _ _) (C_E (C_B _ _) (C_E _ _)) -> 136 
  C_E (C_C ((C_D,_)) C_D) (C_E (C_C _ _) (C_G _)) -> 137 
  C_E (C_C _ C_D) (C_E _ (C_G _)) -> 138 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E (C_B _ _) C_F) -> 139 
  C_E (C_B (C_B _ _) _) (C_E C_A _) -> 140 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_G C_F) -> 141 
  C_E (C_B (C_B _ _) _) (C_E C_A C_D) -> 142 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_G (C_G _)) -> 143 
  C_E (C_C _ C_D) (C_E (C_C _ _) C_F) -> 144 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_G C_F) -> 145 
  C_E (C_C _ (C_G _)) (C_G C_D) -> 146 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E (C_B _ _) (C_E _ _)) -> 147 
  C_E (C_C _ _) (C_E C_A C_F) -> 148 
  C_E (C_B (C_C _ _) _) (C_G (C_E _ _)) -> 149 
  C_E (C_C ((C_F,_)) C_F) (C_E C_A C_F) -> 150 
  C_E (C_B C_A _) (C_G C_F) -> 151 
  C_E (C_C ((C_F,_)) C_F) (C_E (C_C _ _) (C_E _ _)) -> 152 
  C_E (C_C _ _) (C_E C_A (C_G _)) -> 153 
  C_E (C_C ((C_D,_)) _) (C_E (C_C _ _) (C_E _ _)) -> 154 
  C_E (C_B _ (C_C _ _)) _ -> 155 
  C_E _ (C_E (C_B _ _) C_D) -> 156 
  C_E (C_C ((C_G _,_)) _) (C_E C_A (C_G _)) -> 157 
  C_E C_A (C_E _ C_F) -> 158 
  C_E _ (C_E _ (C_E _ _)) -> 159 
  C_E (C_C ((C_G _,_)) _) (C_G (C_E _ _)) -> 160 
  C_E (C_B _ (C_C _ _)) (C_E (C_C _ _) (C_E _ _)) -> 161 
  C_E (C_B _ C_A) (C_E (C_B _ _) C_F) -> 162 
  C_E (C_B (C_C _ _) _) (C_E (C_C _ _) (C_E _ _)) -> 163 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_G C_D) -> 164 
  C_E (C_C ((C_F,_)) C_D) (C_E _ C_D) -> 165 
  C_E (C_C ((C_D,_)) C_D) (C_E _ _) -> 166 
  C_E (C_B _ C_A) (C_E (C_C _ _) (C_E _ _)) -> 167 
  C_E (C_C ((C_E _ _,_)) _) (C_E (C_B _ _) _) -> 168 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_B _ _) C_D) -> 169 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E (C_C _ _) (C_G _)) -> 170 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E (C_C _ _) _) -> 171 
  C_E (C_C ((C_G _,_)) C_F) (C_G _) -> 172 
  C_E (C_C _ (C_G _)) (C_E (C_B _ _) (C_G _)) -> 173 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E C_A (C_G _)) -> 174 
  C_E (C_B C_A (C_C _ _)) (C_E C_A C_D) -> 175 
  C_E (C_B (C_C _ _) C_A) (C_E C_A (C_G _)) -> 176 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E C_A (C_E _ _)) -> 177 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E (C_B _ _) (C_E _ _)) -> 178 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E _ C_D) -> 179 
  C_E (C_C ((C_F,_)) (C_G _)) (C_G C_D) -> 180 
  C_E (C_C ((C_F,_)) C_F) (C_E C_A _) -> 181 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E _ C_F) -> 182 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E _ (C_E _ _)) -> 183 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E C_A (C_E _ _)) -> 184 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E C_A (C_E _ _)) -> 185 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E _ (C_G _)) -> 186 
  C_E (C_C ((C_E _ _,_)) C_D) (C_G (C_G _)) -> 187 
  C_E (C_C ((C_G _,_)) (C_G _)) C_D -> 188 
  C_E (C_B C_A (C_B _ _)) (C_E (C_C _ _) _) -> 189 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E C_A C_D) -> 190 
  C_E (C_B _ C_A) (C_E _ C_F) -> 191 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_G (C_E _ _)) -> 192 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E C_A C_D) -> 193 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E _ _) -> 194 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E C_A C_D) -> 195 
  C_E (C_C ((C_G _,_)) C_F) (C_E C_A C_D) -> 196 
  C_E (C_C ((C_G _,_)) _) (C_E (C_C _ _) _) -> 197 
  C_E (C_B (C_B _ _) C_A) (C_E (C_B _ _) C_D) -> 198 
  C_E (C_B (C_B _ _) C_A) (C_E (C_B _ _) (C_E _ _)) -> 199 
  C_E (C_C ((C_G _,_)) C_D) (C_E C_A (C_E _ _)) -> 200 
  C_E (C_B C_A (C_C _ _)) (C_E (C_C _ _) C_F) -> 201 
  C_E (C_C ((C_D,_)) _) (C_E (C_C _ _) (C_G _)) -> 202 
  C_E (C_C _ C_D) (C_E _ C_F) -> 203 
  C_E (C_C _ _) (C_E C_A _) -> 204 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E (C_C _ _) C_F) -> 205 
  C_E (C_C _ C_D) (C_E (C_B _ _) C_F) -> 206 
  C_E (C_C _ C_D) (C_G _) -> 207 
  C_E (C_C _ _) (C_E _ (C_G _)) -> 208 
  C_E (C_B _ _) (C_E C_A C_D) -> 209 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E _ _) -> 210 
  C_E (C_C ((C_F,_)) _) (C_E C_A (C_E _ _)) -> 211 
  C_E (C_C ((C_F,_)) C_F) (C_G (C_G _)) -> 212 
  C_E (C_C ((C_F,_)) C_F) (C_E C_A C_D) -> 213 
  C_E (C_B (C_B _ _) (C_B _ _)) C_F -> 214 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E C_A _) -> 215 
  C_E (C_B C_A C_A) (C_E _ C_D) -> 216 
  C_E (C_C ((C_G _,_)) C_D) (C_E C_A (C_G _)) -> 217 
  C_E (C_B _ (C_B _ _)) (C_E C_A _) -> 218 
  C_E (C_B (C_B _ _) (C_C _ _)) C_D -> 219 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E (C_B _ _) _) -> 220 
  C_E (C_C ((C_D,_)) C_D) (C_G (C_E _ _)) -> 221 
  C_E (C_C ((C_G _,_)) C_F) (C_E _ _) -> 222 
  C_E (C_C ((C_F,_)) C_D) (C_E C_A C_D) -> 223 
  C_E (C_C _ C_D) (C_E C_A C_D) -> 224 
  C_E (C_C ((C_E _ _,_)) _) C_F -> 225 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E _ _) -> 226 
  C_E (C_B (C_B _ _) C_A) (C_G C_F) -> 227 
  C_E (C_C ((C_E _ _,_)) _) (C_E _ _) -> 228 
  C_E (C_B _ (C_B _ _)) (C_E _ _) -> 229 
  C_E (C_B (C_C _ _) _) (C_G (C_G _)) -> 230 
  C_E _ (C_E (C_B _ _) C_F) -> 231 
  C_E (C_C ((C_F,_)) C_F) (C_G C_F) -> 232 
  C_E (C_C ((C_G _,_)) C_D) (C_E C_A _) -> 233 
  C_E (C_B (C_C _ _) C_A) (C_G (C_G _)) -> 234 
  C_E (C_C ((C_D,_)) _) (C_E C_A _) -> 235 
  C_E C_A C_D -> 236 
  C_E (C_C ((C_G _,_)) _) (C_E (C_B _ _) C_D) -> 237 
  C_E (C_C _ C_F) (C_E _ (C_G _)) -> 238 
  C_E _ (C_G (C_G _)) -> 239 
  C_E (C_B C_A C_A) (C_G C_D) -> 240 
  C_E (C_C ((C_E _ _,_)) _) (C_G (C_E _ _)) -> 241 
  C_E (C_C _ C_D) (C_E _ _) -> 242 
  C_E (C_C ((C_F,_)) _) (C_E (C_C _ _) C_F) -> 243 
  C_E (C_B (C_B _ _) C_A) (C_E _ (C_E _ _)) -> 244 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E (C_B _ _) C_D) -> 245 
  C_E _ (C_E C_A _) -> 246 
  C_E (C_C ((C_G _,_)) C_D) (C_E (C_C _ _) C_D) -> 247 
  C_E (C_C _ _) (C_E C_A (C_E _ _)) -> 248 
  C_E C_A (C_E _ _) -> 249 
  C_E (C_B C_A _) (C_E C_A _) -> 250 
  C_E (C_C _ _) (C_E _ (C_E _ _)) -> 251 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E _ (C_E _ _)) -> 252 
  C_E (C_C ((C_G _,_)) (C_G _)) C_F -> 253 
  C_E (C_B _ (C_C _ _)) (C_E _ (C_E _ _)) -> 254 
  C_E (C_B C_A (C_C _ _)) C_D -> 255 
  C_E (C_C _ _) C_F -> 256 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E (C_B _ _) C_D) -> 257 
  C_E (C_B (C_C _ _) _) (C_E C_A C_D) -> 258 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E (C_C _ _) (C_G _)) -> 259 
  C_E (C_B (C_C _ _) _) (C_E (C_B _ _) _) -> 260 
  C_E (C_C ((C_D,_)) C_F) (C_E _ (C_G _)) -> 261 
