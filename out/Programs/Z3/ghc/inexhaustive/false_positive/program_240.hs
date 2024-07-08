module Program_23 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a b) (B_A b b) | C_B | C_C (B_A b b) (B_A Int a) | C_D (B_A a a) b

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_D _ _) (C_A (C_B) (C_D _ _)) -> 0 
  C_C (C_C (C_A _ _) _) _ -> 1 
  C_C (C_A (C_A _ _) (C_B)) (C_A (C_D _ _) (C_B)) -> 2 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_A (C_D _ _) (C_C _ _)) -> 3 
  C_C (C_C (C_B) _) (C_C (C_C _ _) (C_D _ _)) -> 4 
  C_C (C_A (C_A _ _) _) (C_A (C_A _ _) _) -> 5 
  C_C (C_A (C_A _ _) _) (C_C (C_C _ _) (C_D _ _)) -> 6 
  C_C (C_C _ (C_D _ _)) (C_C (C_C _ _) (C_A _ _)) -> 7 
  C_C (C_A _ (C_A _ _)) (C_A _ (C_A _ _)) -> 8 
  C_C (C_A (C_B) _) (C_D (C_D _ _) _) -> 9 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_D _ _) (C_B)) -> 10 
  C_C (C_C (C_A _ _) (C_B)) (C_D (C_C _ _) _) -> 11 
  C_C (C_A _ _) (C_C (C_C _ _) (C_A _ _)) -> 12 
  C_C (C_A _ (C_B)) (C_C (C_C _ _) (C_A _ _)) -> 13 
  C_C (C_D _ _) (C_C (C_A _ _) (C_C _ _)) -> 14 
  C_C (C_C (C_B) (C_D _ _)) (C_A (C_B) _) -> 15 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_A (C_C _ _) (C_D _ _)) -> 16 
  C_C (C_A (C_B) (C_B)) (C_A (C_D _ _) (C_D _ _)) -> 17 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C _ (C_D _ _)) -> 18 
  C_C (C_C (C_B) (C_C _ _)) (C_A (C_A _ _) (C_B)) -> 19 
  C_C (C_D _ _) (C_C _ (C_D _ _)) -> 20 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_A (C_D _ _) (C_B)) -> 21 
  C_C (C_C (C_D _ _) _) (C_A (C_B) (C_C _ _)) -> 22 
  C_C (C_C (C_A _ _) (C_B)) (C_C (C_C _ _) (C_C _ _)) -> 23 
  C_C (C_A (C_C _ _) (C_B)) (C_A (C_D _ _) _) -> 24 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_A (C_A _ _) (C_A _ _)) -> 25 
  C_C (C_C _ (C_D _ _)) (C_A (C_C _ _) _) -> 26 
  C_C (C_A (C_B) (C_A _ _)) (C_D (C_B) _) -> 27 
  C_C (C_D (C_D _ _) _) (C_A (C_C _ _) (C_B)) -> 28 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_A (C_A _ _) _) -> 29 
  C_C (C_A (C_D _ _) (C_B)) (C_A (C_C _ _) (C_B)) -> 30 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_A (C_D _ _) (C_B)) -> 31 
  C_C (C_C (C_C _ _) _) (C_A _ _) -> 32 
  C_C (C_C _ _) (C_A (C_A _ _) (C_B)) -> 33 
  C_C (C_B) (C_C (C_D _ _) _) -> 34 
  C_C (C_A (C_C _ _) (C_B)) (C_C (C_D _ _) (C_A _ _)) -> 35 
  C_C (C_B) (C_A (C_D _ _) (C_B)) -> 36 
  C_C (C_A (C_D _ _) (C_B)) (C_D (C_B) _) -> 37 
  C_C (C_C _ (C_C _ _)) (C_B) -> 38 
  C_C (C_D (C_D _ _) _) (C_C (C_A _ _) (C_A _ _)) -> 39 
  C_C (C_C (C_D _ _) (C_A _ _)) (C_C (C_C _ _) (C_D _ _)) -> 40 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_A (C_D _ _) _) -> 41 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 42 
  C_C (C_A _ (C_B)) (C_D (C_C _ _) _) -> 43 
  C_C (C_A (C_D _ _) (C_B)) (C_A (C_B) (C_B)) -> 44 
  C_C (C_C (C_B) (C_B)) (C_D (C_C _ _) _) -> 45 
  C_C (C_A (C_D _ _) _) (C_A (C_D _ _) _) -> 46 
  C_C (C_C (C_B) (C_D _ _)) (C_A (C_C _ _) (C_C _ _)) -> 47 
  C_C (C_C (C_C _ _) _) (C_A (C_C _ _) (C_B)) -> 48 
  C_C (C_A (C_C _ _) (C_B)) (C_A (C_A _ _) (C_B)) -> 49 
  C_C (C_A (C_B) (C_B)) (C_A (C_D _ _) (C_C _ _)) -> 50 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_C _ (C_C _ _)) -> 51 
  C_C (C_C (C_C _ _) _) (C_D (C_A _ _) _) -> 52 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_D (C_A _ _) _) -> 53 
  C_C (C_A (C_C _ _) (C_B)) (C_A _ (C_B)) -> 54 
  C_C (C_A (C_C _ _) _) (C_A (C_C _ _) (C_B)) -> 55 
  C_C (C_C (C_B) (C_D _ _)) (C_A _ (C_C _ _)) -> 56 
  C_C _ (C_C (C_C _ _) _) -> 57 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_A _ (C_B)) -> 58 
  C_C (C_C (C_B) (C_A _ _)) (C_C (C_B) (C_D _ _)) -> 59 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_C _ _) -> 60 
  C_C (C_C (C_B) (C_A _ _)) (C_C (C_C _ _) (C_B)) -> 61 
  C_C (C_D (C_A _ _) _) (C_A (C_B) (C_A _ _)) -> 62 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_D _ _) _) -> 63 
  C_C (C_A _ (C_B)) (C_C (C_D _ _) (C_B)) -> 64 
  C_C (C_C (C_A _ _) (C_B)) (C_A (C_D _ _) (C_C _ _)) -> 65 
  C_C (C_A (C_A _ _) (C_B)) (C_D (C_D _ _) _) -> 66 
  C_C _ (C_D (C_B) _) -> 67 
  C_C (C_C _ _) (C_C (C_D _ _) (C_B)) -> 68 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_D (C_B) _) -> 69 
  C_C (C_C (C_B) (C_C _ _)) (C_A (C_D _ _) (C_C _ _)) -> 70 
  C_C (C_D (C_B) _) (C_C (C_C _ _) (C_C _ _)) -> 71 
  C_C (C_C (C_B) (C_C _ _)) (C_C _ (C_B)) -> 72 
  C_C (C_C _ (C_A _ _)) (C_D _ _) -> 73 
  C_C (C_D _ _) (C_C (C_D _ _) (C_B)) -> 74 
  C_C (C_D (C_D _ _) _) (C_C (C_A _ _) (C_C _ _)) -> 75 
  C_C (C_A (C_C _ _) _) (C_A _ (C_B)) -> 76 
  C_C (C_A (C_D _ _) _) (C_A (C_A _ _) (C_C _ _)) -> 77 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C _ (C_A _ _)) -> 78 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_C (C_A _ _) (C_A _ _)) -> 79 
  C_C (C_C (C_B) (C_B)) (C_A (C_D _ _) (C_A _ _)) -> 80 
  C_C (C_D (C_A _ _) _) (C_A (C_A _ _) (C_C _ _)) -> 81 
  C_C (C_A _ (C_D _ _)) (C_C _ (C_B)) -> 82 
  C_C (C_C (C_B) _) (C_C (C_D _ _) (C_B)) -> 83 
  C_C (C_A (C_A _ _) (C_C _ _)) _ -> 84 
  C_C (C_A _ (C_A _ _)) (C_A (C_C _ _) _) -> 85 
  C_C (C_A (C_A _ _) _) (C_C (C_A _ _) (C_B)) -> 86 
  C_C _ (C_C (C_D _ _) (C_C _ _)) -> 87 
  C_C (C_C _ (C_B)) (C_A (C_C _ _) _) -> 88 
  C_C (C_A (C_A _ _) _) (C_B) -> 89 
  C_C (C_C _ _) (C_C (C_D _ _) _) -> 90 
  C_C (C_A _ (C_C _ _)) (C_A (C_D _ _) (C_C _ _)) -> 91 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_C (C_D _ _) (C_A _ _)) -> 92 
  C_C (C_A (C_B) (C_B)) (C_C (C_B) (C_D _ _)) -> 93 
  C_C (C_C _ (C_C _ _)) (C_C _ (C_D _ _)) -> 94 
  C_C (C_C (C_A _ _) _) (C_C (C_A _ _) _) -> 95 
  C_C (C_A (C_A _ _) (C_B)) (C_A (C_B) (C_D _ _)) -> 96 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_C (C_D _ _) (C_D _ _)) -> 97 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C (C_B) (C_A _ _)) -> 98 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_A (C_B) (C_D _ _)) -> 99 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_C (C_C _ _) (C_A _ _)) -> 100 
  C_C _ (C_C _ (C_A _ _)) -> 101 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_C (C_D _ _) (C_C _ _)) -> 102 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_A (C_D _ _) (C_D _ _)) -> 103 
  C_C (C_A (C_B) (C_B)) (C_C (C_D _ _) _) -> 104 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C (C_D _ _) (C_B)) -> 105 
  C_C (C_C _ (C_C _ _)) (C_A (C_D _ _) (C_A _ _)) -> 106 
  C_C (C_C _ (C_B)) (C_A (C_B) (C_C _ _)) -> 107 
  C_C (C_C _ (C_A _ _)) (C_C _ (C_C _ _)) -> 108 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_A (C_D _ _) (C_C _ _)) -> 109 
  C_C (C_C (C_D _ _) _) (C_A _ _) -> 110 
  C_C (C_A (C_B) (C_C _ _)) (C_A (C_C _ _) (C_B)) -> 111 
  C_C (C_D (C_B) _) (C_A (C_B) (C_A _ _)) -> 112 
  C_C (C_A (C_A _ _) (C_B)) (C_C (C_A _ _) (C_C _ _)) -> 113 
  C_C (C_A (C_A _ _) (C_B)) (C_A (C_C _ _) (C_D _ _)) -> 114 
  C_C (C_C _ _) (C_D (C_A _ _) _) -> 115 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_A (C_D _ _) _) -> 116 
  C_C (C_D (C_D _ _) _) (C_C (C_D _ _) _) -> 117 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_C (C_B) (C_A _ _)) -> 118 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_C (C_D _ _) (C_D _ _)) -> 119 
  C_C (C_C (C_D _ _) (C_B)) (C_D (C_A _ _) _) -> 120 
  C_C (C_A (C_A _ _) _) (C_D (C_C _ _) _) -> 121 
  C_C (C_A (C_A _ _) (C_A _ _)) _ -> 122 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_C _ (C_A _ _)) -> 123 
  C_C (C_D (C_A _ _) _) (C_C (C_C _ _) (C_D _ _)) -> 124 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_D _ _) -> 125 
  C_C (C_C (C_D _ _) (C_B)) (C_A _ (C_D _ _)) -> 126 
  C_C (C_C _ _) (C_A (C_B) (C_A _ _)) -> 127 
  C_C _ (C_D _ _) -> 128 
  C_C (C_C (C_A _ _) _) (C_A (C_A _ _) (C_B)) -> 129 
  C_C (C_A (C_A _ _) (C_B)) (C_A (C_A _ _) _) -> 130 
  C_C (C_A (C_A _ _) _) (C_A _ (C_A _ _)) -> 131 
  C_C (C_A (C_C _ _) (C_D _ _)) (C_C (C_C _ _) (C_C _ _)) -> 132 
  C_C (C_A (C_A _ _) _) (C_A (C_D _ _) (C_B)) -> 133 
  C_C (C_A _ (C_B)) (C_A (C_D _ _) (C_C _ _)) -> 134 
  C_C (C_C (C_D _ _) (C_A _ _)) (C_C (C_C _ _) (C_A _ _)) -> 135 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_A (C_B) (C_A _ _)) -> 136 
  C_C (C_C (C_B) (C_C _ _)) (C_A (C_A _ _) _) -> 137 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_A (C_C _ _) _) -> 138 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_D (C_B) _) -> 139 
  C_C (C_C _ _) (C_D (C_C _ _) _) -> 140 
  C_C (C_D (C_A _ _) _) (C_C (C_C _ _) _) -> 141 
  C_C (C_D (C_C _ _) _) (C_C _ (C_A _ _)) -> 142 
  C_C (C_A _ (C_A _ _)) (C_A _ (C_B)) -> 143 
  C_C (C_C (C_D _ _) _) (C_C (C_B) (C_D _ _)) -> 144 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_D (C_B) _) -> 145 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_C _ (C_B)) -> 146 
  C_C (C_C _ (C_B)) (C_A (C_C _ _) (C_B)) -> 147 
  C_C (C_A (C_A _ _) (C_B)) (C_C (C_C _ _) (C_A _ _)) -> 148 
  C_C (C_C _ (C_B)) (C_C (C_A _ _) (C_D _ _)) -> 149 
  C_C (C_A (C_B) (C_C _ _)) (C_C (C_A _ _) (C_D _ _)) -> 150 
  C_C (C_A _ (C_C _ _)) (C_C (C_A _ _) (C_B)) -> 151 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_A _ (C_A _ _)) -> 152 
  C_C (C_A _ (C_A _ _)) (C_A (C_D _ _) (C_B)) -> 153 
  C_C (C_C (C_D _ _) _) (C_A (C_C _ _) (C_A _ _)) -> 154 
  C_C (C_D (C_C _ _) _) (C_D _ _) -> 155 
  C_C (C_A _ (C_C _ _)) (C_C (C_C _ _) _) -> 156 
  C_C (C_C _ (C_B)) (C_A (C_C _ _) (C_C _ _)) -> 157 
  C_C (C_C (C_C _ _) _) (C_C (C_B) (C_B)) -> 158 
  C_C (C_D (C_A _ _) _) (C_B) -> 159 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_A (C_A _ _) (C_C _ _)) -> 160 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_A _ (C_D _ _)) -> 161 
  C_C (C_A (C_B) (C_A _ _)) (C_A _ (C_D _ _)) -> 162 
  C_C (C_D (C_A _ _) _) (C_A (C_B) (C_D _ _)) -> 163 
  C_C (C_A (C_C _ _) (C_B)) (C_C (C_B) (C_A _ _)) -> 164 
  C_C (C_C (C_C _ _) _) (C_A _ (C_C _ _)) -> 165 
  C_C (C_C (C_B) _) (C_A (C_B) (C_C _ _)) -> 166 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_D (C_D _ _) _) -> 167 
  C_C (C_A (C_B) _) (C_A (C_C _ _) (C_D _ _)) -> 168 
  C_C (C_D _ _) (C_A (C_D _ _) _) -> 169 
  C_C (C_C (C_D _ _) _) (C_C (C_D _ _) _) -> 170 
  C_C (C_A _ _) (C_C (C_B) (C_B)) -> 171 
  C_C (C_C _ _) (C_B) -> 172 
  C_C (C_A _ (C_A _ _)) (C_C (C_C _ _) (C_A _ _)) -> 173 
  C_C (C_C _ (C_B)) (C_D (C_C _ _) _) -> 174 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C (C_D _ _) (C_A _ _)) -> 175 
  C_C (C_C (C_B) (C_D _ _)) (C_A (C_B) (C_D _ _)) -> 176 
  C_C (C_A _ (C_B)) (C_A (C_D _ _) _) -> 177 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C (C_A _ _) (C_D _ _)) -> 178 
  C_C (C_C _ (C_B)) (C_A _ (C_D _ _)) -> 179 
  C_C (C_D (C_B) _) (C_C (C_D _ _) _) -> 180 
  C_C (C_A (C_A _ _) (C_B)) (C_D (C_C _ _) _) -> 181 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_D (C_D _ _) _) -> 182 
  C_C (C_A (C_C _ _) (C_D _ _)) (C_A (C_A _ _) (C_D _ _)) -> 183 
  C_C (C_C (C_B) _) (C_A _ (C_D _ _)) -> 184 
  C_C (C_A (C_C _ _) _) (C_C (C_A _ _) _) -> 185 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_A (C_A _ _) (C_A _ _)) -> 186 
  C_C (C_C (C_A _ _) (C_B)) (C_C (C_D _ _) (C_C _ _)) -> 187 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_A _ (C_A _ _)) -> 188 
  C_C _ (C_C (C_A _ _) (C_C _ _)) -> 189 
  C_C (C_A (C_B) (C_C _ _)) (C_C (C_D _ _) (C_B)) -> 190 
  C_C (C_A (C_B) _) (C_A (C_D _ _) _) -> 191 
  C_C (C_D (C_C _ _) _) (C_A (C_D _ _) (C_A _ _)) -> 192 
  C_C (C_A (C_A _ _) (C_B)) (C_C _ (C_B)) -> 193 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_A (C_D _ _) (C_C _ _)) -> 194 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_C (C_C _ _) (C_B)) -> 195 
  C_C (C_C (C_B) (C_D _ _)) (C_A _ (C_A _ _)) -> 196 
  C_C (C_C (C_C _ _) _) (C_C _ (C_B)) -> 197 
  C_C (C_C (C_B) (C_C _ _)) (C_A _ (C_A _ _)) -> 198 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_A _ (C_C _ _)) -> 199 
  C_C (C_A (C_A _ _) (C_B)) (C_C (C_C _ _) (C_B)) -> 200 
  C_C (C_A (C_D _ _) (C_B)) (C_C (C_A _ _) (C_C _ _)) -> 201 
  C_C (C_D (C_C _ _) _) (C_C _ _) -> 202 
  C_C (C_D (C_C _ _) _) (C_C (C_D _ _) _) -> 203 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C (C_D _ _) _) -> 204 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_C (C_D _ _) (C_B)) -> 205 
  C_C (C_A (C_C _ _) _) (C_A _ (C_D _ _)) -> 206 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_A (C_D _ _) (C_C _ _)) -> 207 
  C_C (C_D (C_B) _) (C_C (C_B) (C_B)) -> 208 
  C_C (C_A (C_A _ _) _) (C_A (C_C _ _) (C_D _ _)) -> 209 
  C_C (C_A (C_C _ _) (C_B)) (C_A (C_D _ _) (C_B)) -> 210 
  C_C (C_C (C_B) (C_A _ _)) (C_C _ (C_D _ _)) -> 211 
  C_C (C_A (C_A _ _) _) (C_C (C_B) (C_B)) -> 212 
  C_C (C_D (C_C _ _) _) (C_C (C_A _ _) (C_A _ _)) -> 213 
  C_C (C_C _ _) (C_A (C_D _ _) (C_B)) -> 214 
  C_C (C_A (C_A _ _) (C_B)) (C_C _ _) -> 215 
  C_C (C_A _ _) (C_A (C_B) (C_D _ _)) -> 216 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_A (C_A _ _) (C_D _ _)) -> 217 
  C_C (C_C (C_C _ _) _) (C_D (C_B) _) -> 218 
  C_C (C_C (C_B) (C_B)) (C_A (C_A _ _) (C_A _ _)) -> 219 
  C_C (C_A _ _) (C_C (C_A _ _) _) -> 220 
  C_C (C_C (C_C _ _) _) _ -> 221 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C (C_C _ _) (C_A _ _)) -> 222 
  C_C (C_C (C_B) (C_B)) (C_C (C_B) (C_B)) -> 223 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_A _ (C_B)) -> 224 
  C_C (C_C _ _) (C_C (C_B) _) -> 225 
  C_C (C_D (C_B) _) (C_C (C_A _ _) (C_B)) -> 226 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_C _ (C_D _ _)) -> 227 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_C (C_A _ _) (C_A _ _)) -> 228 
  C_C (C_A _ (C_D _ _)) (C_A _ (C_A _ _)) -> 229 
  C_C (C_A _ (C_B)) (C_C (C_C _ _) (C_B)) -> 230 
  C_C (C_A (C_A _ _) (C_B)) (C_C (C_C _ _) (C_D _ _)) -> 231 
  C_C (C_C (C_B) (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 232 
  C_C (C_A (C_D _ _) _) (C_C (C_B) (C_C _ _)) -> 233 
  C_C (C_C (C_B) _) (C_D (C_D _ _) _) -> 234 
  C_C (C_C _ (C_B)) (C_C (C_A _ _) (C_A _ _)) -> 235 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_C _ (C_B)) -> 236 
  C_C (C_A (C_B) (C_C _ _)) (C_C (C_D _ _) _) -> 237 
  C_C (C_C (C_D _ _) _) (C_A (C_B) (C_A _ _)) -> 238 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_C (C_C _ _) (C_D _ _)) -> 239 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C (C_D _ _) (C_C _ _)) -> 240 
  C_C (C_B) (C_A (C_B) (C_B)) -> 241 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C (C_C _ _) (C_C _ _)) -> 242 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_A (C_B) (C_D _ _)) -> 243 
  C_C (C_A (C_B) (C_B)) (C_A (C_A _ _) (C_D _ _)) -> 244 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_A (C_A _ _) (C_D _ _)) -> 245 
  C_C (C_A (C_B) (C_B)) (C_C _ (C_A _ _)) -> 246 
  C_C (C_A _ _) (C_C (C_C _ _) (C_C _ _)) -> 247 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_A (C_C _ _) (C_D _ _)) -> 248 
  C_C (C_A _ (C_C _ _)) (C_C (C_D _ _) (C_B)) -> 249 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_C _ _) -> 250 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_C (C_B) (C_B)) -> 251 
  C_C (C_A _ (C_B)) (C_C (C_B) (C_B)) -> 252 
  C_C (C_D (C_C _ _) _) (C_C (C_D _ _) (C_C _ _)) -> 253 
  C_C (C_C _ (C_A _ _)) (C_C (C_B) (C_A _ _)) -> 254 
  C_C (C_D (C_C _ _) _) (C_B) -> 255 
  C_C (C_C (C_B) (C_B)) (C_C (C_C _ _) (C_D _ _)) -> 256 
  C_C (C_A (C_B) (C_D _ _)) (C_A (C_A _ _) _) -> 257 
  C_C (C_A (C_C _ _) (C_D _ _)) (C_A (C_D _ _) (C_B)) -> 258 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_A (C_D _ _) (C_D _ _)) -> 259 
  C_C (C_A (C_A _ _) _) (C_C _ (C_D _ _)) -> 260 
  C_C (C_A (C_B) (C_B)) (C_A _ _) -> 261 
  C_C (C_D (C_C _ _) _) (C_A (C_B) (C_B)) -> 262 
  C_C (C_A (C_B) _) (C_A (C_B) _) -> 263 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_C (C_C _ _) (C_B)) -> 264 
  C_C (C_A (C_C _ _) _) (C_A (C_C _ _) (C_A _ _)) -> 265 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_D (C_B) _) -> 266 
  C_C (C_D (C_A _ _) _) _ -> 267 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_D (C_A _ _) _) -> 268 
  C_C (C_A _ (C_C _ _)) (C_C (C_A _ _) (C_A _ _)) -> 269 
  C_C (C_C _ (C_C _ _)) (C_C (C_A _ _) (C_A _ _)) -> 270 
  C_C (C_D (C_B) _) (C_D (C_A _ _) _) -> 271 
  C_C (C_C _ (C_B)) (C_C (C_D _ _) (C_D _ _)) -> 272 
  C_C (C_D (C_D _ _) _) (C_C (C_B) (C_B)) -> 273 
  C_C (C_C (C_D _ _) _) (C_A (C_B) (C_B)) -> 274 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_D (C_C _ _) _) -> 275 
  C_C (C_C (C_A _ _) _) (C_B) -> 276 
  C_C (C_D _ _) (C_C (C_C _ _) (C_D _ _)) -> 277 
  C_C (C_A (C_B) (C_A _ _)) (C_A (C_D _ _) (C_D _ _)) -> 278 
  C_C (C_D (C_B) _) (C_C (C_D _ _) (C_A _ _)) -> 279 
  C_C _ (C_A _ (C_C _ _)) -> 280 
  C_C (C_D _ _) (C_A _ (C_B)) -> 281 
  C_C (C_C (C_D _ _) (C_B)) (C_C _ (C_C _ _)) -> 282 
  C_C (C_A (C_B) (C_D _ _)) (C_C _ (C_A _ _)) -> 283 
  C_C (C_C (C_C _ _) _) (C_A (C_B) (C_D _ _)) -> 284 
  C_C (C_C (C_B) (C_B)) (C_A (C_D _ _) (C_C _ _)) -> 285 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C (C_A _ _) (C_D _ _)) -> 286 
  C_C (C_A _ (C_C _ _)) (C_C (C_A _ _) (C_D _ _)) -> 287 
  C_C (C_D (C_D _ _) _) (C_A _ (C_D _ _)) -> 288 
  C_C (C_A _ (C_D _ _)) (C_C (C_C _ _) (C_B)) -> 289 
  C_C (C_A (C_C _ _) (C_D _ _)) (C_C (C_D _ _) (C_D _ _)) -> 290 
  C_C (C_A _ _) (C_A (C_A _ _) (C_D _ _)) -> 291 
  C_A (C_A _ (C_D _ _)) (C_A (C_C _ _) (C_C _ _)) -> 292 
