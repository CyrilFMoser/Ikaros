module Program_21 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) (B_A a) | C_B (B_A a) a | C_C | C_D Char

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_A _ (C_A _ _)) _ -> 0 
  C_B (C_C) _ -> 1 
  C_B _ _ -> 2 
  C_B (C_A (C_A _ _) (C_D _)) _ -> 3 
  C_B (C_A _ (C_B _ _)) _ -> 4 
  C_B (C_A _ (C_D _)) _ -> 5 
  C_B (C_B (C_B _ _) _) _ -> 6 
  C_B (C_A (C_D _) _) _ -> 7 
  C_B (C_A (C_A _ _) (C_A _ _)) _ -> 8 
  C_B (C_A (C_C) (C_C)) _ -> 9 
  C_B (C_A _ _) _ -> 10 
  C_B (C_A (C_B _ _) (C_B _ _)) _ -> 11 
  C_B (C_A (C_C) _) _ -> 12 
  C_B (C_A (C_D _) (C_B _ _)) _ -> 13 
  C_B (C_A (C_B _ _) (C_A _ _)) _ -> 14 
  C_B (C_A (C_D _) (C_C)) _ -> 15 
  C_B (C_B (C_C) _) _ -> 16 
  C_B (C_B (C_A _ _) _) _ -> 17 
  C_B (C_A (C_A _ _) (C_B _ _)) _ -> 18 
  C_B (C_D _) _ -> 19 
  C_B (C_A (C_A _ _) (C_C)) _ -> 20 
  C_B (C_B (C_D _) _) _ -> 21 
  C_A (C_A (C_B _ _) (C_D _)) (C_A _ (C_A _ _)) -> 22 
  C_A (C_A (C_D _) (C_C)) (C_A _ (C_C)) -> 23 
  C_A (C_B (C_B _ _) _) (C_A (C_B _ _) (C_C)) -> 24 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_C) (C_C)) -> 25 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_B _ _) (C_D _)) -> 26 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_D _) (C_D _)) -> 27 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_C) (C_A _ _)) -> 28 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_A _ _) (C_C)) -> 29 
  C_A (C_A (C_D _) _) (C_A (C_B _ _) (C_D _)) -> 30 
  C_A (C_B _ _) (C_A (C_A _ _) (C_C)) -> 31 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_B _ _) (C_D _)) -> 32 
  C_A (C_A (C_D _) (C_B _ _)) (C_B (C_D _) _) -> 33 
  C_A (C_B (C_C) _) (C_A _ (C_D _)) -> 34 
  C_A (C_A (C_C) _) (C_A (C_B _ _) (C_A _ _)) -> 35 
  C_A (C_A (C_B _ _) (C_D _)) (C_B _ _) -> 36 
  C_A (C_A (C_D _) (C_A _ _)) (C_B (C_C) _) -> 37 
  C_A (C_A (C_D _) (C_C)) (C_A (C_A _ _) (C_D _)) -> 38 
  C_A (C_A _ (C_A _ _)) (C_A (C_B _ _) (C_B _ _)) -> 39 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_C) (C_A _ _)) -> 40 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_A _ _) (C_C)) -> 41 
  C_A (C_B _ _) (C_A (C_B _ _) (C_D _)) -> 42 
  C_A (C_B (C_B _ _) _) (C_A (C_B _ _) (C_D _)) -> 43 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_A _ _) _) -> 44 
  C_A (C_B _ _) (C_A (C_C) (C_B _ _)) -> 45 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_C) (C_B _ _)) -> 46 
  C_A (C_B (C_C) _) (C_A (C_D _) (C_A _ _)) -> 47 
  C_A (C_A (C_B _ _) (C_D _)) (C_D _) -> 48 
  C_A (C_A _ (C_D _)) _ -> 49 
  C_A (C_A (C_C) (C_D _)) (C_A (C_D _) (C_B _ _)) -> 50 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_D _) _) -> 51 
  C_A (C_A (C_C) (C_D _)) (C_A (C_D _) (C_D _)) -> 52 
  C_A (C_A (C_D _) (C_B _ _)) (C_B (C_B _ _) _) -> 53 
  C_A (C_A (C_A _ _) _) (C_A (C_B _ _) (C_C)) -> 54 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_D _) (C_D _)) -> 55 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_C) _) -> 56 
  C_A (C_A (C_D _) _) (C_A _ (C_D _)) -> 57 
  C_A (C_A (C_A _ _) (C_C)) (C_B (C_B _ _) _) -> 58 
  C_A _ (C_A (C_D _) (C_D _)) -> 59 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_B _ _) (C_C)) -> 60 
  C_A (C_A (C_A _ _) _) (C_B _ _) -> 61 
  C_A (C_A _ (C_C)) (C_A (C_D _) _) -> 62 
  C_A (C_A _ _) (C_A (C_D _) (C_D _)) -> 63 
  C_A (C_B (C_D _) _) (C_A (C_A _ _) _) -> 64 
  C_A _ (C_A (C_B _ _) (C_D _)) -> 65 
  C_A (C_A _ (C_D _)) (C_A (C_B _ _) (C_D _)) -> 66 
  C_A (C_B _ _) (C_A _ (C_C)) -> 67 
  C_A (C_A (C_C) (C_C)) (C_A (C_A _ _) _) -> 68 
  C_A (C_B (C_C) _) (C_A (C_B _ _) (C_D _)) -> 69 
  C_A (C_A (C_D _) _) (C_A (C_A _ _) _) -> 70 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_C) (C_D _)) -> 71 
  C_A (C_A _ (C_B _ _)) (C_A (C_B _ _) (C_D _)) -> 72 
  C_A (C_A _ (C_C)) (C_A _ (C_B _ _)) -> 73 
  C_A (C_A _ (C_A _ _)) (C_A _ (C_B _ _)) -> 74 
  C_A (C_A _ (C_C)) (C_A (C_D _) (C_C)) -> 75 
  C_A (C_B (C_B _ _) _) (C_A (C_D _) (C_D _)) -> 76 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_B _ _) (C_C)) -> 77 
  C_A (C_A _ (C_C)) _ -> 78 
  C_A (C_A _ _) (C_C) -> 79 
  C_A (C_A (C_D _) (C_D _)) (C_B (C_C) _) -> 80 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_C) _) -> 81 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_D _) _) -> 82 
  C_A (C_A (C_C) (C_D _)) _ -> 83 
  C_A (C_A (C_D _) (C_A _ _)) (C_A _ (C_C)) -> 84 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_A _ _) (C_D _)) -> 85 
  C_A (C_A (C_D _) (C_A _ _)) (C_D _) -> 86 
  C_A _ (C_A _ (C_A _ _)) -> 87 
  C_A (C_B _ _) (C_A _ _) -> 88 
  C_A (C_B (C_B _ _) _) (C_A (C_D _) _) -> 89 
  C_A (C_A (C_C) (C_B _ _)) _ -> 90 
  C_A (C_A _ (C_D _)) (C_A (C_C) (C_D _)) -> 91 
  C_A (C_A (C_D _) (C_C)) (C_A _ (C_A _ _)) -> 92 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_D _) _) -> 93 
  C_A (C_A (C_C) (C_D _)) (C_A (C_A _ _) _) -> 94 
  C_A (C_A (C_C) _) (C_C) -> 95 
  C_A (C_A _ (C_D _)) (C_A (C_A _ _) (C_D _)) -> 96 
  C_A (C_B (C_C) _) (C_A (C_D _) (C_B _ _)) -> 97 
  C_A (C_D _) (C_A (C_C) (C_A _ _)) -> 98 
  C_A _ (C_A (C_A _ _) (C_C)) -> 99 
  C_A (C_A _ (C_B _ _)) (C_B (C_B _ _) _) -> 100 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_B _ _) (C_D _)) -> 101 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_B _ _) (C_A _ _)) -> 102 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_B (C_A _ _) _) -> 103 
  C_A (C_A (C_A _ _) (C_C)) (C_D _) -> 104 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_C) (C_C)) -> 105 
  C_A (C_A _ _) (C_A (C_A _ _) _) -> 106 
  C_A (C_B _ _) (C_B (C_C) _) -> 107 
  C_A (C_A (C_D _) (C_B _ _)) (C_D _) -> 108 
  C_A (C_A (C_D _) (C_B _ _)) (C_B (C_C) _) -> 109 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_C) (C_D _)) -> 110 
  C_A (C_B (C_C) _) (C_A (C_C) (C_B _ _)) -> 111 
  C_A (C_B _ _) (C_B _ _) -> 112 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_D _) _) -> 113 
  C_A (C_A _ (C_A _ _)) (C_A (C_B _ _) (C_D _)) -> 114 
  C_A (C_A (C_B _ _) _) (C_A (C_C) (C_C)) -> 115 
  C_A (C_B (C_B _ _) _) (C_A (C_B _ _) (C_B _ _)) -> 116 
  C_A (C_A (C_B _ _) (C_D _)) (C_A _ (C_C)) -> 117 
  C_A (C_A (C_C) (C_C)) (C_A (C_D _) _) -> 118 
  C_A (C_A _ (C_A _ _)) (C_B (C_B _ _) _) -> 119 
  C_A (C_C) (C_A (C_B _ _) _) -> 120 
  C_A (C_A (C_C) (C_C)) (C_A _ (C_C)) -> 121 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_A _ _) (C_A _ _)) -> 122 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_B _ _) (C_B _ _)) -> 123 
  C_A (C_B _ _) (C_A (C_A _ _) (C_D _)) -> 124 
  C_A (C_A (C_B _ _) _) (C_B (C_D _) _) -> 125 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_B _ _) (C_D _)) -> 126 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_C) (C_C)) -> 127 
  C_A (C_B (C_A _ _) _) (C_B (C_D _) _) -> 128 
  C_A (C_A _ (C_A _ _)) (C_A (C_C) _) -> 129 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_D _) _) -> 130 
  C_A (C_A (C_B _ _) (C_D _)) (C_C) -> 131 
  C_A (C_D _) (C_C) -> 132 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_C) _) -> 133 
  C_A (C_A (C_D _) (C_C)) _ -> 134 
  C_A (C_A (C_D _) _) (C_D _) -> 135 
  C_A (C_C) (C_A _ (C_D _)) -> 136 
  C_A (C_B (C_A _ _) _) (C_A (C_C) _) -> 137 
  C_A (C_B (C_B _ _) _) (C_A _ _) -> 138 
  C_A (C_A _ (C_A _ _)) (C_A (C_A _ _) (C_B _ _)) -> 139 
  C_A (C_A _ (C_D _)) (C_B (C_C) _) -> 140 
  C_A (C_C) (C_D _) -> 141 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_A _ _) _) -> 142 
  C_A (C_B (C_A _ _) _) (C_B (C_C) _) -> 143 
  C_A (C_A (C_C) (C_B _ _)) (C_B (C_A _ _) _) -> 144 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_A _ _) _) -> 145 
  C_A (C_D _) (C_A _ _) -> 146 
  C_A (C_B (C_D _) _) (C_C) -> 147 
  C_A (C_A _ _) (C_A (C_B _ _) _) -> 148 
  C_A (C_B (C_B _ _) _) (C_A (C_A _ _) (C_D _)) -> 149 
  C_A (C_A (C_A _ _) _) (C_C) -> 150 
  C_A (C_B (C_B _ _) _) (C_A (C_A _ _) (C_C)) -> 151 
  C_A (C_B _ _) (C_A (C_B _ _) (C_B _ _)) -> 152 
  C_A (C_B (C_A _ _) _) (C_A _ (C_B _ _)) -> 153 
  C_A (C_A _ (C_D _)) (C_A (C_C) (C_B _ _)) -> 154 
  C_A (C_A (C_C) (C_B _ _)) (C_B _ _) -> 155 
  C_A (C_A (C_B _ _) (C_C)) (C_B (C_B _ _) _) -> 156 
  C_A (C_A (C_C) _) (C_A (C_B _ _) (C_C)) -> 157 
  C_A (C_A _ (C_C)) (C_A (C_C) _) -> 158 
  C_A (C_A _ (C_B _ _)) (C_A _ (C_A _ _)) -> 159 
  C_A (C_A _ _) (C_A (C_D _) _) -> 160 
  C_A (C_A _ (C_D _)) (C_A (C_A _ _) (C_A _ _)) -> 161 
  C_A (C_A _ (C_B _ _)) (C_A (C_B _ _) (C_B _ _)) -> 162 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_B _ _) (C_D _)) -> 163 
  C_A _ (C_A _ (C_B _ _)) -> 164 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_B _ _) (C_B _ _)) -> 165 
  C_A (C_A (C_B _ _) _) (C_B (C_C) _) -> 166 
  C_A (C_A _ (C_A _ _)) (C_A (C_B _ _) _) -> 167 
  C_A (C_B (C_B _ _) _) (C_B (C_C) _) -> 168 
  C_A (C_A _ (C_C)) (C_A (C_D _) (C_B _ _)) -> 169 
  C_A (C_B (C_A _ _) _) (C_A (C_C) (C_C)) -> 170 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_B _ _) _) -> 171 
  C_A (C_D _) (C_B (C_B _ _) _) -> 172 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_C) (C_D _)) -> 173 
  C_A (C_A (C_D _) (C_C)) (C_A _ (C_B _ _)) -> 174 
  C_A (C_A _ (C_B _ _)) (C_A (C_B _ _) (C_A _ _)) -> 175 
  C_A (C_A (C_D _) _) (C_A (C_A _ _) (C_B _ _)) -> 176 
  C_A (C_A (C_C) (C_C)) (C_A (C_C) (C_D _)) -> 177 
  C_A (C_B (C_D _) _) (C_A (C_B _ _) (C_B _ _)) -> 178 
  C_A (C_A (C_B _ _) _) (C_A (C_D _) _) -> 179 
  C_A (C_B (C_C) _) (C_D _) -> 180 
  C_A (C_A _ (C_A _ _)) (C_A _ (C_D _)) -> 181 
  C_A (C_B (C_D _) _) (C_B (C_A _ _) _) -> 182 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_B _ _) _) -> 183 
  C_A (C_A (C_C) (C_C)) (C_A (C_C) (C_B _ _)) -> 184 
  C_A (C_A _ (C_C)) (C_B (C_A _ _) _) -> 185 
  C_A (C_A (C_D _) (C_D _)) (C_A _ (C_D _)) -> 186 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_B _ _) (C_D _)) -> 187 
  C_A (C_A _ (C_D _)) (C_B _ _) -> 188 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_D _) _) -> 189 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_C) (C_D _)) -> 190 
  C_A (C_A _ (C_C)) (C_B (C_B _ _) _) -> 191 
  C_A (C_B (C_D _) _) (C_A (C_C) (C_C)) -> 192 
  C_A (C_A (C_C) (C_C)) (C_A (C_A _ _) (C_A _ _)) -> 193 
  C_A (C_A (C_D _) (C_C)) (C_A (C_A _ _) (C_C)) -> 194 
  C_A (C_B (C_B _ _) _) (C_A (C_D _) (C_A _ _)) -> 195 
  C_A _ (C_C) -> 196 
  C_A (C_C) (C_A (C_B _ _) (C_A _ _)) -> 197 
  C_A (C_A (C_A _ _) (C_D _)) (C_A _ (C_B _ _)) -> 198 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_B _ _) (C_B _ _)) -> 199 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_B _ _) _) -> 200 
  C_A (C_A (C_C) (C_A _ _)) (C_B (C_D _) _) -> 201 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_D _) (C_C)) -> 202 
  C_A (C_A (C_C) (C_C)) (C_C) -> 203 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_C) _) -> 204 
  C_A (C_A _ (C_C)) (C_A (C_A _ _) _) -> 205 
  C_A (C_A (C_C) _) (C_B (C_A _ _) _) -> 206 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_B _ _) (C_C)) -> 207 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_D _) (C_D _)) -> 208 
  C_A (C_A (C_B _ _) (C_D _)) (C_B (C_A _ _) _) -> 209 
  C_A (C_A (C_D _) (C_B _ _)) (C_A _ (C_C)) -> 210 
  C_A (C_B _ _) (C_A _ (C_A _ _)) -> 211 
  C_A (C_A (C_A _ _) _) (C_A (C_A _ _) (C_B _ _)) -> 212 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_B (C_B _ _) _) -> 213 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_C) (C_B _ _)) -> 214 
  C_A (C_C) (C_A _ (C_B _ _)) -> 215 
  C_A (C_A (C_C) (C_B _ _)) (C_B (C_D _) _) -> 216 
  C_A (C_A (C_A _ _) _) (C_A (C_D _) (C_C)) -> 217 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_C) (C_B _ _)) -> 218 
  C_A (C_A (C_C) (C_A _ _)) (C_A _ (C_D _)) -> 219 
  C_A _ (C_A (C_D _) _) -> 220 
  C_A (C_A (C_C) _) (C_A (C_A _ _) (C_C)) -> 221 
  C_A (C_B (C_B _ _) _) (C_A (C_C) _) -> 222 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_A _ _) (C_B _ _)) -> 223 
  C_A (C_A _ _) (C_A (C_C) (C_C)) -> 224 
  C_A (C_B _ _) (C_D _) -> 225 
  C_A (C_B (C_D _) _) (C_A (C_A _ _) (C_A _ _)) -> 226 
  C_A (C_C) (C_A (C_C) (C_C)) -> 227 
  C_A _ (C_A (C_C) (C_D _)) -> 228 
  C_A (C_A (C_A _ _) (C_C)) (C_B (C_D _) _) -> 229 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_B _ _) (C_D _)) -> 230 
  C_A (C_D _) (C_A _ (C_C)) -> 231 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_A _ _) (C_A _ _)) -> 232 
  C_A (C_B (C_C) _) (C_A (C_D _) (C_D _)) -> 233 
  C_A (C_A _ _) (C_A (C_B _ _) (C_A _ _)) -> 234 
  C_A (C_B (C_A _ _) _) (C_A (C_A _ _) (C_D _)) -> 235 
  C_A (C_A (C_D _) (C_C)) (C_A (C_B _ _) (C_B _ _)) -> 236 
  C_A (C_A (C_D _) _) _ -> 237 
  C_A (C_B (C_D _) _) (C_A (C_B _ _) (C_C)) -> 238 
  C_A (C_A _ (C_B _ _)) (C_B (C_D _) _) -> 239 
  C_A (C_B _ _) _ -> 240 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_B _ _) (C_D _)) -> 241 
  C_A _ (C_B (C_A _ _) _) -> 242 
  C_A (C_B (C_C) _) (C_A _ _) -> 243 
  C_A (C_A _ _) (C_A (C_C) (C_D _)) -> 244 
  C_A (C_A (C_C) _) (C_A _ _) -> 245 
  C_A (C_B (C_A _ _) _) _ -> 246 
  C_A (C_A (C_B _ _) _) (C_A (C_A _ _) (C_C)) -> 247 
  C_A (C_B (C_D _) _) (C_B (C_C) _) -> 248 
  C_A (C_A (C_C) _) (C_A (C_A _ _) _) -> 249 
  C_A (C_A (C_D _) (C_B _ _)) (C_B (C_A _ _) _) -> 250 
  C_A (C_A _ (C_B _ _)) (C_A (C_D _) (C_A _ _)) -> 251 
  C_A (C_A _ (C_A _ _)) (C_C) -> 252 
  C_A (C_A (C_A _ _) _) (C_A (C_B _ _) _) -> 253 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_B (C_C) _) -> 254 
  C_A (C_A _ (C_B _ _)) (C_A (C_C) _) -> 255 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_A _ _) (C_B _ _)) -> 256 
  C_A (C_A (C_C) _) (C_A (C_B _ _) (C_B _ _)) -> 257 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_D _) (C_B _ _)) -> 258 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_D _) -> 259 
  C_A (C_A (C_A _ _) (C_C)) (C_C) -> 260 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_B _ _) (C_C)) -> 261 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_C) -> 262 
  C_A (C_A (C_C) _) (C_A (C_C) (C_C)) -> 263 
  C_A (C_A (C_D _) (C_A _ _)) (C_A _ (C_A _ _)) -> 264 
  C_A (C_D _) (C_A (C_A _ _) (C_C)) -> 265 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_A _ _) (C_B _ _)) -> 266 
  C_A (C_B (C_A _ _) _) (C_B (C_A _ _) _) -> 267 
  C_A (C_A (C_C) (C_D _)) (C_A (C_A _ _) (C_B _ _)) -> 268 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A _ (C_C)) -> 269 
  C_A (C_A (C_D _) (C_A _ _)) (C_B (C_D _) _) -> 270 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_D _) (C_B _ _)) -> 271 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_A _ _) (C_B _ _)) -> 272 
  C_A (C_A (C_A _ _) _) (C_A (C_A _ _) (C_A _ _)) -> 273 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_B _ _) (C_B _ _)) -> 274 
  C_A (C_C) (C_A (C_A _ _) (C_B _ _)) -> 275 
  C_A (C_B (C_D _) _) (C_A (C_D _) (C_D _)) -> 276 
  C_A (C_A _ _) (C_A (C_A _ _) (C_A _ _)) -> 277 
  C_A (C_A (C_C) (C_C)) (C_A (C_A _ _) (C_B _ _)) -> 278 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_D _) (C_C)) -> 279 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_B _ _) _) -> 280 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_B _ _) (C_A _ _)) -> 281 
  C_A (C_A (C_B _ _) _) (C_A (C_B _ _) (C_B _ _)) -> 282 
  C_A (C_A (C_B _ _) (C_A _ _)) _ -> 283 
  C_A (C_A (C_D _) (C_C)) (C_A (C_A _ _) (C_A _ _)) -> 284 
  C_A (C_A (C_A _ _) (C_C)) (C_A _ (C_D _)) -> 285 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_A _ _) _) -> 286 
  C_A (C_A (C_D _) (C_C)) (C_C) -> 287 
  C_A (C_A _ (C_D _)) (C_A (C_D _) (C_C)) -> 288 
  C_A (C_B (C_C) _) (C_A _ (C_B _ _)) -> 289 
  C_A (C_B _ _) (C_B (C_B _ _) _) -> 290 
  C_A (C_A (C_A _ _) (C_D _)) (C_B (C_C) _) -> 291 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_A _ _) (C_A _ _)) -> 292 
  C_A (C_A (C_A _ _) _) (C_B (C_C) _) -> 293 
  C_A (C_C) (C_A _ (C_A _ _)) -> 294 
  C_A _ (C_A (C_C) (C_B _ _)) -> 295 
  C_A (C_B _ _) (C_B (C_A _ _) _) -> 296 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_B (C_A _ _) _) -> 297 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_B (C_D _) _) -> 298 
  C_A (C_A (C_D _) _) (C_A _ (C_C)) -> 299 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 300 
  C_A (C_A (C_B _ _) (C_C)) (C_C) -> 301 
  C_A (C_B (C_A _ _) _) (C_A (C_A _ _) (C_A _ _)) -> 302 
  C_A (C_A (C_D _) _) (C_A (C_C) (C_A _ _)) -> 303 
  C_A (C_C) (C_A (C_A _ _) (C_D _)) -> 304 
  C_A (C_D _) (C_A (C_A _ _) (C_B _ _)) -> 305 
  C_A (C_A (C_C) (C_C)) (C_A (C_D _) (C_D _)) -> 306 
  C_A (C_A (C_D _) (C_C)) (C_A (C_C) (C_A _ _)) -> 307 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_D _) (C_B _ _)) -> 308 
  C_A (C_D _) (C_A (C_B _ _) (C_C)) -> 309 
  C_A (C_A (C_A _ _) _) (C_A (C_D _) (C_B _ _)) -> 310 
  C_A (C_B (C_D _) _) (C_A (C_D _) (C_B _ _)) -> 311 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_B _ _) (C_D _)) -> 312 
  C_A (C_A _ (C_B _ _)) (C_A (C_A _ _) (C_D _)) -> 313 
  C_A (C_A (C_D _) _) (C_A _ _) -> 314 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_D _) (C_C)) -> 315 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A _ (C_A _ _)) -> 316 
  C_A (C_A (C_A _ _) _) (C_A _ (C_D _)) -> 317 
  C_A (C_A (C_C) _) (C_B (C_D _) _) -> 318 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_C) (C_C)) -> 319 
  C_A (C_B _ _) (C_A (C_A _ _) (C_A _ _)) -> 320 
  C_A (C_B (C_B _ _) _) (C_A _ (C_C)) -> 321 
  C_A (C_B _ _) (C_A (C_D _) (C_A _ _)) -> 322 
  C_A (C_A _ (C_C)) (C_A _ (C_A _ _)) -> 323 
  C_A _ (C_A (C_D _) (C_B _ _)) -> 324 
  C_A (C_A _ (C_C)) (C_A (C_A _ _) (C_A _ _)) -> 325 
  C_A (C_A (C_C) _) (C_A (C_C) (C_B _ _)) -> 326 
  C_A (C_A (C_D _) (C_D _)) (C_B (C_A _ _) _) -> 327 
  C_A (C_A (C_D _) (C_D _)) (C_B (C_D _) _) -> 328 
  C_A (C_A _ (C_D _)) (C_A (C_B _ _) (C_C)) -> 329 
  C_A (C_A (C_A _ _) _) (C_D _) -> 330 
  C_A (C_A (C_A _ _) (C_D _)) (C_B (C_A _ _) _) -> 331 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_C) (C_B _ _)) -> 332 
  C_A (C_A _ (C_D _)) (C_A (C_D _) (C_A _ _)) -> 333 
  C_A (C_A _ _) (C_B (C_C) _) -> 334 
  C_A (C_A _ (C_B _ _)) (C_D _) -> 335 
  C_A (C_B (C_B _ _) _) (C_C) -> 336 
  C_A (C_B (C_B _ _) _) (C_A (C_C) (C_B _ _)) -> 337 
  C_A (C_A (C_A _ _) _) (C_A (C_A _ _) (C_C)) -> 338 
  C_A (C_A (C_D _) _) (C_A (C_C) (C_C)) -> 339 
  C_A (C_A _ (C_A _ _)) (C_A (C_D _) _) -> 340 
  C_A (C_A (C_A _ _) _) (C_B (C_B _ _) _) -> 341 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A _ _) -> 342 
  C_A (C_A (C_D _) _) (C_A (C_C) (C_D _)) -> 343 
  C_A (C_A (C_A _ _) _) (C_A (C_C) (C_B _ _)) -> 344 
  C_A (C_A (C_C) (C_C)) (C_A (C_C) (C_C)) -> 345 
  C_A (C_D _) (C_A (C_C) (C_D _)) -> 346 
  C_A (C_A (C_A _ _) (C_D _)) (C_A _ (C_C)) -> 347 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_B _ _) -> 348 
  C_A (C_A (C_C) (C_D _)) (C_A (C_B _ _) (C_C)) -> 349 
  C_A (C_A _ (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 350 
  C_A (C_A (C_D _) (C_D _)) (C_B _ _) -> 351 
  C_A (C_A (C_D _) (C_C)) (C_A (C_D _) _) -> 352 
  C_A (C_A _ (C_D _)) (C_A (C_A _ _) _) -> 353 
  C_A (C_A (C_A _ _) _) (C_B (C_D _) _) -> 354 
  C_A (C_A (C_C) (C_C)) (C_A (C_D _) (C_B _ _)) -> 355 
  C_A (C_A (C_C) _) (C_A (C_B _ _) _) -> 356 
  C_A (C_A _ (C_C)) (C_A (C_C) (C_C)) -> 357 
  C_A (C_A (C_D _) (C_C)) (C_B (C_B _ _) _) -> 358 
  C_A (C_A (C_A _ _) _) (C_A (C_D _) (C_D _)) -> 359 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_C) (C_C)) -> 360 
  C_A (C_A _ (C_A _ _)) (C_B _ _) -> 361 
  C_A (C_A _ (C_C)) (C_A _ (C_C)) -> 362 
  C_A (C_A (C_A _ _) (C_C)) (C_B (C_C) _) -> 363 
  C_A _ (C_A (C_A _ _) (C_D _)) -> 364 
  C_A (C_D _) (C_A (C_A _ _) (C_A _ _)) -> 365 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_D _) (C_B _ _)) -> 366 
  C_A (C_B (C_A _ _) _) (C_A (C_A _ _) _) -> 367 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_C) (C_B _ _)) -> 368 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_C) (C_C)) -> 369 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_D _) (C_D _)) -> 370 
  C_A (C_B (C_C) _) (C_A _ (C_C)) -> 371 
  C_A (C_B (C_D _) _) (C_A (C_C) (C_A _ _)) -> 372 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_A _ _) (C_B _ _)) -> 373 
  C_A _ (C_A _ _) -> 374 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_B _ _) (C_C)) -> 375 
  C_A (C_A _ (C_D _)) (C_B (C_D _) _) -> 376 
  C_A (C_A (C_C) (C_A _ _)) (C_B (C_C) _) -> 377 
  C_A (C_A (C_D _) (C_B _ _)) (C_B _ _) -> 378 
  C_A (C_A (C_A _ _) (C_C)) (C_A _ (C_B _ _)) -> 379 
  C_A (C_A _ (C_B _ _)) _ -> 380 
  C_A (C_D _) (C_A (C_D _) (C_B _ _)) -> 381 
  C_A (C_A (C_A _ _) (C_C)) (C_B _ _) -> 382 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_C) -> 383 
  C_A (C_B (C_B _ _) _) (C_A (C_B _ _) (C_A _ _)) -> 384 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_B _ _) (C_D _)) -> 385 
  C_A (C_A _ _) (C_A (C_D _) (C_B _ _)) -> 386 
  C_A (C_A (C_D _) _) (C_A (C_B _ _) _) -> 387 
  C_A (C_A (C_C) _) (C_A _ (C_D _)) -> 388 
  C_A (C_A (C_D _) (C_C)) (C_A (C_C) _) -> 389 
