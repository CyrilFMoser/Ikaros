module Program_9 () where 

 main = print $ show v_b
data B_B = C_C B_B | C_D Int | C_E B_B B_B
data B_A = C_A | C_B ((B_A,B_B))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_E (C_C _) (C_C _)) -> 0 
  C_C (C_E (C_C _) _) -> 1 
  C_C (C_C (C_C _)) -> 2 
  C_E (C_D _) (C_C _) -> 3 
  C_E (C_E (C_D _) (C_C _)) (C_E (C_D _) (C_C _)) -> 4 
  C_E (C_C _) (C_E (C_D _) (C_C _)) -> 5 
  C_E (C_C _) (C_E (C_E _ _) (C_E _ _)) -> 6 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_C _) (C_C _)) -> 7 
  C_E (C_D _) (C_E (C_D _) (C_C _)) -> 8 
  C_E (C_E (C_D _) _) (C_E _ (C_C _)) -> 9 
  C_E (C_D _) (C_D _) -> 10 
  C_E (C_C (C_D _)) (C_C (C_D _)) -> 11 
  C_E (C_C (C_C _)) (C_E _ (C_E _ _)) -> 12 
  C_E (C_C (C_C _)) (C_E _ (C_C _)) -> 13 
  C_E (C_E (C_E _ _) (C_C _)) (C_E (C_C _) (C_E _ _)) -> 14 
  C_E (C_E (C_D _) (C_C _)) (C_E (C_E _ _) _) -> 15 
  C_E (C_E (C_C _) (C_C _)) _ -> 16 
  C_E (C_C _) (C_E (C_E _ _) (C_D _)) -> 17 
  C_E (C_C (C_C _)) (C_E (C_E _ _) (C_C _)) -> 18 
  C_E (C_E (C_E _ _) (C_C _)) (C_E (C_C _) (C_D _)) -> 19 
  C_E (C_E (C_C _) (C_C _)) (C_E (C_E _ _) (C_D _)) -> 20 
  C_E (C_E (C_C _) (C_D _)) (C_E (C_C _) (C_E _ _)) -> 21 
  C_E (C_E (C_E _ _) _) (C_E (C_C _) (C_D _)) -> 22 
  C_E (C_E (C_C _) (C_D _)) (C_C _) -> 23 
  C_E (C_E (C_D _) _) (C_C (C_D _)) -> 24 
  C_E (C_E _ _) (C_E (C_C _) _) -> 25 
  C_E (C_E (C_E _ _) _) (C_E (C_E _ _) (C_C _)) -> 26 
  C_E (C_C (C_C _)) (C_C _) -> 27 
  C_E (C_E (C_C _) (C_E _ _)) (C_C (C_D _)) -> 28 
  C_E (C_E _ _) (C_E _ (C_C _)) -> 29 
  C_E (C_E (C_C _) (C_C _)) (C_E (C_C _) _) -> 30 
  C_E (C_C (C_D _)) (C_E (C_C _) _) -> 31 
  C_E (C_E _ (C_E _ _)) (C_E _ (C_D _)) -> 32 
  C_E (C_C (C_E _ _)) (C_E (C_E _ _) _) -> 33 
  C_E (C_E _ (C_E _ _)) (C_E (C_C _) (C_C _)) -> 34 
  C_E (C_E (C_C _) _) (C_E (C_C _) _) -> 35 
  C_E (C_E (C_D _) (C_C _)) (C_D _) -> 36 
  C_E (C_E (C_E _ _) (C_C _)) (C_C (C_D _)) -> 37 
  C_E (C_C _) (C_E (C_D _) _) -> 38 
  C_E (C_E (C_C _) (C_D _)) (C_E (C_C _) (C_C _)) -> 39 
  C_E (C_C (C_C _)) (C_E (C_E _ _) (C_D _)) -> 40 
  C_E (C_C _) (C_C (C_C _)) -> 41 
  C_E (C_D _) (C_E (C_C _) _) -> 42 
  C_E (C_E _ (C_D _)) (C_E (C_D _) (C_E _ _)) -> 43 
  C_E (C_E (C_D _) _) (C_E (C_D _) (C_D _)) -> 44 
  C_E (C_C _) (C_E (C_E _ _) (C_C _)) -> 45 
  C_E (C_E (C_D _) _) (C_E (C_C _) (C_C _)) -> 46 
  C_E (C_E (C_E _ _) (C_D _)) (C_C _) -> 47 
  C_E (C_E (C_E _ _) (C_C _)) (C_E (C_D _) _) -> 48 
  C_E (C_E (C_E _ _) (C_C _)) (C_E _ _) -> 49 
  C_E (C_C (C_D _)) (C_E (C_C _) (C_D _)) -> 50 
  C_E (C_E _ (C_D _)) (C_E (C_C _) _) -> 51 
  C_E (C_E _ (C_C _)) (C_C _) -> 52 
  C_E (C_E (C_D _) _) (C_E (C_D _) (C_C _)) -> 53 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_D _) (C_C _)) -> 54 
  C_E _ (C_E (C_E _ _) _) -> 55 
  C_E _ _ -> 56 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_C _) (C_C _)) -> 57 
  C_E (C_E _ (C_D _)) (C_C (C_C _)) -> 58 
  C_E (C_E (C_C _) (C_E _ _)) (C_E (C_E _ _) (C_E _ _)) -> 59 
  C_E (C_E (C_C _) (C_E _ _)) (C_E (C_D _) (C_D _)) -> 60 
  C_E (C_E (C_C _) (C_D _)) (C_C (C_E _ _)) -> 61 
  C_E (C_C (C_E _ _)) (C_E _ (C_D _)) -> 62 
  C_E (C_C (C_D _)) (C_E _ (C_D _)) -> 63 
  C_E (C_E (C_C _) (C_D _)) (C_E (C_D _) (C_D _)) -> 64 
  C_E (C_E (C_D _) _) (C_E (C_D _) _) -> 65 
  C_E _ (C_E _ (C_C _)) -> 66 
  C_E (C_E (C_D _) (C_D _)) (C_C _) -> 67 
  C_E (C_E (C_E _ _) (C_C _)) (C_E (C_D _) (C_E _ _)) -> 68 
  C_E (C_E (C_E _ _) (C_D _)) (C_D _) -> 69 
  C_E (C_E (C_C _) _) (C_E (C_D _) _) -> 70 
  C_E (C_D _) (C_E (C_C _) (C_E _ _)) -> 71 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_E _ _) (C_E _ _)) -> 72 
  C_E (C_E (C_D _) (C_E _ _)) (C_E _ (C_D _)) -> 73 
  C_E (C_E _ (C_D _)) (C_E (C_E _ _) (C_E _ _)) -> 74 
  C_E (C_C (C_D _)) (C_D _) -> 75 
  C_E (C_C _) (C_E _ (C_C _)) -> 76 
  C_E (C_D _) (C_E (C_E _ _) (C_C _)) -> 77 
  C_E (C_C (C_D _)) (C_C (C_E _ _)) -> 78 
  C_E (C_C (C_D _)) (C_E (C_D _) (C_E _ _)) -> 79 
  C_E (C_E (C_E _ _) (C_D _)) (C_C (C_C _)) -> 80 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_D _) (C_C _)) -> 81 
  C_E (C_E (C_E _ _) (C_E _ _)) _ -> 82 
  C_E (C_E (C_C _) (C_C _)) (C_E (C_D _) (C_C _)) -> 83 
  C_E (C_E (C_E _ _) (C_C _)) (C_E _ (C_C _)) -> 84 
  C_E (C_C (C_D _)) (C_E (C_C _) (C_E _ _)) -> 85 
  C_E (C_E (C_C _) (C_C _)) (C_C (C_E _ _)) -> 86 
  C_E (C_E (C_D _) _) (C_E (C_C _) (C_E _ _)) -> 87 
  C_E (C_E (C_E _ _) (C_C _)) (C_E (C_D _) (C_C _)) -> 88 
  C_E (C_E _ (C_E _ _)) (C_E _ _) -> 89 
  C_E (C_E (C_E _ _) (C_D _)) (C_C (C_E _ _)) -> 90 
  C_E (C_D _) (C_E (C_C _) (C_C _)) -> 91 
  C_E (C_E (C_C _) (C_C _)) (C_E (C_D _) (C_E _ _)) -> 92 
  C_E (C_E (C_C _) _) (C_E (C_C _) (C_D _)) -> 93 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E _ (C_C _)) -> 94 
  C_E (C_E (C_C _) _) (C_C (C_C _)) -> 95 
  C_E (C_E (C_C _) _) _ -> 96 
  C_E (C_C _) (C_E (C_C _) _) -> 97 
  C_E (C_D _) (C_C (C_C _)) -> 98 
  C_E (C_E _ (C_D _)) (C_C (C_E _ _)) -> 99 
  C_E (C_C (C_E _ _)) (C_E (C_C _) (C_D _)) -> 100 
  C_E (C_E (C_C _) (C_D _)) (C_E _ (C_C _)) -> 101 
  C_E (C_C (C_D _)) (C_E (C_E _ _) (C_E _ _)) -> 102 
  C_E (C_E (C_C _) (C_D _)) (C_E (C_D _) (C_E _ _)) -> 103 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_D _) (C_D _)) -> 104 
  C_E (C_E _ (C_C _)) (C_D _) -> 105 
  C_E _ (C_E (C_C _) _) -> 106 
  C_E (C_C (C_D _)) (C_E _ _) -> 107 
  C_E (C_E (C_E _ _) (C_C _)) (C_D _) -> 108 
  C_E (C_E (C_D _) _) (C_E (C_D _) (C_E _ _)) -> 109 
  C_E (C_E (C_C _) (C_D _)) (C_D _) -> 110 
  C_E (C_E (C_D _) (C_C _)) (C_E _ (C_C _)) -> 111 
  C_E (C_E _ _) (C_E (C_D _) (C_C _)) -> 112 
  C_E (C_E _ _) (C_C (C_D _)) -> 113 
  C_E (C_E (C_D _) (C_E _ _)) _ -> 114 
  C_E (C_E (C_C _) _) (C_D _) -> 115 
  C_E (C_E (C_D _) (C_E _ _)) (C_D _) -> 116 
  C_E (C_E (C_D _) (C_C _)) (C_E _ (C_E _ _)) -> 117 
  C_E _ (C_E _ _) -> 118 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_E _ _) (C_D _)) -> 119 
  C_E (C_E _ _) (C_D _) -> 120 
  C_E (C_E (C_D _) (C_C _)) (C_E _ (C_D _)) -> 121 
  C_E (C_C (C_C _)) (C_C (C_E _ _)) -> 122 
  C_E (C_E (C_C _) (C_E _ _)) (C_E (C_C _) (C_C _)) -> 123 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_E _ _) (C_D _)) -> 124 
  C_E (C_C (C_C _)) (C_C (C_D _)) -> 125 
  C_E (C_E (C_C _) (C_D _)) (C_E _ (C_D _)) -> 126 
  C_E (C_E (C_E _ _) _) (C_E (C_E _ _) _) -> 127 
  C_E (C_E _ _) (C_C _) -> 128 
  C_E (C_E (C_C _) (C_C _)) (C_E _ (C_C _)) -> 129 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_C _) (C_D _)) -> 130 
  C_E (C_E (C_C _) (C_C _)) (C_E (C_D _) (C_D _)) -> 131 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_C (C_D _)) -> 132 
  C_E (C_E (C_C _) (C_E _ _)) (C_E (C_E _ _) (C_D _)) -> 133 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_D _) _) -> 134 
  C_E (C_C (C_C _)) (C_E (C_E _ _) _) -> 135 
  C_E (C_E (C_D _) _) (C_C _) -> 136 
  C_E (C_C (C_E _ _)) (C_E (C_D _) (C_D _)) -> 137 
  C_E (C_E (C_C _) (C_E _ _)) (C_C (C_C _)) -> 138 
  C_E _ (C_E (C_E _ _) (C_E _ _)) -> 139 
  C_E (C_E (C_D _) (C_E _ _)) (C_E _ _) -> 140 
  C_E (C_E _ (C_C _)) (C_E (C_C _) (C_D _)) -> 141 
  C_E (C_C (C_E _ _)) (C_E (C_E _ _) (C_E _ _)) -> 142 
  C_E (C_D _) (C_C (C_E _ _)) -> 143 
  C_E (C_E _ (C_D _)) (C_E _ (C_E _ _)) -> 144 
  C_E (C_E (C_C _) (C_C _)) (C_E (C_C _) (C_C _)) -> 145 
  C_E (C_E (C_C _) (C_C _)) (C_E (C_E _ _) _) -> 146 
  C_E _ (C_C _) -> 147 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_E _ _) _) -> 148 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_C (C_E _ _)) -> 149 
  C_E (C_E (C_C _) (C_D _)) (C_E _ (C_E _ _)) -> 150 
  C_E (C_E _ (C_C _)) _ -> 151 
  C_E (C_E _ (C_C _)) (C_E (C_D _) _) -> 152 
  C_E (C_E (C_C _) (C_E _ _)) (C_E (C_D _) (C_E _ _)) -> 153 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_E _ _) (C_D _)) -> 154 
  C_E _ (C_E (C_D _) _) -> 155 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_C _) (C_D _)) -> 156 
  C_E (C_E (C_C _) (C_E _ _)) (C_E (C_E _ _) (C_C _)) -> 157 
  C_E (C_E _ (C_E _ _)) (C_E (C_D _) _) -> 158 
  C_E (C_D _) (C_E (C_D _) (C_E _ _)) -> 159 
  C_E (C_E _ (C_E _ _)) (C_E (C_E _ _) (C_D _)) -> 160 
  C_E (C_E (C_E _ _) _) (C_E (C_E _ _) (C_D _)) -> 161 
  C_E (C_E (C_D _) (C_C _)) (C_C (C_E _ _)) -> 162 
  C_E (C_E (C_D _) (C_D _)) (C_E _ _) -> 163 
  C_E (C_E (C_D _) (C_C _)) (C_C (C_D _)) -> 164 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_E _ _) (C_E _ _)) -> 165 
  C_E (C_E _ _) (C_E (C_C _) (C_C _)) -> 166 
  C_E (C_E _ (C_C _)) (C_E (C_E _ _) _) -> 167 
  C_E (C_E (C_D _) _) (C_E (C_E _ _) (C_C _)) -> 168 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_E _ _) (C_E _ _)) -> 169 
  C_E (C_C (C_D _)) (C_E (C_C _) (C_C _)) -> 170 
  C_E (C_E _ (C_E _ _)) (C_E (C_E _ _) _) -> 171 
  C_E (C_E (C_D _) _) (C_E (C_E _ _) (C_E _ _)) -> 172 
  C_E (C_E _ (C_E _ _)) _ -> 173 
  C_E (C_E (C_C _) (C_D _)) (C_E (C_C _) _) -> 174 
  C_E (C_E (C_D _) _) _ -> 175 
  C_E (C_C (C_D _)) (C_E _ (C_C _)) -> 176 
  C_E (C_E (C_D _) (C_D _)) (C_E _ (C_C _)) -> 177 
  C_E (C_E (C_E _ _) _) (C_E (C_C _) (C_C _)) -> 178 
  C_E (C_D _) (C_E _ (C_D _)) -> 179 
  C_E (C_E (C_E _ _) (C_C _)) (C_E _ (C_D _)) -> 180 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_E _ _) (C_C _)) -> 181 
  C_E (C_E (C_D _) _) (C_E _ _) -> 182 
  C_E (C_E (C_D _) (C_C _)) (C_C (C_C _)) -> 183 
  C_E (C_E (C_D _) (C_C _)) (C_C _) -> 184 
  C_E (C_E (C_D _) _) (C_E (C_E _ _) (C_D _)) -> 185 
  C_E (C_E (C_C _) (C_D _)) (C_E (C_E _ _) _) -> 186 
  C_E (C_E _ (C_D _)) (C_E (C_D _) (C_D _)) -> 187 
  C_E (C_C _) (C_E _ (C_D _)) -> 188 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_D _) _) -> 189 
  C_E (C_E _ (C_C _)) (C_E _ (C_E _ _)) -> 190 
  C_E (C_E _ (C_E _ _)) (C_E (C_E _ _) (C_E _ _)) -> 191 
  C_E (C_E (C_C _) (C_D _)) (C_E (C_E _ _) (C_C _)) -> 192 
  C_E (C_D _) (C_E (C_D _) _) -> 193 
  C_E (C_E _ (C_C _)) (C_E _ (C_D _)) -> 194 
  C_E (C_E (C_C _) (C_C _)) (C_E _ (C_D _)) -> 195 
  C_E (C_E (C_E _ _) (C_C _)) (C_E (C_E _ _) (C_E _ _)) -> 196 
  C_E (C_D _) (C_E _ (C_C _)) -> 197 
  C_E (C_E (C_E _ _) (C_C _)) (C_E (C_E _ _) _) -> 198 
  C_E (C_D _) (C_E (C_E _ _) _) -> 199 
  C_E (C_E (C_D _) (C_C _)) (C_E (C_E _ _) (C_E _ _)) -> 200 
  C_E (C_E _ (C_D _)) (C_E _ (C_D _)) -> 201 
  C_E _ (C_E _ (C_E _ _)) -> 202 
  C_E (C_C (C_D _)) (C_E (C_E _ _) (C_D _)) -> 203 
  C_E (C_E _ (C_E _ _)) (C_E (C_D _) (C_C _)) -> 204 
  C_E (C_C (C_E _ _)) (C_C _) -> 205 
  C_E (C_E (C_E _ _) (C_D _)) (C_E _ (C_D _)) -> 206 
  C_E (C_E (C_C _) (C_C _)) (C_E (C_C _) (C_E _ _)) -> 207 
  C_E (C_E (C_E _ _) _) (C_E (C_C _) _) -> 208 
  C_E (C_E _ (C_C _)) (C_E (C_E _ _) (C_E _ _)) -> 209 
  C_E (C_C (C_C _)) (C_E (C_C _) (C_C _)) -> 210 
  C_E (C_E _ (C_D _)) (C_E (C_D _) _) -> 211 
  C_E (C_E (C_D _) (C_D _)) (C_E _ (C_E _ _)) -> 212 
  C_E (C_C (C_E _ _)) (C_E (C_D _) (C_C _)) -> 213 
  C_E (C_E (C_D _) (C_D _)) (C_C (C_D _)) -> 214 
  C_E (C_E _ (C_C _)) (C_C (C_E _ _)) -> 215 
  C_E (C_E _ (C_E _ _)) (C_E _ (C_C _)) -> 216 
  C_E (C_E (C_E _ _) (C_C _)) (C_E (C_D _) (C_D _)) -> 217 
  C_E (C_E _ (C_C _)) (C_C (C_C _)) -> 218 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_D _) (C_C _)) -> 219 
  C_E (C_E (C_C _) (C_D _)) (C_E (C_D _) (C_C _)) -> 220 
  C_E _ (C_C (C_D _)) -> 221 
  C_E (C_E _ _) (C_C (C_C _)) -> 222 
  C_E (C_D _) (C_E (C_E _ _) (C_E _ _)) -> 223 
  C_E (C_C (C_C _)) _ -> 224 
  C_E (C_E _ (C_E _ _)) (C_E (C_E _ _) (C_C _)) -> 225 
  C_E (C_D _) (C_E (C_C _) (C_D _)) -> 226 
  C_E (C_E (C_E _ _) (C_C _)) (C_C (C_E _ _)) -> 227 
  C_E (C_E _ (C_C _)) (C_C (C_D _)) -> 228 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_C (C_C _)) -> 229 
  C_E (C_E (C_D _) (C_D _)) (C_D _) -> 230 
  C_E _ (C_E (C_E _ _) (C_D _)) -> 231 
  C_E (C_C (C_E _ _)) (C_D _) -> 232 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_E _ _) (C_E _ _)) -> 233 
  C_E (C_E (C_D _) (C_C _)) (C_E (C_C _) (C_C _)) -> 234 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_E _ _) (C_C _)) -> 235 
  C_E (C_E (C_C _) _) (C_E (C_C _) (C_C _)) -> 236 
  C_E (C_E (C_D _) _) (C_E (C_E _ _) _) -> 237 
  C_E (C_E (C_E _ _) (C_D _)) (C_C (C_D _)) -> 238 
  C_E (C_E (C_C _) _) (C_E (C_E _ _) _) -> 239 
  C_E (C_D _) (C_C (C_D _)) -> 240 
  C_E _ (C_E (C_C _) (C_C _)) -> 241 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_D _) -> 242 
  C_E (C_E (C_E _ _) _) (C_E (C_E _ _) (C_E _ _)) -> 243 
  C_E (C_C (C_E _ _)) (C_E (C_E _ _) (C_D _)) -> 244 
  C_E (C_E _ (C_C _)) (C_E (C_D _) (C_C _)) -> 245 
  C_E (C_E (C_C _) _) (C_E (C_D _) (C_E _ _)) -> 246 
  C_E (C_E _ (C_E _ _)) (C_C (C_D _)) -> 247 
  C_E (C_E (C_C _) (C_C _)) (C_E (C_E _ _) (C_C _)) -> 248 
  C_E (C_E (C_C _) _) (C_E (C_E _ _) (C_C _)) -> 249 
  C_E (C_E (C_D _) (C_C _)) (C_E (C_C _) (C_E _ _)) -> 250 
  C_E (C_C (C_E _ _)) (C_E _ (C_C _)) -> 251 
  C_E (C_C _) (C_E _ (C_E _ _)) -> 252 
  C_E (C_E _ (C_C _)) (C_E _ _) -> 253 
  C_E (C_E (C_C _) _) (C_E (C_E _ _) (C_D _)) -> 254 
  C_E (C_E (C_E _ _) (C_D _)) (C_E _ (C_E _ _)) -> 255 
  C_E (C_E (C_C _) _) (C_E (C_C _) (C_E _ _)) -> 256 
  C_E (C_E (C_D _) (C_C _)) (C_E (C_D _) (C_D _)) -> 257 
  C_E (C_C (C_C _)) (C_E (C_D _) _) -> 258 
  C_E (C_E (C_C _) (C_E _ _)) (C_E _ (C_E _ _)) -> 259 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_C _) -> 260 
  C_E (C_E (C_E _ _) _) (C_C (C_E _ _)) -> 261 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_C _) (C_D _)) -> 262 
  C_E (C_E (C_C _) (C_E _ _)) (C_E (C_D _) (C_C _)) -> 263 
  C_E (C_E (C_E _ _) (C_D _)) (C_E _ (C_C _)) -> 264 
  C_E (C_C (C_C _)) (C_D _) -> 265 
  C_E (C_C (C_C _)) (C_E (C_C _) (C_E _ _)) -> 266 
  C_E (C_C _) (C_C (C_E _ _)) -> 267 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_C _) _) -> 268 
  C_E _ (C_E _ (C_D _)) -> 269 
  C_E (C_E _ (C_C _)) (C_E (C_E _ _) (C_D _)) -> 270 
  C_E (C_E (C_E _ _) _) (C_D _) -> 271 
  C_E (C_E (C_C _) (C_D _)) _ -> 272 
  C_E (C_E (C_C _) _) (C_E (C_D _) (C_D _)) -> 273 
  C_E (C_E (C_E _ _) _) (C_E _ (C_C _)) -> 274 
  C_E (C_E (C_E _ _) _) (C_C _) -> 275 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_C _) (C_E _ _)) -> 276 
  C_E (C_E (C_C _) _) (C_E _ (C_D _)) -> 277 
  C_E (C_E (C_C _) _) (C_E (C_E _ _) (C_E _ _)) -> 278 
  C_E (C_E (C_E _ _) _) (C_E (C_D _) (C_E _ _)) -> 279 
  C_E (C_E (C_C _) (C_E _ _)) (C_E (C_E _ _) _) -> 280 
  C_E _ (C_E (C_C _) (C_D _)) -> 281 
  C_E (C_C (C_E _ _)) (C_E (C_C _) (C_E _ _)) -> 282 
  C_E (C_E _ (C_C _)) (C_E (C_D _) (C_E _ _)) -> 283 
  C_E (C_E _ (C_E _ _)) (C_C (C_E _ _)) -> 284 
  C_E (C_E (C_C _) (C_D _)) (C_E (C_E _ _) (C_D _)) -> 285 
  C_E (C_E _ (C_C _)) (C_E (C_D _) (C_D _)) -> 286 
  C_E (C_E (C_C _) (C_C _)) (C_D _) -> 287 
  C_E (C_E _ (C_E _ _)) (C_E _ (C_E _ _)) -> 288 
  C_E (C_E (C_D _) (C_C _)) (C_E (C_D _) (C_E _ _)) -> 289 
  C_E (C_C _) (C_E (C_C _) (C_D _)) -> 290 
  C_E (C_E (C_C _) (C_E _ _)) (C_E _ _) -> 291 
  C_E (C_E (C_E _ _) (C_C _)) (C_E (C_C _) _) -> 292 
  C_E (C_E _ (C_E _ _)) (C_E (C_C _) (C_D _)) -> 293 
  C_E (C_E (C_E _ _) (C_C _)) (C_E _ (C_E _ _)) -> 294 
  C_E (C_E (C_D _) _) (C_C (C_E _ _)) -> 295 
  C_E (C_E _ (C_D _)) (C_E (C_C _) (C_E _ _)) -> 296 
  C_E (C_C (C_D _)) (C_E (C_D _) _) -> 297 
  C_E (C_C (C_C _)) (C_E _ (C_D _)) -> 298 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_D _) (C_E _ _)) -> 299 
  C_E (C_E _ _) _ -> 300 
  C_E (C_C (C_E _ _)) (C_C (C_D _)) -> 301 
  C_E _ (C_E (C_E _ _) (C_C _)) -> 302 
  C_E (C_E _ (C_D _)) (C_D _) -> 303 
  C_E (C_E _ (C_E _ _)) (C_E (C_C _) _) -> 304 
  C_E (C_E (C_E _ _) _) (C_C (C_C _)) -> 305 
  C_E (C_C (C_E _ _)) (C_E (C_C _) (C_C _)) -> 306 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_D _) (C_E _ _)) -> 307 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_C _) (C_D _)) -> 308 
  C_E _ (C_E (C_D _) (C_E _ _)) -> 309 
  C_E (C_E (C_D _) _) (C_E _ (C_D _)) -> 310 
  C_E (C_E (C_D _) (C_E _ _)) (C_C _) -> 311 
  C_E (C_E (C_D _) _) (C_E (C_C _) (C_D _)) -> 312 
  C_E (C_E (C_D _) (C_D _)) (C_E _ (C_D _)) -> 313 
  C_E (C_C (C_E _ _)) (C_E (C_E _ _) (C_C _)) -> 314 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_E _ _) (C_C _)) -> 315 
  C_E (C_C (C_D _)) (C_E (C_E _ _) (C_C _)) -> 316 
  C_E (C_E (C_E _ _) (C_C _)) (C_E (C_E _ _) (C_D _)) -> 317 
  C_E (C_E (C_E _ _) _) _ -> 318 
  C_E (C_E (C_C _) (C_E _ _)) (C_E (C_D _) _) -> 319 
  C_E (C_E _ (C_C _)) (C_E (C_C _) _) -> 320 
  C_E (C_E (C_C _) (C_E _ _)) (C_C (C_E _ _)) -> 321 
  C_E (C_C (C_C _)) (C_E (C_D _) (C_E _ _)) -> 322 
  C_E (C_E _ (C_E _ _)) (C_E (C_D _) (C_D _)) -> 323 
  C_E (C_C (C_C _)) (C_C (C_C _)) -> 324 
  C_E (C_C (C_C _)) (C_E (C_C _) (C_D _)) -> 325 
  C_E (C_E _ _) (C_E (C_D _) (C_D _)) -> 326 
  C_E (C_E (C_C _) (C_E _ _)) (C_E _ (C_D _)) -> 327 
  C_E (C_E (C_C _) (C_C _)) (C_E (C_D _) _) -> 328 
  C_E (C_E (C_C _) _) (C_E _ _) -> 329 
  C_E (C_C (C_C _)) (C_E (C_D _) (C_D _)) -> 330 
  C_E _ (C_E (C_D _) (C_D _)) -> 331 
  C_E (C_C _) _ -> 332 
  C_E (C_C (C_D _)) (C_E (C_D _) (C_D _)) -> 333 
  C_E (C_E (C_C _) (C_E _ _)) (C_E (C_C _) (C_E _ _)) -> 334 
  C_E (C_C _) (C_E _ _) -> 335 
  C_E (C_C _) (C_E (C_E _ _) _) -> 336 
  C_E (C_E _ (C_E _ _)) (C_D _) -> 337 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_D _) (C_D _)) -> 338 
  C_E (C_E (C_E _ _) (C_C _)) (C_E (C_C _) (C_C _)) -> 339 
  C_E (C_C _) (C_E (C_D _) (C_D _)) -> 340 
  C_E (C_E (C_E _ _) _) (C_E _ (C_E _ _)) -> 341 
  C_E (C_E _ (C_D _)) _ -> 342 
  C_E (C_E _ (C_D _)) (C_E (C_E _ _) _) -> 343 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_D _) (C_C _)) -> 344 
  C_E (C_E (C_E _ _) _) (C_E _ (C_D _)) -> 345 
  C_E (C_C _) (C_D _) -> 346 
  C_E (C_E _ _) (C_E (C_D _) (C_E _ _)) -> 347 
  C_E (C_E _ (C_D _)) (C_E (C_C _) (C_D _)) -> 348 
  C_E (C_E (C_D _) (C_C _)) (C_E (C_C _) (C_D _)) -> 349 
  C_E (C_E _ (C_D _)) (C_E (C_C _) (C_C _)) -> 350 
  C_E (C_C (C_D _)) (C_E (C_E _ _) _) -> 351 
  C_E (C_C (C_D _)) _ -> 352 
  C_E (C_E _ (C_E _ _)) (C_E (C_C _) (C_E _ _)) -> 353 
  C_E (C_D _) (C_E (C_E _ _) (C_D _)) -> 354 
  C_E (C_E (C_D _) (C_C _)) (C_E (C_C _) _) -> 355 
  C_E (C_E (C_C _) (C_E _ _)) _ -> 356 
  C_E (C_E _ _) (C_E _ _) -> 357 
  C_E (C_E _ (C_E _ _)) (C_C (C_C _)) -> 358 
  C_E (C_E _ _) (C_E _ (C_E _ _)) -> 359 
  C_E _ (C_C (C_C _)) -> 360 
  C_E (C_C (C_C _)) (C_E (C_C _) _) -> 361 
  C_E (C_C (C_E _ _)) (C_E _ (C_E _ _)) -> 362 
  C_E (C_E _ _) (C_E (C_E _ _) (C_E _ _)) -> 363 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_D _) (C_E _ _)) -> 364 
  C_E (C_E (C_C _) (C_D _)) (C_E _ _) -> 365 
  C_E (C_C _) (C_E (C_C _) (C_C _)) -> 366 
  C_E (C_E (C_D _) (C_C _)) (C_E (C_E _ _) (C_C _)) -> 367 
  C_E (C_E (C_E _ _) _) (C_E (C_D _) (C_C _)) -> 368 
  C_E (C_E (C_C _) _) (C_C (C_E _ _)) -> 369 
  C_E (C_D _) (C_E _ (C_E _ _)) -> 370 
