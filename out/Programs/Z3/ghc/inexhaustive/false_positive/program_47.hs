module Program_22 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) (B_A a) | C_B (B_A a) a | C_C | C_D Char

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_A (C_B _ _) (C_D _)) _ -> 0 
  C_A (C_A (C_A _ _) (C_A _ _)) _ -> 1 
  C_A (C_A (C_A _ _) _) (C_A (C_A _ _) (C_D _)) -> 2 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_A _ _) (C_A _ _)) -> 3 
  C_A (C_A (C_C) (C_C)) (C_B (C_B _ _) _) -> 4 
  C_A (C_A (C_C) (C_D _)) (C_A (C_A _ _) (C_C)) -> 5 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A _ (C_D _)) -> 6 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_C) (C_B _ _)) -> 7 
  C_A (C_A (C_C) (C_D _)) (C_A _ (C_C)) -> 8 
  C_A (C_B (C_B _ _) _) (C_A (C_C) (C_C)) -> 9 
  C_A (C_A (C_A _ _) _) (C_A _ (C_A _ _)) -> 10 
  C_A (C_C) (C_A (C_D _) (C_C)) -> 11 
  C_A (C_C) (C_A (C_C) (C_D _)) -> 12 
  C_A (C_A _ (C_D _)) (C_A _ (C_C)) -> 13 
  C_A (C_A (C_A _ _) (C_D _)) (C_A _ _) -> 14 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_B _ _) (C_A _ _)) -> 15 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_C) (C_B _ _)) -> 16 
  C_A (C_A (C_D _) (C_B _ _)) (C_A _ (C_D _)) -> 17 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_A _ _) (C_C)) -> 18 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_B _ _) (C_A _ _)) -> 19 
  C_A (C_A (C_D _) _) (C_A (C_D _) (C_A _ _)) -> 20 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_D _) (C_A _ _)) -> 21 
  C_A (C_A _ _) (C_A (C_B _ _) (C_D _)) -> 22 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A _ (C_D _)) -> 23 
  C_A (C_A (C_C) (C_D _)) (C_A (C_D _) (C_C)) -> 24 
  C_A (C_A (C_B _ _) _) (C_A (C_A _ _) _) -> 25 
  C_A (C_A (C_B _ _) (C_C)) _ -> 26 
  C_A (C_A (C_C) _) (C_A (C_D _) (C_A _ _)) -> 27 
  C_A (C_A (C_C) (C_C)) (C_A (C_D _) (C_A _ _)) -> 28 
  C_A (C_A (C_B _ _) (C_B _ _)) _ -> 29 
  C_A (C_A _ _) (C_A (C_B _ _) (C_C)) -> 30 
  C_A (C_A _ (C_C)) (C_A (C_C) (C_B _ _)) -> 31 
  C_A (C_A (C_B _ _) (C_C)) (C_B (C_C) _) -> 32 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_C) (C_C)) -> 33 
  C_A (C_A _ (C_A _ _)) (C_A (C_D _) (C_D _)) -> 34 
  C_A (C_B (C_A _ _) _) (C_A (C_D _) (C_C)) -> 35 
  C_A (C_A _ (C_D _)) (C_A _ (C_A _ _)) -> 36 
  C_A (C_B _ _) (C_A (C_C) _) -> 37 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_C) (C_C)) -> 38 
  C_A (C_A (C_A _ _) (C_D _)) (C_D _) -> 39 
  C_A (C_B (C_B _ _) _) (C_A (C_D _) (C_B _ _)) -> 40 
  C_A (C_A (C_D _) (C_C)) (C_A (C_A _ _) (C_B _ _)) -> 41 
  C_A (C_A _ (C_D _)) (C_B (C_B _ _) _) -> 42 
  C_A (C_A _ (C_B _ _)) (C_A (C_D _) (C_D _)) -> 43 
  C_A (C_A (C_B _ _) _) (C_A (C_A _ _) (C_A _ _)) -> 44 
  C_A (C_A (C_C) (C_B _ _)) (C_A _ (C_A _ _)) -> 45 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_B _ _) -> 46 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_B _ _) _) -> 47 
  C_A (C_B _ _) (C_A (C_A _ _) _) -> 48 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_B (C_C) _) -> 49 
  C_A (C_B (C_B _ _) _) (C_A _ (C_B _ _)) -> 50 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_A _ _) _) -> 51 
  C_A (C_B (C_B _ _) _) (C_A (C_B _ _) _) -> 52 
  C_A (C_B (C_C) _) (C_A (C_D _) _) -> 53 
  C_A (C_A (C_D _) (C_C)) (C_B (C_C) _) -> 54 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_C) (C_C)) -> 55 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_A _ _) (C_D _)) -> 56 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_B (C_A _ _) _) -> 57 
  C_A (C_B (C_D _) _) (C_A (C_B _ _) _) -> 58 
  C_A (C_A (C_C) (C_A _ _)) (C_D _) -> 59 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_B _ _) _) -> 60 
  C_A (C_B (C_A _ _) _) (C_A (C_B _ _) (C_D _)) -> 61 
  C_A (C_A (C_D _) (C_C)) (C_A (C_D _) (C_B _ _)) -> 62 
  C_A (C_B (C_A _ _) _) (C_A (C_D _) (C_D _)) -> 63 
  C_A (C_B (C_C) _) (C_A (C_A _ _) _) -> 64 
  C_A (C_A (C_A _ _) (C_D _)) (C_B (C_D _) _) -> 65 
  C_A _ (C_D _) -> 66 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_C) (C_D _)) -> 67 
  C_A (C_A (C_C) (C_C)) (C_B _ _) -> 68 
  C_A (C_A (C_D _) (C_A _ _)) (C_B (C_A _ _) _) -> 69 
  C_A (C_A _ (C_B _ _)) (C_B (C_A _ _) _) -> 70 
  C_A (C_A _ (C_C)) (C_A _ _) -> 71 
  C_A (C_B (C_A _ _) _) (C_A (C_A _ _) (C_B _ _)) -> 72 
  C_A (C_A (C_A _ _) (C_C)) (C_A _ (C_A _ _)) -> 73 
  C_A (C_D _) (C_A _ (C_D _)) -> 74 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_A _ _) (C_A _ _)) -> 75 
  C_A (C_A (C_C) (C_D _)) (C_C) -> 76 
  C_A (C_A (C_D _) (C_C)) (C_B (C_A _ _) _) -> 77 
  C_A (C_A _ _) (C_A _ (C_A _ _)) -> 78 
  C_A (C_C) (C_B _ _) -> 79 
  C_A (C_A _ (C_D _)) (C_A _ (C_D _)) -> 80 
  C_A (C_B (C_A _ _) _) (C_A (C_D _) (C_A _ _)) -> 81 
  C_A (C_A (C_D _) (C_A _ _)) (C_B _ _) -> 82 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_D _) (C_A _ _)) -> 83 
  C_A (C_A (C_D _) _) (C_A (C_A _ _) (C_A _ _)) -> 84 
  C_A (C_A (C_D _) (C_C)) (C_D _) -> 85 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_B _ _) (C_A _ _)) -> 86 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_B _ _) _) -> 87 
  C_A (C_A (C_C) (C_D _)) (C_A (C_D _) (C_A _ _)) -> 88 
  C_A (C_A (C_B _ _) _) (C_A _ (C_A _ _)) -> 89 
  C_A (C_A _ (C_B _ _)) (C_A _ (C_D _)) -> 90 
  C_A (C_A _ (C_B _ _)) (C_A (C_C) (C_D _)) -> 91 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_D _) (C_A _ _)) -> 92 
  C_A (C_A (C_D _) (C_C)) (C_B _ _) -> 93 
  C_A (C_A _ _) (C_A (C_A _ _) (C_C)) -> 94 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_B _ _) _) -> 95 
  C_A (C_A _ (C_D _)) (C_A _ (C_B _ _)) -> 96 
  C_A (C_A (C_D _) (C_C)) (C_A (C_B _ _) (C_C)) -> 97 
  C_A (C_B _ _) (C_A (C_A _ _) (C_B _ _)) -> 98 
  C_A (C_A _ (C_D _)) (C_C) -> 99 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_D _) (C_D _)) -> 100 
  C_A (C_A (C_D _) (C_C)) (C_A (C_B _ _) (C_D _)) -> 101 
  C_A (C_A (C_B _ _) (C_C)) (C_B (C_D _) _) -> 102 
  C_A (C_A (C_A _ _) _) _ -> 103 
  C_A (C_C) (C_A _ _) -> 104 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_A _ _) (C_C)) -> 105 
  C_A (C_A _ (C_C)) (C_A (C_D _) (C_D _)) -> 106 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A _ _) -> 107 
  C_A (C_A (C_A _ _) _) (C_A (C_C) (C_C)) -> 108 
  C_A (C_A (C_D _) _) (C_A (C_D _) _) -> 109 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_D _) (C_D _)) -> 110 
  C_A (C_A (C_A _ _) _) (C_B (C_A _ _) _) -> 111 
  C_A (C_D _) (C_D _) -> 112 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_B (C_B _ _) _) -> 113 
  C_A (C_A (C_C) (C_C)) (C_A (C_B _ _) (C_D _)) -> 114 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_D _) (C_D _)) -> 115 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_D _) _) -> 116 
  C_A (C_C) (C_A (C_A _ _) (C_C)) -> 117 
  C_A (C_B (C_A _ _) _) (C_A (C_B _ _) _) -> 118 
  C_A (C_A (C_A _ _) _) (C_A (C_D _) _) -> 119 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_A _ _) (C_D _)) -> 120 
  C_A (C_B (C_B _ _) _) (C_A (C_D _) (C_C)) -> 121 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_A _ _) _) -> 122 
  C_A (C_A _ (C_B _ _)) (C_A _ _) -> 123 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_A _ _) _) -> 124 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_B _ _) (C_A _ _)) -> 125 
  C_A (C_A (C_A _ _) _) (C_A (C_B _ _) (C_D _)) -> 126 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_C) (C_C)) -> 127 
  C_A (C_A (C_C) (C_C)) (C_A (C_B _ _) (C_A _ _)) -> 128 
  C_A (C_B (C_D _) _) (C_A (C_B _ _) (C_D _)) -> 129 
  C_A (C_A (C_D _) (C_D _)) (C_A _ _) -> 130 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_C) (C_A _ _)) -> 131 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_D _) (C_D _)) -> 132 
  C_A (C_B (C_B _ _) _) (C_A (C_C) (C_A _ _)) -> 133 
  C_A (C_B (C_D _) _) (C_A (C_A _ _) (C_B _ _)) -> 134 
  C_A (C_A (C_A _ _) _) (C_A (C_D _) (C_A _ _)) -> 135 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 136 
  C_A (C_A _ (C_B _ _)) (C_A (C_A _ _) (C_B _ _)) -> 137 
  C_A (C_B (C_C) _) (C_C) -> 138 
  C_A (C_A _ _) (C_B (C_D _) _) -> 139 
  C_A (C_A _ (C_C)) (C_C) -> 140 
  C_A (C_C) (C_A _ (C_C)) -> 141 
  C_A (C_A (C_D _) (C_B _ _)) (C_A _ (C_B _ _)) -> 142 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_B (C_A _ _) _) -> 143 
  C_A (C_A _ (C_D _)) (C_A (C_B _ _) (C_A _ _)) -> 144 
  C_A (C_A (C_D _) (C_C)) (C_A (C_C) (C_D _)) -> 145 
  C_A (C_A (C_C) (C_A _ _)) (C_A _ (C_A _ _)) -> 146 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_B _ _) (C_D _)) -> 147 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_C) (C_D _)) -> 148 
  C_A (C_A (C_D _) (C_D _)) (C_A (C_C) (C_D _)) -> 149 
  C_A (C_C) (C_A (C_B _ _) (C_D _)) -> 150 
  C_A (C_D _) (C_A _ (C_B _ _)) -> 151 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_C) _) -> 152 
  C_A (C_A (C_C) _) (C_B (C_B _ _) _) -> 153 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_D _) (C_A _ _)) -> 154 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_D _) (C_C)) -> 155 
  C_A (C_B (C_B _ _) _) (C_D _) -> 156 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_C) (C_D _)) -> 157 
  C_A (C_B _ _) (C_A (C_B _ _) (C_C)) -> 158 
  C_A (C_D _) _ -> 159 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_C) (C_D _)) -> 160 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_D _) (C_C)) -> 161 
  C_A (C_A (C_B _ _) _) (C_A (C_D _) (C_B _ _)) -> 162 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_D _) _) -> 163 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_B (C_B _ _) _) -> 164 
  C_A (C_B (C_C) _) (C_A (C_B _ _) (C_A _ _)) -> 165 
  C_A (C_A (C_D _) (C_D _)) (C_A _ (C_B _ _)) -> 166 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_D _) (C_D _)) -> 167 
  C_A (C_A (C_B _ _) (C_D _)) (C_A _ (C_B _ _)) -> 168 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_D _) (C_C)) -> 169 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_A _ _) (C_C)) -> 170 
  C_A (C_A _ (C_C)) (C_A (C_B _ _) (C_A _ _)) -> 171 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_B _ _) (C_A _ _)) -> 172 
  C_A (C_C) (C_B (C_A _ _) _) -> 173 
  C_A (C_B (C_D _) _) (C_A (C_D _) (C_A _ _)) -> 174 
  C_A (C_A (C_D _) (C_C)) (C_A _ (C_D _)) -> 175 
  C_A (C_A _ (C_A _ _)) (C_A (C_C) (C_A _ _)) -> 176 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_C) (C_A _ _)) -> 177 
  C_A (C_C) (C_B (C_C) _) -> 178 
  C_A (C_A (C_C) (C_C)) (C_B (C_C) _) -> 179 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_B _ _) (C_C)) -> 180 
  C_A (C_A (C_B _ _) (C_A _ _)) (C_A (C_B _ _) (C_C)) -> 181 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_A _ _) (C_A _ _)) -> 182 
  C_A (C_A (C_B _ _) _) (C_D _) -> 183 
  C_A _ (C_A (C_A _ _) (C_B _ _)) -> 184 
  C_A (C_A (C_B _ _) (C_C)) (C_A _ (C_B _ _)) -> 185 
  C_A (C_A _ (C_C)) (C_A (C_B _ _) _) -> 186 
  C_A (C_A _ (C_C)) (C_A (C_D _) (C_A _ _)) -> 187 
  C_A _ (C_A (C_B _ _) (C_C)) -> 188 
  C_A (C_A (C_B _ _) _) (C_B _ _) -> 189 
  C_A (C_A (C_D _) (C_D _)) (C_C) -> 190 
  C_A (C_A (C_C) (C_B _ _)) (C_A (C_D _) (C_C)) -> 191 
  C_A (C_B (C_C) _) _ -> 192 
  C_A (C_B (C_C) _) (C_A (C_C) (C_A _ _)) -> 193 
  C_A (C_B (C_D _) _) (C_B (C_D _) _) -> 194 
  C_A (C_A (C_C) _) (C_A (C_D _) (C_C)) -> 195 
  C_A (C_A (C_C) (C_A _ _)) (C_B (C_B _ _) _) -> 196 
  C_A (C_A (C_C) (C_C)) (C_A _ (C_D _)) -> 197 
  C_A (C_A _ (C_B _ _)) (C_A (C_A _ _) _) -> 198 
  C_A (C_B (C_A _ _) _) (C_A _ (C_A _ _)) -> 199 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_B _ _) (C_B _ _)) -> 200 
  C_A (C_A (C_A _ _) (C_D _)) _ -> 201 
  C_A (C_A (C_C) (C_D _)) (C_B _ _) -> 202 
  C_A (C_A _ (C_B _ _)) (C_A (C_D _) (C_B _ _)) -> 203 
  C_A _ (C_A (C_C) (C_C)) -> 204 
  C_A (C_C) (C_A (C_B _ _) (C_C)) -> 205 
  C_A (C_A _ (C_A _ _)) (C_A (C_C) (C_B _ _)) -> 206 
  C_A (C_A (C_C) (C_D _)) (C_A _ _) -> 207 
  C_A (C_B _ _) (C_A (C_C) (C_C)) -> 208 
  C_A (C_A (C_D _) _) (C_A (C_D _) (C_C)) -> 209 
  C_A (C_B (C_B _ _) _) (C_B (C_A _ _) _) -> 210 
  C_A (C_B _ _) (C_A (C_D _) _) -> 211 
  C_A (C_A _ _) (C_A (C_B _ _) (C_B _ _)) -> 212 
  C_A (C_B (C_D _) _) (C_A (C_D _) _) -> 213 
  C_A _ (C_A (C_A _ _) (C_A _ _)) -> 214 
  C_A (C_A (C_B _ _) (C_C)) (C_A (C_A _ _) _) -> 215 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_C) _) -> 216 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_B _ _) (C_A _ _)) -> 217 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_D _) (C_C)) -> 218 
  C_A (C_A (C_D _) _) (C_A (C_B _ _) (C_C)) -> 219 
  C_A (C_A _ (C_D _)) (C_A _ _) -> 220 
  C_A (C_A _ (C_C)) (C_A (C_A _ _) (C_B _ _)) -> 221 
  C_A (C_A (C_D _) (C_A _ _)) (C_B (C_B _ _) _) -> 222 
  C_A (C_A _ (C_A _ _)) (C_A (C_A _ _) (C_D _)) -> 223 
  C_A (C_A (C_C) (C_D _)) (C_A (C_C) (C_D _)) -> 224 
  C_A (C_B (C_D _) _) (C_A (C_A _ _) (C_C)) -> 225 
  C_A (C_D _) (C_B (C_D _) _) -> 226 
  C_A (C_A (C_D _) (C_A _ _)) (C_A (C_A _ _) (C_D _)) -> 227 
  C_A (C_A _ _) (C_A (C_D _) (C_A _ _)) -> 228 
  C_A (C_B (C_A _ _) _) (C_A _ _) -> 229 
  C_A (C_C) (C_C) -> 230 
  C_A (C_A (C_B _ _) (C_D _)) (C_A (C_A _ _) _) -> 231 
  C_A (C_A (C_B _ _) _) (C_A _ (C_D _)) -> 232 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_B (C_D _) _) -> 233 
  C_A (C_B (C_C) _) (C_A (C_B _ _) (C_B _ _)) -> 234 
  C_A (C_B (C_A _ _) _) (C_A _ (C_D _)) -> 235 
  C_A (C_A (C_C) (C_D _)) (C_A (C_C) _) -> 236 
  C_A (C_A _ _) (C_D _) -> 237 
  C_A (C_A (C_B _ _) (C_C)) (C_A _ _) -> 238 
  C_A (C_A (C_C) (C_C)) (C_B (C_A _ _) _) -> 239 
  C_A _ (C_A (C_B _ _) (C_A _ _)) -> 240 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_D _) _) -> 241 
  C_A _ (C_A (C_A _ _) _) -> 242 
  C_A (C_A (C_A _ _) _) (C_A (C_C) (C_D _)) -> 243 
  C_A (C_A (C_C) (C_A _ _)) (C_A (C_B _ _) (C_A _ _)) -> 244 
  C_A (C_C) _ -> 245 
  C_A (C_A _ (C_B _ _)) (C_A (C_B _ _) _) -> 246 
  C_A (C_A (C_B _ _) (C_B _ _)) (C_A (C_D _) (C_A _ _)) -> 247 
  C_A (C_A _ (C_A _ _)) (C_A _ (C_C)) -> 248 
  C_A (C_A (C_A _ _) (C_C)) (C_A (C_B _ _) _) -> 249 
  C_A (C_A (C_B _ _) (C_C)) (C_D _) -> 250 
  C_A _ (C_B (C_C) _) -> 251 
  C_A (C_A (C_C) (C_C)) (C_A _ _) -> 252 
  C_A (C_A _ (C_C)) (C_B (C_D _) _) -> 253 
  C_A (C_A (C_A _ _) _) (C_A _ (C_B _ _)) -> 254 
  C_A (C_A (C_C) _) (C_A (C_C) (C_A _ _)) -> 255 
  C_A (C_A (C_A _ _) (C_D _)) (C_A (C_D _) (C_B _ _)) -> 256 
  C_A (C_A (C_A _ _) (C_B _ _)) (C_A (C_C) (C_C)) -> 257 
  C_A (C_A (C_C) _) (C_A _ (C_A _ _)) -> 258 
