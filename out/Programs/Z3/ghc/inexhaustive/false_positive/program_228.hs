module Program_12 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A | C_C B_A B_A | C_D B_A B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B (C_C (C_B _) C_A) -> 1 
  C_B (C_C C_A (C_B _)) -> 2 
  C_B (C_B (C_B _)) -> 3 
  C_C (C_C (C_B _) _) (C_D (C_D _ _) C_A) -> 4 
  C_C (C_B (C_B _)) (C_C (C_D _ _) _) -> 5 
  C_C (C_D (C_C _ _) _) (C_D (C_D _ _) (C_C _ _)) -> 6 
  C_C (C_C C_A C_A) (C_C (C_C _ _) (C_C _ _)) -> 7 
  C_C (C_B (C_C _ _)) (C_B (C_C _ _)) -> 8 
  C_C (C_D _ (C_C _ _)) (C_B (C_D _ _)) -> 9 
  C_C (C_C (C_D _ _) (C_B _)) (C_C _ _) -> 10 
  C_C (C_C C_A (C_D _ _)) (C_C (C_D _ _) (C_C _ _)) -> 11 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_B _) (C_B _)) -> 12 
  C_C (C_D (C_C _ _) _) (C_B (C_B _)) -> 13 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C (C_D _ _) (C_B _)) -> 14 
  C_C (C_C (C_B _) (C_B _)) (C_B (C_C _ _)) -> 15 
  C_C (C_C (C_D _ _) (C_B _)) (C_C (C_D _ _) (C_C _ _)) -> 16 
  C_C (C_C _ (C_B _)) (C_C (C_D _ _) C_A) -> 17 
  C_C (C_D _ _) (C_D (C_D _ _) _) -> 18 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_D (C_D _ _) (C_C _ _)) -> 19 
  C_C (C_D (C_B _) (C_C _ _)) (C_C _ C_A) -> 20 
  C_C (C_D C_A C_A) (C_C _ (C_D _ _)) -> 21 
  C_C (C_C C_A (C_B _)) (C_D (C_D _ _) (C_C _ _)) -> 22 
  C_C (C_C (C_D _ _) (C_B _)) (C_C (C_B _) (C_C _ _)) -> 23 
  C_C (C_C (C_B _) (C_C _ _)) (C_C _ (C_B _)) -> 24 
  C_C (C_D (C_B _) (C_C _ _)) (C_D C_A (C_D _ _)) -> 25 
  C_C (C_D C_A (C_B _)) _ -> 26 
  C_C (C_D (C_C _ _) C_A) (C_C _ _) -> 27 
  C_C (C_D (C_B _) C_A) (C_D (C_D _ _) (C_B _)) -> 28 
  C_C (C_C (C_C _ _) _) (C_C (C_B _) _) -> 29 
  C_C (C_C C_A (C_B _)) (C_D (C_D _ _) _) -> 30 
  C_C (C_B (C_C _ _)) (C_D C_A (C_C _ _)) -> 31 
  C_C (C_C (C_B _) _) (C_C (C_C _ _) (C_D _ _)) -> 32 
  C_C (C_C C_A _) (C_B (C_C _ _)) -> 33 
  C_C (C_C (C_C _ _) (C_B _)) (C_D (C_D _ _) (C_B _)) -> 34 
  C_C (C_D (C_D _ _) _) (C_C _ _) -> 35 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_D _ (C_C _ _)) -> 36 
  C_C C_A _ -> 37 
  C_C (C_D _ C_A) (C_D (C_D _ _) (C_B _)) -> 38 
  C_C (C_D _ C_A) (C_C _ (C_B _)) -> 39 
  C_C _ (C_C (C_D _ _) (C_D _ _)) -> 40 
  C_C (C_C _ C_A) (C_D C_A (C_D _ _)) -> 41 
  C_C (C_D (C_B _) (C_C _ _)) (C_C (C_D _ _) (C_D _ _)) -> 42 
  C_C (C_D (C_B _) (C_C _ _)) (C_D (C_B _) C_A) -> 43 
  C_C (C_C (C_C _ _) _) (C_D (C_B _) (C_B _)) -> 44 
  C_C (C_D _ _) (C_D (C_B _) _) -> 45 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_C C_A _) -> 46 
  C_C (C_C C_A (C_B _)) (C_C C_A (C_C _ _)) -> 47 
  C_C (C_C (C_B _) (C_C _ _)) (C_D _ C_A) -> 48 
  C_C (C_C _ (C_C _ _)) (C_C C_A C_A) -> 49 
  C_C (C_C (C_B _) C_A) (C_D (C_D _ _) (C_D _ _)) -> 50 
  C_C (C_C _ (C_B _)) (C_C (C_D _ _) (C_D _ _)) -> 51 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_B (C_C _ _)) -> 52 
  C_C (C_B C_A) (C_D C_A (C_C _ _)) -> 53 
  C_C (C_C (C_C _ _) C_A) (C_D C_A C_A) -> 54 
  C_C (C_D (C_D _ _) _) (C_D _ C_A) -> 55 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_C (C_B _) C_A) -> 56 
  C_C (C_C _ _) (C_C _ (C_C _ _)) -> 57 
  C_C (C_C (C_C _ _) _) (C_C (C_D _ _) (C_C _ _)) -> 58 
  C_C (C_C (C_D _ _) _) (C_B (C_B _)) -> 59 
  C_C (C_D _ (C_D _ _)) (C_D C_A (C_D _ _)) -> 60 
  C_C (C_C _ (C_B _)) (C_D (C_C _ _) (C_D _ _)) -> 61 
  C_C (C_D (C_B _) (C_B _)) (C_C (C_C _ _) (C_D _ _)) -> 62 
  C_C (C_C _ (C_C _ _)) (C_C _ (C_D _ _)) -> 63 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_D _ (C_C _ _)) -> 64 
  C_C (C_C _ _) (C_D C_A (C_B _)) -> 65 
  C_C (C_D (C_C _ _) C_A) (C_D C_A (C_D _ _)) -> 66 
  C_C (C_D _ (C_C _ _)) (C_D (C_C _ _) _) -> 67 
  C_C (C_C (C_D _ _) _) (C_C C_A (C_C _ _)) -> 68 
  C_C C_A (C_D C_A (C_B _)) -> 69 
  C_C (C_C C_A C_A) (C_C C_A (C_C _ _)) -> 70 
  C_C (C_D _ (C_D _ _)) (C_C _ (C_C _ _)) -> 71 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_D (C_D _ _) (C_C _ _)) -> 72 
  C_C (C_C (C_C _ _) C_A) (C_D (C_B _) _) -> 73 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_C C_A (C_B _)) -> 74 
  C_C (C_C _ (C_D _ _)) (C_D (C_D _ _) (C_D _ _)) -> 75 
  C_C (C_D _ C_A) (C_D _ C_A) -> 76 
  C_C (C_C (C_B _) (C_D _ _)) (C_B C_A) -> 77 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_B (C_B _)) -> 78 
  C_C (C_B (C_B _)) (C_D (C_D _ _) (C_B _)) -> 79 
  C_C (C_D _ (C_B _)) (C_C C_A C_A) -> 80 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_B _) C_A) -> 81 
  C_C (C_C C_A (C_C _ _)) (C_C (C_C _ _) C_A) -> 82 
  C_C C_A (C_C (C_B _) (C_C _ _)) -> 83 
  C_C (C_D (C_B _) (C_D _ _)) (C_C (C_D _ _) C_A) -> 84 
  C_C (C_C C_A _) (C_C _ (C_C _ _)) -> 85 
  C_C (C_D (C_D _ _) _) _ -> 86 
  C_C (C_D (C_D _ _) _) (C_C (C_B _) _) -> 87 
  C_C C_A (C_D _ C_A) -> 88 
  C_C (C_D (C_C _ _) _) (C_C _ C_A) -> 89 
  C_C (C_B (C_C _ _)) (C_C (C_D _ _) (C_D _ _)) -> 90 
  C_C (C_D _ (C_C _ _)) (C_D _ _) -> 91 
  C_C (C_D (C_B _) (C_D _ _)) (C_D (C_D _ _) _) -> 92 
  C_C _ (C_C C_A (C_B _)) -> 93 
  C_C (C_C (C_D _ _) (C_B _)) (C_C C_A C_A) -> 94 
  C_C (C_C C_A (C_D _ _)) C_A -> 95 
  C_C (C_C C_A (C_C _ _)) (C_D C_A _) -> 96 
  C_C (C_C C_A _) (C_C (C_B _) (C_D _ _)) -> 97 
  C_C (C_D C_A (C_C _ _)) (C_D (C_C _ _) (C_D _ _)) -> 98 
  C_C (C_D (C_B _) (C_C _ _)) (C_D (C_C _ _) (C_C _ _)) -> 99 
  C_C (C_C (C_B _) (C_C _ _)) (C_D (C_B _) _) -> 100 
  C_C (C_C (C_B _) C_A) (C_C C_A (C_C _ _)) -> 101 
  C_C (C_B _) (C_C C_A (C_D _ _)) -> 102 
  C_C (C_C _ (C_D _ _)) (C_D (C_D _ _) C_A) -> 103 
  C_C (C_D _ _) (C_B _) -> 104 
  C_C (C_C C_A _) (C_D C_A (C_D _ _)) -> 105 
  C_C (C_C _ (C_D _ _)) (C_D _ (C_C _ _)) -> 106 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_D (C_D _ _) C_A) -> 107 
  C_C (C_C (C_B _) _) (C_C _ _) -> 108 
  C_C (C_D (C_D _ _) C_A) (C_C C_A (C_D _ _)) -> 109 
  C_C (C_D (C_B _) (C_C _ _)) (C_C (C_C _ _) (C_B _)) -> 110 
  C_C (C_D _ C_A) (C_C C_A (C_B _)) -> 111 
  C_C (C_C (C_C _ _) _) (C_C C_A C_A) -> 112 
  C_C (C_D (C_C _ _) _) (C_C _ _) -> 113 
  C_C (C_D C_A (C_D _ _)) (C_C (C_B _) (C_D _ _)) -> 114 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_D (C_D _ _) C_A) -> 115 
  C_C (C_C C_A (C_C _ _)) (C_B (C_C _ _)) -> 116 
  C_C (C_D _ (C_D _ _)) (C_C (C_B _) (C_D _ _)) -> 117 
  C_C (C_C _ (C_C _ _)) (C_D (C_C _ _) (C_D _ _)) -> 118 
  C_C (C_D (C_B _) (C_D _ _)) (C_C (C_B _) (C_B _)) -> 119 
  C_C (C_C (C_D _ _) C_A) (C_C (C_B _) (C_C _ _)) -> 120 
  C_C (C_D (C_B _) _) (C_D (C_B _) (C_D _ _)) -> 121 
  C_C (C_C (C_D _ _) C_A) (C_D (C_C _ _) (C_B _)) -> 122 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_D _ (C_C _ _)) -> 123 
  C_C (C_D (C_B _) _) (C_D (C_B _) _) -> 124 
  C_C (C_C (C_D _ _) _) (C_C C_A (C_B _)) -> 125 
  C_C (C_C (C_B _) _) (C_C (C_B _) C_A) -> 126 
  C_C (C_C (C_B _) (C_D _ _)) _ -> 127 
  C_C (C_C _ (C_D _ _)) (C_D _ (C_D _ _)) -> 128 
  C_C (C_D _ (C_B _)) (C_D (C_D _ _) C_A) -> 129 
  C_C (C_C C_A (C_D _ _)) (C_B _) -> 130 
  C_C (C_D C_A _) (C_D (C_B _) C_A) -> 131 
  C_C (C_D _ (C_D _ _)) (C_D _ (C_C _ _)) -> 132 
  C_C (C_C C_A C_A) (C_C C_A _) -> 133 
  C_C (C_C (C_B _) (C_C _ _)) (C_D (C_C _ _) (C_D _ _)) -> 134 
  C_C (C_D (C_C _ _) C_A) (C_D (C_B _) (C_C _ _)) -> 135 
  C_C (C_C (C_C _ _) (C_B _)) (C_B (C_D _ _)) -> 136 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) (C_D _ _)) -> 137 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_C (C_C _ _) _) -> 138 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_D (C_C _ _) (C_C _ _)) -> 139 
  C_C (C_D C_A (C_D _ _)) (C_C (C_B _) C_A) -> 140 
  C_C (C_C (C_B _) C_A) (C_C (C_B _) _) -> 141 
  C_C (C_D (C_D _ _) C_A) (C_C (C_D _ _) _) -> 142 
  C_C (C_C (C_B _) (C_D _ _)) (C_B (C_D _ _)) -> 143 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_D (C_B _) _) -> 144 
  C_C (C_C _ _) (C_C (C_C _ _) (C_D _ _)) -> 145 
  C_C (C_C _ _) (C_C (C_C _ _) (C_B _)) -> 146 
  C_C (C_D (C_D _ _) (C_B _)) (C_D _ C_A) -> 147 
  C_C (C_D _ _) (C_C _ _) -> 148 
  C_C (C_C C_A (C_D _ _)) (C_D _ (C_C _ _)) -> 149 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_D (C_B _) (C_C _ _)) -> 150 
  C_C (C_C (C_D _ _) (C_B _)) (C_B (C_C _ _)) -> 151 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_C C_A C_A) -> 152 
  C_C (C_C _ C_A) (C_C (C_D _ _) (C_D _ _)) -> 153 
  C_C (C_C _ (C_B _)) (C_C _ C_A) -> 154 
  C_C (C_D C_A (C_C _ _)) (C_C C_A C_A) -> 155 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_C _ _) _) -> 156 
  C_C (C_D _ _) (C_D C_A (C_B _)) -> 157 
  C_C (C_C C_A (C_B _)) (C_C _ (C_D _ _)) -> 158 
  C_C (C_C (C_B _) (C_D _ _)) (C_D C_A (C_C _ _)) -> 159 
  C_C (C_D C_A _) (C_C (C_B _) (C_C _ _)) -> 160 
  C_C (C_D (C_B _) (C_D _ _)) (C_C _ (C_B _)) -> 161 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_D (C_D _ _) (C_B _)) -> 162 
  C_C (C_C (C_B _) (C_D _ _)) (C_D (C_B _) _) -> 163 
  C_C (C_D (C_C _ _) (C_B _)) (C_D _ (C_D _ _)) -> 164 
  C_C (C_C (C_B _) (C_C _ _)) (C_D _ (C_B _)) -> 165 
  C_C (C_D C_A (C_B _)) (C_C (C_D _ _) C_A) -> 166 
  C_C (C_B (C_D _ _)) (C_C C_A (C_C _ _)) -> 167 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_C (C_C _ _) (C_C _ _)) -> 168 
  C_C (C_D (C_B _) (C_B _)) (C_D (C_B _) (C_B _)) -> 169 
  C_C (C_C (C_D _ _) _) (C_D _ (C_C _ _)) -> 170 
  C_C (C_C C_A C_A) (C_D (C_D _ _) C_A) -> 171 
  C_C (C_D (C_C _ _) C_A) (C_D _ C_A) -> 172 
  C_C (C_C C_A (C_C _ _)) (C_D _ (C_C _ _)) -> 173 
  C_C (C_C (C_B _) (C_B _)) (C_D (C_C _ _) (C_D _ _)) -> 174 
  C_C (C_D (C_D _ _) _) (C_C (C_D _ _) C_A) -> 175 
  C_C (C_B C_A) (C_D (C_C _ _) (C_C _ _)) -> 176 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_D (C_D _ _) (C_B _)) -> 177 
  C_C (C_C (C_D _ _) _) (C_B (C_D _ _)) -> 178 
  C_C (C_D (C_D _ _) (C_B _)) (C_C (C_C _ _) (C_C _ _)) -> 179 
  C_C (C_B C_A) (C_D (C_B _) (C_C _ _)) -> 180 
  C_C (C_D (C_C _ _) (C_B _)) (C_C _ (C_C _ _)) -> 181 
  C_C (C_D (C_B _) _) (C_B (C_C _ _)) -> 182 
  C_C (C_C C_A (C_C _ _)) (C_D (C_B _) _) -> 183 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C (C_D _ _) C_A) -> 184 
  C_C (C_D C_A _) (C_C C_A (C_B _)) -> 185 
  C_C (C_B _) (C_D (C_D _ _) C_A) -> 186 
  C_C (C_C _ (C_D _ _)) (C_D (C_C _ _) C_A) -> 187 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_D _ _) (C_D _ _)) -> 188 
  C_C _ (C_D (C_C _ _) (C_B _)) -> 189 
  C_C (C_D (C_B _) (C_C _ _)) (C_C C_A _) -> 190 
  C_C (C_C (C_B _) _) (C_D _ (C_C _ _)) -> 191 
  C_C (C_C C_A C_A) (C_C (C_C _ _) _) -> 192 
  C_C (C_D C_A _) (C_D _ (C_C _ _)) -> 193 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C _ C_A) -> 194 
  C_C (C_C (C_C _ _) C_A) (C_C (C_C _ _) (C_B _)) -> 195 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_C (C_D _ _) C_A) -> 196 
  C_C (C_B (C_B _)) (C_C (C_D _ _) (C_B _)) -> 197 
  C_C (C_D (C_B _) (C_C _ _)) (C_B C_A) -> 198 
  C_C (C_D _ (C_D _ _)) (C_D _ (C_D _ _)) -> 199 
  C_C (C_D (C_C _ _) (C_B _)) (C_C _ (C_B _)) -> 200 
  C_C (C_D C_A _) (C_B _) -> 201 
  C_C (C_D (C_C _ _) _) (C_D C_A (C_D _ _)) -> 202 
  C_C (C_C (C_C _ _) (C_B _)) (C_D _ (C_B _)) -> 203 
  C_C (C_C C_A _) (C_B (C_D _ _)) -> 204 
  C_C (C_D _ C_A) (C_D (C_C _ _) (C_B _)) -> 205 
  C_C C_A (C_D (C_B _) (C_D _ _)) -> 206 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_D _ (C_C _ _)) -> 207 
  C_C (C_C (C_C _ _) _) (C_D (C_B _) C_A) -> 208 
  C_C (C_D _ _) (C_C (C_D _ _) C_A) -> 209 
  C_C (C_C _ C_A) (C_D (C_C _ _) C_A) -> 210 
  C_C (C_B (C_C _ _)) (C_D (C_C _ _) (C_B _)) -> 211 
  C_C (C_C _ C_A) (C_C (C_B _) (C_B _)) -> 212 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C C_A _) -> 213 
  C_C (C_C _ C_A) (C_C (C_C _ _) (C_D _ _)) -> 214 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_C C_A (C_C _ _)) -> 215 
  C_C (C_D _ C_A) (C_D _ (C_B _)) -> 216 
  C_C (C_D (C_D _ _) C_A) (C_B (C_B _)) -> 217 
  C_C (C_C C_A (C_D _ _)) (C_D C_A (C_B _)) -> 218 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_C (C_B _) (C_D _ _)) -> 219 
  C_C (C_D _ (C_B _)) (C_C (C_C _ _) (C_B _)) -> 220 
  C_C C_A (C_C (C_B _) (C_B _)) -> 221 
  C_C (C_C C_A (C_C _ _)) (C_B C_A) -> 222 
  C_C (C_C (C_C _ _) C_A) (C_D C_A (C_B _)) -> 223 
  C_C (C_C (C_B _) _) _ -> 224 
  C_C (C_D (C_C _ _) C_A) (C_B _) -> 225 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_D _ (C_B _)) -> 226 
  C_C (C_D (C_B _) (C_B _)) (C_C (C_D _ _) (C_D _ _)) -> 227 
  C_C (C_C _ C_A) (C_B (C_D _ _)) -> 228 
  C_C (C_C _ (C_C _ _)) _ -> 229 
  C_C (C_B _) (C_C (C_D _ _) (C_B _)) -> 230 
  C_C (C_D _ (C_B _)) (C_D _ (C_B _)) -> 231 
  C_C (C_C _ C_A) (C_C _ _) -> 232 
  C_C (C_C (C_B _) _) (C_D (C_C _ _) (C_C _ _)) -> 233 
  C_C (C_D _ (C_D _ _)) (C_B (C_D _ _)) -> 234 
  C_C (C_D (C_C _ _) C_A) (C_C C_A C_A) -> 235 
  C_C (C_D (C_C _ _) (C_B _)) (C_D _ C_A) -> 236 
  C_C (C_D (C_C _ _) (C_B _)) (C_C (C_B _) C_A) -> 237 
  C_C (C_C C_A (C_B _)) (C_B C_A) -> 238 
  C_C (C_C (C_C _ _) (C_B _)) (C_D (C_B _) (C_C _ _)) -> 239 
  C_C (C_D C_A (C_B _)) (C_C C_A _) -> 240 
  C_C (C_D (C_C _ _) (C_B _)) (C_D (C_C _ _) C_A) -> 241 
  C_C (C_D C_A (C_D _ _)) (C_B (C_D _ _)) -> 242 
  C_C (C_C (C_C _ _) (C_B _)) (C_D C_A (C_D _ _)) -> 243 
  C_C (C_C (C_D _ _) _) (C_D (C_D _ _) (C_D _ _)) -> 244 
  C_C (C_B C_A) (C_D (C_B _) (C_B _)) -> 245 
  C_C (C_C C_A (C_D _ _)) (C_D (C_B _) C_A) -> 246 
  C_C (C_D (C_C _ _) C_A) (C_D C_A _) -> 247 
  C_C (C_D (C_B _) (C_C _ _)) (C_C _ _) -> 248 
  C_C (C_C (C_D _ _) (C_B _)) (C_D (C_D _ _) C_A) -> 249 
  C_C (C_C (C_C _ _) C_A) (C_D _ (C_C _ _)) -> 250 
  C_C (C_D (C_D _ _) _) (C_D C_A (C_C _ _)) -> 251 
  C_C (C_C C_A _) (C_D (C_C _ _) _) -> 252 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C C_A (C_C _ _)) -> 253 
  C_C (C_C (C_B _) (C_D _ _)) (C_D (C_D _ _) (C_B _)) -> 254 
  C_C (C_D (C_B _) (C_D _ _)) (C_C _ _) -> 255 
  C_C (C_D C_A (C_D _ _)) (C_B C_A) -> 256 
  C_C (C_D _ _) (C_D (C_C _ _) (C_D _ _)) -> 257 
  C_C (C_D (C_D _ _) (C_C _ _)) (C_C (C_C _ _) C_A) -> 258 
  C_C (C_C (C_D _ _) _) (C_C (C_C _ _) _) -> 259 
  C_C (C_C C_A C_A) (C_D (C_B _) (C_D _ _)) -> 260 
  C_C (C_D _ C_A) (C_D (C_B _) (C_C _ _)) -> 261 
  C_C (C_D C_A _) (C_D (C_D _ _) _) -> 262 
  C_C (C_C (C_B _) (C_D _ _)) (C_C (C_D _ _) _) -> 263 
  C_C (C_C (C_B _) (C_C _ _)) (C_D (C_B _) (C_C _ _)) -> 264 
  C_C (C_D C_A (C_C _ _)) (C_D (C_C _ _) C_A) -> 265 
  C_C (C_D (C_B _) (C_B _)) (C_D C_A (C_C _ _)) -> 266 
  C_C (C_D _ (C_D _ _)) (C_D C_A (C_C _ _)) -> 267 
  C_C (C_D (C_D _ _) _) (C_C (C_D _ _) _) -> 268 
  C_C (C_D _ _) (C_D C_A _) -> 269 
  C_C (C_D (C_B _) (C_C _ _)) C_A -> 270 
  C_C (C_C _ (C_B _)) (C_C C_A (C_B _)) -> 271 
  C_C (C_D _ _) (C_C C_A _) -> 272 
  C_C (C_D C_A (C_C _ _)) (C_C (C_D _ _) _) -> 273 
  C_C (C_B C_A) (C_D _ (C_B _)) -> 274 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_D C_A (C_D _ _)) -> 275 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_D (C_B _) (C_D _ _)) -> 276 
  C_C (C_C (C_D _ _) (C_B _)) (C_D (C_D _ _) _) -> 277 
  C_C (C_B _) (C_B (C_B _)) -> 278 
  C_C (C_C (C_C _ _) (C_B _)) (C_C _ (C_D _ _)) -> 279 
  C_C (C_D (C_D _ _) C_A) (C_D C_A (C_D _ _)) -> 280 
  C_C (C_C C_A C_A) (C_B C_A) -> 281 
  C_C (C_D (C_B _) C_A) (C_D C_A _) -> 282 
  C_C (C_C _ (C_B _)) (C_D C_A (C_D _ _)) -> 283 
  C_C (C_B (C_D _ _)) (C_C C_A _) -> 284 
  C_C (C_C (C_B _) (C_C _ _)) (C_B (C_B _)) -> 285 
  C_C (C_B _) (C_D (C_B _) C_A) -> 286 
  C_C (C_D C_A _) (C_D (C_C _ _) (C_D _ _)) -> 287 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_C _ C_A) -> 288 
  C_C (C_C _ (C_D _ _)) _ -> 289 
  C_C (C_B C_A) (C_C (C_D _ _) (C_B _)) -> 290 
  C_C (C_C (C_D _ _) C_A) (C_B (C_B _)) -> 291 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_C _ _) C_A) -> 292 
  C_C (C_D C_A C_A) (C_D (C_D _ _) (C_D _ _)) -> 293 
  C_C (C_C _ _) (C_D (C_D _ _) (C_D _ _)) -> 294 
  C_C (C_D (C_B _) (C_C _ _)) (C_C C_A (C_D _ _)) -> 295 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_D C_A _) -> 296 
  C_C (C_D (C_B _) C_A) (C_D (C_C _ _) C_A) -> 297 
  C_C (C_C (C_B _) (C_B _)) (C_D (C_D _ _) C_A) -> 298 
  C_C (C_D C_A (C_D _ _)) (C_C (C_D _ _) (C_D _ _)) -> 299 
  C_C (C_D (C_B _) C_A) (C_D _ (C_B _)) -> 300 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 301 
  C_C (C_D _ (C_D _ _)) (C_D (C_C _ _) (C_D _ _)) -> 302 
  C_C (C_D (C_D _ _) _) (C_D _ (C_B _)) -> 303 
  C_C (C_D (C_C _ _) C_A) (C_D (C_B _) _) -> 304 
  C_C (C_C (C_D _ _) C_A) (C_D (C_C _ _) (C_D _ _)) -> 305 
  C_C (C_C C_A (C_D _ _)) (C_C (C_B _) (C_B _)) -> 306 
  C_C (C_C (C_C _ _) _) (C_D (C_C _ _) C_A) -> 307 
  C_C (C_B (C_B _)) (C_C (C_B _) _) -> 308 
  C_C (C_C (C_C _ _) (C_B _)) (C_C C_A (C_B _)) -> 309 
  C_C (C_C C_A (C_B _)) (C_C _ (C_B _)) -> 310 
  C_C (C_C C_A C_A) (C_C (C_B _) (C_C _ _)) -> 311 
  C_C (C_C _ (C_B _)) (C_C (C_C _ _) C_A) -> 312 
  C_C (C_D C_A C_A) (C_B (C_C _ _)) -> 313 
  C_C (C_C (C_B _) _) (C_D C_A C_A) -> 314 
  C_C (C_D C_A _) C_A -> 315 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_B (C_C _ _)) -> 316 
  C_C (C_C (C_D _ _) C_A) (C_C (C_C _ _) (C_B _)) -> 317 
  C_C (C_C (C_D _ _) (C_B _)) (C_C _ (C_B _)) -> 318 
  C_C (C_C _ _) (C_C (C_C _ _) (C_C _ _)) -> 319 
  C_C (C_C C_A (C_D _ _)) (C_D _ (C_D _ _)) -> 320 
  C_C (C_C C_A (C_D _ _)) (C_D _ (C_B _)) -> 321 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_D (C_B _) _) -> 322 
  C_C (C_B (C_B _)) (C_B (C_C _ _)) -> 323 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_D (C_C _ _) C_A) -> 324 
  C_C (C_C (C_B _) (C_B _)) C_A -> 325 
  C_C (C_C _ C_A) (C_D (C_D _ _) (C_B _)) -> 326 
  C_C (C_B (C_B _)) (C_D (C_D _ _) C_A) -> 327 
  C_C (C_C (C_D _ _) _) (C_B C_A) -> 328 
  C_C (C_D C_A C_A) (C_D (C_D _ _) (C_C _ _)) -> 329 
  C_C (C_D _ _) (C_D (C_D _ _) (C_C _ _)) -> 330 
  C_C (C_D C_A (C_B _)) (C_C (C_B _) _) -> 331 
  C_C (C_D (C_C _ _) C_A) (C_D (C_D _ _) (C_C _ _)) -> 332 
  C_C (C_D _ C_A) (C_C (C_D _ _) (C_B _)) -> 333 
  C_C (C_C C_A (C_D _ _)) (C_C _ C_A) -> 334 
  C_C (C_C (C_D _ _) C_A) (C_D (C_B _) C_A) -> 335 
  C_C (C_D (C_B _) (C_D _ _)) (C_C C_A _) -> 336 
  C_C (C_D (C_D _ _) C_A) (C_C (C_B _) _) -> 337 
  C_C (C_D _ (C_C _ _)) (C_D (C_D _ _) (C_C _ _)) -> 338 
  C_C (C_D _ (C_C _ _)) (C_D _ (C_D _ _)) -> 339 
  C_C (C_C _ _) (C_C C_A _) -> 340 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_C _ _) _) -> 341 
  C_C (C_C (C_B _) (C_B _)) (C_C C_A (C_B _)) -> 342 
  C_C C_A (C_C (C_C _ _) (C_D _ _)) -> 343 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_C (C_B _) (C_C _ _)) -> 344 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_D (C_C _ _) (C_D _ _)) -> 345 
  C_C (C_D (C_C _ _) C_A) (C_D C_A C_A) -> 346 
  C_C (C_C (C_D _ _) C_A) (C_D (C_D _ _) C_A) -> 347 
  C_C (C_C C_A _) (C_D _ _) -> 348 
  C_C (C_C (C_C _ _) C_A) (C_C (C_B _) (C_D _ _)) -> 349 
  C_C (C_C C_A (C_D _ _)) (C_C C_A C_A) -> 350 
  C_C _ (C_B C_A) -> 351 
  C_C (C_C (C_D _ _) _) (C_D (C_B _) C_A) -> 352 
  C_C (C_C (C_B _) _) (C_D (C_D _ _) (C_B _)) -> 353 
  C_C (C_D (C_C _ _) (C_C _ _)) _ -> 354 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C (C_B _) _) -> 355 
  C_C (C_B (C_C _ _)) (C_D (C_C _ _) _) -> 356 
  C_C (C_D _ (C_B _)) (C_D C_A (C_C _ _)) -> 357 
  C_C (C_D (C_B _) (C_B _)) (C_C (C_D _ _) (C_C _ _)) -> 358 
  C_C (C_D (C_C _ _) C_A) (C_C (C_C _ _) (C_C _ _)) -> 359 
  C_C (C_B _) (C_D _ (C_D _ _)) -> 360 
  C_C (C_D _ (C_D _ _)) (C_B (C_C _ _)) -> 361 
  C_C (C_D (C_D _ _) C_A) (C_D (C_D _ _) C_A) -> 362 
  C_C (C_C C_A C_A) _ -> 363 
  C_C (C_D _ C_A) (C_D _ (C_D _ _)) -> 364 
  C_C _ (C_D C_A (C_B _)) -> 365 
  C_C (C_C C_A (C_C _ _)) (C_C _ (C_C _ _)) -> 366 
  C_C (C_C (C_B _) (C_C _ _)) (C_D C_A (C_C _ _)) -> 367 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_B (C_B _)) -> 368 
  C_C (C_C (C_B _) (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 369 
  C_C (C_C (C_B _) _) (C_C (C_D _ _) _) -> 370 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_C _ C_A) -> 371 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_D _ (C_B _)) -> 372 
  C_C (C_D (C_B _) (C_C _ _)) (C_D (C_B _) (C_C _ _)) -> 373 
  C_C (C_B (C_C _ _)) (C_C C_A (C_D _ _)) -> 374 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_D _ C_A) -> 375 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_B _) -> 376 
  C_C (C_D C_A (C_D _ _)) (C_D (C_D _ _) C_A) -> 377 
  C_C (C_C (C_B _) _) (C_C _ C_A) -> 378 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_D C_A _) -> 379 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_D (C_C _ _) (C_B _)) -> 380 
  C_C _ (C_B (C_B _)) -> 381 
  C_C (C_D (C_C _ _) _) (C_C C_A (C_B _)) -> 382 
  C_C _ (C_B (C_C _ _)) -> 383 
  C_C (C_D (C_C _ _) (C_B _)) (C_C (C_D _ _) (C_B _)) -> 384 
  C_C (C_C C_A C_A) (C_C (C_D _ _) (C_C _ _)) -> 385 
  C_C (C_D _ _) (C_D _ _) -> 386 
  C_C (C_D (C_C _ _) C_A) (C_B (C_D _ _)) -> 387 
  C_C (C_D _ (C_B _)) (C_C C_A _) -> 388 
  C_C (C_C (C_D _ _) C_A) (C_C (C_C _ _) (C_C _ _)) -> 389 
  C_C (C_D _ C_A) C_A -> 390 
  C_C (C_C (C_B _) (C_C _ _)) (C_C _ C_A) -> 391 
  C_C (C_C (C_D _ _) _) _ -> 392 
  C_C (C_C C_A _) (C_C (C_D _ _) (C_C _ _)) -> 393 
  C_C (C_C _ C_A) (C_D (C_B _) _) -> 394 
  C_C (C_C (C_C _ _) _) C_A -> 395 
  C_C (C_D (C_D _ _) C_A) (C_C (C_C _ _) (C_B _)) -> 396 
  C_C (C_D _ (C_C _ _)) (C_D C_A _) -> 397 
  C_C (C_D _ (C_B _)) (C_D (C_B _) C_A) -> 398 
  C_C (C_B (C_B _)) (C_C (C_B _) (C_D _ _)) -> 399 
  C_C (C_C (C_D _ _) (C_B _)) (C_C (C_C _ _) (C_C _ _)) -> 400 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C C_A (C_D _ _)) -> 401 
  C_C (C_D (C_B _) (C_C _ _)) (C_B (C_D _ _)) -> 402 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_C _ _) (C_D _ _)) -> 403 
  C_C (C_D (C_D _ _) (C_C _ _)) (C_C (C_D _ _) (C_D _ _)) -> 404 
  C_C (C_D (C_C _ _) (C_B _)) (C_D (C_B _) (C_D _ _)) -> 405 
  C_C (C_D (C_B _) (C_B _)) (C_B (C_C _ _)) -> 406 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C C_A (C_D _ _)) -> 407 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_D C_A (C_D _ _)) -> 408 
  C_C (C_C (C_C _ _) _) (C_D (C_D _ _) (C_D _ _)) -> 409 
  C_C (C_D (C_C _ _) (C_B _)) (C_C _ _) -> 410 
  C_C (C_C _ (C_D _ _)) (C_C C_A (C_C _ _)) -> 411 
  C_C (C_C (C_C _ _) C_A) (C_C (C_D _ _) (C_D _ _)) -> 412 
  C_C (C_D (C_B _) (C_C _ _)) (C_D (C_D _ _) C_A) -> 413 
  C_C (C_C (C_C _ _) (C_D _ _)) C_A -> 414 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_C (C_C _ _) C_A) -> 415 
  C_C (C_B (C_D _ _)) (C_C (C_D _ _) _) -> 416 
  C_C (C_C (C_D _ _) C_A) (C_D (C_D _ _) _) -> 417 
  C_C (C_C (C_B _) (C_C _ _)) (C_D (C_B _) (C_B _)) -> 418 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_D (C_B _) (C_D _ _)) -> 419 
  C_C (C_B C_A) (C_D _ (C_C _ _)) -> 420 
  C_C (C_C (C_B _) (C_B _)) (C_D (C_B _) _) -> 421 
  C_C (C_B (C_B _)) (C_D (C_C _ _) (C_D _ _)) -> 422 
  C_C (C_C _ (C_B _)) (C_C _ (C_B _)) -> 423 
  C_C (C_C (C_C _ _) _) (C_C _ _) -> 424 
  C_C (C_C _ (C_C _ _)) (C_C (C_D _ _) _) -> 425 
  C_C (C_D (C_B _) C_A) (C_D (C_D _ _) _) -> 426 
  C_C (C_C (C_D _ _) C_A) (C_D _ C_A) -> 427 
  C_C C_A (C_C (C_C _ _) (C_C _ _)) -> 428 
  C_C (C_D (C_C _ _) (C_B _)) (C_D C_A (C_D _ _)) -> 429 
  C_C (C_D (C_D _ _) (C_B _)) (C_B _) -> 430 
  C_C (C_D (C_B _) _) (C_C (C_C _ _) (C_B _)) -> 431 
  C_C (C_C (C_C _ _) C_A) (C_B _) -> 432 
  C_C (C_D (C_D _ _) C_A) (C_B (C_D _ _)) -> 433 
  C_C _ (C_C _ _) -> 434 
  C_C C_A (C_C C_A _) -> 435 
  C_C (C_C _ (C_C _ _)) (C_C (C_B _) (C_D _ _)) -> 436 
  C_C (C_C (C_B _) (C_D _ _)) (C_C (C_C _ _) (C_D _ _)) -> 437 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_C C_A (C_D _ _)) -> 438 
  C_C (C_C _ (C_B _)) _ -> 439 
  C_C (C_B (C_D _ _)) (C_C (C_B _) (C_D _ _)) -> 440 
  C_C _ (C_C (C_B _) (C_D _ _)) -> 441 
  C_C (C_D (C_C _ _) _) (C_D (C_C _ _) _) -> 442 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C C_A (C_C _ _)) -> 443 
  C_C (C_D _ (C_C _ _)) (C_C (C_C _ _) _) -> 444 
  C_C (C_C _ _) (C_C (C_D _ _) (C_B _)) -> 445 
  C_C (C_D (C_D _ _) (C_B _)) (C_D (C_B _) (C_C _ _)) -> 446 
  C_C (C_D (C_B _) (C_B _)) (C_C C_A _) -> 447 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_C _ _) (C_D _ _)) -> 448 
  C_C (C_D (C_D _ _) _) (C_D C_A _) -> 449 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_D (C_C _ _) (C_B _)) -> 450 
  C_C (C_C (C_D _ _) C_A) (C_C C_A C_A) -> 451 
  C_C (C_D _ (C_C _ _)) (C_C _ _) -> 452 
  C_C (C_D (C_B _) _) (C_D C_A (C_C _ _)) -> 453 
  C_C (C_D (C_D _ _) _) (C_D (C_D _ _) _) -> 454 
  C_C (C_C (C_C _ _) (C_B _)) (C_D C_A _) -> 455 
  C_C (C_B (C_C _ _)) (C_D (C_C _ _) C_A) -> 456 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_D (C_C _ _) _) -> 457 
  C_C (C_D C_A _) (C_C (C_C _ _) C_A) -> 458 
  C_C (C_C (C_C _ _) C_A) (C_C (C_C _ _) (C_D _ _)) -> 459 
  C_C (C_C C_A C_A) (C_D C_A (C_D _ _)) -> 460 
  C_C (C_D C_A C_A) (C_D (C_C _ _) (C_D _ _)) -> 461 
  C_C (C_B C_A) (C_C (C_D _ _) _) -> 462 
  C_C (C_D (C_B _) (C_D _ _)) (C_D C_A (C_D _ _)) -> 463 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_D _ _) C_A) -> 464 
  C_C (C_D (C_B _) (C_D _ _)) (C_C C_A (C_B _)) -> 465 
  C_C (C_C (C_D _ _) (C_C _ _)) _ -> 466 
  C_C (C_C (C_C _ _) C_A) (C_C _ (C_C _ _)) -> 467 
  C_C (C_D (C_D _ _) (C_B _)) (C_D (C_C _ _) (C_D _ _)) -> 468 
  C_C (C_C (C_B _) _) (C_D (C_D _ _) (C_C _ _)) -> 469 
  C_C (C_C (C_D _ _) (C_B _)) (C_C (C_B _) (C_B _)) -> 470 
  C_C (C_C (C_B _) _) C_A -> 471 
  C_C _ (C_D (C_B _) (C_C _ _)) -> 472 
  C_C (C_C _ (C_C _ _)) (C_D (C_B _) C_A) -> 473 
  C_C C_A (C_C (C_B _) C_A) -> 474 
  C_C (C_C C_A (C_B _)) (C_B (C_C _ _)) -> 475 
  C_C (C_D _ (C_D _ _)) (C_C C_A (C_C _ _)) -> 476 
  C_C (C_C (C_B _) (C_C _ _)) (C_B C_A) -> 477 
  C_C (C_D (C_D _ _) C_A) (C_B _) -> 478 
  C_C (C_D (C_C _ _) C_A) (C_D (C_B _) (C_D _ _)) -> 479 
  C_C (C_D _ _) (C_D (C_B _) (C_C _ _)) -> 480 
  C_C (C_D (C_C _ _) C_A) (C_B (C_B _)) -> 481 
  C_C (C_D (C_D _ _) (C_C _ _)) (C_D (C_D _ _) (C_B _)) -> 482 
  C_C (C_C (C_B _) C_A) (C_D (C_B _) (C_D _ _)) -> 483 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_D (C_C _ _) C_A) -> 484 
  C_C (C_C (C_C _ _) _) (C_D _ (C_D _ _)) -> 485 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_D (C_C _ _) C_A) -> 486 
  C_C (C_C (C_B _) (C_C _ _)) (C_D (C_B _) C_A) -> 487 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_B (C_B _)) -> 488 
  C_C (C_C _ (C_C _ _)) (C_D (C_D _ _) C_A) -> 489 
  C_C (C_C _ (C_C _ _)) (C_D (C_D _ _) _) -> 490 
  C_C (C_C _ C_A) (C_D (C_B _) (C_D _ _)) -> 491 
  C_C (C_C (C_B _) (C_B _)) (C_C C_A (C_C _ _)) -> 492 
  C_C (C_D (C_D _ _) (C_B _)) (C_C (C_B _) (C_C _ _)) -> 493 
  C_C (C_D _ _) (C_C C_A C_A) -> 494 
  C_C (C_C (C_D _ _) (C_B _)) (C_D _ _) -> 495 
  C_C (C_D _ C_A) (C_D (C_B _) (C_B _)) -> 496 
  C_C (C_D _ _) (C_C (C_B _) C_A) -> 497 
  C_C (C_D (C_C _ _) C_A) (C_D C_A (C_C _ _)) -> 498 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_D (C_B _) _) -> 499 
  C_C (C_B C_A) (C_B (C_C _ _)) -> 500 
  C_C (C_D (C_D _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 501 
  C_C (C_D (C_B _) (C_C _ _)) (C_C (C_D _ _) C_A) -> 502 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C _ (C_D _ _)) -> 503 
  C_C (C_C (C_C _ _) _) (C_C (C_D _ _) (C_D _ _)) -> 504 
  C_C C_A (C_C (C_C _ _) (C_B _)) -> 505 
  C_C (C_D (C_C _ _) (C_B _)) (C_C (C_C _ _) (C_D _ _)) -> 506 
  C_C (C_D _ (C_B _)) (C_C C_A (C_D _ _)) -> 507 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 508 
  C_C (C_D (C_B _) C_A) (C_B (C_D _ _)) -> 509 
  C_C (C_D _ C_A) (C_D _ _) -> 510 
  C_C (C_D C_A (C_D _ _)) (C_C _ _) -> 511 
  C_C (C_C C_A (C_B _)) (C_D (C_B _) C_A) -> 512 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_D (C_D _ _) (C_B _)) -> 513 
  C_C (C_C _ _) (C_D (C_B _) (C_D _ _)) -> 514 
  C_C (C_C (C_C _ _) (C_B _)) (C_C C_A (C_D _ _)) -> 515 
  C_C (C_B (C_D _ _)) (C_D (C_B _) (C_B _)) -> 516 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ C_A) -> 517 
  C_C (C_D C_A _) (C_D C_A _) -> 518 
  C_C C_A (C_D _ _) -> 519 
  C_C (C_D (C_C _ _) C_A) (C_C C_A (C_B _)) -> 520 
  C_C (C_C _ _) (C_D _ (C_C _ _)) -> 521 
  C_C (C_D (C_B _) (C_B _)) (C_D (C_C _ _) (C_B _)) -> 522 
  C_C (C_D C_A (C_B _)) (C_C (C_B _) C_A) -> 523 
  C_C (C_C C_A (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 524 
  C_C (C_C (C_D _ _) C_A) C_A -> 525 
  C_C (C_C (C_C _ _) (C_B _)) (C_D C_A (C_C _ _)) -> 526 
  C_C (C_D C_A (C_D _ _)) (C_C (C_D _ _) (C_B _)) -> 527 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_D (C_B _) C_A) -> 528 
  C_C (C_D _ (C_B _)) (C_D (C_D _ _) _) -> 529 
  C_C (C_D C_A _) (C_C (C_B _) _) -> 530 
  C_C (C_C (C_B _) (C_D _ _)) (C_D (C_C _ _) (C_D _ _)) -> 531 
  C_C C_A (C_D (C_B _) (C_C _ _)) -> 532 
  C_C (C_C _ (C_B _)) (C_C (C_C _ _) (C_D _ _)) -> 533 
  C_C (C_C _ C_A) (C_C (C_C _ _) C_A) -> 534 
  C_C (C_C C_A (C_D _ _)) (C_C (C_B _) _) -> 535 
  C_C (C_C _ _) (C_C (C_B _) C_A) -> 536 
  C_C (C_D (C_C _ _) C_A) (C_D (C_D _ _) _) -> 537 
  C_C (C_D C_A (C_D _ _)) (C_C (C_C _ _) (C_D _ _)) -> 538 
  C_C (C_D _ _) (C_D (C_B _) (C_B _)) -> 539 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_D _ (C_B _)) -> 540 
  C_C (C_C (C_D _ _) (C_B _)) (C_C C_A (C_C _ _)) -> 541 
  C_C (C_D C_A (C_C _ _)) (C_D _ C_A) -> 542 
  C_C (C_C (C_C _ _) _) (C_D (C_B _) (C_C _ _)) -> 543 
  C_C (C_C _ (C_D _ _)) (C_C (C_B _) C_A) -> 544 
  C_C (C_C (C_C _ _) (C_B _)) (C_D (C_D _ _) _) -> 545 
  C_C (C_D C_A (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 546 
  C_C (C_B (C_D _ _)) (C_C _ (C_D _ _)) -> 547 
  C_C (C_D _ C_A) (C_D (C_C _ _) _) -> 548 
  C_C (C_B (C_C _ _)) (C_C _ (C_B _)) -> 549 
  C_C (C_C (C_D _ _) (C_B _)) (C_C (C_B _) _) -> 550 
  C_C (C_C _ (C_B _)) (C_C (C_D _ _) (C_C _ _)) -> 551 
  C_C (C_D (C_B _) (C_D _ _)) (C_D (C_B _) (C_D _ _)) -> 552 
  C_C (C_D (C_B _) (C_C _ _)) (C_C (C_B _) C_A) -> 553 
  C_C (C_C (C_C _ _) _) (C_B (C_D _ _)) -> 554 
  C_C (C_B (C_B _)) (C_C C_A C_A) -> 555 
  C_C (C_C (C_C _ _) _) (C_B _) -> 556 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C (C_B _) C_A) -> 557 
  C_C (C_D (C_D _ _) C_A) (C_D _ (C_C _ _)) -> 558 
  C_C (C_C _ (C_C _ _)) (C_C (C_C _ _) (C_B _)) -> 559 
  C_C (C_D _ (C_B _)) (C_D C_A C_A) -> 560 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C _ (C_C _ _)) -> 561 
  C_C (C_D (C_B _) C_A) (C_D (C_C _ _) (C_C _ _)) -> 562 
  C_C (C_D (C_D _ _) (C_B _)) (C_D C_A (C_D _ _)) -> 563 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_C (C_C _ _) (C_B _)) -> 564 
  C_C (C_C (C_C _ _) C_A) C_A -> 565 
  C_C (C_D _ (C_C _ _)) (C_C C_A C_A) -> 566 
  C_C (C_B (C_B _)) (C_D _ (C_C _ _)) -> 567 
  C_C (C_C (C_D _ _) (C_B _)) (C_D _ (C_D _ _)) -> 568 
  C_C (C_D (C_D _ _) C_A) (C_D (C_C _ _) (C_C _ _)) -> 569 
  C_C (C_D (C_B _) (C_C _ _)) (C_C (C_C _ _) _) -> 570 
  C_C _ (C_D (C_C _ _) (C_D _ _)) -> 571 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_D (C_D _ _) _) -> 572 
  C_C (C_C (C_B _) (C_D _ _)) (C_C C_A C_A) -> 573 
  C_C (C_D (C_C _ _) (C_B _)) (C_D (C_B _) C_A) -> 574 
  C_C (C_D (C_D _ _) _) (C_C C_A C_A) -> 575 
  C_C (C_D C_A C_A) (C_C (C_D _ _) (C_C _ _)) -> 576 
  C_C (C_D _ (C_D _ _)) (C_D (C_C _ _) (C_C _ _)) -> 577 
  C_C (C_D (C_D _ _) _) (C_D (C_D _ _) (C_C _ _)) -> 578 
  C_C (C_C C_A (C_D _ _)) (C_C C_A (C_B _)) -> 579 
  C_C (C_C _ (C_D _ _)) (C_B _) -> 580 
  C_C (C_B (C_B _)) (C_D (C_B _) _) -> 581 
  C_C (C_C (C_B _) _) (C_C (C_D _ _) (C_D _ _)) -> 582 
  C_C (C_B (C_C _ _)) C_A -> 583 
  C_C (C_D (C_D _ _) (C_B _)) (C_C (C_C _ _) _) -> 584 
  C_C (C_D (C_B _) (C_D _ _)) (C_D (C_D _ _) (C_C _ _)) -> 585 
  C_C (C_C (C_B _) (C_D _ _)) (C_D (C_D _ _) C_A) -> 586 
  C_C (C_D _ _) (C_D (C_C _ _) (C_C _ _)) -> 587 
  C_C (C_C C_A _) (C_C (C_B _) _) -> 588 
  C_C (C_C (C_B _) _) (C_C (C_B _) (C_D _ _)) -> 589 
  C_C (C_C (C_B _) _) (C_C (C_C _ _) _) -> 590 
  C_C (C_C C_A (C_B _)) (C_C (C_C _ _) (C_D _ _)) -> 591 
  C_C (C_C (C_B _) _) (C_C C_A (C_D _ _)) -> 592 
  C_C (C_C C_A C_A) (C_C (C_D _ _) (C_D _ _)) -> 593 
  C_C (C_D (C_B _) _) (C_D (C_C _ _) (C_B _)) -> 594 
  C_C (C_C C_A C_A) (C_D C_A _) -> 595 
  C_C (C_C _ (C_B _)) (C_D _ (C_C _ _)) -> 596 
  C_C (C_D _ C_A) (C_C (C_D _ _) (C_C _ _)) -> 597 
  C_C (C_C C_A _) (C_D (C_B _) (C_B _)) -> 598 
  C_C (C_D _ (C_C _ _)) (C_D (C_C _ _) C_A) -> 599 
  C_C (C_D _ (C_B _)) (C_D C_A _) -> 600 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_D (C_C _ _) _) -> 601 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C (C_D _ _) _) -> 602 
  C_C (C_D (C_B _) (C_B _)) (C_C _ (C_B _)) -> 603 
  C_C (C_B (C_D _ _)) (C_C _ (C_B _)) -> 604 
  C_C (C_C (C_C _ _) _) (C_D (C_D _ _) (C_B _)) -> 605 
  C_C (C_C (C_B _) _) (C_C (C_C _ _) C_A) -> 606 
  C_C (C_C _ _) (C_D (C_C _ _) _) -> 607 
  C_C (C_D (C_D _ _) C_A) (C_D (C_D _ _) _) -> 608 
  C_C (C_D C_A (C_B _)) (C_C _ (C_D _ _)) -> 609 
  C_C (C_D C_A (C_B _)) (C_C (C_D _ _) _) -> 610 
  C_C _ (C_B _) -> 611 
  C_C (C_C (C_D _ _) _) (C_D (C_C _ _) C_A) -> 612 
  C_C (C_D C_A _) (C_D (C_C _ _) _) -> 613 
  C_C (C_D C_A _) (C_C (C_D _ _) _) -> 614 
  C_C (C_C (C_B _) (C_D _ _)) (C_D (C_C _ _) _) -> 615 
  C_C (C_D _ (C_C _ _)) (C_D _ (C_B _)) -> 616 
  C_C (C_C C_A (C_C _ _)) (C_D (C_B _) C_A) -> 617 
  C_C (C_C (C_B _) (C_B _)) (C_D (C_B _) C_A) -> 618 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_D (C_B _) (C_D _ _)) -> 619 
  C_C (C_C C_A (C_D _ _)) (C_C (C_C _ _) _) -> 620 
  C_C (C_D (C_C _ _) _) (C_B _) -> 621 
  C_C (C_D C_A _) (C_C (C_D _ _) (C_D _ _)) -> 622 
  C_C (C_D (C_B _) (C_B _)) (C_C C_A (C_C _ _)) -> 623 
  C_C (C_C C_A (C_B _)) (C_D C_A (C_C _ _)) -> 624 
  C_C (C_C C_A _) (C_C (C_B _) (C_B _)) -> 625 
  C_C (C_B (C_C _ _)) (C_D _ (C_D _ _)) -> 626 
  C_C (C_D _ (C_D _ _)) (C_D _ (C_B _)) -> 627 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_D (C_D _ _) (C_B _)) -> 628 
  C_C (C_D (C_B _) C_A) (C_C C_A (C_D _ _)) -> 629 
  C_C (C_C (C_C _ _) _) (C_D (C_D _ _) _) -> 630 
  C_C (C_C (C_D _ _) _) (C_D (C_D _ _) C_A) -> 631 
  C_C (C_D C_A (C_B _)) (C_D C_A _) -> 632 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C (C_D _ _) (C_D _ _)) -> 633 
  C_C (C_C (C_B _) C_A) (C_D (C_D _ _) C_A) -> 634 
  C_C (C_C (C_B _) (C_B _)) (C_C _ C_A) -> 635 
  C_C (C_B (C_D _ _)) (C_D (C_C _ _) (C_D _ _)) -> 636 
  C_C C_A (C_D (C_B _) C_A) -> 637 
  C_C (C_C _ (C_C _ _)) (C_D _ C_A) -> 638 
  C_C (C_D C_A (C_B _)) (C_C (C_D _ _) (C_B _)) -> 639 
  C_C (C_D (C_D _ _) _) (C_C (C_B _) (C_D _ _)) -> 640 
  C_C C_A (C_D (C_C _ _) (C_D _ _)) -> 641 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_B _) -> 642 
  C_C (C_C (C_B _) _) (C_B C_A) -> 643 
  C_C (C_C _ C_A) (C_D (C_D _ _) (C_C _ _)) -> 644 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C C_A C_A) -> 645 
  C_C (C_D (C_B _) (C_D _ _)) (C_D (C_D _ _) (C_B _)) -> 646 
  C_C (C_D _ _) (C_C (C_B _) (C_C _ _)) -> 647 
  C_C (C_C (C_D _ _) C_A) (C_C C_A (C_C _ _)) -> 648 
  C_C (C_C _ (C_B _)) (C_C (C_C _ _) (C_C _ _)) -> 649 
  C_C (C_C C_A _) (C_D (C_D _ _) _) -> 650 
  C_C C_A (C_C C_A (C_D _ _)) -> 651 
  C_C (C_C (C_C _ _) C_A) (C_D (C_D _ _) C_A) -> 652 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_C (C_D _ _) (C_C _ _)) -> 653 
  C_C (C_C (C_C _ _) _) (C_D (C_B _) (C_D _ _)) -> 654 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_C (C_D _ _) (C_D _ _)) -> 655 
  C_C (C_B C_A) (C_C (C_C _ _) (C_D _ _)) -> 656 
  C_C (C_D C_A (C_B _)) (C_C (C_C _ _) (C_B _)) -> 657 
  C_C (C_B (C_D _ _)) (C_D (C_D _ _) C_A) -> 658 
  C_C (C_C (C_C _ _) (C_B _)) (C_C C_A C_A) -> 659 
  C_C (C_D (C_D _ _) C_A) (C_C _ (C_B _)) -> 660 
  C_C (C_B (C_D _ _)) (C_D (C_B _) _) -> 661 
  C_C (C_D _ (C_D _ _)) (C_C C_A (C_D _ _)) -> 662 
  C_C (C_C _ _) (C_D (C_C _ _) (C_D _ _)) -> 663 
  C_C (C_D _ _) (C_D (C_C _ _) _) -> 664 
  C_C (C_D (C_B _) (C_D _ _)) (C_D (C_C _ _) _) -> 665 
  C_C (C_C (C_B _) C_A) (C_D (C_B _) (C_C _ _)) -> 666 
  C_C (C_D (C_D _ _) _) (C_D (C_D _ _) C_A) -> 667 
  C_C (C_D (C_B _) (C_D _ _)) (C_D _ (C_B _)) -> 668 
  C_C (C_D (C_D _ _) _) (C_D (C_B _) (C_C _ _)) -> 669 
  C_C (C_D (C_B _) _) (C_D _ (C_C _ _)) -> 670 
  C_C (C_C C_A (C_B _)) (C_C _ _) -> 671 
  C_C (C_C _ (C_B _)) (C_D (C_B _) C_A) -> 672 
  C_C (C_D (C_B _) (C_B _)) (C_D (C_B _) (C_C _ _)) -> 673 
  C_C (C_D (C_B _) (C_D _ _)) (C_D (C_B _) C_A) -> 674 
  C_C (C_D (C_D _ _) _) (C_C (C_B _) (C_B _)) -> 675 
  C_C (C_D (C_C _ _) (C_B _)) (C_B (C_C _ _)) -> 676 
  C_C _ _ -> 677 
  C_C (C_C C_A (C_C _ _)) (C_C (C_D _ _) _) -> 678 
  C_C (C_C (C_B _) (C_D _ _)) C_A -> 679 
  C_C (C_C (C_B _) C_A) (C_D (C_B _) C_A) -> 680 
  C_C (C_C (C_C _ _) (C_B _)) (C_B _) -> 681 
  C_C (C_D (C_B _) (C_D _ _)) (C_C (C_D _ _) (C_C _ _)) -> 682 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_D C_A _) -> 683 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_C (C_B _) (C_D _ _)) -> 684 
  C_C (C_D C_A C_A) (C_C C_A (C_D _ _)) -> 685 
  C_C (C_D _ C_A) (C_C (C_C _ _) (C_D _ _)) -> 686 
  C_C (C_C (C_C _ _) (C_B _)) (C_C _ C_A) -> 687 
  C_C (C_C (C_D _ _) C_A) (C_B _) -> 688 
  C_C (C_D _ _) (C_C (C_C _ _) _) -> 689 
  C_C (C_D (C_D _ _) _) (C_D (C_B _) (C_B _)) -> 690 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_B _) -> 691 
  C_C _ (C_D (C_D _ _) (C_C _ _)) -> 692 
  C_C (C_C (C_D _ _) (C_B _)) (C_D (C_C _ _) C_A) -> 693 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_D (C_C _ _) C_A) -> 694 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_D (C_D _ _) (C_B _)) -> 695 
  C_C (C_C (C_C _ _) _) (C_D C_A (C_D _ _)) -> 696 
  C_C (C_C (C_C _ _) C_A) (C_D (C_B _) (C_C _ _)) -> 697 
  C_C (C_D (C_B _) _) (C_C _ (C_B _)) -> 698 
  C_C (C_D (C_B _) (C_D _ _)) (C_C C_A C_A) -> 699 
  C_C (C_C C_A C_A) (C_C _ (C_C _ _)) -> 700 
  C_C (C_D (C_D _ _) _) (C_D (C_C _ _) (C_D _ _)) -> 701 
  C_C C_A (C_C (C_D _ _) (C_C _ _)) -> 702 
  C_C (C_D (C_D _ _) C_A) C_A -> 703 
  C_C (C_D _ C_A) (C_D (C_C _ _) (C_D _ _)) -> 704 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_B C_A) -> 705 
  C_C (C_D C_A (C_D _ _)) (C_D (C_C _ _) C_A) -> 706 
  C_C (C_D (C_D _ _) _) (C_B (C_C _ _)) -> 707 
  C_C (C_D (C_B _) (C_B _)) (C_D (C_C _ _) (C_C _ _)) -> 708 
  C_C (C_D (C_D _ _) C_A) (C_C (C_B _) C_A) -> 709 
  C_C (C_D (C_B _) (C_D _ _)) (C_C (C_C _ _) (C_B _)) -> 710 
  C_C (C_D (C_B _) (C_D _ _)) (C_C _ (C_C _ _)) -> 711 
  C_C (C_C C_A _) (C_C (C_D _ _) _) -> 712 
  C_C (C_D (C_D _ _) (C_C _ _)) (C_C _ (C_D _ _)) -> 713 
  C_C (C_B (C_D _ _)) (C_B C_A) -> 714 
  C_C (C_C (C_D _ _) C_A) (C_C (C_D _ _) (C_C _ _)) -> 715 
  C_C (C_D C_A C_A) (C_D (C_C _ _) C_A) -> 716 
  C_C (C_D C_A (C_C _ _)) (C_C (C_C _ _) _) -> 717 
  C_C (C_C C_A (C_D _ _)) (C_C (C_D _ _) (C_D _ _)) -> 718 
  C_C (C_D (C_B _) (C_D _ _)) (C_C (C_C _ _) (C_C _ _)) -> 719 
  C_C (C_C (C_B _) C_A) (C_C _ (C_B _)) -> 720 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_D (C_B _) (C_B _)) -> 721 
  C_C (C_C (C_B _) (C_D _ _)) (C_C (C_C _ _) (C_C _ _)) -> 722 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_D (C_D _ _) C_A) -> 723 
  C_C (C_B (C_D _ _)) (C_C _ _) -> 724 
  C_C (C_C C_A (C_C _ _)) (C_B (C_D _ _)) -> 725 
  C_C (C_C (C_B _) _) (C_B _) -> 726 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_D (C_D _ _) (C_D _ _)) -> 727 
  C_C (C_C (C_C _ _) _) (C_C _ (C_C _ _)) -> 728 
  C_C _ (C_C _ C_A) -> 729 
  C_C C_A (C_C C_A C_A) -> 730 
  C_C (C_D (C_B _) (C_B _)) (C_D (C_B _) C_A) -> 731 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_B _) C_A) -> 732 
  C_C (C_B (C_B _)) (C_D C_A (C_B _)) -> 733 
  C_C (C_D _ (C_C _ _)) (C_C (C_D _ _) (C_D _ _)) -> 734 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_D C_A C_A) -> 735 
  C_C (C_C _ (C_D _ _)) (C_D _ (C_B _)) -> 736 
  C_C (C_C C_A (C_C _ _)) (C_C (C_D _ _) (C_D _ _)) -> 737 
  C_C (C_C _ C_A) (C_C _ C_A) -> 738 
  C_C (C_C (C_D _ _) (C_B _)) (C_C (C_C _ _) (C_D _ _)) -> 739 
  C_C (C_D C_A _) (C_B C_A) -> 740 
  C_C (C_C (C_D _ _) _) (C_C (C_B _) C_A) -> 741 
  C_C (C_D (C_D _ _) (C_B _)) (C_D (C_B _) _) -> 742 
  C_C (C_C (C_B _) (C_C _ _)) (C_C C_A _) -> 743 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_C (C_C _ _) (C_D _ _)) -> 744 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_B _) -> 745 
  C_C C_A (C_D (C_D _ _) (C_B _)) -> 746 
  C_C (C_D (C_B _) (C_B _)) (C_C (C_D _ _) C_A) -> 747 
  C_C (C_D C_A _) (C_C _ (C_D _ _)) -> 748 
  C_C (C_C (C_B _) (C_B _)) (C_D _ (C_D _ _)) -> 749 
  C_C (C_C (C_B _) _) (C_D (C_C _ _) C_A) -> 750 
  C_C (C_B (C_B _)) (C_B C_A) -> 751 
  C_C (C_D (C_D _ _) (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 752 
  C_C (C_C C_A (C_D _ _)) (C_D (C_D _ _) _) -> 753 
  C_C (C_D (C_C _ _) C_A) (C_D (C_D _ _) (C_D _ _)) -> 754 
  C_C (C_D _ (C_D _ _)) (C_D (C_D _ _) C_A) -> 755 
  C_C (C_B (C_D _ _)) (C_D (C_B _) C_A) -> 756 
  C_C (C_D (C_B _) (C_B _)) (C_D (C_D _ _) (C_D _ _)) -> 757 
  C_C (C_C _ C_A) (C_D C_A (C_C _ _)) -> 758 
  C_C (C_D (C_B _) _) (C_C C_A (C_B _)) -> 759 
  C_C (C_D _ C_A) (C_C C_A _) -> 760 
  C_D (C_D _ (C_B _)) (C_C (C_D _ _) (C_B _)) -> 761 
  C_D (C_D _ (C_D _ _)) (C_D (C_B _) (C_C _ _)) -> 762 
  C_D (C_B (C_D _ _)) (C_C (C_C _ _) C_A) -> 763 
  C_D (C_C (C_D _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 764 
  C_D (C_C C_A (C_B _)) (C_D _ (C_B _)) -> 765 
  C_D (C_C (C_D _ _) _) (C_C _ (C_D _ _)) -> 766 
  C_D (C_B (C_C _ _)) (C_D C_A (C_D _ _)) -> 767 
  C_D (C_C _ (C_D _ _)) (C_C (C_C _ _) C_A) -> 768 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D _ (C_D _ _)) -> 769 
  C_D (C_D C_A C_A) (C_B (C_D _ _)) -> 770 
  C_D (C_D C_A (C_D _ _)) (C_C (C_D _ _) _) -> 771 
  C_D (C_C (C_D _ _) C_A) (C_B _) -> 772 
  C_D (C_C (C_D _ _) (C_D _ _)) (C_C C_A (C_B _)) -> 773 
  C_D (C_D (C_D _ _) (C_B _)) (C_B (C_C _ _)) -> 774 
  C_D (C_B (C_C _ _)) (C_B _) -> 775 
  C_D (C_D (C_C _ _) C_A) (C_D _ (C_B _)) -> 776 
  C_D (C_D (C_D _ _) C_A) (C_C (C_D _ _) (C_C _ _)) -> 777 
  C_D (C_D C_A (C_D _ _)) (C_D C_A (C_D _ _)) -> 778 
  C_D (C_C (C_C _ _) C_A) (C_B _) -> 779 
  C_D (C_C _ (C_C _ _)) (C_D C_A C_A) -> 780 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_C C_A (C_C _ _)) -> 781 
  C_D (C_D C_A (C_D _ _)) (C_B (C_C _ _)) -> 782 
  C_D (C_C (C_D _ _) (C_D _ _)) (C_B (C_C _ _)) -> 783 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_C _ _) _) -> 784 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_C C_A (C_B _)) -> 785 
  C_D (C_C (C_C _ _) (C_B _)) (C_B (C_C _ _)) -> 786 
  C_D (C_B (C_D _ _)) (C_D (C_C _ _) _) -> 787 
  C_D (C_D C_A _) (C_C (C_B _) C_A) -> 788 
  C_D (C_D (C_C _ _) C_A) (C_C (C_D _ _) (C_B _)) -> 789 
  C_D (C_D C_A (C_B _)) (C_D C_A (C_D _ _)) -> 790 
  C_D (C_C (C_B _) _) (C_C (C_D _ _) _) -> 791 
  C_D (C_C (C_D _ _) (C_D _ _)) (C_B (C_D _ _)) -> 792 
