module Program_26 () where 

main = print $ show v_b
data B_B = C_E (B_A B_B) B_B | C_F B_B | C_G
data B_A a = C_A | C_B (B_A a) (B_A ((Char,Int))) | C_C | C_D Char

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F (C_E (C_B _ _) C_G) -> 0 
  C_F (C_E (C_C) _) -> 1 
  C_F (C_E (C_D _) (C_F _)) -> 2 
  C_F (C_E (C_A) C_G) -> 3 
  C_F (C_E (C_C) (C_E _ _)) -> 4 
  C_F (C_E (C_C) C_G) -> 5 
  C_F (C_F (C_E _ _)) -> 6 
  C_F (C_E (C_A) _) -> 7 
  C_F _ -> 8 
  C_F (C_E (C_D _) _) -> 9 
  C_F C_G -> 10 
  C_F (C_E (C_B _ _) (C_F _)) -> 11 
  C_F (C_E _ C_G) -> 12 
  C_F (C_E (C_A) (C_F _)) -> 13 
  C_E (C_C) (C_E _ C_G) -> 14 
  C_E (C_B (C_C) _) (C_E (C_B _ _) (C_E _ _)) -> 15 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_A) (C_F _)) -> 16 
  C_E (C_B (C_C) (C_D _)) (C_E (C_D _) (C_E _ _)) -> 17 
  C_E (C_A) (C_E (C_A) C_G) -> 18 
  C_E (C_B _ (C_D _)) (C_E (C_D _) (C_F _)) -> 19 
  C_E (C_B (C_A) _) C_G -> 20 
  C_E (C_B _ _) (C_E _ C_G) -> 21 
  C_E (C_B _ (C_B _ _)) (C_F _) -> 22 
  C_E (C_B (C_D _) _) (C_E _ (C_F _)) -> 23 
  C_E (C_B _ _) (C_E (C_C) (C_E _ _)) -> 24 
  C_E (C_B _ (C_C)) (C_E (C_D _) _) -> 25 
  C_E (C_B (C_C) (C_D _)) (C_E (C_D _) C_G) -> 26 
  C_E (C_B (C_D _) (C_C)) (C_E (C_A) (C_F _)) -> 27 
  C_E (C_B (C_B _ _) _) (C_E (C_D _) (C_E _ _)) -> 28 
  C_E _ (C_E (C_C) (C_E _ _)) -> 29 
  C_E (C_C) (C_E (C_C) (C_F _)) -> 30 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_A) C_G) -> 31 
  C_E (C_A) (C_E _ (C_F _)) -> 32 
  C_E (C_B (C_C) (C_D _)) (C_E (C_A) (C_E _ _)) -> 33 
  C_E (C_B (C_D _) _) (C_E _ C_G) -> 34 
  C_E (C_B (C_C) (C_D _)) (C_F (C_F _)) -> 35 
  C_E (C_B (C_D _) (C_C)) (C_E (C_A) (C_E _ _)) -> 36 
  C_E (C_B _ (C_A)) (C_E (C_B _ _) (C_E _ _)) -> 37 
  C_E (C_B (C_B _ _) _) (C_E (C_B _ _) _) -> 38 
  C_E (C_D _) (C_F (C_E _ _)) -> 39 
  C_E (C_B (C_A) (C_A)) (C_E (C_C) (C_F _)) -> 40 
  C_E (C_B (C_C) (C_C)) (C_E (C_B _ _) C_G) -> 41 
  C_E (C_D _) (C_E (C_C) (C_F _)) -> 42 
  C_E (C_B (C_D _) (C_A)) (C_E (C_B _ _) _) -> 43 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_B _ _) _) -> 44 
  C_E (C_B (C_B _ _) _) (C_F (C_E _ _)) -> 45 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_A) (C_F _)) -> 46 
  C_E (C_B (C_A) (C_D _)) (C_E (C_D _) C_G) -> 47 
  C_E (C_B (C_D _) (C_D _)) (C_F (C_F _)) -> 48 
  C_E (C_B _ (C_C)) (C_E _ C_G) -> 49 
  C_E (C_B (C_D _) (C_B _ _)) C_G -> 50 
  C_E (C_B (C_A) (C_D _)) (C_E (C_C) C_G) -> 51 
  C_E (C_B _ _) (C_E (C_A) C_G) -> 52 
  C_E (C_C) (C_E (C_A) (C_E _ _)) -> 53 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_C) C_G) -> 54 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_D _) C_G) -> 55 
  C_E (C_B (C_D _) (C_C)) (C_E (C_C) C_G) -> 56 
  C_E (C_B (C_A) _) (C_E (C_C) _) -> 57 
  C_E (C_B (C_A) (C_C)) (C_E (C_C) _) -> 58 
  C_E (C_B (C_A) (C_A)) (C_E _ (C_F _)) -> 59 
  C_E (C_B (C_B _ _) (C_B _ _)) C_G -> 60 
  C_E (C_B (C_C) (C_C)) (C_E (C_D _) (C_E _ _)) -> 61 
  C_E (C_B (C_B _ _) _) (C_F (C_F _)) -> 62 
  C_E (C_B (C_A) _) (C_E (C_B _ _) C_G) -> 63 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_B _ _) C_G) -> 64 
  C_E (C_B (C_A) _) (C_E (C_A) (C_F _)) -> 65 
  C_E (C_B (C_D _) (C_B _ _)) (C_E _ C_G) -> 66 
  C_E (C_B _ (C_D _)) (C_E (C_A) (C_E _ _)) -> 67 
  C_E (C_B (C_B _ _) _) (C_E (C_B _ _) C_G) -> 68 
  C_E _ (C_E (C_B _ _) C_G) -> 69 
  C_E (C_B (C_D _) (C_A)) (C_E (C_C) _) -> 70 
  C_E (C_B (C_A) (C_A)) (C_E (C_A) (C_E _ _)) -> 71 
  C_E (C_A) (C_E (C_B _ _) _) -> 72 
  C_E (C_B _ (C_C)) (C_E (C_D _) (C_F _)) -> 73 
  C_E (C_C) (C_E (C_D _) _) -> 74 
  C_E (C_B (C_C) (C_A)) (C_E (C_D _) (C_F _)) -> 75 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_A) (C_E _ _)) -> 76 
  C_E (C_B _ (C_C)) (C_E (C_A) _) -> 77 
  C_E (C_B (C_C) (C_D _)) (C_E (C_D _) (C_F _)) -> 78 
  C_E (C_B (C_C) (C_A)) (C_E (C_B _ _) (C_F _)) -> 79 
  C_E (C_B (C_D _) _) (C_E (C_D _) (C_F _)) -> 80 
  C_E (C_B (C_D _) (C_D _)) (C_E _ (C_E _ _)) -> 81 
  C_E (C_B (C_D _) (C_C)) (C_E _ C_G) -> 82 
  C_E (C_B (C_D _) (C_A)) (C_E (C_B _ _) (C_E _ _)) -> 83 
  C_E (C_B (C_A) (C_B _ _)) (C_F (C_F _)) -> 84 
  C_E (C_B _ (C_D _)) (C_F (C_F _)) -> 85 
  C_E (C_B (C_A) (C_D _)) (C_E _ (C_F _)) -> 86 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_C) C_G) -> 87 
  C_E (C_B _ (C_B _ _)) (C_E (C_C) _) -> 88 
  C_E (C_D _) (C_F _) -> 89 
  C_E (C_B _ (C_D _)) (C_E (C_A) (C_F _)) -> 90 
  C_E (C_B (C_C) (C_C)) (C_E (C_B _ _) _) -> 91 
  C_E (C_B (C_A) _) (C_E (C_D _) (C_F _)) -> 92 
  C_E (C_B (C_A) _) (C_E (C_B _ _) (C_F _)) -> 93 
  C_E _ (C_F (C_E _ _)) -> 94 
  C_E (C_B _ (C_C)) (C_E (C_D _) C_G) -> 95 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_B _ _) C_G) -> 96 
  C_E (C_B (C_B _ _) (C_A)) (C_E _ (C_E _ _)) -> 97 
  C_E (C_D _) (C_E (C_D _) _) -> 98 
  C_E (C_B (C_C) (C_C)) (C_E _ (C_E _ _)) -> 99 
  C_E (C_B (C_B _ _) (C_A)) (C_F C_G) -> 100 
  C_E (C_B (C_C) (C_C)) (C_E (C_D _) _) -> 101 
  C_E (C_B (C_A) (C_D _)) (C_E (C_C) _) -> 102 
  C_E (C_B (C_C) _) _ -> 103 
  C_E (C_B (C_D _) _) (C_F _) -> 104 
  C_E (C_B (C_D _) (C_A)) (C_F (C_F _)) -> 105 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_D _) (C_E _ _)) -> 106 
  C_E (C_D _) (C_E (C_B _ _) _) -> 107 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_C) (C_F _)) -> 108 
  C_E (C_B (C_A) (C_D _)) (C_E (C_A) (C_F _)) -> 109 
  C_E (C_B (C_C) _) (C_E (C_C) (C_F _)) -> 110 
  C_E (C_B _ (C_D _)) (C_F (C_E _ _)) -> 111 
  C_E _ (C_E (C_D _) _) -> 112 
  C_E (C_B (C_A) (C_C)) (C_E _ _) -> 113 
  C_E (C_B (C_A) (C_A)) (C_E (C_C) C_G) -> 114 
  C_E (C_B (C_B _ _) _) C_G -> 115 
  C_E (C_B _ (C_C)) (C_E (C_C) (C_F _)) -> 116 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_D _) (C_F _)) -> 117 
  C_E (C_B (C_D _) _) (C_E (C_C) _) -> 118 
  C_E (C_B (C_D _) (C_A)) (C_F _) -> 119 
  C_E (C_B (C_C) (C_B _ _)) (C_E _ C_G) -> 120 
  C_E (C_B (C_B _ _) (C_D _)) (C_E _ (C_F _)) -> 121 
  C_E (C_D _) (C_E (C_A) (C_E _ _)) -> 122 
  C_E (C_B _ (C_B _ _)) (C_F (C_F _)) -> 123 
  C_E (C_A) (C_F _) -> 124 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_C) C_G) -> 125 
  C_E (C_B (C_B _ _) (C_D _)) (C_F (C_E _ _)) -> 126 
  C_E (C_D _) (C_E (C_C) (C_E _ _)) -> 127 
  C_E (C_B (C_A) (C_D _)) (C_F (C_F _)) -> 128 
  C_E (C_B (C_D _) (C_C)) (C_E (C_A) _) -> 129 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E _ C_G) -> 130 
  C_E (C_B _ _) (C_E (C_B _ _) _) -> 131 
  C_E (C_B (C_C) (C_D _)) (C_E _ C_G) -> 132 
  C_E (C_B (C_A) _) (C_E _ (C_E _ _)) -> 133 
  C_E (C_B (C_A) (C_C)) (C_E (C_A) (C_E _ _)) -> 134 
  C_E (C_B (C_C) (C_D _)) (C_E (C_A) (C_F _)) -> 135 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_D _) (C_E _ _)) -> 136 
  C_E (C_B (C_C) (C_B _ _)) _ -> 137 
  C_E _ (C_E (C_D _) (C_F _)) -> 138 
  C_E (C_B (C_C) (C_A)) (C_E _ C_G) -> 139 
  C_E (C_B (C_C) (C_B _ _)) (C_E _ (C_F _)) -> 140 
  C_E (C_B _ (C_D _)) (C_E (C_B _ _) (C_F _)) -> 141 
  C_E (C_B (C_C) (C_C)) (C_F (C_E _ _)) -> 142 
  C_E (C_B _ (C_A)) (C_E _ _) -> 143 
  C_E (C_B (C_B _ _) _) (C_E (C_C) _) -> 144 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_A) _) -> 145 
  C_E (C_B (C_A) (C_C)) _ -> 146 
  C_E (C_B _ (C_A)) _ -> 147 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_C) (C_F _)) -> 148 
  C_E (C_B (C_C) (C_D _)) (C_E (C_C) _) -> 149 
  C_E (C_B (C_A) (C_C)) (C_E (C_A) _) -> 150 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_C) (C_F _)) -> 151 
  C_E (C_B (C_C) (C_A)) (C_E _ _) -> 152 
  C_E (C_B (C_A) _) (C_E (C_C) C_G) -> 153 
  C_E (C_B (C_A) _) (C_F (C_E _ _)) -> 154 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_A) (C_E _ _)) -> 155 
  C_E (C_A) (C_F (C_E _ _)) -> 156 
  C_E (C_B (C_C) (C_B _ _)) (C_F C_G) -> 157 
  C_E (C_B (C_D _) (C_B _ _)) (C_F (C_E _ _)) -> 158 
  C_E (C_B (C_C) (C_A)) (C_E (C_C) (C_E _ _)) -> 159 
  C_E (C_B (C_A) (C_A)) _ -> 160 
  C_E (C_B (C_C) (C_D _)) (C_E (C_A) _) -> 161 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_A) (C_F _)) -> 162 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_C) (C_E _ _)) -> 163 
  C_E (C_B (C_D _) (C_D _)) (C_F (C_E _ _)) -> 164 
  C_E (C_B _ (C_A)) (C_E _ (C_F _)) -> 165 
  C_E (C_B _ (C_D _)) (C_E _ (C_E _ _)) -> 166 
  C_E (C_B _ (C_A)) (C_E (C_A) (C_F _)) -> 167 
  C_E (C_B (C_B _ _) _) _ -> 168 
  C_E (C_C) (C_E (C_D _) (C_E _ _)) -> 169 
  C_E (C_B (C_D _) _) (C_E (C_B _ _) (C_F _)) -> 170 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_C) (C_E _ _)) -> 171 
  C_E (C_B _ (C_B _ _)) (C_E (C_D _) C_G) -> 172 
  C_E (C_D _) (C_E (C_B _ _) (C_E _ _)) -> 173 
  C_E (C_B (C_B _ _) _) (C_E (C_A) C_G) -> 174 
  C_E (C_B _ (C_A)) (C_F (C_E _ _)) -> 175 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_B _ _) C_G) -> 176 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_A) _) -> 177 
  C_E (C_B (C_A) (C_A)) (C_E (C_D _) C_G) -> 178 
  C_E (C_B _ (C_D _)) (C_E (C_A) _) -> 179 
  C_E (C_B (C_C) (C_A)) (C_E (C_B _ _) C_G) -> 180 
  C_E (C_D _) _ -> 181 
  C_E (C_B _ (C_B _ _)) (C_E (C_C) C_G) -> 182 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_D _) (C_E _ _)) -> 183 
  C_E (C_B (C_B _ _) (C_C)) (C_E _ (C_F _)) -> 184 
  C_E (C_B (C_D _) (C_D _)) C_G -> 185 
  C_E (C_B (C_C) (C_C)) (C_E (C_C) (C_E _ _)) -> 186 
  C_E (C_B _ (C_B _ _)) (C_E (C_B _ _) (C_E _ _)) -> 187 
  C_E (C_B _ (C_D _)) (C_E (C_C) (C_F _)) -> 188 
  C_E (C_B (C_B _ _) _) (C_E (C_D _) C_G) -> 189 
  C_E (C_B (C_C) (C_C)) (C_E _ (C_F _)) -> 190 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_D _) (C_F _)) -> 191 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_B _ _) (C_E _ _)) -> 192 
  C_E (C_B (C_D _) (C_A)) (C_E (C_D _) (C_F _)) -> 193 
  C_E (C_B (C_A) (C_C)) (C_E (C_D _) (C_E _ _)) -> 194 
  C_E (C_B (C_A) (C_A)) (C_F C_G) -> 195 
  C_E (C_B _ _) _ -> 196 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_A) C_G) -> 197 
  C_E (C_B (C_C) (C_D _)) (C_E (C_C) C_G) -> 198 
  C_E (C_B _ _) (C_F (C_F _)) -> 199 
  C_E (C_B (C_C) (C_C)) (C_E _ _) -> 200 
  C_E (C_B (C_A) (C_B _ _)) _ -> 201 
  C_E (C_B (C_C) _) (C_E (C_A) C_G) -> 202 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_C) _) -> 203 
  C_E (C_B _ (C_C)) (C_F _) -> 204 
  C_E (C_C) (C_E _ _) -> 205 
  C_E (C_B (C_C) (C_D _)) (C_F _) -> 206 
  C_E (C_B (C_D _) (C_A)) (C_E (C_A) _) -> 207 
  C_E (C_B (C_C) (C_C)) (C_E (C_A) (C_F _)) -> 208 
  C_E (C_B (C_D _) _) (C_E (C_C) (C_E _ _)) -> 209 
  C_E (C_A) (C_E (C_B _ _) (C_E _ _)) -> 210 
  C_E (C_B (C_C) _) (C_E (C_A) (C_E _ _)) -> 211 
  C_E (C_B (C_A) _) (C_F C_G) -> 212 
  C_E (C_B (C_C) (C_A)) (C_E (C_D _) (C_E _ _)) -> 213 
  C_E (C_B (C_A) (C_A)) (C_F (C_F _)) -> 214 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_D _) C_G) -> 215 
  C_E (C_B (C_A) (C_C)) (C_E (C_A) C_G) -> 216 
  C_E (C_B _ _) (C_E (C_D _) (C_F _)) -> 217 
  C_E (C_D _) (C_F (C_F _)) -> 218 
  C_E (C_A) (C_E (C_B _ _) (C_F _)) -> 219 
  C_E (C_B (C_C) (C_A)) (C_E (C_A) _) -> 220 
  C_E (C_B (C_D _) (C_D _)) _ -> 221 
  C_E (C_C) (C_E (C_D _) C_G) -> 222 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_A) C_G) -> 223 
  C_E (C_B (C_C) _) (C_E _ C_G) -> 224 
  C_E (C_D _) (C_E _ C_G) -> 225 
  C_E (C_C) (C_E (C_B _ _) C_G) -> 226 
  C_E (C_B (C_B _ _) (C_D _)) (C_E _ _) -> 227 
  C_E (C_B (C_A) (C_B _ _)) (C_E _ (C_E _ _)) -> 228 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_A) _) -> 229 
  C_E (C_B (C_C) _) (C_E (C_C) _) -> 230 
  C_E (C_B _ (C_D _)) (C_E (C_C) (C_E _ _)) -> 231 
  C_E (C_B (C_A) (C_D _)) (C_E (C_B _ _) C_G) -> 232 
  C_E (C_B (C_C) (C_D _)) (C_E (C_B _ _) _) -> 233 
  C_E (C_A) (C_E _ C_G) -> 234 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_B _ _) C_G) -> 235 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_C) _) -> 236 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_A) (C_E _ _)) -> 237 
  C_E (C_B (C_A) (C_D _)) (C_F (C_E _ _)) -> 238 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_D _) C_G) -> 239 
  C_E (C_A) (C_E (C_C) C_G) -> 240 
  C_E (C_B (C_C) _) (C_E (C_A) (C_F _)) -> 241 
  C_E (C_B (C_D _) (C_C)) (C_F (C_E _ _)) -> 242 
  C_E (C_B _ (C_C)) (C_E (C_B _ _) (C_E _ _)) -> 243 
  C_E (C_B _ (C_C)) (C_E (C_B _ _) C_G) -> 244 
  C_E (C_D _) (C_E (C_C) _) -> 245 
  C_E (C_A) (C_E (C_D _) _) -> 246 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_B _ _) (C_F _)) -> 247 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_D _) _) -> 248 
  C_E (C_B _ (C_C)) (C_F (C_E _ _)) -> 249 
  C_E (C_B (C_C) (C_C)) (C_E (C_A) C_G) -> 250 
  C_E (C_B (C_A) (C_D _)) (C_E (C_C) (C_E _ _)) -> 251 
  C_E (C_B (C_C) (C_A)) (C_E (C_B _ _) _) -> 252 
  C_E (C_B (C_A) (C_A)) (C_E (C_B _ _) (C_F _)) -> 253 
  C_E (C_B _ (C_A)) (C_E (C_D _) (C_F _)) -> 254 
  C_E (C_B (C_C) (C_D _)) C_G -> 255 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_F (C_E _ _)) -> 256 
  C_E _ (C_E (C_D _) C_G) -> 257 
  C_E (C_B (C_C) _) (C_E (C_C) (C_E _ _)) -> 258 
  C_E _ (C_F _) -> 259 
  C_E (C_D _) (C_E (C_A) C_G) -> 260 
  C_E (C_C) (C_E (C_C) _) -> 261 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_A) (C_E _ _)) -> 262 
  C_E (C_B (C_A) (C_D _)) (C_F C_G) -> 263 
  C_E (C_B (C_D _) (C_C)) (C_E (C_B _ _) (C_E _ _)) -> 264 
  C_E (C_B (C_D _) (C_A)) (C_E (C_C) (C_F _)) -> 265 
  C_E (C_B (C_A) _) (C_E _ C_G) -> 266 
  C_E (C_B _ (C_A)) (C_E (C_C) (C_F _)) -> 267 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_B _ _) _) -> 268 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_D _) (C_E _ _)) -> 269 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_B _ _) (C_E _ _)) -> 270 
  C_E (C_B (C_B _ _) _) (C_E (C_D _) _) -> 271 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_D _) (C_F _)) -> 272 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_C) (C_F _)) -> 273 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_C) _) -> 274 
  C_E (C_B (C_B _ _) (C_A)) (C_E _ _) -> 275 
  C_E (C_D _) (C_E _ (C_F _)) -> 276 
  C_E (C_B _ _) (C_E (C_D _) (C_E _ _)) -> 277 
  C_E _ (C_F C_G) -> 278 
  C_E (C_B (C_D _) (C_B _ _)) (C_E _ (C_E _ _)) -> 279 
  C_E (C_B _ (C_B _ _)) (C_E _ (C_E _ _)) -> 280 
  C_E (C_B (C_D _) _) (C_E (C_A) _) -> 281 
  C_E (C_B _ (C_D _)) _ -> 282 
  C_E (C_B (C_C) (C_A)) (C_E (C_C) _) -> 283 
  C_E (C_A) (C_E (C_A) _) -> 284 
  C_E (C_B (C_C) (C_C)) (C_E (C_D _) (C_F _)) -> 285 
  C_E (C_B (C_B _ _) _) (C_E _ _) -> 286 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_C) (C_E _ _)) -> 287 
  C_E (C_B (C_A) (C_C)) (C_E (C_D _) _) -> 288 
  C_E (C_B (C_C) (C_A)) (C_E (C_B _ _) (C_E _ _)) -> 289 
  C_E (C_B _ (C_A)) (C_E (C_D _) _) -> 290 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_D _) C_G) -> 291 
  C_E (C_B _ (C_D _)) (C_E (C_B _ _) (C_E _ _)) -> 292 
  C_E (C_B (C_B _ _) (C_C)) (C_E _ _) -> 293 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_D _) _) -> 294 
  C_E (C_B _ _) (C_E (C_A) (C_F _)) -> 295 
  C_E (C_C) (C_E _ (C_E _ _)) -> 296 
  C_E (C_B (C_C) _) (C_E (C_D _) (C_F _)) -> 297 
  C_E (C_B (C_A) (C_A)) (C_F _) -> 298 
  C_E (C_B _ (C_B _ _)) (C_E (C_A) (C_F _)) -> 299 
  C_E (C_B (C_B _ _) _) (C_E (C_C) C_G) -> 300 
  C_E (C_B _ _) C_G -> 301 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_B _ _) (C_F _)) -> 302 
  C_E _ (C_E (C_A) (C_F _)) -> 303 
  C_E (C_B (C_A) _) (C_E (C_A) (C_E _ _)) -> 304 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_B _ _) _) -> 305 
  C_E (C_B (C_C) _) (C_F (C_F _)) -> 306 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_C) (C_F _)) -> 307 
  C_E (C_B _ (C_C)) (C_E (C_A) (C_E _ _)) -> 308 
  C_E (C_B (C_D _) (C_C)) (C_E (C_A) C_G) -> 309 
  C_E (C_B (C_D _) _) (C_E (C_A) (C_E _ _)) -> 310 
  C_E (C_B (C_D _) _) (C_E _ _) -> 311 
  C_E (C_C) (C_F _) -> 312 
  C_E (C_B _ (C_B _ _)) (C_E _ _) -> 313 
  C_E (C_B _ (C_B _ _)) (C_E (C_D _) _) -> 314 
  C_E (C_B _ _) (C_E _ (C_E _ _)) -> 315 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_C) (C_E _ _)) -> 316 
  C_E (C_B _ _) (C_E (C_D _) C_G) -> 317 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_B _ _) (C_F _)) -> 318 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_D _) (C_E _ _)) -> 319 
  C_E (C_B (C_D _) (C_B _ _)) (C_E _ _) -> 320 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_A) C_G) -> 321 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_C) (C_F _)) -> 322 
  C_E (C_B _ _) (C_E (C_A) (C_E _ _)) -> 323 
  C_E (C_B (C_A) (C_C)) (C_E (C_C) (C_F _)) -> 324 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_D _) (C_E _ _)) -> 325 
  C_E (C_B (C_D _) (C_D _)) (C_F C_G) -> 326 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_B _ _) _) -> 327 
  C_E (C_B (C_D _) (C_A)) (C_E (C_C) (C_E _ _)) -> 328 
  C_E (C_B (C_D _) _) (C_F (C_F _)) -> 329 
  C_E (C_B (C_A) (C_C)) (C_F (C_F _)) -> 330 
  C_E (C_B (C_B _ _) _) (C_E (C_A) _) -> 331 
  C_E (C_B _ (C_B _ _)) _ -> 332 
  C_E (C_B (C_A) _) (C_E (C_D _) _) -> 333 
  C_E (C_B _ _) (C_F (C_E _ _)) -> 334 
  C_E (C_B (C_A) (C_A)) (C_E (C_D _) _) -> 335 
  C_E (C_A) (C_E (C_D _) C_G) -> 336 
  C_E (C_A) (C_E (C_C) (C_E _ _)) -> 337 
  C_E (C_B (C_C) (C_D _)) _ -> 338 
  C_E (C_B (C_A) (C_C)) (C_E (C_C) (C_E _ _)) -> 339 
  C_E (C_B (C_A) (C_D _)) (C_E (C_C) (C_F _)) -> 340 
  C_E (C_B (C_A) (C_D _)) _ -> 341 
  C_E (C_B _ (C_D _)) (C_E (C_A) C_G) -> 342 
  C_E (C_B (C_C) (C_B _ _)) C_G -> 343 
  C_E (C_B (C_A) (C_C)) (C_E _ C_G) -> 344 
  C_E (C_B (C_A) (C_A)) (C_E (C_A) _) -> 345 
  C_E (C_B _ (C_D _)) (C_E _ C_G) -> 346 
  C_E (C_A) (C_E (C_B _ _) C_G) -> 347 
  C_E (C_B (C_B _ _) _) (C_E (C_A) (C_F _)) -> 348 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_C) _) -> 349 
  C_E (C_B (C_D _) (C_A)) (C_F C_G) -> 350 
  C_E (C_B (C_A) (C_A)) (C_E (C_B _ _) C_G) -> 351 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_C) (C_E _ _)) -> 352 
  C_E (C_B (C_A) (C_A)) (C_E (C_B _ _) _) -> 353 
  C_E (C_B (C_C) _) C_G -> 354 
  C_E (C_B (C_B _ _) _) (C_E _ C_G) -> 355 
  C_E (C_B (C_C) (C_A)) (C_E _ (C_F _)) -> 356 
  C_E (C_B (C_B _ _) _) (C_E _ (C_F _)) -> 357 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_A) (C_E _ _)) -> 358 
  C_E (C_B _ _) (C_E (C_C) _) -> 359 
  C_E _ (C_E _ _) -> 360 
  C_E (C_B _ (C_A)) (C_E (C_A) _) -> 361 
  C_E _ (C_E (C_D _) (C_E _ _)) -> 362 
  C_E (C_B (C_B _ _) (C_C)) (C_F (C_E _ _)) -> 363 
  C_E (C_C) (C_E _ (C_F _)) -> 364 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_B _ _) _) -> 365 
  C_E (C_B (C_D _) (C_A)) (C_F (C_E _ _)) -> 366 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_D _) _) -> 367 
  C_E (C_D _) (C_E _ (C_E _ _)) -> 368 
  C_E (C_D _) (C_E (C_C) C_G) -> 369 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E _ (C_E _ _)) -> 370 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_B _ _) _) -> 371 
  C_E (C_B (C_C) (C_A)) (C_E (C_C) C_G) -> 372 
  C_E (C_B (C_A) (C_C)) (C_E (C_D _) C_G) -> 373 
  C_E (C_B _ (C_B _ _)) (C_E (C_C) (C_E _ _)) -> 374 
  C_E (C_B _ (C_D _)) (C_E (C_D _) _) -> 375 
  C_E (C_B (C_C) _) (C_E _ (C_F _)) -> 376 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_D _) (C_F _)) -> 377 
  C_E (C_B (C_A) _) (C_E (C_A) C_G) -> 378 
  C_E (C_B (C_D _) (C_C)) (C_E _ (C_E _ _)) -> 379 
  C_E (C_B (C_C) _) (C_E _ _) -> 380 
  C_E (C_B (C_A) (C_C)) C_G -> 381 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_B _ _) (C_F _)) -> 382 
  C_E (C_B (C_C) _) (C_E (C_B _ _) (C_F _)) -> 383 
  C_E (C_B (C_D _) (C_C)) (C_E (C_B _ _) (C_F _)) -> 384 
  C_E (C_B (C_B _ _) _) (C_E (C_B _ _) (C_F _)) -> 385 
  C_E (C_B (C_A) _) (C_E _ _) -> 386 
  C_E (C_A) _ -> 387 
  C_E (C_B (C_B _ _) (C_A)) (C_F (C_F _)) -> 388 
  C_E (C_B (C_D _) _) C_G -> 389 
  C_E (C_B _ _) (C_E (C_A) _) -> 390 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E _ _) -> 391 
  C_E (C_B (C_B _ _) _) (C_E (C_C) (C_E _ _)) -> 392 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_A) C_G) -> 393 
  C_E (C_B (C_C) (C_C)) (C_E (C_C) C_G) -> 394 
  C_E (C_B (C_D _) _) (C_E (C_B _ _) _) -> 395 
  C_E (C_B (C_C) (C_C)) C_G -> 396 
  C_E (C_B _ (C_A)) (C_E (C_A) (C_E _ _)) -> 397 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_A) _) -> 398 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_C) (C_E _ _)) -> 399 
  C_E (C_B _ (C_D _)) (C_E (C_B _ _) C_G) -> 400 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_A) _) -> 401 
  C_E (C_C) (C_E (C_A) C_G) -> 402 
  C_E (C_B (C_A) (C_A)) (C_E (C_D _) (C_F _)) -> 403 
  C_E (C_B (C_C) (C_A)) (C_F (C_F _)) -> 404 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_A) (C_F _)) -> 405 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_D _) _) -> 406 
  C_E (C_B _ _) (C_E (C_D _) _) -> 407 
  C_E (C_B (C_D _) (C_C)) _ -> 408 
  C_E (C_B (C_A) (C_D _)) (C_E (C_B _ _) (C_E _ _)) -> 409 
  C_E (C_B (C_D _) _) (C_F (C_E _ _)) -> 410 
  C_E (C_B _ (C_D _)) (C_E (C_C) _) -> 411 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_D _) C_G) -> 412 
  C_E (C_B (C_D _) (C_C)) (C_F (C_F _)) -> 413 
  C_E (C_B _ (C_D _)) (C_E _ _) -> 414 
  C_E (C_B (C_C) (C_C)) (C_F _) -> 415 
  C_E (C_B (C_B _ _) (C_C)) (C_F C_G) -> 416 
  C_E (C_B _ (C_B _ _)) C_G -> 417 
