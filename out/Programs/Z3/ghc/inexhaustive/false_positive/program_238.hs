module Program_21 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a b) (B_A b b) | C_B | C_C (B_A b b) (B_A Int a) | C_D (B_A a a) b

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_A (C_D _ _) _) _ -> 0 
  C_D (C_C (C_A _ _) (C_B)) _ -> 1 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_A (C_C _ _) (C_B)) -> 2 
  C_C (C_A (C_D _ _) _) (C_A (C_C _ _) (C_A _ _)) -> 3 
  C_C (C_A _ (C_B)) (C_A (C_A _ _) (C_B)) -> 4 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_A (C_D _ _) (C_D _ _)) -> 5 
  C_C (C_A (C_B) (C_A _ _)) (C_A (C_D _ _) (C_A _ _)) -> 6 
  C_C (C_C (C_D _ _) (C_B)) (C_C (C_C _ _) _) -> 7 
  C_C (C_A _ (C_C _ _)) (C_C (C_B) (C_C _ _)) -> 8 
  C_C (C_A (C_C _ _) (C_B)) (C_A (C_B) (C_A _ _)) -> 9 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_A (C_A _ _) (C_A _ _)) -> 10 
  C_C (C_A (C_C _ _) (C_B)) (C_A (C_D _ _) (C_D _ _)) -> 11 
  C_C (C_A (C_A _ _) (C_B)) (C_A (C_C _ _) (C_B)) -> 12 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_A (C_D _ _) (C_D _ _)) -> 13 
  C_C (C_C (C_B) (C_A _ _)) (C_A (C_A _ _) (C_D _ _)) -> 14 
  C_C (C_C _ (C_B)) (C_C (C_B) (C_A _ _)) -> 15 
  C_C (C_A (C_C _ _) (C_D _ _)) (C_C _ (C_D _ _)) -> 16 
  C_C (C_A (C_B) (C_D _ _)) (C_C (C_B) (C_A _ _)) -> 17 
  C_C (C_C _ (C_C _ _)) (C_C (C_A _ _) (C_B)) -> 18 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_C (C_B) _) -> 19 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C (C_C _ _) _) -> 20 
  C_C (C_C _ (C_D _ _)) (C_C (C_B) _) -> 21 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_C (C_B) _) -> 22 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_C (C_C _ _) _) -> 23 
  C_C (C_A (C_B) _) (C_C (C_B) (C_A _ _)) -> 24 
  C_C (C_B) (C_C _ (C_C _ _)) -> 25 
  C_C (C_A _ (C_A _ _)) (C_A (C_A _ _) _) -> 26 
  C_C (C_A (C_B) (C_C _ _)) (C_A (C_C _ _) (C_D _ _)) -> 27 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_D _ _) -> 28 
  C_C (C_C (C_B) (C_C _ _)) _ -> 29 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_A (C_D _ _) (C_D _ _)) -> 30 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_A (C_D _ _) (C_A _ _)) -> 31 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_A (C_B) (C_B)) -> 32 
  C_C (C_C (C_B) (C_D _ _)) (C_D (C_A _ _) _) -> 33 
  C_C (C_A _ _) (C_D (C_C _ _) _) -> 34 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_A (C_C _ _) (C_D _ _)) -> 35 
  C_C (C_A (C_A _ _) (C_B)) (C_A (C_A _ _) (C_D _ _)) -> 36 
  C_C (C_C (C_D _ _) (C_D _ _)) _ -> 37 
  C_C (C_A _ (C_D _ _)) (C_C (C_A _ _) _) -> 38 
  C_C (C_A (C_C _ _) (C_D _ _)) (C_C (C_A _ _) (C_D _ _)) -> 39 
  C_C (C_C (C_C _ _) (C_B)) (C_C _ (C_D _ _)) -> 40 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_C (C_C _ _) (C_C _ _)) -> 41 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_D _ _) -> 42 
  C_C (C_C (C_B) (C_D _ _)) (C_C (C_C _ _) (C_D _ _)) -> 43 
  C_C (C_A (C_B) (C_A _ _)) (C_A _ _) -> 44 
  C_C (C_A (C_B) (C_C _ _)) (C_A (C_A _ _) (C_B)) -> 45 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_A _ _) -> 46 
  C_C (C_C (C_C _ _) _) (C_C _ _) -> 47 
  C_C (C_C (C_D _ _) _) (C_A (C_C _ _) (C_B)) -> 48 
  C_C (C_C _ (C_A _ _)) (C_D (C_D _ _) _) -> 49 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_A (C_C _ _) (C_B)) -> 50 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_A (C_C _ _) (C_B)) -> 51 
  C_C (C_A (C_B) (C_B)) (C_A _ (C_D _ _)) -> 52 
  C_C (C_C (C_C _ _) _) (C_C (C_D _ _) _) -> 53 
  C_C (C_A (C_C _ _) (C_B)) (C_C _ (C_B)) -> 54 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_C (C_A _ _) _) -> 55 
  C_C (C_C _ (C_A _ _)) (C_A _ (C_A _ _)) -> 56 
  C_C (C_C _ (C_D _ _)) (C_A _ (C_C _ _)) -> 57 
  C_C (C_C (C_A _ _) _) (C_C _ (C_C _ _)) -> 58 
  C_C (C_A (C_B) (C_D _ _)) (C_A _ _) -> 59 
  C_C (C_D _ _) (C_C (C_B) (C_B)) -> 60 
  C_C (C_D _ _) (C_A _ (C_A _ _)) -> 61 
  C_C (C_C (C_B) (C_A _ _)) (C_B) -> 62 
  C_C (C_C (C_D _ _) _) (C_C (C_C _ _) _) -> 63 
  C_C (C_C (C_C _ _) (C_B)) (C_A (C_B) (C_C _ _)) -> 64 
  C_C (C_A _ (C_C _ _)) (C_A (C_A _ _) _) -> 65 
  C_C (C_D (C_B) _) (C_C _ _) -> 66 
  C_C (C_D (C_C _ _) _) (C_C (C_B) (C_B)) -> 67 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_A (C_C _ _) (C_C _ _)) -> 68 
  C_C (C_C _ (C_B)) (C_A (C_C _ _) (C_D _ _)) -> 69 
  C_C (C_A _ (C_D _ _)) (C_A (C_A _ _) _) -> 70 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_C (C_B) (C_B)) -> 71 
  C_C (C_A (C_A _ _) _) (C_A (C_A _ _) (C_A _ _)) -> 72 
  C_C (C_C (C_B) (C_B)) _ -> 73 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_C _ (C_D _ _)) -> 74 
  C_C (C_A _ (C_D _ _)) (C_A (C_B) _) -> 75 
  C_C (C_C (C_B) (C_D _ _)) (C_C (C_B) (C_A _ _)) -> 76 
  C_C (C_A (C_B) _) (C_C (C_D _ _) (C_B)) -> 77 
  C_C (C_A (C_D _ _) _) (C_D _ _) -> 78 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_A (C_A _ _) (C_B)) -> 79 
  C_C (C_C (C_A _ _) _) (C_A (C_B) (C_D _ _)) -> 80 
  C_C (C_A (C_B) _) (C_C (C_C _ _) _) -> 81 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_C (C_C _ _) (C_A _ _)) -> 82 
  C_C (C_C (C_A _ _) (C_A _ _)) _ -> 83 
  C_C (C_C (C_B) _) (C_C (C_C _ _) (C_A _ _)) -> 84 
  C_C (C_A (C_A _ _) (C_B)) (C_C (C_B) _) -> 85 
  C_C (C_A (C_A _ _) (C_B)) (C_C _ (C_C _ _)) -> 86 
  C_C (C_A (C_B) _) (C_C (C_A _ _) (C_C _ _)) -> 87 
  C_C _ (C_C (C_D _ _) (C_A _ _)) -> 88 
  C_C (C_C (C_B) (C_A _ _)) (C_A (C_B) (C_B)) -> 89 
  C_C (C_B) (C_A _ (C_C _ _)) -> 90 
  C_C (C_A _ _) (C_A (C_C _ _) (C_C _ _)) -> 91 
  C_C (C_C (C_B) _) (C_A (C_D _ _) (C_B)) -> 92 
  C_C (C_D (C_A _ _) _) (C_C (C_A _ _) (C_C _ _)) -> 93 
  C_C (C_A (C_B) (C_D _ _)) (C_C (C_A _ _) (C_D _ _)) -> 94 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_C _ (C_B)) -> 95 
  C_C (C_D _ _) (C_A (C_C _ _) (C_B)) -> 96 
  C_C (C_A (C_A _ _) _) (C_C (C_C _ _) (C_B)) -> 97 
  C_C (C_D (C_B) _) (C_C (C_A _ _) (C_C _ _)) -> 98 
  C_C (C_A (C_B) _) (C_A (C_D _ _) (C_B)) -> 99 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_A (C_D _ _) (C_C _ _)) -> 100 
  C_C (C_D (C_C _ _) _) (C_A (C_B) (C_C _ _)) -> 101 
  C_C (C_C _ (C_D _ _)) (C_A (C_B) (C_D _ _)) -> 102 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_C _ (C_A _ _)) -> 103 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_C (C_C _ _) _) -> 104 
  C_C (C_A (C_A _ _) _) (C_C _ _) -> 105 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_D (C_B) _) -> 106 
  C_C (C_A (C_C _ _) _) (C_D (C_C _ _) _) -> 107 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) (C_A _ _)) -> 108 
  C_C (C_C (C_B) (C_B)) (C_A _ (C_D _ _)) -> 109 
  C_C (C_D (C_C _ _) _) (C_C (C_B) (C_D _ _)) -> 110 
  C_C (C_D (C_A _ _) _) (C_A _ (C_B)) -> 111 
  C_C (C_C (C_C _ _) _) (C_A (C_A _ _) (C_C _ _)) -> 112 
  C_C (C_A _ _) (C_C (C_C _ _) _) -> 113 
  C_C (C_A _ _) (C_A (C_D _ _) (C_C _ _)) -> 114 
  C_C (C_C (C_B) (C_C _ _)) (C_D (C_C _ _) _) -> 115 
  C_C (C_C (C_C _ _) (C_B)) (C_D (C_A _ _) _) -> 116 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_A (C_D _ _) (C_B)) -> 117 
  C_C (C_A (C_B) (C_D _ _)) (C_C (C_D _ _) (C_B)) -> 118 
  C_C (C_C (C_D _ _) (C_A _ _)) (C_A (C_B) (C_C _ _)) -> 119 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_A (C_A _ _) (C_B)) -> 120 
  C_C (C_C (C_B) (C_C _ _)) (C_A (C_B) (C_B)) -> 121 
  C_C _ (C_A (C_A _ _) (C_B)) -> 122 
  C_C (C_D _ _) (C_A (C_D _ _) (C_B)) -> 123 
  C_C (C_C (C_A _ _) (C_B)) (C_C (C_A _ _) (C_D _ _)) -> 124 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 125 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_A (C_C _ _) _) -> 126 
  C_C (C_C (C_B) _) (C_A (C_D _ _) _) -> 127 
  C_C (C_C (C_A _ _) _) (C_A (C_A _ _) (C_C _ _)) -> 128 
  C_C (C_C (C_D _ _) _) (C_A (C_B) _) -> 129 
  C_C (C_C (C_A _ _) (C_B)) (C_A (C_A _ _) (C_D _ _)) -> 130 
  C_C (C_A (C_D _ _) (C_B)) (C_C _ (C_A _ _)) -> 131 
  C_C (C_C (C_B) _) (C_C _ (C_A _ _)) -> 132 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_C (C_C _ _) _) -> 133 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_C (C_C _ _) (C_D _ _)) -> 134 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_B) -> 135 
  C_C (C_C (C_D _ _) (C_B)) (C_C (C_B) (C_B)) -> 136 
  C_C (C_A (C_D _ _) (C_B)) (C_D (C_D _ _) _) -> 137 
  C_C (C_A _ _) (C_A _ (C_D _ _)) -> 138 
  C_C (C_A (C_D _ _) _) (C_C _ (C_C _ _)) -> 139 
  C_C (C_A (C_C _ _) (C_B)) (C_A (C_B) (C_B)) -> 140 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_A (C_A _ _) (C_B)) -> 141 
  C_C (C_A _ (C_B)) (C_A (C_A _ _) (C_C _ _)) -> 142 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_A (C_A _ _) (C_D _ _)) -> 143 
  C_C (C_D (C_B) _) (C_A (C_B) (C_C _ _)) -> 144 
  C_C (C_C (C_D _ _) (C_B)) (C_C (C_B) (C_D _ _)) -> 145 
  C_C (C_D (C_C _ _) _) (C_C (C_C _ _) (C_A _ _)) -> 146 
  C_C (C_C (C_B) (C_D _ _)) (C_C (C_A _ _) _) -> 147 
  C_A (C_C _ _) (C_C (C_C _ _) (C_D _ _)) -> 148 
  C_A (C_A (C_D _ _) (C_A _ _)) (C_C (C_D _ _) (C_A _ _)) -> 149 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_A _ (C_B)) -> 150 
  C_A (C_A _ (C_C _ _)) (C_A (C_C _ _) (C_A _ _)) -> 151 
  C_A (C_C (C_B) (C_B)) (C_A (C_B) _) -> 152 
  C_A (C_A (C_C _ _) (C_B)) (C_C (C_D _ _) (C_B)) -> 153 
  C_A (C_D (C_B) _) (C_C (C_B) (C_C _ _)) -> 154 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_C (C_C _ _) (C_B)) -> 155 
  C_A (C_A (C_B) (C_A _ _)) (C_C (C_D _ _) (C_D _ _)) -> 156 
  C_A (C_D _ _) (C_A (C_B) (C_D _ _)) -> 157 
  C_A (C_C _ (C_C _ _)) (C_A (C_C _ _) (C_D _ _)) -> 158 
  C_A (C_C (C_A _ _) (C_C _ _)) (C_C (C_A _ _) (C_B)) -> 159 
  C_A (C_D _ _) (C_A (C_D _ _) (C_C _ _)) -> 160 
  C_A (C_C _ (C_C _ _)) (C_D _ _) -> 161 
  C_A (C_C _ (C_D _ _)) (C_C _ (C_B)) -> 162 
  C_A (C_A (C_D _ _) (C_B)) (C_A (C_A _ _) (C_A _ _)) -> 163 
  C_A (C_A (C_C _ _) (C_B)) (C_C (C_D _ _) (C_C _ _)) -> 164 
  C_A (C_A _ (C_A _ _)) (C_A (C_D _ _) _) -> 165 
  C_A (C_D (C_B) _) (C_C (C_C _ _) (C_D _ _)) -> 166 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_C (C_C _ _) (C_A _ _)) -> 167 
  C_A (C_A _ (C_B)) (C_A (C_D _ _) (C_C _ _)) -> 168 
  C_A (C_A _ _) (C_A _ _) -> 169 
  C_A (C_C (C_D _ _) (C_D _ _)) (C_D (C_D _ _) _) -> 170 
  C_A (C_C (C_D _ _) (C_B)) (C_A (C_B) (C_A _ _)) -> 171 
  C_A (C_C (C_D _ _) (C_B)) (C_C _ (C_C _ _)) -> 172 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_C (C_B) (C_D _ _)) -> 173 
  C_A (C_C (C_C _ _) (C_C _ _)) (C_D (C_B) _) -> 174 
  C_A (C_C (C_B) (C_C _ _)) (C_A _ (C_A _ _)) -> 175 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_C (C_A _ _) (C_D _ _)) -> 176 
  C_A (C_A _ _) (C_C _ (C_C _ _)) -> 177 
  C_A (C_C (C_B) _) (C_C (C_D _ _) _) -> 178 
  C_A (C_A _ (C_A _ _)) (C_C (C_D _ _) _) -> 179 
  C_A (C_C (C_B) (C_B)) (C_A (C_C _ _) (C_C _ _)) -> 180 
  C_A (C_A (C_C _ _) (C_B)) (C_C (C_B) (C_A _ _)) -> 181 
  C_A (C_C (C_A _ _) (C_C _ _)) (C_A (C_C _ _) (C_D _ _)) -> 182 
  C_A (C_C (C_B) (C_C _ _)) (C_C (C_D _ _) (C_C _ _)) -> 183 
  C_A (C_A (C_D _ _) _) (C_A _ (C_A _ _)) -> 184 
  C_A (C_A (C_C _ _) _) (C_C (C_A _ _) (C_A _ _)) -> 185 
  C_A (C_C (C_D _ _) (C_D _ _)) (C_C (C_A _ _) (C_D _ _)) -> 186 
  C_A (C_A (C_D _ _) _) (C_A (C_D _ _) _) -> 187 
  C_A (C_C (C_A _ _) (C_B)) (C_A (C_A _ _) (C_A _ _)) -> 188 
  C_A (C_C _ (C_C _ _)) (C_C _ _) -> 189 
  C_A (C_C (C_B) _) (C_A (C_C _ _) (C_D _ _)) -> 190 
  C_A (C_B) (C_D (C_A _ _) _) -> 191 
  C_A (C_C (C_A _ _) (C_C _ _)) (C_C (C_D _ _) _) -> 192 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_B) -> 193 
  C_A (C_D (C_D _ _) _) (C_C (C_A _ _) (C_B)) -> 194 
  C_A (C_C (C_B) (C_A _ _)) (C_A (C_A _ _) (C_B)) -> 195 
  C_A (C_C (C_D _ _) (C_D _ _)) (C_B) -> 196 
  C_A (C_C (C_B) (C_A _ _)) (C_A (C_D _ _) (C_B)) -> 197 
  C_A (C_C (C_D _ _) (C_A _ _)) (C_C (C_D _ _) (C_C _ _)) -> 198 
  C_A (C_A _ (C_D _ _)) (C_D _ _) -> 199 
  C_A (C_A (C_B) (C_A _ _)) (C_C _ _) -> 200 
  C_A (C_D _ _) (C_D (C_D _ _) _) -> 201 
  C_A (C_A (C_A _ _) _) (C_A (C_C _ _) _) -> 202 
  C_A (C_C (C_C _ _) (C_C _ _)) (C_C (C_A _ _) (C_A _ _)) -> 203 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 204 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_C (C_D _ _) _) -> 205 
  C_A (C_D _ _) (C_A (C_B) _) -> 206 
  C_A (C_C (C_A _ _) (C_A _ _)) (C_A (C_B) _) -> 207 
  C_A (C_A (C_D _ _) (C_B)) (C_A (C_A _ _) (C_C _ _)) -> 208 
  C_A (C_A _ _) (C_C (C_C _ _) (C_C _ _)) -> 209 
  C_A (C_C _ (C_B)) (C_C (C_B) _) -> 210 
  C_A (C_A (C_B) _) (C_C (C_C _ _) (C_A _ _)) -> 211 
  C_A (C_A (C_B) (C_B)) (C_A (C_B) (C_D _ _)) -> 212 
  C_A (C_C _ (C_B)) (C_C (C_A _ _) _) -> 213 
  C_A (C_B) (C_C (C_B) (C_B)) -> 214 
  C_A (C_C (C_D _ _) (C_C _ _)) (C_C (C_A _ _) _) -> 215 
  C_A (C_A _ (C_B)) (C_C _ (C_C _ _)) -> 216 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_A _ (C_C _ _)) -> 217 
  C_A (C_A (C_D _ _) _) (C_C (C_D _ _) _) -> 218 
  C_A (C_C (C_B) _) (C_A (C_B) (C_C _ _)) -> 219 
  C_A (C_D (C_D _ _) _) (C_A (C_A _ _) _) -> 220 
  C_A _ (C_A (C_A _ _) (C_C _ _)) -> 221 
  C_A (C_C (C_D _ _) (C_A _ _)) (C_D (C_C _ _) _) -> 222 
  C_A _ (C_A (C_C _ _) (C_D _ _)) -> 223 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_C (C_D _ _) (C_C _ _)) -> 224 
  C_A (C_C (C_A _ _) (C_A _ _)) (C_A (C_D _ _) _) -> 225 
  C_A (C_A _ (C_B)) (C_C (C_B) (C_B)) -> 226 
  C_A (C_D (C_C _ _) _) (C_C (C_A _ _) _) -> 227 
