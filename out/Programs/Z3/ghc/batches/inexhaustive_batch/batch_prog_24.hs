module Program_24 () where 

main = print $ show v_b
data B_A a = C_A a a | C_B | C_C a (B_A a) | C_D (B_A a) (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_C _ _) (C_C _ _)) -> 1 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_B) (C_C _ _)) -> 2 
  C_D (C_C _ (C_B)) (C_D (C_D _ _) (C_C _ _)) -> 3 
  C_D (C_C _ (C_A _ _)) (C_C _ (C_B)) -> 4 
  C_D (C_D (C_C _ _) _) (C_C _ (C_B)) -> 5 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_C _ _) _) -> 6 
  C_D (C_B) (C_D (C_A _ _) (C_C _ _)) -> 7 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_C _ (C_C _ _)) -> 8 
  C_D (C_D (C_B) (C_B)) (C_D (C_C _ _) (C_A _ _)) -> 9 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D _ _) -> 10 
  C_D (C_A _ _) (C_D (C_C _ _) (C_D _ _)) -> 11 
  C_D (C_B) (C_D (C_B) (C_A _ _)) -> 12 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_A _ _) (C_D _ _)) -> 13 
  C_D (C_D (C_B) (C_A _ _)) (C_D _ _) -> 14 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_C _ _) -> 15 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_D _ _) _) -> 16 
  C_D (C_D (C_B) (C_C _ _)) (C_C _ _) -> 17 
  C_D (C_A _ _) (C_C _ _) -> 18 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_C _ _) (C_A _ _)) -> 19 
  C_D (C_D _ _) (C_C _ (C_B)) -> 20 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_D _ _) _) -> 21 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D _ (C_A _ _)) -> 22 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_D _ _) (C_B)) -> 23 
  C_D (C_D (C_B) _) (C_D (C_C _ _) (C_D _ _)) -> 24 
  C_D (C_C _ (C_C _ _)) (C_A _ _) -> 25 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_C _ _) (C_B)) -> 26 
  C_D (C_D (C_B) (C_C _ _)) (C_D _ (C_A _ _)) -> 27 
  C_D (C_B) _ -> 28 
  C_D (C_D _ (C_D _ _)) (C_D _ _) -> 29 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_D _ _) (C_A _ _)) -> 30 
  C_D (C_D (C_B) _) (C_D (C_B) (C_C _ _)) -> 31 
  C_D (C_D (C_D _ _) (C_B)) (C_C _ (C_C _ _)) -> 32 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_B) (C_A _ _)) -> 33 
  C_D (C_D _ (C_B)) (C_A _ _) -> 34 
  C_D (C_C _ (C_D _ _)) (C_D (C_D _ _) _) -> 35 
  C_D (C_C _ (C_D _ _)) (C_D (C_D _ _) (C_A _ _)) -> 36 
  C_D (C_D (C_B) (C_B)) (C_D (C_B) _) -> 37 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_B) -> 38 
  C_D (C_D _ (C_C _ _)) (C_D (C_D _ _) _) -> 39 
  C_D (C_D (C_B) (C_B)) (C_D (C_D _ _) (C_A _ _)) -> 40 
  C_D (C_C _ _) (C_D (C_C _ _) (C_C _ _)) -> 41 
  C_D (C_A _ _) (C_D _ (C_B)) -> 42 
  C_D (C_C _ (C_A _ _)) (C_A _ _) -> 43 
  C_D (C_D _ (C_D _ _)) (C_D (C_D _ _) _) -> 44 
  C_D (C_D _ _) (C_D (C_A _ _) (C_D _ _)) -> 45 
  C_D (C_A _ _) _ -> 46 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_C _ _) (C_C _ _)) -> 47 
  C_D (C_D _ (C_D _ _)) (C_C _ (C_B)) -> 48 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_C _ _) _) -> 49 
  C_D (C_D (C_D _ _) _) (C_A _ _) -> 50 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_A _ _) (C_C _ _)) -> 51 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D _ (C_B)) -> 52 
  C_D (C_D _ (C_A _ _)) (C_D _ (C_A _ _)) -> 53 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_C _ (C_A _ _)) -> 54 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D _ (C_A _ _)) -> 55 
  C_D (C_C _ _) (C_B) -> 56 
  C_D (C_B) (C_C _ (C_A _ _)) -> 57 
  C_D (C_D (C_A _ _) _) (C_D _ (C_A _ _)) -> 58 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_C _ _) (C_D _ _)) -> 59 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_C _ _) (C_C _ _)) -> 60 
  C_D (C_C _ (C_A _ _)) (C_C _ (C_C _ _)) -> 61 
  C_D (C_C _ _) (C_D _ _) -> 62 
  C_D (C_C _ (C_C _ _)) (C_D (C_D _ _) (C_B)) -> 63 
  C_D (C_D (C_B) (C_A _ _)) (C_B) -> 64 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_C _ (C_D _ _)) -> 65 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_B) (C_B)) -> 66 
  C_D (C_B) (C_D (C_D _ _) (C_C _ _)) -> 67 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_A _ _) (C_A _ _)) -> 68 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D _ _) -> 69 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_A _ _) -> 70 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_C _ (C_B)) -> 71 
  C_D (C_D (C_B) (C_C _ _)) (C_D _ (C_C _ _)) -> 72 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_C _ _) (C_C _ _)) -> 73 
  C_D (C_C _ (C_B)) (C_D (C_B) (C_C _ _)) -> 74 
  C_D (C_D (C_A _ _) _) (C_D (C_D _ _) (C_D _ _)) -> 75 
  C_D (C_C _ (C_B)) (C_D _ _) -> 76 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_C _ _) (C_D _ _)) -> 77 
  C_D (C_C _ _) (C_D (C_D _ _) _) -> 78 
  C_D (C_C _ (C_A _ _)) (C_D (C_B) (C_D _ _)) -> 79 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_C _ (C_C _ _)) -> 80 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_B) (C_D _ _)) -> 81 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_D _ _) (C_D _ _)) -> 82 
  C_D (C_C _ (C_A _ _)) (C_D (C_D _ _) (C_B)) -> 83 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_C _ _) (C_A _ _)) -> 84 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_D _ _) (C_B)) -> 85 
  C_D (C_D (C_B) (C_A _ _)) (C_C _ _) -> 86 
  C_D (C_D (C_B) _) (C_C _ _) -> 87 
  C_D (C_D (C_A _ _) _) (C_D _ (C_C _ _)) -> 88 
  C_D (C_A _ _) (C_D (C_C _ _) (C_C _ _)) -> 89 
  C_D (C_C _ (C_B)) (C_D (C_B) _) -> 90 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_A _ _) (C_C _ _)) -> 91 
  C_D (C_D _ (C_D _ _)) (C_C _ _) -> 92 
  C_D _ (C_D (C_D _ _) (C_A _ _)) -> 93 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_A _ _) _) -> 94 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_A _ _) (C_C _ _)) -> 95 
  C_D (C_B) (C_D (C_C _ _) (C_D _ _)) -> 96 
  C_D (C_D (C_A _ _) _) _ -> 97 
  C_D (C_D (C_C _ _) _) (C_D (C_D _ _) (C_A _ _)) -> 98 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_C _ _) (C_A _ _)) -> 99 
  C_D (C_D _ (C_A _ _)) (C_D _ (C_B)) -> 100 
  C_D (C_D (C_C _ _) _) (C_C _ (C_A _ _)) -> 101 
  C_D (C_D (C_B) (C_B)) (C_C _ (C_C _ _)) -> 102 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_A _ _) (C_A _ _)) -> 103 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_B) (C_D _ _)) -> 104 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D _ (C_C _ _)) -> 105 
  C_D (C_D (C_D _ _) _) (C_D (C_A _ _) (C_B)) -> 106 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_D _ _) _) -> 107 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_D _ _) (C_C _ _)) -> 108 
  C_D (C_D (C_A _ _) _) (C_D (C_C _ _) (C_A _ _)) -> 109 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_A _ _) (C_C _ _)) -> 110 
  C_D (C_C _ (C_A _ _)) (C_D (C_D _ _) (C_A _ _)) -> 111 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_B) (C_B)) -> 112 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_C _ _) (C_D _ _)) -> 113 
  C_D (C_D _ (C_B)) (C_D (C_A _ _) (C_C _ _)) -> 114 
  C_D (C_D _ (C_B)) (C_C _ (C_D _ _)) -> 115 
  C_D (C_D (C_C _ _) _) (C_D _ (C_C _ _)) -> 116 
  C_D (C_D (C_B) (C_C _ _)) (C_C _ (C_D _ _)) -> 117 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_C _ (C_B)) -> 118 
  C_D (C_C _ _) (C_C _ (C_A _ _)) -> 119 
  C_D (C_C _ (C_C _ _)) (C_D (C_C _ _) (C_B)) -> 120 
  C_D (C_C _ (C_D _ _)) (C_D (C_A _ _) (C_D _ _)) -> 121 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_C _ (C_D _ _)) -> 122 
  C_D (C_C _ _) (C_D (C_D _ _) (C_C _ _)) -> 123 
  C_D (C_D _ (C_A _ _)) (C_D (C_B) (C_B)) -> 124 
  C_D (C_D (C_B) (C_D _ _)) (C_C _ (C_A _ _)) -> 125 
  C_D (C_C _ (C_B)) (C_C _ _) -> 126 
  C_D (C_D (C_B) (C_B)) (C_D (C_A _ _) (C_D _ _)) -> 127 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_D _ _) (C_C _ _)) -> 128 
  C_D (C_D _ (C_B)) (C_D (C_B) (C_C _ _)) -> 129 
  C_D (C_D (C_C _ _) (C_B)) (C_C _ (C_D _ _)) -> 130 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_D _ _) _) -> 131 
  C_D (C_D (C_A _ _) (C_D _ _)) _ -> 132 
  C_D (C_D (C_A _ _) _) (C_D (C_A _ _) (C_C _ _)) -> 133 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_C _ _) _) -> 134 
  C_D (C_D _ (C_B)) _ -> 135 
  C_D (C_D _ (C_B)) (C_D _ _) -> 136 
  C_D (C_C _ (C_B)) (C_D (C_D _ _) (C_D _ _)) -> 137 
  C_D (C_D (C_B) (C_D _ _)) (C_D _ (C_D _ _)) -> 138 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_B) (C_C _ _)) -> 139 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_C _ _) (C_D _ _)) -> 140 
  C_D (C_D _ _) (C_D (C_D _ _) (C_D _ _)) -> 141 
  C_D (C_C _ (C_A _ _)) (C_D (C_B) (C_C _ _)) -> 142 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_B) (C_A _ _)) -> 143 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_D _ _) (C_D _ _)) -> 144 
  C_D (C_D (C_C _ _) _) (C_D (C_C _ _) (C_D _ _)) -> 145 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_C _ _) (C_C _ _)) -> 146 
  C_D (C_C _ _) (C_C _ (C_B)) -> 147 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_B) (C_A _ _)) -> 148 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_D _ _) (C_D _ _)) -> 149 
  C_D (C_D (C_B) (C_A _ _)) (C_A _ _) -> 150 
  C_D (C_D (C_C _ _) _) (C_D (C_A _ _) (C_A _ _)) -> 151 
  C_D (C_C _ _) (C_D (C_C _ _) (C_B)) -> 152 
  C_D (C_D (C_D _ _) _) (C_D (C_D _ _) (C_C _ _)) -> 153 
  C_D (C_C _ (C_A _ _)) (C_C _ _) -> 154 
  C_D (C_D _ (C_C _ _)) (C_B) -> 155 
  C_D (C_D (C_D _ _) (C_B)) (C_B) -> 156 
  C_D (C_C _ (C_B)) (C_D _ (C_D _ _)) -> 157 
  C_D (C_D (C_B) (C_B)) (C_D (C_C _ _) (C_D _ _)) -> 158 
  C_D (C_D (C_C _ _) (C_C _ _)) _ -> 159 
  C_D (C_D (C_C _ _) (C_B)) (C_C _ (C_B)) -> 160 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_D _ _) _) -> 161 
  C_D (C_D _ (C_B)) (C_D (C_C _ _) (C_D _ _)) -> 162 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D _ (C_D _ _)) -> 163 
  C_D (C_D _ (C_D _ _)) (C_D (C_A _ _) _) -> 164 
  C_D (C_C _ _) (C_D (C_A _ _) _) -> 165 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_A _ _) (C_A _ _)) -> 166 
  C_D (C_D (C_A _ _) _) (C_D (C_C _ _) (C_D _ _)) -> 167 
  C_D (C_D _ (C_D _ _)) (C_D _ (C_C _ _)) -> 168 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_B) -> 169 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_A _ _) -> 170 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_C _ _) (C_A _ _)) -> 171 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D _ (C_B)) -> 172 
  C_D (C_C _ (C_B)) (C_D (C_B) (C_A _ _)) -> 173 
  C_D _ (C_A _ _) -> 174 
  C_D (C_C _ (C_B)) (C_D (C_D _ _) _) -> 175 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D _ (C_D _ _)) -> 176 
  C_D (C_C _ (C_C _ _)) (C_D _ (C_C _ _)) -> 177 
  C_D _ (C_D (C_D _ _) (C_C _ _)) -> 178 
  C_D (C_C _ (C_C _ _)) (C_D (C_B) (C_D _ _)) -> 179 
  C_D (C_B) (C_D (C_C _ _) _) -> 180 
  C_D (C_D _ (C_A _ _)) (C_D _ _) -> 181 
  C_D (C_D _ (C_B)) (C_D (C_C _ _) _) -> 182 
  C_D (C_D (C_C _ _) _) (C_D (C_B) (C_B)) -> 183 
  C_D (C_D (C_B) (C_B)) (C_D _ (C_D _ _)) -> 184 
  C_D (C_B) (C_D (C_A _ _) (C_D _ _)) -> 185 
  C_D (C_D (C_D _ _) _) (C_D _ (C_A _ _)) -> 186 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_B) (C_A _ _)) -> 187 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_C _ _) (C_B)) -> 188 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_D _ _) _) -> 189 
  C_D (C_A _ _) (C_D (C_D _ _) (C_B)) -> 190 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_C _ (C_D _ _)) -> 191 
  C_D (C_D (C_B) (C_B)) (C_D (C_B) (C_B)) -> 192 
  C_D (C_D _ (C_D _ _)) (C_D (C_D _ _) (C_C _ _)) -> 193 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_B) (C_B)) -> 194 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_A _ _) -> 195 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_C _ _) (C_B)) -> 196 
  C_D (C_C _ (C_D _ _)) (C_D (C_B) (C_D _ _)) -> 197 
  C_D (C_D _ (C_C _ _)) (C_D (C_A _ _) (C_D _ _)) -> 198 
  C_D (C_D (C_A _ _) _) (C_D (C_D _ _) (C_B)) -> 199 
  C_D (C_D (C_B) (C_D _ _)) (C_C _ _) -> 200 
  C_D (C_C _ (C_D _ _)) (C_D (C_C _ _) (C_C _ _)) -> 201 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_C _ (C_C _ _)) -> 202 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_B) (C_D _ _)) -> 203 
  C_D (C_C _ (C_D _ _)) (C_D (C_C _ _) (C_D _ _)) -> 204 
  C_D _ (C_D (C_B) _) -> 205 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D _ (C_A _ _)) -> 206 
  C_D (C_B) (C_D (C_D _ _) (C_D _ _)) -> 207 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_B) (C_D _ _)) -> 208 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_B) (C_B)) -> 209 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_C _ (C_A _ _)) -> 210 
  C_D (C_D _ (C_D _ _)) (C_C _ (C_C _ _)) -> 211 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_B) (C_B)) -> 212 
  C_D (C_C _ (C_A _ _)) (C_D (C_C _ _) (C_D _ _)) -> 213 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_C _ _) (C_B)) -> 214 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_C _ _) (C_A _ _)) -> 215 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_B) (C_C _ _)) -> 216 
  C_D (C_D (C_A _ _) _) (C_D (C_C _ _) _) -> 217 
  C_D (C_C _ (C_A _ _)) (C_C _ (C_A _ _)) -> 218 
  C_D _ (C_D (C_C _ _) (C_A _ _)) -> 219 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_C _ (C_B)) -> 220 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_A _ _) (C_B)) -> 221 
  C_D (C_D (C_B) _) (C_D (C_D _ _) (C_B)) -> 222 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_D _ _) _) -> 223 
  C_D (C_D _ (C_D _ _)) (C_D (C_B) (C_A _ _)) -> 224 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_A _ _) (C_D _ _)) -> 225 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_A _ _) (C_B)) -> 226 
  C_D (C_B) (C_D (C_C _ _) (C_C _ _)) -> 227 
  C_D (C_D (C_B) (C_B)) (C_D (C_C _ _) (C_B)) -> 228 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_D _ _) (C_B)) -> 229 
  C_D (C_D (C_B) _) (C_C _ (C_A _ _)) -> 230 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_B) (C_B)) -> 231 
  C_D (C_D _ (C_C _ _)) (C_D (C_D _ _) (C_A _ _)) -> 232 
  C_D (C_D (C_B) (C_B)) (C_D (C_B) (C_C _ _)) -> 233 
  C_D (C_D (C_D _ _) _) (C_D (C_D _ _) (C_D _ _)) -> 234 
  C_D (C_D (C_C _ _) (C_B)) (C_D _ (C_B)) -> 235 
  C_D (C_D (C_B) (C_B)) (C_D _ (C_A _ _)) -> 236 
  C_D (C_D (C_B) _) (C_D _ (C_A _ _)) -> 237 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D _ _) -> 238 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_C _ _) (C_C _ _)) -> 239 
  C_D (C_D _ (C_C _ _)) (C_D _ (C_B)) -> 240 
  C_D (C_D (C_D _ _) (C_B)) (C_D _ (C_B)) -> 241 
  C_D (C_C _ (C_D _ _)) (C_D (C_B) (C_B)) -> 242 
  C_D (C_D (C_B) (C_A _ _)) (C_D _ (C_A _ _)) -> 243 
  C_D (C_C _ (C_C _ _)) (C_D _ _) -> 244 
  C_D (C_D _ _) (C_D _ (C_B)) -> 245 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D _ (C_C _ _)) -> 246 
  C_D (C_A _ _) (C_D (C_B) (C_B)) -> 247 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_B) (C_D _ _)) -> 248 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_C _ (C_A _ _)) -> 249 
  C_D (C_D _ (C_C _ _)) (C_D (C_A _ _) (C_A _ _)) -> 250 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_B) (C_B)) -> 251 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_C _ _) (C_B)) -> 252 
  C_D (C_D (C_B) (C_B)) (C_D (C_D _ _) _) -> 253 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_A _ _) _) -> 254 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_A _ _) _) -> 255 
  C_D (C_C _ (C_C _ _)) (C_D (C_B) _) -> 256 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D _ (C_C _ _)) -> 257 
  C_D (C_D (C_A _ _) _) (C_D (C_A _ _) (C_D _ _)) -> 258 
  C_D (C_C _ (C_A _ _)) (C_D (C_C _ _) (C_B)) -> 259 
  C_D (C_D (C_A _ _) _) (C_D (C_D _ _) (C_C _ _)) -> 260 
  C_D (C_D _ (C_B)) (C_D (C_C _ _) (C_B)) -> 261 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D _ _) -> 262 
  C_D (C_D _ (C_C _ _)) (C_C _ (C_D _ _)) -> 263 
  C_D (C_D _ _) (C_D (C_C _ _) (C_A _ _)) -> 264 
  C_D (C_C _ (C_D _ _)) (C_C _ (C_D _ _)) -> 265 
  C_D (C_D (C_B) (C_C _ _)) (C_D _ (C_D _ _)) -> 266 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_A _ _) (C_A _ _)) -> 267 
  C_D (C_A _ _) (C_D (C_A _ _) (C_C _ _)) -> 268 
  C_D (C_D (C_A _ _) _) (C_D (C_B) _) -> 269 
  C_D (C_D _ _) (C_D _ (C_C _ _)) -> 270 
  C_D (C_D (C_B) _) (C_C _ (C_D _ _)) -> 271 
  C_D (C_C _ (C_A _ _)) (C_D (C_A _ _) (C_D _ _)) -> 272 
  C_D (C_D _ (C_A _ _)) _ -> 273 
  C_D (C_D _ (C_B)) (C_D (C_B) (C_D _ _)) -> 274 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D _ _) -> 275 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D _ _) -> 276 
  C_D (C_B) (C_D _ (C_A _ _)) -> 277 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_C _ (C_C _ _)) -> 278 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_A _ _) _) -> 279 
  C_D (C_C _ _) (C_D (C_B) (C_B)) -> 280 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_A _ _) (C_A _ _)) -> 281 
  C_D (C_D _ (C_B)) (C_D _ (C_D _ _)) -> 282 
  C_D (C_D (C_B) (C_B)) (C_B) -> 283 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D _ (C_C _ _)) -> 284 
  C_D (C_C _ (C_D _ _)) (C_C _ _) -> 285 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_B) (C_A _ _)) -> 286 
  C_D (C_C _ (C_D _ _)) (C_D (C_A _ _) (C_C _ _)) -> 287 
  C_D (C_A _ _) (C_D (C_A _ _) (C_B)) -> 288 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_B) _) -> 289 
  C_D (C_D (C_B) _) (C_D _ (C_D _ _)) -> 290 
  C_D (C_D (C_C _ _) _) _ -> 291 
  C_D (C_D (C_D _ _) _) (C_C _ _) -> 292 
  C_D (C_D _ _) (C_D (C_B) (C_B)) -> 293 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_A _ _) (C_D _ _)) -> 294 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_B) (C_D _ _)) -> 295 
  C_D (C_D (C_D _ _) _) (C_D _ _) -> 296 
  C_D (C_B) (C_D (C_B) _) -> 297 
  C_D (C_C _ (C_B)) (C_D _ (C_A _ _)) -> 298 
  C_D (C_C _ (C_B)) (C_B) -> 299 
  C_D (C_C _ (C_D _ _)) (C_D (C_A _ _) _) -> 300 
  C_D (C_D (C_C _ _) _) (C_C _ _) -> 301 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_C _ _) -> 302 
  C_D (C_C _ (C_A _ _)) (C_D (C_B) _) -> 303 
  C_D (C_C _ _) (C_C _ (C_C _ _)) -> 304 
  C_D (C_D (C_A _ _) _) (C_D _ (C_B)) -> 305 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_C _ (C_A _ _)) -> 306 
  C_D (C_A _ _) (C_D (C_D _ _) (C_A _ _)) -> 307 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_D _ _) (C_C _ _)) -> 308 
  C_D (C_D _ (C_B)) (C_D (C_D _ _) (C_A _ _)) -> 309 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_B) _) -> 310 
  C_D (C_C _ (C_D _ _)) (C_A _ _) -> 311 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_B) (C_B)) -> 312 
  C_D (C_B) (C_D (C_B) (C_D _ _)) -> 313 
  C_D (C_D (C_B) _) (C_D _ _) -> 314 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_C _ (C_C _ _)) -> 315 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_C _ (C_C _ _)) -> 316 
  C_D (C_C _ (C_D _ _)) (C_B) -> 317 
  C_D (C_D (C_C _ _) (C_B)) (C_D _ _) -> 318 
  C_D _ (C_D (C_C _ _) (C_D _ _)) -> 319 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_D _ _) _) -> 320 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_B) (C_D _ _)) -> 321 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_C _ (C_C _ _)) -> 322 
  C_D (C_A _ _) (C_D (C_B) (C_C _ _)) -> 323 
  C_D (C_D (C_A _ _) _) (C_D (C_A _ _) (C_A _ _)) -> 324 
  C_D (C_C _ _) (C_D (C_B) _) -> 325 
  C_D _ (C_C _ (C_C _ _)) -> 326 
  C_D (C_D _ (C_C _ _)) (C_D (C_B) (C_D _ _)) -> 327 
  C_D (C_D (C_A _ _) (C_B)) (C_D _ _) -> 328 
  C_D (C_D (C_A _ _) (C_B)) (C_C _ (C_A _ _)) -> 329 
  C_D (C_D _ _) (C_D (C_A _ _) (C_A _ _)) -> 330 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_C _ _) (C_B)) -> 331 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_A _ _) _) -> 332 
  C_D (C_D (C_B) (C_D _ _)) (C_D _ _) -> 333 
  C_D (C_D (C_A _ _) _) (C_D (C_B) (C_B)) -> 334 
  C_D (C_C _ (C_B)) (C_C _ (C_A _ _)) -> 335 
  C_D (C_D (C_B) (C_B)) (C_D (C_C _ _) _) -> 336 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_C _ _) (C_B)) -> 337 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_B) -> 338 
  C_D (C_D _ _) (C_D (C_D _ _) (C_B)) -> 339 
  C_D _ (C_D (C_C _ _) (C_B)) -> 340 
  C_D (C_D (C_B) (C_D _ _)) (C_D _ (C_A _ _)) -> 341 
  C_D (C_C _ _) (C_D (C_C _ _) _) -> 342 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_D _ _) (C_A _ _)) -> 343 
  C_D (C_C _ (C_A _ _)) (C_D (C_B) (C_A _ _)) -> 344 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_A _ _) (C_C _ _)) -> 345 
  C_D (C_D (C_D _ _) _) (C_D (C_A _ _) _) -> 346 
  C_D (C_D (C_D _ _) (C_B)) (C_C _ (C_D _ _)) -> 347 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_C _ _) (C_A _ _)) -> 348 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_C _ _) -> 349 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_B) (C_A _ _)) -> 350 
  C_D (C_D (C_B) _) (C_C _ (C_C _ _)) -> 351 
  C_D (C_D (C_A _ _) (C_B)) (C_C _ (C_D _ _)) -> 352 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_D _ _) (C_D _ _)) -> 353 
  C_D (C_D (C_A _ _) _) (C_D _ _) -> 354 
  C_D _ (C_D (C_A _ _) (C_A _ _)) -> 355 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_B) (C_D _ _)) -> 356 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_C _ _) (C_D _ _)) -> 357 
  C_D (C_A _ _) (C_C _ (C_B)) -> 358 
  C_D (C_D _ (C_A _ _)) (C_D (C_A _ _) (C_C _ _)) -> 359 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_C _ _) (C_A _ _)) -> 360 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_B) (C_B)) -> 361 
  C_D (C_D _ (C_C _ _)) (C_D (C_D _ _) (C_B)) -> 362 
  C_D (C_D (C_C _ _) _) (C_D (C_D _ _) (C_B)) -> 363 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_C _ (C_A _ _)) -> 364 
  C_D (C_C _ (C_A _ _)) (C_D (C_D _ _) (C_D _ _)) -> 365 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_D _ _) (C_D _ _)) -> 366 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_A _ _) (C_D _ _)) -> 367 
  C_D (C_D _ (C_C _ _)) (C_D (C_A _ _) _) -> 368 
  C_D (C_D (C_C _ _) (C_B)) (C_D _ (C_D _ _)) -> 369 
  C_D (C_B) (C_D (C_B) (C_C _ _)) -> 370 
  C_D (C_D (C_D _ _) (C_B)) (C_D _ (C_C _ _)) -> 371 
  C_D (C_D (C_D _ _) _) (C_D (C_B) (C_B)) -> 372 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_C _ (C_B)) -> 373 
  C_D (C_C _ (C_A _ _)) (C_B) -> 374 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_D _ _) _) -> 375 
  C_D (C_D _ (C_D _ _)) _ -> 376 
  C_D (C_C _ (C_D _ _)) (C_D _ (C_C _ _)) -> 377 
  C_D (C_C _ (C_D _ _)) (C_D _ _) -> 378 
  C_D _ (C_C _ _) -> 379 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_C _ _) _) -> 380 
  C_D (C_D _ (C_A _ _)) (C_D (C_A _ _) (C_D _ _)) -> 381 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_B) (C_D _ _)) -> 382 
  C_D (C_D (C_B) _) (C_D (C_D _ _) (C_D _ _)) -> 383 
  C_D (C_D (C_D _ _) (C_B)) (C_A _ _) -> 384 
  C_D (C_C _ _) (C_D (C_A _ _) (C_D _ _)) -> 385 
  C_D (C_C _ _) (C_D _ (C_C _ _)) -> 386 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_D _ _) (C_A _ _)) -> 387 
  C_D (C_D (C_A _ _) _) (C_B) -> 388 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D _ (C_A _ _)) -> 389 
  C_D (C_D (C_D _ _) _) (C_C _ (C_C _ _)) -> 390 
  C_D (C_D (C_C _ _) _) (C_D (C_A _ _) (C_B)) -> 391 
  C_D (C_C _ _) (C_D (C_D _ _) (C_A _ _)) -> 392 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_A _ _) (C_A _ _)) -> 393 
  C_D (C_D (C_B) (C_B)) (C_D (C_D _ _) (C_D _ _)) -> 394 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_A _ _) _) -> 395 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_B) -> 396 
  C_D (C_D (C_B) (C_C _ _)) (C_C _ (C_A _ _)) -> 397 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_A _ _) (C_B)) -> 398 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_A _ _) (C_B)) -> 399 
  C_D (C_D (C_A _ _) _) (C_D (C_B) (C_D _ _)) -> 400 
  C_D (C_D (C_B) (C_B)) (C_A _ _) -> 401 
  C_D (C_D _ (C_C _ _)) (C_D _ (C_D _ _)) -> 402 
  C_D (C_C _ (C_D _ _)) (C_D (C_C _ _) (C_B)) -> 403 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_C _ _) (C_B)) -> 404 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D _ (C_B)) -> 405 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_C _ _) (C_C _ _)) -> 406 
  C_D (C_B) (C_D (C_C _ _) (C_B)) -> 407 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_A _ _) (C_A _ _)) -> 408 
  C_D (C_D (C_D _ _) _) (C_D (C_D _ _) (C_A _ _)) -> 409 
  C_D (C_D (C_B) (C_A _ _)) (C_D _ (C_D _ _)) -> 410 
  C_D (C_D (C_A _ _) (C_B)) (C_C _ _) -> 411 
  C_D (C_D _ (C_B)) (C_D (C_D _ _) (C_D _ _)) -> 412 
  C_D (C_C _ (C_D _ _)) (C_D _ (C_D _ _)) -> 413 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_A _ _) (C_A _ _)) -> 414 
  C_D _ (C_D (C_D _ _) (C_D _ _)) -> 415 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_C _ (C_D _ _)) -> 416 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 417 
  C_D (C_D (C_B) _) (C_D (C_A _ _) (C_D _ _)) -> 418 
  C_D (C_C _ _) (C_D (C_A _ _) (C_A _ _)) -> 419 
  C_D (C_D (C_B) (C_C _ _)) (C_B) -> 420 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_B) _) -> 421 
  C_D (C_C _ (C_A _ _)) (C_D _ _) -> 422 
  C_D (C_D (C_B) (C_B)) (C_C _ (C_D _ _)) -> 423 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_B) -> 424 
  C_D (C_D (C_B) (C_A _ _)) (C_D _ (C_C _ _)) -> 425 
  C_D (C_D _ (C_C _ _)) (C_D (C_C _ _) (C_B)) -> 426 
  C_D (C_D (C_D _ _) (C_B)) (C_C _ (C_A _ _)) -> 427 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_A _ _) _) -> 428 
  C_D (C_C _ (C_B)) (C_D (C_C _ _) (C_B)) -> 429 
  C_D (C_B) (C_D (C_A _ _) _) -> 430 
  C_D (C_D _ (C_A _ _)) (C_D (C_B) _) -> 431 
  C_D (C_D _ (C_B)) (C_D _ (C_A _ _)) -> 432 
  C_D (C_D (C_B) _) (C_D (C_C _ _) (C_C _ _)) -> 433 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_A _ _) (C_C _ _)) -> 434 
  C_D (C_D (C_A _ _) _) (C_D (C_A _ _) _) -> 435 
  C_D (C_D (C_C _ _) _) (C_D (C_B) (C_A _ _)) -> 436 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D _ (C_C _ _)) -> 437 
  C_D (C_D (C_C _ _) _) (C_D (C_C _ _) (C_B)) -> 438 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_B) (C_A _ _)) -> 439 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_B) _) -> 440 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_C _ _) (C_A _ _)) -> 441 
  C_D (C_D _ (C_B)) (C_D _ (C_C _ _)) -> 442 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_A _ _) _) -> 443 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_C _ (C_A _ _)) -> 444 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_D _ _) (C_C _ _)) -> 445 
  C_D (C_D _ (C_C _ _)) (C_C _ _) -> 446 
  C_D (C_D _ (C_A _ _)) (C_B) -> 447 
  C_D (C_A _ _) (C_D (C_D _ _) (C_C _ _)) -> 448 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_A _ _) -> 449 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_B) (C_C _ _)) -> 450 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_D _ _) (C_D _ _)) -> 451 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_D _ _) _) -> 452 
  C_D (C_D (C_B) (C_B)) (C_D (C_B) (C_D _ _)) -> 453 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_A _ _) _) -> 454 
  C_D (C_C _ (C_B)) (C_D (C_D _ _) (C_B)) -> 455 
  C_D (C_D _ (C_D _ _)) (C_D (C_A _ _) (C_D _ _)) -> 456 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_A _ _) (C_C _ _)) -> 457 
  C_D (C_C _ (C_B)) (C_D (C_A _ _) _) -> 458 
  C_D (C_C _ (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 459 
  C_D (C_D _ (C_C _ _)) (C_C _ (C_B)) -> 460 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_D _ _) (C_D _ _)) -> 461 
  C_D (C_D (C_B) _) (C_D (C_D _ _) (C_C _ _)) -> 462 
  C_D (C_D _ _) (C_D (C_C _ _) (C_C _ _)) -> 463 
  C_D (C_D (C_C _ _) (C_A _ _)) (C_D (C_A _ _) (C_B)) -> 464 
  C_D (C_D _ (C_B)) (C_C _ (C_A _ _)) -> 465 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_A _ _) (C_D _ _)) -> 466 
  C_D (C_D _ (C_C _ _)) (C_A _ _) -> 467 
  C_D (C_D (C_A _ _) _) (C_C _ _) -> 468 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_C _ _) _) -> 469 
  C_D (C_C _ (C_B)) (C_D (C_A _ _) (C_C _ _)) -> 470 
  C_D (C_D _ (C_A _ _)) (C_D (C_B) (C_A _ _)) -> 471 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D _ (C_A _ _)) -> 472 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_A _ _) _) -> 473 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D _ (C_B)) -> 474 
  C_D (C_C _ (C_A _ _)) (C_D (C_D _ _) (C_C _ _)) -> 475 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D _ (C_C _ _)) -> 476 
  C_D (C_D (C_D _ _) _) (C_D (C_D _ _) (C_B)) -> 477 
  C_D (C_D _ (C_D _ _)) (C_D (C_A _ _) (C_C _ _)) -> 478 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_C _ _) (C_D _ _)) -> 479 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_D _ _) (C_D _ _)) -> 480 
  C_D (C_D (C_A _ _) (C_C _ _)) (C_D (C_C _ _) (C_B)) -> 481 
  C_D (C_D _ (C_B)) (C_D (C_D _ _) (C_C _ _)) -> 482 
  C_D (C_D _ (C_D _ _)) (C_D (C_D _ _) (C_A _ _)) -> 483 
  C_D (C_A _ _) (C_A _ _) -> 484 
  C_D (C_B) (C_D (C_C _ _) (C_A _ _)) -> 485 
  C_D (C_D _ (C_A _ _)) (C_C _ _) -> 486 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_D _ _) (C_C _ _)) -> 487 
  C_D (C_D _ _) (C_C _ _) -> 488 
  C_D (C_C _ (C_C _ _)) (C_D (C_D _ _) (C_C _ _)) -> 489 
  C_D (C_D (C_D _ _) _) _ -> 490 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D (C_A _ _) (C_B)) -> 491 
  C_D (C_D (C_A _ _) (C_A _ _)) (C_D _ (C_D _ _)) -> 492 
  C_D (C_C _ (C_B)) (C_D (C_C _ _) (C_D _ _)) -> 493 
  C_D _ (C_D (C_A _ _) (C_D _ _)) -> 494 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_D _ _) (C_D _ _)) -> 495 
  C_D (C_B) (C_D _ (C_C _ _)) -> 496 
  C_D (C_A _ _) (C_D (C_B) (C_D _ _)) -> 497 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_D _ _) (C_C _ _)) -> 498 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_B) _) -> 499 
  C_D (C_D _ (C_C _ _)) (C_D (C_B) _) -> 500 
  C_D (C_C _ (C_B)) (C_C _ (C_C _ _)) -> 501 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D _ (C_D _ _)) -> 502 
  C_D (C_D (C_A _ _) _) (C_C _ (C_B)) -> 503 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_B) (C_C _ _)) -> 504 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_C _ _) (C_B)) -> 505 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_A _ _) (C_C _ _)) -> 506 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_A _ _) _) -> 507 
  C_D (C_D _ (C_B)) (C_B) -> 508 
  C_D (C_C _ (C_D _ _)) (C_D (C_D _ _) (C_C _ _)) -> 509 
  C_D (C_D (C_B) (C_A _ _)) (C_D (C_D _ _) (C_B)) -> 510 
  C_D (C_D _ (C_D _ _)) (C_D _ (C_B)) -> 511 
