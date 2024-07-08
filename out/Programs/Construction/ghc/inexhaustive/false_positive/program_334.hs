module Program_21 () where 

 main = print $ show v_b
data B_B = C_E | C_F B_B B_B | C_G | C_H B_B B_B
data B_A a = C_A (B_A a) ((B_B,(Char,Int))) | C_B | C_C a a | C_D

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
  C_F C_E _ -> 1 
  C_F (C_F C_E C_E) _ -> 2 
  C_F (C_F C_E (C_F _ _)) _ -> 3 
  C_F (C_F C_E C_G) _ -> 4 
  C_F (C_F C_E (C_H _ _)) _ -> 5 
  C_F (C_F (C_F _ _) C_E) _ -> 6 
  C_F (C_F (C_F _ _) (C_F _ _)) _ -> 7 
  C_F (C_F (C_F _ _) C_G) _ -> 8 
  C_F (C_F (C_F _ _) (C_H _ _)) _ -> 9 
  C_F (C_F C_G C_E) _ -> 10 
  C_F (C_F C_G (C_F _ _)) _ -> 11 
  C_F (C_F C_G C_G) _ -> 12 
  C_F (C_F C_G (C_H _ _)) _ -> 13 
  C_F (C_F (C_H _ _) C_E) _ -> 14 
  C_F (C_F (C_H _ _) (C_F _ _)) _ -> 15 
  C_F (C_F (C_H _ _) C_G) _ -> 16 
  C_F (C_F (C_H _ _) (C_H _ _)) _ -> 17 
  C_F C_G _ -> 18 
  C_F (C_H C_E C_E) _ -> 19 
  C_F (C_H C_E (C_F _ _)) _ -> 20 
  C_F (C_H C_E C_G) _ -> 21 
  C_F (C_H C_E (C_H _ _)) _ -> 22 
  C_F (C_H (C_F _ _) C_E) _ -> 23 
  C_F (C_H (C_F _ _) (C_F _ _)) _ -> 24 
  C_F (C_H (C_F _ _) C_G) _ -> 25 
  C_F (C_H (C_F _ _) (C_H _ _)) _ -> 26 
  C_F (C_H C_G C_E) _ -> 27 
  C_F (C_H C_G (C_F _ _)) _ -> 28 
  C_F (C_H C_G C_G) _ -> 29 
  C_F (C_H C_G (C_H _ _)) _ -> 30 
  C_F (C_H (C_H _ _) C_E) _ -> 31 
  C_F (C_H (C_H _ _) (C_F _ _)) _ -> 32 
  C_F (C_H (C_H _ _) C_G) _ -> 33 
  C_F (C_H (C_H _ _) (C_H _ _)) _ -> 34 
  C_G -> 35 
  C_H C_E C_E -> 36 
  C_H (C_F _ C_E) C_E -> 37 
  C_H (C_F _ (C_F _ _)) C_E -> 38 
  C_H (C_F _ C_G) C_E -> 39 
  C_H (C_F _ (C_H _ _)) C_E -> 40 
  C_H C_G C_E -> 41 
  C_H (C_H C_E C_E) C_E -> 42 
  C_H (C_H C_E (C_F _ _)) C_E -> 43 
  C_H (C_H C_E C_G) C_E -> 44 
  C_H (C_H C_E (C_H _ _)) C_E -> 45 
  C_H (C_H (C_F _ _) C_E) C_E -> 46 
  C_H (C_H (C_F _ _) (C_F _ _)) C_E -> 47 
  C_H (C_H (C_F _ _) C_G) C_E -> 48 
  C_H (C_H (C_F _ _) (C_H _ _)) C_E -> 49 
  C_H (C_H C_G C_E) C_E -> 50 
  C_H (C_H C_G (C_F _ _)) C_E -> 51 
  C_H (C_H C_G C_G) C_E -> 52 
  C_H (C_H C_G (C_H _ _)) C_E -> 53 
  C_H (C_H (C_H _ _) C_E) C_E -> 54 
  C_H (C_H (C_H _ _) (C_F _ _)) C_E -> 55 
  C_H (C_H (C_H _ _) C_G) C_E -> 56 
  C_H (C_H (C_H _ _) (C_H _ _)) C_E -> 57 
  C_H C_E (C_F C_E C_E) -> 58 
  C_H (C_F _ C_E) (C_F C_E C_E) -> 59 
  C_H (C_F _ (C_F _ _)) (C_F C_E C_E) -> 60 
  C_H (C_F _ C_G) (C_F C_E C_E) -> 61 
  C_H (C_F _ (C_H _ _)) (C_F C_E C_E) -> 62 
  C_H C_G (C_F C_E C_E) -> 63 
  C_H (C_H C_E C_E) (C_F C_E C_E) -> 64 
  C_H (C_H C_E (C_F _ _)) (C_F C_E C_E) -> 65 
  C_H (C_H C_E C_G) (C_F C_E C_E) -> 66 
  C_H (C_H C_E (C_H _ _)) (C_F C_E C_E) -> 67 
  C_H (C_H (C_F _ _) C_E) (C_F C_E C_E) -> 68 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F C_E C_E) -> 69 
  C_H (C_H (C_F _ _) C_G) (C_F C_E C_E) -> 70 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F C_E C_E) -> 71 
  C_H (C_H C_G C_E) (C_F C_E C_E) -> 72 
  C_H (C_H C_G (C_F _ _)) (C_F C_E C_E) -> 73 
  C_H (C_H C_G C_G) (C_F C_E C_E) -> 74 
  C_H (C_H C_G (C_H _ _)) (C_F C_E C_E) -> 75 
  C_H (C_H (C_H _ _) C_E) (C_F C_E C_E) -> 76 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F C_E C_E) -> 77 
  C_H (C_H (C_H _ _) C_G) (C_F C_E C_E) -> 78 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F C_E C_E) -> 79 
  C_H C_E (C_F C_E (C_F _ _)) -> 80 
  C_H (C_F _ C_E) (C_F C_E (C_F _ _)) -> 81 
  C_H (C_F _ (C_F _ _)) (C_F C_E (C_F _ _)) -> 82 
  C_H (C_F _ C_G) (C_F C_E (C_F _ _)) -> 83 
  C_H (C_F _ (C_H _ _)) (C_F C_E (C_F _ _)) -> 84 
  C_H C_G (C_F C_E (C_F _ _)) -> 85 
  C_H (C_H C_E C_E) (C_F C_E (C_F _ _)) -> 86 
  C_H (C_H C_E (C_F _ _)) (C_F C_E (C_F _ _)) -> 87 
  C_H (C_H C_E C_G) (C_F C_E (C_F _ _)) -> 88 
  C_H (C_H C_E (C_H _ _)) (C_F C_E (C_F _ _)) -> 89 
  C_H (C_H (C_F _ _) C_E) (C_F C_E (C_F _ _)) -> 90 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F C_E (C_F _ _)) -> 91 
  C_H (C_H (C_F _ _) C_G) (C_F C_E (C_F _ _)) -> 92 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F C_E (C_F _ _)) -> 93 
  C_H (C_H C_G C_E) (C_F C_E (C_F _ _)) -> 94 
  C_H (C_H C_G (C_F _ _)) (C_F C_E (C_F _ _)) -> 95 
  C_H (C_H C_G C_G) (C_F C_E (C_F _ _)) -> 96 
  C_H (C_H C_G (C_H _ _)) (C_F C_E (C_F _ _)) -> 97 
  C_H (C_H (C_H _ _) C_E) (C_F C_E (C_F _ _)) -> 98 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F C_E (C_F _ _)) -> 99 
  C_H (C_H (C_H _ _) C_G) (C_F C_E (C_F _ _)) -> 100 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F C_E (C_F _ _)) -> 101 
  C_H C_E (C_F C_E C_G) -> 102 
  C_H (C_F _ C_E) (C_F C_E C_G) -> 103 
  C_H (C_F _ (C_F _ _)) (C_F C_E C_G) -> 104 
  C_H (C_F _ C_G) (C_F C_E C_G) -> 105 
  C_H (C_F _ (C_H _ _)) (C_F C_E C_G) -> 106 
  C_H C_G (C_F C_E C_G) -> 107 
  C_H (C_H C_E C_E) (C_F C_E C_G) -> 108 
  C_H (C_H C_E (C_F _ _)) (C_F C_E C_G) -> 109 
  C_H (C_H C_E C_G) (C_F C_E C_G) -> 110 
  C_H (C_H C_E (C_H _ _)) (C_F C_E C_G) -> 111 
  C_H (C_H (C_F _ _) C_E) (C_F C_E C_G) -> 112 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F C_E C_G) -> 113 
  C_H (C_H (C_F _ _) C_G) (C_F C_E C_G) -> 114 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F C_E C_G) -> 115 
  C_H (C_H C_G C_E) (C_F C_E C_G) -> 116 
  C_H (C_H C_G (C_F _ _)) (C_F C_E C_G) -> 117 
  C_H (C_H C_G C_G) (C_F C_E C_G) -> 118 
  C_H (C_H C_G (C_H _ _)) (C_F C_E C_G) -> 119 
  C_H (C_H (C_H _ _) C_E) (C_F C_E C_G) -> 120 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F C_E C_G) -> 121 
  C_H (C_H (C_H _ _) C_G) (C_F C_E C_G) -> 122 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F C_E C_G) -> 123 
  C_H C_E (C_F C_E (C_H _ _)) -> 124 
  C_H (C_F _ C_E) (C_F C_E (C_H _ _)) -> 125 
  C_H (C_F _ (C_F _ _)) (C_F C_E (C_H _ _)) -> 126 
  C_H (C_F _ C_G) (C_F C_E (C_H _ _)) -> 127 
  C_H (C_F _ (C_H _ _)) (C_F C_E (C_H _ _)) -> 128 
  C_H C_G (C_F C_E (C_H _ _)) -> 129 
  C_H (C_H C_E C_E) (C_F C_E (C_H _ _)) -> 130 
  C_H (C_H C_E (C_F _ _)) (C_F C_E (C_H _ _)) -> 131 
  C_H (C_H C_E C_G) (C_F C_E (C_H _ _)) -> 132 
  C_H (C_H C_E (C_H _ _)) (C_F C_E (C_H _ _)) -> 133 
  C_H (C_H (C_F _ _) C_E) (C_F C_E (C_H _ _)) -> 134 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F C_E (C_H _ _)) -> 135 
  C_H (C_H (C_F _ _) C_G) (C_F C_E (C_H _ _)) -> 136 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F C_E (C_H _ _)) -> 137 
  C_H (C_H C_G C_E) (C_F C_E (C_H _ _)) -> 138 
  C_H (C_H C_G (C_F _ _)) (C_F C_E (C_H _ _)) -> 139 
  C_H (C_H C_G C_G) (C_F C_E (C_H _ _)) -> 140 
  C_H (C_H C_G (C_H _ _)) (C_F C_E (C_H _ _)) -> 141 
  C_H (C_H (C_H _ _) C_E) (C_F C_E (C_H _ _)) -> 142 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F C_E (C_H _ _)) -> 143 
  C_H (C_H (C_H _ _) C_G) (C_F C_E (C_H _ _)) -> 144 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F C_E (C_H _ _)) -> 145 
  C_H (C_F _ C_E) (C_F (C_F _ _) C_E) -> 146 
  C_H (C_F _ (C_F _ _)) (C_F (C_F _ _) C_E) -> 147 
  C_H (C_F _ C_G) (C_F (C_F _ _) C_E) -> 148 
  C_H (C_F _ (C_H _ _)) (C_F (C_F _ _) C_E) -> 149 
  C_H C_G (C_F (C_F _ _) C_E) -> 150 
  C_H (C_H C_E C_E) (C_F (C_F _ _) C_E) -> 151 
  C_H (C_H C_E (C_F _ _)) (C_F (C_F _ _) C_E) -> 152 
  C_H (C_H C_E C_G) (C_F (C_F _ _) C_E) -> 153 
  C_H (C_H C_E (C_H _ _)) (C_F (C_F _ _) C_E) -> 154 
  C_H (C_H (C_F _ _) C_E) (C_F (C_F _ _) C_E) -> 155 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F (C_F _ _) C_E) -> 156 
  C_H (C_H (C_F _ _) C_G) (C_F (C_F _ _) C_E) -> 157 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F (C_F _ _) C_E) -> 158 
  C_H (C_H C_G C_E) (C_F (C_F _ _) C_E) -> 159 
  C_H (C_H C_G (C_F _ _)) (C_F (C_F _ _) C_E) -> 160 
  C_H (C_H C_G C_G) (C_F (C_F _ _) C_E) -> 161 
  C_H (C_H C_G (C_H _ _)) (C_F (C_F _ _) C_E) -> 162 
  C_H (C_H (C_H _ _) C_E) (C_F (C_F _ _) C_E) -> 163 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F (C_F _ _) C_E) -> 164 
  C_H (C_H (C_H _ _) C_G) (C_F (C_F _ _) C_E) -> 165 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F (C_F _ _) C_E) -> 166 
  C_H C_E (C_F (C_F _ _) (C_F _ _)) -> 167 
  C_H (C_F _ C_E) (C_F (C_F _ _) (C_F _ _)) -> 168 
  C_H (C_F _ (C_F _ _)) (C_F (C_F _ _) (C_F _ _)) -> 169 
  C_H (C_F _ C_G) (C_F (C_F _ _) (C_F _ _)) -> 170 
  C_H (C_F _ (C_H _ _)) (C_F (C_F _ _) (C_F _ _)) -> 171 
  C_H C_G (C_F (C_F _ _) (C_F _ _)) -> 172 
  C_H (C_H C_E C_E) (C_F (C_F _ _) (C_F _ _)) -> 173 
  C_H (C_H C_E (C_F _ _)) (C_F (C_F _ _) (C_F _ _)) -> 174 
  C_H (C_H C_E C_G) (C_F (C_F _ _) (C_F _ _)) -> 175 
  C_H (C_H C_E (C_H _ _)) (C_F (C_F _ _) (C_F _ _)) -> 176 
  C_H (C_H (C_F _ _) C_E) (C_F (C_F _ _) (C_F _ _)) -> 177 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F (C_F _ _) (C_F _ _)) -> 178 
  C_H (C_H (C_F _ _) C_G) (C_F (C_F _ _) (C_F _ _)) -> 179 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F (C_F _ _) (C_F _ _)) -> 180 
  C_H (C_H C_G C_E) (C_F (C_F _ _) (C_F _ _)) -> 181 
  C_H (C_H C_G (C_F _ _)) (C_F (C_F _ _) (C_F _ _)) -> 182 
  C_H (C_H C_G C_G) (C_F (C_F _ _) (C_F _ _)) -> 183 
  C_H (C_H C_G (C_H _ _)) (C_F (C_F _ _) (C_F _ _)) -> 184 
  C_H (C_H (C_H _ _) C_E) (C_F (C_F _ _) (C_F _ _)) -> 185 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F (C_F _ _) (C_F _ _)) -> 186 
  C_H (C_H (C_H _ _) C_G) (C_F (C_F _ _) (C_F _ _)) -> 187 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F (C_F _ _) (C_F _ _)) -> 188 
  C_H C_E (C_F (C_F _ _) C_G) -> 189 
  C_H (C_F _ C_E) (C_F (C_F _ _) C_G) -> 190 
  C_H (C_F _ (C_F _ _)) (C_F (C_F _ _) C_G) -> 191 
  C_H (C_F _ C_G) (C_F (C_F _ _) C_G) -> 192 
  C_H (C_F _ (C_H _ _)) (C_F (C_F _ _) C_G) -> 193 
  C_H C_G (C_F (C_F _ _) C_G) -> 194 
  C_H (C_H C_E C_E) (C_F (C_F _ _) C_G) -> 195 
  C_H (C_H C_E (C_F _ _)) (C_F (C_F _ _) C_G) -> 196 
  C_H (C_H C_E C_G) (C_F (C_F _ _) C_G) -> 197 
  C_H (C_H C_E (C_H _ _)) (C_F (C_F _ _) C_G) -> 198 
  C_H (C_H (C_F _ _) C_E) (C_F (C_F _ _) C_G) -> 199 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F (C_F _ _) C_G) -> 200 
  C_H (C_H (C_F _ _) C_G) (C_F (C_F _ _) C_G) -> 201 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F (C_F _ _) C_G) -> 202 
  C_H (C_H C_G C_E) (C_F (C_F _ _) C_G) -> 203 
  C_H (C_H C_G (C_F _ _)) (C_F (C_F _ _) C_G) -> 204 
  C_H (C_H C_G C_G) (C_F (C_F _ _) C_G) -> 205 
  C_H (C_H C_G (C_H _ _)) (C_F (C_F _ _) C_G) -> 206 
  C_H (C_H (C_H _ _) C_E) (C_F (C_F _ _) C_G) -> 207 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F (C_F _ _) C_G) -> 208 
  C_H (C_H (C_H _ _) C_G) (C_F (C_F _ _) C_G) -> 209 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F (C_F _ _) C_G) -> 210 
  C_H C_E (C_F (C_F _ _) (C_H _ _)) -> 211 
  C_H (C_F _ C_E) (C_F (C_F _ _) (C_H _ _)) -> 212 
  C_H (C_F _ (C_F _ _)) (C_F (C_F _ _) (C_H _ _)) -> 213 
  C_H (C_F _ C_G) (C_F (C_F _ _) (C_H _ _)) -> 214 
  C_H (C_F _ (C_H _ _)) (C_F (C_F _ _) (C_H _ _)) -> 215 
  C_H C_G (C_F (C_F _ _) (C_H _ _)) -> 216 
  C_H (C_H C_E C_E) (C_F (C_F _ _) (C_H _ _)) -> 217 
  C_H (C_H C_E (C_F _ _)) (C_F (C_F _ _) (C_H _ _)) -> 218 
  C_H (C_H C_E C_G) (C_F (C_F _ _) (C_H _ _)) -> 219 
  C_H (C_H C_E (C_H _ _)) (C_F (C_F _ _) (C_H _ _)) -> 220 
  C_H (C_H (C_F _ _) C_E) (C_F (C_F _ _) (C_H _ _)) -> 221 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F (C_F _ _) (C_H _ _)) -> 222 
  C_H (C_H (C_F _ _) C_G) (C_F (C_F _ _) (C_H _ _)) -> 223 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F (C_F _ _) (C_H _ _)) -> 224 
  C_H (C_H C_G C_E) (C_F (C_F _ _) (C_H _ _)) -> 225 
  C_H (C_H C_G (C_F _ _)) (C_F (C_F _ _) (C_H _ _)) -> 226 
  C_H (C_H C_G C_G) (C_F (C_F _ _) (C_H _ _)) -> 227 
  C_H (C_H C_G (C_H _ _)) (C_F (C_F _ _) (C_H _ _)) -> 228 
  C_H (C_H (C_H _ _) C_E) (C_F (C_F _ _) (C_H _ _)) -> 229 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F (C_F _ _) (C_H _ _)) -> 230 
  C_H (C_H (C_H _ _) C_G) (C_F (C_F _ _) (C_H _ _)) -> 231 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F (C_F _ _) (C_H _ _)) -> 232 
  C_H C_E (C_F C_G C_E) -> 233 
  C_H (C_F _ C_E) (C_F C_G C_E) -> 234 
  C_H (C_F _ (C_F _ _)) (C_F C_G C_E) -> 235 
  C_H (C_F _ C_G) (C_F C_G C_E) -> 236 
  C_H (C_F _ (C_H _ _)) (C_F C_G C_E) -> 237 
  C_H C_G (C_F C_G C_E) -> 238 
  C_H (C_H C_E C_E) (C_F C_G C_E) -> 239 
  C_H (C_H C_E (C_F _ _)) (C_F C_G C_E) -> 240 
  C_H (C_H C_E C_G) (C_F C_G C_E) -> 241 
  C_H (C_H C_E (C_H _ _)) (C_F C_G C_E) -> 242 
  C_H (C_H (C_F _ _) C_E) (C_F C_G C_E) -> 243 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F C_G C_E) -> 244 
  C_H (C_H (C_F _ _) C_G) (C_F C_G C_E) -> 245 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F C_G C_E) -> 246 
  C_H (C_H C_G C_E) (C_F C_G C_E) -> 247 
  C_H (C_H C_G (C_F _ _)) (C_F C_G C_E) -> 248 
  C_H (C_H C_G C_G) (C_F C_G C_E) -> 249 
  C_H (C_H C_G (C_H _ _)) (C_F C_G C_E) -> 250 
  C_H (C_H (C_H _ _) C_E) (C_F C_G C_E) -> 251 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F C_G C_E) -> 252 
  C_H (C_H (C_H _ _) C_G) (C_F C_G C_E) -> 253 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F C_G C_E) -> 254 
  C_H C_E (C_F C_G (C_F _ _)) -> 255 
  C_H (C_F _ C_E) (C_F C_G (C_F _ _)) -> 256 
  C_H (C_F _ (C_F _ _)) (C_F C_G (C_F _ _)) -> 257 
  C_H (C_F _ C_G) (C_F C_G (C_F _ _)) -> 258 
  C_H (C_F _ (C_H _ _)) (C_F C_G (C_F _ _)) -> 259 
  C_H C_G (C_F C_G (C_F _ _)) -> 260 
  C_H (C_H C_E C_E) (C_F C_G (C_F _ _)) -> 261 
  C_H (C_H C_E (C_F _ _)) (C_F C_G (C_F _ _)) -> 262 
  C_H (C_H C_E C_G) (C_F C_G (C_F _ _)) -> 263 
  C_H (C_H C_E (C_H _ _)) (C_F C_G (C_F _ _)) -> 264 
  C_H (C_H (C_F _ _) C_E) (C_F C_G (C_F _ _)) -> 265 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F C_G (C_F _ _)) -> 266 
  C_H (C_H (C_F _ _) C_G) (C_F C_G (C_F _ _)) -> 267 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F C_G (C_F _ _)) -> 268 
  C_H (C_H C_G C_E) (C_F C_G (C_F _ _)) -> 269 
  C_H (C_H C_G (C_F _ _)) (C_F C_G (C_F _ _)) -> 270 
  C_H (C_H C_G C_G) (C_F C_G (C_F _ _)) -> 271 
  C_H (C_H C_G (C_H _ _)) (C_F C_G (C_F _ _)) -> 272 
  C_H (C_H (C_H _ _) C_E) (C_F C_G (C_F _ _)) -> 273 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F C_G (C_F _ _)) -> 274 
  C_H (C_H (C_H _ _) C_G) (C_F C_G (C_F _ _)) -> 275 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F C_G (C_F _ _)) -> 276 
  C_H C_E (C_F C_G C_G) -> 277 
  C_H (C_F _ C_E) (C_F C_G C_G) -> 278 
  C_H (C_F _ (C_F _ _)) (C_F C_G C_G) -> 279 
  C_H (C_F _ C_G) (C_F C_G C_G) -> 280 
  C_H (C_F _ (C_H _ _)) (C_F C_G C_G) -> 281 
  C_H C_G (C_F C_G C_G) -> 282 
  C_H (C_H C_E C_E) (C_F C_G C_G) -> 283 
  C_H (C_H C_E (C_F _ _)) (C_F C_G C_G) -> 284 
  C_H (C_H C_E C_G) (C_F C_G C_G) -> 285 
  C_H (C_H C_E (C_H _ _)) (C_F C_G C_G) -> 286 
  C_H (C_H (C_F _ _) C_E) (C_F C_G C_G) -> 287 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F C_G C_G) -> 288 
  C_H (C_H (C_F _ _) C_G) (C_F C_G C_G) -> 289 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F C_G C_G) -> 290 
  C_H (C_H C_G C_E) (C_F C_G C_G) -> 291 
  C_H (C_H C_G (C_F _ _)) (C_F C_G C_G) -> 292 
  C_H (C_H C_G C_G) (C_F C_G C_G) -> 293 
  C_H (C_H C_G (C_H _ _)) (C_F C_G C_G) -> 294 
  C_H (C_H (C_H _ _) C_E) (C_F C_G C_G) -> 295 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F C_G C_G) -> 296 
  C_H (C_H (C_H _ _) C_G) (C_F C_G C_G) -> 297 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F C_G C_G) -> 298 
  C_H C_E (C_F C_G (C_H _ _)) -> 299 
  C_H (C_F _ C_E) (C_F C_G (C_H _ _)) -> 300 
  C_H (C_F _ (C_F _ _)) (C_F C_G (C_H _ _)) -> 301 
  C_H (C_F _ C_G) (C_F C_G (C_H _ _)) -> 302 
  C_H (C_F _ (C_H _ _)) (C_F C_G (C_H _ _)) -> 303 
  C_H C_G (C_F C_G (C_H _ _)) -> 304 
  C_H (C_H C_E C_E) (C_F C_G (C_H _ _)) -> 305 
  C_H (C_H C_E (C_F _ _)) (C_F C_G (C_H _ _)) -> 306 
  C_H (C_H C_E C_G) (C_F C_G (C_H _ _)) -> 307 
  C_H (C_H C_E (C_H _ _)) (C_F C_G (C_H _ _)) -> 308 
  C_H (C_H (C_F _ _) C_E) (C_F C_G (C_H _ _)) -> 309 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F C_G (C_H _ _)) -> 310 
  C_H (C_H (C_F _ _) C_G) (C_F C_G (C_H _ _)) -> 311 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F C_G (C_H _ _)) -> 312 
  C_H (C_H C_G C_E) (C_F C_G (C_H _ _)) -> 313 
  C_H (C_H C_G (C_F _ _)) (C_F C_G (C_H _ _)) -> 314 
  C_H (C_H C_G C_G) (C_F C_G (C_H _ _)) -> 315 
  C_H (C_H C_G (C_H _ _)) (C_F C_G (C_H _ _)) -> 316 
  C_H (C_H (C_H _ _) C_E) (C_F C_G (C_H _ _)) -> 317 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F C_G (C_H _ _)) -> 318 
  C_H (C_H (C_H _ _) C_G) (C_F C_G (C_H _ _)) -> 319 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F C_G (C_H _ _)) -> 320 
  C_H C_E (C_F (C_H _ _) C_E) -> 321 
  C_H (C_F _ C_E) (C_F (C_H _ _) C_E) -> 322 
  C_H (C_F _ (C_F _ _)) (C_F (C_H _ _) C_E) -> 323 
  C_H (C_F _ C_G) (C_F (C_H _ _) C_E) -> 324 
  C_H (C_F _ (C_H _ _)) (C_F (C_H _ _) C_E) -> 325 
  C_H C_G (C_F (C_H _ _) C_E) -> 326 
  C_H (C_H C_E C_E) (C_F (C_H _ _) C_E) -> 327 
  C_H (C_H C_E (C_F _ _)) (C_F (C_H _ _) C_E) -> 328 
  C_H (C_H C_E C_G) (C_F (C_H _ _) C_E) -> 329 
  C_H (C_H C_E (C_H _ _)) (C_F (C_H _ _) C_E) -> 330 
  C_H (C_H (C_F _ _) C_E) (C_F (C_H _ _) C_E) -> 331 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F (C_H _ _) C_E) -> 332 
  C_H (C_H (C_F _ _) C_G) (C_F (C_H _ _) C_E) -> 333 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F (C_H _ _) C_E) -> 334 
  C_H (C_H C_G C_E) (C_F (C_H _ _) C_E) -> 335 
  C_H (C_H C_G (C_F _ _)) (C_F (C_H _ _) C_E) -> 336 
  C_H (C_H C_G C_G) (C_F (C_H _ _) C_E) -> 337 
  C_H (C_H C_G (C_H _ _)) (C_F (C_H _ _) C_E) -> 338 
  C_H (C_H (C_H _ _) C_E) (C_F (C_H _ _) C_E) -> 339 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F (C_H _ _) C_E) -> 340 
  C_H (C_H (C_H _ _) C_G) (C_F (C_H _ _) C_E) -> 341 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F (C_H _ _) C_E) -> 342 
  C_H C_E (C_F (C_H _ _) (C_F _ _)) -> 343 
  C_H (C_F _ C_E) (C_F (C_H _ _) (C_F _ _)) -> 344 
  C_H (C_F _ (C_F _ _)) (C_F (C_H _ _) (C_F _ _)) -> 345 
  C_H (C_F _ C_G) (C_F (C_H _ _) (C_F _ _)) -> 346 
  C_H (C_F _ (C_H _ _)) (C_F (C_H _ _) (C_F _ _)) -> 347 
  C_H C_G (C_F (C_H _ _) (C_F _ _)) -> 348 
  C_H (C_H C_E C_E) (C_F (C_H _ _) (C_F _ _)) -> 349 
  C_H (C_H C_E (C_F _ _)) (C_F (C_H _ _) (C_F _ _)) -> 350 
  C_H (C_H C_E C_G) (C_F (C_H _ _) (C_F _ _)) -> 351 
  C_H (C_H C_E (C_H _ _)) (C_F (C_H _ _) (C_F _ _)) -> 352 
  C_H (C_H (C_F _ _) C_E) (C_F (C_H _ _) (C_F _ _)) -> 353 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F (C_H _ _) (C_F _ _)) -> 354 
  C_H (C_H (C_F _ _) C_G) (C_F (C_H _ _) (C_F _ _)) -> 355 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F (C_H _ _) (C_F _ _)) -> 356 
  C_H (C_H C_G C_E) (C_F (C_H _ _) (C_F _ _)) -> 357 
  C_H (C_H C_G (C_F _ _)) (C_F (C_H _ _) (C_F _ _)) -> 358 
  C_H (C_H C_G C_G) (C_F (C_H _ _) (C_F _ _)) -> 359 
  C_H (C_H C_G (C_H _ _)) (C_F (C_H _ _) (C_F _ _)) -> 360 
  C_H (C_H (C_H _ _) C_E) (C_F (C_H _ _) (C_F _ _)) -> 361 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F (C_H _ _) (C_F _ _)) -> 362 
  C_H (C_H (C_H _ _) C_G) (C_F (C_H _ _) (C_F _ _)) -> 363 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F (C_H _ _) (C_F _ _)) -> 364 
  C_H C_E (C_F (C_H _ _) C_G) -> 365 
  C_H (C_F _ C_E) (C_F (C_H _ _) C_G) -> 366 
  C_H (C_F _ (C_F _ _)) (C_F (C_H _ _) C_G) -> 367 
  C_H (C_F _ C_G) (C_F (C_H _ _) C_G) -> 368 
  C_H (C_F _ (C_H _ _)) (C_F (C_H _ _) C_G) -> 369 
  C_H C_G (C_F (C_H _ _) C_G) -> 370 
  C_H (C_H C_E C_E) (C_F (C_H _ _) C_G) -> 371 
  C_H (C_H C_E (C_F _ _)) (C_F (C_H _ _) C_G) -> 372 
  C_H (C_H C_E C_G) (C_F (C_H _ _) C_G) -> 373 
  C_H (C_H C_E (C_H _ _)) (C_F (C_H _ _) C_G) -> 374 
  C_H (C_H (C_F _ _) C_E) (C_F (C_H _ _) C_G) -> 375 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F (C_H _ _) C_G) -> 376 
  C_H (C_H (C_F _ _) C_G) (C_F (C_H _ _) C_G) -> 377 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F (C_H _ _) C_G) -> 378 
  C_H (C_H C_G C_E) (C_F (C_H _ _) C_G) -> 379 
  C_H (C_H C_G (C_F _ _)) (C_F (C_H _ _) C_G) -> 380 
  C_H (C_H C_G C_G) (C_F (C_H _ _) C_G) -> 381 
  C_H (C_H C_G (C_H _ _)) (C_F (C_H _ _) C_G) -> 382 
  C_H (C_H (C_H _ _) C_E) (C_F (C_H _ _) C_G) -> 383 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F (C_H _ _) C_G) -> 384 
  C_H (C_H (C_H _ _) C_G) (C_F (C_H _ _) C_G) -> 385 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F (C_H _ _) C_G) -> 386 
  C_H C_E (C_F (C_H _ _) (C_H _ _)) -> 387 
  C_H (C_F _ C_E) (C_F (C_H _ _) (C_H _ _)) -> 388 
  C_H (C_F _ (C_F _ _)) (C_F (C_H _ _) (C_H _ _)) -> 389 
  C_H (C_F _ C_G) (C_F (C_H _ _) (C_H _ _)) -> 390 
  C_H (C_F _ (C_H _ _)) (C_F (C_H _ _) (C_H _ _)) -> 391 
  C_H C_G (C_F (C_H _ _) (C_H _ _)) -> 392 
  C_H (C_H C_E C_E) (C_F (C_H _ _) (C_H _ _)) -> 393 
  C_H (C_H C_E (C_F _ _)) (C_F (C_H _ _) (C_H _ _)) -> 394 
  C_H (C_H C_E C_G) (C_F (C_H _ _) (C_H _ _)) -> 395 
  C_H (C_H C_E (C_H _ _)) (C_F (C_H _ _) (C_H _ _)) -> 396 
  C_H (C_H (C_F _ _) C_E) (C_F (C_H _ _) (C_H _ _)) -> 397 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_F (C_H _ _) (C_H _ _)) -> 398 
  C_H (C_H (C_F _ _) C_G) (C_F (C_H _ _) (C_H _ _)) -> 399 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_F (C_H _ _) (C_H _ _)) -> 400 
  C_H (C_H C_G C_E) (C_F (C_H _ _) (C_H _ _)) -> 401 
  C_H (C_H C_G (C_F _ _)) (C_F (C_H _ _) (C_H _ _)) -> 402 
  C_H (C_H C_G C_G) (C_F (C_H _ _) (C_H _ _)) -> 403 
  C_H (C_H C_G (C_H _ _)) (C_F (C_H _ _) (C_H _ _)) -> 404 
  C_H (C_H (C_H _ _) C_E) (C_F (C_H _ _) (C_H _ _)) -> 405 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_F (C_H _ _) (C_H _ _)) -> 406 
  C_H (C_H (C_H _ _) C_G) (C_F (C_H _ _) (C_H _ _)) -> 407 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_F (C_H _ _) (C_H _ _)) -> 408 
  C_H C_E C_G -> 409 
  C_H (C_F _ C_E) C_G -> 410 
  C_H (C_F _ (C_F _ _)) C_G -> 411 
  C_H (C_F _ C_G) C_G -> 412 
  C_H (C_F _ (C_H _ _)) C_G -> 413 
  C_H C_G C_G -> 414 
  C_H (C_H C_E C_E) C_G -> 415 
  C_H (C_H C_E (C_F _ _)) C_G -> 416 
  C_H (C_H C_E C_G) C_G -> 417 
  C_H (C_H C_E (C_H _ _)) C_G -> 418 
  C_H (C_H (C_F _ _) C_E) C_G -> 419 
  C_H (C_H (C_F _ _) (C_F _ _)) C_G -> 420 
  C_H (C_H (C_F _ _) C_G) C_G -> 421 
  C_H (C_H (C_F _ _) (C_H _ _)) C_G -> 422 
  C_H (C_H C_G C_E) C_G -> 423 
  C_H (C_H C_G (C_F _ _)) C_G -> 424 
  C_H (C_H C_G C_G) C_G -> 425 
  C_H (C_H C_G (C_H _ _)) C_G -> 426 
  C_H (C_H (C_H _ _) C_E) C_G -> 427 
  C_H (C_H (C_H _ _) (C_F _ _)) C_G -> 428 
  C_H (C_H (C_H _ _) C_G) C_G -> 429 
  C_H (C_H (C_H _ _) (C_H _ _)) C_G -> 430 
  C_H C_E (C_H C_E C_E) -> 431 
  C_H (C_F _ C_E) (C_H C_E C_E) -> 432 
  C_H (C_F _ (C_F _ _)) (C_H C_E C_E) -> 433 
  C_H (C_F _ C_G) (C_H C_E C_E) -> 434 
  C_H (C_F _ (C_H _ _)) (C_H C_E C_E) -> 435 
  C_H C_G (C_H C_E C_E) -> 436 
  C_H (C_H C_E C_E) (C_H C_E C_E) -> 437 
  C_H (C_H C_E (C_F _ _)) (C_H C_E C_E) -> 438 
  C_H (C_H C_E C_G) (C_H C_E C_E) -> 439 
  C_H (C_H C_E (C_H _ _)) (C_H C_E C_E) -> 440 
  C_H (C_H (C_F _ _) C_E) (C_H C_E C_E) -> 441 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H C_E C_E) -> 442 
  C_H (C_H (C_F _ _) C_G) (C_H C_E C_E) -> 443 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H C_E C_E) -> 444 
  C_H (C_H C_G C_E) (C_H C_E C_E) -> 445 
  C_H (C_H C_G (C_F _ _)) (C_H C_E C_E) -> 446 
  C_H (C_H C_G C_G) (C_H C_E C_E) -> 447 
  C_H (C_H C_G (C_H _ _)) (C_H C_E C_E) -> 448 
  C_H (C_H (C_H _ _) C_E) (C_H C_E C_E) -> 449 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H C_E C_E) -> 450 
  C_H (C_H (C_H _ _) C_G) (C_H C_E C_E) -> 451 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H C_E C_E) -> 452 
  C_H C_E (C_H C_E (C_F _ _)) -> 453 
  C_H (C_F _ C_E) (C_H C_E (C_F _ _)) -> 454 
  C_H (C_F _ (C_F _ _)) (C_H C_E (C_F _ _)) -> 455 
  C_H (C_F _ C_G) (C_H C_E (C_F _ _)) -> 456 
  C_H (C_F _ (C_H _ _)) (C_H C_E (C_F _ _)) -> 457 
  C_H C_G (C_H C_E (C_F _ _)) -> 458 
  C_H (C_H C_E C_E) (C_H C_E (C_F _ _)) -> 459 
  C_H (C_H C_E (C_F _ _)) (C_H C_E (C_F _ _)) -> 460 
  C_H (C_H C_E C_G) (C_H C_E (C_F _ _)) -> 461 
  C_H (C_H C_E (C_H _ _)) (C_H C_E (C_F _ _)) -> 462 
  C_H (C_H (C_F _ _) C_E) (C_H C_E (C_F _ _)) -> 463 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H C_E (C_F _ _)) -> 464 
  C_H (C_H (C_F _ _) C_G) (C_H C_E (C_F _ _)) -> 465 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H C_E (C_F _ _)) -> 466 
  C_H (C_H C_G C_E) (C_H C_E (C_F _ _)) -> 467 
  C_H (C_H C_G (C_F _ _)) (C_H C_E (C_F _ _)) -> 468 
  C_H (C_H C_G C_G) (C_H C_E (C_F _ _)) -> 469 
  C_H (C_H C_G (C_H _ _)) (C_H C_E (C_F _ _)) -> 470 
  C_H (C_H (C_H _ _) C_E) (C_H C_E (C_F _ _)) -> 471 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H C_E (C_F _ _)) -> 472 
  C_H (C_H (C_H _ _) C_G) (C_H C_E (C_F _ _)) -> 473 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H C_E (C_F _ _)) -> 474 
  C_H C_E (C_H C_E C_G) -> 475 
  C_H (C_F _ C_E) (C_H C_E C_G) -> 476 
  C_H (C_F _ (C_F _ _)) (C_H C_E C_G) -> 477 
  C_H (C_F _ C_G) (C_H C_E C_G) -> 478 
  C_H (C_F _ (C_H _ _)) (C_H C_E C_G) -> 479 
  C_H C_G (C_H C_E C_G) -> 480 
  C_H (C_H C_E C_E) (C_H C_E C_G) -> 481 
  C_H (C_H C_E (C_F _ _)) (C_H C_E C_G) -> 482 
  C_H (C_H C_E C_G) (C_H C_E C_G) -> 483 
  C_H (C_H C_E (C_H _ _)) (C_H C_E C_G) -> 484 
  C_H (C_H (C_F _ _) C_E) (C_H C_E C_G) -> 485 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H C_E C_G) -> 486 
  C_H (C_H (C_F _ _) C_G) (C_H C_E C_G) -> 487 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H C_E C_G) -> 488 
  C_H (C_H C_G C_E) (C_H C_E C_G) -> 489 
  C_H (C_H C_G (C_F _ _)) (C_H C_E C_G) -> 490 
  C_H (C_H C_G C_G) (C_H C_E C_G) -> 491 
  C_H (C_H C_G (C_H _ _)) (C_H C_E C_G) -> 492 
  C_H (C_H (C_H _ _) C_E) (C_H C_E C_G) -> 493 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H C_E C_G) -> 494 
  C_H (C_H (C_H _ _) C_G) (C_H C_E C_G) -> 495 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H C_E C_G) -> 496 
  C_H C_E (C_H C_E (C_H _ _)) -> 497 
  C_H (C_F _ C_E) (C_H C_E (C_H _ _)) -> 498 
  C_H (C_F _ (C_F _ _)) (C_H C_E (C_H _ _)) -> 499 
  C_H (C_F _ C_G) (C_H C_E (C_H _ _)) -> 500 
  C_H (C_F _ (C_H _ _)) (C_H C_E (C_H _ _)) -> 501 
  C_H C_G (C_H C_E (C_H _ _)) -> 502 
  C_H (C_H C_E C_E) (C_H C_E (C_H _ _)) -> 503 
  C_H (C_H C_E (C_F _ _)) (C_H C_E (C_H _ _)) -> 504 
  C_H (C_H C_E C_G) (C_H C_E (C_H _ _)) -> 505 
  C_H (C_H C_E (C_H _ _)) (C_H C_E (C_H _ _)) -> 506 
  C_H (C_H (C_F _ _) C_E) (C_H C_E (C_H _ _)) -> 507 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H C_E (C_H _ _)) -> 508 
  C_H (C_H (C_F _ _) C_G) (C_H C_E (C_H _ _)) -> 509 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H C_E (C_H _ _)) -> 510 
  C_H (C_H C_G C_E) (C_H C_E (C_H _ _)) -> 511 
  C_H (C_H C_G (C_F _ _)) (C_H C_E (C_H _ _)) -> 512 
  C_H (C_H C_G C_G) (C_H C_E (C_H _ _)) -> 513 
  C_H (C_H C_G (C_H _ _)) (C_H C_E (C_H _ _)) -> 514 
  C_H (C_H (C_H _ _) C_E) (C_H C_E (C_H _ _)) -> 515 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H C_E (C_H _ _)) -> 516 
  C_H (C_H (C_H _ _) C_G) (C_H C_E (C_H _ _)) -> 517 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H C_E (C_H _ _)) -> 518 
  C_H C_E (C_H (C_F _ _) C_E) -> 519 
  C_H (C_F _ C_E) (C_H (C_F _ _) C_E) -> 520 
  C_H (C_F _ (C_F _ _)) (C_H (C_F _ _) C_E) -> 521 
  C_H (C_F _ C_G) (C_H (C_F _ _) C_E) -> 522 
  C_H (C_F _ (C_H _ _)) (C_H (C_F _ _) C_E) -> 523 
  C_H C_G (C_H (C_F _ _) C_E) -> 524 
  C_H (C_H C_E C_E) (C_H (C_F _ _) C_E) -> 525 
  C_H (C_H C_E (C_F _ _)) (C_H (C_F _ _) C_E) -> 526 
  C_H (C_H C_E C_G) (C_H (C_F _ _) C_E) -> 527 
  C_H (C_H C_E (C_H _ _)) (C_H (C_F _ _) C_E) -> 528 
  C_H (C_H (C_F _ _) C_E) (C_H (C_F _ _) C_E) -> 529 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H (C_F _ _) C_E) -> 530 
  C_H (C_H (C_F _ _) C_G) (C_H (C_F _ _) C_E) -> 531 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H (C_F _ _) C_E) -> 532 
  C_H (C_H C_G C_E) (C_H (C_F _ _) C_E) -> 533 
  C_H (C_H C_G (C_F _ _)) (C_H (C_F _ _) C_E) -> 534 
  C_H (C_H C_G C_G) (C_H (C_F _ _) C_E) -> 535 
  C_H (C_H C_G (C_H _ _)) (C_H (C_F _ _) C_E) -> 536 
  C_H (C_H (C_H _ _) C_E) (C_H (C_F _ _) C_E) -> 537 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H (C_F _ _) C_E) -> 538 
  C_H (C_H (C_H _ _) C_G) (C_H (C_F _ _) C_E) -> 539 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H (C_F _ _) C_E) -> 540 
  C_H C_E (C_H (C_F _ _) (C_F _ _)) -> 541 
  C_H (C_F _ C_E) (C_H (C_F _ _) (C_F _ _)) -> 542 
  C_H (C_F _ (C_F _ _)) (C_H (C_F _ _) (C_F _ _)) -> 543 
  C_H (C_F _ C_G) (C_H (C_F _ _) (C_F _ _)) -> 544 
  C_H (C_F _ (C_H _ _)) (C_H (C_F _ _) (C_F _ _)) -> 545 
  C_H C_G (C_H (C_F _ _) (C_F _ _)) -> 546 
  C_H (C_H C_E C_E) (C_H (C_F _ _) (C_F _ _)) -> 547 
  C_H (C_H C_E (C_F _ _)) (C_H (C_F _ _) (C_F _ _)) -> 548 
  C_H (C_H C_E C_G) (C_H (C_F _ _) (C_F _ _)) -> 549 
  C_H (C_H C_E (C_H _ _)) (C_H (C_F _ _) (C_F _ _)) -> 550 
  C_H (C_H (C_F _ _) C_E) (C_H (C_F _ _) (C_F _ _)) -> 551 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H (C_F _ _) (C_F _ _)) -> 552 
  C_H (C_H (C_F _ _) C_G) (C_H (C_F _ _) (C_F _ _)) -> 553 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H (C_F _ _) (C_F _ _)) -> 554 
  C_H (C_H C_G C_E) (C_H (C_F _ _) (C_F _ _)) -> 555 
  C_H (C_H C_G (C_F _ _)) (C_H (C_F _ _) (C_F _ _)) -> 556 
  C_H (C_H C_G C_G) (C_H (C_F _ _) (C_F _ _)) -> 557 
  C_H (C_H C_G (C_H _ _)) (C_H (C_F _ _) (C_F _ _)) -> 558 
  C_H (C_H (C_H _ _) C_E) (C_H (C_F _ _) (C_F _ _)) -> 559 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H (C_F _ _) (C_F _ _)) -> 560 
  C_H (C_H (C_H _ _) C_G) (C_H (C_F _ _) (C_F _ _)) -> 561 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H (C_F _ _) (C_F _ _)) -> 562 
  C_H C_E (C_H (C_F _ _) C_G) -> 563 
  C_H (C_F _ C_E) (C_H (C_F _ _) C_G) -> 564 
  C_H (C_F _ (C_F _ _)) (C_H (C_F _ _) C_G) -> 565 
  C_H (C_F _ C_G) (C_H (C_F _ _) C_G) -> 566 
  C_H (C_F _ (C_H _ _)) (C_H (C_F _ _) C_G) -> 567 
  C_H C_G (C_H (C_F _ _) C_G) -> 568 
  C_H (C_H C_E C_E) (C_H (C_F _ _) C_G) -> 569 
  C_H (C_H C_E (C_F _ _)) (C_H (C_F _ _) C_G) -> 570 
  C_H (C_H C_E C_G) (C_H (C_F _ _) C_G) -> 571 
  C_H (C_H C_E (C_H _ _)) (C_H (C_F _ _) C_G) -> 572 
  C_H (C_H (C_F _ _) C_E) (C_H (C_F _ _) C_G) -> 573 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H (C_F _ _) C_G) -> 574 
  C_H (C_H (C_F _ _) C_G) (C_H (C_F _ _) C_G) -> 575 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H (C_F _ _) C_G) -> 576 
  C_H (C_H C_G C_E) (C_H (C_F _ _) C_G) -> 577 
  C_H (C_H C_G (C_F _ _)) (C_H (C_F _ _) C_G) -> 578 
  C_H (C_H C_G C_G) (C_H (C_F _ _) C_G) -> 579 
  C_H (C_H C_G (C_H _ _)) (C_H (C_F _ _) C_G) -> 580 
  C_H (C_H (C_H _ _) C_E) (C_H (C_F _ _) C_G) -> 581 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H (C_F _ _) C_G) -> 582 
  C_H (C_H (C_H _ _) C_G) (C_H (C_F _ _) C_G) -> 583 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H (C_F _ _) C_G) -> 584 
  C_H C_E (C_H (C_F _ _) (C_H _ _)) -> 585 
  C_H (C_F _ C_E) (C_H (C_F _ _) (C_H _ _)) -> 586 
  C_H (C_F _ (C_F _ _)) (C_H (C_F _ _) (C_H _ _)) -> 587 
  C_H (C_F _ C_G) (C_H (C_F _ _) (C_H _ _)) -> 588 
  C_H (C_F _ (C_H _ _)) (C_H (C_F _ _) (C_H _ _)) -> 589 
  C_H C_G (C_H (C_F _ _) (C_H _ _)) -> 590 
  C_H (C_H C_E C_E) (C_H (C_F _ _) (C_H _ _)) -> 591 
  C_H (C_H C_E (C_F _ _)) (C_H (C_F _ _) (C_H _ _)) -> 592 
  C_H (C_H C_E C_G) (C_H (C_F _ _) (C_H _ _)) -> 593 
  C_H (C_H C_E (C_H _ _)) (C_H (C_F _ _) (C_H _ _)) -> 594 
  C_H (C_H (C_F _ _) C_E) (C_H (C_F _ _) (C_H _ _)) -> 595 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H (C_F _ _) (C_H _ _)) -> 596 
  C_H (C_H (C_F _ _) C_G) (C_H (C_F _ _) (C_H _ _)) -> 597 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H (C_F _ _) (C_H _ _)) -> 598 
  C_H (C_H C_G C_E) (C_H (C_F _ _) (C_H _ _)) -> 599 
  C_H (C_H C_G (C_F _ _)) (C_H (C_F _ _) (C_H _ _)) -> 600 
  C_H (C_H C_G C_G) (C_H (C_F _ _) (C_H _ _)) -> 601 
  C_H (C_H C_G (C_H _ _)) (C_H (C_F _ _) (C_H _ _)) -> 602 
  C_H (C_H (C_H _ _) C_E) (C_H (C_F _ _) (C_H _ _)) -> 603 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H (C_F _ _) (C_H _ _)) -> 604 
  C_H (C_H (C_H _ _) C_G) (C_H (C_F _ _) (C_H _ _)) -> 605 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H (C_F _ _) (C_H _ _)) -> 606 
  C_H C_E (C_H C_G C_E) -> 607 
  C_H (C_F _ C_E) (C_H C_G C_E) -> 608 
  C_H (C_F _ (C_F _ _)) (C_H C_G C_E) -> 609 
  C_H (C_F _ C_G) (C_H C_G C_E) -> 610 
  C_H (C_F _ (C_H _ _)) (C_H C_G C_E) -> 611 
  C_H C_G (C_H C_G C_E) -> 612 
  C_H (C_H C_E C_E) (C_H C_G C_E) -> 613 
  C_H (C_H C_E (C_F _ _)) (C_H C_G C_E) -> 614 
  C_H (C_H C_E C_G) (C_H C_G C_E) -> 615 
  C_H (C_H C_E (C_H _ _)) (C_H C_G C_E) -> 616 
  C_H (C_H (C_F _ _) C_E) (C_H C_G C_E) -> 617 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H C_G C_E) -> 618 
  C_H (C_H (C_F _ _) C_G) (C_H C_G C_E) -> 619 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H C_G C_E) -> 620 
  C_H (C_H C_G C_E) (C_H C_G C_E) -> 621 
  C_H (C_H C_G (C_F _ _)) (C_H C_G C_E) -> 622 
  C_H (C_H C_G C_G) (C_H C_G C_E) -> 623 
  C_H (C_H C_G (C_H _ _)) (C_H C_G C_E) -> 624 
  C_H (C_H (C_H _ _) C_E) (C_H C_G C_E) -> 625 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H C_G C_E) -> 626 
  C_H (C_H (C_H _ _) C_G) (C_H C_G C_E) -> 627 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H C_G C_E) -> 628 
  C_H C_E (C_H C_G (C_F _ _)) -> 629 
  C_H (C_F _ C_E) (C_H C_G (C_F _ _)) -> 630 
  C_H (C_F _ (C_F _ _)) (C_H C_G (C_F _ _)) -> 631 
  C_H (C_F _ C_G) (C_H C_G (C_F _ _)) -> 632 
  C_H (C_F _ (C_H _ _)) (C_H C_G (C_F _ _)) -> 633 
  C_H C_G (C_H C_G (C_F _ _)) -> 634 
  C_H (C_H C_E C_E) (C_H C_G (C_F _ _)) -> 635 
  C_H (C_H C_E (C_F _ _)) (C_H C_G (C_F _ _)) -> 636 
  C_H (C_H C_E C_G) (C_H C_G (C_F _ _)) -> 637 
  C_H (C_H C_E (C_H _ _)) (C_H C_G (C_F _ _)) -> 638 
  C_H (C_H (C_F _ _) C_E) (C_H C_G (C_F _ _)) -> 639 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H C_G (C_F _ _)) -> 640 
  C_H (C_H (C_F _ _) C_G) (C_H C_G (C_F _ _)) -> 641 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H C_G (C_F _ _)) -> 642 
  C_H (C_H C_G C_E) (C_H C_G (C_F _ _)) -> 643 
  C_H (C_H C_G (C_F _ _)) (C_H C_G (C_F _ _)) -> 644 
  C_H (C_H C_G C_G) (C_H C_G (C_F _ _)) -> 645 
  C_H (C_H C_G (C_H _ _)) (C_H C_G (C_F _ _)) -> 646 
  C_H (C_H (C_H _ _) C_E) (C_H C_G (C_F _ _)) -> 647 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H C_G (C_F _ _)) -> 648 
  C_H (C_H (C_H _ _) C_G) (C_H C_G (C_F _ _)) -> 649 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H C_G (C_F _ _)) -> 650 
  C_H C_E (C_H C_G C_G) -> 651 
  C_H (C_F _ C_E) (C_H C_G C_G) -> 652 
  C_H (C_F _ (C_F _ _)) (C_H C_G C_G) -> 653 
  C_H (C_F _ C_G) (C_H C_G C_G) -> 654 
  C_H (C_F _ (C_H _ _)) (C_H C_G C_G) -> 655 
  C_H C_G (C_H C_G C_G) -> 656 
  C_H (C_H C_E C_E) (C_H C_G C_G) -> 657 
  C_H (C_H C_E (C_F _ _)) (C_H C_G C_G) -> 658 
  C_H (C_H C_E C_G) (C_H C_G C_G) -> 659 
  C_H (C_H C_E (C_H _ _)) (C_H C_G C_G) -> 660 
  C_H (C_H (C_F _ _) C_E) (C_H C_G C_G) -> 661 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H C_G C_G) -> 662 
  C_H (C_H (C_F _ _) C_G) (C_H C_G C_G) -> 663 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H C_G C_G) -> 664 
  C_H (C_H C_G C_E) (C_H C_G C_G) -> 665 
  C_H (C_H C_G (C_F _ _)) (C_H C_G C_G) -> 666 
  C_H (C_H C_G C_G) (C_H C_G C_G) -> 667 
  C_H (C_H C_G (C_H _ _)) (C_H C_G C_G) -> 668 
  C_H (C_H (C_H _ _) C_E) (C_H C_G C_G) -> 669 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H C_G C_G) -> 670 
  C_H (C_H (C_H _ _) C_G) (C_H C_G C_G) -> 671 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H C_G C_G) -> 672 
  C_H C_E (C_H C_G (C_H _ _)) -> 673 
  C_H (C_F _ C_E) (C_H C_G (C_H _ _)) -> 674 
  C_H (C_F _ (C_F _ _)) (C_H C_G (C_H _ _)) -> 675 
  C_H (C_F _ C_G) (C_H C_G (C_H _ _)) -> 676 
  C_H (C_F _ (C_H _ _)) (C_H C_G (C_H _ _)) -> 677 
  C_H C_G (C_H C_G (C_H _ _)) -> 678 
  C_H (C_H C_E C_E) (C_H C_G (C_H _ _)) -> 679 
  C_H (C_H C_E (C_F _ _)) (C_H C_G (C_H _ _)) -> 680 
  C_H (C_H C_E C_G) (C_H C_G (C_H _ _)) -> 681 
  C_H (C_H C_E (C_H _ _)) (C_H C_G (C_H _ _)) -> 682 
  C_H (C_H (C_F _ _) C_E) (C_H C_G (C_H _ _)) -> 683 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H C_G (C_H _ _)) -> 684 
  C_H (C_H (C_F _ _) C_G) (C_H C_G (C_H _ _)) -> 685 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H C_G (C_H _ _)) -> 686 
  C_H (C_H C_G C_E) (C_H C_G (C_H _ _)) -> 687 
  C_H (C_H C_G (C_F _ _)) (C_H C_G (C_H _ _)) -> 688 
  C_H (C_H C_G C_G) (C_H C_G (C_H _ _)) -> 689 
  C_H (C_H C_G (C_H _ _)) (C_H C_G (C_H _ _)) -> 690 
  C_H (C_H (C_H _ _) C_E) (C_H C_G (C_H _ _)) -> 691 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H C_G (C_H _ _)) -> 692 
  C_H (C_H (C_H _ _) C_G) (C_H C_G (C_H _ _)) -> 693 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H C_G (C_H _ _)) -> 694 
  C_H C_E (C_H (C_H _ _) C_E) -> 695 
  C_H (C_F _ C_E) (C_H (C_H _ _) C_E) -> 696 
  C_H (C_F _ (C_F _ _)) (C_H (C_H _ _) C_E) -> 697 
  C_H (C_F _ C_G) (C_H (C_H _ _) C_E) -> 698 
  C_H (C_F _ (C_H _ _)) (C_H (C_H _ _) C_E) -> 699 
  C_H C_G (C_H (C_H _ _) C_E) -> 700 
  C_H (C_H C_E C_E) (C_H (C_H _ _) C_E) -> 701 
  C_H (C_H C_E (C_F _ _)) (C_H (C_H _ _) C_E) -> 702 
  C_H (C_H C_E C_G) (C_H (C_H _ _) C_E) -> 703 
  C_H (C_H C_E (C_H _ _)) (C_H (C_H _ _) C_E) -> 704 
  C_H (C_H (C_F _ _) C_E) (C_H (C_H _ _) C_E) -> 705 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H (C_H _ _) C_E) -> 706 
  C_H (C_H (C_F _ _) C_G) (C_H (C_H _ _) C_E) -> 707 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H (C_H _ _) C_E) -> 708 
  C_H (C_H C_G C_E) (C_H (C_H _ _) C_E) -> 709 
  C_H (C_H C_G (C_F _ _)) (C_H (C_H _ _) C_E) -> 710 
  C_H (C_H C_G C_G) (C_H (C_H _ _) C_E) -> 711 
  C_H (C_H C_G (C_H _ _)) (C_H (C_H _ _) C_E) -> 712 
  C_H (C_H (C_H _ _) C_E) (C_H (C_H _ _) C_E) -> 713 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H (C_H _ _) C_E) -> 714 
  C_H (C_H (C_H _ _) C_G) (C_H (C_H _ _) C_E) -> 715 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H (C_H _ _) C_E) -> 716 
  C_H C_E (C_H (C_H _ _) (C_F _ _)) -> 717 
  C_H (C_F _ C_E) (C_H (C_H _ _) (C_F _ _)) -> 718 
  C_H (C_F _ (C_F _ _)) (C_H (C_H _ _) (C_F _ _)) -> 719 
  C_H (C_F _ C_G) (C_H (C_H _ _) (C_F _ _)) -> 720 
  C_H (C_F _ (C_H _ _)) (C_H (C_H _ _) (C_F _ _)) -> 721 
  C_H C_G (C_H (C_H _ _) (C_F _ _)) -> 722 
  C_H (C_H C_E C_E) (C_H (C_H _ _) (C_F _ _)) -> 723 
  C_H (C_H C_E (C_F _ _)) (C_H (C_H _ _) (C_F _ _)) -> 724 
  C_H (C_H C_E C_G) (C_H (C_H _ _) (C_F _ _)) -> 725 
  C_H (C_H C_E (C_H _ _)) (C_H (C_H _ _) (C_F _ _)) -> 726 
  C_H (C_H (C_F _ _) C_E) (C_H (C_H _ _) (C_F _ _)) -> 727 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H (C_H _ _) (C_F _ _)) -> 728 
  C_H (C_H (C_F _ _) C_G) (C_H (C_H _ _) (C_F _ _)) -> 729 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H (C_H _ _) (C_F _ _)) -> 730 
  C_H (C_H C_G C_E) (C_H (C_H _ _) (C_F _ _)) -> 731 
  C_H (C_H C_G (C_F _ _)) (C_H (C_H _ _) (C_F _ _)) -> 732 
  C_H (C_H C_G C_G) (C_H (C_H _ _) (C_F _ _)) -> 733 
  C_H (C_H C_G (C_H _ _)) (C_H (C_H _ _) (C_F _ _)) -> 734 
  C_H (C_H (C_H _ _) C_E) (C_H (C_H _ _) (C_F _ _)) -> 735 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H (C_H _ _) (C_F _ _)) -> 736 
  C_H (C_H (C_H _ _) C_G) (C_H (C_H _ _) (C_F _ _)) -> 737 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H (C_H _ _) (C_F _ _)) -> 738 
  C_H C_E (C_H (C_H _ _) C_G) -> 739 
  C_H (C_F _ C_E) (C_H (C_H _ _) C_G) -> 740 
  C_H (C_F _ (C_F _ _)) (C_H (C_H _ _) C_G) -> 741 
  C_H (C_F _ C_G) (C_H (C_H _ _) C_G) -> 742 
  C_H (C_F _ (C_H _ _)) (C_H (C_H _ _) C_G) -> 743 
  C_H C_G (C_H (C_H _ _) C_G) -> 744 
  C_H (C_H C_E C_E) (C_H (C_H _ _) C_G) -> 745 
  C_H (C_H C_E (C_F _ _)) (C_H (C_H _ _) C_G) -> 746 
  C_H (C_H C_E C_G) (C_H (C_H _ _) C_G) -> 747 
  C_H (C_H C_E (C_H _ _)) (C_H (C_H _ _) C_G) -> 748 
  C_H (C_H (C_F _ _) C_E) (C_H (C_H _ _) C_G) -> 749 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H (C_H _ _) C_G) -> 750 
  C_H (C_H (C_F _ _) C_G) (C_H (C_H _ _) C_G) -> 751 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H (C_H _ _) C_G) -> 752 
  C_H (C_H C_G C_E) (C_H (C_H _ _) C_G) -> 753 
  C_H (C_H C_G (C_F _ _)) (C_H (C_H _ _) C_G) -> 754 
  C_H (C_H C_G C_G) (C_H (C_H _ _) C_G) -> 755 
  C_H (C_H C_G (C_H _ _)) (C_H (C_H _ _) C_G) -> 756 
  C_H (C_H (C_H _ _) C_E) (C_H (C_H _ _) C_G) -> 757 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H (C_H _ _) C_G) -> 758 
  C_H (C_H (C_H _ _) C_G) (C_H (C_H _ _) C_G) -> 759 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H (C_H _ _) C_G) -> 760 
  C_H C_E (C_H (C_H _ _) (C_H _ _)) -> 761 
  C_H (C_F _ C_E) (C_H (C_H _ _) (C_H _ _)) -> 762 
  C_H (C_F _ (C_F _ _)) (C_H (C_H _ _) (C_H _ _)) -> 763 
  C_H (C_F _ C_G) (C_H (C_H _ _) (C_H _ _)) -> 764 
  C_H (C_F _ (C_H _ _)) (C_H (C_H _ _) (C_H _ _)) -> 765 
  C_H C_G (C_H (C_H _ _) (C_H _ _)) -> 766 
  C_H (C_H C_E C_E) (C_H (C_H _ _) (C_H _ _)) -> 767 
  C_H (C_H C_E (C_F _ _)) (C_H (C_H _ _) (C_H _ _)) -> 768 
  C_H (C_H C_E C_G) (C_H (C_H _ _) (C_H _ _)) -> 769 
  C_H (C_H C_E (C_H _ _)) (C_H (C_H _ _) (C_H _ _)) -> 770 
  C_H (C_H (C_F _ _) C_E) (C_H (C_H _ _) (C_H _ _)) -> 771 
  C_H (C_H (C_F _ _) (C_F _ _)) (C_H (C_H _ _) (C_H _ _)) -> 772 
  C_H (C_H (C_F _ _) C_G) (C_H (C_H _ _) (C_H _ _)) -> 773 
  C_H (C_H (C_F _ _) (C_H _ _)) (C_H (C_H _ _) (C_H _ _)) -> 774 
  C_H (C_H C_G C_E) (C_H (C_H _ _) (C_H _ _)) -> 775 
  C_H (C_H C_G (C_F _ _)) (C_H (C_H _ _) (C_H _ _)) -> 776 
  C_H (C_H C_G C_G) (C_H (C_H _ _) (C_H _ _)) -> 777 
  C_H (C_H C_G (C_H _ _)) (C_H (C_H _ _) (C_H _ _)) -> 778 
  C_H (C_H (C_H _ _) C_E) (C_H (C_H _ _) (C_H _ _)) -> 779 
  C_H (C_H (C_H _ _) (C_F _ _)) (C_H (C_H _ _) (C_H _ _)) -> 780 
  C_H (C_H (C_H _ _) C_G) (C_H (C_H _ _) (C_H _ _)) -> 781 
  C_H (C_H (C_H _ _) (C_H _ _)) (C_H (C_H _ _) (C_H _ _)) -> 782 
