module Program_25 () where 

main = print $ show v_b
data B_A a = C_A | C_B (B_A a) (B_A ((Char,Int))) | C_C | C_D Char
data B_B = C_E (B_A B_B) B_B | C_F B_B | C_G

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
  C_F (C_F C_G) -> 1 
  C_F (C_E _ (C_F _)) -> 2 
  C_E (C_B _ (C_B _ _)) (C_E _ (C_F _)) -> 3 
  C_E (C_B (C_C) (C_A)) (C_E (C_A) (C_E _ _)) -> 4 
  C_E (C_B (C_A) (C_D _)) (C_E (C_A) (C_E _ _)) -> 5 
  C_E (C_C) (C_F (C_F _)) -> 6 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_D _) _) -> 7 
  C_E (C_A) (C_E _ _) -> 8 
  C_E (C_B _ (C_D _)) (C_E (C_D _) (C_E _ _)) -> 9 
  C_E (C_B _ (C_C)) (C_E _ (C_F _)) -> 10 
  C_E (C_B _ (C_D _)) (C_E (C_C) C_G) -> 11 
  C_E (C_B (C_A) (C_A)) (C_E (C_A) (C_F _)) -> 12 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_D _) (C_F _)) -> 13 
  C_E (C_B (C_C) (C_A)) (C_F (C_E _ _)) -> 14 
  C_E (C_B _ _) (C_E (C_B _ _) (C_E _ _)) -> 15 
  C_E (C_B (C_B _ _) (C_D _)) (C_E _ C_G) -> 16 
  C_E (C_B _ (C_A)) C_G -> 17 
  C_E (C_B (C_A) (C_B _ _)) (C_F (C_E _ _)) -> 18 
  C_E _ (C_E (C_A) _) -> 19 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_B _ _) (C_E _ _)) -> 20 
  C_E (C_B (C_D _) (C_B _ _)) _ -> 21 
  C_E (C_B (C_C) (C_D _)) (C_E (C_A) C_G) -> 22 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_F _) -> 23 
  C_E (C_B (C_A) _) (C_F _) -> 24 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_B _ _) (C_E _ _)) -> 25 
  C_E (C_B (C_A) (C_A)) (C_E (C_C) (C_E _ _)) -> 26 
  C_E (C_B (C_A) (C_A)) C_G -> 27 
  C_E (C_A) (C_E (C_A) (C_E _ _)) -> 28 
  C_E (C_A) C_G -> 29 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_B _ _) (C_E _ _)) -> 30 
  C_E (C_B _ _) (C_E (C_C) C_G) -> 31 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_B _ _) C_G) -> 32 
  C_E (C_B (C_C) (C_C)) (C_E (C_A) _) -> 33 
  C_E (C_C) (C_E (C_C) (C_E _ _)) -> 34 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_B _ _) _) -> 35 
  C_E (C_B (C_C) (C_D _)) (C_E (C_B _ _) (C_F _)) -> 36 
  C_E (C_B (C_D _) _) (C_E (C_B _ _) (C_E _ _)) -> 37 
  C_E (C_B (C_C) _) (C_E (C_D _) C_G) -> 38 
  C_E (C_A) (C_E (C_D _) (C_F _)) -> 39 
  C_E (C_B (C_B _ _) (C_D _)) C_G -> 40 
  C_E (C_B (C_C) _) (C_E (C_D _) (C_E _ _)) -> 41 
  C_E (C_D _) (C_E (C_D _) (C_F _)) -> 42 
  C_E (C_B (C_D _) (C_D _)) (C_E _ C_G) -> 43 
  C_E (C_A) (C_F C_G) -> 44 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_B _ _) (C_E _ _)) -> 45 
  C_E (C_B (C_D _) (C_C)) (C_E (C_C) _) -> 46 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_D _) (C_F _)) -> 47 
  C_E _ (C_E (C_C) _) -> 48 
  C_E (C_B (C_A) (C_D _)) C_G -> 49 
  C_E (C_B (C_C) (C_A)) (C_E (C_D _) C_G) -> 50 
  C_E (C_B (C_B _ _) (C_D _)) (C_E _ (C_E _ _)) -> 51 
  C_E (C_B (C_C) (C_C)) (C_E (C_C) (C_F _)) -> 52 
  C_E (C_A) (C_E (C_A) (C_F _)) -> 53 
  C_E (C_A) (C_E (C_C) (C_F _)) -> 54 
  C_E (C_B (C_B _ _) (C_C)) _ -> 55 
  C_E (C_B (C_A) (C_C)) (C_E (C_B _ _) (C_E _ _)) -> 56 
  C_E _ (C_E _ (C_F _)) -> 57 
  C_E (C_B (C_B _ _) (C_D _)) (C_F _) -> 58 
  C_E _ (C_F (C_F _)) -> 59 
  C_E (C_B (C_D _) (C_C)) (C_F _) -> 60 
  C_E (C_C) (C_E (C_B _ _) (C_F _)) -> 61 
  C_E (C_B (C_C) (C_D _)) (C_E (C_D _) _) -> 62 
  C_E (C_B _ (C_C)) (C_F C_G) -> 63 
  C_E (C_B (C_B _ _) _) (C_E (C_D _) (C_F _)) -> 64 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_C) _) -> 65 
  C_E (C_B (C_A) (C_B _ _)) (C_F C_G) -> 66 
  C_E (C_B (C_D _) (C_A)) (C_E (C_A) (C_F _)) -> 67 
  C_E (C_B (C_D _) (C_C)) (C_E (C_B _ _) _) -> 68 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_A) (C_F _)) -> 69 
  C_E (C_B _ (C_A)) (C_E (C_C) (C_E _ _)) -> 70 
  C_E (C_B (C_A) (C_B _ _)) (C_E _ (C_F _)) -> 71 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_A) (C_F _)) -> 72 
  C_E (C_B (C_D _) (C_B _ _)) (C_F _) -> 73 
  C_E (C_B (C_C) (C_C)) _ -> 74 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_D _) C_G) -> 75 
  C_E (C_B (C_A) (C_D _)) (C_E _ _) -> 76 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_D _) (C_E _ _)) -> 77 
  C_E (C_B (C_A) (C_D _)) (C_E (C_D _) _) -> 78 
  C_E (C_B (C_A) (C_C)) (C_E (C_B _ _) _) -> 79 
  C_E (C_B (C_C) (C_D _)) (C_F (C_E _ _)) -> 80 
  C_E (C_B _ (C_C)) (C_E (C_C) C_G) -> 81 
  C_E (C_B _ _) (C_F C_G) -> 82 
  C_E (C_B _ (C_B _ _)) (C_E (C_D _) (C_E _ _)) -> 83 
  C_E (C_A) (C_E (C_C) _) -> 84 
  C_E (C_B _ (C_C)) (C_E _ (C_E _ _)) -> 85 
  C_E (C_B _ (C_A)) (C_E _ C_G) -> 86 
  C_E (C_B _ (C_B _ _)) (C_F (C_E _ _)) -> 87 
  C_E (C_B (C_A) (C_A)) (C_E _ C_G) -> 88 
  C_E (C_B (C_D _) _) (C_E _ (C_E _ _)) -> 89 
  C_E (C_B (C_A) _) (C_E (C_D _) (C_E _ _)) -> 90 
  C_E (C_B (C_C) (C_D _)) (C_E (C_B _ _) C_G) -> 91 
  C_E (C_B (C_A) (C_D _)) (C_E (C_B _ _) _) -> 92 
  C_E (C_B (C_D _) (C_C)) (C_E _ _) -> 93 
  C_E (C_B (C_A) _) (C_E (C_A) _) -> 94 
  C_E (C_B (C_A) (C_C)) (C_F (C_E _ _)) -> 95 
  C_E (C_B (C_C) (C_C)) (C_F (C_F _)) -> 96 
  C_E (C_B (C_C) (C_D _)) (C_E _ (C_F _)) -> 97 
  C_E (C_B (C_C) (C_A)) _ -> 98 
  C_E (C_B (C_D _) (C_C)) (C_F C_G) -> 99 
  C_E (C_B _ (C_B _ _)) (C_F C_G) -> 100 
  C_E (C_B (C_D _) _) (C_F C_G) -> 101 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_C) C_G) -> 102 
  C_E (C_B _ (C_B _ _)) (C_E (C_A) (C_E _ _)) -> 103 
  C_E _ (C_E (C_C) (C_F _)) -> 104 
  C_E (C_B (C_C) (C_C)) (C_E (C_A) (C_E _ _)) -> 105 
  C_E (C_B (C_B _ _) _) (C_F _) -> 106 
  C_E (C_B (C_A) (C_D _)) (C_E (C_D _) (C_E _ _)) -> 107 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_C) C_G) -> 108 
  C_E (C_B (C_C) (C_B _ _)) (C_E _ (C_E _ _)) -> 109 
  C_E _ (C_E (C_A) C_G) -> 110 
  C_E (C_B (C_C) (C_C)) (C_F C_G) -> 111 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_F (C_F _)) -> 112 
  C_E (C_B _ (C_A)) (C_E (C_A) C_G) -> 113 
  C_E (C_B (C_C) (C_B _ _)) (C_F (C_F _)) -> 114 
  C_E _ (C_E (C_B _ _) (C_F _)) -> 115 
  C_E (C_B (C_A) (C_C)) (C_E (C_A) (C_F _)) -> 116 
  C_E (C_B (C_A) (C_A)) (C_E (C_A) C_G) -> 117 
  C_E (C_B (C_B _ _) _) (C_F C_G) -> 118 
  C_E (C_B (C_A) (C_A)) (C_E _ _) -> 119 
  C_E (C_B (C_B _ _) _) (C_E (C_A) (C_E _ _)) -> 120 
  C_E (C_C) C_G -> 121 
  C_E (C_B (C_D _) (C_C)) (C_E (C_C) (C_F _)) -> 122 
  C_E (C_D _) (C_E (C_A) _) -> 123 
  C_E (C_B _ (C_A)) (C_F C_G) -> 124 
  C_E (C_B (C_D _) (C_A)) C_G -> 125 
  C_E (C_B (C_C) _) (C_E (C_B _ _) C_G) -> 126 
  C_E (C_B (C_D _) (C_B _ _)) (C_E _ (C_F _)) -> 127 
  C_E (C_B (C_D _) (C_A)) (C_E (C_A) (C_E _ _)) -> 128 
  C_E (C_B (C_C) (C_D _)) (C_E _ (C_E _ _)) -> 129 
  C_E (C_B (C_D _) (C_C)) (C_E (C_B _ _) C_G) -> 130 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_A) (C_F _)) -> 131 
  C_E (C_B _ (C_A)) (C_E (C_B _ _) (C_F _)) -> 132 
  C_E (C_B _ (C_A)) (C_E (C_B _ _) _) -> 133 
  C_E (C_B (C_A) (C_C)) (C_F C_G) -> 134 
  C_E (C_B (C_A) (C_B _ _)) C_G -> 135 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_B _ _) (C_E _ _)) -> 136 
  C_E (C_B _ _) (C_E _ (C_F _)) -> 137 
  C_E (C_B (C_D _) (C_D _)) (C_E _ (C_F _)) -> 138 
  C_E (C_B (C_A) (C_D _)) (C_E _ C_G) -> 139 
  C_E (C_C) (C_F (C_E _ _)) -> 140 
  C_E (C_B _ _) (C_E _ _) -> 141 
  C_E (C_B (C_A) (C_C)) (C_E _ (C_E _ _)) -> 142 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_B _ _) (C_F _)) -> 143 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_A) C_G) -> 144 
  C_E _ (C_E (C_C) C_G) -> 145 
  C_E (C_B (C_A) (C_C)) (C_E (C_C) C_G) -> 146 
  C_E (C_B (C_D _) _) (C_E (C_A) C_G) -> 147 
  C_E (C_B (C_B _ _) (C_A)) (C_E _ (C_F _)) -> 148 
  C_E (C_B (C_A) (C_B _ _)) (C_E _ _) -> 149 
  C_E (C_B (C_A) (C_A)) (C_F (C_E _ _)) -> 150 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_D _) _) -> 151 
  C_E (C_B (C_A) (C_D _)) (C_F _) -> 152 
  C_E (C_B _ (C_B _ _)) (C_E _ C_G) -> 153 
  C_E _ (C_E (C_B _ _) (C_E _ _)) -> 154 
  C_E (C_B (C_A) (C_C)) (C_E _ (C_F _)) -> 155 
  C_E (C_B (C_C) (C_A)) (C_E (C_A) (C_F _)) -> 156 
  C_E (C_B (C_A) _) (C_E _ (C_F _)) -> 157 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_A) (C_E _ _)) -> 158 
  C_E (C_B (C_D _) (C_C)) (C_E (C_D _) (C_F _)) -> 159 
  C_E (C_D _) (C_E (C_B _ _) C_G) -> 160 
  C_E (C_B _ (C_B _ _)) (C_E (C_C) (C_F _)) -> 161 
  C_E (C_B (C_D _) (C_C)) (C_E (C_D _) C_G) -> 162 
  C_E (C_B (C_D _) _) (C_E (C_C) (C_F _)) -> 163 
  C_E (C_B (C_D _) (C_A)) (C_E (C_B _ _) C_G) -> 164 
  C_E (C_B _ (C_D _)) (C_F _) -> 165 
  C_E (C_B (C_D _) _) (C_E (C_A) (C_F _)) -> 166 
  C_E (C_B (C_C) (C_D _)) (C_E _ _) -> 167 
  C_E (C_B (C_C) (C_C)) (C_E (C_D _) C_G) -> 168 
  C_E (C_B (C_D _) (C_A)) (C_E (C_C) C_G) -> 169 
  C_E (C_B (C_A) (C_C)) (C_F _) -> 170 
  C_E (C_B (C_D _) (C_B _ _)) (C_F (C_F _)) -> 171 
  C_E (C_D _) (C_E (C_A) (C_F _)) -> 172 
  C_E (C_B (C_B _ _) (C_D _)) (C_F C_G) -> 173 
  C_E (C_C) (C_E (C_B _ _) _) -> 174 
  C_E (C_B _ (C_C)) (C_E (C_D _) (C_E _ _)) -> 175 
  C_E (C_B (C_D _) _) (C_E (C_D _) _) -> 176 
  C_E (C_B (C_D _) (C_D _)) (C_F _) -> 177 
  C_E (C_B _ (C_A)) (C_F (C_F _)) -> 178 
  C_E _ C_G -> 179 
  C_E (C_B _ (C_A)) (C_E _ (C_E _ _)) -> 180 
  C_E (C_B _ _) (C_E (C_B _ _) C_G) -> 181 
  C_E (C_B (C_C) (C_A)) (C_F C_G) -> 182 
  C_E (C_B (C_D _) _) (C_E (C_D _) C_G) -> 183 
  C_E (C_B (C_C) _) (C_F _) -> 184 
  C_E (C_B (C_A) (C_A)) (C_E (C_B _ _) (C_E _ _)) -> 185 
  C_E (C_B (C_C) (C_C)) (C_E (C_B _ _) (C_E _ _)) -> 186 
  C_E (C_B (C_C) (C_D _)) (C_E (C_B _ _) (C_E _ _)) -> 187 
  C_E (C_B _ _) (C_E (C_B _ _) (C_F _)) -> 188 
  C_E (C_B _ (C_B _ _)) (C_E (C_A) C_G) -> 189 
  C_E (C_B _ (C_B _ _)) (C_E (C_A) _) -> 190 
  C_E (C_C) (C_E (C_B _ _) (C_E _ _)) -> 191 
  C_E (C_B (C_B _ _) (C_A)) (C_F _) -> 192 
  C_E (C_B (C_B _ _) (C_A)) _ -> 193 
  C_E (C_B (C_C) (C_D _)) (C_F C_G) -> 194 
  C_E (C_B (C_B _ _) (C_C)) (C_F (C_F _)) -> 195 
  C_E (C_C) (C_E (C_A) (C_F _)) -> 196 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_B _ _) (C_F _)) -> 197 
  C_E (C_B (C_C) (C_B _ _)) (C_E _ _) -> 198 
  C_E (C_B (C_B _ _) (C_D _)) (C_F (C_F _)) -> 199 
  C_E (C_C) (C_E (C_C) C_G) -> 200 
  C_E (C_B (C_B _ _) (C_C)) (C_F _) -> 201 
  C_E (C_B (C_C) _) (C_F (C_E _ _)) -> 202 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_A) C_G) -> 203 
  C_E (C_B (C_B _ _) (C_B _ _)) _ -> 204 
  C_E (C_C) _ -> 205 
  C_E (C_B (C_D _) (C_A)) (C_E (C_D _) _) -> 206 
  C_E (C_B _ (C_B _ _)) (C_E (C_B _ _) _) -> 207 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_F C_G) -> 208 
  C_E (C_B _ (C_C)) _ -> 209 
  C_E (C_B (C_D _) (C_C)) (C_E _ (C_F _)) -> 210 
  C_E (C_B (C_D _) (C_A)) _ -> 211 
  C_E (C_C) (C_E (C_A) _) -> 212 
  C_E (C_B _ (C_D _)) (C_E _ (C_F _)) -> 213 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_C) (C_E _ _)) -> 214 
  C_E (C_B (C_A) _) (C_E (C_C) (C_E _ _)) -> 215 
  C_E (C_B (C_A) (C_D _)) (C_E _ (C_E _ _)) -> 216 
  C_E (C_D _) (C_E _ _) -> 217 
  C_E (C_B (C_C) (C_A)) (C_E (C_D _) _) -> 218 
  C_E (C_B (C_A) (C_B _ _)) (C_E _ C_G) -> 219 
  C_E (C_B (C_C) (C_D _)) (C_E (C_C) (C_E _ _)) -> 220 
  C_E _ (C_E _ C_G) -> 221 
  C_E (C_B (C_D _) (C_A)) (C_E _ C_G) -> 222 
  C_E (C_B (C_C) _) (C_E (C_B _ _) _) -> 223 
  C_E (C_B (C_B _ _) _) (C_E _ (C_E _ _)) -> 224 
  C_E (C_B _ (C_C)) (C_E (C_C) _) -> 225 
  C_E (C_A) (C_F (C_F _)) -> 226 
  C_E (C_B _ (C_B _ _)) (C_E (C_D _) (C_F _)) -> 227 
  C_E (C_B _ _) (C_E (C_C) (C_F _)) -> 228 
  C_E (C_B (C_A) (C_D _)) (C_E (C_D _) (C_F _)) -> 229 
  C_E (C_B (C_D _) (C_A)) (C_E (C_A) C_G) -> 230 
  C_E (C_B (C_B _ _) (C_A)) C_G -> 231 
  C_E (C_B (C_A) (C_D _)) (C_E (C_A) C_G) -> 232 
  C_E (C_B _ (C_C)) (C_E (C_B _ _) _) -> 233 
  C_E (C_B (C_C) (C_C)) (C_E _ C_G) -> 234 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_B _ _) (C_E _ _)) -> 235 
  C_E (C_B (C_D _) (C_D _)) (C_E _ _) -> 236 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_B _ _) (C_F _)) -> 237 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_D _) (C_F _)) -> 238 
  C_E (C_B (C_C) (C_D _)) (C_E (C_C) (C_F _)) -> 239 
  C_E (C_B (C_D _) (C_B _ _)) (C_F C_G) -> 240 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_C) C_G) -> 241 
  C_E (C_B _ (C_D _)) (C_E (C_B _ _) _) -> 242 
  C_E (C_B (C_D _) (C_C)) C_G -> 243 
  C_E (C_B (C_D _) (C_A)) (C_E _ _) -> 244 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_D _) C_G) -> 245 
  C_E (C_B (C_C) _) (C_E (C_D _) _) -> 246 
  C_E _ _ -> 247 
  C_E (C_B (C_C) _) (C_E (C_C) C_G) -> 248 
  C_E (C_B _ (C_A)) (C_E (C_D _) C_G) -> 249 
  C_E (C_B (C_D _) (C_A)) (C_E (C_D _) (C_E _ _)) -> 250 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_A) (C_E _ _)) -> 251 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_D _) _) -> 252 
  C_E (C_B _ (C_B _ _)) (C_E (C_B _ _) C_G) -> 253 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_C) (C_F _)) -> 254 
  C_E (C_B (C_A) (C_C)) (C_E (C_B _ _) C_G) -> 255 
  C_E (C_B (C_D _) (C_C)) (C_E (C_C) (C_E _ _)) -> 256 
  C_E (C_B (C_D _) _) (C_E (C_D _) (C_E _ _)) -> 257 
  C_E (C_D _) (C_E (C_D _) (C_E _ _)) -> 258 
  C_E (C_B _ (C_C)) (C_E (C_A) C_G) -> 259 
  C_E (C_B _ (C_C)) (C_F (C_F _)) -> 260 
  C_E (C_B (C_C) (C_A)) (C_E (C_A) C_G) -> 261 
  C_E (C_B (C_A) (C_A)) (C_E (C_C) _) -> 262 
  C_E (C_B (C_C) (C_A)) (C_F _) -> 263 
  C_E (C_D _) C_G -> 264 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_C) _) -> 265 
  C_E (C_A) (C_E (C_D _) (C_E _ _)) -> 266 
  C_E (C_B (C_C) (C_C)) (C_E (C_C) _) -> 267 
  C_E (C_B _ (C_A)) (C_E (C_B _ _) C_G) -> 268 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E _ (C_F _)) -> 269 
  C_E (C_B (C_C) _) (C_F C_G) -> 270 
  C_E _ (C_E _ (C_E _ _)) -> 271 
  C_E (C_B (C_A) (C_A)) (C_E (C_D _) (C_E _ _)) -> 272 
  C_E (C_D _) (C_F C_G) -> 273 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_D _) C_G) -> 274 
  C_E (C_B (C_B _ _) (C_A)) (C_F (C_E _ _)) -> 275 
  C_E (C_B (C_A) (C_B _ _)) (C_F _) -> 276 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_D _) (C_F _)) -> 277 
