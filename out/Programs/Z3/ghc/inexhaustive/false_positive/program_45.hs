module Program_20 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) (B_A a) | C_B (B_A a) a | C_C | C_D Char

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_D _ -> 1 
  C_B (C_A _ (C_C)) _ -> 2 
  C_B (C_A (C_D _) (C_D _)) _ -> 3 
  C_B (C_A (C_C) (C_D _)) _ -> 4 
  C_B (C_A (C_B _ _) (C_C)) _ -> 5 
  C_B (C_A (C_C) (C_A _ _)) _ -> 6 
  C_B (C_A (C_B _ _) _) _ -> 7 
  C_B (C_A (C_A _ _) _) _ -> 8 
  C_B (C_A (C_D _) (C_A _ _)) _ -> 9 
  C_B (C_A (C_C) (C_B _ _)) _ -> 10 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_B (C_D _) _) -> 11 
  C_A (C_A (C_B _ _) _) (C_A (C_C) _) -> 12 
  C_A (C_A (C_C) (C_C)) (C_A _ (C_A _ _)) -> 13 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_D _) _) -> 14 
  C_A (C_A _ (C_B _ _)) (C_A (C_B _ _) (C_C)) -> 15 
  C_A (C_A (C_B _ _) (C_C)) (C_B _ _) -> 16 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_D _) (C_A _ _)) -> 17 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_A _ _) (C_A _ _)) -> 18 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_C) (C_A _ _)) -> 19 
  C_A (C_A (C_C) (C_D _)) (C_A (C_B _ _) (C_D _)) -> 20 
  C_A (C_D _) (C_A (C_A _ _) _) -> 21 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_D _) (C_B _ _)) -> 22 
  C_A (C_A (C_B _ _) _) (C_A (C_C) (C_A _ _)) -> 23 
  C_A (C_B (C_A _ _) _) (C_A (C_C) (C_D _)) -> 24 
  C_A (C_A (C_C) _) (C_A (C_B _ _) (C_D _)) -> 25 
  C_A (C_B (C_C) _) (C_A (C_C) _) -> 26 
  C_A (C_A (C_C) (C_D _)) (C_A (C_A _ _) (C_D _)) -> 27 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_B _ _) _) -> 28 
  C_A (C_A _ _) (C_A _ (C_D _)) -> 29 
  C_A (C_B (C_B _ _) _) (C_A (C_A _ _) (C_A _ _)) -> 30 
  C_A (C_D _) (C_A (C_D _) _) -> 31 
  C_A (C_A (C_C) (C_A _ _)) _ -> 32 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_A _ _) (C_D _)) -> 33 
  C_A (C_A (C_D _) (C_C)) (C_A (C_B _ _) (C_A _ _)) -> 34 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_A _ _) (C_D _)) -> 35 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_C) _) -> 36 
  C_A (C_A _ _) (C_A (C_A _ _) (C_D _)) -> 37 
  C_A (C_A (C_B _ _) _) (C_A (C_C) (C_D _)) -> 38 
  C_A _ (C_A (C_D _) (C_C)) -> 39 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 40 
  C_A (C_B (C_C) _) (C_A (C_A _ _) (C_A _ _)) -> 41 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_C) (C_A _ _)) -> 42 
  C_A (C_A (C_D _) _) (C_A _ (C_A _ _)) -> 43 
  C_A (C_A (C_D _) (C_C)) (C_A (C_D _) (C_C)) -> 44 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_A _ _) (C_C)) -> 45 
  C_A (C_A (C_C) _) (C_A (C_C) (C_D _)) -> 46 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_A _ _) (C_C)) -> 47 
  C_A (C_B _ _) (C_A (C_C) (C_A _ _)) -> 48 
  C_A (C_A (C_C) (C_D _)) (C_A (C_B _ _) _) -> 49 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_C) _) -> 50 
  C_A (C_A (C_A _ _) (C_C)) _ -> 51 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A _ _) -> 52 
  C_A (C_A _ (C_D _)) (C_A (C_A _ _) (C_C)) -> 53 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_B _ _) (C_B _ _)) -> 54 
  C_A (C_B (C_D _) _) (C_A (C_C) _) -> 55 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_A _ _) (C_D _)) -> 56 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_D _) (C_C)) -> 57 
  C_A (C_B (C_B _ _) _) (C_A (C_C) (C_D _)) -> 58 
  C_A (C_A (C_D _) _) (C_A (C_C) _) -> 59 
  C_A (C_A (C_D _) (C_C)) (C_B (C_D _) _) -> 60 
  C_A (C_B (C_B _ _) _) _ -> 61 
  C_A (C_B (C_C) _) (C_A (C_C) (C_D _)) -> 62 
  C_A (C_A _ (C_D _)) (C_A (C_B _ _) _) -> 63 
  C_A (C_D _) (C_A (C_D _) (C_A _ _)) -> 64 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_D _) _) -> 65 
  C_A (C_B (C_D _) _) _ -> 66 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_B _ _) _) -> 67 
  C_A (C_A _ (C_B _ _)) (C_A (C_A _ _) (C_A _ _)) -> 68 
  C_A (C_A _ (C_A _ _)) (C_A (C_C) (C_C)) -> 69 
  C_A (C_B (C_A _ _) _) (C_A (C_D _) _) -> 70 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A _ (C_A _ _)) -> 71 
  C_A (C_A (C_C) (C_D _)) (C_A _ (C_A _ _)) -> 72 
  C_A (C_A _ (C_A _ _)) (C_A (C_D _) (C_C)) -> 73 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_C) _) -> 74 
  C_A (C_A (C_B _ _) _) (C_A (C_C) (C_B _ _)) -> 75 
  C_A (C_C) (C_B (C_D _) _) -> 76 
  C_A (C_A _ _) (C_A (C_C) (C_A _ _)) -> 77 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A _ (C_B _ _)) -> 78 
  C_A (C_A (C_C) _) (C_A (C_D _) (C_D _)) -> 79 
  C_A (C_B (C_B _ _) _) (C_B (C_B _ _) _) -> 80 
  C_A (C_A (C_A _ _) (C_C)) (C_A _ (C_C)) -> 81 
  C_A (C_D _) (C_A (C_C) _) -> 82 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_C) (C_A _ _)) -> 83 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_A _ _) (C_D _)) -> 84 
  C_A (C_A _ (C_B _ _)) (C_A (C_D _) (C_C)) -> 85 
  C_A _ (C_A (C_C) (C_A _ _)) -> 86 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_D _) -> 87 
  C_A (C_A (C_B _ _) (C_D _)) (C_A _ (C_D _)) -> 88 
  C_A (C_B (C_C) _) (C_A (C_C) (C_C)) -> 89 
  C_A (C_A (C_B _ _) (C_D _)) (C_B (C_D _) _) -> 90 
  C_A (C_A (C_C) (C_D _)) (C_A (C_D _) _) -> 91 
  C_A (C_A (C_C) (C_A _ _)) (C_A _ _) -> 92 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_B _ _) -> 93 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_D _) (C_A _ _)) -> 94 
  C_A (C_D _) (C_A (C_B _ _) (C_B _ _)) -> 95 
  C_A (C_A _ (C_C)) (C_A _ (C_D _)) -> 96 
  C_A (C_A (C_B _ _) _) (C_B (C_B _ _) _) -> 97 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_A _ _) (C_D _)) -> 98 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_D _) (C_B _ _)) -> 99 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_B _ _) (C_C)) -> 100 
  C_A (C_A (C_A _ _) _) (C_A (C_C) (C_A _ _)) -> 101 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A _ (C_B _ _)) -> 102 
  C_A (C_A _ (C_C)) (C_D _) -> 103 
  C_A (C_A (C_C) (C_B _ _)) (C_B (C_B _ _) _) -> 104 
  C_A _ (C_A (C_D _) (C_A _ _)) -> 105 
  C_A (C_B (C_D _) _) (C_D _) -> 106 
  C_A (C_A (C_B _ _) _) (C_A (C_D _) (C_D _)) -> 107 
  C_A (C_A _ (C_C)) (C_A (C_B _ _) (C_B _ _)) -> 108 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_C) _) -> 109 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_B _ _) (C_B _ _)) -> 110 
  C_A (C_A (C_C) _) (C_D _) -> 111 
  C_A (C_A (C_A _ _) (C_D _)) (C_B (C_B _ _) _) -> 112 
  C_A (C_B (C_A _ _) _) (C_A (C_A _ _) (C_C)) -> 113 
  C_A (C_A (C_D _) (C_B _ _)) _ -> 114 
  C_A (C_A _ (C_C)) (C_A (C_C) (C_D _)) -> 115 
  C_A (C_A (C_C) (C_C)) (C_A _ (C_B _ _)) -> 116 
  C_A (C_A (C_B _ _) _) (C_A (C_A _ _) (C_B _ _)) -> 117 
  C_A (C_C) (C_A (C_C) _) -> 118 
  C_A (C_B (C_A _ _) _) (C_A (C_C) (C_B _ _)) -> 119 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_D _) -> 120 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_A _ _) (C_B _ _)) -> 121 
  C_A (C_A (C_C) (C_B _ _)) (C_A _ (C_C)) -> 122 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_D _) (C_B _ _)) -> 123 
  C_A (C_A (C_C) (C_C)) (C_A (C_B _ _) (C_B _ _)) -> 124 
  C_A (C_A (C_C) (C_C)) (C_A (C_C) _) -> 125 
  C_A (C_B (C_A _ _) _) (C_A (C_B _ _) (C_C)) -> 126 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_B _ _) (C_B _ _)) -> 127 
  C_A (C_A (C_B _ _) (C_D _)) (C_B (C_B _ _) _) -> 128 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_A _ _) (C_B _ _)) -> 129 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_C) (C_B _ _)) -> 130 
  C_A (C_A (C_D _) _) (C_A (C_D _) (C_B _ _)) -> 131 
  C_A (C_B (C_C) _) (C_B _ _) -> 132 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_A _ _) (C_D _)) -> 133 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_C) _) -> 134 
  C_A (C_A (C_C) (C_B _ _)) (C_A _ (C_B _ _)) -> 135 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A _ (C_C)) -> 136 
  C_A (C_A (C_B _ _) _) (C_A _ (C_B _ _)) -> 137 
  C_A (C_A (C_C) (C_D _)) (C_D _) -> 138 
  C_A (C_A _ (C_A _ _)) (C_A (C_D _) (C_A _ _)) -> 139 
  C_A (C_B (C_D _) _) (C_B _ _) -> 140 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_C) (C_B _ _)) -> 141 
  C_A (C_B (C_C) _) (C_B (C_B _ _) _) -> 142 
  C_A (C_A _ _) (C_B (C_B _ _) _) -> 143 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_C) (C_B _ _)) -> 144 
  C_A (C_A (C_C) (C_A _ _)) (C_B _ _) -> 145 
  C_A (C_C) (C_A (C_B _ _) (C_B _ _)) -> 146 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_D _) (C_C)) -> 147 
  C_A (C_C) (C_B (C_B _ _) _) -> 148 
  C_A (C_A _ (C_C)) (C_B _ _) -> 149 
  C_A _ (C_A (C_C) _) -> 150 
  C_A (C_B (C_B _ _) _) (C_B (C_D _) _) -> 151 
  C_A (C_A (C_D _) _) (C_B (C_A _ _) _) -> 152 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_C) (C_A _ _)) -> 153 
  C_A (C_A (C_B _ _) _) (C_C) -> 154 
  C_A _ _ -> 155 
  C_A (C_B (C_A _ _) _) (C_A _ (C_C)) -> 156 
  C_A (C_A (C_B _ _) (C_D _)) _ -> 157 
  C_A (C_A (C_D _) _) (C_C) -> 158 
  C_A (C_A (C_C) (C_D _)) (C_A (C_B _ _) (C_B _ _)) -> 159 
  C_A (C_A _ (C_A _ _)) (C_B (C_C) _) -> 160 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_C) (C_A _ _)) -> 161 
  C_A (C_A _ (C_D _)) (C_B (C_A _ _) _) -> 162 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_A _ _) _) -> 163 
  C_A (C_A (C_C) _) (C_A (C_D _) (C_B _ _)) -> 164 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_C) -> 165 
  C_A (C_A (C_D _) (C_D _)) _ -> 166 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_C) (C_A _ _)) -> 167 
  C_A _ (C_A (C_B _ _) _) -> 168 
  C_A (C_C) (C_A (C_C) (C_B _ _)) -> 169 
  C_A (C_A (C_D _) (C_C)) (C_A (C_C) (C_B _ _)) -> 170 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A _ (C_B _ _)) -> 171 
  C_A (C_D _) (C_A (C_B _ _) (C_D _)) -> 172 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_C) (C_C)) -> 173 
  C_A (C_B (C_A _ _) _) (C_A (C_C) (C_A _ _)) -> 174 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_C) (C_A _ _)) -> 175 
  C_A (C_A _ _) (C_B _ _) -> 176 
  C_A (C_A _ (C_D _)) (C_D _) -> 177 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_C) (C_C)) -> 178 
  C_A (C_A (C_A _ _) (C_D _)) (C_A _ (C_A _ _)) -> 179 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_B (C_B _ _) _) -> 180 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_C) -> 181 
  C_A (C_A _ (C_A _ _)) (C_A (C_D _) (C_B _ _)) -> 182 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_C) (C_B _ _)) -> 183 
  C_A (C_A (C_C) (C_D _)) (C_A (C_C) (C_B _ _)) -> 184 
  C_A (C_A (C_D _) (C_D _)) (C_A _ (C_A _ _)) -> 185 
  C_A (C_B (C_D _) _) (C_A (C_C) (C_D _)) -> 186 
  C_A (C_A (C_C) (C_C)) (C_A (C_B _ _) (C_C)) -> 187 
  C_A (C_D _) (C_A (C_C) (C_B _ _)) -> 188 
  C_A (C_B _ _) (C_B (C_D _) _) -> 189 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_B _ _) (C_C)) -> 190 
  C_A (C_A (C_D _) (C_B _ _)) (C_A _ _) -> 191 
  C_A (C_A (C_C) _) (C_A (C_A _ _) (C_B _ _)) -> 192 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_A _ _) (C_C)) -> 193 
  C_A (C_A (C_D _) (C_A _ _)) (C_A _ _) -> 194 
  C_A (C_B (C_B _ _) _) (C_A (C_A _ _) (C_B _ _)) -> 195 
  C_A (C_A _ (C_B _ _)) (C_A _ (C_B _ _)) -> 196 
  C_A (C_A (C_B _ _) _) (C_A _ (C_C)) -> 197 
  C_A (C_B (C_C) _) (C_A (C_A _ _) (C_C)) -> 198 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_B _ _) -> 199 
  C_A (C_B (C_C) _) (C_A (C_A _ _) (C_D _)) -> 200 
  C_A (C_A _ (C_A _ _)) (C_B (C_A _ _) _) -> 201 
  C_A (C_B (C_C) _) (C_A _ (C_A _ _)) -> 202 
  C_A (C_A (C_B _ _) _) (C_B (C_A _ _) _) -> 203 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_B _ _) (C_C)) -> 204 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_D _) (C_C)) -> 205 
  C_A (C_A (C_D _) (C_C)) (C_A (C_C) (C_C)) -> 206 
  C_A (C_A (C_D _) (C_D _)) (C_A _ (C_C)) -> 207 
  C_A (C_D _) (C_B _ _) -> 208 
  C_A (C_B (C_C) _) (C_A (C_B _ _) _) -> 209 
  C_A (C_A (C_B _ _) (C_C)) (C_A _ (C_D _)) -> 210 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_C) (C_B _ _)) -> 211 
  C_A (C_A _ _) (C_A _ _) -> 212 
  C_A (C_A (C_A _ _) _) (C_A (C_C) _) -> 213 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_A _ _) (C_B _ _)) -> 214 
  C_A (C_A (C_C) _) _ -> 215 
  C_A (C_A _ _) (C_A (C_C) _) -> 216 
  C_A (C_A (C_C) (C_D _)) (C_B (C_C) _) -> 217 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_A _ _) (C_A _ _)) -> 218 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_B _ _) (C_B _ _)) -> 219 
  C_A (C_A (C_C) (C_D _)) (C_B (C_B _ _) _) -> 220 
  C_A (C_B _ _) (C_A _ (C_B _ _)) -> 221 
  C_A (C_A (C_D _) _) (C_A (C_B _ _) (C_B _ _)) -> 222 
  C_A (C_A _ (C_C)) (C_A (C_A _ _) (C_C)) -> 223 
  C_A (C_A (C_C) (C_B _ _)) (C_A _ (C_D _)) -> 224 
  C_A (C_A (C_C) (C_B _ _)) (C_D _) -> 225 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A _ (C_A _ _)) -> 226 
  C_A (C_B (C_D _) _) (C_A _ (C_D _)) -> 227 
  C_A (C_A (C_A _ _) _) (C_A (C_A _ _) _) -> 228 
  C_A (C_A (C_D _) (C_A _ _)) (C_C) -> 229 
  C_A (C_B _ _) (C_C) -> 230 
  C_A (C_A (C_C) (C_C)) (C_A (C_A _ _) (C_C)) -> 231 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_A _ _) (C_C)) -> 232 
  C_A (C_A (C_C) (C_D _)) (C_B (C_A _ _) _) -> 233 
  C_A (C_A (C_B _ _) _) (C_A (C_D _) (C_C)) -> 234 
  C_A (C_A (C_B _ _) (C_D _)) (C_A _ _) -> 235 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_B _ _) (C_A _ _)) -> 236 
  C_A (C_A (C_C) (C_D _)) (C_A _ (C_D _)) -> 237 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_B _ _) (C_C)) -> 238 
  C_A (C_A (C_C) (C_D _)) (C_A (C_C) (C_C)) -> 239 
  C_A (C_A _ (C_A _ _)) (C_D _) -> 240 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_A _ _) (C_A _ _)) -> 241 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_D _) -> 242 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_D _) _) -> 243 
  C_A (C_C) (C_A (C_D _) _) -> 244 
  C_A (C_B (C_A _ _) _) (C_C) -> 245 
  C_A (C_A (C_D _) _) (C_A _ (C_B _ _)) -> 246 
  C_A (C_A (C_B _ _) (C_C)) (C_A _ (C_C)) -> 247 
  C_A (C_B (C_C) _) (C_B (C_A _ _) _) -> 248 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 249 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_D _) (C_B _ _)) -> 250 
  C_A (C_A _ (C_D _)) (C_A (C_D _) _) -> 251 
  C_A (C_A _ (C_B _ _)) (C_B _ _) -> 252 
  C_A (C_B (C_D _) _) (C_A _ (C_B _ _)) -> 253 
  C_A (C_A _ _) _ -> 254 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_C) (C_D _)) -> 255 
  C_A (C_A (C_B _ _) _) (C_A (C_B _ _) (C_C)) -> 256 
  C_A (C_A _ (C_C)) (C_A (C_A _ _) (C_D _)) -> 257 
  C_A (C_A (C_C) (C_C)) (C_A (C_C) (C_A _ _)) -> 258 
  C_A (C_A _ (C_A _ _)) (C_B (C_D _) _) -> 259 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_D _) (C_D _)) -> 260 
  C_A (C_A (C_C) (C_D _)) (C_A _ (C_B _ _)) -> 261 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_B (C_C) _) -> 262 
  C_A (C_A (C_C) (C_C)) (C_A (C_D _) (C_C)) -> 263 
  C_A _ (C_B (C_B _ _) _) -> 264 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_B _ _) (C_B _ _)) -> 265 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_C) (C_D _)) -> 266 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_D _) _) -> 267 
  C_A (C_A _ (C_C)) (C_A (C_B _ _) (C_D _)) -> 268 
  C_A (C_A _ (C_B _ _)) (C_C) -> 269 
  C_A (C_A (C_A _ _) _) (C_A (C_B _ _) (C_B _ _)) -> 270 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_B (C_D _) _) -> 271 
  C_A (C_A _ (C_A _ _)) _ -> 272 
  C_A (C_A (C_A _ _) (C_D _)) (C_B _ _) -> 273 
  C_A (C_D _) (C_A (C_B _ _) (C_A _ _)) -> 274 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_C) (C_B _ _)) -> 275 
  C_A (C_A (C_D _) _) (C_B (C_C) _) -> 276 
  C_A (C_A (C_C) (C_D _)) (C_A (C_B _ _) (C_A _ _)) -> 277 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_D _) (C_B _ _)) -> 278 
  C_A (C_A (C_A _ _) _) (C_A _ _) -> 279 
  C_A (C_A (C_C) _) (C_A _ (C_C)) -> 280 
  C_A (C_A _ (C_D _)) (C_A (C_D _) (C_D _)) -> 281 
  C_A (C_A (C_D _) _) (C_A (C_C) (C_B _ _)) -> 282 
  C_A (C_B (C_A _ _) _) (C_B _ _) -> 283 
  C_A (C_A (C_C) (C_D _)) (C_B (C_D _) _) -> 284 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_C) _) -> 285 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_B _ _) (C_A _ _)) -> 286 
  C_A (C_A _ (C_A _ _)) (C_A (C_A _ _) (C_C)) -> 287 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_D _) (C_B _ _)) -> 288 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_D _) (C_B _ _)) -> 289 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_B _ _) (C_D _)) -> 290 
  C_A (C_A _ (C_B _ _)) (C_B (C_C) _) -> 291 
  C_A (C_A _ (C_D _)) (C_A (C_C) _) -> 292 
  C_A (C_D _) (C_B (C_C) _) -> 293 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_A _ _) (C_D _)) -> 294 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A _ (C_C)) -> 295 
  C_A (C_A (C_C) _) (C_A (C_A _ _) (C_D _)) -> 296 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_B _ _) (C_C)) -> 297 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_A _ _) (C_B _ _)) -> 298 
  C_A (C_C) (C_A (C_C) (C_A _ _)) -> 299 
  C_A (C_B (C_D _) _) (C_A (C_B _ _) (C_A _ _)) -> 300 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_B _ _) _) -> 301 
  C_A (C_B (C_A _ _) _) (C_B (C_B _ _) _) -> 302 
  C_A (C_A (C_D _) (C_C)) (C_A (C_A _ _) _) -> 303 
  C_A (C_D _) (C_A (C_C) (C_C)) -> 304 
  C_A _ (C_B _ _) -> 305 
  C_A (C_A _ (C_A _ _)) (C_A _ _) -> 306 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_B _ _) (C_C)) -> 307 
  C_A (C_A _ (C_B _ _)) (C_A _ (C_C)) -> 308 
  C_A (C_A (C_C) (C_A _ _)) (C_A _ (C_B _ _)) -> 309 
  C_A (C_A _ (C_B _ _)) (C_A (C_D _) _) -> 310 
  C_A (C_A (C_B _ _) (C_C)) (C_A _ (C_A _ _)) -> 311 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_C) (C_A _ _)) -> 312 
  C_A (C_B _ _) (C_A (C_C) (C_D _)) -> 313 
  C_A (C_A (C_D _) (C_C)) (C_A (C_D _) (C_A _ _)) -> 314 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A _ (C_D _)) -> 315 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A _ (C_C)) -> 316 
  C_A (C_A (C_A _ _) (C_D _)) (C_A _ (C_D _)) -> 317 
  C_A (C_B (C_B _ _) _) (C_A _ (C_A _ _)) -> 318 
  C_A (C_A (C_D _) _) (C_B (C_D _) _) -> 319 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_A _ _) (C_B _ _)) -> 320 
  C_A (C_A (C_C) (C_A _ _)) (C_B (C_A _ _) _) -> 321 
  C_A (C_A _ (C_B _ _)) (C_A (C_C) (C_A _ _)) -> 322 
  C_A (C_A (C_A _ _) (C_C)) (C_B (C_A _ _) _) -> 323 
  C_A (C_B (C_D _) _) (C_A _ (C_C)) -> 324 
  C_A (C_B (C_B _ _) _) (C_A (C_A _ _) _) -> 325 
  C_A (C_A (C_C) (C_C)) (C_B (C_D _) _) -> 326 
  C_A (C_C) (C_A (C_D _) (C_D _)) -> 327 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_B _ _) (C_A _ _)) -> 328 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_A _ _) (C_C)) -> 329 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_A _ _) (C_D _)) -> 330 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_C) (C_A _ _)) -> 331 
  C_A (C_A (C_C) (C_C)) (C_D _) -> 332 
  C_A (C_A (C_D _) (C_D _)) (C_B (C_B _ _) _) -> 333 
  C_A (C_A (C_B _ _) _) (C_A _ _) -> 334 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_D _) (C_A _ _)) -> 335 
  C_A (C_C) (C_A (C_D _) (C_A _ _)) -> 336 
  C_A (C_D _) (C_A (C_B _ _) _) -> 337 
  C_A (C_A (C_A _ _) (C_D _)) (C_C) -> 338 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_D _) (C_A _ _)) -> 339 
  C_A (C_A _ (C_C)) (C_B (C_C) _) -> 340 
  C_A (C_B (C_C) _) (C_B (C_C) _) -> 341 
  C_A (C_A _ (C_A _ _)) (C_A (C_A _ _) _) -> 342 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A _ _) -> 343 
  C_A (C_A (C_D _) (C_B _ _)) (C_A _ (C_A _ _)) -> 344 
  C_A (C_A _ (C_C)) (C_A (C_C) (C_A _ _)) -> 345 
  C_A (C_B (C_C) _) (C_A (C_D _) (C_C)) -> 346 
  C_A (C_A _ (C_C)) (C_A (C_B _ _) (C_C)) -> 347 
  C_A (C_B (C_D _) _) (C_A _ _) -> 348 
  C_A (C_A _ _) (C_A _ (C_B _ _)) -> 349 
  C_A (C_A _ (C_D _)) (C_A (C_B _ _) (C_B _ _)) -> 350 
  C_A (C_A _ (C_A _ _)) (C_A (C_B _ _) (C_A _ _)) -> 351 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_A _ _) _) -> 352 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_A _ _) (C_B _ _)) -> 353 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A _ (C_D _)) -> 354 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_D _) (C_A _ _)) -> 355 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_D _) (C_C)) -> 356 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_C) (C_D _)) -> 357 
  C_A (C_A (C_C) _) (C_A (C_A _ _) (C_A _ _)) -> 358 
  C_A (C_B (C_A _ _) _) (C_A (C_B _ _) (C_B _ _)) -> 359 
  C_A (C_A (C_D _) (C_D _)) (C_D _) -> 360 
  C_A (C_D _) (C_A (C_D _) (C_C)) -> 361 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_D _) (C_A _ _)) -> 362 
  C_A _ (C_A (C_B _ _) (C_B _ _)) -> 363 
  C_A (C_A (C_C) (C_B _ _)) (C_C) -> 364 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_D _) (C_C)) -> 365 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A _ (C_B _ _)) -> 366 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_B _ _) (C_D _)) -> 367 
  C_A (C_B (C_D _) _) (C_A (C_A _ _) (C_D _)) -> 368 
  C_A (C_A (C_A _ _) (C_B _ _)) _ -> 369 
  C_A (C_A (C_D _) (C_B _ _)) (C_C) -> 370 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_B _ _) _) -> 371 
  C_A (C_B (C_A _ _) _) (C_A (C_B _ _) (C_A _ _)) -> 372 
  C_A (C_A (C_A _ _) _) (C_A _ (C_C)) -> 373 
  C_A (C_A (C_C) _) (C_A (C_C) _) -> 374 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_C) (C_D _)) -> 375 
  C_A (C_A (C_B _ _) _) (C_A (C_A _ _) (C_D _)) -> 376 
  C_A (C_A _ (C_B _ _)) (C_A (C_C) (C_C)) -> 377 
  C_A (C_B (C_A _ _) _) (C_D _) -> 378 
  C_A (C_A (C_D _) _) (C_A (C_B _ _) (C_A _ _)) -> 379 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_B _ _) (C_B _ _)) -> 380 
  C_A (C_B _ _) (C_A (C_D _) (C_C)) -> 381 
  C_A (C_D _) (C_A (C_A _ _) (C_D _)) -> 382 
  C_A (C_C) (C_A (C_D _) (C_B _ _)) -> 383 
  C_A (C_B (C_D _) _) (C_A _ (C_A _ _)) -> 384 
  C_A (C_C) (C_A (C_A _ _) _) -> 385 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_A _ _) _) -> 386 
  C_A _ (C_A _ (C_C)) -> 387 
  C_A (C_A (C_C) (C_B _ _)) (C_B (C_C) _) -> 388 
  C_A (C_A (C_A _ _) _) (C_A (C_B _ _) (C_A _ _)) -> 389 
  C_A (C_B (C_B _ _) _) (C_B _ _) -> 390 
  C_A (C_B (C_D _) _) (C_A (C_C) (C_B _ _)) -> 391 
  C_A (C_A (C_C) (C_B _ _)) (C_A _ _) -> 392 
  C_A (C_A (C_D _) _) (C_B _ _) -> 393 
  C_A (C_A (C_B _ _) _) (C_A (C_B _ _) _) -> 394 
  C_A (C_A (C_C) (C_A _ _)) (C_A _ (C_C)) -> 395 
  C_A (C_B (C_A _ _) _) (C_A (C_D _) (C_B _ _)) -> 396 
  C_A (C_A (C_C) (C_D _)) (C_A (C_C) (C_A _ _)) -> 397 
  C_A (C_D _) (C_A (C_D _) (C_D _)) -> 398 
  C_A (C_A (C_B _ _) _) (C_A (C_B _ _) (C_D _)) -> 399 
  C_A (C_A _ (C_D _)) (C_A (C_A _ _) (C_B _ _)) -> 400 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_B _ _) (C_B _ _)) -> 401 
  C_A (C_A (C_A _ _) (C_C)) (C_A _ _) -> 402 
  C_A (C_A _ _) (C_A _ (C_C)) -> 403 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_A _ _) (C_B _ _)) -> 404 
  C_A (C_B _ _) (C_A (C_B _ _) _) -> 405 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_D _) (C_A _ _)) -> 406 
  C_A (C_A (C_D _) (C_A _ _)) (C_A _ (C_D _)) -> 407 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_D _) (C_D _)) -> 408 
  C_A (C_A (C_C) _) (C_B (C_C) _) -> 409 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_B (C_C) _) -> 410 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_A _ _) _) -> 411 
  C_A (C_A _ (C_B _ _)) (C_A (C_C) (C_B _ _)) -> 412 
  C_A (C_A (C_D _) _) (C_A (C_A _ _) (C_D _)) -> 413 
  C_A (C_B _ _) (C_A (C_D _) (C_B _ _)) -> 414 
  C_A (C_A (C_C) (C_D _)) (C_A (C_A _ _) (C_A _ _)) -> 415 
  C_A (C_A _ (C_A _ _)) (C_A (C_B _ _) (C_C)) -> 416 
  C_A (C_A (C_C) (C_C)) (C_A (C_B _ _) _) -> 417 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_B _ _) (C_A _ _)) -> 418 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_B _ _) (C_B _ _)) -> 419 
  C_A (C_A (C_C) (C_A _ _)) (C_C) -> 420 
  C_A (C_A (C_C) (C_C)) (C_A (C_A _ _) (C_D _)) -> 421 
  C_A (C_A _ (C_D _)) (C_A (C_C) (C_C)) -> 422 
  C_A (C_B (C_D _) _) (C_A (C_D _) (C_C)) -> 423 
  C_A (C_A _ _) (C_A (C_C) (C_B _ _)) -> 424 
  C_A (C_A _ (C_D _)) (C_A (C_D _) (C_B _ _)) -> 425 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_D _) (C_D _)) -> 426 
  C_A (C_A _ _) (C_A (C_D _) (C_C)) -> 427 
  C_A (C_A (C_C) _) (C_B _ _) -> 428 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_A _ _) (C_C)) -> 429 
  C_A (C_A _ (C_B _ _)) (C_A (C_A _ _) (C_C)) -> 430 
  C_A (C_C) (C_A (C_A _ _) (C_A _ _)) -> 431 
  C_A (C_A (C_D _) (C_C)) (C_A (C_B _ _) _) -> 432 
  C_A (C_A (C_D _) (C_A _ _)) (C_A _ (C_B _ _)) -> 433 
  C_A (C_A (C_D _) (C_A _ _)) _ -> 434 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_D _) (C_B _ _)) -> 435 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A _ (C_A _ _)) -> 436 
  C_A (C_A _ (C_A _ _)) (C_A (C_C) (C_D _)) -> 437 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_A _ _) (C_B _ _)) -> 438 
  C_A (C_D _) (C_B (C_A _ _) _) -> 439 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_A _ _) (C_C)) -> 440 
  C_A (C_A (C_D _) _) (C_A (C_D _) (C_D _)) -> 441 
  C_A _ (C_A _ (C_D _)) -> 442 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_A _ _) (C_D _)) -> 443 
  C_A (C_A (C_B _ _) (C_D _)) (C_B (C_C) _) -> 444 
  C_A (C_D _) (C_A _ (C_A _ _)) -> 445 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_A _ _) (C_C)) -> 446 
  C_A (C_B (C_B _ _) _) (C_A _ (C_D _)) -> 447 
  C_A (C_B _ _) (C_A (C_B _ _) (C_A _ _)) -> 448 
  C_A (C_B _ _) (C_A _ (C_D _)) -> 449 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_C) _) -> 450 
  C_A (C_B (C_D _) _) (C_B (C_B _ _) _) -> 451 
  C_A (C_B (C_C) _) (C_B (C_D _) _) -> 452 
  C_A _ (C_B (C_D _) _) -> 453 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_D _) (C_A _ _)) -> 454 
  C_A (C_A (C_D _) (C_C)) (C_A (C_D _) (C_D _)) -> 455 
  C_A (C_A (C_D _) (C_C)) (C_A _ _) -> 456 
  C_A (C_A (C_D _) _) (C_B (C_B _ _) _) -> 457 
  C_A (C_A (C_B _ _) (C_C)) (C_B (C_A _ _) _) -> 458 
  C_A (C_A _ (C_A _ _)) (C_A _ (C_A _ _)) -> 459 
  C_A (C_A (C_C) (C_C)) _ -> 460 
  C_A (C_A _ _) (C_B (C_A _ _) _) -> 461 
  C_A (C_A _ _) (C_A (C_A _ _) (C_B _ _)) -> 462 
  C_A (C_B (C_C) _) (C_A (C_B _ _) (C_C)) -> 463 
  C_A (C_B (C_C) _) (C_A (C_A _ _) (C_B _ _)) -> 464 
  C_A (C_A (C_C) _) (C_A _ (C_B _ _)) -> 465 
