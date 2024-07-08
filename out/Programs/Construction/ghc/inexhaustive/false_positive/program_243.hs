module Program_26 () where 

 main = print $ show v_b
data B_A = C_A ((Bool,B_A)) | C_B B_A B_A | C_C B_A | C_D B_A B_A | C_E

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B _ _ -> 1 
  C_C (C_A ((_,_))) -> 2 
  C_C (C_B (C_A _) _) -> 3 
  C_C (C_B (C_B _ _) _) -> 4 
  C_C (C_B (C_C _) _) -> 5 
  C_C (C_B (C_D _ _) _) -> 6 
  C_C (C_B C_E _) -> 7 
  C_C (C_C _) -> 8 
  C_C (C_D _ _) -> 9 
  C_C C_E -> 10 
  C_D (C_A _) (C_A _) -> 11 
  C_D (C_B (C_A _) (C_A _)) (C_A _) -> 12 
  C_D (C_B (C_A _) (C_B _ _)) (C_A _) -> 13 
  C_D (C_B (C_A _) (C_C _)) (C_A _) -> 14 
  C_D (C_B (C_A _) (C_D _ _)) (C_A _) -> 15 
  C_D (C_B (C_A _) C_E) (C_A _) -> 16 
  C_D (C_B (C_B _ _) (C_A _)) (C_A _) -> 17 
  C_D (C_B (C_B _ _) (C_B _ _)) (C_A _) -> 18 
  C_D (C_B (C_B _ _) (C_C _)) (C_A _) -> 19 
  C_D (C_B (C_B _ _) (C_D _ _)) (C_A _) -> 20 
  C_D (C_B (C_B _ _) C_E) (C_A _) -> 21 
  C_D (C_B (C_C _) (C_A _)) (C_A _) -> 22 
  C_D (C_B (C_C _) (C_B _ _)) (C_A _) -> 23 
  C_D (C_B (C_C _) (C_C _)) (C_A _) -> 24 
  C_D (C_B (C_C _) (C_D _ _)) (C_A _) -> 25 
  C_D (C_B (C_C _) C_E) (C_A _) -> 26 
  C_D (C_B (C_D _ _) (C_A _)) (C_A _) -> 27 
  C_D (C_B (C_D _ _) (C_B _ _)) (C_A _) -> 28 
  C_D (C_B (C_D _ _) (C_C _)) (C_A _) -> 29 
  C_D (C_B (C_D _ _) (C_D _ _)) (C_A _) -> 30 
  C_D (C_B (C_D _ _) C_E) (C_A _) -> 31 
  C_D (C_B C_E (C_A _)) (C_A _) -> 32 
  C_D (C_B C_E (C_B _ _)) (C_A _) -> 33 
  C_D (C_B C_E (C_C _)) (C_A _) -> 34 
  C_D (C_B C_E (C_D _ _)) (C_A _) -> 35 
  C_D (C_B C_E C_E) (C_A _) -> 36 
  C_D (C_C (C_A _)) (C_A _) -> 37 
  C_D (C_C (C_B _ _)) (C_A _) -> 38 
  C_D (C_C (C_C _)) (C_A _) -> 39 
  C_D (C_C (C_D _ _)) (C_A _) -> 40 
  C_D (C_C C_E) (C_A _) -> 41 
  C_D (C_D _ (C_A _)) (C_A _) -> 42 
  C_D (C_D _ (C_B _ _)) (C_A _) -> 43 
  C_D (C_D _ (C_C _)) (C_A _) -> 44 
  C_D (C_D _ (C_D _ _)) (C_A _) -> 45 
  C_D (C_D _ C_E) (C_A _) -> 46 
  C_D C_E (C_A _) -> 47 
  C_D (C_A _) (C_B _ _) -> 48 
  C_D (C_B (C_A _) (C_A _)) (C_B _ _) -> 49 
  C_D (C_B (C_A _) (C_B _ _)) (C_B _ _) -> 50 
  C_D (C_B (C_A _) (C_C _)) (C_B _ _) -> 51 
  C_D (C_B (C_A _) (C_D _ _)) (C_B _ _) -> 52 
  C_D (C_B (C_A _) C_E) (C_B _ _) -> 53 
  C_D (C_B (C_B _ _) (C_A _)) (C_B _ _) -> 54 
  C_D (C_B (C_B _ _) (C_B _ _)) (C_B _ _) -> 55 
  C_D (C_B (C_B _ _) (C_C _)) (C_B _ _) -> 56 
  C_D (C_B (C_B _ _) (C_D _ _)) (C_B _ _) -> 57 
  C_D (C_B (C_B _ _) C_E) (C_B _ _) -> 58 
  C_D (C_B (C_C _) (C_A _)) (C_B _ _) -> 59 
  C_D (C_B (C_C _) (C_B _ _)) (C_B _ _) -> 60 
  C_D (C_B (C_C _) (C_C _)) (C_B _ _) -> 61 
  C_D (C_B (C_C _) (C_D _ _)) (C_B _ _) -> 62 
  C_D (C_B (C_C _) C_E) (C_B _ _) -> 63 
  C_D (C_B (C_D _ _) (C_A _)) (C_B _ _) -> 64 
  C_D (C_B (C_D _ _) (C_B _ _)) (C_B _ _) -> 65 
  C_D (C_B (C_D _ _) (C_C _)) (C_B _ _) -> 66 
  C_D (C_B (C_D _ _) (C_D _ _)) (C_B _ _) -> 67 
  C_D (C_B (C_D _ _) C_E) (C_B _ _) -> 68 
  C_D (C_B C_E (C_A _)) (C_B _ _) -> 69 
  C_D (C_B C_E (C_B _ _)) (C_B _ _) -> 70 
  C_D (C_B C_E (C_C _)) (C_B _ _) -> 71 
  C_D (C_B C_E (C_D _ _)) (C_B _ _) -> 72 
  C_D (C_B C_E C_E) (C_B _ _) -> 73 
  C_D (C_C (C_A _)) (C_B _ _) -> 74 
  C_D (C_C (C_B _ _)) (C_B _ _) -> 75 
  C_D (C_C (C_C _)) (C_B _ _) -> 76 
  C_D (C_C (C_D _ _)) (C_B _ _) -> 77 
  C_D (C_C C_E) (C_B _ _) -> 78 
  C_D (C_D _ (C_A _)) (C_B _ _) -> 79 
  C_D (C_D _ (C_B _ _)) (C_B _ _) -> 80 
  C_D (C_D _ (C_C _)) (C_B _ _) -> 81 
  C_D (C_D _ (C_D _ _)) (C_B _ _) -> 82 
  C_D (C_D _ C_E) (C_B _ _) -> 83 
  C_D C_E (C_B _ _) -> 84 
  C_D (C_A _) (C_C (C_A _)) -> 85 
  C_D (C_B (C_A _) (C_A _)) (C_C (C_A _)) -> 86 
  C_D (C_B (C_A _) (C_B _ _)) (C_C (C_A _)) -> 87 
  C_D (C_B (C_A _) (C_C _)) (C_C (C_A _)) -> 88 
  C_D (C_B (C_A _) (C_D _ _)) (C_C (C_A _)) -> 89 
  C_D (C_B (C_A _) C_E) (C_C (C_A _)) -> 90 
  C_D (C_B (C_B _ _) (C_A _)) (C_C (C_A _)) -> 91 
  C_D (C_B (C_B _ _) (C_B _ _)) (C_C (C_A _)) -> 92 
  C_D (C_B (C_B _ _) (C_C _)) (C_C (C_A _)) -> 93 
  C_D (C_B (C_B _ _) (C_D _ _)) (C_C (C_A _)) -> 94 
  C_D (C_B (C_B _ _) C_E) (C_C (C_A _)) -> 95 
  C_D (C_B (C_C _) (C_A _)) (C_C (C_A _)) -> 96 
  C_D (C_B (C_C _) (C_B _ _)) (C_C (C_A _)) -> 97 
  C_D (C_B (C_C _) (C_C _)) (C_C (C_A _)) -> 98 
  C_D (C_B (C_C _) (C_D _ _)) (C_C (C_A _)) -> 99 
  C_D (C_B (C_C _) C_E) (C_C (C_A _)) -> 100 
  C_D (C_B (C_D _ _) (C_A _)) (C_C (C_A _)) -> 101 
  C_D (C_B (C_D _ _) (C_B _ _)) (C_C (C_A _)) -> 102 
  C_D (C_B (C_D _ _) (C_C _)) (C_C (C_A _)) -> 103 
  C_D (C_B (C_D _ _) (C_D _ _)) (C_C (C_A _)) -> 104 
  C_D (C_B (C_D _ _) C_E) (C_C (C_A _)) -> 105 
  C_D (C_B C_E (C_A _)) (C_C (C_A _)) -> 106 
  C_D (C_B C_E (C_B _ _)) (C_C (C_A _)) -> 107 
  C_D (C_B C_E (C_C _)) (C_C (C_A _)) -> 108 
  C_D (C_B C_E (C_D _ _)) (C_C (C_A _)) -> 109 
  C_D (C_B C_E C_E) (C_C (C_A _)) -> 110 
  C_D (C_C (C_A _)) (C_C (C_A _)) -> 111 
  C_D (C_C (C_B _ _)) (C_C (C_A _)) -> 112 
  C_D (C_C (C_C _)) (C_C (C_A _)) -> 113 
  C_D (C_C (C_D _ _)) (C_C (C_A _)) -> 114 
  C_D (C_C C_E) (C_C (C_A _)) -> 115 
  C_D (C_D _ (C_A _)) (C_C (C_A _)) -> 116 
  C_D (C_D _ (C_B _ _)) (C_C (C_A _)) -> 117 
  C_D (C_D _ (C_C _)) (C_C (C_A _)) -> 118 
  C_D (C_D _ (C_D _ _)) (C_C (C_A _)) -> 119 
  C_D (C_D _ C_E) (C_C (C_A _)) -> 120 
  C_D C_E (C_C (C_A _)) -> 121 
  C_D (C_A _) (C_C (C_B _ _)) -> 122 
  C_D (C_B (C_A _) (C_A _)) (C_C (C_B _ _)) -> 123 
  C_D (C_B (C_A _) (C_B _ _)) (C_C (C_B _ _)) -> 124 
  C_D (C_B (C_A _) (C_C _)) (C_C (C_B _ _)) -> 125 
  C_D (C_B (C_A _) (C_D _ _)) (C_C (C_B _ _)) -> 126 
  C_D (C_B (C_A _) C_E) (C_C (C_B _ _)) -> 127 
  C_D (C_B (C_B _ _) (C_A _)) (C_C (C_B _ _)) -> 128 
  C_D (C_B (C_B _ _) (C_B _ _)) (C_C (C_B _ _)) -> 129 
  C_D (C_B (C_B _ _) (C_C _)) (C_C (C_B _ _)) -> 130 
  C_D (C_B (C_B _ _) (C_D _ _)) (C_C (C_B _ _)) -> 131 
  C_D (C_B (C_B _ _) C_E) (C_C (C_B _ _)) -> 132 
  C_D (C_B (C_C _) (C_A _)) (C_C (C_B _ _)) -> 133 
  C_D (C_B (C_C _) (C_B _ _)) (C_C (C_B _ _)) -> 134 
  C_D (C_B (C_C _) (C_C _)) (C_C (C_B _ _)) -> 135 
  C_D (C_B (C_C _) (C_D _ _)) (C_C (C_B _ _)) -> 136 
  C_D (C_B (C_C _) C_E) (C_C (C_B _ _)) -> 137 
  C_D (C_B (C_D _ _) (C_A _)) (C_C (C_B _ _)) -> 138 
  C_D (C_B (C_D _ _) (C_B _ _)) (C_C (C_B _ _)) -> 139 
  C_D (C_B (C_D _ _) (C_C _)) (C_C (C_B _ _)) -> 140 
  C_D (C_B (C_D _ _) (C_D _ _)) (C_C (C_B _ _)) -> 141 
  C_D (C_B (C_D _ _) C_E) (C_C (C_B _ _)) -> 142 
  C_D (C_B C_E (C_A _)) (C_C (C_B _ _)) -> 143 
  C_D (C_B C_E (C_B _ _)) (C_C (C_B _ _)) -> 144 
  C_D (C_B C_E (C_C _)) (C_C (C_B _ _)) -> 145 
  C_D (C_B C_E (C_D _ _)) (C_C (C_B _ _)) -> 146 
  C_D (C_B C_E C_E) (C_C (C_B _ _)) -> 147 
  C_D (C_C (C_A _)) (C_C (C_B _ _)) -> 148 
  C_D (C_C (C_B _ _)) (C_C (C_B _ _)) -> 149 
  C_D (C_C (C_C _)) (C_C (C_B _ _)) -> 150 
  C_D (C_C (C_D _ _)) (C_C (C_B _ _)) -> 151 
  C_D (C_C C_E) (C_C (C_B _ _)) -> 152 
  C_D (C_D _ (C_A _)) (C_C (C_B _ _)) -> 153 
  C_D (C_D _ (C_B _ _)) (C_C (C_B _ _)) -> 154 
  C_D (C_D _ (C_C _)) (C_C (C_B _ _)) -> 155 
  C_D (C_D _ (C_D _ _)) (C_C (C_B _ _)) -> 156 
  C_D (C_D _ C_E) (C_C (C_B _ _)) -> 157 
  C_D C_E (C_C (C_B _ _)) -> 158 
  C_D (C_A _) (C_C (C_C _)) -> 159 
  C_D (C_B (C_A _) (C_A _)) (C_C (C_C _)) -> 160 
  C_D (C_B (C_A _) (C_B _ _)) (C_C (C_C _)) -> 161 
  C_D (C_B (C_A _) (C_C _)) (C_C (C_C _)) -> 162 
  C_D (C_B (C_A _) (C_D _ _)) (C_C (C_C _)) -> 163 
  C_D (C_B (C_A _) C_E) (C_C (C_C _)) -> 164 
  C_D (C_B (C_B _ _) (C_A _)) (C_C (C_C _)) -> 165 
  C_D (C_B (C_B _ _) (C_B _ _)) (C_C (C_C _)) -> 166 
  C_D (C_B (C_B _ _) (C_C _)) (C_C (C_C _)) -> 167 
  C_D (C_B (C_B _ _) (C_D _ _)) (C_C (C_C _)) -> 168 
  C_D (C_B (C_B _ _) C_E) (C_C (C_C _)) -> 169 
  C_D (C_B (C_C _) (C_A _)) (C_C (C_C _)) -> 170 
  C_D (C_B (C_C _) (C_B _ _)) (C_C (C_C _)) -> 171 
  C_D (C_B (C_C _) (C_C _)) (C_C (C_C _)) -> 172 
  C_D (C_B (C_C _) (C_D _ _)) (C_C (C_C _)) -> 173 
  C_D (C_B (C_C _) C_E) (C_C (C_C _)) -> 174 
  C_D (C_B (C_D _ _) (C_A _)) (C_C (C_C _)) -> 175 
  C_D (C_B (C_D _ _) (C_B _ _)) (C_C (C_C _)) -> 176 
  C_D (C_B (C_D _ _) (C_C _)) (C_C (C_C _)) -> 177 
  C_D (C_B (C_D _ _) (C_D _ _)) (C_C (C_C _)) -> 178 
  C_D (C_B (C_D _ _) C_E) (C_C (C_C _)) -> 179 
  C_D (C_B C_E (C_A _)) (C_C (C_C _)) -> 180 
  C_D (C_B C_E (C_B _ _)) (C_C (C_C _)) -> 181 
  C_D (C_B C_E (C_C _)) (C_C (C_C _)) -> 182 
  C_D (C_B C_E (C_D _ _)) (C_C (C_C _)) -> 183 
  C_D (C_B C_E C_E) (C_C (C_C _)) -> 184 
  C_D (C_C (C_A _)) (C_C (C_C _)) -> 185 
  C_D (C_C (C_B _ _)) (C_C (C_C _)) -> 186 
  C_D (C_C (C_C _)) (C_C (C_C _)) -> 187 
  C_D (C_C (C_D _ _)) (C_C (C_C _)) -> 188 
  C_D (C_C C_E) (C_C (C_C _)) -> 189 
  C_D (C_D _ (C_A _)) (C_C (C_C _)) -> 190 
  C_D (C_D _ (C_B _ _)) (C_C (C_C _)) -> 191 
  C_D (C_D _ (C_C _)) (C_C (C_C _)) -> 192 
  C_D (C_D _ (C_D _ _)) (C_C (C_C _)) -> 193 
  C_D (C_D _ C_E) (C_C (C_C _)) -> 194 
  C_D C_E (C_C (C_C _)) -> 195 
  C_D (C_A _) (C_C (C_D _ _)) -> 196 
  C_D (C_B (C_A _) (C_A _)) (C_C (C_D _ _)) -> 197 
  C_D (C_B (C_A _) (C_B _ _)) (C_C (C_D _ _)) -> 198 
  C_D (C_B (C_A _) (C_C _)) (C_C (C_D _ _)) -> 199 
  C_D (C_B (C_A _) (C_D _ _)) (C_C (C_D _ _)) -> 200 
  C_D (C_B (C_A _) C_E) (C_C (C_D _ _)) -> 201 
  C_D (C_B (C_B _ _) (C_A _)) (C_C (C_D _ _)) -> 202 
  C_D (C_B (C_B _ _) (C_B _ _)) (C_C (C_D _ _)) -> 203 
  C_D (C_B (C_B _ _) (C_C _)) (C_C (C_D _ _)) -> 204 
  C_D (C_B (C_B _ _) (C_D _ _)) (C_C (C_D _ _)) -> 205 
  C_D (C_B (C_B _ _) C_E) (C_C (C_D _ _)) -> 206 
  C_D (C_B (C_C _) (C_A _)) (C_C (C_D _ _)) -> 207 
  C_D (C_B (C_C _) (C_B _ _)) (C_C (C_D _ _)) -> 208 
  C_D (C_B (C_C _) (C_C _)) (C_C (C_D _ _)) -> 209 
  C_D (C_B (C_C _) (C_D _ _)) (C_C (C_D _ _)) -> 210 
  C_D (C_B (C_C _) C_E) (C_C (C_D _ _)) -> 211 
  C_D (C_B (C_D _ _) (C_A _)) (C_C (C_D _ _)) -> 212 
  C_D (C_B (C_D _ _) (C_B _ _)) (C_C (C_D _ _)) -> 213 
  C_D (C_B (C_D _ _) (C_C _)) (C_C (C_D _ _)) -> 214 
  C_D (C_B (C_D _ _) (C_D _ _)) (C_C (C_D _ _)) -> 215 
  C_D (C_B (C_D _ _) C_E) (C_C (C_D _ _)) -> 216 
  C_D (C_B C_E (C_A _)) (C_C (C_D _ _)) -> 217 
  C_D (C_B C_E (C_B _ _)) (C_C (C_D _ _)) -> 218 
  C_D (C_B C_E (C_C _)) (C_C (C_D _ _)) -> 219 
  C_D (C_B C_E (C_D _ _)) (C_C (C_D _ _)) -> 220 
  C_D (C_B C_E C_E) (C_C (C_D _ _)) -> 221 
  C_D (C_C (C_A _)) (C_C (C_D _ _)) -> 222 
  C_D (C_C (C_B _ _)) (C_C (C_D _ _)) -> 223 
  C_D (C_C (C_C _)) (C_C (C_D _ _)) -> 224 
  C_D (C_C (C_D _ _)) (C_C (C_D _ _)) -> 225 
  C_D (C_C C_E) (C_C (C_D _ _)) -> 226 
  C_D (C_D _ (C_A _)) (C_C (C_D _ _)) -> 227 
  C_D (C_D _ (C_B _ _)) (C_C (C_D _ _)) -> 228 
  C_D (C_D _ (C_C _)) (C_C (C_D _ _)) -> 229 
  C_D (C_D _ (C_D _ _)) (C_C (C_D _ _)) -> 230 
  C_D (C_D _ C_E) (C_C (C_D _ _)) -> 231 
  C_D C_E (C_C (C_D _ _)) -> 232 
  C_D (C_A _) (C_C C_E) -> 233 
  C_D (C_B (C_A _) (C_A _)) (C_C C_E) -> 234 
  C_D (C_B (C_A _) (C_B _ _)) (C_C C_E) -> 235 
  C_D (C_B (C_A _) (C_C _)) (C_C C_E) -> 236 
  C_D (C_B (C_A _) (C_D _ _)) (C_C C_E) -> 237 
  C_D (C_B (C_A _) C_E) (C_C C_E) -> 238 
  C_D (C_B (C_B _ _) (C_A _)) (C_C C_E) -> 239 
  C_D (C_B (C_B _ _) (C_B _ _)) (C_C C_E) -> 240 
  C_D (C_B (C_B _ _) (C_C _)) (C_C C_E) -> 241 
  C_D (C_B (C_B _ _) (C_D _ _)) (C_C C_E) -> 242 
  C_D (C_B (C_B _ _) C_E) (C_C C_E) -> 243 
  C_D (C_B (C_C _) (C_A _)) (C_C C_E) -> 244 
  C_D (C_B (C_C _) (C_B _ _)) (C_C C_E) -> 245 
  C_D (C_B (C_C _) (C_C _)) (C_C C_E) -> 246 
  C_D (C_B (C_C _) (C_D _ _)) (C_C C_E) -> 247 
  C_D (C_B (C_C _) C_E) (C_C C_E) -> 248 
  C_D (C_B (C_D _ _) (C_A _)) (C_C C_E) -> 249 
  C_D (C_B (C_D _ _) (C_B _ _)) (C_C C_E) -> 250 
  C_D (C_B (C_D _ _) (C_C _)) (C_C C_E) -> 251 
  C_D (C_B (C_D _ _) (C_D _ _)) (C_C C_E) -> 252 
  C_D (C_B (C_D _ _) C_E) (C_C C_E) -> 253 
  C_D (C_B C_E (C_A _)) (C_C C_E) -> 254 
  C_D (C_B C_E (C_B _ _)) (C_C C_E) -> 255 
  C_D (C_B C_E (C_C _)) (C_C C_E) -> 256 
  C_D (C_B C_E (C_D _ _)) (C_C C_E) -> 257 
  C_D (C_B C_E C_E) (C_C C_E) -> 258 
  C_D (C_C (C_A _)) (C_C C_E) -> 259 
  C_D (C_C (C_B _ _)) (C_C C_E) -> 260 
  C_D (C_C (C_C _)) (C_C C_E) -> 261 
  C_D (C_C (C_D _ _)) (C_C C_E) -> 262 
  C_D (C_C C_E) (C_C C_E) -> 263 
  C_D (C_D _ (C_A _)) (C_C C_E) -> 264 
  C_D (C_D _ (C_B _ _)) (C_C C_E) -> 265 
  C_D (C_D _ (C_C _)) (C_C C_E) -> 266 
  C_D (C_D _ (C_D _ _)) (C_C C_E) -> 267 
  C_D (C_D _ C_E) (C_C C_E) -> 268 
  C_D C_E (C_C C_E) -> 269 
  C_D (C_A _) (C_D _ (C_A _)) -> 270 
  C_D (C_B (C_A _) (C_A _)) (C_D _ (C_A _)) -> 271 
  C_D (C_B (C_A _) (C_B _ _)) (C_D _ (C_A _)) -> 272 
  C_D (C_B (C_A _) (C_C _)) (C_D _ (C_A _)) -> 273 
  C_D (C_B (C_A _) (C_D _ _)) (C_D _ (C_A _)) -> 274 
  C_D (C_B (C_A _) C_E) (C_D _ (C_A _)) -> 275 
  C_D (C_B (C_B _ _) (C_A _)) (C_D _ (C_A _)) -> 276 
  C_D (C_B (C_B _ _) (C_B _ _)) (C_D _ (C_A _)) -> 277 
  C_D (C_B (C_B _ _) (C_C _)) (C_D _ (C_A _)) -> 278 
  C_D (C_B (C_B _ _) (C_D _ _)) (C_D _ (C_A _)) -> 279 
  C_D (C_B (C_B _ _) C_E) (C_D _ (C_A _)) -> 280 
  C_D (C_B (C_C _) (C_A _)) (C_D _ (C_A _)) -> 281 
  C_D (C_B (C_C _) (C_B _ _)) (C_D _ (C_A _)) -> 282 
  C_D (C_B (C_C _) (C_C _)) (C_D _ (C_A _)) -> 283 
  C_D (C_B (C_C _) (C_D _ _)) (C_D _ (C_A _)) -> 284 
  C_D (C_B (C_C _) C_E) (C_D _ (C_A _)) -> 285 
  C_D (C_B (C_D _ _) (C_A _)) (C_D _ (C_A _)) -> 286 
  C_D (C_B (C_D _ _) (C_B _ _)) (C_D _ (C_A _)) -> 287 
  C_D (C_B (C_D _ _) (C_C _)) (C_D _ (C_A _)) -> 288 
  C_D (C_B (C_D _ _) (C_D _ _)) (C_D _ (C_A _)) -> 289 
  C_D (C_B (C_D _ _) C_E) (C_D _ (C_A _)) -> 290 
  C_D (C_B C_E (C_A _)) (C_D _ (C_A _)) -> 291 
  C_D (C_B C_E (C_B _ _)) (C_D _ (C_A _)) -> 292 
  C_D (C_B C_E (C_C _)) (C_D _ (C_A _)) -> 293 
  C_D (C_B C_E (C_D _ _)) (C_D _ (C_A _)) -> 294 
  C_D (C_B C_E C_E) (C_D _ (C_A _)) -> 295 
  C_D (C_C (C_A _)) (C_D _ (C_A _)) -> 296 
  C_D (C_C (C_B _ _)) (C_D _ (C_A _)) -> 297 
  C_D (C_C (C_D _ _)) (C_D _ (C_A _)) -> 298 
  C_D (C_C C_E) (C_D _ (C_A _)) -> 299 
  C_D (C_D _ (C_A _)) (C_D _ (C_A _)) -> 300 
  C_D (C_D _ (C_B _ _)) (C_D _ (C_A _)) -> 301 
  C_D (C_D _ (C_C _)) (C_D _ (C_A _)) -> 302 
  C_D (C_D _ (C_D _ _)) (C_D _ (C_A _)) -> 303 
  C_D (C_D _ C_E) (C_D _ (C_A _)) -> 304 
  C_D C_E (C_D _ (C_A _)) -> 305 
  C_D (C_A _) (C_D _ (C_B _ _)) -> 306 
  C_D (C_B (C_A _) (C_A _)) (C_D _ (C_B _ _)) -> 307 
  C_D (C_B (C_A _) (C_B _ _)) (C_D _ (C_B _ _)) -> 308 
  C_D (C_B (C_A _) (C_C _)) (C_D _ (C_B _ _)) -> 309 
  C_D (C_B (C_A _) (C_D _ _)) (C_D _ (C_B _ _)) -> 310 
  C_D (C_B (C_A _) C_E) (C_D _ (C_B _ _)) -> 311 
  C_D (C_B (C_B _ _) (C_A _)) (C_D _ (C_B _ _)) -> 312 
  C_D (C_B (C_B _ _) (C_B _ _)) (C_D _ (C_B _ _)) -> 313 
  C_D (C_B (C_B _ _) (C_C _)) (C_D _ (C_B _ _)) -> 314 
  C_D (C_B (C_B _ _) (C_D _ _)) (C_D _ (C_B _ _)) -> 315 
  C_D (C_B (C_B _ _) C_E) (C_D _ (C_B _ _)) -> 316 
  C_D (C_B (C_C _) (C_A _)) (C_D _ (C_B _ _)) -> 317 
  C_D (C_B (C_C _) (C_B _ _)) (C_D _ (C_B _ _)) -> 318 
  C_D (C_B (C_C _) (C_C _)) (C_D _ (C_B _ _)) -> 319 
  C_D (C_B (C_C _) (C_D _ _)) (C_D _ (C_B _ _)) -> 320 
  C_D (C_B (C_C _) C_E) (C_D _ (C_B _ _)) -> 321 
  C_D (C_B (C_D _ _) (C_A _)) (C_D _ (C_B _ _)) -> 322 
  C_D (C_B (C_D _ _) (C_B _ _)) (C_D _ (C_B _ _)) -> 323 
  C_D (C_B (C_D _ _) (C_C _)) (C_D _ (C_B _ _)) -> 324 
  C_D (C_B (C_D _ _) (C_D _ _)) (C_D _ (C_B _ _)) -> 325 
  C_D (C_B (C_D _ _) C_E) (C_D _ (C_B _ _)) -> 326 
  C_D (C_B C_E (C_A _)) (C_D _ (C_B _ _)) -> 327 
  C_D (C_B C_E (C_B _ _)) (C_D _ (C_B _ _)) -> 328 
  C_D (C_B C_E (C_C _)) (C_D _ (C_B _ _)) -> 329 
  C_D (C_B C_E (C_D _ _)) (C_D _ (C_B _ _)) -> 330 
  C_D (C_B C_E C_E) (C_D _ (C_B _ _)) -> 331 
  C_D (C_C (C_A _)) (C_D _ (C_B _ _)) -> 332 
  C_D (C_C (C_B _ _)) (C_D _ (C_B _ _)) -> 333 
  C_D (C_C (C_C _)) (C_D _ (C_B _ _)) -> 334 
  C_D (C_C (C_D _ _)) (C_D _ (C_B _ _)) -> 335 
  C_D (C_C C_E) (C_D _ (C_B _ _)) -> 336 
  C_D (C_D _ (C_A _)) (C_D _ (C_B _ _)) -> 337 
  C_D (C_D _ (C_B _ _)) (C_D _ (C_B _ _)) -> 338 
  C_D (C_D _ (C_C _)) (C_D _ (C_B _ _)) -> 339 
  C_D (C_D _ (C_D _ _)) (C_D _ (C_B _ _)) -> 340 
  C_D (C_D _ C_E) (C_D _ (C_B _ _)) -> 341 
  C_D C_E (C_D _ (C_B _ _)) -> 342 
  C_D (C_A _) (C_D _ (C_C _)) -> 343 
  C_D (C_B (C_A _) (C_A _)) (C_D _ (C_C _)) -> 344 
  C_D (C_B (C_A _) (C_B _ _)) (C_D _ (C_C _)) -> 345 
  C_D (C_B (C_A _) (C_C _)) (C_D _ (C_C _)) -> 346 
  C_D (C_B (C_A _) (C_D _ _)) (C_D _ (C_C _)) -> 347 
  C_D (C_B (C_A _) C_E) (C_D _ (C_C _)) -> 348 
  C_D (C_B (C_B _ _) (C_A _)) (C_D _ (C_C _)) -> 349 
  C_D (C_B (C_B _ _) (C_B _ _)) (C_D _ (C_C _)) -> 350 
  C_D (C_B (C_B _ _) (C_C _)) (C_D _ (C_C _)) -> 351 
  C_D (C_B (C_B _ _) (C_D _ _)) (C_D _ (C_C _)) -> 352 
  C_D (C_B (C_B _ _) C_E) (C_D _ (C_C _)) -> 353 
  C_D (C_B (C_C _) (C_A _)) (C_D _ (C_C _)) -> 354 
  C_D (C_B (C_C _) (C_B _ _)) (C_D _ (C_C _)) -> 355 
  C_D (C_B (C_C _) (C_C _)) (C_D _ (C_C _)) -> 356 
  C_D (C_B (C_C _) (C_D _ _)) (C_D _ (C_C _)) -> 357 
  C_D (C_B (C_C _) C_E) (C_D _ (C_C _)) -> 358 
  C_D (C_B (C_D _ _) (C_A _)) (C_D _ (C_C _)) -> 359 
  C_D (C_B (C_D _ _) (C_B _ _)) (C_D _ (C_C _)) -> 360 
  C_D (C_B (C_D _ _) (C_C _)) (C_D _ (C_C _)) -> 361 
  C_D (C_B (C_D _ _) (C_D _ _)) (C_D _ (C_C _)) -> 362 
  C_D (C_B (C_D _ _) C_E) (C_D _ (C_C _)) -> 363 
  C_D (C_B C_E (C_A _)) (C_D _ (C_C _)) -> 364 
  C_D (C_B C_E (C_B _ _)) (C_D _ (C_C _)) -> 365 
  C_D (C_B C_E (C_C _)) (C_D _ (C_C _)) -> 366 
  C_D (C_B C_E (C_D _ _)) (C_D _ (C_C _)) -> 367 
  C_D (C_B C_E C_E) (C_D _ (C_C _)) -> 368 
  C_D (C_C (C_A _)) (C_D _ (C_C _)) -> 369 
  C_D (C_C (C_B _ _)) (C_D _ (C_C _)) -> 370 
  C_D (C_C (C_C _)) (C_D _ (C_C _)) -> 371 
  C_D (C_C (C_D _ _)) (C_D _ (C_C _)) -> 372 
  C_D (C_C C_E) (C_D _ (C_C _)) -> 373 
  C_D (C_D _ (C_A _)) (C_D _ (C_C _)) -> 374 
  C_D (C_D _ (C_B _ _)) (C_D _ (C_C _)) -> 375 
  C_D (C_D _ (C_C _)) (C_D _ (C_C _)) -> 376 
  C_D (C_D _ (C_D _ _)) (C_D _ (C_C _)) -> 377 
  C_D (C_D _ C_E) (C_D _ (C_C _)) -> 378 
  C_D C_E (C_D _ (C_C _)) -> 379 
  C_D (C_A _) (C_D _ (C_D _ _)) -> 380 
  C_D (C_B (C_A _) (C_A _)) (C_D _ (C_D _ _)) -> 381 
  C_D (C_B (C_A _) (C_B _ _)) (C_D _ (C_D _ _)) -> 382 
  C_D (C_B (C_A _) (C_C _)) (C_D _ (C_D _ _)) -> 383 
  C_D (C_B (C_A _) (C_D _ _)) (C_D _ (C_D _ _)) -> 384 
  C_D (C_B (C_A _) C_E) (C_D _ (C_D _ _)) -> 385 
  C_D (C_B (C_B _ _) (C_A _)) (C_D _ (C_D _ _)) -> 386 
  C_D (C_B (C_B _ _) (C_B _ _)) (C_D _ (C_D _ _)) -> 387 
  C_D (C_B (C_B _ _) (C_C _)) (C_D _ (C_D _ _)) -> 388 
  C_D (C_B (C_B _ _) (C_D _ _)) (C_D _ (C_D _ _)) -> 389 
  C_D (C_B (C_B _ _) C_E) (C_D _ (C_D _ _)) -> 390 
  C_D (C_B (C_C _) (C_A _)) (C_D _ (C_D _ _)) -> 391 
  C_D (C_B (C_C _) (C_B _ _)) (C_D _ (C_D _ _)) -> 392 
  C_D (C_B (C_C _) (C_C _)) (C_D _ (C_D _ _)) -> 393 
  C_D (C_B (C_C _) (C_D _ _)) (C_D _ (C_D _ _)) -> 394 
  C_D (C_B (C_C _) C_E) (C_D _ (C_D _ _)) -> 395 
  C_D (C_B (C_D _ _) (C_A _)) (C_D _ (C_D _ _)) -> 396 
  C_D (C_B (C_D _ _) (C_B _ _)) (C_D _ (C_D _ _)) -> 397 
  C_D (C_B (C_D _ _) (C_C _)) (C_D _ (C_D _ _)) -> 398 
  C_D (C_B (C_D _ _) (C_D _ _)) (C_D _ (C_D _ _)) -> 399 
  C_D (C_B (C_D _ _) C_E) (C_D _ (C_D _ _)) -> 400 
  C_D (C_B C_E (C_A _)) (C_D _ (C_D _ _)) -> 401 
  C_D (C_B C_E (C_B _ _)) (C_D _ (C_D _ _)) -> 402 
  C_D (C_B C_E (C_C _)) (C_D _ (C_D _ _)) -> 403 
  C_D (C_B C_E (C_D _ _)) (C_D _ (C_D _ _)) -> 404 
  C_D (C_B C_E C_E) (C_D _ (C_D _ _)) -> 405 
  C_D (C_C (C_A _)) (C_D _ (C_D _ _)) -> 406 
  C_D (C_C (C_B _ _)) (C_D _ (C_D _ _)) -> 407 
  C_D (C_C (C_C _)) (C_D _ (C_D _ _)) -> 408 
  C_D (C_C (C_D _ _)) (C_D _ (C_D _ _)) -> 409 
  C_D (C_C C_E) (C_D _ (C_D _ _)) -> 410 
  C_D (C_D _ (C_A _)) (C_D _ (C_D _ _)) -> 411 
  C_D (C_D _ (C_B _ _)) (C_D _ (C_D _ _)) -> 412 
  C_D (C_D _ (C_C _)) (C_D _ (C_D _ _)) -> 413 
  C_D (C_D _ (C_D _ _)) (C_D _ (C_D _ _)) -> 414 
  C_D (C_D _ C_E) (C_D _ (C_D _ _)) -> 415 
  C_D C_E (C_D _ (C_D _ _)) -> 416 
  C_D (C_A _) (C_D _ C_E) -> 417 
  C_D (C_B (C_A _) (C_A _)) (C_D _ C_E) -> 418 
  C_D (C_B (C_A _) (C_B _ _)) (C_D _ C_E) -> 419 
  C_D (C_B (C_A _) (C_C _)) (C_D _ C_E) -> 420 
  C_D (C_B (C_A _) (C_D _ _)) (C_D _ C_E) -> 421 
  C_D (C_B (C_A _) C_E) (C_D _ C_E) -> 422 
  C_D (C_B (C_B _ _) (C_A _)) (C_D _ C_E) -> 423 
  C_D (C_B (C_B _ _) (C_B _ _)) (C_D _ C_E) -> 424 
  C_D (C_B (C_B _ _) (C_C _)) (C_D _ C_E) -> 425 
  C_D (C_B (C_B _ _) (C_D _ _)) (C_D _ C_E) -> 426 
  C_D (C_B (C_B _ _) C_E) (C_D _ C_E) -> 427 
  C_D (C_B (C_C _) (C_A _)) (C_D _ C_E) -> 428 
  C_D (C_B (C_C _) (C_B _ _)) (C_D _ C_E) -> 429 
  C_D (C_B (C_C _) (C_C _)) (C_D _ C_E) -> 430 
  C_D (C_B (C_C _) (C_D _ _)) (C_D _ C_E) -> 431 
  C_D (C_B (C_C _) C_E) (C_D _ C_E) -> 432 
  C_D (C_B (C_D _ _) (C_A _)) (C_D _ C_E) -> 433 
  C_D (C_B (C_D _ _) (C_B _ _)) (C_D _ C_E) -> 434 
  C_D (C_B (C_D _ _) (C_C _)) (C_D _ C_E) -> 435 
  C_D (C_B (C_D _ _) (C_D _ _)) (C_D _ C_E) -> 436 
  C_D (C_B (C_D _ _) C_E) (C_D _ C_E) -> 437 
  C_D (C_B C_E (C_A _)) (C_D _ C_E) -> 438 
  C_D (C_B C_E (C_B _ _)) (C_D _ C_E) -> 439 
  C_D (C_B C_E (C_C _)) (C_D _ C_E) -> 440 
  C_D (C_B C_E (C_D _ _)) (C_D _ C_E) -> 441 
  C_D (C_B C_E C_E) (C_D _ C_E) -> 442 
  C_D (C_C (C_A _)) (C_D _ C_E) -> 443 
  C_D (C_C (C_B _ _)) (C_D _ C_E) -> 444 
  C_D (C_C (C_C _)) (C_D _ C_E) -> 445 
  C_D (C_C (C_D _ _)) (C_D _ C_E) -> 446 
  C_D (C_C C_E) (C_D _ C_E) -> 447 
  C_D (C_D _ (C_A _)) (C_D _ C_E) -> 448 
  C_D (C_D _ (C_B _ _)) (C_D _ C_E) -> 449 
  C_D (C_D _ (C_C _)) (C_D _ C_E) -> 450 
  C_D (C_D _ (C_D _ _)) (C_D _ C_E) -> 451 
  C_D (C_D _ C_E) (C_D _ C_E) -> 452 
  C_D C_E (C_D _ C_E) -> 453 
  C_D (C_A _) C_E -> 454 
  C_D (C_B (C_A _) (C_A _)) C_E -> 455 
  C_D (C_B (C_A _) (C_B _ _)) C_E -> 456 
  C_D (C_B (C_A _) (C_C _)) C_E -> 457 
  C_D (C_B (C_A _) (C_D _ _)) C_E -> 458 
  C_D (C_B (C_A _) C_E) C_E -> 459 
  C_D (C_B (C_B _ _) (C_A _)) C_E -> 460 
  C_D (C_B (C_B _ _) (C_B _ _)) C_E -> 461 
  C_D (C_B (C_B _ _) (C_C _)) C_E -> 462 
  C_D (C_B (C_B _ _) (C_D _ _)) C_E -> 463 
  C_D (C_B (C_B _ _) C_E) C_E -> 464 
  C_D (C_B (C_C _) (C_A _)) C_E -> 465 
  C_D (C_B (C_C _) (C_B _ _)) C_E -> 466 
  C_D (C_B (C_C _) (C_C _)) C_E -> 467 
  C_D (C_B (C_C _) (C_D _ _)) C_E -> 468 
  C_D (C_B (C_C _) C_E) C_E -> 469 
  C_D (C_B (C_D _ _) (C_A _)) C_E -> 470 
  C_D (C_B (C_D _ _) (C_B _ _)) C_E -> 471 
  C_D (C_B (C_D _ _) (C_C _)) C_E -> 472 
  C_D (C_B (C_D _ _) (C_D _ _)) C_E -> 473 
  C_D (C_B (C_D _ _) C_E) C_E -> 474 
  C_D (C_B C_E (C_A _)) C_E -> 475 
  C_D (C_B C_E (C_B _ _)) C_E -> 476 
  C_D (C_B C_E (C_C _)) C_E -> 477 
  C_D (C_B C_E (C_D _ _)) C_E -> 478 
  C_D (C_B C_E C_E) C_E -> 479 
  C_D (C_C (C_A _)) C_E -> 480 
  C_D (C_C (C_B _ _)) C_E -> 481 
  C_D (C_C (C_C _)) C_E -> 482 
  C_D (C_C (C_D _ _)) C_E -> 483 
  C_D (C_C C_E) C_E -> 484 
  C_D (C_D _ (C_A _)) C_E -> 485 
  C_D (C_D _ (C_B _ _)) C_E -> 486 
  C_D (C_D _ (C_C _)) C_E -> 487 
  C_D (C_D _ (C_D _ _)) C_E -> 488 
  C_D (C_D _ C_E) C_E -> 489 
  C_D C_E C_E -> 490 
  C_E -> 491 
