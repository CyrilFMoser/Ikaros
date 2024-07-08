module Program_29 () where 

 main = print $ show v_b
data B_A a b = C_A B_B | C_B B_B a | C_C ((B_B,B_B)) a | C_D | C_E
data B_B = C_F Int B_B | C_G (B_A B_B B_B) B_B | C_H Char Int | C_I B_B Int

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
  C_G (C_A _) (C_F _ _) -> 1 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_F _ _) -> 2 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_F _ _) -> 3 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_F _ _) -> 4 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_F _ _) -> 5 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_F _ _) -> 6 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_F _ _) -> 7 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_F _ _) -> 8 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_F _ _) -> 9 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_F _ _) -> 10 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_F _ _) -> 11 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_F _ _) -> 12 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_F _ _) -> 13 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_F _ _) -> 14 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_F _ _) -> 15 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_F _ _) -> 16 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_F _ _) -> 17 
  C_G (C_C _ _) (C_F _ _) -> 18 
  C_G (C_D) (C_F _ _) -> 19 
  C_G (C_E) (C_F _ _) -> 20 
  C_G (C_A _) (C_G (C_A _) (C_F _ _)) -> 21 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_A _) (C_F _ _)) -> 22 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_A _) (C_F _ _)) -> 23 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_A _) (C_F _ _)) -> 24 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_A _) (C_F _ _)) -> 25 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_A _) (C_F _ _)) -> 26 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_A _) (C_F _ _)) -> 27 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_A _) (C_F _ _)) -> 28 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_A _) (C_F _ _)) -> 29 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_A _) (C_F _ _)) -> 30 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_A _) (C_F _ _)) -> 31 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_A _) (C_F _ _)) -> 32 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_A _) (C_F _ _)) -> 33 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_A _) (C_F _ _)) -> 34 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_A _) (C_F _ _)) -> 35 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_A _) (C_F _ _)) -> 36 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_A _) (C_F _ _)) -> 37 
  C_G (C_C _ _) (C_G (C_A _) (C_F _ _)) -> 38 
  C_G (C_D) (C_G (C_A _) (C_F _ _)) -> 39 
  C_G (C_E) (C_G (C_A _) (C_F _ _)) -> 40 
  C_G (C_A _) (C_G (C_B _ _) (C_F _ _)) -> 41 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_B _ _) (C_F _ _)) -> 42 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_B _ _) (C_F _ _)) -> 43 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_B _ _) (C_F _ _)) -> 44 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_B _ _) (C_F _ _)) -> 45 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_B _ _) (C_F _ _)) -> 46 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_B _ _) (C_F _ _)) -> 47 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_B _ _) (C_F _ _)) -> 48 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_B _ _) (C_F _ _)) -> 49 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_B _ _) (C_F _ _)) -> 50 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_B _ _) (C_F _ _)) -> 51 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_B _ _) (C_F _ _)) -> 52 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_B _ _) (C_F _ _)) -> 53 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_B _ _) (C_F _ _)) -> 54 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_B _ _) (C_F _ _)) -> 55 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_B _ _) (C_F _ _)) -> 56 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_B _ _) (C_F _ _)) -> 57 
  C_G (C_C _ _) (C_G (C_B _ _) (C_F _ _)) -> 58 
  C_G (C_D) (C_G (C_B _ _) (C_F _ _)) -> 59 
  C_G (C_E) (C_G (C_B _ _) (C_F _ _)) -> 60 
  C_G (C_A _) (C_G (C_C _ _) (C_F _ _)) -> 61 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_C _ _) (C_F _ _)) -> 62 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_C _ _) (C_F _ _)) -> 63 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_C _ _) (C_F _ _)) -> 64 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_C _ _) (C_F _ _)) -> 65 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_C _ _) (C_F _ _)) -> 66 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_C _ _) (C_F _ _)) -> 67 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_C _ _) (C_F _ _)) -> 68 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_C _ _) (C_F _ _)) -> 69 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_C _ _) (C_F _ _)) -> 70 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_C _ _) (C_F _ _)) -> 71 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_C _ _) (C_F _ _)) -> 72 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_C _ _) (C_F _ _)) -> 73 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_C _ _) (C_F _ _)) -> 74 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_C _ _) (C_F _ _)) -> 75 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_C _ _) (C_F _ _)) -> 76 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_C _ _) (C_F _ _)) -> 77 
  C_G (C_C _ _) (C_G (C_C _ _) (C_F _ _)) -> 78 
  C_G (C_D) (C_G (C_C _ _) (C_F _ _)) -> 79 
  C_G (C_E) (C_G (C_C _ _) (C_F _ _)) -> 80 
  C_G (C_A _) (C_G (C_D) (C_F _ _)) -> 81 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_D) (C_F _ _)) -> 82 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_D) (C_F _ _)) -> 83 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_D) (C_F _ _)) -> 84 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_D) (C_F _ _)) -> 85 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_D) (C_F _ _)) -> 86 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_D) (C_F _ _)) -> 87 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_D) (C_F _ _)) -> 88 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_D) (C_F _ _)) -> 89 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_D) (C_F _ _)) -> 90 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_D) (C_F _ _)) -> 91 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_D) (C_F _ _)) -> 92 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_D) (C_F _ _)) -> 93 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_D) (C_F _ _)) -> 94 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_D) (C_F _ _)) -> 95 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_D) (C_F _ _)) -> 96 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_D) (C_F _ _)) -> 97 
  C_G (C_C _ _) (C_G (C_D) (C_F _ _)) -> 98 
  C_G (C_D) (C_G (C_D) (C_F _ _)) -> 99 
  C_G (C_E) (C_G (C_D) (C_F _ _)) -> 100 
  C_G (C_A _) (C_G (C_E) (C_F _ _)) -> 101 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_E) (C_F _ _)) -> 102 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_E) (C_F _ _)) -> 103 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_E) (C_F _ _)) -> 104 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_E) (C_F _ _)) -> 105 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_E) (C_F _ _)) -> 106 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_E) (C_F _ _)) -> 107 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_E) (C_F _ _)) -> 108 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_E) (C_F _ _)) -> 109 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_E) (C_F _ _)) -> 110 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_E) (C_F _ _)) -> 111 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_E) (C_F _ _)) -> 112 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_E) (C_F _ _)) -> 113 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_E) (C_F _ _)) -> 114 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_E) (C_F _ _)) -> 115 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_E) (C_F _ _)) -> 116 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_E) (C_F _ _)) -> 117 
  C_G (C_C _ _) (C_G (C_E) (C_F _ _)) -> 118 
  C_G (C_D) (C_G (C_E) (C_F _ _)) -> 119 
  C_G (C_E) (C_G (C_E) (C_F _ _)) -> 120 
  C_G (C_A _) (C_G (C_A _) (C_G _ _)) -> 121 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_A _) (C_G _ _)) -> 122 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_A _) (C_G _ _)) -> 123 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_A _) (C_G _ _)) -> 124 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_A _) (C_G _ _)) -> 125 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_A _) (C_G _ _)) -> 126 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_A _) (C_G _ _)) -> 127 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_A _) (C_G _ _)) -> 128 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_A _) (C_G _ _)) -> 129 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_A _) (C_G _ _)) -> 130 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_A _) (C_G _ _)) -> 131 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_A _) (C_G _ _)) -> 132 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_A _) (C_G _ _)) -> 133 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_A _) (C_G _ _)) -> 134 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_A _) (C_G _ _)) -> 135 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_A _) (C_G _ _)) -> 136 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_A _) (C_G _ _)) -> 137 
  C_G (C_C _ _) (C_G (C_A _) (C_G _ _)) -> 138 
  C_G (C_D) (C_G (C_A _) (C_G _ _)) -> 139 
  C_G (C_E) (C_G (C_A _) (C_G _ _)) -> 140 
  C_G (C_A _) (C_G (C_B _ _) (C_G _ _)) -> 141 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_B _ _) (C_G _ _)) -> 142 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_B _ _) (C_G _ _)) -> 143 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_B _ _) (C_G _ _)) -> 144 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_B _ _) (C_G _ _)) -> 145 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_B _ _) (C_G _ _)) -> 146 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_B _ _) (C_G _ _)) -> 147 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_B _ _) (C_G _ _)) -> 148 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_B _ _) (C_G _ _)) -> 149 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_B _ _) (C_G _ _)) -> 150 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_B _ _) (C_G _ _)) -> 151 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_B _ _) (C_G _ _)) -> 152 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_B _ _) (C_G _ _)) -> 153 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_B _ _) (C_G _ _)) -> 154 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_B _ _) (C_G _ _)) -> 155 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_B _ _) (C_G _ _)) -> 156 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_B _ _) (C_G _ _)) -> 157 
  C_G (C_C _ _) (C_G (C_B _ _) (C_G _ _)) -> 158 
  C_G (C_D) (C_G (C_B _ _) (C_G _ _)) -> 159 
  C_G (C_E) (C_G (C_B _ _) (C_G _ _)) -> 160 
  C_G (C_A _) (C_G (C_C _ _) (C_G _ _)) -> 161 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_C _ _) (C_G _ _)) -> 162 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_C _ _) (C_G _ _)) -> 163 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_C _ _) (C_G _ _)) -> 164 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_C _ _) (C_G _ _)) -> 165 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_C _ _) (C_G _ _)) -> 166 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_C _ _) (C_G _ _)) -> 167 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_C _ _) (C_G _ _)) -> 168 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_C _ _) (C_G _ _)) -> 169 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_C _ _) (C_G _ _)) -> 170 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_C _ _) (C_G _ _)) -> 171 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_C _ _) (C_G _ _)) -> 172 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_C _ _) (C_G _ _)) -> 173 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_C _ _) (C_G _ _)) -> 174 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_C _ _) (C_G _ _)) -> 175 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_C _ _) (C_G _ _)) -> 176 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_C _ _) (C_G _ _)) -> 177 
  C_G (C_C _ _) (C_G (C_C _ _) (C_G _ _)) -> 178 
  C_G (C_D) (C_G (C_C _ _) (C_G _ _)) -> 179 
  C_G (C_E) (C_G (C_C _ _) (C_G _ _)) -> 180 
  C_G (C_A _) (C_G (C_D) (C_G _ _)) -> 181 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_D) (C_G _ _)) -> 182 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_D) (C_G _ _)) -> 183 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_D) (C_G _ _)) -> 184 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_D) (C_G _ _)) -> 185 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_D) (C_G _ _)) -> 186 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_D) (C_G _ _)) -> 187 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_D) (C_G _ _)) -> 188 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_D) (C_G _ _)) -> 189 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_D) (C_G _ _)) -> 190 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_D) (C_G _ _)) -> 191 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_D) (C_G _ _)) -> 192 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_D) (C_G _ _)) -> 193 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_D) (C_G _ _)) -> 194 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_D) (C_G _ _)) -> 195 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_D) (C_G _ _)) -> 196 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_D) (C_G _ _)) -> 197 
  C_G (C_C _ _) (C_G (C_D) (C_G _ _)) -> 198 
  C_G (C_D) (C_G (C_D) (C_G _ _)) -> 199 
  C_G (C_E) (C_G (C_D) (C_G _ _)) -> 200 
  C_G (C_A _) (C_G (C_E) (C_G _ _)) -> 201 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_E) (C_G _ _)) -> 202 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_E) (C_G _ _)) -> 203 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_E) (C_G _ _)) -> 204 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_E) (C_G _ _)) -> 205 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_E) (C_G _ _)) -> 206 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_E) (C_G _ _)) -> 207 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_E) (C_G _ _)) -> 208 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_E) (C_G _ _)) -> 209 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_E) (C_G _ _)) -> 210 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_E) (C_G _ _)) -> 211 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_E) (C_G _ _)) -> 212 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_E) (C_G _ _)) -> 213 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_E) (C_G _ _)) -> 214 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_E) (C_G _ _)) -> 215 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_E) (C_G _ _)) -> 216 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_E) (C_G _ _)) -> 217 
  C_G (C_C _ _) (C_G (C_E) (C_G _ _)) -> 218 
  C_G (C_D) (C_G (C_E) (C_G _ _)) -> 219 
  C_G (C_E) (C_G (C_E) (C_G _ _)) -> 220 
  C_G (C_A _) (C_G (C_A _) (C_H _ _)) -> 221 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_A _) (C_H _ _)) -> 222 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_A _) (C_H _ _)) -> 223 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_A _) (C_H _ _)) -> 224 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_A _) (C_H _ _)) -> 225 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_A _) (C_H _ _)) -> 226 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_A _) (C_H _ _)) -> 227 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_A _) (C_H _ _)) -> 228 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_A _) (C_H _ _)) -> 229 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_A _) (C_H _ _)) -> 230 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_A _) (C_H _ _)) -> 231 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_A _) (C_H _ _)) -> 232 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_A _) (C_H _ _)) -> 233 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_A _) (C_H _ _)) -> 234 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_A _) (C_H _ _)) -> 235 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_A _) (C_H _ _)) -> 236 
  C_G (C_C _ _) (C_G (C_A _) (C_H _ _)) -> 237 
  C_G (C_D) (C_G (C_A _) (C_H _ _)) -> 238 
  C_G (C_E) (C_G (C_A _) (C_H _ _)) -> 239 
  C_G (C_A _) (C_G (C_B _ _) (C_H _ _)) -> 240 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_B _ _) (C_H _ _)) -> 241 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_B _ _) (C_H _ _)) -> 242 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_B _ _) (C_H _ _)) -> 243 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_B _ _) (C_H _ _)) -> 244 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_B _ _) (C_H _ _)) -> 245 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_B _ _) (C_H _ _)) -> 246 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_B _ _) (C_H _ _)) -> 247 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_B _ _) (C_H _ _)) -> 248 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_B _ _) (C_H _ _)) -> 249 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_B _ _) (C_H _ _)) -> 250 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_B _ _) (C_H _ _)) -> 251 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_B _ _) (C_H _ _)) -> 252 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_B _ _) (C_H _ _)) -> 253 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_B _ _) (C_H _ _)) -> 254 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_B _ _) (C_H _ _)) -> 255 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_B _ _) (C_H _ _)) -> 256 
  C_G (C_C _ _) (C_G (C_B _ _) (C_H _ _)) -> 257 
  C_G (C_D) (C_G (C_B _ _) (C_H _ _)) -> 258 
  C_G (C_E) (C_G (C_B _ _) (C_H _ _)) -> 259 
  C_G (C_A _) (C_G (C_C _ _) (C_H _ _)) -> 260 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_C _ _) (C_H _ _)) -> 261 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_C _ _) (C_H _ _)) -> 262 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_C _ _) (C_H _ _)) -> 263 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_C _ _) (C_H _ _)) -> 264 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_C _ _) (C_H _ _)) -> 265 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_C _ _) (C_H _ _)) -> 266 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_C _ _) (C_H _ _)) -> 267 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_C _ _) (C_H _ _)) -> 268 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_C _ _) (C_H _ _)) -> 269 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_C _ _) (C_H _ _)) -> 270 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_C _ _) (C_H _ _)) -> 271 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_C _ _) (C_H _ _)) -> 272 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_C _ _) (C_H _ _)) -> 273 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_C _ _) (C_H _ _)) -> 274 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_C _ _) (C_H _ _)) -> 275 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_C _ _) (C_H _ _)) -> 276 
  C_G (C_C _ _) (C_G (C_C _ _) (C_H _ _)) -> 277 
  C_G (C_D) (C_G (C_C _ _) (C_H _ _)) -> 278 
  C_G (C_E) (C_G (C_C _ _) (C_H _ _)) -> 279 
  C_G (C_A _) (C_G (C_D) (C_H _ _)) -> 280 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_D) (C_H _ _)) -> 281 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_D) (C_H _ _)) -> 282 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_D) (C_H _ _)) -> 283 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_D) (C_H _ _)) -> 284 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_D) (C_H _ _)) -> 285 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_D) (C_H _ _)) -> 286 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_D) (C_H _ _)) -> 287 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_D) (C_H _ _)) -> 288 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_D) (C_H _ _)) -> 289 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_D) (C_H _ _)) -> 290 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_D) (C_H _ _)) -> 291 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_D) (C_H _ _)) -> 292 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_D) (C_H _ _)) -> 293 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_D) (C_H _ _)) -> 294 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_D) (C_H _ _)) -> 295 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_D) (C_H _ _)) -> 296 
  C_G (C_C _ _) (C_G (C_D) (C_H _ _)) -> 297 
  C_G (C_D) (C_G (C_D) (C_H _ _)) -> 298 
  C_G (C_E) (C_G (C_D) (C_H _ _)) -> 299 
  C_G (C_A _) (C_G (C_E) (C_H _ _)) -> 300 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_E) (C_H _ _)) -> 301 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_E) (C_H _ _)) -> 302 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_E) (C_H _ _)) -> 303 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_E) (C_H _ _)) -> 304 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_E) (C_H _ _)) -> 305 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_E) (C_H _ _)) -> 306 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_E) (C_H _ _)) -> 307 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_E) (C_H _ _)) -> 308 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_E) (C_H _ _)) -> 309 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_E) (C_H _ _)) -> 310 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_E) (C_H _ _)) -> 311 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_E) (C_H _ _)) -> 312 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_E) (C_H _ _)) -> 313 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_E) (C_H _ _)) -> 314 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_E) (C_H _ _)) -> 315 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_E) (C_H _ _)) -> 316 
  C_G (C_C _ _) (C_G (C_E) (C_H _ _)) -> 317 
  C_G (C_D) (C_G (C_E) (C_H _ _)) -> 318 
  C_G (C_E) (C_G (C_E) (C_H _ _)) -> 319 
  C_G (C_A _) (C_G (C_A _) (C_I _ _)) -> 320 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_A _) (C_I _ _)) -> 321 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_A _) (C_I _ _)) -> 322 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_A _) (C_I _ _)) -> 323 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_A _) (C_I _ _)) -> 324 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_A _) (C_I _ _)) -> 325 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_A _) (C_I _ _)) -> 326 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_A _) (C_I _ _)) -> 327 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_A _) (C_I _ _)) -> 328 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_A _) (C_I _ _)) -> 329 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_A _) (C_I _ _)) -> 330 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_A _) (C_I _ _)) -> 331 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_A _) (C_I _ _)) -> 332 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_A _) (C_I _ _)) -> 333 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_A _) (C_I _ _)) -> 334 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_A _) (C_I _ _)) -> 335 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_A _) (C_I _ _)) -> 336 
  C_G (C_C _ _) (C_G (C_A _) (C_I _ _)) -> 337 
  C_G (C_D) (C_G (C_A _) (C_I _ _)) -> 338 
  C_G (C_E) (C_G (C_A _) (C_I _ _)) -> 339 
  C_G (C_A _) (C_G (C_B _ _) (C_I _ _)) -> 340 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_B _ _) (C_I _ _)) -> 341 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_B _ _) (C_I _ _)) -> 342 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_B _ _) (C_I _ _)) -> 343 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_B _ _) (C_I _ _)) -> 344 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_B _ _) (C_I _ _)) -> 345 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_B _ _) (C_I _ _)) -> 346 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_B _ _) (C_I _ _)) -> 347 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_B _ _) (C_I _ _)) -> 348 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_B _ _) (C_I _ _)) -> 349 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_B _ _) (C_I _ _)) -> 350 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_B _ _) (C_I _ _)) -> 351 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_B _ _) (C_I _ _)) -> 352 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_B _ _) (C_I _ _)) -> 353 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_B _ _) (C_I _ _)) -> 354 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_B _ _) (C_I _ _)) -> 355 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_B _ _) (C_I _ _)) -> 356 
  C_G (C_C _ _) (C_G (C_B _ _) (C_I _ _)) -> 357 
  C_G (C_D) (C_G (C_B _ _) (C_I _ _)) -> 358 
  C_G (C_E) (C_G (C_B _ _) (C_I _ _)) -> 359 
  C_G (C_A _) (C_G (C_C _ _) (C_I _ _)) -> 360 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_C _ _) (C_I _ _)) -> 361 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_C _ _) (C_I _ _)) -> 362 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_C _ _) (C_I _ _)) -> 363 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_C _ _) (C_I _ _)) -> 364 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_C _ _) (C_I _ _)) -> 365 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_C _ _) (C_I _ _)) -> 366 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_C _ _) (C_I _ _)) -> 367 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_C _ _) (C_I _ _)) -> 368 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_C _ _) (C_I _ _)) -> 369 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_C _ _) (C_I _ _)) -> 370 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_C _ _) (C_I _ _)) -> 371 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_C _ _) (C_I _ _)) -> 372 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_C _ _) (C_I _ _)) -> 373 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_C _ _) (C_I _ _)) -> 374 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_C _ _) (C_I _ _)) -> 375 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_C _ _) (C_I _ _)) -> 376 
  C_G (C_C _ _) (C_G (C_C _ _) (C_I _ _)) -> 377 
  C_G (C_D) (C_G (C_C _ _) (C_I _ _)) -> 378 
  C_G (C_E) (C_G (C_C _ _) (C_I _ _)) -> 379 
  C_G (C_A _) (C_G (C_D) (C_I _ _)) -> 380 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_D) (C_I _ _)) -> 381 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_D) (C_I _ _)) -> 382 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_D) (C_I _ _)) -> 383 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_D) (C_I _ _)) -> 384 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_D) (C_I _ _)) -> 385 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_D) (C_I _ _)) -> 386 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_D) (C_I _ _)) -> 387 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_D) (C_I _ _)) -> 388 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_D) (C_I _ _)) -> 389 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_D) (C_I _ _)) -> 390 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_D) (C_I _ _)) -> 391 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_D) (C_I _ _)) -> 392 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_D) (C_I _ _)) -> 393 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_D) (C_I _ _)) -> 394 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_D) (C_I _ _)) -> 395 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_D) (C_I _ _)) -> 396 
  C_G (C_C _ _) (C_G (C_D) (C_I _ _)) -> 397 
  C_G (C_D) (C_G (C_D) (C_I _ _)) -> 398 
  C_G (C_E) (C_G (C_D) (C_I _ _)) -> 399 
  C_G (C_A _) (C_G (C_E) (C_I _ _)) -> 400 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_G (C_E) (C_I _ _)) -> 401 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_G (C_E) (C_I _ _)) -> 402 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_G (C_E) (C_I _ _)) -> 403 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_G (C_E) (C_I _ _)) -> 404 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_G (C_E) (C_I _ _)) -> 405 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_G (C_E) (C_I _ _)) -> 406 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_G (C_E) (C_I _ _)) -> 407 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_G (C_E) (C_I _ _)) -> 408 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_G (C_E) (C_I _ _)) -> 409 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_G (C_E) (C_I _ _)) -> 410 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_G (C_E) (C_I _ _)) -> 411 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_G (C_E) (C_I _ _)) -> 412 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_G (C_E) (C_I _ _)) -> 413 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_G (C_E) (C_I _ _)) -> 414 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_G (C_E) (C_I _ _)) -> 415 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_G (C_E) (C_I _ _)) -> 416 
  C_G (C_C _ _) (C_G (C_E) (C_I _ _)) -> 417 
  C_G (C_D) (C_G (C_E) (C_I _ _)) -> 418 
  C_G (C_E) (C_G (C_E) (C_I _ _)) -> 419 
  C_G (C_A _) (C_H _ _) -> 420 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_H _ _) -> 421 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_H _ _) -> 422 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_H _ _) -> 423 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_H _ _) -> 424 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_H _ _) -> 425 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_H _ _) -> 426 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_H _ _) -> 427 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_H _ _) -> 428 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_H _ _) -> 429 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_H _ _) -> 430 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_H _ _) -> 431 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_H _ _) -> 432 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_H _ _) -> 433 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_H _ _) -> 434 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_H _ _) -> 435 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_H _ _) -> 436 
  C_G (C_C _ _) (C_H _ _) -> 437 
  C_G (C_D) (C_H _ _) -> 438 
  C_G (C_E) (C_H _ _) -> 439 
  C_G (C_A _) (C_I _ _) -> 440 
  C_G (C_B (C_F _ _) (C_F _ _)) (C_I _ _) -> 441 
  C_G (C_B (C_G _ _) (C_F _ _)) (C_I _ _) -> 442 
  C_G (C_B (C_H _ _) (C_F _ _)) (C_I _ _) -> 443 
  C_G (C_B (C_I _ _) (C_F _ _)) (C_I _ _) -> 444 
  C_G (C_B (C_F _ _) (C_G _ _)) (C_I _ _) -> 445 
  C_G (C_B (C_G _ _) (C_G _ _)) (C_I _ _) -> 446 
  C_G (C_B (C_H _ _) (C_G _ _)) (C_I _ _) -> 447 
  C_G (C_B (C_I _ _) (C_G _ _)) (C_I _ _) -> 448 
  C_G (C_B (C_F _ _) (C_H _ _)) (C_I _ _) -> 449 
  C_G (C_B (C_G _ _) (C_H _ _)) (C_I _ _) -> 450 
  C_G (C_B (C_H _ _) (C_H _ _)) (C_I _ _) -> 451 
  C_G (C_B (C_I _ _) (C_H _ _)) (C_I _ _) -> 452 
  C_G (C_B (C_F _ _) (C_I _ _)) (C_I _ _) -> 453 
  C_G (C_B (C_G _ _) (C_I _ _)) (C_I _ _) -> 454 
  C_G (C_B (C_H _ _) (C_I _ _)) (C_I _ _) -> 455 
  C_G (C_B (C_I _ _) (C_I _ _)) (C_I _ _) -> 456 
  C_G (C_C _ _) (C_I _ _) -> 457 
  C_G (C_D) (C_I _ _) -> 458 
  C_G (C_E) (C_I _ _) -> 459 
  C_H _ _ -> 460 
  C_I (C_F _ (C_F _ _)) _ -> 461 
  C_I (C_F _ (C_G _ _)) _ -> 462 
  C_I (C_F _ (C_H _ _)) _ -> 463 
  C_I (C_F _ (C_I _ _)) _ -> 464 
  C_I (C_G _ _) _ -> 465 
  C_I (C_H _ _) _ -> 466 
  C_I (C_I _ _) _ -> 467 
