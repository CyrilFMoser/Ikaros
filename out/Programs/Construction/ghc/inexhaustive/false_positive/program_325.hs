module Program_13 () where 

 main = print $ show v_b
data B_A a b = C_A b | C_B | C_C (B_A a b) (B_A a Int) | C_D | C_E (B_A a a) (B_A b b)

v_a :: B_A Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B -> 1 
  C_C (C_A _) (C_A _) -> 2 
  C_C (C_A _) (C_B) -> 3 
  C_C (C_A _) (C_C _ (C_A _)) -> 4 
  C_C (C_A _) (C_C _ (C_B)) -> 5 
  C_C (C_A _) (C_C _ (C_C _ _)) -> 6 
  C_C (C_A _) (C_C _ (C_D)) -> 7 
  C_C (C_A _) (C_C _ (C_E _ _)) -> 8 
  C_C (C_A _) (C_D) -> 9 
  C_C (C_A _) (C_E (C_A _) _) -> 10 
  C_C (C_A _) (C_E (C_B) _) -> 11 
  C_C (C_A _) (C_E (C_C _ _) _) -> 12 
  C_C (C_A _) (C_E (C_D) _) -> 13 
  C_C (C_A _) (C_E (C_E _ _) _) -> 14 
  C_C (C_B) (C_A _) -> 15 
  C_C (C_B) (C_B) -> 16 
  C_C (C_B) (C_C _ (C_A _)) -> 17 
  C_C (C_B) (C_C _ (C_B)) -> 18 
  C_C (C_B) (C_C _ (C_C _ _)) -> 19 
  C_C (C_B) (C_C _ (C_D)) -> 20 
  C_C (C_B) (C_C _ (C_E _ _)) -> 21 
  C_C (C_B) (C_D) -> 22 
  C_C (C_B) (C_E (C_A _) _) -> 23 
  C_C (C_B) (C_E (C_B) _) -> 24 
  C_C (C_B) (C_E (C_C _ _) _) -> 25 
  C_C (C_B) (C_E (C_D) _) -> 26 
  C_C (C_B) (C_E (C_E _ _) _) -> 27 
  C_C (C_C (C_A _) (C_A _)) (C_A _) -> 28 
  C_C (C_C (C_A _) (C_A _)) (C_B) -> 29 
  C_C (C_C (C_A _) (C_A _)) (C_C _ (C_A _)) -> 30 
  C_C (C_C (C_A _) (C_A _)) (C_C _ (C_B)) -> 31 
  C_C (C_C (C_A _) (C_A _)) (C_C _ (C_C _ _)) -> 32 
  C_C (C_C (C_A _) (C_A _)) (C_C _ (C_D)) -> 33 
  C_C (C_C (C_A _) (C_A _)) (C_C _ (C_E _ _)) -> 34 
  C_C (C_C (C_A _) (C_A _)) (C_D) -> 35 
  C_C (C_C (C_A _) (C_A _)) (C_E (C_A _) _) -> 36 
  C_C (C_C (C_A _) (C_A _)) (C_E (C_B) _) -> 37 
  C_C (C_C (C_A _) (C_A _)) (C_E (C_C _ _) _) -> 38 
  C_C (C_C (C_A _) (C_A _)) (C_E (C_D) _) -> 39 
  C_C (C_C (C_A _) (C_A _)) (C_E (C_E _ _) _) -> 40 
  C_C (C_C (C_B) (C_A _)) (C_A _) -> 41 
  C_C (C_C (C_B) (C_A _)) (C_B) -> 42 
  C_C (C_C (C_B) (C_A _)) (C_C _ (C_A _)) -> 43 
  C_C (C_C (C_B) (C_A _)) (C_C _ (C_B)) -> 44 
  C_C (C_C (C_B) (C_A _)) (C_C _ (C_C _ _)) -> 45 
  C_C (C_C (C_B) (C_A _)) (C_C _ (C_D)) -> 46 
  C_C (C_C (C_B) (C_A _)) (C_C _ (C_E _ _)) -> 47 
  C_C (C_C (C_B) (C_A _)) (C_D) -> 48 
  C_C (C_C (C_B) (C_A _)) (C_E (C_A _) _) -> 49 
  C_C (C_C (C_B) (C_A _)) (C_E (C_B) _) -> 50 
  C_C (C_C (C_B) (C_A _)) (C_E (C_C _ _) _) -> 51 
  C_C (C_C (C_B) (C_A _)) (C_E (C_D) _) -> 52 
  C_C (C_C (C_B) (C_A _)) (C_E (C_E _ _) _) -> 53 
  C_C (C_C (C_C _ _) (C_A _)) (C_A _) -> 54 
  C_C (C_C (C_C _ _) (C_A _)) (C_B) -> 55 
  C_C (C_C (C_C _ _) (C_A _)) (C_C _ (C_A _)) -> 56 
  C_C (C_C (C_C _ _) (C_A _)) (C_C _ (C_B)) -> 57 
  C_C (C_C (C_C _ _) (C_A _)) (C_C _ (C_C _ _)) -> 58 
  C_C (C_C (C_C _ _) (C_A _)) (C_C _ (C_D)) -> 59 
  C_C (C_C (C_C _ _) (C_A _)) (C_C _ (C_E _ _)) -> 60 
  C_C (C_C (C_C _ _) (C_A _)) (C_D) -> 61 
  C_C (C_C (C_C _ _) (C_A _)) (C_E (C_A _) _) -> 62 
  C_C (C_C (C_C _ _) (C_A _)) (C_E (C_B) _) -> 63 
  C_C (C_C (C_C _ _) (C_A _)) (C_E (C_C _ _) _) -> 64 
  C_C (C_C (C_C _ _) (C_A _)) (C_E (C_D) _) -> 65 
  C_C (C_C (C_C _ _) (C_A _)) (C_E (C_E _ _) _) -> 66 
  C_C (C_C (C_D) (C_A _)) (C_A _) -> 67 
  C_C (C_C (C_D) (C_A _)) (C_B) -> 68 
  C_C (C_C (C_D) (C_A _)) (C_C _ (C_A _)) -> 69 
  C_C (C_C (C_D) (C_A _)) (C_C _ (C_B)) -> 70 
  C_C (C_C (C_D) (C_A _)) (C_C _ (C_C _ _)) -> 71 
  C_C (C_C (C_D) (C_A _)) (C_C _ (C_D)) -> 72 
  C_C (C_C (C_D) (C_A _)) (C_C _ (C_E _ _)) -> 73 
  C_C (C_C (C_D) (C_A _)) (C_D) -> 74 
  C_C (C_C (C_D) (C_A _)) (C_E (C_A _) _) -> 75 
  C_C (C_C (C_D) (C_A _)) (C_E (C_B) _) -> 76 
  C_C (C_C (C_D) (C_A _)) (C_E (C_C _ _) _) -> 77 
  C_C (C_C (C_D) (C_A _)) (C_E (C_D) _) -> 78 
  C_C (C_C (C_D) (C_A _)) (C_E (C_E _ _) _) -> 79 
  C_C (C_C (C_E _ _) (C_A _)) (C_A _) -> 80 
  C_C (C_C (C_E _ _) (C_A _)) (C_B) -> 81 
  C_C (C_C (C_E _ _) (C_A _)) (C_C _ (C_A _)) -> 82 
  C_C (C_C (C_E _ _) (C_A _)) (C_C _ (C_B)) -> 83 
  C_C (C_C (C_E _ _) (C_A _)) (C_C _ (C_C _ _)) -> 84 
  C_C (C_C (C_E _ _) (C_A _)) (C_C _ (C_D)) -> 85 
  C_C (C_C (C_E _ _) (C_A _)) (C_C _ (C_E _ _)) -> 86 
  C_C (C_C (C_E _ _) (C_A _)) (C_D) -> 87 
  C_C (C_C (C_E _ _) (C_A _)) (C_E (C_A _) _) -> 88 
  C_C (C_C (C_E _ _) (C_A _)) (C_E (C_B) _) -> 89 
  C_C (C_C (C_E _ _) (C_A _)) (C_E (C_C _ _) _) -> 90 
  C_C (C_C (C_E _ _) (C_A _)) (C_E (C_D) _) -> 91 
  C_C (C_C (C_E _ _) (C_A _)) (C_E (C_E _ _) _) -> 92 
  C_C (C_C (C_A _) (C_B)) (C_A _) -> 93 
  C_C (C_C (C_A _) (C_B)) (C_B) -> 94 
  C_C (C_C (C_A _) (C_B)) (C_C _ (C_A _)) -> 95 
  C_C (C_C (C_A _) (C_B)) (C_C _ (C_B)) -> 96 
  C_C (C_C (C_A _) (C_B)) (C_C _ (C_C _ _)) -> 97 
  C_C (C_C (C_A _) (C_B)) (C_C _ (C_D)) -> 98 
  C_C (C_C (C_A _) (C_B)) (C_C _ (C_E _ _)) -> 99 
  C_C (C_C (C_A _) (C_B)) (C_D) -> 100 
  C_C (C_C (C_A _) (C_B)) (C_E (C_A _) _) -> 101 
  C_C (C_C (C_A _) (C_B)) (C_E (C_B) _) -> 102 
  C_C (C_C (C_A _) (C_B)) (C_E (C_C _ _) _) -> 103 
  C_C (C_C (C_A _) (C_B)) (C_E (C_D) _) -> 104 
  C_C (C_C (C_A _) (C_B)) (C_E (C_E _ _) _) -> 105 
  C_C (C_C (C_B) (C_B)) (C_A _) -> 106 
  C_C (C_C (C_B) (C_B)) (C_B) -> 107 
  C_C (C_C (C_B) (C_B)) (C_C _ (C_A _)) -> 108 
  C_C (C_C (C_B) (C_B)) (C_C _ (C_B)) -> 109 
  C_C (C_C (C_B) (C_B)) (C_C _ (C_C _ _)) -> 110 
  C_C (C_C (C_B) (C_B)) (C_C _ (C_D)) -> 111 
  C_C (C_C (C_B) (C_B)) (C_C _ (C_E _ _)) -> 112 
  C_C (C_C (C_B) (C_B)) (C_D) -> 113 
  C_C (C_C (C_B) (C_B)) (C_E (C_A _) _) -> 114 
  C_C (C_C (C_B) (C_B)) (C_E (C_B) _) -> 115 
  C_C (C_C (C_B) (C_B)) (C_E (C_C _ _) _) -> 116 
  C_C (C_C (C_B) (C_B)) (C_E (C_D) _) -> 117 
  C_C (C_C (C_B) (C_B)) (C_E (C_E _ _) _) -> 118 
  C_C (C_C (C_C _ _) (C_B)) (C_A _) -> 119 
  C_C (C_C (C_C _ _) (C_B)) (C_B) -> 120 
  C_C (C_C (C_C _ _) (C_B)) (C_C _ (C_A _)) -> 121 
  C_C (C_C (C_C _ _) (C_B)) (C_C _ (C_B)) -> 122 
  C_C (C_C (C_C _ _) (C_B)) (C_C _ (C_C _ _)) -> 123 
  C_C (C_C (C_C _ _) (C_B)) (C_C _ (C_D)) -> 124 
  C_C (C_C (C_C _ _) (C_B)) (C_C _ (C_E _ _)) -> 125 
  C_C (C_C (C_C _ _) (C_B)) (C_D) -> 126 
  C_C (C_C (C_C _ _) (C_B)) (C_E (C_A _) _) -> 127 
  C_C (C_C (C_C _ _) (C_B)) (C_E (C_B) _) -> 128 
  C_C (C_C (C_C _ _) (C_B)) (C_E (C_C _ _) _) -> 129 
  C_C (C_C (C_C _ _) (C_B)) (C_E (C_D) _) -> 130 
  C_C (C_C (C_C _ _) (C_B)) (C_E (C_E _ _) _) -> 131 
  C_C (C_C (C_D) (C_B)) (C_A _) -> 132 
  C_C (C_C (C_D) (C_B)) (C_B) -> 133 
  C_C (C_C (C_D) (C_B)) (C_C _ (C_A _)) -> 134 
  C_C (C_C (C_D) (C_B)) (C_C _ (C_B)) -> 135 
  C_C (C_C (C_D) (C_B)) (C_C _ (C_C _ _)) -> 136 
  C_C (C_C (C_D) (C_B)) (C_C _ (C_D)) -> 137 
  C_C (C_C (C_D) (C_B)) (C_C _ (C_E _ _)) -> 138 
  C_C (C_C (C_D) (C_B)) (C_D) -> 139 
  C_C (C_C (C_D) (C_B)) (C_E (C_A _) _) -> 140 
  C_C (C_C (C_D) (C_B)) (C_E (C_B) _) -> 141 
  C_C (C_C (C_D) (C_B)) (C_E (C_C _ _) _) -> 142 
  C_C (C_C (C_D) (C_B)) (C_E (C_D) _) -> 143 
  C_C (C_C (C_D) (C_B)) (C_E (C_E _ _) _) -> 144 
  C_C (C_C (C_E _ _) (C_B)) (C_A _) -> 145 
  C_C (C_C (C_E _ _) (C_B)) (C_B) -> 146 
  C_C (C_C (C_E _ _) (C_B)) (C_C _ (C_A _)) -> 147 
  C_C (C_C (C_E _ _) (C_B)) (C_C _ (C_B)) -> 148 
  C_C (C_C (C_E _ _) (C_B)) (C_C _ (C_C _ _)) -> 149 
  C_C (C_C (C_E _ _) (C_B)) (C_C _ (C_D)) -> 150 
  C_C (C_C (C_E _ _) (C_B)) (C_C _ (C_E _ _)) -> 151 
  C_C (C_C (C_E _ _) (C_B)) (C_D) -> 152 
  C_C (C_C (C_E _ _) (C_B)) (C_E (C_A _) _) -> 153 
  C_C (C_C (C_E _ _) (C_B)) (C_E (C_B) _) -> 154 
  C_C (C_C (C_E _ _) (C_B)) (C_E (C_C _ _) _) -> 155 
  C_C (C_C (C_E _ _) (C_B)) (C_E (C_D) _) -> 156 
  C_C (C_C (C_E _ _) (C_B)) (C_E (C_E _ _) _) -> 157 
  C_C (C_C (C_A _) (C_C _ _)) (C_A _) -> 158 
  C_C (C_C (C_A _) (C_C _ _)) (C_B) -> 159 
  C_C (C_C (C_A _) (C_C _ _)) (C_C _ (C_A _)) -> 160 
  C_C (C_C (C_A _) (C_C _ _)) (C_C _ (C_B)) -> 161 
  C_C (C_C (C_A _) (C_C _ _)) (C_C _ (C_C _ _)) -> 162 
  C_C (C_C (C_A _) (C_C _ _)) (C_C _ (C_D)) -> 163 
  C_C (C_C (C_A _) (C_C _ _)) (C_C _ (C_E _ _)) -> 164 
  C_C (C_C (C_A _) (C_C _ _)) (C_D) -> 165 
  C_C (C_C (C_A _) (C_C _ _)) (C_E (C_A _) _) -> 166 
  C_C (C_C (C_A _) (C_C _ _)) (C_E (C_B) _) -> 167 
  C_C (C_C (C_A _) (C_C _ _)) (C_E (C_C _ _) _) -> 168 
  C_C (C_C (C_A _) (C_C _ _)) (C_E (C_D) _) -> 169 
  C_C (C_C (C_A _) (C_C _ _)) (C_E (C_E _ _) _) -> 170 
  C_C (C_C (C_B) (C_C _ _)) (C_A _) -> 171 
  C_C (C_C (C_B) (C_C _ _)) (C_B) -> 172 
  C_C (C_C (C_B) (C_C _ _)) (C_C _ (C_A _)) -> 173 
  C_C (C_C (C_B) (C_C _ _)) (C_C _ (C_B)) -> 174 
  C_C (C_C (C_B) (C_C _ _)) (C_C _ (C_C _ _)) -> 175 
  C_C (C_C (C_B) (C_C _ _)) (C_C _ (C_D)) -> 176 
  C_C (C_C (C_B) (C_C _ _)) (C_C _ (C_E _ _)) -> 177 
  C_C (C_C (C_B) (C_C _ _)) (C_D) -> 178 
  C_C (C_C (C_B) (C_C _ _)) (C_E (C_A _) _) -> 179 
  C_C (C_C (C_B) (C_C _ _)) (C_E (C_B) _) -> 180 
  C_C (C_C (C_B) (C_C _ _)) (C_E (C_C _ _) _) -> 181 
  C_C (C_C (C_B) (C_C _ _)) (C_E (C_D) _) -> 182 
  C_C (C_C (C_B) (C_C _ _)) (C_E (C_E _ _) _) -> 183 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_A _) -> 184 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_B) -> 185 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ (C_B)) -> 186 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ (C_C _ _)) -> 187 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ (C_D)) -> 188 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ (C_E _ _)) -> 189 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_D) -> 190 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_E (C_A _) _) -> 191 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_E (C_B) _) -> 192 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_E (C_C _ _) _) -> 193 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_E (C_D) _) -> 194 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_E (C_E _ _) _) -> 195 
  C_C (C_C (C_D) (C_C _ _)) (C_A _) -> 196 
  C_C (C_C (C_D) (C_C _ _)) (C_B) -> 197 
  C_C (C_C (C_D) (C_C _ _)) (C_C _ (C_A _)) -> 198 
  C_C (C_C (C_D) (C_C _ _)) (C_C _ (C_B)) -> 199 
  C_C (C_C (C_D) (C_C _ _)) (C_C _ (C_C _ _)) -> 200 
  C_C (C_C (C_D) (C_C _ _)) (C_C _ (C_D)) -> 201 
  C_C (C_C (C_D) (C_C _ _)) (C_C _ (C_E _ _)) -> 202 
  C_C (C_C (C_D) (C_C _ _)) (C_D) -> 203 
  C_C (C_C (C_D) (C_C _ _)) (C_E (C_A _) _) -> 204 
  C_C (C_C (C_D) (C_C _ _)) (C_E (C_B) _) -> 205 
  C_C (C_C (C_D) (C_C _ _)) (C_E (C_C _ _) _) -> 206 
  C_C (C_C (C_D) (C_C _ _)) (C_E (C_D) _) -> 207 
  C_C (C_C (C_D) (C_C _ _)) (C_E (C_E _ _) _) -> 208 
  C_C (C_C (C_E _ _) (C_C _ _)) (C_A _) -> 209 
  C_C (C_C (C_E _ _) (C_C _ _)) (C_B) -> 210 
  C_C (C_C (C_E _ _) (C_C _ _)) (C_C _ (C_A _)) -> 211 
  C_C (C_C (C_E _ _) (C_C _ _)) (C_C _ (C_B)) -> 212 
  C_C (C_C (C_E _ _) (C_C _ _)) (C_C _ (C_C _ _)) -> 213 
  C_C (C_C (C_E _ _) (C_C _ _)) (C_C _ (C_D)) -> 214 
  C_C (C_C (C_E _ _) (C_C _ _)) (C_C _ (C_E _ _)) -> 215 
  C_C (C_C (C_E _ _) (C_C _ _)) (C_D) -> 216 
  C_C (C_C (C_E _ _) (C_C _ _)) (C_E (C_A _) _) -> 217 
  C_C (C_C (C_E _ _) (C_C _ _)) (C_E (C_B) _) -> 218 
  C_C (C_C (C_E _ _) (C_C _ _)) (C_E (C_C _ _) _) -> 219 
  C_C (C_C (C_E _ _) (C_C _ _)) (C_E (C_D) _) -> 220 
  C_C (C_C (C_E _ _) (C_C _ _)) (C_E (C_E _ _) _) -> 221 
  C_C (C_C (C_A _) (C_D)) (C_A _) -> 222 
  C_C (C_C (C_A _) (C_D)) (C_B) -> 223 
  C_C (C_C (C_A _) (C_D)) (C_C _ (C_A _)) -> 224 
  C_C (C_C (C_A _) (C_D)) (C_C _ (C_B)) -> 225 
  C_C (C_C (C_A _) (C_D)) (C_C _ (C_C _ _)) -> 226 
  C_C (C_C (C_A _) (C_D)) (C_C _ (C_D)) -> 227 
  C_C (C_C (C_A _) (C_D)) (C_C _ (C_E _ _)) -> 228 
  C_C (C_C (C_A _) (C_D)) (C_D) -> 229 
  C_C (C_C (C_A _) (C_D)) (C_E (C_A _) _) -> 230 
  C_C (C_C (C_A _) (C_D)) (C_E (C_B) _) -> 231 
  C_C (C_C (C_A _) (C_D)) (C_E (C_C _ _) _) -> 232 
  C_C (C_C (C_A _) (C_D)) (C_E (C_D) _) -> 233 
  C_C (C_C (C_A _) (C_D)) (C_E (C_E _ _) _) -> 234 
  C_C (C_C (C_B) (C_D)) (C_A _) -> 235 
  C_C (C_C (C_B) (C_D)) (C_B) -> 236 
  C_C (C_C (C_B) (C_D)) (C_C _ (C_A _)) -> 237 
  C_C (C_C (C_B) (C_D)) (C_C _ (C_B)) -> 238 
  C_C (C_C (C_B) (C_D)) (C_C _ (C_C _ _)) -> 239 
  C_C (C_C (C_B) (C_D)) (C_C _ (C_D)) -> 240 
  C_C (C_C (C_B) (C_D)) (C_C _ (C_E _ _)) -> 241 
  C_C (C_C (C_B) (C_D)) (C_D) -> 242 
  C_C (C_C (C_B) (C_D)) (C_E (C_A _) _) -> 243 
  C_C (C_C (C_B) (C_D)) (C_E (C_B) _) -> 244 
  C_C (C_C (C_B) (C_D)) (C_E (C_C _ _) _) -> 245 
  C_C (C_C (C_B) (C_D)) (C_E (C_D) _) -> 246 
  C_C (C_C (C_B) (C_D)) (C_E (C_E _ _) _) -> 247 
  C_C (C_C (C_C _ _) (C_D)) (C_A _) -> 248 
  C_C (C_C (C_C _ _) (C_D)) (C_B) -> 249 
  C_C (C_C (C_C _ _) (C_D)) (C_C _ (C_A _)) -> 250 
  C_C (C_C (C_C _ _) (C_D)) (C_C _ (C_B)) -> 251 
  C_C (C_C (C_C _ _) (C_D)) (C_C _ (C_C _ _)) -> 252 
  C_C (C_C (C_C _ _) (C_D)) (C_C _ (C_D)) -> 253 
  C_C (C_C (C_C _ _) (C_D)) (C_C _ (C_E _ _)) -> 254 
  C_C (C_C (C_C _ _) (C_D)) (C_D) -> 255 
  C_C (C_C (C_C _ _) (C_D)) (C_E (C_A _) _) -> 256 
  C_C (C_C (C_C _ _) (C_D)) (C_E (C_B) _) -> 257 
  C_C (C_C (C_C _ _) (C_D)) (C_E (C_C _ _) _) -> 258 
  C_C (C_C (C_C _ _) (C_D)) (C_E (C_D) _) -> 259 
  C_C (C_C (C_C _ _) (C_D)) (C_E (C_E _ _) _) -> 260 
  C_C (C_C (C_D) (C_D)) (C_A _) -> 261 
  C_C (C_C (C_D) (C_D)) (C_B) -> 262 
  C_C (C_C (C_D) (C_D)) (C_C _ (C_A _)) -> 263 
  C_C (C_C (C_D) (C_D)) (C_C _ (C_B)) -> 264 
  C_C (C_C (C_D) (C_D)) (C_C _ (C_C _ _)) -> 265 
  C_C (C_C (C_D) (C_D)) (C_C _ (C_D)) -> 266 
  C_C (C_C (C_D) (C_D)) (C_C _ (C_E _ _)) -> 267 
  C_C (C_C (C_D) (C_D)) (C_D) -> 268 
  C_C (C_C (C_D) (C_D)) (C_E (C_A _) _) -> 269 
  C_C (C_C (C_D) (C_D)) (C_E (C_B) _) -> 270 
  C_C (C_C (C_D) (C_D)) (C_E (C_C _ _) _) -> 271 
  C_C (C_C (C_D) (C_D)) (C_E (C_D) _) -> 272 
  C_C (C_C (C_D) (C_D)) (C_E (C_E _ _) _) -> 273 
  C_C (C_C (C_E _ _) (C_D)) (C_A _) -> 274 
  C_C (C_C (C_E _ _) (C_D)) (C_B) -> 275 
  C_C (C_C (C_E _ _) (C_D)) (C_C _ (C_A _)) -> 276 
  C_C (C_C (C_E _ _) (C_D)) (C_C _ (C_B)) -> 277 
  C_C (C_C (C_E _ _) (C_D)) (C_C _ (C_C _ _)) -> 278 
  C_C (C_C (C_E _ _) (C_D)) (C_C _ (C_D)) -> 279 
  C_C (C_C (C_E _ _) (C_D)) (C_C _ (C_E _ _)) -> 280 
  C_C (C_C (C_E _ _) (C_D)) (C_D) -> 281 
  C_C (C_C (C_E _ _) (C_D)) (C_E (C_A _) _) -> 282 
  C_C (C_C (C_E _ _) (C_D)) (C_E (C_B) _) -> 283 
  C_C (C_C (C_E _ _) (C_D)) (C_E (C_C _ _) _) -> 284 
  C_C (C_C (C_E _ _) (C_D)) (C_E (C_D) _) -> 285 
  C_C (C_C (C_E _ _) (C_D)) (C_E (C_E _ _) _) -> 286 
  C_C (C_C (C_A _) (C_E _ _)) (C_A _) -> 287 
  C_C (C_C (C_A _) (C_E _ _)) (C_B) -> 288 
  C_C (C_C (C_A _) (C_E _ _)) (C_C _ (C_A _)) -> 289 
  C_C (C_C (C_A _) (C_E _ _)) (C_C _ (C_B)) -> 290 
  C_C (C_C (C_A _) (C_E _ _)) (C_C _ (C_C _ _)) -> 291 
  C_C (C_C (C_A _) (C_E _ _)) (C_C _ (C_D)) -> 292 
  C_C (C_C (C_A _) (C_E _ _)) (C_C _ (C_E _ _)) -> 293 
  C_C (C_C (C_A _) (C_E _ _)) (C_D) -> 294 
  C_C (C_C (C_A _) (C_E _ _)) (C_E (C_A _) _) -> 295 
  C_C (C_C (C_A _) (C_E _ _)) (C_E (C_B) _) -> 296 
  C_C (C_C (C_A _) (C_E _ _)) (C_E (C_C _ _) _) -> 297 
  C_C (C_C (C_A _) (C_E _ _)) (C_E (C_D) _) -> 298 
  C_C (C_C (C_A _) (C_E _ _)) (C_E (C_E _ _) _) -> 299 
  C_C (C_C (C_B) (C_E _ _)) (C_A _) -> 300 
  C_C (C_C (C_B) (C_E _ _)) (C_B) -> 301 
  C_C (C_C (C_B) (C_E _ _)) (C_C _ (C_A _)) -> 302 
  C_C (C_C (C_B) (C_E _ _)) (C_C _ (C_B)) -> 303 
  C_C (C_C (C_B) (C_E _ _)) (C_C _ (C_C _ _)) -> 304 
  C_C (C_C (C_B) (C_E _ _)) (C_C _ (C_D)) -> 305 
  C_C (C_C (C_B) (C_E _ _)) (C_C _ (C_E _ _)) -> 306 
  C_C (C_C (C_B) (C_E _ _)) (C_D) -> 307 
  C_C (C_C (C_B) (C_E _ _)) (C_E (C_A _) _) -> 308 
  C_C (C_C (C_B) (C_E _ _)) (C_E (C_B) _) -> 309 
  C_C (C_C (C_B) (C_E _ _)) (C_E (C_C _ _) _) -> 310 
  C_C (C_C (C_B) (C_E _ _)) (C_E (C_D) _) -> 311 
  C_C (C_C (C_B) (C_E _ _)) (C_E (C_E _ _) _) -> 312 
  C_C (C_C (C_C _ _) (C_E _ _)) (C_A _) -> 313 
  C_C (C_C (C_C _ _) (C_E _ _)) (C_B) -> 314 
  C_C (C_C (C_C _ _) (C_E _ _)) (C_C _ (C_A _)) -> 315 
  C_C (C_C (C_C _ _) (C_E _ _)) (C_C _ (C_B)) -> 316 
  C_C (C_C (C_C _ _) (C_E _ _)) (C_C _ (C_C _ _)) -> 317 
  C_C (C_C (C_C _ _) (C_E _ _)) (C_C _ (C_D)) -> 318 
  C_C (C_C (C_C _ _) (C_E _ _)) (C_C _ (C_E _ _)) -> 319 
  C_C (C_C (C_C _ _) (C_E _ _)) (C_D) -> 320 
  C_C (C_C (C_C _ _) (C_E _ _)) (C_E (C_A _) _) -> 321 
  C_C (C_C (C_C _ _) (C_E _ _)) (C_E (C_B) _) -> 322 
  C_C (C_C (C_C _ _) (C_E _ _)) (C_E (C_C _ _) _) -> 323 
  C_C (C_C (C_C _ _) (C_E _ _)) (C_E (C_D) _) -> 324 
  C_C (C_C (C_C _ _) (C_E _ _)) (C_E (C_E _ _) _) -> 325 
  C_C (C_C (C_D) (C_E _ _)) (C_A _) -> 326 
  C_C (C_C (C_D) (C_E _ _)) (C_B) -> 327 
  C_C (C_C (C_D) (C_E _ _)) (C_C _ (C_A _)) -> 328 
  C_C (C_C (C_D) (C_E _ _)) (C_C _ (C_B)) -> 329 
  C_C (C_C (C_D) (C_E _ _)) (C_C _ (C_C _ _)) -> 330 
  C_C (C_C (C_D) (C_E _ _)) (C_C _ (C_D)) -> 331 
  C_C (C_C (C_D) (C_E _ _)) (C_C _ (C_E _ _)) -> 332 
  C_C (C_C (C_D) (C_E _ _)) (C_D) -> 333 
  C_C (C_C (C_D) (C_E _ _)) (C_E (C_A _) _) -> 334 
  C_C (C_C (C_D) (C_E _ _)) (C_E (C_B) _) -> 335 
  C_C (C_C (C_D) (C_E _ _)) (C_E (C_C _ _) _) -> 336 
  C_C (C_C (C_D) (C_E _ _)) (C_E (C_D) _) -> 337 
  C_C (C_C (C_D) (C_E _ _)) (C_E (C_E _ _) _) -> 338 
  C_C (C_C (C_E _ _) (C_E _ _)) (C_A _) -> 339 
  C_C (C_C (C_E _ _) (C_E _ _)) (C_B) -> 340 
  C_C (C_C (C_E _ _) (C_E _ _)) (C_C _ (C_A _)) -> 341 
  C_C (C_C (C_E _ _) (C_E _ _)) (C_C _ (C_B)) -> 342 
  C_C (C_C (C_E _ _) (C_E _ _)) (C_C _ (C_C _ _)) -> 343 
  C_C (C_C (C_E _ _) (C_E _ _)) (C_C _ (C_D)) -> 344 
  C_C (C_C (C_E _ _) (C_E _ _)) (C_C _ (C_E _ _)) -> 345 
  C_C (C_C (C_E _ _) (C_E _ _)) (C_D) -> 346 
  C_C (C_C (C_E _ _) (C_E _ _)) (C_E (C_A _) _) -> 347 
  C_C (C_C (C_E _ _) (C_E _ _)) (C_E (C_B) _) -> 348 
  C_C (C_C (C_E _ _) (C_E _ _)) (C_E (C_C _ _) _) -> 349 
  C_C (C_C (C_E _ _) (C_E _ _)) (C_E (C_D) _) -> 350 
  C_C (C_C (C_E _ _) (C_E _ _)) (C_E (C_E _ _) _) -> 351 
  C_C (C_D) (C_A _) -> 352 
  C_C (C_D) (C_B) -> 353 
  C_C (C_D) (C_C _ (C_A _)) -> 354 
  C_C (C_D) (C_C _ (C_B)) -> 355 
  C_C (C_D) (C_C _ (C_C _ _)) -> 356 
  C_C (C_D) (C_C _ (C_D)) -> 357 
  C_C (C_D) (C_C _ (C_E _ _)) -> 358 
  C_C (C_D) (C_D) -> 359 
  C_C (C_D) (C_E (C_A _) _) -> 360 
  C_C (C_D) (C_E (C_B) _) -> 361 
  C_C (C_D) (C_E (C_C _ _) _) -> 362 
  C_C (C_D) (C_E (C_D) _) -> 363 
  C_C (C_D) (C_E (C_E _ _) _) -> 364 
  C_C (C_E _ (C_A _)) (C_A _) -> 365 
  C_C (C_E _ (C_A _)) (C_B) -> 366 
  C_C (C_E _ (C_A _)) (C_C _ (C_A _)) -> 367 
  C_C (C_E _ (C_A _)) (C_C _ (C_B)) -> 368 
  C_C (C_E _ (C_A _)) (C_C _ (C_C _ _)) -> 369 
  C_C (C_E _ (C_A _)) (C_C _ (C_D)) -> 370 
  C_C (C_E _ (C_A _)) (C_C _ (C_E _ _)) -> 371 
  C_C (C_E _ (C_A _)) (C_D) -> 372 
  C_C (C_E _ (C_A _)) (C_E (C_A _) _) -> 373 
  C_C (C_E _ (C_A _)) (C_E (C_B) _) -> 374 
  C_C (C_E _ (C_A _)) (C_E (C_C _ _) _) -> 375 
  C_C (C_E _ (C_A _)) (C_E (C_D) _) -> 376 
  C_C (C_E _ (C_A _)) (C_E (C_E _ _) _) -> 377 
  C_C (C_E _ (C_B)) (C_A _) -> 378 
  C_C (C_E _ (C_B)) (C_B) -> 379 
  C_C (C_E _ (C_B)) (C_C _ (C_A _)) -> 380 
  C_C (C_E _ (C_B)) (C_C _ (C_B)) -> 381 
  C_C (C_E _ (C_B)) (C_C _ (C_C _ _)) -> 382 
  C_C (C_E _ (C_B)) (C_C _ (C_D)) -> 383 
  C_C (C_E _ (C_B)) (C_C _ (C_E _ _)) -> 384 
  C_C (C_E _ (C_B)) (C_D) -> 385 
  C_C (C_E _ (C_B)) (C_E (C_A _) _) -> 386 
  C_C (C_E _ (C_B)) (C_E (C_B) _) -> 387 
  C_C (C_E _ (C_B)) (C_E (C_C _ _) _) -> 388 
  C_C (C_E _ (C_B)) (C_E (C_D) _) -> 389 
  C_C (C_E _ (C_B)) (C_E (C_E _ _) _) -> 390 
  C_C (C_E _ (C_C _ _)) (C_A _) -> 391 
  C_C (C_E _ (C_C _ _)) (C_B) -> 392 
  C_C (C_E _ (C_C _ _)) (C_C _ (C_A _)) -> 393 
  C_C (C_E _ (C_C _ _)) (C_C _ (C_B)) -> 394 
  C_C (C_E _ (C_C _ _)) (C_C _ (C_C _ _)) -> 395 
  C_C (C_E _ (C_C _ _)) (C_C _ (C_D)) -> 396 
  C_C (C_E _ (C_C _ _)) (C_C _ (C_E _ _)) -> 397 
  C_C (C_E _ (C_C _ _)) (C_D) -> 398 
  C_C (C_E _ (C_C _ _)) (C_E (C_A _) _) -> 399 
  C_C (C_E _ (C_C _ _)) (C_E (C_B) _) -> 400 
  C_C (C_E _ (C_C _ _)) (C_E (C_C _ _) _) -> 401 
  C_C (C_E _ (C_C _ _)) (C_E (C_D) _) -> 402 
  C_C (C_E _ (C_C _ _)) (C_E (C_E _ _) _) -> 403 
  C_C (C_E _ (C_D)) (C_A _) -> 404 
  C_C (C_E _ (C_D)) (C_B) -> 405 
  C_C (C_E _ (C_D)) (C_C _ (C_A _)) -> 406 
  C_C (C_E _ (C_D)) (C_C _ (C_B)) -> 407 
  C_C (C_E _ (C_D)) (C_C _ (C_C _ _)) -> 408 
  C_C (C_E _ (C_D)) (C_C _ (C_D)) -> 409 
  C_C (C_E _ (C_D)) (C_C _ (C_E _ _)) -> 410 
  C_C (C_E _ (C_D)) (C_D) -> 411 
  C_C (C_E _ (C_D)) (C_E (C_A _) _) -> 412 
  C_C (C_E _ (C_D)) (C_E (C_B) _) -> 413 
  C_C (C_E _ (C_D)) (C_E (C_C _ _) _) -> 414 
  C_C (C_E _ (C_D)) (C_E (C_D) _) -> 415 
  C_C (C_E _ (C_D)) (C_E (C_E _ _) _) -> 416 
  C_C (C_E _ (C_E _ _)) (C_A _) -> 417 
  C_C (C_E _ (C_E _ _)) (C_B) -> 418 
  C_C (C_E _ (C_E _ _)) (C_C _ (C_A _)) -> 419 
  C_C (C_E _ (C_E _ _)) (C_C _ (C_B)) -> 420 
  C_C (C_E _ (C_E _ _)) (C_C _ (C_C _ _)) -> 421 
  C_C (C_E _ (C_E _ _)) (C_C _ (C_D)) -> 422 
  C_C (C_E _ (C_E _ _)) (C_C _ (C_E _ _)) -> 423 
  C_C (C_E _ (C_E _ _)) (C_D) -> 424 
  C_C (C_E _ (C_E _ _)) (C_E (C_A _) _) -> 425 
  C_C (C_E _ (C_E _ _)) (C_E (C_B) _) -> 426 
  C_C (C_E _ (C_E _ _)) (C_E (C_C _ _) _) -> 427 
  C_C (C_E _ (C_E _ _)) (C_E (C_D) _) -> 428 
  C_C (C_E _ (C_E _ _)) (C_E (C_E _ _) _) -> 429 
  C_D -> 430 
  C_E _ (C_A _) -> 431 
  C_E _ (C_B) -> 432 
  C_E _ (C_C (C_A _) _) -> 433 
  C_E _ (C_C (C_B) _) -> 434 
  C_E _ (C_C (C_C _ _) _) -> 435 
  C_E _ (C_C (C_D) _) -> 436 
  C_E _ (C_C (C_E _ _) _) -> 437 
  C_E _ (C_D) -> 438 
  C_E _ (C_E _ _) -> 439 
