module Program_23 () where 

main = print $ show v_b
data B_A a = C_A a a | C_B | C_C a (B_A a) | C_D (B_A a) (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C _ (C_D (C_B) (C_A _ _)) -> 1 
  C_C _ (C_D (C_B) (C_B)) -> 2 
  C_C _ (C_D (C_D _ _) (C_D _ _)) -> 3 
  C_C _ (C_D (C_C _ _) (C_D _ _)) -> 4 
  C_C _ (C_D _ (C_A _ _)) -> 5 
  C_C _ (C_A _ _) -> 6 
  C_C _ (C_D (C_C _ _) _) -> 7 
  C_C _ (C_D (C_A _ _) (C_D _ _)) -> 8 
  C_C _ (C_C _ (C_B)) -> 9 
  C_C _ (C_D (C_A _ _) (C_A _ _)) -> 10 
  C_C _ (C_D (C_B) _) -> 11 
  C_C _ (C_D (C_D _ _) (C_B)) -> 12 
  C_C _ _ -> 13 
  C_C _ (C_D (C_B) (C_D _ _)) -> 14 
  C_C _ (C_D (C_B) (C_C _ _)) -> 15 
  C_C _ (C_D (C_A _ _) (C_C _ _)) -> 16 
  C_C _ (C_D (C_C _ _) (C_C _ _)) -> 17 
  C_C _ (C_D _ (C_C _ _)) -> 18 
  C_C _ (C_B) -> 19 
  C_C _ (C_C _ (C_C _ _)) -> 20 
  C_C _ (C_D (C_D _ _) (C_A _ _)) -> 21 
  C_C _ (C_D (C_A _ _) (C_B)) -> 22 
  C_C _ (C_D (C_D _ _) _) -> 23 
  C_C _ (C_C _ _) -> 24 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_B) (C_D _ _)) -> 25 
  C_D (C_D _ (C_C _ _)) (C_C _ (C_C _ _)) -> 26 
  C_D (C_D (C_D _ _) _) (C_D (C_A _ _) (C_D _ _)) -> 27 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D _ _) -> 28 
  C_D (C_C _ (C_D _ _)) (C_D _ (C_B)) -> 29 
  C_D (C_D _ _) (C_C _ (C_C _ _)) -> 30 
  C_D (C_D (C_C _ _) _) (C_D _ (C_D _ _)) -> 31 
  C_D (C_D (C_A _ _) (C_B)) (C_C _ (C_C _ _)) -> 32 
  C_D (C_D _ (C_D _ _)) (C_D (C_C _ _) _) -> 33 
  C_D (C_D (C_C _ _) (C_D _ _)) _ -> 34 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_C _ _) _) -> 35 
  C_D (C_D (C_B) _) (C_D (C_C _ _) (C_B)) -> 36 
  C_D (C_D (C_B) _) (C_B) -> 37 
  C_D (C_D _ _) (C_D (C_B) (C_D _ _)) -> 38 
  C_D (C_D (C_D _ _) _) (C_D _ (C_D _ _)) -> 39 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_B) _) -> 40 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_B) _) -> 41 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_C _ _) _) -> 42 
  C_D (C_D (C_A _ _) _) (C_D (C_B) (C_A _ _)) -> 43 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_C _ _) (C_A _ _)) -> 44 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_A _ _) (C_C _ _)) -> 45 
  C_D (C_D _ (C_A _ _)) (C_C _ (C_A _ _)) -> 46 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_C _ (C_B)) -> 47 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_C _ (C_B)) -> 48 
  C_D (C_B) (C_C _ _) -> 49 
  C_D (C_D (C_C _ _) _) (C_D (C_C _ _) (C_C _ _)) -> 50 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_D _ _) (C_D _ _)) -> 51 
  C_D (C_C _ (C_B)) (C_D _ (C_B)) -> 52 
  C_D (C_D _ (C_B)) (C_C _ (C_B)) -> 53 
  C_D (C_C _ (C_B)) (C_A _ _) -> 54 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_C _ (C_D _ _)) -> 55 
  C_D (C_D (C_B) _) (C_D (C_B) (C_D _ _)) -> 56 
  C_D (C_D (C_B) (C_B)) (C_D _ _) -> 57 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_A _ _) (C_A _ _)) -> 58 
  C_D (C_D (C_B) _) (C_D (C_A _ _) _) -> 59 
  C_D (C_D _ _) (C_D (C_C _ _) (C_B)) -> 60 
  C_D (C_D _ (C_C _ _)) (C_D (C_C _ _) (C_D _ _)) -> 61 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_D _ _) (C_A _ _)) -> 62 
  C_D (C_D (C_D _ _) _) (C_D (C_C _ _) (C_A _ _)) -> 63 
  C_D (C_D (C_B) _) (C_D (C_B) _) -> 64 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_B) _) -> 65 
  C_D (C_D (C_B) (C_B)) (C_D (C_A _ _) (C_C _ _)) -> 66 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_B) _) -> 67 
  C_D (C_D _ (C_D _ _)) (C_D (C_B) (C_C _ _)) -> 68 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_C _ _) _) -> 69 
  C_D (C_D _ (C_A _ _)) (C_D _ (C_C _ _)) -> 70 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_C _ _) (C_A _ _)) -> 71 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_D _ _) (C_A _ _)) -> 72 
  C_D (C_C _ (C_C _ _)) (C_D (C_D _ _) (C_A _ _)) -> 73 
  C_D (C_D (C_D _ _) _) (C_D (C_B) _) -> 74 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D _ (C_B)) -> 75 
  C_D (C_D (C_C _ _) (C_B)) (C_C _ (C_A _ _)) -> 76 
  C_D (C_D _ (C_D _ _)) (C_D (C_B) _) -> 77 
  C_D (C_D (C_B) (C_B)) (C_D (C_C _ _) (C_C _ _)) -> 78 
  C_D (C_D (C_D _ _) _) (C_D (C_C _ _) (C_C _ _)) -> 79 
  C_D (C_C _ (C_C _ _)) (C_D (C_A _ _) (C_A _ _)) -> 80 
  C_D (C_C _ _) (C_D (C_D _ _) (C_B)) -> 81 
  C_D (C_C _ (C_D _ _)) _ -> 82 
  C_D _ _ -> 83 
  C_D (C_D (C_C _ _) _) (C_D (C_B) _) -> 84 
  C_D (C_D _ (C_A _ _)) (C_D (C_B) (C_C _ _)) -> 85 
  C_D (C_C _ (C_D _ _)) (C_D (C_B) (C_A _ _)) -> 86 
  C_D (C_D (C_B) _) (C_D _ (C_C _ _)) -> 87 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_B) (C_C _ _)) -> 88 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D _ (C_D _ _)) -> 89 
  C_D (C_C _ _) (C_A _ _) -> 90 
  C_D (C_D (C_B) (C_B)) (C_C _ _) -> 91 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_A _ _) -> 92 
  C_D (C_D (C_D _ _) (C_D _ _)) _ -> 93 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_C _ _) (C_A _ _)) -> 94 
  C_D (C_C _ (C_A _ _)) (C_D (C_C _ _) _) -> 95 
  C_D (C_D _ (C_A _ _)) (C_D (C_D _ _) (C_D _ _)) -> 96 
  C_D (C_C _ (C_D _ _)) (C_C _ (C_C _ _)) -> 97 
  C_D (C_D _ (C_B)) (C_D (C_D _ _) (C_B)) -> 98 
  C_D (C_D _ _) (C_D (C_B) _) -> 99 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_C _ (C_B)) -> 100 
  C_D (C_C _ (C_A _ _)) (C_D (C_C _ _) (C_C _ _)) -> 101 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_A _ _) (C_C _ _)) -> 102 
  C_D (C_D (C_D _ _) _) (C_D (C_A _ _) (C_A _ _)) -> 103 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D _ (C_B)) -> 104 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_C _ _) (C_B)) -> 105 
  C_D (C_D (C_B) (C_D _ _)) (C_D _ (C_B)) -> 106 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_B) (C_B)) -> 107 
  C_D (C_D (C_B) (C_C _ _)) (C_C _ (C_B)) -> 108 
  C_D (C_B) (C_D (C_B) (C_B)) -> 109 
  C_D (C_D (C_C _ _) _) (C_C _ (C_C _ _)) -> 110 
  C_D (C_D (C_B) (C_B)) (C_D (C_D _ _) (C_B)) -> 111 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_A _ _) (C_D _ _)) -> 112 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_C _ (C_D _ _)) -> 113 
  C_D (C_D _ (C_C _ _)) (C_D (C_B) (C_B)) -> 114 
  C_D (C_D _ (C_D _ _)) (C_D (C_C _ _) (C_D _ _)) -> 115 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_C _ _) (C_D _ _)) -> 116 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_C _ _) _) -> 117 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D _ (C_B)) -> 118 
  C_D (C_D (C_D _ _) (C_C _ _)) _ -> 119 
  C_D (C_D _ (C_A _ _)) (C_D (C_D _ _) _) -> 120 
  C_D (C_D _ (C_A _ _)) (C_C _ (C_B)) -> 121 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_A _ _) (C_D _ _)) -> 122 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_D _ _) (C_C _ _)) -> 123 
  C_D (C_C _ (C_C _ _)) (C_D (C_B) (C_C _ _)) -> 124 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_C _ _) (C_D _ _)) -> 125 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D _ _) -> 126 
  C_D (C_C _ (C_B)) (C_D (C_C _ _) (C_C _ _)) -> 127 
  C_D (C_D _ (C_C _ _)) (C_D (C_C _ _) _) -> 128 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_C _ (C_D _ _)) -> 129 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_D _ _) _) -> 130 
  C_D (C_D (C_B) (C_A _ _)) (C_D _ (C_B)) -> 131 
  C_D (C_D (C_C _ _) (C_B)) (C_C _ _) -> 132 
  C_D _ (C_D (C_A _ _) (C_C _ _)) -> 133 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_B) _) -> 134 
  C_D (C_D (C_B) (C_D _ _)) (C_A _ _) -> 135 
  C_D (C_D (C_B) (C_C _ _)) (C_C _ (C_C _ _)) -> 136 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_B) (C_C _ _)) -> 137 
  C_D (C_D _ (C_A _ _)) (C_D (C_C _ _) (C_A _ _)) -> 138 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_D _ _) _) -> 139 
  C_D (C_D (C_C _ _) (C_B)) (C_A _ _) -> 140 
  C_D (C_C _ (C_C _ _)) (C_C _ (C_C _ _)) -> 141 
  C_D (C_D (C_B) _) (C_C _ (C_B)) -> 142 
  C_D (C_B) (C_D (C_D _ _) (C_A _ _)) -> 143 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_B) (C_C _ _)) -> 144 
  C_D (C_D _ (C_B)) (C_C _ (C_C _ _)) -> 145 
  C_D (C_D _ (C_D _ _)) (C_D (C_B) (C_D _ _)) -> 146 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_A _ _) (C_C _ _)) -> 147 
  C_D (C_D (C_B) (C_B)) (C_D (C_D _ _) (C_C _ _)) -> 148 
  C_D (C_C _ (C_B)) (C_D (C_C _ _) (C_A _ _)) -> 149 
  C_D (C_C _ (C_A _ _)) (C_D _ (C_B)) -> 150 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_C _ _) (C_A _ _)) -> 151 
  C_D (C_C _ (C_D _ _)) (C_D (C_C _ _) (C_A _ _)) -> 152 
  C_D (C_C _ (C_A _ _)) (C_C _ (C_D _ _)) -> 153 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_B) (C_C _ _)) -> 154 
  C_D (C_D (C_B) (C_D _ _)) (C_C _ (C_C _ _)) -> 155 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_C _ _) _) -> 156 
  C_D (C_D (C_C _ _) _) (C_D (C_D _ _) _) -> 157 
  C_D (C_C _ (C_A _ _)) (C_D _ (C_D _ _)) -> 158 
  C_D _ (C_C _ (C_A _ _)) -> 159 
  C_D (C_D (C_D _ _) _) (C_D _ (C_B)) -> 160 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_C _ _) (C_B)) -> 161 
  C_D (C_D _ _) (C_D _ _) -> 162 
  C_D (C_B) (C_D _ (C_D _ _)) -> 163 
  C_D (C_C _ (C_A _ _)) (C_D (C_A _ _) (C_C _ _)) -> 164 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_A _ _) (C_B)) -> 165 
  C_D (C_B) (C_D _ _) -> 166 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_B) _) -> 167 
  C_D (C_D (C_A _ _) _) (C_D _ (C_D _ _)) -> 168 
  C_D _ (C_D _ (C_A _ _)) -> 169 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_C _ _) _) -> 170 
  C_D (C_D _ (C_A _ _)) (C_C _ (C_D _ _)) -> 171 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_C _ _) (C_C _ _)) -> 172 
  C_D (C_D (C_B) (C_A _ _)) (C_C _ (C_B)) -> 173 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_A _ _) (C_D _ _)) -> 174 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_D _ _) (C_C _ _)) -> 175 
  C_D (C_C _ (C_C _ _)) (C_D (C_A _ _) (C_B)) -> 176 
  C_D (C_D (C_B) (C_B)) (C_D (C_B) (C_A _ _)) -> 177 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_B) (C_A _ _)) -> 178 
  C_D (C_B) (C_D (C_A _ _) (C_A _ _)) -> 179 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_D _ _) (C_A _ _)) -> 180 
  C_D (C_C _ (C_C _ _)) (C_D (C_C _ _) (C_A _ _)) -> 181 
  C_D (C_D (C_B) (C_C _ _)) _ -> 182 
  C_D _ (C_D (C_C _ _) _) -> 183 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_C _ _) (C_D _ _)) -> 184 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_B) (C_B)) -> 185 
  C_D (C_D _ (C_A _ _)) (C_C _ (C_C _ _)) -> 186 
  C_D _ (C_D (C_B) (C_B)) -> 187 
  C_D (C_D (C_A _ _) (C_B)) (C_D _ (C_B)) -> 188 
  C_D (C_D (C_C _ _) _) (C_D (C_A _ _) _) -> 189 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_B) (C_B)) -> 190 
  C_D (C_D _ (C_B)) (C_C _ _) -> 191 
  C_D (C_D (C_C _ _) _) (C_D (C_A _ _) (C_D _ _)) -> 192 
  C_D (C_C _ (C_A _ _)) (C_D (C_B) (C_B)) -> 193 
  C_D (C_C _ _) (C_D (C_B) (C_D _ _)) -> 194 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D _ (C_D _ _)) -> 195 
  C_D (C_D (C_C _ _) _) (C_D (C_C _ _) _) -> 196 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_A _ _) _) -> 197 
  C_D (C_C _ (C_C _ _)) (C_D (C_B) (C_A _ _)) -> 198 
  C_D (C_D (C_C _ _) _) (C_D (C_D _ _) (C_D _ _)) -> 199 
  C_D (C_D (C_A _ _) _) (C_D (C_D _ _) (C_A _ _)) -> 200 
  C_D (C_C _ (C_D _ _)) (C_D (C_D _ _) (C_B)) -> 201 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_D _ _) (C_C _ _)) -> 202 
  C_D (C_A _ _) (C_D (C_C _ _) _) -> 203 
  C_D (C_C _ (C_D _ _)) (C_D (C_B) _) -> 204 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D _ (C_D _ _)) -> 205 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_B) _) -> 206 
  C_D (C_D (C_C _ _) (C_A _ _)) _ -> 207 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_A _ _) -> 208 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_B) (C_C _ _)) -> 209 
  C_D (C_C _ _) (C_D (C_A _ _) (C_B)) -> 210 
  C_D (C_B) (C_C _ (C_B)) -> 211 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_B) _) -> 212 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_C _ _) _) -> 213 
  C_D (C_A _ _) (C_C _ (C_A _ _)) -> 214 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_A _ _) (C_B)) -> 215 
  C_D (C_B) (C_D (C_D _ _) _) -> 216 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_B) _) -> 217 
  C_D (C_C _ (C_A _ _)) (C_D (C_A _ _) (C_B)) -> 218 
  C_D (C_D (C_A _ _) (C_C _ _)) _ -> 219 
  C_D (C_C _ (C_C _ _)) (C_D (C_A _ _) (C_D _ _)) -> 220 
  C_D (C_D (C_B) (C_C _ _)) (C_A _ _) -> 221 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_D _ _) (C_B)) -> 222 
  C_D (C_C _ (C_C _ _)) (C_D (C_A _ _) _) -> 223 
  C_D (C_D _ (C_A _ _)) (C_D (C_D _ _) (C_B)) -> 224 
  C_D (C_D (C_B) _) (C_D (C_B) (C_B)) -> 225 
  C_D (C_D _ (C_A _ _)) (C_D (C_B) (C_D _ _)) -> 226 
  C_D (C_D (C_B) (C_D _ _)) (C_B) -> 227 
  C_D (C_D (C_B) _) (C_D (C_A _ _) (C_C _ _)) -> 228 
  C_D (C_C _ _) (C_D _ (C_B)) -> 229 
  C_D (C_D (C_A _ _) _) (C_C _ (C_D _ _)) -> 230 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D _ (C_D _ _)) -> 231 
  C_D (C_D _ (C_C _ _)) (C_D (C_C _ _) (C_A _ _)) -> 232 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_A _ _) (C_B)) -> 233 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_C _ _) (C_C _ _)) -> 234 
  C_D (C_D _ (C_C _ _)) (C_D _ (C_C _ _)) -> 235 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_B) (C_C _ _)) -> 236 
  C_D (C_D _ (C_B)) (C_D (C_D _ _) _) -> 237 
  C_D (C_D (C_C _ _) _) (C_A _ _) -> 238 
  C_D (C_D (C_A _ _) _) (C_D (C_C _ _) (C_B)) -> 239 
  C_D (C_C _ (C_D _ _)) (C_D (C_A _ _) (C_A _ _)) -> 240 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_D _ _) (C_A _ _)) -> 241 
  C_D (C_D (C_C _ _) _) (C_D _ (C_A _ _)) -> 242 
  C_D (C_D (C_B) _) (C_A _ _) -> 243 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_B) (C_A _ _)) -> 244 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_B) (C_A _ _)) -> 245 
  C_D (C_D _ (C_B)) (C_D (C_A _ _) _) -> 246 
  C_D (C_D _ (C_C _ _)) (C_D (C_A _ _) (C_B)) -> 247 
  C_D (C_C _ (C_B)) (C_C _ (C_B)) -> 248 
  C_D (C_D _ (C_C _ _)) (C_C _ (C_A _ _)) -> 249 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_B) (C_B)) -> 250 
  C_D (C_C _ (C_B)) (C_D (C_A _ _) (C_D _ _)) -> 251 
  C_D (C_D _ _) (C_D (C_A _ _) (C_C _ _)) -> 252 
  C_D _ (C_D (C_C _ _) (C_C _ _)) -> 253 
  C_D (C_C _ (C_C _ _)) (C_C _ (C_D _ _)) -> 254 
  C_D (C_D (C_D _ _) _) (C_D (C_A _ _) (C_C _ _)) -> 255 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_C _ _) -> 256 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_C _ _) (C_D _ _)) -> 257 
  C_D (C_D (C_A _ _) (C_B)) (C_D _ (C_C _ _)) -> 258 
  C_D _ (C_D (C_D _ _) _) -> 259 
  C_D (C_C _ (C_D _ _)) (C_C _ (C_A _ _)) -> 260 
  C_D (C_C _ (C_C _ _)) (C_C _ (C_A _ _)) -> 261 
  C_D (C_C _ (C_B)) _ -> 262 
  C_D (C_D _ (C_A _ _)) (C_D _ (C_D _ _)) -> 263 
  C_D (C_B) (C_C _ (C_D _ _)) -> 264 
  C_D (C_C _ (C_B)) (C_D (C_A _ _) (C_B)) -> 265 
  C_D (C_D (C_B) _) (C_D _ (C_B)) -> 266 
  C_D (C_D (C_B) (C_B)) (C_D (C_A _ _) _) -> 267 
  C_D (C_B) (C_D _ (C_B)) -> 268 
  C_D (C_D (C_A _ _) (C_B)) _ -> 269 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_A _ _) (C_C _ _)) -> 270 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_D _ _) (C_B)) -> 271 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_B) -> 272 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_A _ _) (C_A _ _)) -> 273 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_C _ _) (C_C _ _)) -> 274 
  C_D (C_D _ (C_A _ _)) (C_D (C_C _ _) _) -> 275 
  C_D (C_C _ _) (C_D (C_D _ _) (C_D _ _)) -> 276 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_C _ _) -> 277 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_D _ _) (C_B)) -> 278 
  C_D _ (C_D (C_A _ _) (C_B)) -> 279 
  C_D (C_D (C_C _ _) (C_B)) (C_D _ (C_A _ _)) -> 280 
  C_D (C_C _ (C_C _ _)) (C_D (C_B) (C_B)) -> 281 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_B) -> 282 
  C_D (C_D _ (C_A _ _)) (C_D (C_A _ _) _) -> 283 
  C_D (C_D _ (C_B)) (C_D (C_C _ _) (C_C _ _)) -> 284 
  C_D _ (C_D _ (C_C _ _)) -> 285 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D _ (C_A _ _)) -> 286 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_C _ _) (C_C _ _)) -> 287 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_B) -> 288 
  C_D (C_D _ (C_D _ _)) (C_D (C_D _ _) (C_B)) -> 289 
  C_D (C_A _ _) (C_D (C_B) (C_A _ _)) -> 290 
  C_D (C_C _ (C_B)) (C_D _ (C_C _ _)) -> 291 
  C_D (C_D (C_D _ _) (C_B)) (C_D _ (C_D _ _)) -> 292 
  C_D (C_A _ _) (C_D _ (C_D _ _)) -> 293 
  C_D (C_D (C_A _ _) (C_B)) (C_D _ (C_A _ _)) -> 294 
  C_D (C_C _ _) (C_D (C_C _ _) (C_A _ _)) -> 295 
  C_D (C_D (C_B) (C_B)) (C_D (C_A _ _) (C_B)) -> 296 
  C_D (C_D (C_A _ _) (C_B)) (C_C _ (C_B)) -> 297 
  C_D (C_D (C_A _ _) _) (C_D (C_C _ _) (C_C _ _)) -> 298 
  C_D (C_D (C_D _ _) (C_B)) (C_C _ _) -> 299 
  C_D (C_D (C_B) (C_B)) (C_D _ (C_B)) -> 300 
  C_D (C_D (C_B) _) _ -> 301 
  C_D (C_D _ (C_A _ _)) (C_D (C_D _ _) (C_C _ _)) -> 302 
  C_D (C_C _ _) (C_D (C_B) (C_A _ _)) -> 303 
  C_D (C_C _ (C_A _ _)) (C_D _ (C_A _ _)) -> 304 
  C_D (C_D (C_D _ _) _) (C_D (C_D _ _) _) -> 305 
  C_D (C_C _ (C_D _ _)) (C_C _ (C_B)) -> 306 
  C_D (C_C _ _) (C_C _ (C_D _ _)) -> 307 
  C_D (C_C _ (C_C _ _)) (C_D _ (C_D _ _)) -> 308 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D _ (C_A _ _)) -> 309 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_A _ _) (C_B)) -> 310 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_D _ _) (C_A _ _)) -> 311 
  C_D (C_D _ (C_D _ _)) (C_D _ (C_D _ _)) -> 312 
  C_D (C_C _ (C_C _ _)) (C_D (C_A _ _) (C_C _ _)) -> 313 
  C_D (C_D _ (C_A _ _)) (C_A _ _) -> 314 
  C_D (C_C _ _) (C_C _ _) -> 315 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_B) (C_C _ _)) -> 316 
  C_D (C_D _ _) (C_C _ (C_A _ _)) -> 317 
  C_D (C_D _ (C_D _ _)) (C_D (C_C _ _) (C_C _ _)) -> 318 
  C_D (C_A _ _) (C_D (C_D _ _) _) -> 319 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_D _ _) _) -> 320 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_D _ _) _) -> 321 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_A _ _) (C_C _ _)) -> 322 
  C_D (C_D _ (C_B)) (C_D (C_B) _) -> 323 
  C_D (C_D (C_C _ _) _) (C_D (C_B) (C_D _ _)) -> 324 
  C_D (C_D (C_A _ _) _) (C_D (C_A _ _) (C_B)) -> 325 
  C_D (C_D (C_D _ _) _) (C_C _ (C_D _ _)) -> 326 
  C_D (C_A _ _) (C_D (C_D _ _) (C_D _ _)) -> 327 
  C_D (C_C _ (C_A _ _)) (C_D (C_C _ _) (C_A _ _)) -> 328 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_C _ _) _) -> 329 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_C _ _) -> 330 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_C _ _) (C_D _ _)) -> 331 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_C _ _) (C_A _ _)) -> 332 
  C_D (C_C _ (C_C _ _)) (C_D (C_C _ _) (C_D _ _)) -> 333 
  C_D (C_D _ (C_C _ _)) (C_D (C_D _ _) (C_C _ _)) -> 334 
  C_D (C_C _ (C_C _ _)) (C_D (C_C _ _) _) -> 335 
  C_D (C_D _ _) (C_D _ (C_A _ _)) -> 336 
  C_D (C_D _ _) (C_D _ (C_D _ _)) -> 337 
  C_D (C_D (C_C _ _) _) (C_D (C_C _ _) (C_A _ _)) -> 338 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_C _ _) (C_A _ _)) -> 339 
  C_D (C_D _ (C_B)) (C_D (C_B) (C_B)) -> 340 
  C_D (C_D _ (C_B)) (C_D (C_A _ _) (C_D _ _)) -> 341 
  C_D (C_D _ _) (C_D (C_A _ _) _) -> 342 
  C_D (C_C _ (C_D _ _)) (C_D _ (C_A _ _)) -> 343 
  C_D (C_D (C_D _ _) (C_B)) (C_D _ (C_A _ _)) -> 344 
  C_D (C_D (C_D _ _) _) (C_D (C_C _ _) (C_D _ _)) -> 345 
  C_D (C_D (C_B) (C_B)) (C_C _ (C_B)) -> 346 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_D _ _) (C_A _ _)) -> 347 
  C_D (C_D _ _) (C_D (C_B) (C_A _ _)) -> 348 
  C_D (C_C _ (C_A _ _)) (C_D _ (C_C _ _)) -> 349 
  C_D (C_C _ (C_C _ _)) (C_C _ _) -> 350 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_D _ _) (C_B)) -> 351 
  C_D (C_D (C_D _ _) _) (C_D (C_B) (C_A _ _)) -> 352 
  C_D (C_D _ (C_B)) (C_D (C_C _ _) (C_A _ _)) -> 353 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_A _ _) (C_C _ _)) -> 354 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D _ (C_A _ _)) -> 355 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_C _ (C_D _ _)) -> 356 
  C_D (C_D (C_D _ _) (C_A _ _)) _ -> 357 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_D _ _) (C_C _ _)) -> 358 
  C_D _ (C_D _ (C_B)) -> 359 
  C_D _ (C_D (C_B) (C_C _ _)) -> 360 
  C_D (C_D _ (C_A _ _)) (C_D (C_C _ _) (C_C _ _)) -> 361 
  C_D (C_D _ _) (C_D (C_D _ _) (C_C _ _)) -> 362 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_A _ _) (C_B)) -> 363 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_D _ _) _) -> 364 
  C_D (C_D (C_D _ _) _) (C_D (C_C _ _) (C_B)) -> 365 
  C_D (C_C _ (C_C _ _)) (C_D _ (C_B)) -> 366 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_C _ (C_B)) -> 367 
  C_D (C_C _ (C_C _ _)) (C_D _ (C_A _ _)) -> 368 
  C_D (C_C _ (C_A _ _)) (C_D (C_A _ _) (C_A _ _)) -> 369 
  C_D (C_D (C_D _ _) _) (C_D (C_B) (C_D _ _)) -> 370 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_B) (C_D _ _)) -> 371 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_A _ _) -> 372 
  C_D (C_D (C_C _ _) _) (C_D (C_A _ _) (C_C _ _)) -> 373 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D _ (C_C _ _)) -> 374 
  C_D _ (C_C _ (C_D _ _)) -> 375 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_C _ _) (C_B)) -> 376 
  C_D (C_D _ (C_D _ _)) (C_D (C_C _ _) (C_A _ _)) -> 377 
  C_D (C_D _ _) (C_A _ _) -> 378 
  C_D (C_D _ (C_D _ _)) (C_D (C_A _ _) (C_A _ _)) -> 379 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_A _ _) (C_B)) -> 380 
  C_D (C_D _ _) (C_D (C_A _ _) (C_B)) -> 381 
  C_D (C_D (C_B) (C_C _ _)) (C_D _ _) -> 382 
  C_D (C_D _ (C_D _ _)) (C_A _ _) -> 383 
  C_D (C_A _ _) (C_D (C_A _ _) (C_A _ _)) -> 384 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_A _ _) (C_A _ _)) -> 385 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_C _ (C_A _ _)) -> 386 
  C_D (C_D (C_B) (C_A _ _)) (C_C _ (C_D _ _)) -> 387 
  C_D (C_D _ (C_A _ _)) (C_D (C_C _ _) (C_B)) -> 388 
  C_D (C_A _ _) (C_D (C_B) _) -> 389 
  C_D _ (C_D _ (C_D _ _)) -> 390 
  C_D (C_D (C_C _ _) _) (C_B) -> 391 
  C_D (C_D (C_C _ _) (C_B)) (C_C _ (C_C _ _)) -> 392 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_D _ _) (C_A _ _)) -> 393 
  C_D (C_D (C_B) (C_D _ _)) (C_C _ (C_D _ _)) -> 394 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_D _ _) (C_B)) -> 395 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_A _ _) (C_D _ _)) -> 396 
  C_D (C_C _ (C_B)) (C_C _ (C_D _ _)) -> 397 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_B) (C_C _ _)) -> 398 
  C_D (C_D _ (C_D _ _)) (C_C _ (C_A _ _)) -> 399 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 400 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_A _ _) (C_B)) -> 401 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_D _ _) (C_B)) -> 402 
  C_D (C_C _ (C_C _ _)) (C_D (C_D _ _) _) -> 403 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_A _ _) (C_A _ _)) -> 404 
  C_D (C_D (C_A _ _) (C_A _ _)) _ -> 405 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_D _ _) (C_A _ _)) -> 406 
  C_D (C_C _ _) _ -> 407 
  C_D (C_D (C_B) _) (C_D (C_A _ _) (C_A _ _)) -> 408 
  C_D (C_D (C_B) _) (C_D (C_D _ _) (C_A _ _)) -> 409 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_A _ _) (C_D _ _)) -> 410 
  C_D (C_C _ (C_C _ _)) _ -> 411 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_D _ _) (C_C _ _)) -> 412 
  C_D (C_D (C_B) (C_D _ _)) (C_C _ (C_B)) -> 413 
  C_D (C_C _ (C_A _ _)) (C_D (C_A _ _) _) -> 414 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_B) (C_A _ _)) -> 415 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 416 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_C _ _) -> 417 
  C_D (C_C _ (C_C _ _)) (C_D (C_C _ _) (C_C _ _)) -> 418 
  C_D (C_D (C_B) _) (C_D (C_C _ _) (C_A _ _)) -> 419 
  C_D (C_D (C_C _ _) (C_B)) _ -> 420 
  C_D (C_D (C_A _ _) _) (C_D (C_D _ _) _) -> 421 
  C_D (C_A _ _) (C_D (C_A _ _) (C_D _ _)) -> 422 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D _ (C_D _ _)) -> 423 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_C _ _) _) -> 424 
  C_D (C_D _ (C_D _ _)) (C_D (C_D _ _) (C_D _ _)) -> 425 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_B) (C_B)) -> 426 
  C_D (C_C _ _) (C_D _ (C_D _ _)) -> 427 
  C_D (C_D _ (C_C _ _)) (C_D (C_B) (C_A _ _)) -> 428 
  C_D (C_C _ (C_D _ _)) (C_D (C_C _ _) _) -> 429 
  C_D (C_D _ _) (C_C _ (C_D _ _)) -> 430 
  C_D (C_D (C_D _ _) _) (C_D _ (C_C _ _)) -> 431 
  C_D (C_D _ _) (C_D (C_C _ _) _) -> 432 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_B) (C_D _ _)) -> 433 
  C_D (C_D (C_D _ _) (C_B)) _ -> 434 
  C_D (C_D _ (C_A _ _)) (C_D (C_A _ _) (C_A _ _)) -> 435 
  C_D _ (C_B) -> 436 
  C_D (C_D (C_A _ _) (C_B)) (C_B) -> 437 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_A _ _) (C_A _ _)) -> 438 
  C_D (C_C _ (C_D _ _)) (C_D (C_D _ _) (C_D _ _)) -> 439 
  C_D (C_A _ _) (C_D (C_C _ _) (C_A _ _)) -> 440 
  C_D _ (C_D (C_B) (C_A _ _)) -> 441 
  C_D (C_D _ (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 442 
  C_D (C_D _ (C_D _ _)) (C_D (C_C _ _) (C_B)) -> 443 
  C_D (C_A _ _) (C_D (C_A _ _) _) -> 444 
  C_D (C_A _ _) (C_B) -> 445 
  C_D (C_D _ (C_C _ _)) _ -> 446 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_C _ (C_B)) -> 447 
  C_D (C_D _ _) (C_D (C_C _ _) (C_D _ _)) -> 448 
  C_D (C_D (C_B) _) (C_D (C_B) (C_A _ _)) -> 449 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_A _ _) _) -> 450 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_C _ (C_A _ _)) -> 451 
  C_D (C_D (C_D _ _) _) (C_B) -> 452 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D _ (C_A _ _)) -> 453 
  C_D (C_D _ _) (C_D (C_B) (C_C _ _)) -> 454 
  C_D (C_D (C_C _ _) _) (C_D _ _) -> 455 
  C_D (C_D (C_A _ _) (C_B)) (C_D _ (C_D _ _)) -> 456 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_C _ _) (C_C _ _)) -> 457 
  C_D (C_D _ _) _ -> 458 
  C_D (C_D (C_B) (C_A _ _)) (C_C _ (C_A _ _)) -> 459 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_A _ _) (C_A _ _)) -> 460 
  C_D (C_C _ (C_B)) (C_D (C_B) (C_B)) -> 461 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_B) (C_A _ _)) -> 462 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_D _ _) (C_C _ _)) -> 463 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_C _ _) (C_D _ _)) -> 464 
  C_D (C_B) (C_D (C_A _ _) (C_B)) -> 465 
  C_D (C_D _ (C_D _ _)) (C_D (C_A _ _) (C_B)) -> 466 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_D _ _) (C_B)) -> 467 
  C_D (C_D _ (C_B)) (C_D (C_A _ _) (C_A _ _)) -> 468 
  C_D (C_C _ (C_B)) (C_D (C_C _ _) _) -> 469 
  C_D (C_D (C_D _ _) _) (C_D (C_C _ _) _) -> 470 
  C_D (C_D _ (C_B)) (C_D (C_B) (C_A _ _)) -> 471 
  C_D (C_D (C_A _ _) _) (C_D (C_B) (C_C _ _)) -> 472 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_A _ _) (C_D _ _)) -> 473 
  C_D (C_D (C_D _ _) (C_B)) (C_D _ _) -> 474 
  C_D _ (C_D (C_A _ _) _) -> 475 
  C_D (C_D (C_D _ _) _) (C_D (C_B) (C_C _ _)) -> 476 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_D _ _) (C_B)) -> 477 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_D _ _) (C_C _ _)) -> 478 
  C_D (C_B) (C_D (C_D _ _) (C_B)) -> 479 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_A _ _) (C_D _ _)) -> 480 
  C_D (C_C _ _) (C_D (C_A _ _) (C_C _ _)) -> 481 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_A _ _) (C_D _ _)) -> 482 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 483 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_D _ _) (C_C _ _)) -> 484 
  C_D (C_D (C_C _ _) (C_B)) (C_B) -> 485 
  C_D (C_D (C_C _ _) _) (C_C _ (C_D _ _)) -> 486 
  C_D (C_D (C_C _ _) _) (C_D (C_D _ _) (C_C _ _)) -> 487 
  C_D (C_D _ (C_D _ _)) (C_D (C_B) (C_B)) -> 488 
  C_D (C_D (C_B) (C_B)) (C_C _ (C_A _ _)) -> 489 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_D _ _) (C_B)) -> 490 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D _ (C_C _ _)) -> 491 
  C_D (C_D (C_D _ _) (C_B)) (C_C _ (C_B)) -> 492 
  C_D (C_C _ _) (C_D (C_C _ _) (C_D _ _)) -> 493 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_C _ _) -> 494 
  C_D (C_C _ _) (C_D _ (C_A _ _)) -> 495 
  C_D (C_D (C_B) (C_B)) _ -> 496 
  C_D (C_D (C_A _ _) (C_B)) (C_A _ _) -> 497 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_A _ _) _) -> 498 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_D _ _) (C_A _ _)) -> 499 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_A _ _) (C_B)) -> 500 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_A _ _) -> 501 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_C _ (C_A _ _)) -> 502 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_B) -> 503 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_C _ _) (C_B)) -> 504 
  C_D (C_C _ (C_D _ _)) (C_D (C_A _ _) (C_B)) -> 505 
  C_D (C_D _ (C_C _ _)) (C_D (C_A _ _) (C_C _ _)) -> 506 
  C_D (C_D (C_B) (C_D _ _)) (C_D _ (C_C _ _)) -> 507 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_D _ _) (C_D _ _)) -> 508 
  C_D (C_D _ (C_B)) (C_D _ (C_B)) -> 509 
  C_D (C_A _ _) (C_D _ _) -> 510 
  C_D (C_C _ (C_D _ _)) (C_D (C_B) (C_C _ _)) -> 511 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D _ (C_B)) -> 512 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_B) (C_D _ _)) -> 513 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_C _ (C_D _ _)) -> 514 
  C_D _ (C_D (C_B) (C_D _ _)) -> 515 
  C_D (C_C _ (C_A _ _)) (C_D (C_D _ _) _) -> 516 
  C_D (C_A _ _) (C_D (C_C _ _) (C_B)) -> 517 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_C _ _) (C_C _ _)) -> 518 
  C_D (C_D (C_A _ _) _) (C_C _ (C_C _ _)) -> 519 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_B) (C_A _ _)) -> 520 
  C_D (C_D (C_B) (C_A _ _)) (C_C _ (C_C _ _)) -> 521 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D _ (C_B)) -> 522 
  C_D _ (C_C _ (C_B)) -> 523 
  C_D (C_D _ _) (C_D (C_D _ _) _) -> 524 
  C_D (C_D _ _) (C_D (C_D _ _) (C_A _ _)) -> 525 
  C_D (C_A _ _) (C_C _ (C_D _ _)) -> 526 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_C _ _) (C_C _ _)) -> 527 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_A _ _) (C_D _ _)) -> 528 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_B) _) -> 529 
  C_D (C_D (C_B) (C_B)) (C_D _ (C_C _ _)) -> 530 
  C_D (C_D (C_C _ _) (C_B)) (C_D _ (C_C _ _)) -> 531 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_D _ _) (C_A _ _)) -> 532 
  C_D (C_C _ _) (C_D (C_B) (C_C _ _)) -> 533 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_B) (C_A _ _)) -> 534 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_C _ _) (C_B)) -> 535 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_B) (C_A _ _)) -> 536 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_A _ _) -> 537 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D _ (C_C _ _)) -> 538 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_C _ _) (C_D _ _)) -> 539 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_C _ (C_C _ _)) -> 540 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_C _ _) -> 541 
  C_D (C_A _ _) (C_D _ (C_C _ _)) -> 542 
  C_D (C_D _ (C_C _ _)) (C_D _ (C_A _ _)) -> 543 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_D _ _) (C_A _ _)) -> 544 
  C_D (C_D _ (C_B)) (C_D (C_A _ _) (C_B)) -> 545 
  C_D (C_D (C_A _ _) _) (C_A _ _) -> 546 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_C _ _) (C_D _ _)) -> 547 
  C_D (C_D (C_B) (C_C _ _)) (C_D _ (C_B)) -> 548 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_C _ _) (C_A _ _)) -> 549 
  C_D (C_D (C_B) (C_B)) (C_D (C_A _ _) (C_A _ _)) -> 550 
  C_D (C_C _ (C_B)) (C_D (C_D _ _) (C_A _ _)) -> 551 
  C_D (C_B) (C_A _ _) -> 552 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_C _ _) _) -> 553 
  C_D (C_B) (C_B) -> 554 
  C_D (C_B) (C_C _ (C_C _ _)) -> 555 
  C_D (C_D (C_C _ _) _) (C_D (C_B) (C_C _ _)) -> 556 
  C_D (C_D _ (C_A _ _)) (C_D (C_A _ _) (C_B)) -> 557 
  C_D (C_D (C_B) (C_A _ _)) _ -> 558 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_A _ _) (C_D _ _)) -> 559 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_B) (C_D _ _)) -> 560 
  C_D (C_A _ _) (C_D _ (C_A _ _)) -> 561 
  C_D (C_D (C_C _ _) _) (C_D _ (C_B)) -> 562 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_C _ _) (C_D _ _)) -> 563 
  C_D (C_D _ (C_C _ _)) (C_D _ _) -> 564 
  C_D (C_D _ (C_C _ _)) (C_D (C_B) (C_C _ _)) -> 565 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_C _ (C_C _ _)) -> 566 
  C_D (C_D (C_B) (C_D _ _)) _ -> 567 
  C_D (C_D (C_D _ _) _) (C_C _ (C_A _ _)) -> 568 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_D _ _) (C_C _ _)) -> 569 
  C_D _ (C_D _ _) -> 570 
  C_D (C_D (C_B) _) (C_D (C_D _ _) _) -> 571 
  C_D (C_D _ (C_A _ _)) (C_D (C_C _ _) (C_D _ _)) -> 572 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_A _ _) _) -> 573 
  C_D (C_C _ (C_C _ _)) (C_B) -> 574 
  C_D (C_C _ (C_C _ _)) (C_C _ (C_B)) -> 575 
  C_D (C_D _ (C_D _ _)) (C_D _ (C_A _ _)) -> 576 
  C_D (C_D _ _) (C_B) -> 577 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_B) (C_C _ _)) -> 578 
  C_D (C_A _ _) (C_C _ (C_C _ _)) -> 579 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_B) (C_C _ _)) -> 580 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_C _ _) (C_C _ _)) -> 581 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_A _ _) (C_C _ _)) -> 582 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_D _ _) (C_B)) -> 583 
  C_D (C_D _ (C_A _ _)) (C_D (C_D _ _) (C_A _ _)) -> 584 
  C_D (C_D (C_B) _) (C_D (C_A _ _) (C_B)) -> 585 
  C_D (C_D _ (C_D _ _)) (C_C _ (C_D _ _)) -> 586 
  C_D _ (C_D (C_D _ _) (C_B)) -> 587 
  C_D (C_D _ (C_C _ _)) (C_D (C_C _ _) (C_C _ _)) -> 588 
  C_D (C_D (C_D _ _) _) (C_C _ (C_B)) -> 589 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_B) (C_D _ _)) -> 590 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_D _ _) (C_A _ _)) -> 591 
  C_D (C_C _ (C_B)) (C_D (C_B) (C_D _ _)) -> 592 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_D _ _) (C_B)) -> 593 
  C_D (C_D (C_B) _) (C_D (C_C _ _) _) -> 594 
  C_D (C_C _ (C_B)) (C_D (C_A _ _) (C_A _ _)) -> 595 
  C_D (C_C _ (C_A _ _)) _ -> 596 
