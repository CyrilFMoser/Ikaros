module Program_2 () where 

main = print $ show v_b
data B_A = C_A B_B ((B_A,B_A)) | C_B ((B_B,(Bool,Char))) | C_C ((Bool,B_B))
data B_B = C_D B_A | C_E Char | C_F Bool | C_G B_B B_A

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_A _ ((C_A _ _,C_C _))) -> 0 
  C_D (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 1 
  C_D (C_A (C_G _ _) ((C_C _,C_A _ _))) -> 2 
  C_D (C_A (C_G _ _) ((C_B _,C_B _))) -> 3 
  C_D (C_A (C_F _) ((C_B _,C_A _ _))) -> 4 
  C_D (C_A (C_D _) ((C_B _,C_B _))) -> 5 
  C_D (C_C ((_,C_D _))) -> 6 
  C_D (C_A (C_E _) ((C_B _,C_B _))) -> 7 
  C_D (C_A (C_D _) ((C_B _,C_A _ _))) -> 8 
  C_D (C_B ((C_D _,(_,_)))) -> 9 
  C_D (C_A _ ((C_B _,C_C _))) -> 10 
  C_D (C_B ((C_E _,(_,_)))) -> 11 
  C_D (C_A (C_F _) ((C_C _,C_B _))) -> 12 
  C_D (C_A _ ((C_B _,C_A _ _))) -> 13 
  C_D (C_A (C_E _) ((C_B _,C_A _ _))) -> 14 
  C_D (C_A (C_F _) ((C_B _,C_B _))) -> 15 
  C_D (C_A (C_D _) ((C_C _,C_A _ _))) -> 16 
  C_D (C_A _ ((C_C _,C_C _))) -> 17 
  C_D (C_A (C_D _) ((C_B _,C_C _))) -> 18 
  C_D (C_C ((_,C_F _))) -> 19 
  C_D (C_A (C_D _) ((C_C _,C_B _))) -> 20 
  C_D (C_A (C_G _ _) ((C_B _,C_C _))) -> 21 
  C_D (C_A _ _) -> 22 
  C_D (C_A (C_E _) _) -> 23 
  C_G (C_G (C_F _) (C_C _)) (C_B ((C_F _,(_,_)))) -> 24 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_G _ _) ((C_C _,C_B _))) -> 25 
  C_G (C_E _) (C_A (C_E _) ((C_C _,C_A _ _))) -> 26 
  C_G (C_G (C_G _ _) (C_B _)) (C_A _ ((C_C _,C_C _))) -> 27 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_D _) ((C_B _,C_C _))) -> 28 
  C_G (C_G (C_D _) (C_B _)) (C_A _ ((C_B _,C_B _))) -> 29 
  C_G (C_G (C_G _ _) _) (C_A _ ((C_A _ _,C_B _))) -> 30 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_D _) ((C_A _ _,C_B _))) -> 31 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_D _) _) -> 32 
  C_G (C_D (C_B _)) (C_A _ ((C_B _,C_C _))) -> 33 
  C_G (C_G _ (C_A _ _)) (C_A (C_D _) ((C_C _,C_A _ _))) -> 34 
  C_G (C_G (C_D _) _) (C_A (C_G _ _) ((C_A _ _,C_B _))) -> 35 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_F _) ((C_C _,C_B _))) -> 36 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 37 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_E _) ((C_B _,C_A _ _))) -> 38 
  C_G (C_G _ (C_B _)) (C_A (C_G _ _) ((C_C _,C_C _))) -> 39 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_G _ _) ((C_C _,C_C _))) -> 40 
  C_G (C_G _ _) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 41 
  C_G (C_D (C_B _)) (C_A (C_D _) ((C_B _,C_B _))) -> 42 
  C_G (C_G (C_E _) _) (C_A (C_F _) ((C_B _,C_C _))) -> 43 
  C_G (C_G (C_E _) _) (C_A (C_D _) ((C_C _,C_A _ _))) -> 44 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_D _) ((C_C _,C_C _))) -> 45 
  C_G (C_D (C_B _)) (C_A (C_D _) ((C_B _,C_C _))) -> 46 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_D _) ((C_C _,C_A _ _))) -> 47 
  C_G (C_E _) (C_A (C_D _) ((C_B _,C_B _))) -> 48 
  C_G (C_D (C_B _)) (C_A (C_D _) ((C_A _ _,C_B _))) -> 49 
  C_G (C_G (C_E _) (C_A _ _)) (C_A _ _) -> 50 
  C_G (C_G (C_E _) _) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 51 
  C_G (C_G (C_D _) (C_C _)) (C_B ((C_G _ _,(_,_)))) -> 52 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_E _) ((C_C _,C_A _ _))) -> 53 
  C_G (C_G _ _) (C_A (C_G _ _) ((C_A _ _,C_A _ _))) -> 54 
  C_G (C_G (C_F _) _) (C_A _ ((C_B _,C_B _))) -> 55 
  C_G (C_G (C_F _) (C_A _ _)) (C_A _ ((C_C _,C_A _ _))) -> 56 
  C_G (C_G _ (C_C _)) (C_A (C_D _) ((C_C _,C_C _))) -> 57 
  C_G (C_D _) (C_A (C_G _ _) ((C_C _,C_C _))) -> 58 
  C_G (C_G (C_G _ _) _) (C_A (C_D _) ((C_B _,C_A _ _))) -> 59 
  C_G (C_D (C_A _ _)) (C_A (C_G _ _) ((C_C _,C_C _))) -> 60 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_G _ _) ((C_C _,C_A _ _))) -> 61 
  C_G (C_G (C_E _) _) (C_A (C_G _ _) ((C_C _,C_C _))) -> 62 
  C_G (C_D (C_A _ _)) (C_A _ ((C_C _,C_C _))) -> 63 
  C_G (C_G (C_E _) (C_B _)) (C_A _ ((C_B _,C_A _ _))) -> 64 
  C_G (C_G _ (C_C _)) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 65 
  C_G (C_G _ (C_A _ _)) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 66 
  C_G (C_F _) (C_A (C_G _ _) ((C_C _,C_B _))) -> 67 
  C_G (C_G (C_F _) _) (C_A _ ((C_C _,C_C _))) -> 68 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_G _ _) ((C_A _ _,C_B _))) -> 69 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_E _) _) -> 70 
  C_G (C_G _ (C_C _)) (C_A (C_G _ _) ((C_A _ _,C_B _))) -> 71 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_F _) ((C_B _,C_B _))) -> 72 
  C_G (C_D _) (C_A (C_E _) ((C_B _,C_C _))) -> 73 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 74 
  C_G (C_G (C_E _) (C_A _ _)) (C_C ((_,C_F _))) -> 75 
  C_G (C_G (C_F _) (C_B _)) (C_C ((_,C_G _ _))) -> 76 
  C_G (C_G (C_D _) (C_A _ _)) (C_B ((C_G _ _,(_,_)))) -> 77 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_G _ _) ((C_C _,C_B _))) -> 78 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_D _) ((C_B _,C_B _))) -> 79 
  C_G (C_D (C_A _ _)) (C_A (C_D _) ((C_C _,C_B _))) -> 80 
  C_G (C_G _ (C_A _ _)) (C_A _ ((C_B _,C_B _))) -> 81 
  C_G (C_G (C_G _ _) _) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 82 
  C_G (C_D _) (C_A (C_G _ _) _) -> 83 
  C_G (C_E _) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 84 
  C_G (C_G _ (C_C _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 85 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 86 
  C_G (C_G _ _) (C_B ((C_D _,(_,_)))) -> 87 
  C_G (C_D (C_C _)) (C_B ((C_G _ _,(_,_)))) -> 88 
  C_G (C_G (C_F _) _) (C_A (C_F _) ((C_B _,C_C _))) -> 89 
  C_G (C_G _ (C_B _)) (C_A _ ((C_A _ _,C_A _ _))) -> 90 
  C_G (C_F _) (C_B _) -> 91 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_D _) ((C_A _ _,C_B _))) -> 92 
  C_G (C_G (C_G _ _) _) (C_C ((_,C_E _))) -> 93 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_F _) _) -> 94 
  C_G (C_D (C_C _)) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 95 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_G _ _) ((C_C _,C_C _))) -> 96 
  C_G (C_G _ _) (C_A (C_F _) _) -> 97 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_E _) ((C_A _ _,C_C _))) -> 98 
  C_G (C_E _) (C_A (C_E _) ((C_A _ _,C_B _))) -> 99 
  C_G (C_G _ (C_C _)) (C_A (C_E _) ((C_C _,C_A _ _))) -> 100 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 101 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 102 
  C_G (C_G _ (C_C _)) (C_A (C_F _) ((C_A _ _,C_B _))) -> 103 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_D _) _) -> 104 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_G _ _) ((C_C _,C_B _))) -> 105 
  C_G (C_G (C_D _) _) (C_A (C_E _) ((C_C _,C_C _))) -> 106 
  C_G (C_D (C_A _ _)) (C_A _ ((C_B _,C_C _))) -> 107 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_G _ _) _) -> 108 
  C_G (C_G (C_D _) (C_A _ _)) (C_A _ _) -> 109 
  C_G (C_G (C_F _) (C_A _ _)) (C_A _ ((C_C _,C_C _))) -> 110 
  C_G (C_G (C_E _) (C_B _)) (C_B ((C_G _ _,(_,_)))) -> 111 
  C_G (C_G _ _) (C_A (C_D _) ((C_C _,C_B _))) -> 112 
  C_G (C_G (C_E _) _) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 113 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_F _) ((C_A _ _,C_C _))) -> 114 
  C_G (C_G (C_F _) _) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 115 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_E _) ((C_B _,C_A _ _))) -> 116 
  C_G (C_D (C_A _ _)) (C_A (C_D _) _) -> 117 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_G _ _) ((C_B _,C_A _ _))) -> 118 
  C_G (C_D (C_C _)) (C_A (C_E _) ((C_C _,C_B _))) -> 119 
  C_G (C_D _) (C_B ((C_G _ _,(_,_)))) -> 120 
  C_G (C_G _ _) (C_A (C_G _ _) ((C_B _,C_A _ _))) -> 121 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_F _) ((C_A _ _,C_C _))) -> 122 
  C_G (C_E _) (C_A _ ((C_B _,C_B _))) -> 123 
  C_G (C_G (C_E _) _) (C_A _ ((C_A _ _,C_B _))) -> 124 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_D _) ((C_B _,C_A _ _))) -> 125 
  C_G (C_G _ (C_B _)) (C_A (C_E _) _) -> 126 
  C_G (C_F _) (C_A (C_E _) ((C_A _ _,C_B _))) -> 127 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A _ ((C_A _ _,C_B _))) -> 128 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_D _) ((C_B _,C_A _ _))) -> 129 
  C_G (C_G _ (C_B _)) (C_A (C_F _) ((C_C _,C_B _))) -> 130 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_D _) ((C_B _,C_C _))) -> 131 
  C_G (C_G (C_D _) (C_C _)) (C_A _ _) -> 132 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_G _ _) ((C_A _ _,C_A _ _))) -> 133 
  C_G (C_E _) (C_B _) -> 134 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_F _) ((C_B _,C_B _))) -> 135 
  C_G (C_G (C_E _) (C_B _)) _ -> 136 
  C_G (C_G _ (C_B _)) (C_A (C_F _) ((C_A _ _,C_B _))) -> 137 
  C_G (C_G _ (C_A _ _)) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 138 
  C_G (C_G (C_D _) (C_B _)) (C_C ((_,C_E _))) -> 139 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_G _ _) ((C_B _,C_C _))) -> 140 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 141 
  C_G (C_G (C_F _) _) (C_A (C_D _) ((C_B _,C_B _))) -> 142 
  C_G (C_F _) (C_B ((C_E _,(_,_)))) -> 143 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_G _ _) _) -> 144 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_E _) ((C_A _ _,C_B _))) -> 145 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 146 
  C_G (C_G (C_F _) _) (C_A (C_E _) ((C_B _,C_C _))) -> 147 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_E _) _) -> 148 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_E _) ((C_C _,C_B _))) -> 149 
  C_G (C_G (C_F _) (C_B _)) (C_A _ ((C_C _,C_A _ _))) -> 150 
  C_G (C_G (C_G _ _) _) (C_A _ ((C_B _,C_A _ _))) -> 151 
  C_G (C_G _ _) (C_A (C_F _) ((C_C _,C_C _))) -> 152 
  C_G (C_G (C_F _) (C_B _)) (C_C _) -> 153 
  C_G (C_D (C_B _)) (C_A (C_G _ _) ((C_C _,C_B _))) -> 154 
  C_G (C_G (C_F _) (C_B _)) (C_B _) -> 155 
  C_G (C_F _) (C_A _ ((C_A _ _,C_B _))) -> 156 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_G _ _) ((C_B _,C_C _))) -> 157 
  C_G (C_G (C_D _) (C_A _ _)) (C_A _ ((C_B _,C_A _ _))) -> 158 
  C_G (C_G (C_F _) (C_A _ _)) (C_A _ ((C_B _,C_B _))) -> 159 
  C_G _ (C_A _ ((C_A _ _,C_B _))) -> 160 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 161 
  C_G (C_G _ (C_B _)) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 162 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_D _) ((C_C _,C_B _))) -> 163 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 164 
  C_G (C_G (C_D _) (C_B _)) (C_B ((C_G _ _,(_,_)))) -> 165 
  C_G (C_E _) (C_A (C_G _ _) ((C_A _ _,C_B _))) -> 166 
  C_G (C_D (C_B _)) (C_A (C_F _) ((C_B _,C_A _ _))) -> 167 
  C_G (C_G (C_E _) (C_B _)) (C_A _ ((C_C _,C_C _))) -> 168 
  C_G (C_G (C_F _) (C_B _)) (C_B ((C_E _,(_,_)))) -> 169 
  C_G (C_G (C_G _ _) (C_C _)) (C_A _ ((C_A _ _,C_B _))) -> 170 
  C_G (C_D (C_C _)) (C_A (C_E _) ((C_C _,C_C _))) -> 171 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_F _) ((C_A _ _,C_B _))) -> 172 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_C ((_,C_D _))) -> 173 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_E _) ((C_C _,C_C _))) -> 174 
  C_G (C_G (C_F _) _) (C_A (C_E _) ((C_C _,C_C _))) -> 175 
  C_G (C_G (C_E _) _) (C_A (C_F _) ((C_B _,C_A _ _))) -> 176 
  C_G (C_G (C_G _ _) _) (C_B ((C_E _,(_,_)))) -> 177 
  C_G (C_G _ (C_B _)) (C_A (C_E _) ((C_C _,C_B _))) -> 178 
  C_G (C_D (C_C _)) (C_A (C_D _) ((C_B _,C_A _ _))) -> 179 
  C_G (C_G _ (C_C _)) (C_B ((C_G _ _,(_,_)))) -> 180 
  C_G (C_G _ (C_C _)) _ -> 181 
  C_G (C_F _) (C_A (C_E _) ((C_C _,C_B _))) -> 182 
  C_G (C_G (C_D _) _) (C_A (C_D _) ((C_C _,C_C _))) -> 183 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 184 
  C_G (C_G _ _) (C_A (C_E _) ((C_B _,C_C _))) -> 185 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A _ ((C_C _,C_C _))) -> 186 
  C_G (C_G (C_D _) _) (C_A _ ((C_C _,C_B _))) -> 187 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_D _) _) -> 188 
  C_G (C_F _) (C_A (C_G _ _) ((C_B _,C_B _))) -> 189 
  C_G _ (C_C ((_,C_G _ _))) -> 190 
  C_G (C_G (C_F _) _) (C_A (C_D _) ((C_B _,C_C _))) -> 191 
  C_G (C_G _ (C_B _)) (C_A _ ((C_B _,C_C _))) -> 192 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_B _) -> 193 
  C_G (C_D (C_A _ _)) (C_A (C_D _) ((C_C _,C_A _ _))) -> 194 
  C_G (C_G (C_E _) (C_A _ _)) (C_B ((C_F _,(_,_)))) -> 195 
  C_G (C_E _) (C_A (C_D _) ((C_C _,C_A _ _))) -> 196 
  C_G (C_D (C_A _ _)) (C_C ((_,C_D _))) -> 197 
  C_G (C_D _) (C_A (C_D _) ((C_A _ _,C_C _))) -> 198 
  C_G (C_D (C_B _)) (C_A (C_F _) ((C_B _,C_C _))) -> 199 
  C_G (C_G (C_E _) _) (C_B ((C_E _,(_,_)))) -> 200 
  C_G _ (C_A (C_E _) _) -> 201 
  C_G (C_G (C_G _ _) (C_B _)) (C_A _ _) -> 202 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 203 
  C_G (C_G _ (C_A _ _)) (C_A (C_E _) ((C_C _,C_A _ _))) -> 204 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_G _ _) ((C_A _ _,C_A _ _))) -> 205 
  C_G (C_D _) (C_A (C_G _ _) ((C_C _,C_B _))) -> 206 
  C_G (C_G (C_D _) (C_C _)) (C_C _) -> 207 
  C_G (C_G (C_D _) (C_A _ _)) (C_A _ ((C_A _ _,C_A _ _))) -> 208 
  C_G (C_G (C_G _ _) (C_B _)) (C_B ((C_D _,(_,_)))) -> 209 
  C_G (C_D (C_A _ _)) (C_A (C_F _) ((C_B _,C_B _))) -> 210 
  C_G (C_G (C_F _) (C_A _ _)) (C_A _ _) -> 211 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_G _ _) ((C_B _,C_B _))) -> 212 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_F _) ((C_A _ _,C_B _))) -> 213 
  C_G (C_G (C_F _) (C_A _ _)) (C_C ((_,C_E _))) -> 214 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_D _) ((C_B _,C_A _ _))) -> 215 
  C_G (C_D _) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 216 
  C_G (C_G _ (C_C _)) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 217 
  C_G (C_G (C_E _) (C_A _ _)) (C_A _ ((C_C _,C_B _))) -> 218 
  C_G (C_G _ (C_A _ _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 219 
  C_G (C_G (C_D _) _) (C_A (C_G _ _) ((C_B _,C_A _ _))) -> 220 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_F _) ((C_C _,C_B _))) -> 221 
  C_G (C_G (C_G _ _) _) (C_A (C_G _ _) ((C_A _ _,C_B _))) -> 222 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_G _ _) _) -> 223 
  C_G (C_G _ _) (C_B ((C_G _ _,(_,_)))) -> 224 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_D _) ((C_C _,C_A _ _))) -> 225 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_G _ _) ((C_C _,C_B _))) -> 226 
  C_G (C_G (C_F _) _) (C_A _ ((C_A _ _,C_C _))) -> 227 
  C_G (C_G _ (C_A _ _)) (C_B ((C_D _,(_,_)))) -> 228 
  C_G (C_G (C_D _) (C_C _)) (C_B ((C_F _,(_,_)))) -> 229 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_F _) ((C_C _,C_A _ _))) -> 230 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 231 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_F _) ((C_A _ _,C_B _))) -> 232 
  C_G (C_D _) (C_A (C_E _) ((C_B _,C_B _))) -> 233 
  C_G (C_G _ (C_C _)) (C_A (C_D _) ((C_B _,C_A _ _))) -> 234 
  C_G (C_G (C_E _) _) (C_B ((C_F _,(_,_)))) -> 235 
  C_G (C_G (C_D _) _) (C_C _) -> 236 
  C_G (C_G (C_E _) _) (C_A (C_D _) _) -> 237 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_E _) ((C_C _,C_C _))) -> 238 
  C_G (C_G (C_E _) _) (C_A (C_G _ _) _) -> 239 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_E _) ((C_C _,C_C _))) -> 240 
  C_G (C_G (C_G _ _) (C_B _)) (C_A _ ((C_B _,C_B _))) -> 241 
  C_G (C_G (C_D _) (C_B _)) (C_B ((C_E _,(_,_)))) -> 242 
  C_G (C_G (C_F _) _) (C_A (C_D _) ((C_A _ _,C_B _))) -> 243 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 244 
  C_G (C_G (C_F _) (C_C _)) (C_A _ ((C_B _,C_C _))) -> 245 
  C_G (C_G _ (C_B _)) (C_C _) -> 246 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_F _) _) -> 247 
  C_G (C_E _) (C_A _ ((C_B _,C_C _))) -> 248 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_D _) ((C_B _,C_C _))) -> 249 
  C_G (C_G _ (C_C _)) (C_A (C_F _) ((C_C _,C_A _ _))) -> 250 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 251 
  C_G (C_G (C_E _) (C_C _)) (C_A _ ((C_C _,C_B _))) -> 252 
  C_G (C_G (C_E _) _) (C_A (C_E _) ((C_B _,C_C _))) -> 253 
  C_G _ (C_A (C_F _) ((C_C _,C_A _ _))) -> 254 
  C_G (C_E _) (C_A (C_F _) ((C_B _,C_C _))) -> 255 
  C_G (C_G (C_D _) (C_B _)) (C_A _ ((C_A _ _,C_C _))) -> 256 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 257 
  C_G (C_G (C_G _ _) _) (C_A _ ((C_C _,C_A _ _))) -> 258 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_G _ _) ((C_A _ _,C_A _ _))) -> 259 
  C_G (C_G _ _) (C_A (C_D _) ((C_A _ _,C_B _))) -> 260 
  C_G (C_G (C_D _) (C_A _ _)) (C_B _) -> 261 
  C_G _ (C_A (C_F _) ((C_B _,C_B _))) -> 262 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_D _) ((C_B _,C_A _ _))) -> 263 
  C_G (C_G (C_F _) _) (C_A (C_G _ _) ((C_A _ _,C_A _ _))) -> 264 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_E _) ((C_C _,C_B _))) -> 265 
  C_G (C_G (C_F _) _) (C_A (C_E _) ((C_A _ _,C_C _))) -> 266 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_E _) ((C_A _ _,C_B _))) -> 267 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_G _ _) ((C_C _,C_B _))) -> 268 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_F _) _) -> 269 
  C_G (C_G (C_D _) _) (C_A (C_E _) ((C_C _,C_A _ _))) -> 270 
  C_G (C_G (C_G _ _) (C_C _)) (C_B ((C_E _,(_,_)))) -> 271 
  C_G (C_G (C_E _) _) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 272 
  C_G (C_G (C_D _) _) (C_A (C_E _) ((C_B _,C_B _))) -> 273 
  C_G (C_D (C_A _ _)) (C_C _) -> 274 
  C_G (C_G (C_E _) _) (C_A (C_E _) ((C_C _,C_C _))) -> 275 
  C_G (C_D (C_B _)) (C_A (C_G _ _) ((C_B _,C_C _))) -> 276 
  C_G (C_G (C_E _) _) (C_A (C_D _) ((C_C _,C_C _))) -> 277 
  C_G (C_D _) (C_A _ ((C_A _ _,C_C _))) -> 278 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A _ _) -> 279 
  C_G (C_F _) (C_A _ ((C_B _,C_B _))) -> 280 
  C_G (C_G _ (C_B _)) (C_A (C_F _) ((C_C _,C_C _))) -> 281 
  C_G (C_D _) (C_A (C_D _) ((C_A _ _,C_B _))) -> 282 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 283 
  C_G (C_G (C_F _) (C_A _ _)) (C_B ((C_F _,(_,_)))) -> 284 
  C_G (C_G (C_F _) (C_B _)) (C_A _ ((C_A _ _,C_A _ _))) -> 285 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_F _) ((C_B _,C_A _ _))) -> 286 
  C_G (C_E _) (C_A (C_F _) ((C_A _ _,C_C _))) -> 287 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_E _) ((C_C _,C_A _ _))) -> 288 
  C_G (C_D _) (C_A (C_G _ _) ((C_B _,C_B _))) -> 289 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_F _) ((C_C _,C_A _ _))) -> 290 
  C_G (C_G (C_F _) (C_C _)) (C_C ((_,C_D _))) -> 291 
  C_G (C_G (C_D _) (C_C _)) (C_A _ ((C_B _,C_B _))) -> 292 
  C_G _ (C_B ((C_E _,(_,_)))) -> 293 
  C_G (C_G _ (C_A _ _)) (C_A (C_F _) _) -> 294 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 295 
  C_G _ (C_B ((C_G _ _,(_,_)))) -> 296 
  C_G (C_G _ (C_A _ _)) (C_C ((_,C_G _ _))) -> 297 
  C_G (C_D (C_B _)) (C_B _) -> 298 
  C_G (C_G (C_G _ _) _) (C_A (C_F _) ((C_B _,C_C _))) -> 299 
  C_G (C_D (C_C _)) (C_A _ ((C_B _,C_B _))) -> 300 
  C_G (C_G (C_D _) _) (C_A _ ((C_B _,C_A _ _))) -> 301 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_F _) ((C_A _ _,C_C _))) -> 302 
  C_G (C_G (C_F _) _) (C_A (C_G _ _) ((C_A _ _,C_B _))) -> 303 
  C_G (C_G _ (C_A _ _)) (C_A (C_D _) ((C_C _,C_B _))) -> 304 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_E _) ((C_C _,C_A _ _))) -> 305 
  C_G (C_G (C_F _) (C_C _)) (C_A _ ((C_B _,C_A _ _))) -> 306 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_G _ _) ((C_C _,C_A _ _))) -> 307 
  C_G (C_G _ (C_A _ _)) (C_A (C_E _) ((C_A _ _,C_B _))) -> 308 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_F _) ((C_C _,C_C _))) -> 309 
  C_G (C_D _) (C_B ((C_F _,(_,_)))) -> 310 
  C_G (C_E _) (C_A _ ((C_C _,C_C _))) -> 311 
  C_G (C_D (C_C _)) (C_A (C_G _ _) _) -> 312 
  C_G (C_G _ _) (C_C ((_,C_F _))) -> 313 
  C_G (C_G _ (C_C _)) (C_B ((C_E _,(_,_)))) -> 314 
  C_G (C_G (C_D _) _) (C_A (C_D _) ((C_A _ _,C_C _))) -> 315 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_E _) ((C_C _,C_B _))) -> 316 
  C_G (C_G _ _) (C_A _ ((C_B _,C_C _))) -> 317 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_E _) ((C_C _,C_A _ _))) -> 318 
  C_G (C_G (C_D _) (C_B _)) (C_A _ ((C_C _,C_A _ _))) -> 319 
  C_G (C_G _ (C_B _)) (C_C ((_,C_D _))) -> 320 
  C_G (C_D (C_C _)) (C_A (C_G _ _) ((C_B _,C_A _ _))) -> 321 
  C_G (C_G _ _) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 322 
  C_G (C_F _) (C_C ((_,C_F _))) -> 323 
  C_G (C_D (C_C _)) (C_B _) -> 324 
  C_G (C_G (C_D _) _) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 325 
  C_G (C_G _ (C_B _)) (C_A _ ((C_A _ _,C_C _))) -> 326 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_D _) ((C_B _,C_C _))) -> 327 
  C_G (C_D (C_C _)) (C_C ((_,C_D _))) -> 328 
  C_G (C_D _) (C_C ((_,C_D _))) -> 329 
  C_G (C_D (C_B _)) (C_A (C_D _) ((C_C _,C_B _))) -> 330 
  C_G (C_G (C_F _) (C_B _)) (C_C ((_,C_E _))) -> 331 
  C_G (C_G (C_F _) (C_C _)) (C_A _ ((C_A _ _,C_C _))) -> 332 
  C_G (C_G _ (C_C _)) (C_B ((C_F _,(_,_)))) -> 333 
  C_G _ (C_A (C_G _ _) ((C_C _,C_A _ _))) -> 334 
  C_G (C_G (C_F _) (C_C _)) (C_C _) -> 335 
  C_G (C_G _ (C_C _)) (C_A (C_F _) ((C_C _,C_C _))) -> 336 
  C_G (C_D _) (C_A (C_F _) ((C_B _,C_B _))) -> 337 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_F _) ((C_B _,C_B _))) -> 338 
  C_G (C_F _) (C_A (C_D _) ((C_A _ _,C_B _))) -> 339 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_D _) ((C_C _,C_B _))) -> 340 
  C_G (C_G (C_D _) _) (C_A (C_E _) _) -> 341 
  C_G (C_G (C_F _) (C_C _)) (C_A _ _) -> 342 
  C_G (C_D (C_B _)) (C_A (C_F _) ((C_C _,C_B _))) -> 343 
  C_G _ (C_A _ ((C_B _,C_A _ _))) -> 344 
  C_G (C_G _ (C_A _ _)) (C_A (C_G _ _) ((C_B _,C_C _))) -> 345 
  C_G (C_G _ (C_A _ _)) (C_A (C_E _) ((C_C _,C_C _))) -> 346 
  C_G (C_D (C_A _ _)) (C_A _ _) -> 347 
  C_G (C_G (C_D _) (C_C _)) (C_A _ ((C_A _ _,C_C _))) -> 348 
  C_G (C_E _) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 349 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_F _) ((C_B _,C_C _))) -> 350 
  C_G (C_G (C_F _) _) (C_B _) -> 351 
  C_G (C_G _ (C_C _)) (C_C ((_,C_G _ _))) -> 352 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_G _ _) ((C_B _,C_C _))) -> 353 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_F _) ((C_C _,C_C _))) -> 354 
  C_G (C_G (C_E _) _) (C_A (C_G _ _) ((C_A _ _,C_A _ _))) -> 355 
  C_G (C_G _ (C_B _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 356 
  C_G (C_G (C_G _ _) (C_C _)) (C_A _ ((C_B _,C_A _ _))) -> 357 
  C_G (C_E _) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 358 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_G _ _) ((C_C _,C_C _))) -> 359 
  C_G (C_D (C_C _)) (C_A (C_G _ _) ((C_A _ _,C_B _))) -> 360 
  C_G (C_D (C_A _ _)) (C_A (C_D _) ((C_B _,C_B _))) -> 361 
  C_G (C_G (C_D _) (C_A _ _)) (C_A _ ((C_B _,C_C _))) -> 362 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 363 
  C_G (C_D _) (C_B ((C_D _,(_,_)))) -> 364 
  C_G (C_D (C_B _)) (C_A _ ((C_C _,C_B _))) -> 365 
  C_G (C_G (C_E _) (C_B _)) (C_A _ ((C_A _ _,C_C _))) -> 366 
  C_G (C_G (C_F _) _) (C_C ((_,C_D _))) -> 367 
  C_G _ (C_A _ ((C_A _ _,C_C _))) -> 368 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A _ ((C_B _,C_C _))) -> 369 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_D _) _) -> 370 
  C_G (C_E _) (C_C _) -> 371 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_D _) ((C_C _,C_A _ _))) -> 372 
  C_G (C_G (C_E _) (C_C _)) (C_C ((_,C_G _ _))) -> 373 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_G _ _) ((C_C _,C_A _ _))) -> 374 
  C_G (C_D (C_C _)) (C_A _ ((C_A _ _,C_A _ _))) -> 375 
  C_G (C_G (C_G _ _) (C_B _)) (C_C ((_,C_F _))) -> 376 
  C_G (C_F _) (C_A (C_F _) ((C_B _,C_C _))) -> 377 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_F _) ((C_B _,C_A _ _))) -> 378 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_G _ _) ((C_B _,C_C _))) -> 379 
  C_G (C_E _) (C_A (C_D _) _) -> 380 
  C_G (C_F _) (C_A (C_D _) _) -> 381 
  C_G (C_G _ (C_B _)) (C_A (C_F _) ((C_A _ _,C_C _))) -> 382 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_E _) ((C_B _,C_A _ _))) -> 383 
  C_G (C_D _) (C_B ((C_E _,(_,_)))) -> 384 
  C_G (C_G (C_F _) _) (C_A _ ((C_B _,C_A _ _))) -> 385 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 386 
  C_G (C_G (C_F _) (C_B _)) (C_B ((C_D _,(_,_)))) -> 387 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_G _ _) ((C_B _,C_B _))) -> 388 
  C_G (C_D _) (C_A (C_E _) _) -> 389 
  C_G (C_D (C_C _)) (C_B ((C_F _,(_,_)))) -> 390 
  C_G (C_F _) (C_A (C_E _) ((C_B _,C_C _))) -> 391 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_F _) ((C_A _ _,C_C _))) -> 392 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_F _) ((C_C _,C_C _))) -> 393 
  C_G (C_G (C_D _) _) (C_A (C_D _) ((C_C _,C_A _ _))) -> 394 
  C_G (C_G (C_G _ _) _) (C_C ((_,C_D _))) -> 395 
  C_G (C_G (C_E _) _) (C_C ((_,C_E _))) -> 396 
  C_G (C_G (C_D _) _) (C_A (C_E _) ((C_A _ _,C_C _))) -> 397 
  C_G (C_G (C_F _) (C_B _)) (C_A _ ((C_C _,C_B _))) -> 398 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_E _) ((C_A _ _,C_C _))) -> 399 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_F _) ((C_A _ _,C_B _))) -> 400 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_E _) _) -> 401 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_E _) ((C_B _,C_B _))) -> 402 
  C_G (C_G (C_E _) (C_B _)) (C_A _ ((C_C _,C_A _ _))) -> 403 
  C_G (C_E _) (C_A (C_E _) ((C_A _ _,C_C _))) -> 404 
  C_G (C_F _) (C_A (C_D _) ((C_B _,C_A _ _))) -> 405 
  C_G (C_G _ (C_A _ _)) (C_A (C_F _) ((C_C _,C_A _ _))) -> 406 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_F _) ((C_A _ _,C_C _))) -> 407 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_F _) _) -> 408 
  C_G (C_G (C_D _) (C_B _)) (C_A _ _) -> 409 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_F _) ((C_B _,C_C _))) -> 410 
  C_G (C_E _) (C_A (C_F _) _) -> 411 
  C_G (C_G (C_E _) _) (C_A (C_F _) ((C_C _,C_B _))) -> 412 
  C_G (C_G _ (C_A _ _)) (C_A (C_D _) _) -> 413 
  C_G (C_G (C_F _) _) (C_B ((C_F _,(_,_)))) -> 414 
  C_G (C_G (C_E _) (C_B _)) (C_C ((_,C_D _))) -> 415 
  C_G (C_G _ (C_C _)) (C_A (C_E _) _) -> 416 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_F _) ((C_B _,C_C _))) -> 417 
  C_G (C_G (C_F _) (C_A _ _)) (C_C ((_,C_F _))) -> 418 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_D _) ((C_B _,C_B _))) -> 419 
  C_G (C_G (C_D _) (C_B _)) (C_C _) -> 420 
  C_G (C_E _) (C_A (C_E _) ((C_B _,C_C _))) -> 421 
  C_G (C_D (C_C _)) (C_A _ ((C_C _,C_B _))) -> 422 
  C_G (C_G _ (C_C _)) (C_A (C_F _) ((C_B _,C_A _ _))) -> 423 
  C_G (C_D _) (C_A (C_E _) ((C_A _ _,C_B _))) -> 424 
  C_G (C_G (C_E _) (C_B _)) (C_A _ ((C_A _ _,C_A _ _))) -> 425 
  C_G (C_G _ _) (C_A _ ((C_C _,C_B _))) -> 426 
  C_G (C_D (C_A _ _)) (C_A _ ((C_B _,C_B _))) -> 427 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_E _) ((C_A _ _,C_C _))) -> 428 
  C_G (C_G (C_F _) _) (C_A (C_G _ _) _) -> 429 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_F _) ((C_A _ _,C_B _))) -> 430 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 431 
  C_G (C_D (C_C _)) (C_A _ ((C_B _,C_C _))) -> 432 
  C_G (C_G (C_G _ _) (C_B _)) (C_A _ ((C_A _ _,C_C _))) -> 433 
  C_G (C_G (C_G _ _) _) (C_A (C_F _) ((C_A _ _,C_B _))) -> 434 
  C_G (C_G (C_D _) _) (C_C ((_,C_G _ _))) -> 435 
  C_G _ (C_A (C_E _) ((C_A _ _,C_C _))) -> 436 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 437 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 438 
  C_G (C_G (C_E _) _) (C_A (C_D _) ((C_B _,C_C _))) -> 439 
  C_G (C_G (C_E _) (C_A _ _)) (C_B _) -> 440 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_E _) _) -> 441 
  C_G (C_G (C_F _) _) (C_A (C_D _) ((C_C _,C_C _))) -> 442 
  C_G (C_E _) (C_A _ ((C_B _,C_A _ _))) -> 443 
  C_G (C_G (C_F _) (C_B _)) (C_B ((C_G _ _,(_,_)))) -> 444 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_E _) ((C_A _ _,C_C _))) -> 445 
  C_G _ (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 446 
  C_G (C_G (C_E _) (C_C _)) (C_A _ ((C_A _ _,C_C _))) -> 447 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_F _) ((C_B _,C_A _ _))) -> 448 
  C_G (C_G _ (C_C _)) (C_A _ ((C_B _,C_A _ _))) -> 449 
  C_G (C_E _) (C_B ((C_F _,(_,_)))) -> 450 
  C_G (C_G (C_G _ _) (C_C _)) (C_A _ ((C_C _,C_A _ _))) -> 451 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_D _) ((C_A _ _,C_B _))) -> 452 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_G _ _) ((C_B _,C_B _))) -> 453 
  C_G (C_G (C_E _) (C_B _)) (C_B ((C_F _,(_,_)))) -> 454 
  C_G (C_D (C_C _)) (C_A (C_F _) ((C_B _,C_A _ _))) -> 455 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_F _) ((C_A _ _,C_C _))) -> 456 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_F _) ((C_C _,C_B _))) -> 457 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_E _) ((C_C _,C_C _))) -> 458 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_G _ _) ((C_C _,C_C _))) -> 459 
  C_G (C_G (C_F _) (C_A _ _)) (C_A _ ((C_C _,C_B _))) -> 460 
  C_G (C_F _) (C_A (C_D _) ((C_B _,C_C _))) -> 461 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_E _) ((C_C _,C_A _ _))) -> 462 
  C_G (C_G (C_G _ _) _) (C_C ((_,C_G _ _))) -> 463 
  C_G (C_G (C_F _) _) (C_A (C_F _) ((C_C _,C_C _))) -> 464 
  C_G (C_D (C_C _)) (C_A (C_F _) ((C_B _,C_B _))) -> 465 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_D _) ((C_C _,C_C _))) -> 466 
  C_G (C_G (C_E _) (C_C _)) (C_A _ ((C_A _ _,C_A _ _))) -> 467 
  C_G (C_G (C_E _) (C_C _)) (C_A _ ((C_C _,C_A _ _))) -> 468 
  C_G (C_G (C_E _) (C_B _)) (C_A _ ((C_B _,C_C _))) -> 469 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 470 
  C_G (C_G (C_F _) (C_C _)) (C_B ((C_E _,(_,_)))) -> 471 
  C_G _ (C_A (C_F _) ((C_A _ _,C_B _))) -> 472 
  C_G (C_G _ (C_C _)) (C_B _) -> 473 
  C_G (C_D (C_B _)) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 474 
  C_G (C_G (C_D _) _) (C_C ((_,C_F _))) -> 475 
  C_G (C_D (C_C _)) (C_A (C_F _) _) -> 476 
  C_G (C_G _ (C_A _ _)) (C_C ((_,C_D _))) -> 477 
  C_G (C_G (C_D _) _) (C_A _ ((C_B _,C_C _))) -> 478 
  C_G (C_D (C_A _ _)) (C_A (C_F _) ((C_C _,C_A _ _))) -> 479 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_E _) ((C_A _ _,C_C _))) -> 480 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_D _) ((C_B _,C_B _))) -> 481 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_D _) ((C_C _,C_B _))) -> 482 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_D _) ((C_A _ _,C_B _))) -> 483 
  C_G (C_G (C_E _) _) (C_A (C_E _) ((C_B _,C_B _))) -> 484 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_F _) ((C_C _,C_A _ _))) -> 485 
  C_G (C_G _ _) (C_A (C_E _) ((C_B _,C_A _ _))) -> 486 
  C_G (C_G _ _) (C_A _ ((C_C _,C_C _))) -> 487 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_G _ _) ((C_C _,C_A _ _))) -> 488 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_E _) ((C_B _,C_B _))) -> 489 
  C_G (C_G _ (C_B _)) (C_A (C_D _) ((C_B _,C_A _ _))) -> 490 
  C_G (C_G (C_E _) (C_C _)) (C_C ((_,C_D _))) -> 491 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_F _) ((C_B _,C_C _))) -> 492 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_E _) ((C_C _,C_B _))) -> 493 
  C_G (C_G (C_G _ _) (C_B _)) (C_A _ ((C_B _,C_C _))) -> 494 
  C_G (C_D (C_C _)) (C_B ((C_E _,(_,_)))) -> 495 
  C_G (C_G (C_G _ _) (C_B _)) _ -> 496 
  C_G (C_G (C_G _ _) (C_B _)) (C_C _) -> 497 
  C_G (C_G _ (C_C _)) (C_A _ ((C_B _,C_B _))) -> 498 
  C_G (C_G _ (C_C _)) (C_C ((_,C_D _))) -> 499 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_F _) _) -> 500 
  C_G (C_G (C_E _) (C_A _ _)) (C_A _ ((C_C _,C_A _ _))) -> 501 
  C_G (C_G (C_E _) _) (C_A (C_E _) ((C_C _,C_B _))) -> 502 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_F _) ((C_A _ _,C_B _))) -> 503 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_E _) ((C_B _,C_C _))) -> 504 
  C_G (C_D (C_C _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 505 
  C_G (C_G (C_F _) _) (C_A (C_F _) ((C_C _,C_B _))) -> 506 
  C_G (C_D _) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 507 
  C_G (C_G (C_D _) (C_B _)) (C_C ((_,C_D _))) -> 508 
  C_G (C_G (C_E _) _) (C_A (C_G _ _) ((C_C _,C_B _))) -> 509 
  C_G (C_G (C_D _) _) (C_A (C_G _ _) ((C_C _,C_C _))) -> 510 
  C_G (C_G (C_E _) _) (C_A (C_D _) ((C_A _ _,C_C _))) -> 511 
  C_G (C_D (C_A _ _)) (C_B _) -> 512 
  C_G (C_G (C_F _) _) (C_A (C_E _) _) -> 513 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_G _ _) _) -> 514 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_D _) ((C_A _ _,C_B _))) -> 515 
  C_G (C_G _ (C_B _)) (C_A (C_G _ _) ((C_B _,C_B _))) -> 516 
  C_G (C_G (C_G _ _) _) (C_A (C_G _ _) ((C_B _,C_C _))) -> 517 
  C_G (C_D (C_A _ _)) (C_B ((C_D _,(_,_)))) -> 518 
  C_G (C_D (C_A _ _)) (C_A _ ((C_A _ _,C_C _))) -> 519 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_E _) ((C_B _,C_C _))) -> 520 
  C_G (C_E _) (C_A (C_F _) ((C_C _,C_C _))) -> 521 
  C_G (C_G (C_F _) _) (C_A _ ((C_C _,C_A _ _))) -> 522 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_F _) ((C_B _,C_A _ _))) -> 523 
  C_G _ (C_A (C_D _) ((C_B _,C_C _))) -> 524 
  C_G (C_G (C_F _) _) (C_C _) -> 525 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_G _ _) ((C_B _,C_A _ _))) -> 526 
  C_G (C_F _) (C_A _ ((C_B _,C_A _ _))) -> 527 
  C_G (C_G _ (C_A _ _)) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 528 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_E _) ((C_C _,C_B _))) -> 529 
  C_G (C_G (C_D _) (C_B _)) (C_C ((_,C_F _))) -> 530 
  C_G (C_D (C_A _ _)) _ -> 531 
  C_G (C_G (C_E _) _) (C_A (C_F _) _) -> 532 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_D _) ((C_B _,C_C _))) -> 533 
  C_G (C_G _ (C_A _ _)) (C_A (C_D _) ((C_B _,C_A _ _))) -> 534 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_F _) ((C_A _ _,C_C _))) -> 535 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_D _) ((C_A _ _,C_B _))) -> 536 
  C_G (C_E _) (C_B ((C_E _,(_,_)))) -> 537 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_E _) ((C_C _,C_C _))) -> 538 
  C_G (C_G _ (C_A _ _)) (C_A (C_G _ _) ((C_C _,C_C _))) -> 539 
  C_G (C_D (C_A _ _)) (C_A (C_F _) ((C_C _,C_B _))) -> 540 
  C_G (C_G _ (C_A _ _)) (C_A _ _) -> 541 
  C_G (C_G (C_F _) _) (C_A (C_E _) ((C_B _,C_B _))) -> 542 
  C_G (C_D _) (C_A _ ((C_A _ _,C_A _ _))) -> 543 
  C_G (C_G (C_F _) _) (C_A (C_E _) ((C_B _,C_A _ _))) -> 544 
  C_G _ (C_A (C_G _ _) ((C_B _,C_A _ _))) -> 545 
  C_G (C_G _ _) (C_A (C_G _ _) ((C_B _,C_B _))) -> 546 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_G _ _) _) -> 547 
  C_G _ (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 548 
  C_G (C_E _) (C_A _ ((C_A _ _,C_B _))) -> 549 
  C_G (C_F _) (C_A (C_F _) ((C_C _,C_C _))) -> 550 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 551 
  C_G (C_D _) (C_A _ ((C_B _,C_A _ _))) -> 552 
  C_G (C_D (C_C _)) (C_A _ ((C_C _,C_A _ _))) -> 553 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_E _) ((C_C _,C_B _))) -> 554 
  C_G (C_D _) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 555 
  C_G (C_D _) (C_A _ ((C_C _,C_A _ _))) -> 556 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_D _) ((C_C _,C_A _ _))) -> 557 
  C_G (C_G _ _) (C_A (C_G _ _) ((C_C _,C_B _))) -> 558 
  C_G _ (C_A (C_D _) ((C_B _,C_A _ _))) -> 559 
  C_G (C_G (C_E _) (C_A _ _)) (C_A _ ((C_B _,C_C _))) -> 560 
  C_G (C_E _) _ -> 561 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_E _) ((C_A _ _,C_B _))) -> 562 
  C_G (C_G _ (C_C _)) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 563 
  C_G (C_D (C_A _ _)) (C_A (C_G _ _) _) -> 564 
  C_G (C_D (C_A _ _)) (C_A (C_F _) ((C_A _ _,C_B _))) -> 565 
  C_G (C_G (C_D _) _) (C_A _ ((C_C _,C_A _ _))) -> 566 
  C_G (C_G (C_E _) _) (C_C ((_,C_D _))) -> 567 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_E _) _) -> 568 
  C_G (C_G (C_F _) (C_A _ _)) (C_B ((C_G _ _,(_,_)))) -> 569 
  C_G (C_G _ (C_B _)) (C_B ((C_G _ _,(_,_)))) -> 570 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_F _) ((C_C _,C_B _))) -> 571 
  C_G _ (C_A (C_D _) ((C_A _ _,C_C _))) -> 572 
  C_G (C_F _) (C_A (C_G _ _) ((C_C _,C_A _ _))) -> 573 
  C_G (C_F _) (C_A (C_E _) ((C_A _ _,C_C _))) -> 574 
  C_G (C_G (C_D _) _) (C_A (C_E _) ((C_C _,C_B _))) -> 575 
  C_G (C_G (C_F _) (C_A _ _)) (C_A _ ((C_B _,C_C _))) -> 576 
  C_G (C_D (C_B _)) (C_B ((C_G _ _,(_,_)))) -> 577 
  C_G _ (C_A (C_D _) ((C_C _,C_A _ _))) -> 578 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_F _) ((C_B _,C_B _))) -> 579 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_E _) ((C_A _ _,C_B _))) -> 580 
  C_G (C_G (C_D _) (C_C _)) (C_A _ ((C_A _ _,C_B _))) -> 581 
  C_G (C_G (C_G _ _) _) (C_A (C_D _) ((C_A _ _,C_B _))) -> 582 
  C_G (C_D (C_A _ _)) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 583 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_D _) ((C_B _,C_C _))) -> 584 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_G _ _) ((C_C _,C_A _ _))) -> 585 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_D _) ((C_B _,C_C _))) -> 586 
  C_G (C_G (C_D _) (C_B _)) (C_A _ ((C_C _,C_C _))) -> 587 
  C_G (C_D (C_A _ _)) (C_A (C_G _ _) ((C_B _,C_A _ _))) -> 588 
  C_G (C_F _) (C_A (C_D _) ((C_A _ _,C_C _))) -> 589 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A _ ((C_C _,C_A _ _))) -> 590 
  C_G (C_G (C_E _) (C_C _)) (C_C ((_,C_E _))) -> 591 
  C_G (C_D _) (C_A _ ((C_C _,C_B _))) -> 592 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 593 
  C_G (C_D (C_A _ _)) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 594 
  C_G (C_G (C_D _) _) (C_A (C_D _) ((C_B _,C_C _))) -> 595 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_F _) ((C_A _ _,C_C _))) -> 596 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_E _) ((C_B _,C_C _))) -> 597 
  C_G _ (C_C ((_,C_E _))) -> 598 
  C_G (C_F _) (C_A (C_F _) ((C_C _,C_A _ _))) -> 599 
  C_G (C_G _ (C_A _ _)) (C_B ((C_G _ _,(_,_)))) -> 600 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_F _) ((C_A _ _,C_B _))) -> 601 
  C_G _ (C_A (C_F _) ((C_A _ _,C_C _))) -> 602 
  C_G (C_G _ (C_B _)) (C_A (C_G _ _) ((C_C _,C_B _))) -> 603 
  C_G (C_G (C_F _) _) (C_A _ ((C_A _ _,C_A _ _))) -> 604 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_F _) ((C_B _,C_B _))) -> 605 
  C_G (C_D (C_B _)) (C_A (C_G _ _) ((C_B _,C_B _))) -> 606 
  C_G (C_G (C_D _) _) (C_A (C_E _) ((C_B _,C_C _))) -> 607 
  C_G (C_G (C_E _) (C_A _ _)) (C_C ((_,C_E _))) -> 608 
  C_G (C_G (C_D _) _) (C_A (C_E _) ((C_A _ _,C_B _))) -> 609 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 610 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_D _) ((C_C _,C_C _))) -> 611 
  C_G (C_D _) (C_A (C_D _) ((C_B _,C_B _))) -> 612 
  C_G (C_G (C_F _) (C_C _)) (C_B ((C_D _,(_,_)))) -> 613 
  C_G (C_G (C_D _) (C_C _)) (C_A _ ((C_C _,C_A _ _))) -> 614 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_F _) ((C_B _,C_A _ _))) -> 615 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_G _ _) ((C_B _,C_B _))) -> 616 
  C_G (C_G (C_G _ _) _) (C_C ((_,C_F _))) -> 617 
  C_G (C_D (C_A _ _)) (C_A (C_E _) ((C_B _,C_C _))) -> 618 
  C_G (C_E _) (C_A (C_D _) ((C_A _ _,C_C _))) -> 619 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 620 
  C_G (C_G _ (C_A _ _)) (C_C _) -> 621 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_D _) ((C_C _,C_C _))) -> 622 
  C_G (C_G (C_G _ _) (C_C _)) (C_A _ ((C_B _,C_B _))) -> 623 
  C_G (C_D (C_B _)) (C_A (C_E _) ((C_A _ _,C_C _))) -> 624 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 625 
  C_G (C_D (C_C _)) (C_C _) -> 626 
  C_G (C_G (C_G _ _) _) _ -> 627 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_E _) ((C_B _,C_A _ _))) -> 628 
  C_G (C_F _) (C_A (C_D _) ((C_C _,C_A _ _))) -> 629 
  C_G (C_G (C_D _) _) (C_A (C_F _) ((C_B _,C_B _))) -> 630 
  C_G (C_G _ (C_C _)) (C_A _ _) -> 631 
  C_G (C_D (C_B _)) (C_A _ ((C_C _,C_A _ _))) -> 632 
  C_G (C_G _ (C_A _ _)) (C_A (C_G _ _) ((C_B _,C_B _))) -> 633 
  C_G _ (C_A (C_D _) _) -> 634 
  C_G (C_G _ _) (C_C ((_,C_G _ _))) -> 635 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 636 
  C_G (C_D (C_A _ _)) (C_A (C_E _) ((C_C _,C_C _))) -> 637 
  C_G (C_G (C_F _) _) (C_A (C_G _ _) ((C_B _,C_C _))) -> 638 
  C_G (C_G _ (C_B _)) (C_A (C_D _) ((C_B _,C_C _))) -> 639 
  C_G (C_G (C_G _ _) _) (C_A (C_E _) ((C_B _,C_C _))) -> 640 
  C_G (C_G (C_G _ _) _) (C_A (C_G _ _) ((C_B _,C_B _))) -> 641 
  C_G (C_G (C_D _) (C_C _)) (C_C ((_,C_G _ _))) -> 642 
  C_G (C_G _ _) (C_A (C_D _) ((C_B _,C_B _))) -> 643 
  C_G (C_D (C_B _)) (C_A (C_E _) ((C_A _ _,C_B _))) -> 644 
  C_G (C_G (C_E _) (C_A _ _)) (C_C _) -> 645 
  C_G (C_D _) (C_A (C_D _) _) -> 646 
  C_G (C_F _) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 647 
  C_G (C_G _ _) (C_A (C_E _) ((C_C _,C_B _))) -> 648 
  C_G (C_G _ (C_C _)) (C_A _ ((C_C _,C_C _))) -> 649 
  C_G (C_G (C_F _) (C_A _ _)) (C_C _) -> 650 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_D _) ((C_B _,C_B _))) -> 651 
  C_G (C_D (C_A _ _)) (C_A (C_D _) ((C_C _,C_C _))) -> 652 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_E _) ((C_C _,C_C _))) -> 653 
  C_G (C_F _) (C_A (C_G _ _) ((C_A _ _,C_B _))) -> 654 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_D _) _) -> 655 
  C_G (C_G (C_D _) (C_A _ _)) (C_C ((_,C_F _))) -> 656 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_E _) ((C_B _,C_A _ _))) -> 657 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_G _ _) ((C_C _,C_A _ _))) -> 658 
  C_G (C_G (C_G _ _) _) (C_A (C_F _) _) -> 659 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_G _ _) _) -> 660 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_G _ _) ((C_C _,C_B _))) -> 661 
  C_G (C_G _ (C_A _ _)) (C_A _ ((C_B _,C_C _))) -> 662 
  C_G (C_D _) (C_A (C_F _) _) -> 663 
  C_G (C_D (C_B _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 664 
  C_G (C_E _) (C_C ((_,C_G _ _))) -> 665 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_F _) ((C_A _ _,C_B _))) -> 666 
  C_G (C_D _) (C_A _ ((C_A _ _,C_B _))) -> 667 
  C_G (C_G _ _) (C_B ((C_F _,(_,_)))) -> 668 
  C_G (C_F _) (C_A (C_G _ _) _) -> 669 
  C_G (C_G _ _) (C_A _ ((C_A _ _,C_C _))) -> 670 
  C_G (C_D (C_B _)) (C_B ((C_E _,(_,_)))) -> 671 
  C_G (C_D (C_B _)) (C_C ((_,C_G _ _))) -> 672 
  C_G (C_F _) (C_A _ ((C_B _,C_C _))) -> 673 
  C_G (C_G (C_E _) (C_C _)) (C_B ((C_G _ _,(_,_)))) -> 674 
  C_G (C_G (C_D _) _) (C_A _ _) -> 675 
  C_G (C_G (C_G _ _) (C_B _)) (C_B _) -> 676 
  C_G (C_F _) (C_A (C_G _ _) ((C_C _,C_C _))) -> 677 
  C_G (C_G _ (C_B _)) (C_A (C_F _) ((C_C _,C_A _ _))) -> 678 
  C_G (C_G (C_E _) _) (C_A (C_G _ _) ((C_B _,C_B _))) -> 679 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_D _) ((C_B _,C_A _ _))) -> 680 
  C_G (C_G (C_E _) _) (C_C _) -> 681 
  C_G (C_G _ _) (C_A (C_E _) ((C_C _,C_C _))) -> 682 
  C_G (C_G (C_F _) _) (C_C ((_,C_F _))) -> 683 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_G _ _) ((C_B _,C_C _))) -> 684 
  C_G (C_G (C_D _) _) (C_A (C_G _ _) ((C_B _,C_C _))) -> 685 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_G _ _) ((C_C _,C_C _))) -> 686 
  C_G (C_D _) (C_A (C_G _ _) ((C_C _,C_A _ _))) -> 687 
  C_G (C_G (C_D _) (C_A _ _)) (C_C _) -> 688 
  C_G (C_G _ (C_B _)) (C_A (C_E _) ((C_A _ _,C_C _))) -> 689 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_F _) ((C_C _,C_C _))) -> 690 
  C_G (C_G (C_D _) _) (C_A (C_D _) ((C_B _,C_B _))) -> 691 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_G _ _) ((C_C _,C_B _))) -> 692 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_E _) _) -> 693 
  C_G (C_G _ (C_C _)) (C_A (C_G _ _) ((C_B _,C_C _))) -> 694 
  C_G (C_G (C_D _) _) (C_B ((C_E _,(_,_)))) -> 695 
  C_G (C_G (C_D _) _) (C_A (C_F _) ((C_C _,C_B _))) -> 696 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_E _) ((C_C _,C_B _))) -> 697 
  C_G (C_G (C_G _ _) _) (C_A (C_G _ _) ((C_B _,C_A _ _))) -> 698 
  C_G (C_G _ (C_B _)) (C_A _ ((C_B _,C_A _ _))) -> 699 
  C_G (C_G (C_F _) (C_B _)) (C_A _ ((C_B _,C_A _ _))) -> 700 
  C_G (C_D (C_B _)) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 701 
  C_G (C_G _ (C_A _ _)) (C_B ((C_F _,(_,_)))) -> 702 
  C_G (C_G (C_E _) (C_B _)) (C_A _ ((C_B _,C_B _))) -> 703 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_F _) ((C_B _,C_C _))) -> 704 
  C_G (C_F _) (C_A _ ((C_A _ _,C_A _ _))) -> 705 
  C_G (C_G _ _) (C_B ((C_E _,(_,_)))) -> 706 
  C_G (C_G _ (C_C _)) (C_A (C_D _) ((C_C _,C_B _))) -> 707 
  C_G (C_G _ (C_A _ _)) (C_A (C_E _) ((C_B _,C_C _))) -> 708 
  C_G (C_D (C_C _)) (C_A (C_F _) ((C_A _ _,C_B _))) -> 709 
  C_G (C_G (C_F _) (C_C _)) (C_A _ ((C_C _,C_C _))) -> 710 
  C_G (C_G (C_F _) _) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 711 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_G _ _) ((C_C _,C_B _))) -> 712 
  C_G (C_G _ (C_A _ _)) (C_A (C_F _) ((C_C _,C_B _))) -> 713 
  C_G (C_G (C_G _ _) _) (C_A (C_E _) _) -> 714 
  C_G (C_G (C_G _ _) (C_C _)) (C_C ((_,C_E _))) -> 715 
  C_G (C_G _ (C_A _ _)) (C_A (C_G _ _) ((C_A _ _,C_A _ _))) -> 716 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 717 
  C_G (C_G (C_E _) (C_B _)) (C_C ((_,C_F _))) -> 718 
  C_G (C_G (C_G _ _) (C_B _)) (C_B ((C_E _,(_,_)))) -> 719 
  C_G (C_G (C_D _) (C_B _)) _ -> 720 
  C_G _ (C_A _ _) -> 721 
  C_G (C_F _) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 722 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_D _) ((C_B _,C_B _))) -> 723 
  C_G (C_G _ (C_C _)) (C_A _ ((C_C _,C_A _ _))) -> 724 
  C_G (C_G _ (C_C _)) (C_A (C_F _) ((C_B _,C_B _))) -> 725 
  C_G (C_G (C_G _ _) _) (C_A _ ((C_A _ _,C_A _ _))) -> 726 
  C_G _ (C_A (C_D _) ((C_C _,C_B _))) -> 727 
  C_G (C_D _) (C_A (C_G _ _) ((C_A _ _,C_A _ _))) -> 728 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_G _ _) ((C_A _ _,C_B _))) -> 729 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 730 
  C_G (C_G (C_F _) _) (C_A (C_D _) ((C_B _,C_A _ _))) -> 731 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 732 
  C_G (C_D _) (C_A _ ((C_B _,C_C _))) -> 733 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_D _) ((C_C _,C_A _ _))) -> 734 
  C_G (C_F _) (C_A _ ((C_C _,C_C _))) -> 735 
  C_G _ (C_A _ ((C_B _,C_B _))) -> 736 
  C_G (C_G _ (C_C _)) (C_A (C_E _) ((C_C _,C_C _))) -> 737 
  C_G (C_G _ _) (C_A (C_E _) _) -> 738 
  C_G (C_G (C_E _) _) (C_A _ ((C_C _,C_B _))) -> 739 
  C_G (C_G _ (C_C _)) (C_A _ ((C_A _ _,C_C _))) -> 740 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_D _) ((C_B _,C_C _))) -> 741 
  C_G (C_D (C_A _ _)) (C_A _ ((C_C _,C_A _ _))) -> 742 
  C_G (C_G (C_D _) _) (C_B ((C_G _ _,(_,_)))) -> 743 
  C_G (C_G (C_E _) (C_B _)) (C_B _) -> 744 
  C_G (C_G (C_D _) (C_A _ _)) (C_A _ ((C_B _,C_B _))) -> 745 
  C_G _ (C_A (C_G _ _) ((C_A _ _,C_B _))) -> 746 
  C_G (C_D (C_C _)) (C_A (C_E _) ((C_A _ _,C_B _))) -> 747 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_E _) ((C_C _,C_C _))) -> 748 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_G _ _) ((C_A _ _,C_B _))) -> 749 
  C_G (C_D (C_C _)) (C_A (C_D _) _) -> 750 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_D _) ((C_B _,C_B _))) -> 751 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_E _) ((C_B _,C_A _ _))) -> 752 
  C_G (C_G _ (C_B _)) (C_A (C_G _ _) ((C_A _ _,C_C _))) -> 753 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_G _ _) ((C_A _ _,C_B _))) -> 754 
  C_G (C_G (C_E _) _) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 755 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_F _) ((C_C _,C_B _))) -> 756 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_F _) ((C_B _,C_A _ _))) -> 757 
  C_G (C_G _ (C_A _ _)) (C_A _ ((C_C _,C_B _))) -> 758 
  C_G (C_G (C_F _) (C_A _ _)) _ -> 759 
  C_G (C_D (C_C _)) (C_A (C_F _) ((C_B _,C_C _))) -> 760 
  C_G (C_D (C_A _ _)) (C_B ((C_G _ _,(_,_)))) -> 761 
  C_G (C_G _ (C_B _)) (C_A _ ((C_A _ _,C_B _))) -> 762 
  C_G (C_D _) (C_A (C_F _) ((C_B _,C_A _ _))) -> 763 
  C_G (C_G (C_D _) (C_C _)) (C_A _ ((C_B _,C_C _))) -> 764 
  C_G (C_F _) (C_A (C_F _) ((C_B _,C_B _))) -> 765 
  C_G (C_G _ _) (C_A _ _) -> 766 
  C_G (C_G (C_F _) _) (C_A (C_F _) _) -> 767 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_F _) ((C_C _,C_A _ _))) -> 768 
  C_G (C_G (C_D _) _) (C_A (C_G _ _) ((C_C _,C_B _))) -> 769 
  C_G (C_D _) (C_A (C_E _) ((C_C _,C_C _))) -> 770 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_G _ _) ((C_C _,C_A _ _))) -> 771 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_D _) ((C_A _ _,C_B _))) -> 772 
  C_G (C_G (C_G _ _) (C_C _)) (C_A _ ((C_C _,C_C _))) -> 773 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_G _ _) ((C_C _,C_B _))) -> 774 
  C_G (C_E _) (C_A (C_E _) ((C_C _,C_B _))) -> 775 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_E _) ((C_B _,C_A _ _))) -> 776 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_E _) ((C_A _ _,C_B _))) -> 777 
