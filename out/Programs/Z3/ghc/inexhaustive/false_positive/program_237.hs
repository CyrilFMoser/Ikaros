module Program_20 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a b) (B_A b b) | C_B | C_C (B_A b b) (B_A Int a) | C_D (B_A a a) b

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_C _ (C_D _ _)) _ -> 0 
  C_D (C_C (C_D _ _) (C_B)) _ -> 1 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_C (C_C _ _) (C_B)) -> 2 
  C_C (C_C (C_C _ _) (C_B)) (C_A (C_D _ _) _) -> 3 
  C_C (C_A (C_B) _) (C_C _ _) -> 4 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_C _ (C_D _ _)) -> 5 
  C_C (C_C _ (C_D _ _)) (C_C (C_D _ _) (C_C _ _)) -> 6 
  C_C (C_C (C_D _ _) (C_B)) (C_C (C_C _ _) (C_C _ _)) -> 7 
  C_C (C_A (C_D _ _) (C_B)) (C_D (C_A _ _) _) -> 8 
  C_C (C_A (C_A _ _) _) (C_A (C_A _ _) (C_D _ _)) -> 9 
  C_C (C_A (C_B) (C_B)) (C_C _ _) -> 10 
  C_C (C_A (C_B) (C_B)) (C_A (C_A _ _) _) -> 11 
  C_C (C_C (C_B) (C_C _ _)) (C_D _ _) -> 12 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_C _ (C_C _ _)) -> 13 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_A _ _) (C_D _ _)) -> 14 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_A (C_D _ _) _) -> 15 
  C_C (C_A _ (C_A _ _)) (C_A (C_A _ _) (C_D _ _)) -> 16 
  C_C (C_C _ (C_B)) (C_D (C_D _ _) _) -> 17 
  C_C (C_A (C_A _ _) (C_B)) (C_C (C_A _ _) _) -> 18 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_D (C_D _ _) _) -> 19 
  C_C (C_C _ (C_A _ _)) (C_A (C_C _ _) (C_A _ _)) -> 20 
  C_C (C_A (C_D _ _) _) (C_A (C_C _ _) (C_D _ _)) -> 21 
  C_C (C_C (C_A _ _) (C_B)) _ -> 22 
  C_C (C_A (C_A _ _) _) (C_C (C_D _ _) (C_A _ _)) -> 23 
  C_C (C_D _ _) (C_A (C_D _ _) (C_A _ _)) -> 24 
  C_C (C_C (C_B) (C_C _ _)) (C_A (C_C _ _) (C_B)) -> 25 
  C_C (C_A (C_C _ _) (C_D _ _)) (C_C (C_D _ _) (C_B)) -> 26 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_A _ _) (C_D _ _)) -> 27 
  C_C (C_A _ (C_A _ _)) (C_C _ _) -> 28 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_A (C_A _ _) (C_C _ _)) -> 29 
  C_C (C_A (C_B) (C_B)) (C_C (C_A _ _) (C_D _ _)) -> 30 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_C (C_A _ _) (C_C _ _)) -> 31 
  C_C (C_C (C_D _ _) (C_A _ _)) (C_A (C_B) (C_B)) -> 32 
  C_C (C_C (C_C _ _) _) (C_A (C_B) (C_B)) -> 33 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_A (C_B) (C_A _ _)) -> 34 
  C_C (C_C _ (C_A _ _)) (C_C (C_C _ _) (C_D _ _)) -> 35 
  C_C (C_A _ (C_B)) (C_A (C_C _ _) (C_A _ _)) -> 36 
  C_C (C_C (C_D _ _) (C_B)) (C_A (C_B) _) -> 37 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_C (C_B) (C_C _ _)) -> 38 
  C_C (C_D (C_D _ _) _) (C_C (C_A _ _) (C_D _ _)) -> 39 
  C_C (C_C (C_B) (C_B)) (C_C (C_C _ _) (C_B)) -> 40 
  C_C (C_A (C_B) (C_C _ _)) (C_C (C_B) _) -> 41 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_A _ (C_C _ _)) -> 42 
  C_C (C_A (C_D _ _) (C_B)) (C_C (C_C _ _) (C_C _ _)) -> 43 
  C_C (C_C (C_C _ _) _) (C_C (C_B) _) -> 44 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C (C_D _ _) _) -> 45 
  C_C (C_C (C_B) (C_B)) (C_C (C_B) (C_C _ _)) -> 46 
  C_C (C_A (C_A _ _) _) (C_A _ (C_B)) -> 47 
  C_C (C_A _ _) (C_C (C_A _ _) (C_B)) -> 48 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 49 
  C_C (C_C _ (C_B)) (C_B) -> 50 
  C_C (C_C (C_B) _) (C_D (C_A _ _) _) -> 51 
  C_C (C_A _ (C_A _ _)) (C_D (C_C _ _) _) -> 52 
  C_C (C_A (C_B) (C_B)) (C_A (C_A _ _) (C_C _ _)) -> 53 
  C_C (C_A (C_D _ _) _) (C_C (C_A _ _) (C_B)) -> 54 
  C_C (C_A (C_C _ _) (C_B)) (C_A (C_D _ _) (C_C _ _)) -> 55 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C (C_B) (C_C _ _)) -> 56 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_A (C_D _ _) (C_D _ _)) -> 57 
  C_C (C_A (C_B) (C_D _ _)) (C_D _ _) -> 58 
  C_C (C_D (C_A _ _) _) (C_D _ _) -> 59 
  C_C (C_C _ (C_A _ _)) (C_A (C_B) (C_B)) -> 60 
  C_C (C_C (C_D _ _) (C_B)) (C_A (C_B) (C_C _ _)) -> 61 
  C_C (C_C (C_A _ _) (C_B)) (C_C (C_B) (C_D _ _)) -> 62 
  C_C (C_A (C_A _ _) (C_D _ _)) _ -> 63 
  C_C (C_A (C_B) (C_B)) (C_C (C_A _ _) (C_B)) -> 64 
  C_C (C_C _ (C_B)) (C_C (C_C _ _) (C_A _ _)) -> 65 
  C_C (C_C (C_D _ _) _) (C_C _ (C_C _ _)) -> 66 
  C_C (C_C (C_C _ _) (C_B)) (C_A (C_C _ _) (C_D _ _)) -> 67 
  C_C (C_C (C_A _ _) _) (C_A (C_B) (C_A _ _)) -> 68 
  C_C (C_A (C_C _ _) (C_B)) (C_C (C_B) (C_D _ _)) -> 69 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_D (C_D _ _) _) -> 70 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_A (C_D _ _) (C_A _ _)) -> 71 
  C_C (C_A (C_B) (C_C _ _)) (C_C _ _) -> 72 
  C_C (C_A (C_B) (C_B)) (C_C (C_D _ _) (C_A _ _)) -> 73 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_A _ _) -> 74 
  C_C (C_D (C_B) _) (C_A (C_D _ _) (C_B)) -> 75 
  C_C (C_A (C_B) (C_D _ _)) (C_A (C_C _ _) (C_D _ _)) -> 76 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_A (C_D _ _) (C_C _ _)) -> 77 
  C_C (C_C (C_C _ _) _) (C_D _ _) -> 78 
  C_C (C_A (C_C _ _) _) (C_C _ (C_A _ _)) -> 79 
  C_C (C_A (C_D _ _) (C_B)) (C_A _ (C_D _ _)) -> 80 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_C _ (C_B)) -> 81 
  C_C (C_A (C_B) (C_B)) (C_C _ (C_B)) -> 82 
  C_C (C_C (C_D _ _) (C_B)) (C_D (C_D _ _) _) -> 83 
  C_C (C_A (C_B) _) (C_A (C_B) (C_B)) -> 84 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_A (C_B) _) -> 85 
  C_C (C_A _ (C_C _ _)) (C_A (C_B) _) -> 86 
  C_C (C_B) (C_C (C_D _ _) (C_B)) -> 87 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_A (C_C _ _) (C_A _ _)) -> 88 
  C_C (C_A _ (C_A _ _)) (C_C (C_B) (C_A _ _)) -> 89 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_A (C_B) _) -> 90 
  C_C (C_D (C_A _ _) _) (C_D (C_C _ _) _) -> 91 
  C_C (C_A (C_B) (C_D _ _)) (C_C (C_D _ _) (C_D _ _)) -> 92 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_C _ _) -> 93 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_C _ (C_C _ _)) -> 94 
  C_C (C_B) (C_A (C_C _ _) (C_A _ _)) -> 95 
  C_C (C_A (C_D _ _) (C_B)) (C_A (C_C _ _) (C_C _ _)) -> 96 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_C _ _) _) -> 97 
  C_C (C_C (C_C _ _) (C_B)) (C_A (C_C _ _) (C_A _ _)) -> 98 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_C (C_C _ _) (C_D _ _)) -> 99 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_A (C_B) _) -> 100 
  C_C _ (C_C (C_C _ _) (C_B)) -> 101 
  C_C (C_A (C_C _ _) _) (C_A (C_D _ _) (C_A _ _)) -> 102 
  C_C (C_A (C_C _ _) _) (C_C _ _) -> 103 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_B) _) -> 104 
  C_C (C_C _ (C_D _ _)) (C_A (C_B) _) -> 105 
  C_C (C_D (C_A _ _) _) (C_C (C_C _ _) (C_B)) -> 106 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_A (C_B) (C_D _ _)) -> 107 
  C_C (C_A (C_D _ _) (C_B)) (C_A (C_B) _) -> 108 
  C_C (C_D (C_D _ _) _) (C_D (C_C _ _) _) -> 109 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_C (C_A _ _) (C_B)) -> 110 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_C (C_D _ _) (C_B)) -> 111 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_C _ (C_C _ _)) -> 112 
  C_C (C_A (C_B) (C_D _ _)) (C_C (C_C _ _) _) -> 113 
  C_C (C_A _ (C_D _ _)) (C_D (C_B) _) -> 114 
  C_C (C_A (C_B) (C_C _ _)) (C_C (C_C _ _) _) -> 115 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_A _ (C_C _ _)) -> 116 
  C_C (C_A (C_D _ _) _) (C_A (C_A _ _) (C_B)) -> 117 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_A (C_B) (C_B)) -> 118 
  C_C (C_C (C_D _ _) (C_B)) (C_A (C_C _ _) (C_B)) -> 119 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_C _ _) (C_C _ _)) -> 120 
  C_C (C_C (C_D _ _) (C_B)) (C_C (C_C _ _) (C_B)) -> 121 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_C (C_D _ _) _) -> 122 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_C (C_C _ _) _) -> 123 
  C_C (C_A _ (C_B)) (C_C (C_D _ _) _) -> 124 
  C_C (C_A (C_B) (C_C _ _)) (C_A _ (C_B)) -> 125 
  C_C (C_D (C_B) _) (C_A (C_B) _) -> 126 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_A (C_D _ _) (C_B)) -> 127 
  C_C (C_A (C_C _ _) (C_D _ _)) (C_C _ _) -> 128 
  C_C (C_B) (C_C _ (C_A _ _)) -> 129 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_C (C_D _ _) (C_D _ _)) -> 130 
  C_C (C_C (C_D _ _) (C_B)) (C_C (C_A _ _) (C_A _ _)) -> 131 
  C_C (C_C (C_B) (C_C _ _)) (C_A (C_D _ _) (C_D _ _)) -> 132 
  C_C (C_A (C_B) (C_C _ _)) (C_C (C_A _ _) (C_B)) -> 133 
  C_C (C_D _ _) (C_A (C_A _ _) _) -> 134 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_A (C_C _ _) (C_A _ _)) -> 135 
  C_C (C_C _ (C_A _ _)) (C_A (C_A _ _) (C_C _ _)) -> 136 
  C_C (C_A (C_C _ _) (C_B)) (C_A _ (C_C _ _)) -> 137 
  C_C (C_D (C_D _ _) _) (C_A (C_D _ _) (C_C _ _)) -> 138 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_B) -> 139 
  C_C (C_A (C_A _ _) _) (C_C (C_B) _) -> 140 
  C_C (C_C (C_B) (C_B)) (C_C (C_B) (C_A _ _)) -> 141 
  C_C (C_A (C_C _ _) (C_D _ _)) (C_A (C_A _ _) (C_B)) -> 142 
  C_C (C_A (C_B) (C_C _ _)) (C_A (C_B) _) -> 143 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_D _ _) -> 144 
  C_C (C_D (C_D _ _) _) (C_A (C_C _ _) (C_D _ _)) -> 145 
  C_C (C_A _ (C_B)) (C_D _ _) -> 146 
  C_C (C_C _ (C_C _ _)) (C_A _ (C_B)) -> 147 
  C_C (C_A (C_A _ _) (C_B)) (C_A (C_B) (C_C _ _)) -> 148 
  C_C (C_C (C_A _ _) (C_B)) (C_A (C_D _ _) (C_B)) -> 149 
  C_C (C_D _ _) (C_B) -> 150 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_A (C_C _ _) (C_D _ _)) -> 151 
  C_C (C_A (C_B) _) (C_A (C_D _ _) (C_A _ _)) -> 152 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_A (C_A _ _) (C_C _ _)) -> 153 
  C_C (C_C _ (C_C _ _)) (C_D (C_C _ _) _) -> 154 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_A (C_A _ _) (C_A _ _)) -> 155 
  C_C (C_C (C_D _ _) _) (C_C (C_D _ _) (C_A _ _)) -> 156 
  C_C (C_A (C_A _ _) (C_B)) (C_C (C_D _ _) (C_C _ _)) -> 157 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_C _ (C_C _ _)) -> 158 
  C_C (C_C _ (C_D _ _)) (C_C (C_A _ _) (C_B)) -> 159 
  C_C (C_C (C_B) (C_D _ _)) (C_B) -> 160 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_A (C_B) (C_D _ _)) -> 161 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_C (C_C _ _) (C_B)) -> 162 
  C_C (C_C (C_D _ _) (C_B)) (C_C (C_B) _) -> 163 
  C_C (C_A (C_B) _) (C_A _ (C_B)) -> 164 
  C_C (C_C _ (C_B)) (C_C (C_B) _) -> 165 
  C_C (C_A _ (C_A _ _)) (C_C _ (C_C _ _)) -> 166 
  C_C (C_A _ (C_A _ _)) (C_C (C_D _ _) (C_D _ _)) -> 167 
  C_C (C_D (C_B) _) (C_C (C_D _ _) (C_C _ _)) -> 168 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_C (C_A _ _) (C_D _ _)) -> 169 
  C_C (C_A (C_A _ _) _) (C_A (C_A _ _) (C_C _ _)) -> 170 
  C_C (C_A (C_B) (C_C _ _)) (C_C (C_D _ _) (C_C _ _)) -> 171 
  C_C (C_A _ (C_A _ _)) _ -> 172 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_C (C_A _ _) _) -> 173 
  C_C (C_A _ (C_B)) (C_C _ _) -> 174 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C (C_A _ _) _) -> 175 
  C_C (C_A (C_B) (C_B)) (C_A (C_B) (C_D _ _)) -> 176 
  C_C (C_A _ _) (C_C (C_D _ _) (C_B)) -> 177 
  C_C (C_C (C_D _ _) (C_B)) (C_A (C_D _ _) (C_A _ _)) -> 178 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_A (C_A _ _) (C_C _ _)) -> 179 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_D (C_C _ _) _) -> 180 
  C_C (C_C (C_B) (C_A _ _)) (C_A (C_C _ _) (C_B)) -> 181 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_C (C_D _ _) (C_A _ _)) -> 182 
  C_C (C_D (C_A _ _) _) (C_A (C_C _ _) (C_B)) -> 183 
  C_C (C_A (C_B) _) (C_A (C_C _ _) (C_C _ _)) -> 184 
  C_C (C_C _ (C_A _ _)) (C_D (C_C _ _) _) -> 185 
  C_C (C_A (C_A _ _) _) (C_C (C_A _ _) _) -> 186 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_A (C_A _ _) (C_B)) -> 187 
  C_C (C_D (C_B) _) (C_A _ (C_C _ _)) -> 188 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_A (C_B) (C_C _ _)) -> 189 
  C_C (C_C (C_B) (C_B)) (C_C (C_A _ _) (C_C _ _)) -> 190 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_B) -> 191 
  C_C (C_C _ _) (C_C _ (C_B)) -> 192 
  C_C (C_A (C_B) _) (C_C _ (C_C _ _)) -> 193 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_A _ (C_C _ _)) -> 194 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_C (C_C _ _) (C_D _ _)) -> 195 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_C _ _) -> 196 
  C_C (C_A (C_B) (C_C _ _)) (C_C _ (C_D _ _)) -> 197 
  C_C (C_C _ (C_A _ _)) (C_A (C_C _ _) _) -> 198 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_A (C_D _ _) (C_D _ _)) -> 199 
  C_C (C_C (C_B) (C_A _ _)) (C_C _ (C_B)) -> 200 
  C_C (C_C (C_A _ _) (C_B)) (C_C _ _) -> 201 
  C_C (C_D (C_C _ _) _) (C_A _ _) -> 202 
  C_C (C_A (C_C _ _) (C_B)) (C_C _ (C_D _ _)) -> 203 
  C_C (C_A (C_C _ _) (C_B)) (C_C (C_B) _) -> 204 
  C_C (C_C (C_B) _) (C_C (C_D _ _) _) -> 205 
  C_C (C_A _ (C_D _ _)) (C_A (C_B) (C_A _ _)) -> 206 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_D _ _) (C_D _ _)) -> 207 
  C_C (C_C _ (C_C _ _)) (C_C (C_D _ _) (C_A _ _)) -> 208 
  C_C (C_A (C_A _ _) _) (C_A (C_B) _) -> 209 
  C_C (C_D _ _) (C_D (C_C _ _) _) -> 210 
  C_C (C_A (C_B) (C_C _ _)) (C_A (C_C _ _) _) -> 211 
  C_C (C_A (C_A _ _) _) (C_C (C_A _ _) (C_C _ _)) -> 212 
  C_C (C_C (C_B) (C_D _ _)) (C_A (C_A _ _) (C_D _ _)) -> 213 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_C _ (C_D _ _)) -> 214 
  C_C (C_A (C_B) (C_D _ _)) (C_A (C_D _ _) _) -> 215 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_A (C_C _ _) (C_D _ _)) -> 216 
  C_C (C_D (C_B) _) (C_C (C_A _ _) (C_A _ _)) -> 217 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_A (C_D _ _) _) -> 218 
  C_C (C_A _ (C_A _ _)) (C_D (C_D _ _) _) -> 219 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_C (C_A _ _) _) -> 220 
  C_C (C_C (C_B) _) (C_A (C_A _ _) (C_C _ _)) -> 221 
  C_C (C_D (C_A _ _) _) (C_C (C_A _ _) (C_B)) -> 222 
  C_C (C_C _ (C_B)) (C_A _ (C_C _ _)) -> 223 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_D (C_A _ _) _) -> 224 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_A (C_D _ _) (C_A _ _)) -> 225 
  C_C (C_C (C_D _ _) (C_A _ _)) (C_C (C_B) (C_D _ _)) -> 226 
  C_C (C_D (C_D _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 227 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_C (C_D _ _) (C_A _ _)) -> 228 
  C_C (C_A (C_C _ _) _) (C_C (C_D _ _) _) -> 229 
  C_C (C_C (C_A _ _) _) (C_C (C_C _ _) (C_D _ _)) -> 230 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_A _ (C_C _ _)) -> 231 
  C_C (C_A _ _) (C_A _ (C_C _ _)) -> 232 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_C (C_C _ _) (C_D _ _)) -> 233 
  C_C (C_D (C_A _ _) _) (C_A (C_D _ _) _) -> 234 
  C_C (C_C (C_D _ _) (C_B)) _ -> 235 
  C_C (C_C _ _) (C_A (C_C _ _) _) -> 236 
  C_C (C_C _ _) (C_A (C_D _ _) (C_D _ _)) -> 237 
  C_C (C_A _ (C_C _ _)) (C_C (C_A _ _) (C_C _ _)) -> 238 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_C (C_C _ _) _) -> 239 
  C_C (C_A (C_C _ _) _) (C_C (C_C _ _) _) -> 240 
  C_C (C_C (C_A _ _) (C_B)) (C_C (C_A _ _) _) -> 241 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_A (C_B) _) -> 242 
  C_C (C_B) (C_B) -> 243 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_C _ (C_D _ _)) -> 244 
  C_C (C_C (C_A _ _) (C_B)) (C_A (C_C _ _) _) -> 245 
  C_C (C_C (C_B) (C_A _ _)) (C_A (C_C _ _) _) -> 246 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_A (C_C _ _) (C_D _ _)) -> 247 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_A (C_D _ _) (C_A _ _)) -> 248 
  C_C (C_B) (C_C (C_B) (C_A _ _)) -> 249 
  C_C (C_C (C_D _ _) (C_B)) (C_A (C_A _ _) (C_B)) -> 250 
  C_C (C_D (C_C _ _) _) (C_A (C_B) (C_D _ _)) -> 251 
  C_C (C_C (C_D _ _) (C_A _ _)) (C_A (C_D _ _) (C_B)) -> 252 
  C_C (C_C (C_D _ _) (C_B)) (C_A (C_A _ _) (C_C _ _)) -> 253 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_A (C_D _ _) (C_D _ _)) -> 254 
  C_C (C_D (C_C _ _) _) (C_C _ (C_B)) -> 255 
  C_C (C_C (C_C _ _) _) (C_A _ (C_B)) -> 256 
  C_C (C_A _ _) (C_A (C_D _ _) (C_A _ _)) -> 257 
  C_C (C_C (C_D _ _) (C_A _ _)) (C_A (C_A _ _) (C_B)) -> 258 
  C_C (C_C (C_D _ _) _) (C_A (C_A _ _) (C_A _ _)) -> 259 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C (C_D _ _) (C_A _ _)) -> 260 
  C_C (C_A (C_D _ _) _) (C_A (C_B) (C_B)) -> 261 
  C_C (C_A (C_C _ _) _) (C_C (C_C _ _) (C_B)) -> 262 
  C_C (C_A (C_C _ _) (C_B)) (C_A (C_A _ _) (C_C _ _)) -> 263 
  C_C (C_C (C_D _ _) (C_B)) (C_C (C_A _ _) _) -> 264 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_D (C_C _ _) _) -> 265 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_A _ _) -> 266 
  C_C (C_A _ _) (C_C (C_B) (C_D _ _)) -> 267 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_A (C_C _ _) (C_A _ _)) -> 268 
  C_C (C_A _ (C_C _ _)) _ -> 269 
  C_C (C_D _ _) (C_C _ (C_C _ _)) -> 270 
  C_C (C_C (C_B) (C_D _ _)) (C_C (C_D _ _) _) -> 271 
  C_C (C_C (C_B) (C_A _ _)) (C_A (C_D _ _) (C_C _ _)) -> 272 
  C_C _ (C_C (C_B) (C_C _ _)) -> 273 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_A _ _) -> 274 
  C_C (C_A (C_D _ _) (C_B)) (C_C (C_A _ _) (C_B)) -> 275 
  C_C (C_B) (C_C (C_D _ _) (C_C _ _)) -> 276 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_C (C_A _ _) _) -> 277 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_C (C_A _ _) (C_A _ _)) -> 278 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_A (C_C _ _) (C_D _ _)) -> 279 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_A _ (C_B)) -> 280 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_A (C_A _ _) (C_B)) -> 281 
  C_C (C_A _ (C_D _ _)) (C_D (C_A _ _) _) -> 282 
  C_C (C_C (C_B) _) (C_C (C_A _ _) (C_B)) -> 283 
  C_C (C_A (C_B) (C_B)) (C_A (C_B) (C_C _ _)) -> 284 
  C_C (C_A _ (C_A _ _)) (C_A (C_C _ _) (C_C _ _)) -> 285 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_A (C_C _ _) (C_C _ _)) -> 286 
  C_C (C_C (C_D _ _) (C_B)) (C_A (C_B) (C_D _ _)) -> 287 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_C (C_D _ _) (C_A _ _)) -> 288 
  C_C (C_C (C_B) (C_C _ _)) (C_A _ _) -> 289 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_C (C_B) (C_A _ _)) -> 290 
  C_C (C_A _ (C_C _ _)) (C_A (C_D _ _) (C_B)) -> 291 
  C_C (C_C _ (C_D _ _)) (C_A (C_B) (C_C _ _)) -> 292 
  C_C (C_C _ (C_B)) (C_A (C_D _ _) (C_B)) -> 293 
  C_C (C_C _ _) (C_C (C_B) (C_D _ _)) -> 294 
  C_C (C_C (C_B) (C_D _ _)) (C_C _ (C_C _ _)) -> 295 
  C_C (C_A (C_B) (C_D _ _)) (C_D (C_B) _) -> 296 
  C_C (C_D (C_A _ _) _) (C_C (C_D _ _) _) -> 297 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_A _ (C_D _ _)) -> 298 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_A _ _) -> 299 
  C_C (C_B) (C_A (C_A _ _) (C_A _ _)) -> 300 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_C (C_C _ _) (C_A _ _)) -> 301 
  C_C (C_C _ (C_B)) (C_C _ (C_B)) -> 302 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_C _ (C_A _ _)) -> 303 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_C (C_A _ _) (C_A _ _)) -> 304 
  C_C (C_A _ (C_D _ _)) (C_D (C_C _ _) _) -> 305 
  C_C (C_C (C_D _ _) (C_A _ _)) (C_C _ (C_D _ _)) -> 306 
  C_C (C_D (C_A _ _) _) (C_A (C_C _ _) _) -> 307 
  C_C (C_C (C_B) (C_B)) (C_C _ (C_B)) -> 308 
  C_C (C_C _ (C_D _ _)) (C_C _ _) -> 309 
  C_C (C_A (C_A _ _) _) (C_C (C_B) (C_C _ _)) -> 310 
  C_C (C_A _ (C_B)) (C_A (C_C _ _) (C_B)) -> 311 
  C_C (C_A (C_B) _) (C_A (C_A _ _) (C_A _ _)) -> 312 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_C (C_A _ _) (C_B)) -> 313 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_C (C_A _ _) (C_C _ _)) -> 314 
  C_C (C_A (C_C _ _) (C_B)) (C_C (C_A _ _) _) -> 315 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_A (C_B) (C_C _ _)) -> 316 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 317 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_A (C_C _ _) (C_A _ _)) -> 318 
  C_C (C_C (C_B) (C_D _ _)) (C_A (C_A _ _) (C_B)) -> 319 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_A (C_C _ _) (C_B)) -> 320 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_A _ _) (C_B)) -> 321 
  C_C (C_B) (C_A (C_C _ _) (C_B)) -> 322 
  C_C (C_C (C_B) (C_B)) (C_C (C_D _ _) (C_D _ _)) -> 323 
  C_C (C_D (C_A _ _) _) (C_C _ (C_C _ _)) -> 324 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_A _ _) (C_A _ _)) -> 325 
  C_C (C_D _ _) (C_A _ (C_D _ _)) -> 326 
  C_C (C_C (C_B) (C_A _ _)) (C_C (C_A _ _) _) -> 327 
  C_C _ (C_A (C_D _ _) (C_D _ _)) -> 328 
  C_C (C_C (C_B) _) (C_A (C_D _ _) (C_A _ _)) -> 329 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_A _ (C_D _ _)) -> 330 
  C_C (C_A _ (C_A _ _)) (C_A (C_B) (C_C _ _)) -> 331 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_C _ _) (C_D _ _)) -> 332 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_D _ _) -> 333 
  C_C (C_A (C_A _ _) _) (C_A _ (C_C _ _)) -> 334 
  C_C (C_A (C_A _ _) _) (C_C _ (C_A _ _)) -> 335 
  C_C (C_A (C_B) (C_B)) (C_C (C_A _ _) _) -> 336 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_C (C_B) (C_C _ _)) -> 337 
  C_C (C_A (C_B) _) (C_C (C_A _ _) (C_B)) -> 338 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_C (C_D _ _) _) -> 339 
  C_C (C_A (C_C _ _) (C_B)) (C_A (C_C _ _) (C_B)) -> 340 
  C_C (C_D _ _) (C_D (C_D _ _) _) -> 341 
  C_C (C_A (C_B) _) (C_A (C_A _ _) (C_D _ _)) -> 342 
  C_C (C_A _ _) (C_C (C_A _ _) (C_A _ _)) -> 343 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_A (C_B) (C_C _ _)) -> 344 
  C_C (C_C (C_C _ _) _) (C_A _ (C_A _ _)) -> 345 
  C_C _ (C_C _ _) -> 346 
  C_C (C_C (C_B) _) (C_A (C_D _ _) (C_D _ _)) -> 347 
  C_C _ (C_A _ _) -> 348 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_D (C_A _ _) _) -> 349 
  C_C (C_A (C_B) _) (C_C (C_B) (C_B)) -> 350 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_A (C_B) (C_A _ _)) -> 351 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_D (C_B) _) -> 352 
  C_C (C_A (C_C _ _) (C_C _ _)) _ -> 353 
  C_C (C_C (C_B) (C_B)) (C_C (C_D _ _) _) -> 354 
  C_C (C_D (C_A _ _) _) (C_A _ (C_C _ _)) -> 355 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C (C_B) (C_C _ _)) -> 356 
  C_C (C_C (C_B) (C_B)) (C_B) -> 357 
  C_C (C_C (C_D _ _) _) (C_A _ (C_C _ _)) -> 358 
  C_C (C_D (C_A _ _) _) (C_C (C_B) _) -> 359 
  C_C (C_C (C_B) _) (C_D (C_C _ _) _) -> 360 
  C_C (C_B) (C_D _ _) -> 361 
  C_C (C_A (C_B) (C_C _ _)) (C_C (C_A _ _) _) -> 362 
  C_C _ (C_A (C_C _ _) (C_C _ _)) -> 363 
  C_C (C_C (C_C _ _) _) (C_A (C_C _ _) (C_A _ _)) -> 364 
  C_C (C_D (C_B) _) (C_A _ _) -> 365 
  C_C (C_C (C_A _ _) _) (C_D _ _) -> 366 
  C_C (C_A _ (C_C _ _)) (C_D (C_C _ _) _) -> 367 
  C_C (C_C (C_B) (C_D _ _)) (C_D _ _) -> 368 
  C_C (C_A (C_A _ _) _) (C_A (C_A _ _) (C_B)) -> 369 
  C_C (C_C _ (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 370 
  C_C (C_A (C_B) _) (C_C (C_B) (C_D _ _)) -> 371 
  C_C (C_C _ (C_A _ _)) (C_A (C_D _ _) (C_C _ _)) -> 372 
  C_C (C_D _ _) (C_C (C_A _ _) (C_A _ _)) -> 373 
  C_C (C_A _ (C_C _ _)) (C_A (C_C _ _) (C_D _ _)) -> 374 
  C_C (C_C _ _) (C_A (C_C _ _) (C_A _ _)) -> 375 
  C_C (C_C (C_A _ _) (C_B)) (C_C (C_A _ _) (C_C _ _)) -> 376 
  C_C (C_D (C_D _ _) _) (C_A (C_B) (C_C _ _)) -> 377 
  C_C (C_C (C_B) (C_D _ _)) (C_A (C_D _ _) (C_B)) -> 378 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_C (C_C _ _) (C_A _ _)) -> 379 
  C_C (C_A (C_D _ _) _) (C_A (C_D _ _) (C_A _ _)) -> 380 
  C_C (C_A _ _) (C_C _ (C_D _ _)) -> 381 
  C_C (C_C _ (C_A _ _)) (C_C (C_C _ _) (C_A _ _)) -> 382 
  C_C (C_A (C_C _ _) _) (C_A (C_B) (C_A _ _)) -> 383 
  C_C (C_A (C_D _ _) _) (C_A _ (C_D _ _)) -> 384 
  C_C _ (C_C _ (C_D _ _)) -> 385 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_A (C_C _ _) (C_A _ _)) -> 386 
  C_C (C_D (C_B) _) (C_C (C_C _ _) (C_A _ _)) -> 387 
  C_C (C_A (C_D _ _) (C_B)) (C_C (C_C _ _) (C_A _ _)) -> 388 
  C_C (C_C _ (C_D _ _)) (C_C _ (C_A _ _)) -> 389 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_C (C_D _ _) _) -> 390 
  C_C (C_C (C_A _ _) (C_B)) (C_C _ (C_D _ _)) -> 391 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_C (C_B) (C_B)) -> 392 
  C_C _ (C_A (C_A _ _) (C_A _ _)) -> 393 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_C (C_B) (C_A _ _)) -> 394 
  C_C (C_C _ _) (C_A _ (C_A _ _)) -> 395 
  C_C (C_A (C_A _ _) _) (C_C (C_D _ _) _) -> 396 
  C_C (C_A (C_B) (C_C _ _)) (C_A _ _) -> 397 
  C_C (C_C _ (C_B)) (C_A (C_A _ _) (C_B)) -> 398 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_C _ (C_A _ _)) -> 399 
  C_C (C_C _ _) (C_C _ (C_C _ _)) -> 400 
  C_C (C_A (C_C _ _) _) (C_A (C_A _ _) (C_D _ _)) -> 401 
  C_C (C_C _ (C_D _ _)) (C_C (C_A _ _) (C_C _ _)) -> 402 
  C_C (C_C (C_D _ _) (C_B)) (C_A (C_D _ _) (C_B)) -> 403 
  C_C (C_C (C_B) (C_D _ _)) (C_A _ _) -> 404 
  C_C (C_A (C_B) _) (C_A (C_D _ _) (C_C _ _)) -> 405 
  C_C (C_A (C_B) (C_A _ _)) (C_A (C_A _ _) (C_C _ _)) -> 406 
  C_C (C_C (C_B) _) (C_D (C_B) _) -> 407 
  C_C (C_B) (C_D (C_A _ _) _) -> 408 
  C_C (C_C (C_A _ _) (C_B)) (C_A (C_D _ _) (C_A _ _)) -> 409 
  C_C (C_D (C_D _ _) _) (C_A (C_D _ _) _) -> 410 
  C_C (C_A (C_B) (C_A _ _)) (C_A (C_B) (C_A _ _)) -> 411 
  C_C (C_C (C_B) (C_A _ _)) (C_A (C_D _ _) (C_D _ _)) -> 412 
  C_C (C_C (C_D _ _) _) _ -> 413 
  C_C (C_C (C_D _ _) (C_A _ _)) _ -> 414 
  C_C (C_D (C_D _ _) _) (C_A _ (C_B)) -> 415 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_A (C_A _ _) _) -> 416 
  C_C (C_A (C_B) (C_C _ _)) (C_C (C_B) (C_C _ _)) -> 417 
  C_C (C_A (C_C _ _) (C_D _ _)) (C_C (C_C _ _) (C_A _ _)) -> 418 
  C_C (C_A _ (C_A _ _)) (C_C (C_C _ _) (C_B)) -> 419 
  C_C (C_A (C_C _ _) _) (C_C (C_B) (C_B)) -> 420 
  C_C (C_A (C_B) (C_C _ _)) (C_A (C_B) (C_C _ _)) -> 421 
  C_C (C_D (C_A _ _) _) (C_A (C_C _ _) (C_D _ _)) -> 422 
  C_C (C_A (C_B) (C_B)) _ -> 423 
  C_C (C_A _ (C_D _ _)) (C_A (C_D _ _) (C_D _ _)) -> 424 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_C (C_D _ _) _) -> 425 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_A (C_A _ _) (C_C _ _)) -> 426 
  C_C (C_A (C_B) (C_B)) (C_A _ (C_B)) -> 427 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_A (C_C _ _) _) -> 428 
  C_C (C_D (C_B) _) (C_C (C_D _ _) (C_D _ _)) -> 429 
  C_C (C_A _ (C_D _ _)) (C_C _ (C_A _ _)) -> 430 
  C_C (C_A (C_C _ _) _) (C_C (C_B) (C_C _ _)) -> 431 
  C_C (C_C (C_D _ _) _) (C_A _ (C_A _ _)) -> 432 
  C_C (C_A (C_D _ _) (C_B)) (C_A _ (C_A _ _)) -> 433 
  C_C (C_D (C_C _ _) _) (C_A (C_D _ _) (C_B)) -> 434 
  C_C (C_A (C_B) (C_A _ _)) (C_C (C_C _ _) (C_B)) -> 435 
  C_C (C_A _ (C_A _ _)) (C_A (C_A _ _) (C_B)) -> 436 
  C_C (C_C (C_C _ _) _) (C_C (C_A _ _) (C_C _ _)) -> 437 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_A (C_B) (C_C _ _)) -> 438 
  C_C (C_D (C_D _ _) _) (C_C (C_D _ _) (C_D _ _)) -> 439 
  C_C (C_A (C_B) (C_A _ _)) (C_C (C_C _ _) _) -> 440 
  C_C (C_D (C_A _ _) _) (C_A (C_B) _) -> 441 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_A (C_A _ _) (C_D _ _)) -> 442 
  C_C (C_A (C_B) (C_C _ _)) (C_C (C_A _ _) (C_C _ _)) -> 443 
  C_C (C_A (C_C _ _) _) (C_C (C_B) (C_D _ _)) -> 444 
  C_C (C_D (C_D _ _) _) (C_A (C_A _ _) (C_D _ _)) -> 445 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_A (C_C _ _) _) -> 446 
  C_C (C_A (C_B) (C_B)) (C_A (C_D _ _) (C_A _ _)) -> 447 
  C_C (C_A (C_A _ _) _) (C_A (C_D _ _) _) -> 448 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_C (C_D _ _) (C_B)) -> 449 
  C_C (C_D (C_C _ _) _) (C_C (C_B) (C_A _ _)) -> 450 
  C_C (C_A (C_B) (C_A _ _)) (C_D (C_A _ _) _) -> 451 
  C_C (C_C (C_B) (C_A _ _)) (C_A _ (C_C _ _)) -> 452 
  C_C (C_A (C_D _ _) _) (C_D (C_B) _) -> 453 
  C_C (C_C _ (C_C _ _)) (C_A (C_D _ _) (C_B)) -> 454 
  C_C (C_C (C_D _ _) _) (C_A (C_D _ _) _) -> 455 
  C_C (C_C _ _) (C_C _ _) -> 456 
  C_C (C_A _ _) (C_C (C_B) (C_A _ _)) -> 457 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_C (C_A _ _) (C_C _ _)) -> 458 
  C_C (C_D (C_D _ _) _) (C_C (C_A _ _) (C_B)) -> 459 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C (C_D _ _) (C_C _ _)) -> 460 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_C (C_D _ _) (C_D _ _)) -> 461 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_D (C_D _ _) _) -> 462 
  C_C (C_C (C_B) (C_B)) (C_A (C_A _ _) (C_B)) -> 463 
  C_C (C_A _ (C_C _ _)) (C_C (C_D _ _) (C_C _ _)) -> 464 
  C_C (C_C _ (C_D _ _)) (C_D _ _) -> 465 
  C_C (C_A (C_B) (C_A _ _)) (C_A _ (C_B)) -> 466 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_C (C_B) (C_A _ _)) -> 467 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C (C_B) _) -> 468 
  C_A (C_A (C_B) (C_B)) (C_D (C_A _ _) _) -> 469 
  C_A (C_C _ (C_B)) (C_C _ (C_A _ _)) -> 470 
  C_A (C_C (C_B) (C_C _ _)) (C_D _ _) -> 471 
  C_A _ (C_C (C_A _ _) _) -> 472 
  C_A (C_C _ (C_A _ _)) (C_C (C_A _ _) (C_D _ _)) -> 473 
  C_A (C_C (C_A _ _) (C_A _ _)) (C_C _ (C_B)) -> 474 
  C_A (C_A _ _) (C_A (C_A _ _) (C_A _ _)) -> 475 
  C_A (C_A (C_D _ _) (C_B)) (C_C (C_C _ _) (C_B)) -> 476 
  C_A (C_D (C_C _ _) _) (C_C (C_D _ _) (C_A _ _)) -> 477 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_C _ (C_B)) -> 478 
  C_A (C_C (C_D _ _) (C_B)) (C_A _ (C_C _ _)) -> 479 
  C_A (C_A (C_D _ _) _) (C_A (C_D _ _) (C_B)) -> 480 
  C_A (C_B) (C_B) -> 481 
  C_A (C_A (C_C _ _) _) (C_C (C_D _ _) (C_C _ _)) -> 482 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_C (C_D _ _) _) -> 483 
  C_A (C_C (C_C _ _) (C_C _ _)) (C_C (C_B) (C_D _ _)) -> 484 
  C_A (C_A (C_D _ _) _) (C_A (C_C _ _) (C_A _ _)) -> 485 
  C_A (C_A _ (C_B)) (C_A _ (C_B)) -> 486 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_A (C_B) (C_C _ _)) -> 487 
  C_A (C_C (C_C _ _) (C_B)) (C_A (C_D _ _) (C_D _ _)) -> 488 
  C_A (C_C (C_D _ _) (C_C _ _)) (C_A (C_A _ _) (C_D _ _)) -> 489 
  C_A (C_C (C_B) (C_B)) (C_C (C_D _ _) (C_A _ _)) -> 490 
  C_A (C_A (C_B) (C_D _ _)) (C_C (C_B) (C_A _ _)) -> 491 
  C_A (C_C (C_B) (C_A _ _)) (C_A (C_D _ _) (C_D _ _)) -> 492 
  C_A (C_C (C_D _ _) (C_D _ _)) (C_C _ (C_C _ _)) -> 493 
  C_A (C_C (C_C _ _) (C_C _ _)) (C_A _ (C_D _ _)) -> 494 
  C_A (C_D _ _) (C_A (C_C _ _) (C_C _ _)) -> 495 
  C_A (C_C (C_D _ _) (C_B)) (C_C (C_C _ _) (C_D _ _)) -> 496 
  C_A (C_A _ (C_D _ _)) (C_A (C_B) (C_B)) -> 497 
  C_A (C_A _ (C_D _ _)) (C_C (C_B) _) -> 498 
  C_A (C_D (C_B) _) (C_C _ (C_C _ _)) -> 499 
  C_A (C_A (C_B) (C_B)) (C_A _ (C_B)) -> 500 
  C_A (C_A (C_B) (C_C _ _)) (C_A (C_D _ _) (C_A _ _)) -> 501 
  C_A (C_D (C_B) _) (C_D (C_A _ _) _) -> 502 
  C_A (C_C (C_C _ _) (C_C _ _)) (C_D _ _) -> 503 
  C_A (C_A (C_B) (C_D _ _)) (C_A (C_B) (C_C _ _)) -> 504 
  C_A (C_A _ (C_C _ _)) (C_C (C_C _ _) (C_D _ _)) -> 505 
  C_A (C_B) (C_A _ (C_A _ _)) -> 506 
  C_A (C_A (C_A _ _) _) (C_D _ _) -> 507 
  C_A (C_C (C_A _ _) _) (C_C (C_A _ _) (C_A _ _)) -> 508 
  C_A (C_A _ (C_B)) (C_C _ (C_D _ _)) -> 509 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_A (C_A _ _) (C_D _ _)) -> 510 
  C_A (C_A (C_D _ _) _) (C_A (C_B) (C_B)) -> 511 
  C_A (C_D (C_D _ _) _) (C_C (C_D _ _) (C_B)) -> 512 
  C_A (C_A _ (C_C _ _)) (C_A (C_C _ _) (C_C _ _)) -> 513 
  C_A (C_A (C_C _ _) _) (C_A (C_C _ _) (C_B)) -> 514 
  C_A (C_A (C_C _ _) _) (C_A (C_A _ _) (C_A _ _)) -> 515 
  C_A (C_A (C_D _ _) (C_B)) (C_D (C_B) _) -> 516 
  C_A (C_C (C_B) (C_D _ _)) (C_C (C_C _ _) (C_D _ _)) -> 517 
  C_A (C_D (C_C _ _) _) (C_A (C_B) (C_C _ _)) -> 518 
  C_A (C_C (C_A _ _) (C_A _ _)) (C_A (C_B) (C_A _ _)) -> 519 
  C_A (C_C (C_A _ _) (C_C _ _)) (C_D (C_A _ _) _) -> 520 
  C_A (C_A (C_B) (C_A _ _)) (C_C (C_B) (C_B)) -> 521 
  C_A (C_A (C_A _ _) (C_B)) (C_C (C_C _ _) (C_D _ _)) -> 522 
  C_A (C_A (C_D _ _) (C_B)) (C_A (C_C _ _) (C_A _ _)) -> 523 
  C_A (C_A _ (C_C _ _)) (C_A (C_B) (C_B)) -> 524 
  C_A (C_C (C_D _ _) _) (C_C _ (C_B)) -> 525 
  C_A (C_C (C_D _ _) (C_B)) (C_A (C_A _ _) (C_C _ _)) -> 526 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_D (C_D _ _) _) -> 527 
  C_A (C_C (C_C _ _) (C_B)) (C_C _ (C_B)) -> 528 
  C_A (C_A _ (C_D _ _)) (C_C _ (C_A _ _)) -> 529 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_A (C_B) (C_A _ _)) -> 530 
  C_A (C_C (C_A _ _) _) (C_A _ (C_A _ _)) -> 531 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_C (C_C _ _) (C_B)) -> 532 
  C_A (C_C (C_D _ _) (C_D _ _)) (C_A (C_D _ _) (C_B)) -> 533 
  C_A (C_A (C_B) (C_B)) (C_C (C_D _ _) (C_B)) -> 534 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_A (C_B) (C_C _ _)) -> 535 
  C_A (C_C (C_C _ _) (C_B)) (C_A (C_A _ _) _) -> 536 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_A _ (C_C _ _)) -> 537 
  C_A (C_C (C_A _ _) (C_A _ _)) (C_C (C_D _ _) (C_D _ _)) -> 538 
  C_A (C_C (C_B) (C_A _ _)) (C_D (C_C _ _) _) -> 539 
  C_A _ (C_C (C_B) _) -> 540 
  C_A (C_A (C_D _ _) (C_D _ _)) (C_A (C_C _ _) _) -> 541 
  C_A (C_C (C_D _ _) (C_B)) (C_A _ _) -> 542 
  C_A (C_D (C_A _ _) _) (C_A (C_B) (C_C _ _)) -> 543 
  C_A (C_C _ (C_D _ _)) (C_C (C_A _ _) (C_C _ _)) -> 544 
  C_A (C_C _ (C_D _ _)) (C_D (C_B) _) -> 545 
  C_A (C_C (C_A _ _) (C_A _ _)) (C_A (C_A _ _) _) -> 546 
  C_A (C_C (C_B) (C_A _ _)) (C_A (C_C _ _) (C_C _ _)) -> 547 
  C_A (C_C (C_D _ _) (C_C _ _)) (C_A (C_D _ _) (C_D _ _)) -> 548 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_C _ (C_A _ _)) -> 549 
  C_A (C_A (C_B) (C_B)) (C_C (C_D _ _) _) -> 550 
  C_A (C_C (C_A _ _) (C_C _ _)) (C_C _ _) -> 551 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 552 
  C_A (C_C _ (C_D _ _)) (C_A (C_B) (C_C _ _)) -> 553 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_D (C_C _ _) _) -> 554 
  C_A (C_C (C_D _ _) (C_D _ _)) (C_C (C_A _ _) (C_C _ _)) -> 555 
  C_A (C_C _ _) (C_A (C_B) (C_B)) -> 556 
  C_A (C_C (C_B) (C_B)) (C_A (C_B) (C_C _ _)) -> 557 
  C_A (C_D _ _) (C_C (C_A _ _) (C_C _ _)) -> 558 
  C_A (C_C (C_A _ _) (C_A _ _)) (C_C (C_A _ _) (C_B)) -> 559 
  C_A (C_D (C_D _ _) _) (C_A (C_D _ _) _) -> 560 
  C_A (C_C _ (C_A _ _)) (C_A (C_A _ _) (C_C _ _)) -> 561 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_C _ (C_C _ _)) -> 562 
  C_A (C_C (C_D _ _) (C_D _ _)) (C_A (C_D _ _) (C_A _ _)) -> 563 
  C_A (C_D (C_D _ _) _) _ -> 564 
  C_A (C_D (C_D _ _) _) (C_C (C_A _ _) (C_A _ _)) -> 565 
  C_A (C_C (C_B) (C_A _ _)) (C_C (C_B) (C_D _ _)) -> 566 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A (C_A _ _) _) -> 567 
  C_A (C_D _ _) (C_C (C_B) (C_A _ _)) -> 568 
  C_A (C_C (C_C _ _) _) (C_A _ (C_C _ _)) -> 569 
  C_A (C_C (C_A _ _) (C_A _ _)) (C_C (C_D _ _) _) -> 570 
  C_A (C_C (C_C _ _) _) (C_C (C_B) (C_C _ _)) -> 571 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_C (C_D _ _) (C_C _ _)) -> 572 
  C_A (C_C (C_D _ _) (C_B)) (C_A _ (C_D _ _)) -> 573 
  C_A _ (C_D (C_C _ _) _) -> 574 
  C_A (C_A (C_B) (C_A _ _)) (C_A (C_B) (C_B)) -> 575 
  C_A (C_D (C_C _ _) _) _ -> 576 
  C_A (C_C (C_D _ _) (C_B)) (C_D (C_D _ _) _) -> 577 
  C_A (C_A (C_D _ _) (C_A _ _)) (C_A (C_C _ _) _) -> 578 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_C (C_D _ _) _) -> 579 
  C_A (C_C (C_B) (C_B)) (C_C (C_C _ _) _) -> 580 
  C_A (C_C (C_B) (C_D _ _)) (C_C _ (C_D _ _)) -> 581 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_C _ (C_A _ _)) -> 582 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_A _ _) -> 583 
  C_A (C_A _ (C_D _ _)) (C_C (C_C _ _) (C_B)) -> 584 
  C_A (C_C (C_D _ _) (C_C _ _)) (C_A (C_A _ _) (C_C _ _)) -> 585 
  C_A _ (C_C _ (C_B)) -> 586 
  C_A (C_C (C_A _ _) (C_B)) (C_D (C_C _ _) _) -> 587 
  C_A (C_C (C_A _ _) (C_A _ _)) (C_A (C_D _ _) (C_D _ _)) -> 588 
  C_A (C_A (C_B) (C_D _ _)) (C_C (C_C _ _) (C_C _ _)) -> 589 
  C_A (C_C (C_C _ _) (C_B)) (C_C _ (C_D _ _)) -> 590 
  C_A (C_C (C_A _ _) (C_B)) (C_A (C_C _ _) (C_B)) -> 591 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_C (C_C _ _) _) -> 592 
  C_A (C_A (C_C _ _) (C_B)) (C_A (C_A _ _) (C_B)) -> 593 
  C_A (C_C (C_C _ _) (C_C _ _)) (C_A (C_B) (C_A _ _)) -> 594 
  C_A (C_D (C_C _ _) _) (C_C _ (C_D _ _)) -> 595 
  C_A (C_A (C_A _ _) (C_D _ _)) (C_A (C_A _ _) (C_A _ _)) -> 596 
  C_A (C_A (C_C _ _) _) (C_A (C_C _ _) _) -> 597 
  C_A (C_C (C_A _ _) (C_D _ _)) _ -> 598 
  C_A (C_A (C_C _ _) _) (C_A (C_B) _) -> 599 
  C_A (C_A (C_D _ _) (C_B)) (C_C _ (C_A _ _)) -> 600 
  C_A (C_A (C_C _ _) _) _ -> 601 
  C_A (C_D (C_D _ _) _) (C_C (C_D _ _) _) -> 602 
  C_A (C_D (C_B) _) (C_A (C_B) _) -> 603 
  C_A (C_C _ _) (C_C _ _) -> 604 
  C_A (C_C (C_B) (C_C _ _)) (C_A (C_A _ _) (C_C _ _)) -> 605 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_A (C_C _ _) (C_B)) -> 606 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_A (C_B) _) -> 607 
  C_A (C_C (C_D _ _) (C_C _ _)) (C_C (C_B) (C_D _ _)) -> 608 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_A (C_C _ _) _) -> 609 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_A _ (C_B)) -> 610 
  C_A (C_C (C_A _ _) (C_C _ _)) (C_A (C_D _ _) (C_B)) -> 611 
  C_A (C_A (C_B) (C_D _ _)) (C_A (C_A _ _) (C_B)) -> 612 
  C_A (C_C (C_A _ _) (C_A _ _)) (C_D (C_C _ _) _) -> 613 
  C_A (C_A (C_A _ _) (C_D _ _)) (C_A _ (C_C _ _)) -> 614 
  C_A (C_C (C_A _ _) (C_C _ _)) (C_C (C_B) (C_D _ _)) -> 615 
  C_A (C_A _ (C_B)) (C_A (C_A _ _) _) -> 616 
  C_A (C_C (C_C _ _) _) (C_C _ _) -> 617 
  C_A (C_A (C_D _ _) (C_B)) (C_A _ (C_B)) -> 618 
  C_A (C_C (C_D _ _) (C_A _ _)) (C_C (C_D _ _) (C_B)) -> 619 
  C_A (C_C _ (C_D _ _)) (C_A (C_D _ _) (C_B)) -> 620 
  C_A (C_A _ (C_A _ _)) (C_A (C_A _ _) (C_D _ _)) -> 621 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_D (C_B) _) -> 622 
  C_A (C_A (C_C _ _) (C_B)) (C_A (C_B) _) -> 623 
  C_A (C_C _ (C_C _ _)) (C_C (C_B) (C_D _ _)) -> 624 
  C_A (C_D (C_A _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 625 
  C_A (C_C (C_C _ _) (C_B)) (C_A (C_B) (C_A _ _)) -> 626 
  C_A (C_A (C_D _ _) (C_D _ _)) (C_D _ _) -> 627 
  C_A (C_C (C_D _ _) (C_C _ _)) (C_C (C_A _ _) (C_A _ _)) -> 628 
  C_A (C_C (C_A _ _) (C_C _ _)) (C_A (C_A _ _) (C_C _ _)) -> 629 
  C_A (C_A _ _) (C_A (C_C _ _) _) -> 630 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_D (C_B) _) -> 631 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_C (C_D _ _) _) -> 632 
  C_A (C_A _ (C_A _ _)) (C_C (C_A _ _) (C_D _ _)) -> 633 
  C_A (C_C (C_D _ _) (C_B)) (C_C (C_B) (C_A _ _)) -> 634 
  C_A (C_A _ (C_C _ _)) (C_A (C_B) (C_D _ _)) -> 635 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_A (C_A _ _) (C_C _ _)) -> 636 
  C_A (C_C _ (C_D _ _)) (C_D (C_D _ _) _) -> 637 
  C_A (C_A (C_A _ _) (C_B)) (C_C (C_B) (C_B)) -> 638 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_C _ (C_D _ _)) -> 639 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_A _ (C_D _ _)) -> 640 
  C_A (C_C _ (C_A _ _)) (C_C (C_A _ _) (C_A _ _)) -> 641 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A (C_A _ _) (C_C _ _)) -> 642 
  C_A (C_C _ _) (C_C _ (C_A _ _)) -> 643 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_C (C_A _ _) (C_A _ _)) -> 644 
  C_A (C_A (C_D _ _) (C_A _ _)) (C_C (C_A _ _) (C_B)) -> 645 
  C_A (C_A _ (C_D _ _)) (C_C (C_D _ _) _) -> 646 
  C_A (C_B) (C_C (C_D _ _) _) -> 647 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_C (C_C _ _) (C_A _ _)) -> 648 
  C_A (C_A _ _) (C_C (C_D _ _) (C_A _ _)) -> 649 
  C_A (C_C (C_A _ _) (C_B)) (C_C (C_A _ _) (C_A _ _)) -> 650 
  C_A (C_A (C_C _ _) _) (C_C (C_B) (C_C _ _)) -> 651 
  C_A (C_D (C_D _ _) _) (C_A (C_C _ _) (C_D _ _)) -> 652 
  C_A (C_C _ (C_B)) (C_A (C_D _ _) (C_A _ _)) -> 653 
  C_A (C_A (C_B) (C_C _ _)) (C_C (C_B) (C_C _ _)) -> 654 
  C_A (C_A (C_D _ _) (C_D _ _)) (C_A (C_D _ _) _) -> 655 
  C_A (C_A (C_B) (C_C _ _)) (C_D (C_A _ _) _) -> 656 
  C_A (C_C (C_B) (C_A _ _)) (C_A (C_C _ _) (C_A _ _)) -> 657 
  C_A (C_A (C_B) _) (C_C (C_A _ _) (C_D _ _)) -> 658 
  C_A (C_A _ _) _ -> 659 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_C _ _) _) -> 660 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_A _ (C_D _ _)) -> 661 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_A (C_C _ _) _) -> 662 
  C_A (C_C (C_D _ _) (C_B)) (C_C (C_B) _) -> 663 
  C_A (C_A (C_B) _) (C_A (C_A _ _) _) -> 664 
  C_A (C_C _ (C_C _ _)) (C_A (C_B) (C_B)) -> 665 
  C_A (C_A (C_D _ _) _) (C_C (C_D _ _) (C_D _ _)) -> 666 
  C_A (C_A (C_C _ _) _) (C_A (C_C _ _) (C_A _ _)) -> 667 
  C_A (C_A (C_D _ _) (C_B)) (C_A (C_B) _) -> 668 
  C_A (C_D (C_A _ _) _) (C_D (C_D _ _) _) -> 669 
  C_A (C_C (C_B) (C_D _ _)) (C_D (C_A _ _) _) -> 670 
  C_A (C_D (C_A _ _) _) (C_A (C_D _ _) _) -> 671 
  C_A (C_C (C_C _ _) _) (C_C (C_A _ _) (C_A _ _)) -> 672 
  C_A (C_D (C_D _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 673 
  C_A (C_C (C_D _ _) _) (C_A _ (C_B)) -> 674 
  C_A (C_A (C_A _ _) _) (C_A (C_D _ _) (C_A _ _)) -> 675 
  C_A (C_C (C_A _ _) _) (C_C (C_A _ _) _) -> 676 
  C_A (C_D _ _) (C_C (C_C _ _) (C_B)) -> 677 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_C _ (C_A _ _)) -> 678 
  C_A (C_A (C_B) _) (C_C (C_B) (C_A _ _)) -> 679 
  C_A (C_D (C_A _ _) _) (C_B) -> 680 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_C _ _) (C_C _ _)) -> 681 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_C (C_A _ _) (C_B)) -> 682 
  C_A (C_A (C_B) (C_A _ _)) (C_A (C_C _ _) (C_A _ _)) -> 683 
  C_A (C_B) (C_A (C_A _ _) (C_D _ _)) -> 684 
  C_A (C_A (C_D _ _) (C_B)) (C_D (C_A _ _) _) -> 685 
  C_A (C_A (C_A _ _) _) (C_C (C_B) (C_B)) -> 686 
  C_A (C_A (C_B) _) (C_A (C_B) (C_D _ _)) -> 687 
  C_A (C_A (C_B) (C_C _ _)) (C_C (C_C _ _) _) -> 688 
  C_A (C_A (C_B) (C_C _ _)) (C_C (C_C _ _) (C_D _ _)) -> 689 
  C_A (C_C (C_C _ _) _) (C_A (C_A _ _) (C_C _ _)) -> 690 
  C_A (C_C (C_A _ _) (C_C _ _)) (C_D (C_C _ _) _) -> 691 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_A (C_A _ _) (C_C _ _)) -> 692 
  C_A (C_A _ (C_C _ _)) (C_A (C_D _ _) (C_A _ _)) -> 693 
  C_A (C_C _ (C_B)) (C_C (C_C _ _) _) -> 694 
  C_A (C_C (C_D _ _) (C_A _ _)) (C_C (C_D _ _) _) -> 695 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_D _ _) -> 696 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_A (C_D _ _) (C_C _ _)) -> 697 
  C_A (C_A (C_A _ _) _) (C_A (C_A _ _) (C_B)) -> 698 
  C_A (C_D _ _) (C_A (C_B) (C_C _ _)) -> 699 
  C_A (C_A _ (C_B)) (C_C (C_A _ _) _) -> 700 
  C_A (C_C _ _) (C_A (C_A _ _) _) -> 701 
  C_A (C_D (C_C _ _) _) (C_A (C_A _ _) (C_B)) -> 702 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_A (C_A _ _) (C_B)) -> 703 
  C_A (C_C (C_B) _) (C_A (C_C _ _) (C_B)) -> 704 
  C_A (C_A (C_C _ _) (C_B)) (C_C (C_C _ _) (C_A _ _)) -> 705 
  C_A (C_C (C_B) (C_D _ _)) (C_A (C_C _ _) (C_A _ _)) -> 706 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_A (C_B) _) -> 707 
  C_A (C_C (C_C _ _) (C_C _ _)) (C_A (C_B) (C_B)) -> 708 
  C_A (C_B) (C_C (C_C _ _) (C_D _ _)) -> 709 
  C_A (C_C (C_A _ _) (C_A _ _)) (C_A (C_D _ _) (C_B)) -> 710 
  C_A (C_A (C_B) (C_A _ _)) (C_C (C_D _ _) (C_A _ _)) -> 711 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_A (C_A _ _) (C_B)) -> 712 
  C_A (C_A _ (C_D _ _)) (C_C (C_C _ _) _) -> 713 
  C_A (C_C (C_A _ _) _) _ -> 714 
  C_A (C_C (C_A _ _) _) (C_A (C_C _ _) (C_D _ _)) -> 715 
  C_A (C_A (C_A _ _) _) (C_A (C_B) (C_D _ _)) -> 716 
  C_A (C_C _ (C_A _ _)) (C_C (C_D _ _) (C_C _ _)) -> 717 
  C_A (C_D (C_C _ _) _) (C_A (C_C _ _) (C_D _ _)) -> 718 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_A (C_A _ _) (C_C _ _)) -> 719 
  C_A (C_A (C_C _ _) (C_B)) (C_C (C_A _ _) _) -> 720 
  C_A (C_A _ (C_B)) (C_A (C_D _ _) (C_B)) -> 721 
  C_A (C_D (C_C _ _) _) (C_A _ (C_D _ _)) -> 722 
  C_A (C_A (C_C _ _) _) (C_B) -> 723 
  C_A (C_C (C_B) (C_C _ _)) (C_A (C_A _ _) (C_A _ _)) -> 724 
  C_A (C_C (C_C _ _) (C_B)) (C_C (C_A _ _) (C_C _ _)) -> 725 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_C (C_C _ _) (C_D _ _)) -> 726 
  C_A (C_C (C_B) (C_B)) (C_C _ (C_C _ _)) -> 727 
  C_A (C_C (C_A _ _) _) (C_A _ (C_B)) -> 728 
  C_A (C_A (C_C _ _) _) (C_A _ (C_D _ _)) -> 729 
  C_A (C_D (C_B) _) (C_C (C_C _ _) _) -> 730 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_D (C_D _ _) _) -> 731 
  C_A (C_D (C_C _ _) _) (C_A (C_B) (C_D _ _)) -> 732 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_D (C_B) _) -> 733 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_A (C_C _ _) (C_C _ _)) -> 734 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_C (C_B) (C_A _ _)) -> 735 
  C_A (C_D (C_B) _) (C_A (C_D _ _) (C_B)) -> 736 
  C_A (C_C (C_D _ _) (C_D _ _)) (C_C (C_B) (C_A _ _)) -> 737 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_C (C_A _ _) (C_C _ _)) -> 738 
  C_A (C_A (C_B) (C_A _ _)) (C_A _ (C_D _ _)) -> 739 
  C_A (C_C _ (C_C _ _)) (C_C (C_C _ _) _) -> 740 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_C (C_B) (C_A _ _)) -> 741 
  C_A (C_C (C_D _ _) _) (C_C (C_C _ _) _) -> 742 
  C_A (C_A _ _) (C_C (C_B) (C_A _ _)) -> 743 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_A (C_D _ _) (C_A _ _)) -> 744 
  C_A (C_A (C_D _ _) (C_D _ _)) (C_C _ (C_D _ _)) -> 745 
  C_A (C_C _ (C_A _ _)) (C_A (C_D _ _) (C_D _ _)) -> 746 
  C_A (C_D (C_C _ _) _) (C_A (C_A _ _) _) -> 747 
  C_A (C_C (C_A _ _) (C_B)) (C_C (C_C _ _) (C_C _ _)) -> 748 
  C_A (C_C (C_D _ _) (C_B)) (C_C (C_B) (C_B)) -> 749 
  C_A (C_C (C_D _ _) (C_B)) (C_A _ (C_B)) -> 750 
  C_A (C_C (C_D _ _) (C_A _ _)) (C_A (C_B) (C_A _ _)) -> 751 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_C (C_D _ _) (C_A _ _)) -> 752 
  C_A (C_B) (C_A (C_C _ _) _) -> 753 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A (C_C _ _) (C_C _ _)) -> 754 
  C_A (C_A (C_D _ _) (C_C _ _)) (C_C _ (C_D _ _)) -> 755 
  C_A (C_A (C_A _ _) (C_B)) (C_A (C_C _ _) (C_B)) -> 756 
  C_A (C_C (C_D _ _) _) (C_D (C_D _ _) _) -> 757 
  C_A (C_C _ (C_C _ _)) (C_A (C_C _ _) (C_C _ _)) -> 758 
  C_A (C_C (C_D _ _) (C_C _ _)) (C_A (C_D _ _) (C_C _ _)) -> 759 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_C (C_D _ _) (C_D _ _)) -> 760 
  C_A (C_A (C_C _ _) (C_A _ _)) _ -> 761 
  C_A (C_A _ (C_B)) (C_B) -> 762 
  C_A (C_C (C_D _ _) (C_D _ _)) (C_A _ (C_B)) -> 763 
  C_A (C_A (C_D _ _) (C_B)) (C_A (C_D _ _) (C_D _ _)) -> 764 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_B) -> 765 
  C_A (C_C _ (C_D _ _)) (C_A (C_C _ _) (C_A _ _)) -> 766 
  C_A (C_C _ _) (C_A (C_A _ _) (C_D _ _)) -> 767 
  C_A (C_C (C_A _ _) (C_B)) (C_C (C_C _ _) (C_D _ _)) -> 768 
  C_A (C_C (C_D _ _) (C_D _ _)) (C_C (C_A _ _) _) -> 769 
  C_A (C_A (C_C _ _) _) (C_A (C_B) (C_A _ _)) -> 770 
  C_A (C_C (C_B) _) (C_C (C_B) (C_D _ _)) -> 771 
  C_A (C_D (C_C _ _) _) (C_C (C_B) (C_D _ _)) -> 772 
  C_A (C_A (C_D _ _) (C_C _ _)) (C_A (C_A _ _) (C_D _ _)) -> 773 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_C (C_C _ _) (C_D _ _)) -> 774 
  C_A (C_C (C_B) (C_B)) (C_A (C_B) (C_D _ _)) -> 775 
  C_A (C_C (C_B) (C_C _ _)) (C_D (C_D _ _) _) -> 776 
  C_A (C_C _ (C_D _ _)) (C_C _ _) -> 777 
  C_A (C_A (C_C _ _) _) (C_C (C_B) _) -> 778 
  C_A (C_A (C_A _ _) (C_B)) (C_A (C_A _ _) _) -> 779 
  C_A (C_C _ _) (C_A (C_D _ _) (C_D _ _)) -> 780 
  C_A (C_C (C_C _ _) (C_B)) (C_C _ _) -> 781 
  C_A _ (C_A (C_A _ _) _) -> 782 
  C_A (C_A _ (C_B)) (C_D (C_A _ _) _) -> 783 
  C_A (C_C (C_A _ _) (C_C _ _)) (C_A (C_B) (C_D _ _)) -> 784 
  C_A (C_A (C_B) (C_B)) (C_A (C_C _ _) (C_B)) -> 785 
  C_A (C_A (C_B) (C_A _ _)) (C_A (C_D _ _) (C_B)) -> 786 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_C (C_C _ _) _) -> 787 
  C_A (C_A (C_B) (C_A _ _)) (C_A _ (C_B)) -> 788 
  C_A (C_A _ (C_A _ _)) (C_C (C_D _ _) (C_B)) -> 789 
  C_A (C_A (C_B) (C_B)) (C_A _ _) -> 790 
  C_A (C_A (C_D _ _) (C_A _ _)) (C_C _ (C_B)) -> 791 
  C_A (C_C (C_D _ _) (C_C _ _)) (C_C _ (C_A _ _)) -> 792 
  C_A (C_A (C_B) _) (C_C (C_D _ _) (C_C _ _)) -> 793 
  C_A (C_C (C_D _ _) _) (C_C (C_D _ _) (C_A _ _)) -> 794 
  C_A (C_A (C_D _ _) (C_D _ _)) (C_A (C_A _ _) (C_B)) -> 795 
  C_A (C_A (C_A _ _) _) (C_A (C_D _ _) _) -> 796 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A _ (C_D _ _)) -> 797 
  C_A (C_A (C_A _ _) (C_B)) (C_C (C_A _ _) (C_C _ _)) -> 798 
  C_A (C_D _ _) (C_C _ (C_D _ _)) -> 799 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_D (C_A _ _) _) -> 800 
  C_A (C_A (C_B) (C_A _ _)) (C_C (C_A _ _) (C_A _ _)) -> 801 
  C_A (C_A _ (C_A _ _)) (C_C _ (C_B)) -> 802 
  C_A (C_A (C_B) (C_B)) (C_C _ (C_A _ _)) -> 803 
  C_A (C_C (C_D _ _) (C_B)) (C_A (C_D _ _) (C_C _ _)) -> 804 
  C_A (C_C (C_D _ _) _) (C_A (C_D _ _) _) -> 805 
  C_A (C_A _ (C_C _ _)) (C_A (C_D _ _) (C_B)) -> 806 
  C_A (C_C (C_B) (C_D _ _)) (C_A (C_B) (C_A _ _)) -> 807 
  C_A (C_D (C_D _ _) _) (C_A (C_A _ _) (C_B)) -> 808 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_D (C_A _ _) _) -> 809 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_C _ _) -> 810 
  C_A (C_A (C_D _ _) (C_A _ _)) (C_C _ (C_A _ _)) -> 811 
  C_A (C_B) (C_A (C_B) (C_A _ _)) -> 812 
  C_A (C_A _ (C_A _ _)) (C_A (C_D _ _) (C_C _ _)) -> 813 
  C_A (C_A (C_D _ _) (C_A _ _)) (C_A _ (C_C _ _)) -> 814 
  C_A (C_A _ (C_B)) (C_A (C_D _ _) (C_D _ _)) -> 815 
  C_A (C_A (C_C _ _) (C_B)) (C_C (C_D _ _) (C_A _ _)) -> 816 
  C_A (C_A _ (C_A _ _)) (C_C _ (C_C _ _)) -> 817 
  C_A (C_A (C_D _ _) (C_B)) (C_C (C_C _ _) (C_C _ _)) -> 818 
  C_A (C_C (C_A _ _) (C_A _ _)) (C_A (C_C _ _) (C_D _ _)) -> 819 
  C_A (C_C (C_A _ _) (C_C _ _)) (C_A (C_A _ _) (C_B)) -> 820 
  C_A (C_C (C_B) _) (C_A (C_D _ _) (C_B)) -> 821 
  C_A (C_C _ (C_B)) (C_A (C_A _ _) (C_C _ _)) -> 822 
  C_A (C_A (C_D _ _) (C_D _ _)) (C_C (C_A _ _) (C_B)) -> 823 
  C_A (C_C (C_C _ _) _) (C_C (C_C _ _) (C_A _ _)) -> 824 
  C_A (C_B) (C_A (C_B) (C_B)) -> 825 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_C _ (C_B)) -> 826 
  C_A (C_C (C_A _ _) _) (C_A (C_D _ _) (C_B)) -> 827 
  C_A (C_A (C_B) (C_D _ _)) (C_A (C_D _ _) _) -> 828 
  C_A (C_D (C_A _ _) _) (C_A (C_A _ _) (C_D _ _)) -> 829 
  C_A (C_A (C_D _ _) _) (C_B) -> 830 
  C_A (C_C (C_B) (C_D _ _)) (C_C (C_D _ _) (C_B)) -> 831 
  C_A (C_C (C_A _ _) _) (C_C (C_D _ _) (C_C _ _)) -> 832 
  C_A (C_A (C_B) (C_A _ _)) (C_A (C_A _ _) _) -> 833 
  C_A (C_C (C_D _ _) (C_C _ _)) (C_A _ (C_D _ _)) -> 834 
  C_A (C_C (C_C _ _) _) (C_D (C_A _ _) _) -> 835 
  C_A (C_A (C_A _ _) (C_B)) (C_C (C_B) (C_D _ _)) -> 836 
  C_A _ (C_A (C_D _ _) _) -> 837 
  C_A (C_A _ (C_A _ _)) (C_A (C_B) (C_A _ _)) -> 838 
  C_A (C_A (C_C _ _) (C_B)) (C_C (C_D _ _) _) -> 839 
  C_A (C_A (C_D _ _) _) (C_A _ _) -> 840 
  C_A _ (C_C (C_C _ _) (C_D _ _)) -> 841 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_A (C_B) (C_A _ _)) -> 842 
  C_A (C_D (C_D _ _) _) (C_A (C_B) _) -> 843 
  C_A (C_A (C_B) (C_D _ _)) (C_C _ (C_A _ _)) -> 844 
  C_A (C_D _ _) (C_C (C_C _ _) (C_A _ _)) -> 845 
  C_A (C_C (C_B) (C_C _ _)) (C_C (C_A _ _) _) -> 846 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_A (C_B) (C_D _ _)) -> 847 
  C_A (C_A (C_A _ _) _) (C_A (C_A _ _) (C_C _ _)) -> 848 
  C_A (C_C _ _) (C_C (C_D _ _) _) -> 849 
  C_A (C_C (C_D _ _) (C_D _ _)) (C_C (C_C _ _) (C_D _ _)) -> 850 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_A (C_B) (C_D _ _)) -> 851 
  C_A (C_C (C_B) (C_D _ _)) (C_A (C_B) _) -> 852 
  C_A (C_C (C_A _ _) _) (C_C _ _) -> 853 
  C_A (C_A (C_B) (C_B)) (C_A (C_C _ _) (C_C _ _)) -> 854 
  C_A (C_A (C_A _ _) (C_B)) (C_D (C_B) _) -> 855 
  C_A (C_C (C_C _ _) (C_C _ _)) (C_A (C_D _ _) (C_A _ _)) -> 856 
  C_A (C_A (C_D _ _) _) (C_A (C_C _ _) (C_D _ _)) -> 857 
  C_A (C_C _ (C_C _ _)) (C_A (C_C _ _) _) -> 858 
  C_A (C_A _ (C_C _ _)) (C_A _ (C_C _ _)) -> 859 
  C_A (C_C _ _) (C_D (C_B) _) -> 860 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_C (C_C _ _) _) -> 861 
  C_A (C_C _ (C_A _ _)) (C_C (C_B) (C_D _ _)) -> 862 
  C_A (C_A (C_D _ _) _) (C_A (C_B) (C_D _ _)) -> 863 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_A (C_D _ _) (C_A _ _)) -> 864 
  C_A (C_C (C_D _ _) (C_A _ _)) (C_A _ _) -> 865 
  C_A (C_C (C_D _ _) _) (C_A (C_A _ _) (C_D _ _)) -> 866 
  C_A (C_B) (C_C (C_C _ _) (C_B)) -> 867 
  C_A (C_C (C_A _ _) (C_B)) (C_D _ _) -> 868 
  C_A (C_C (C_B) (C_C _ _)) (C_A (C_C _ _) (C_C _ _)) -> 869 
  C_A (C_A (C_A _ _) (C_D _ _)) _ -> 870 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_C (C_A _ _) (C_C _ _)) -> 871 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_C (C_C _ _) _) -> 872 
  C_A (C_A (C_D _ _) _) (C_C (C_D _ _) (C_B)) -> 873 
  C_A (C_C (C_B) (C_C _ _)) (C_A (C_B) (C_D _ _)) -> 874 
  C_A (C_C (C_B) (C_B)) (C_C (C_D _ _) (C_D _ _)) -> 875 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_A (C_D _ _) (C_D _ _)) -> 876 
  C_A (C_C (C_D _ _) (C_A _ _)) (C_A _ (C_D _ _)) -> 877 
  C_A (C_C _ (C_B)) _ -> 878 
  C_A (C_C (C_C _ _) (C_B)) (C_A (C_D _ _) _) -> 879 
  C_A (C_D (C_D _ _) _) (C_C (C_A _ _) _) -> 880 
  C_A (C_A (C_C _ _) (C_B)) (C_A (C_D _ _) (C_D _ _)) -> 881 
  C_A (C_A (C_A _ _) _) (C_C (C_A _ _) (C_B)) -> 882 
  C_A (C_C (C_D _ _) (C_B)) (C_A (C_A _ _) (C_D _ _)) -> 883 
  C_A (C_A (C_D _ _) _) (C_C _ (C_C _ _)) -> 884 
  C_A (C_A (C_B) _) (C_D (C_B) _) -> 885 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_C (C_B) (C_D _ _)) -> 886 
  C_A (C_D (C_C _ _) _) (C_A (C_B) (C_B)) -> 887 
  C_A (C_C (C_B) (C_A _ _)) (C_C (C_C _ _) (C_A _ _)) -> 888 
  C_A (C_A (C_D _ _) (C_B)) (C_A (C_D _ _) (C_A _ _)) -> 889 
  C_A (C_C (C_A _ _) (C_B)) (C_C (C_A _ _) (C_D _ _)) -> 890 
  C_A (C_C (C_B) (C_B)) (C_D (C_A _ _) _) -> 891 
  C_A _ (C_C (C_D _ _) (C_A _ _)) -> 892 
  C_A (C_C _ (C_D _ _)) (C_A (C_D _ _) (C_C _ _)) -> 893 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A (C_D _ _) (C_A _ _)) -> 894 
  C_A (C_C (C_C _ _) (C_B)) (C_A _ (C_D _ _)) -> 895 
  C_A (C_C (C_B) (C_A _ _)) (C_C _ _) -> 896 
  C_A (C_C (C_C _ _) (C_C _ _)) (C_C (C_D _ _) (C_D _ _)) -> 897 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_D (C_C _ _) _) -> 898 
  C_A (C_A (C_A _ _) (C_D _ _)) (C_C (C_B) (C_A _ _)) -> 899 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_C (C_D _ _) (C_B)) -> 900 
  C_A (C_A (C_C _ _) (C_B)) (C_A (C_C _ _) (C_D _ _)) -> 901 
  C_A (C_C _ (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 902 
  C_A (C_A (C_B) (C_B)) (C_C (C_A _ _) (C_C _ _)) -> 903 
  C_A (C_C (C_C _ _) (C_C _ _)) (C_A (C_B) _) -> 904 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_A (C_D _ _) _) -> 905 
  C_A (C_C (C_B) (C_A _ _)) (C_C (C_C _ _) _) -> 906 
  C_A (C_C (C_C _ _) (C_D _ _)) (C_A (C_D _ _) _) -> 907 
  C_A (C_A _ (C_A _ _)) (C_C (C_D _ _) (C_A _ _)) -> 908 
  C_A (C_C (C_C _ _) _) (C_A (C_D _ _) (C_C _ _)) -> 909 
  C_A (C_A (C_B) (C_C _ _)) (C_A (C_C _ _) _) -> 910 
  C_A (C_C (C_A _ _) _) (C_A (C_D _ _) (C_A _ _)) -> 911 
  C_A (C_C _ (C_A _ _)) (C_D (C_B) _) -> 912 
  C_A (C_C _ (C_A _ _)) (C_C (C_B) (C_C _ _)) -> 913 
  C_A (C_B) (C_C (C_A _ _) (C_C _ _)) -> 914 
  C_A (C_D (C_A _ _) _) (C_C (C_C _ _) (C_B)) -> 915 
  C_A (C_D (C_A _ _) _) (C_D (C_B) _) -> 916 
  C_A (C_A (C_A _ _) (C_D _ _)) (C_C (C_C _ _) (C_A _ _)) -> 917 
  C_A (C_C _ (C_B)) (C_C (C_C _ _) (C_C _ _)) -> 918 
  C_A (C_C _ (C_D _ _)) (C_C (C_D _ _) (C_C _ _)) -> 919 
  C_A (C_C (C_C _ _) _) (C_C (C_C _ _) (C_D _ _)) -> 920 
  C_A (C_C (C_C _ _) _) (C_A (C_B) (C_B)) -> 921 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_A (C_C _ _) (C_A _ _)) -> 922 
  C_A (C_A (C_A _ _) (C_B)) (C_A (C_D _ _) (C_A _ _)) -> 923 
  C_A (C_A (C_A _ _) _) (C_A (C_B) (C_B)) -> 924 
  C_A (C_C _ (C_A _ _)) (C_A _ (C_B)) -> 925 
  C_A (C_A _ _) (C_C (C_D _ _) (C_C _ _)) -> 926 
  C_A (C_B) (C_C (C_C _ _) (C_C _ _)) -> 927 
  C_A (C_D (C_A _ _) _) (C_C (C_B) (C_B)) -> 928 
  C_A (C_C (C_B) _) (C_A (C_B) (C_A _ _)) -> 929 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_C (C_A _ _) (C_D _ _)) -> 930 
  C_A (C_C (C_B) (C_A _ _)) (C_C (C_B) (C_B)) -> 931 
  C_A (C_C _ (C_B)) (C_D (C_C _ _) _) -> 932 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_A _ (C_A _ _)) -> 933 
  C_A (C_C _ (C_A _ _)) (C_A (C_A _ _) (C_B)) -> 934 
  C_A (C_D (C_B) _) (C_A (C_B) (C_B)) -> 935 
  C_A (C_D (C_D _ _) _) (C_C (C_C _ _) (C_D _ _)) -> 936 
  C_A (C_C _ (C_C _ _)) _ -> 937 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_C _ (C_A _ _)) -> 938 
  C_A (C_C (C_D _ _) _) (C_C (C_A _ _) (C_B)) -> 939 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_A (C_C _ _) (C_D _ _)) -> 940 
  C_A (C_C (C_D _ _) _) (C_A _ (C_C _ _)) -> 941 
  C_A (C_C _ (C_B)) (C_C (C_B) (C_B)) -> 942 
  C_A _ (C_A _ (C_B)) -> 943 
  C_A (C_C (C_D _ _) (C_A _ _)) (C_C (C_A _ _) (C_C _ _)) -> 944 
  C_A (C_C _ (C_D _ _)) (C_C _ (C_A _ _)) -> 945 
  C_A (C_A (C_C _ _) (C_B)) (C_C (C_B) (C_B)) -> 946 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_A (C_D _ _) (C_B)) -> 947 
  C_A (C_C (C_B) (C_B)) (C_A (C_C _ _) (C_A _ _)) -> 948 
  C_A (C_C (C_C _ _) _) (C_C (C_A _ _) (C_C _ _)) -> 949 
  C_A (C_A (C_D _ _) (C_D _ _)) (C_A (C_A _ _) _) -> 950 
  C_A (C_A _ (C_C _ _)) (C_C (C_D _ _) (C_C _ _)) -> 951 
  C_A (C_C (C_C _ _) (C_C _ _)) (C_C (C_C _ _) (C_A _ _)) -> 952 
  C_A (C_A _ (C_C _ _)) (C_B) -> 953 
  C_A (C_A _ _) (C_A (C_C _ _) (C_A _ _)) -> 954 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_D (C_C _ _) _) -> 955 
  C_A (C_D (C_A _ _) _) (C_A _ (C_D _ _)) -> 956 
  C_A (C_A (C_C _ _) (C_B)) (C_A (C_A _ _) (C_D _ _)) -> 957 
  C_A (C_A (C_B) _) (C_A _ (C_A _ _)) -> 958 
  C_A (C_A (C_C _ _) (C_B)) (C_A _ (C_B)) -> 959 
  C_A (C_C (C_A _ _) _) (C_D (C_A _ _) _) -> 960 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_C (C_C _ _) (C_C _ _)) -> 961 
  C_A (C_C _ (C_B)) (C_C (C_C _ _) (C_B)) -> 962 
  C_A (C_C (C_C _ _) (C_B)) (C_A (C_B) (C_D _ _)) -> 963 
  C_A (C_C (C_B) (C_A _ _)) (C_A _ (C_C _ _)) -> 964 
  C_A (C_C (C_D _ _) (C_D _ _)) (C_C (C_D _ _) (C_D _ _)) -> 965 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A (C_B) _) -> 966 
  C_A (C_D (C_A _ _) _) (C_C (C_B) (C_A _ _)) -> 967 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_C (C_B) (C_B)) -> 968 
  C_A (C_C _ _) (C_A _ (C_A _ _)) -> 969 
  C_A _ (C_A (C_A _ _) (C_B)) -> 970 
  C_A (C_A (C_B) (C_A _ _)) (C_C (C_C _ _) (C_D _ _)) -> 971 
  C_A (C_C (C_C _ _) (C_B)) (C_C (C_B) (C_A _ _)) -> 972 
  C_A (C_A (C_C _ _) _) (C_A (C_A _ _) (C_B)) -> 973 
  C_A (C_A (C_D _ _) (C_C _ _)) _ -> 974 
  C_A (C_C (C_C _ _) _) (C_C (C_D _ _) (C_B)) -> 975 
  C_A (C_A (C_D _ _) (C_B)) (C_C _ (C_D _ _)) -> 976 
  C_A (C_A (C_D _ _) (C_A _ _)) (C_C (C_D _ _) (C_B)) -> 977 
  C_A (C_C (C_D _ _) (C_B)) (C_C (C_A _ _) (C_A _ _)) -> 978 
  C_A (C_A (C_D _ _) (C_A _ _)) (C_A (C_B) _) -> 979 
  C_A (C_C (C_B) (C_B)) (C_C (C_D _ _) _) -> 980 
  C_A (C_C _ (C_A _ _)) (C_C (C_D _ _) (C_A _ _)) -> 981 
  C_A (C_A _ (C_D _ _)) (C_C _ _) -> 982 
  C_A (C_C (C_A _ _) (C_B)) (C_A (C_D _ _) _) -> 983 
  C_A (C_A _ (C_C _ _)) (C_C _ (C_C _ _)) -> 984 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_C (C_B) (C_C _ _)) -> 985 
  C_A (C_A _ (C_B)) (C_C (C_A _ _) (C_A _ _)) -> 986 
  C_A (C_D (C_C _ _) _) (C_C (C_D _ _) (C_D _ _)) -> 987 
  C_A (C_C _ _) (C_C (C_C _ _) (C_B)) -> 988 
  C_A (C_A (C_A _ _) (C_B)) (C_C _ (C_B)) -> 989 
  C_A (C_C _ (C_D _ _)) (C_B) -> 990 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_D (C_D _ _) _) -> 991 
  C_A (C_C (C_C _ _) (C_A _ _)) (C_C (C_B) (C_D _ _)) -> 992 
  C_A (C_D (C_C _ _) _) (C_C (C_C _ _) (C_B)) -> 993 
  C_A (C_A _ (C_C _ _)) (C_D (C_A _ _) _) -> 994 
  C_A (C_A (C_D _ _) (C_D _ _)) (C_C (C_A _ _) (C_A _ _)) -> 995 
  C_A (C_D (C_D _ _) _) (C_C _ (C_A _ _)) -> 996 
  C_A (C_C _ (C_B)) (C_C (C_C _ _) (C_D _ _)) -> 997 
  C_A (C_C (C_C _ _) _) (C_A (C_D _ _) (C_D _ _)) -> 998 
  C_A (C_C (C_D _ _) (C_A _ _)) (C_B) -> 999 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A _ (C_C _ _)) -> 1000 
  C_A (C_A (C_A _ _) (C_D _ _)) (C_C (C_D _ _) _) -> 1001 
  C_A (C_A (C_C _ _) _) (C_C (C_D _ _) (C_A _ _)) -> 1002 
  C_A (C_A _ (C_D _ _)) (C_C (C_B) (C_A _ _)) -> 1003 
  C_A (C_D (C_D _ _) _) (C_A _ _) -> 1004 
  C_A (C_A (C_A _ _) (C_B)) (C_A (C_A _ _) (C_A _ _)) -> 1005 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_C _ _) (C_B)) -> 1006 
  C_A (C_C _ (C_D _ _)) (C_C (C_D _ _) (C_A _ _)) -> 1007 
  C_A (C_C (C_B) (C_B)) (C_A (C_B) (C_B)) -> 1008 
  C_A (C_D _ _) (C_A (C_A _ _) (C_A _ _)) -> 1009 
  C_A (C_A (C_B) (C_B)) (C_A (C_B) (C_C _ _)) -> 1010 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_C (C_A _ _) (C_A _ _)) -> 1011 
  C_A (C_A (C_D _ _) _) (C_D (C_A _ _) _) -> 1012 
  C_A (C_A (C_B) (C_A _ _)) (C_A (C_C _ _) (C_C _ _)) -> 1013 
  C_A (C_C (C_C _ _) (C_C _ _)) (C_C (C_C _ _) (C_D _ _)) -> 1014 
  C_A (C_A (C_D _ _) (C_D _ _)) (C_C (C_D _ _) (C_C _ _)) -> 1015 
  C_A (C_D (C_A _ _) _) (C_D (C_A _ _) _) -> 1016 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_C (C_B) (C_A _ _)) -> 1017 
  C_A (C_A (C_C _ _) (C_D _ _)) (C_C (C_B) (C_A _ _)) -> 1018 
  C_A (C_A (C_B) (C_D _ _)) (C_A (C_B) (C_D _ _)) -> 1019 
  C_A (C_C (C_A _ _) _) (C_A (C_A _ _) (C_D _ _)) -> 1020 
  C_A (C_D (C_B) _) (C_A (C_C _ _) (C_D _ _)) -> 1021 
  C_A (C_C _ (C_C _ _)) (C_C (C_B) (C_C _ _)) -> 1022 
  C_A (C_C (C_A _ _) (C_A _ _)) (C_C (C_C _ _) (C_B)) -> 1023 
  C_A (C_A _ (C_C _ _)) (C_C (C_C _ _) (C_A _ _)) -> 1024 
  C_A (C_C (C_D _ _) (C_C _ _)) (C_A (C_D _ _) _) -> 1025 
  C_A (C_D _ _) (C_C (C_D _ _) (C_D _ _)) -> 1026 
  C_A (C_A (C_D _ _) (C_A _ _)) (C_C _ (C_C _ _)) -> 1027 
  C_A (C_A (C_C _ _) (C_B)) (C_C (C_D _ _) (C_D _ _)) -> 1028 
  C_A (C_A (C_C _ _) (C_B)) (C_A (C_D _ _) _) -> 1029 
  C_A (C_D _ _) (C_C (C_B) (C_C _ _)) -> 1030 
  C_A (C_C (C_A _ _) (C_D _ _)) (C_C _ (C_B)) -> 1031 
  C_A (C_A _ (C_A _ _)) (C_A _ _) -> 1032 
  C_A (C_D (C_D _ _) _) (C_A (C_C _ _) (C_B)) -> 1033 
  C_A (C_A (C_D _ _) _) (C_A (C_A _ _) (C_B)) -> 1034 
  C_A (C_C (C_C _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 1035 
  C_A (C_C _ (C_B)) (C_A _ (C_D _ _)) -> 1036 
  C_A (C_C (C_A _ _) (C_B)) (C_C (C_B) (C_B)) -> 1037 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A (C_C _ _) (C_D _ _)) -> 1038 
  C_A (C_A (C_A _ _) (C_B)) (C_C _ (C_C _ _)) -> 1039 
  C_A (C_C _ _) (C_A (C_C _ _) (C_D _ _)) -> 1040 
  C_A (C_C _ (C_B)) (C_D (C_D _ _) _) -> 1041 
  C_A (C_A (C_B) (C_C _ _)) _ -> 1042 
  C_A (C_A (C_D _ _) (C_A _ _)) (C_D _ _) -> 1043 
  C_A (C_D (C_A _ _) _) (C_A (C_A _ _) (C_A _ _)) -> 1044 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_C (C_C _ _) (C_A _ _)) -> 1045 
  C_A (C_C (C_D _ _) (C_A _ _)) (C_C (C_C _ _) (C_B)) -> 1046 
  C_A (C_C (C_D _ _) (C_A _ _)) (C_A (C_A _ _) (C_C _ _)) -> 1047 
  C_A (C_A _ (C_A _ _)) (C_C (C_B) (C_D _ _)) -> 1048 
  C_A (C_C (C_A _ _) (C_B)) (C_C (C_B) (C_C _ _)) -> 1049 
  C_A (C_C (C_B) (C_C _ _)) (C_C (C_C _ _) (C_A _ _)) -> 1050 
  C_A (C_C _ (C_D _ _)) (C_C (C_C _ _) (C_B)) -> 1051 
