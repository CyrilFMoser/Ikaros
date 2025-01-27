module Program_12 () where 

main = print $ show v_b
data B_A = C_A (B_B B_A) | C_B Int (B_B Int) (B_B ((B_A,B_A))) | C_C B_A (B_B B_A) B_A
data B_B a = C_D | C_E | C_F (B_B a) ((B_A,B_B B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_D) -> 0 
  C_A (C_E) -> 1 
  C_A (C_F (C_D) _) -> 2 
  C_A (C_F (C_E) _) -> 3 
  C_A (C_F (C_F _ _) _) -> 4 
  C_B _ (C_D) (C_D) -> 5 
  C_B _ (C_D) (C_E) -> 6 
  C_B _ (C_D) (C_F _ ((_,_))) -> 7 
  C_B _ (C_E) (C_D) -> 8 
  C_B _ (C_E) (C_E) -> 9 
  C_B _ (C_E) (C_F _ ((_,_))) -> 10 
  C_B _ (C_F _ _) (C_D) -> 11 
  C_B _ (C_F _ _) (C_E) -> 12 
  C_B _ (C_F _ _) (C_F _ ((_,_))) -> 13 
  C_C (C_A (C_D)) (C_D) (C_A (C_D)) -> 14 
  C_C (C_A (C_D)) (C_E) (C_A (C_D)) -> 15 
  C_C (C_A (C_D)) (C_F (C_D) _) (C_A (C_D)) -> 16 
  C_C (C_A (C_D)) (C_F (C_E) _) (C_A (C_D)) -> 17 
  C_C (C_A (C_D)) (C_F (C_F _ _) _) (C_A (C_D)) -> 18 
  C_C (C_A (C_D)) (C_D) (C_A (C_E)) -> 19 
  C_C (C_A (C_D)) (C_E) (C_A (C_E)) -> 20 
  C_C (C_A (C_D)) (C_F (C_D) _) (C_A (C_E)) -> 21 
  C_C (C_A (C_D)) (C_F (C_E) _) (C_A (C_E)) -> 22 
  C_C (C_A (C_D)) (C_F (C_F _ _) _) (C_A (C_E)) -> 23 
  C_C (C_A (C_D)) (C_D) (C_A (C_F _ _)) -> 24 
  C_C (C_A (C_D)) (C_E) (C_A (C_F _ _)) -> 25 
  C_C (C_A (C_D)) (C_F (C_D) _) (C_A (C_F _ _)) -> 26 
  C_C (C_A (C_D)) (C_F (C_E) _) (C_A (C_F _ _)) -> 27 
  C_C (C_A (C_D)) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 28 
  C_C (C_A (C_D)) (C_D) (C_B _ _ _) -> 29 
  C_C (C_A (C_D)) (C_E) (C_B _ _ _) -> 30 
  C_C (C_A (C_D)) (C_F (C_D) _) (C_B _ _ _) -> 31 
  C_C (C_A (C_D)) (C_F (C_E) _) (C_B _ _ _) -> 32 
  C_C (C_A (C_D)) (C_F (C_F _ _) _) (C_B _ _ _) -> 33 
  C_C (C_A (C_D)) (C_D) (C_C _ _ _) -> 34 
  C_C (C_A (C_D)) (C_E) (C_C _ _ _) -> 35 
  C_C (C_A (C_D)) (C_F (C_D) _) (C_C _ _ _) -> 36 
  C_C (C_A (C_D)) (C_F (C_E) _) (C_C _ _ _) -> 37 
  C_C (C_A (C_D)) (C_F (C_F _ _) _) (C_C _ _ _) -> 38 
  C_C (C_A (C_E)) (C_D) (C_A (C_D)) -> 39 
  C_C (C_A (C_E)) (C_E) (C_A (C_D)) -> 40 
  C_C (C_A (C_E)) (C_F (C_D) _) (C_A (C_D)) -> 41 
  C_C (C_A (C_E)) (C_F (C_E) _) (C_A (C_D)) -> 42 
  C_C (C_A (C_E)) (C_F (C_F _ _) _) (C_A (C_D)) -> 43 
  C_C (C_A (C_E)) (C_D) (C_A (C_E)) -> 44 
  C_C (C_A (C_E)) (C_E) (C_A (C_E)) -> 45 
  C_C (C_A (C_E)) (C_F (C_D) _) (C_A (C_E)) -> 46 
  C_C (C_A (C_E)) (C_F (C_E) _) (C_A (C_E)) -> 47 
  C_C (C_A (C_E)) (C_F (C_F _ _) _) (C_A (C_E)) -> 48 
  C_C (C_A (C_E)) (C_D) (C_A (C_F _ _)) -> 49 
  C_C (C_A (C_E)) (C_E) (C_A (C_F _ _)) -> 50 
  C_C (C_A (C_E)) (C_F (C_D) _) (C_A (C_F _ _)) -> 51 
  C_C (C_A (C_E)) (C_F (C_E) _) (C_A (C_F _ _)) -> 52 
  C_C (C_A (C_E)) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 53 
  C_C (C_A (C_E)) (C_D) (C_B _ _ _) -> 54 
  C_C (C_A (C_E)) (C_E) (C_B _ _ _) -> 55 
  C_C (C_A (C_E)) (C_F (C_D) _) (C_B _ _ _) -> 56 
  C_C (C_A (C_E)) (C_F (C_E) _) (C_B _ _ _) -> 57 
  C_C (C_A (C_E)) (C_F (C_F _ _) _) (C_B _ _ _) -> 58 
  C_C (C_A (C_E)) (C_D) (C_C _ _ _) -> 59 
  C_C (C_A (C_E)) (C_E) (C_C _ _ _) -> 60 
  C_C (C_A (C_E)) (C_F (C_D) _) (C_C _ _ _) -> 61 
  C_C (C_A (C_E)) (C_F (C_E) _) (C_C _ _ _) -> 62 
  C_C (C_A (C_E)) (C_F (C_F _ _) _) (C_C _ _ _) -> 63 
  C_C (C_A (C_F _ _)) (C_E) (C_A (C_D)) -> 64 
  C_C (C_A (C_F _ _)) (C_F (C_D) _) (C_A (C_D)) -> 65 
  C_C (C_A (C_F _ _)) (C_F (C_E) _) (C_A (C_D)) -> 66 
  C_C (C_A (C_F _ _)) (C_F (C_F _ _) _) (C_A (C_D)) -> 67 
  C_C (C_A (C_F _ _)) (C_D) (C_A (C_E)) -> 68 
  C_C (C_A (C_F _ _)) (C_E) (C_A (C_E)) -> 69 
  C_C (C_A (C_F _ _)) (C_F (C_D) _) (C_A (C_E)) -> 70 
  C_C (C_A (C_F _ _)) (C_F (C_E) _) (C_A (C_E)) -> 71 
  C_C (C_A (C_F _ _)) (C_F (C_F _ _) _) (C_A (C_E)) -> 72 
  C_C (C_A (C_F _ _)) (C_D) (C_A (C_F _ _)) -> 73 
  C_C (C_A (C_F _ _)) (C_E) (C_A (C_F _ _)) -> 74 
  C_C (C_A (C_F _ _)) (C_F (C_D) _) (C_A (C_F _ _)) -> 75 
  C_C (C_A (C_F _ _)) (C_F (C_E) _) (C_A (C_F _ _)) -> 76 
  C_C (C_A (C_F _ _)) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 77 
  C_C (C_A (C_F _ _)) (C_D) (C_B _ _ _) -> 78 
  C_C (C_A (C_F _ _)) (C_E) (C_B _ _ _) -> 79 
  C_C (C_A (C_F _ _)) (C_F (C_D) _) (C_B _ _ _) -> 80 
  C_C (C_A (C_F _ _)) (C_F (C_E) _) (C_B _ _ _) -> 81 
  C_C (C_A (C_F _ _)) (C_F (C_F _ _) _) (C_B _ _ _) -> 82 
  C_C (C_A (C_F _ _)) (C_D) (C_C _ _ _) -> 83 
  C_C (C_A (C_F _ _)) (C_E) (C_C _ _ _) -> 84 
  C_C (C_A (C_F _ _)) (C_F (C_D) _) (C_C _ _ _) -> 85 
  C_C (C_A (C_F _ _)) (C_F (C_E) _) (C_C _ _ _) -> 86 
  C_C (C_A (C_F _ _)) (C_F (C_F _ _) _) (C_C _ _ _) -> 87 
  C_C (C_B _ (C_D) (C_D)) (C_D) (C_A (C_D)) -> 88 
  C_C (C_B _ (C_D) (C_D)) (C_E) (C_A (C_D)) -> 89 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_D) _) (C_A (C_D)) -> 90 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_E) _) (C_A (C_D)) -> 91 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_F _ _) _) (C_A (C_D)) -> 92 
  C_C (C_B _ (C_D) (C_D)) (C_D) (C_A (C_E)) -> 93 
  C_C (C_B _ (C_D) (C_D)) (C_E) (C_A (C_E)) -> 94 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_D) _) (C_A (C_E)) -> 95 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_E) _) (C_A (C_E)) -> 96 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_F _ _) _) (C_A (C_E)) -> 97 
  C_C (C_B _ (C_D) (C_D)) (C_D) (C_A (C_F _ _)) -> 98 
  C_C (C_B _ (C_D) (C_D)) (C_E) (C_A (C_F _ _)) -> 99 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_D) _) (C_A (C_F _ _)) -> 100 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_E) _) (C_A (C_F _ _)) -> 101 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 102 
  C_C (C_B _ (C_D) (C_D)) (C_D) (C_B _ _ _) -> 103 
  C_C (C_B _ (C_D) (C_D)) (C_E) (C_B _ _ _) -> 104 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_D) _) (C_B _ _ _) -> 105 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_E) _) (C_B _ _ _) -> 106 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_F _ _) _) (C_B _ _ _) -> 107 
  C_C (C_B _ (C_D) (C_D)) (C_D) (C_C _ _ _) -> 108 
  C_C (C_B _ (C_D) (C_D)) (C_E) (C_C _ _ _) -> 109 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_D) _) (C_C _ _ _) -> 110 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_E) _) (C_C _ _ _) -> 111 
  C_C (C_B _ (C_D) (C_D)) (C_F (C_F _ _) _) (C_C _ _ _) -> 112 
  C_C (C_B _ (C_D) (C_E)) (C_D) (C_A (C_D)) -> 113 
  C_C (C_B _ (C_D) (C_E)) (C_E) (C_A (C_D)) -> 114 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_D) _) (C_A (C_D)) -> 115 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_E) _) (C_A (C_D)) -> 116 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_F _ _) _) (C_A (C_D)) -> 117 
  C_C (C_B _ (C_D) (C_E)) (C_D) (C_A (C_E)) -> 118 
  C_C (C_B _ (C_D) (C_E)) (C_E) (C_A (C_E)) -> 119 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_D) _) (C_A (C_E)) -> 120 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_E) _) (C_A (C_E)) -> 121 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_F _ _) _) (C_A (C_E)) -> 122 
  C_C (C_B _ (C_D) (C_E)) (C_D) (C_A (C_F _ _)) -> 123 
  C_C (C_B _ (C_D) (C_E)) (C_E) (C_A (C_F _ _)) -> 124 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_D) _) (C_A (C_F _ _)) -> 125 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_E) _) (C_A (C_F _ _)) -> 126 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 127 
  C_C (C_B _ (C_D) (C_E)) (C_D) (C_B _ _ _) -> 128 
  C_C (C_B _ (C_D) (C_E)) (C_E) (C_B _ _ _) -> 129 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_D) _) (C_B _ _ _) -> 130 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_E) _) (C_B _ _ _) -> 131 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_F _ _) _) (C_B _ _ _) -> 132 
  C_C (C_B _ (C_D) (C_E)) (C_D) (C_C _ _ _) -> 133 
  C_C (C_B _ (C_D) (C_E)) (C_E) (C_C _ _ _) -> 134 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_D) _) (C_C _ _ _) -> 135 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_E) _) (C_C _ _ _) -> 136 
  C_C (C_B _ (C_D) (C_E)) (C_F (C_F _ _) _) (C_C _ _ _) -> 137 
  C_C (C_B _ (C_D) (C_F _ _)) (C_D) (C_A (C_D)) -> 138 
  C_C (C_B _ (C_D) (C_F _ _)) (C_E) (C_A (C_D)) -> 139 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_D) _) (C_A (C_D)) -> 140 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_E) _) (C_A (C_D)) -> 141 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_F _ _) _) (C_A (C_D)) -> 142 
  C_C (C_B _ (C_D) (C_F _ _)) (C_D) (C_A (C_E)) -> 143 
  C_C (C_B _ (C_D) (C_F _ _)) (C_E) (C_A (C_E)) -> 144 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_D) _) (C_A (C_E)) -> 145 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_E) _) (C_A (C_E)) -> 146 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_F _ _) _) (C_A (C_E)) -> 147 
  C_C (C_B _ (C_D) (C_F _ _)) (C_D) (C_A (C_F _ _)) -> 148 
  C_C (C_B _ (C_D) (C_F _ _)) (C_E) (C_A (C_F _ _)) -> 149 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_D) _) (C_A (C_F _ _)) -> 150 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_E) _) (C_A (C_F _ _)) -> 151 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 152 
  C_C (C_B _ (C_D) (C_F _ _)) (C_D) (C_B _ _ _) -> 153 
  C_C (C_B _ (C_D) (C_F _ _)) (C_E) (C_B _ _ _) -> 154 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_D) _) (C_B _ _ _) -> 155 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_E) _) (C_B _ _ _) -> 156 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_F _ _) _) (C_B _ _ _) -> 157 
  C_C (C_B _ (C_D) (C_F _ _)) (C_D) (C_C _ _ _) -> 158 
  C_C (C_B _ (C_D) (C_F _ _)) (C_E) (C_C _ _ _) -> 159 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_D) _) (C_C _ _ _) -> 160 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_E) _) (C_C _ _ _) -> 161 
  C_C (C_B _ (C_D) (C_F _ _)) (C_F (C_F _ _) _) (C_C _ _ _) -> 162 
  C_C (C_B _ (C_E) (C_D)) (C_D) (C_A (C_D)) -> 163 
  C_C (C_B _ (C_E) (C_D)) (C_E) (C_A (C_D)) -> 164 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_D) _) (C_A (C_D)) -> 165 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_E) _) (C_A (C_D)) -> 166 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_F _ _) _) (C_A (C_D)) -> 167 
  C_C (C_B _ (C_E) (C_D)) (C_D) (C_A (C_E)) -> 168 
  C_C (C_B _ (C_E) (C_D)) (C_E) (C_A (C_E)) -> 169 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_D) _) (C_A (C_E)) -> 170 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_E) _) (C_A (C_E)) -> 171 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_F _ _) _) (C_A (C_E)) -> 172 
  C_C (C_B _ (C_E) (C_D)) (C_D) (C_A (C_F _ _)) -> 173 
  C_C (C_B _ (C_E) (C_D)) (C_E) (C_A (C_F _ _)) -> 174 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_D) _) (C_A (C_F _ _)) -> 175 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_E) _) (C_A (C_F _ _)) -> 176 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 177 
  C_C (C_B _ (C_E) (C_D)) (C_D) (C_B _ _ _) -> 178 
  C_C (C_B _ (C_E) (C_D)) (C_E) (C_B _ _ _) -> 179 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_D) _) (C_B _ _ _) -> 180 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_E) _) (C_B _ _ _) -> 181 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_F _ _) _) (C_B _ _ _) -> 182 
  C_C (C_B _ (C_E) (C_D)) (C_D) (C_C _ _ _) -> 183 
  C_C (C_B _ (C_E) (C_D)) (C_E) (C_C _ _ _) -> 184 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_D) _) (C_C _ _ _) -> 185 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_E) _) (C_C _ _ _) -> 186 
  C_C (C_B _ (C_E) (C_D)) (C_F (C_F _ _) _) (C_C _ _ _) -> 187 
  C_C (C_B _ (C_E) (C_E)) (C_D) (C_A (C_D)) -> 188 
  C_C (C_B _ (C_E) (C_E)) (C_E) (C_A (C_D)) -> 189 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_D) _) (C_A (C_D)) -> 190 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_E) _) (C_A (C_D)) -> 191 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_F _ _) _) (C_A (C_D)) -> 192 
  C_C (C_B _ (C_E) (C_E)) (C_D) (C_A (C_E)) -> 193 
  C_C (C_B _ (C_E) (C_E)) (C_E) (C_A (C_E)) -> 194 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_D) _) (C_A (C_E)) -> 195 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_E) _) (C_A (C_E)) -> 196 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_F _ _) _) (C_A (C_E)) -> 197 
  C_C (C_B _ (C_E) (C_E)) (C_D) (C_A (C_F _ _)) -> 198 
  C_C (C_B _ (C_E) (C_E)) (C_E) (C_A (C_F _ _)) -> 199 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_D) _) (C_A (C_F _ _)) -> 200 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_E) _) (C_A (C_F _ _)) -> 201 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 202 
  C_C (C_B _ (C_E) (C_E)) (C_D) (C_B _ _ _) -> 203 
  C_C (C_B _ (C_E) (C_E)) (C_E) (C_B _ _ _) -> 204 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_D) _) (C_B _ _ _) -> 205 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_E) _) (C_B _ _ _) -> 206 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_F _ _) _) (C_B _ _ _) -> 207 
  C_C (C_B _ (C_E) (C_E)) (C_D) (C_C _ _ _) -> 208 
  C_C (C_B _ (C_E) (C_E)) (C_E) (C_C _ _ _) -> 209 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_D) _) (C_C _ _ _) -> 210 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_E) _) (C_C _ _ _) -> 211 
  C_C (C_B _ (C_E) (C_E)) (C_F (C_F _ _) _) (C_C _ _ _) -> 212 
  C_C (C_B _ (C_E) (C_F _ _)) (C_D) (C_A (C_D)) -> 213 
  C_C (C_B _ (C_E) (C_F _ _)) (C_E) (C_A (C_D)) -> 214 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_D) _) (C_A (C_D)) -> 215 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_E) _) (C_A (C_D)) -> 216 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_F _ _) _) (C_A (C_D)) -> 217 
  C_C (C_B _ (C_E) (C_F _ _)) (C_D) (C_A (C_E)) -> 218 
  C_C (C_B _ (C_E) (C_F _ _)) (C_E) (C_A (C_E)) -> 219 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_D) _) (C_A (C_E)) -> 220 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_E) _) (C_A (C_E)) -> 221 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_F _ _) _) (C_A (C_E)) -> 222 
  C_C (C_B _ (C_E) (C_F _ _)) (C_D) (C_A (C_F _ _)) -> 223 
  C_C (C_B _ (C_E) (C_F _ _)) (C_E) (C_A (C_F _ _)) -> 224 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_D) _) (C_A (C_F _ _)) -> 225 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_E) _) (C_A (C_F _ _)) -> 226 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 227 
  C_C (C_B _ (C_E) (C_F _ _)) (C_D) (C_B _ _ _) -> 228 
  C_C (C_B _ (C_E) (C_F _ _)) (C_E) (C_B _ _ _) -> 229 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_D) _) (C_B _ _ _) -> 230 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_E) _) (C_B _ _ _) -> 231 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_F _ _) _) (C_B _ _ _) -> 232 
  C_C (C_B _ (C_E) (C_F _ _)) (C_D) (C_C _ _ _) -> 233 
  C_C (C_B _ (C_E) (C_F _ _)) (C_E) (C_C _ _ _) -> 234 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_D) _) (C_C _ _ _) -> 235 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_E) _) (C_C _ _ _) -> 236 
  C_C (C_B _ (C_E) (C_F _ _)) (C_F (C_F _ _) _) (C_C _ _ _) -> 237 
  C_C (C_B _ (C_F _ _) (C_D)) (C_D) (C_A (C_D)) -> 238 
  C_C (C_B _ (C_F _ _) (C_D)) (C_E) (C_A (C_D)) -> 239 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_D) _) (C_A (C_D)) -> 240 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_E) _) (C_A (C_D)) -> 241 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_F _ _) _) (C_A (C_D)) -> 242 
  C_C (C_B _ (C_F _ _) (C_D)) (C_D) (C_A (C_E)) -> 243 
  C_C (C_B _ (C_F _ _) (C_D)) (C_E) (C_A (C_E)) -> 244 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_D) _) (C_A (C_E)) -> 245 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_E) _) (C_A (C_E)) -> 246 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_F _ _) _) (C_A (C_E)) -> 247 
  C_C (C_B _ (C_F _ _) (C_D)) (C_D) (C_A (C_F _ _)) -> 248 
  C_C (C_B _ (C_F _ _) (C_D)) (C_E) (C_A (C_F _ _)) -> 249 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_D) _) (C_A (C_F _ _)) -> 250 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_E) _) (C_A (C_F _ _)) -> 251 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 252 
  C_C (C_B _ (C_F _ _) (C_D)) (C_D) (C_B _ _ _) -> 253 
  C_C (C_B _ (C_F _ _) (C_D)) (C_E) (C_B _ _ _) -> 254 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_D) _) (C_B _ _ _) -> 255 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_E) _) (C_B _ _ _) -> 256 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_F _ _) _) (C_B _ _ _) -> 257 
  C_C (C_B _ (C_F _ _) (C_D)) (C_D) (C_C _ _ _) -> 258 
  C_C (C_B _ (C_F _ _) (C_D)) (C_E) (C_C _ _ _) -> 259 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_D) _) (C_C _ _ _) -> 260 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_E) _) (C_C _ _ _) -> 261 
  C_C (C_B _ (C_F _ _) (C_D)) (C_F (C_F _ _) _) (C_C _ _ _) -> 262 
  C_C (C_B _ (C_F _ _) (C_E)) (C_D) (C_A (C_D)) -> 263 
  C_C (C_B _ (C_F _ _) (C_E)) (C_E) (C_A (C_D)) -> 264 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_D) _) (C_A (C_D)) -> 265 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_E) _) (C_A (C_D)) -> 266 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_F _ _) _) (C_A (C_D)) -> 267 
  C_C (C_B _ (C_F _ _) (C_E)) (C_D) (C_A (C_E)) -> 268 
  C_C (C_B _ (C_F _ _) (C_E)) (C_E) (C_A (C_E)) -> 269 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_D) _) (C_A (C_E)) -> 270 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_E) _) (C_A (C_E)) -> 271 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_F _ _) _) (C_A (C_E)) -> 272 
  C_C (C_B _ (C_F _ _) (C_E)) (C_D) (C_A (C_F _ _)) -> 273 
  C_C (C_B _ (C_F _ _) (C_E)) (C_E) (C_A (C_F _ _)) -> 274 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_D) _) (C_A (C_F _ _)) -> 275 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_E) _) (C_A (C_F _ _)) -> 276 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 277 
  C_C (C_B _ (C_F _ _) (C_E)) (C_D) (C_B _ _ _) -> 278 
  C_C (C_B _ (C_F _ _) (C_E)) (C_E) (C_B _ _ _) -> 279 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_D) _) (C_B _ _ _) -> 280 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_E) _) (C_B _ _ _) -> 281 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_F _ _) _) (C_B _ _ _) -> 282 
  C_C (C_B _ (C_F _ _) (C_E)) (C_D) (C_C _ _ _) -> 283 
  C_C (C_B _ (C_F _ _) (C_E)) (C_E) (C_C _ _ _) -> 284 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_D) _) (C_C _ _ _) -> 285 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_E) _) (C_C _ _ _) -> 286 
  C_C (C_B _ (C_F _ _) (C_E)) (C_F (C_F _ _) _) (C_C _ _ _) -> 287 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_D) (C_A (C_D)) -> 288 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_E) (C_A (C_D)) -> 289 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_D) _) (C_A (C_D)) -> 290 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_E) _) (C_A (C_D)) -> 291 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_F _ _) _) (C_A (C_D)) -> 292 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_D) (C_A (C_E)) -> 293 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_E) (C_A (C_E)) -> 294 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_D) _) (C_A (C_E)) -> 295 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_E) _) (C_A (C_E)) -> 296 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_F _ _) _) (C_A (C_E)) -> 297 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_D) (C_A (C_F _ _)) -> 298 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_E) (C_A (C_F _ _)) -> 299 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_D) _) (C_A (C_F _ _)) -> 300 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_E) _) (C_A (C_F _ _)) -> 301 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 302 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_D) (C_B _ _ _) -> 303 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_E) (C_B _ _ _) -> 304 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_D) _) (C_B _ _ _) -> 305 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_E) _) (C_B _ _ _) -> 306 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_F _ _) _) (C_B _ _ _) -> 307 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_D) (C_C _ _ _) -> 308 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_E) (C_C _ _ _) -> 309 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_D) _) (C_C _ _ _) -> 310 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_E) _) (C_C _ _ _) -> 311 
  C_C (C_B _ (C_F _ _) (C_F _ _)) (C_F (C_F _ _) _) (C_C _ _ _) -> 312 
  C_C (C_C (C_A _) _ _) (C_D) (C_A (C_D)) -> 313 
  C_C (C_C (C_A _) _ _) (C_E) (C_A (C_D)) -> 314 
  C_C (C_C (C_A _) _ _) (C_F (C_D) _) (C_A (C_D)) -> 315 
  C_C (C_C (C_A _) _ _) (C_F (C_E) _) (C_A (C_D)) -> 316 
  C_C (C_C (C_A _) _ _) (C_F (C_F _ _) _) (C_A (C_D)) -> 317 
  C_C (C_C (C_A _) _ _) (C_D) (C_A (C_E)) -> 318 
  C_C (C_C (C_A _) _ _) (C_E) (C_A (C_E)) -> 319 
  C_C (C_C (C_A _) _ _) (C_F (C_D) _) (C_A (C_E)) -> 320 
  C_C (C_C (C_A _) _ _) (C_F (C_E) _) (C_A (C_E)) -> 321 
  C_C (C_C (C_A _) _ _) (C_F (C_F _ _) _) (C_A (C_E)) -> 322 
  C_C (C_C (C_A _) _ _) (C_D) (C_A (C_F _ _)) -> 323 
  C_C (C_C (C_A _) _ _) (C_E) (C_A (C_F _ _)) -> 324 
  C_C (C_C (C_A _) _ _) (C_F (C_D) _) (C_A (C_F _ _)) -> 325 
  C_C (C_C (C_A _) _ _) (C_F (C_E) _) (C_A (C_F _ _)) -> 326 
  C_C (C_C (C_A _) _ _) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 327 
  C_C (C_C (C_A _) _ _) (C_D) (C_B _ _ _) -> 328 
  C_C (C_C (C_A _) _ _) (C_E) (C_B _ _ _) -> 329 
  C_C (C_C (C_A _) _ _) (C_F (C_D) _) (C_B _ _ _) -> 330 
  C_C (C_C (C_A _) _ _) (C_F (C_E) _) (C_B _ _ _) -> 331 
  C_C (C_C (C_A _) _ _) (C_F (C_F _ _) _) (C_B _ _ _) -> 332 
  C_C (C_C (C_A _) _ _) (C_D) (C_C _ _ _) -> 333 
  C_C (C_C (C_A _) _ _) (C_E) (C_C _ _ _) -> 334 
  C_C (C_C (C_A _) _ _) (C_F (C_D) _) (C_C _ _ _) -> 335 
  C_C (C_C (C_A _) _ _) (C_F (C_E) _) (C_C _ _ _) -> 336 
  C_C (C_C (C_A _) _ _) (C_F (C_F _ _) _) (C_C _ _ _) -> 337 
  C_C (C_C (C_B _ _ _) _ _) (C_D) (C_A (C_D)) -> 338 
  C_C (C_C (C_B _ _ _) _ _) (C_E) (C_A (C_D)) -> 339 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_D) _) (C_A (C_D)) -> 340 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_E) _) (C_A (C_D)) -> 341 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_F _ _) _) (C_A (C_D)) -> 342 
  C_C (C_C (C_B _ _ _) _ _) (C_D) (C_A (C_E)) -> 343 
  C_C (C_C (C_B _ _ _) _ _) (C_E) (C_A (C_E)) -> 344 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_D) _) (C_A (C_E)) -> 345 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_E) _) (C_A (C_E)) -> 346 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_F _ _) _) (C_A (C_E)) -> 347 
  C_C (C_C (C_B _ _ _) _ _) (C_D) (C_A (C_F _ _)) -> 348 
  C_C (C_C (C_B _ _ _) _ _) (C_E) (C_A (C_F _ _)) -> 349 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_D) _) (C_A (C_F _ _)) -> 350 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_E) _) (C_A (C_F _ _)) -> 351 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 352 
  C_C (C_C (C_B _ _ _) _ _) (C_D) (C_B _ _ _) -> 353 
  C_C (C_C (C_B _ _ _) _ _) (C_E) (C_B _ _ _) -> 354 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_D) _) (C_B _ _ _) -> 355 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_E) _) (C_B _ _ _) -> 356 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_F _ _) _) (C_B _ _ _) -> 357 
  C_C (C_C (C_B _ _ _) _ _) (C_D) (C_C _ _ _) -> 358 
  C_C (C_C (C_B _ _ _) _ _) (C_E) (C_C _ _ _) -> 359 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_D) _) (C_C _ _ _) -> 360 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_E) _) (C_C _ _ _) -> 361 
  C_C (C_C (C_B _ _ _) _ _) (C_F (C_F _ _) _) (C_C _ _ _) -> 362 
  C_C (C_C (C_C _ _ _) _ _) (C_D) (C_A (C_D)) -> 363 
  C_C (C_C (C_C _ _ _) _ _) (C_E) (C_A (C_D)) -> 364 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_D) _) (C_A (C_D)) -> 365 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_E) _) (C_A (C_D)) -> 366 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_F _ _) _) (C_A (C_D)) -> 367 
  C_C (C_C (C_C _ _ _) _ _) (C_D) (C_A (C_E)) -> 368 
  C_C (C_C (C_C _ _ _) _ _) (C_E) (C_A (C_E)) -> 369 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_D) _) (C_A (C_E)) -> 370 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_E) _) (C_A (C_E)) -> 371 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_F _ _) _) (C_A (C_E)) -> 372 
  C_C (C_C (C_C _ _ _) _ _) (C_D) (C_A (C_F _ _)) -> 373 
  C_C (C_C (C_C _ _ _) _ _) (C_E) (C_A (C_F _ _)) -> 374 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_D) _) (C_A (C_F _ _)) -> 375 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_E) _) (C_A (C_F _ _)) -> 376 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_F _ _) _) (C_A (C_F _ _)) -> 377 
  C_C (C_C (C_C _ _ _) _ _) (C_D) (C_B _ _ _) -> 378 
  C_C (C_C (C_C _ _ _) _ _) (C_E) (C_B _ _ _) -> 379 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_D) _) (C_B _ _ _) -> 380 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_E) _) (C_B _ _ _) -> 381 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_F _ _) _) (C_B _ _ _) -> 382 
  C_C (C_C (C_C _ _ _) _ _) (C_D) (C_C _ _ _) -> 383 
  C_C (C_C (C_C _ _ _) _ _) (C_E) (C_C _ _ _) -> 384 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_D) _) (C_C _ _ _) -> 385 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_E) _) (C_C _ _ _) -> 386 
  C_C (C_C (C_C _ _ _) _ _) (C_F (C_F _ _) _) (C_C _ _ _) -> 387 

--  This is not matched: C_C (C_A (C_F _ _)) (C_D) (C_A (C_D))