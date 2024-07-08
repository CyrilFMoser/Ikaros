module Program_23 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B B_B b | C_C ((B_B,B_B)) (B_A B_B b)
data B_B = C_D | C_E B_B | C_F ((B_B,B_B))

v_a :: B_A Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_E (C_F _)) _ -> 0 
  C_B (C_F ((C_E _,C_D))) _ -> 1 
  C_B C_D _ -> 2 
  C_B (C_F ((C_F _,C_E _))) _ -> 3 
  C_B (C_E _) _ -> 4 
  C_B (C_F _) _ -> 5 
  C_B (C_F ((C_E _,C_E _))) _ -> 6 
  C_B (C_F ((C_D,C_D))) _ -> 7 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 8 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_F _,C_E _)) _) -> 9 
  C_C ((C_D,C_F _)) (C_C _ (C_B _ _)) -> 10 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_F _,C_D)) _) -> 11 
  C_C _ (C_C ((C_D,C_D)) _) -> 12 
  C_C ((C_D,C_D)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 13 
  C_C ((C_D,C_E C_D)) (C_C _ (C_A)) -> 14 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_B _ _) -> 15 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 16 
  C_C ((C_E _,C_E (C_E _))) _ -> 17 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_A)) -> 18 
  C_C ((C_D,C_E (C_F _))) (C_C _ (C_C _ _)) -> 19 
  C_C ((C_F _,C_E _)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 20 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 21 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 22 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_D,C_F _)) _) -> 23 
  C_C ((C_E _,C_D)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 24 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_D,C_E _)) _) -> 25 
  C_C ((C_E _,C_E C_D)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 26 
  C_C ((C_D,C_F _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 27 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 28 
  C_C ((C_E (C_F _),C_E _)) (C_C _ (C_B _ _)) -> 29 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 30 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_D,C_D)) _) -> 31 
  C_C ((C_E _,C_E C_D)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 32 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 33 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 34 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_D,C_D)) (C_C _ _)) -> 35 
  C_C ((C_F _,C_E C_D)) (C_C ((C_D,C_D)) _) -> 36 
  C_C ((C_E C_D,C_E _)) _ -> 37 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_B _ _) -> 38 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 39 
  C_C ((C_F ((_,_)),C_E C_D)) (C_A) -> 40 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 41 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_F _,C_E _)) (C_A)) -> 42 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_D,C_D)) (C_A)) -> 43 
  C_C ((C_D,C_E C_D)) (C_C ((C_D,C_F _)) (C_A)) -> 44 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_E _,C_E _)) _) -> 45 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 46 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_E _,C_F _)) (C_A)) -> 47 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_D,C_E _)) (C_A)) -> 48 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_D,C_F _)) _) -> 49 
  C_C ((C_D,C_E (C_E _))) (C_C _ (C_C _ _)) -> 50 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C _ (C_A)) -> 51 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 52 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_D,C_D)) (C_B _ _)) -> 53 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_D,C_D)) _) -> 54 
  C_C ((C_E _,C_E (C_F _))) (C_C _ (C_C _ _)) -> 55 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_D,C_D)) (C_A)) -> 56 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_A)) -> 57 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_D,C_D)) _) -> 58 
  C_C ((C_E _,C_F ((_,_)))) (C_C _ _) -> 59 
  C_C ((C_F _,C_D)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 60 
  C_C ((C_E C_D,C_F _)) (C_C _ (C_A)) -> 61 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_D,C_D)) _) -> 62 
  C_C ((C_E _,C_D)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 63 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_D,C_D)) _) -> 64 
  C_C ((C_D,C_E (C_E _))) (C_B C_D _) -> 65 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 66 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 67 
  C_C ((C_D,C_F _)) (C_C ((C_D,C_F _)) (C_A)) -> 68 
  C_C ((C_E C_D,C_E _)) (C_B C_D _) -> 69 
  C_C ((C_E C_D,C_D)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 70 
  C_C ((C_D,C_F _)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 71 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_B _ _) -> 72 
  C_C ((C_D,C_F ((_,_)))) (C_B (C_F _) _) -> 73 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 74 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_F _,C_D)) _) -> 75 
  C_C ((C_E _,C_E C_D)) (C_B (C_E _) _) -> 76 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_F _,C_D)) (C_A)) -> 77 
  C_C ((C_D,C_E (C_F _))) (C_C _ (C_B _ _)) -> 78 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_F _,C_D)) (C_A)) -> 79 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 80 
  C_C ((C_D,C_E C_D)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 81 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 82 
  C_C ((C_D,C_E C_D)) (C_C _ (C_B _ _)) -> 83 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 84 
  C_C ((C_E _,C_F ((_,_)))) (C_C _ (C_C _ _)) -> 85 
  C_C _ (C_C ((C_F _,C_E _)) _) -> 86 
  C_C ((C_D,C_E C_D)) (C_A) -> 87 
  C_C ((C_E _,C_D)) (C_C _ _) -> 88 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_A)) -> 89 
  C_C ((C_E _,C_D)) (C_C ((C_D,C_E _)) (C_A)) -> 90 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_E _,C_F _)) (C_A)) -> 91 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_D,C_F _)) (C_A)) -> 92 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 93 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 94 
  C_C ((C_F ((_,_)),C_D)) (C_B (C_E _) _) -> 95 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 96 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 97 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 98 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 99 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_A)) -> 100 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_A)) -> 101 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 102 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_D,C_F _)) _) -> 103 
  C_C ((C_E C_D,C_F _)) (C_B _ _) -> 104 
  C_C _ (C_C ((C_E _,C_D)) (C_C _ _)) -> 105 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_A)) -> 106 
  C_C ((C_F _,C_E C_D)) (C_A) -> 107 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 108 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_D,C_F _)) _) -> 109 
  C_C ((C_F _,C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 110 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_D,C_D)) (C_C _ _)) -> 111 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_B (C_F _) _) -> 112 
  C_C ((C_F _,C_D)) (C_C _ _) -> 113 
  C_C ((C_F _,C_E (C_E _))) (C_B (C_F _) _) -> 114 
  C_C ((C_E _,C_D)) (C_C ((C_E _,C_F _)) (C_A)) -> 115 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_D,C_D)) _) -> 116 
  C_C _ (C_C ((C_E _,C_D)) (C_B _ _)) -> 117 
  C_C ((C_D,C_F _)) (C_C _ _) -> 118 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 119 
  C_C _ (C_C ((C_E _,C_F _)) (C_A)) -> 120 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_D,C_E _)) (C_A)) -> 121 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_F _,C_D)) (C_A)) -> 122 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_F _,C_F _)) _) -> 123 
  C_C ((C_D,C_F _)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 124 
  C_C ((C_D,C_E _)) (C_B (C_E _) _) -> 125 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_A)) -> 126 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_D,C_D)) _) -> 127 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_F _,C_E _)) _) -> 128 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_D,C_E _)) _) -> 129 
  C_C _ (C_B C_D _) -> 130 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 131 
  C_C ((C_E _,C_F _)) (C_C ((C_D,C_E _)) _) -> 132 
  C_C ((C_E _,C_D)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 133 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_D,C_F _)) _) -> 134 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 135 
  C_C ((C_F _,C_E C_D)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 136 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 137 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_A) -> 138 
  C_C ((C_D,C_F _)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 139 
  C_C ((C_E C_D,C_E (C_E _))) (C_B C_D _) -> 140 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_F _,C_F _)) _) -> 141 
  C_C ((C_E _,C_E _)) _ -> 142 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_E _,C_E _)) (C_A)) -> 143 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_E _,C_F _)) _) -> 144 
  C_C ((C_E _,C_D)) (C_B C_D _) -> 145 
  C_C ((C_E _,C_E _)) (C_C ((C_E _,C_D)) _) -> 146 
  C_C ((C_E _,C_E _)) (C_C ((C_F _,C_F _)) (C_A)) -> 147 
  C_C ((C_F _,C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 148 
  C_C ((C_F _,C_E _)) (C_C ((C_D,C_D)) (C_C _ _)) -> 149 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 150 
  C_C ((C_F _,C_D)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 151 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_B C_D _) -> 152 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 153 
  C_C ((C_E C_D,C_F _)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 154 
  C_C _ (C_C ((C_E _,C_F _)) (C_B _ _)) -> 155 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_D,C_D)) (C_A)) -> 156 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_A)) -> 157 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_A)) -> 158 
  C_C ((C_D,C_D)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 159 
  C_C ((C_E _,C_E _)) (C_B (C_E _) _) -> 160 
  C_C ((C_E _,C_F _)) (C_C ((C_F _,C_F _)) _) -> 161 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 162 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 163 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 164 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 165 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_D,C_D)) _) -> 166 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_F _,C_D)) (C_A)) -> 167 
  C_C ((C_E C_D,C_D)) (C_C ((C_E _,C_F _)) _) -> 168 
  C_C ((C_E _,C_F _)) (C_C ((C_F _,C_F _)) (C_A)) -> 169 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 170 
  C_C ((C_D,C_E C_D)) (C_C _ _) -> 171 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 172 
  C_C ((C_D,C_E C_D)) (C_B C_D _) -> 173 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 174 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_A) -> 175 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_F _,C_F _)) _) -> 176 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_A)) -> 177 
  C_C ((C_E C_D,C_D)) (C_C ((C_D,C_D)) (C_B _ _)) -> 178 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 179 
  C_C ((C_E C_D,C_E _)) (C_C _ (C_B _ _)) -> 180 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 181 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_A)) -> 182 
  C_C _ (C_B (C_F _) _) -> 183 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_A)) -> 184 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_F _,C_D)) (C_A)) -> 185 
  C_C ((C_E _,C_E C_D)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 186 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_D,C_D)) _) -> 187 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_A) -> 188 
  C_C ((C_D,C_E _)) (C_C ((C_F _,C_D)) _) -> 189 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_E _,C_F _)) (C_A)) -> 190 
  C_C ((C_E _,C_E C_D)) (C_C ((C_D,C_D)) (C_B _ _)) -> 191 
  C_C ((C_F _,C_E C_D)) (C_C ((C_E _,C_E _)) _) -> 192 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 193 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_E _,C_D)) _) -> 194 
  C_C ((C_F _,C_E _)) (C_C ((C_D,C_F _)) _) -> 195 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_A)) -> 196 
  C_C ((C_D,C_E C_D)) (C_C _ (C_C _ _)) -> 197 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_E _,C_E _)) _) -> 198 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_D,C_F _)) _) -> 199 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_D,C_D)) (C_C _ _)) -> 200 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_B (C_F _) _) -> 201 
  C_C ((C_E _,C_F _)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 202 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 203 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_F _,C_D)) (C_A)) -> 204 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_E _,C_F _)) (C_A)) -> 205 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 206 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_E _,C_E _)) (C_A)) -> 207 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C _ (C_C _ _)) -> 208 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_D,C_D)) (C_A)) -> 209 
  C_C ((C_F ((_,_)),C_E (C_F _))) _ -> 210 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_E _,C_E _)) _) -> 211 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 212 
  C_C ((C_F _,C_F _)) (C_B _ _) -> 213 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_D,C_D)) (C_B _ _)) -> 214 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 215 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_B _ _) -> 216 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 217 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 218 
  C_C _ (C_C ((C_E _,C_D)) _) -> 219 
  C_C ((C_F ((_,_)),C_E _)) (C_C _ _) -> 220 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 221 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_E _,C_F _)) _) -> 222 
  C_C ((C_F _,C_E _)) (C_A) -> 223 
  C_C ((C_E _,C_D)) (C_C ((C_E _,C_E _)) (C_A)) -> 224 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 225 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 226 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_E _,C_F _)) _) -> 227 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 228 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_D,C_F _)) _) -> 229 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_D,C_E _)) (C_A)) -> 230 
  C_C ((C_E _,C_E C_D)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 231 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_A)) -> 232 
  C_C ((C_E C_D,C_E _)) (C_C _ (C_A)) -> 233 
  C_C ((C_F _,C_E (C_F _))) (C_B C_D _) -> 234 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_F _,C_D)) _) -> 235 
  C_C ((C_F ((_,_)),C_E _)) (C_B _ _) -> 236 
  C_C ((C_F _,C_E C_D)) _ -> 237 
  C_C ((C_E _,C_E _)) (C_B (C_F _) _) -> 238 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_A)) -> 239 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 240 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 241 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 242 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 243 
  C_C ((C_E _,C_E C_D)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 244 
  C_C ((C_E _,C_D)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 245 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 246 
  C_C ((C_E (C_E _),C_D)) (C_C _ (C_C _ _)) -> 247 
  C_C ((C_D,C_D)) (C_C ((C_F _,C_D)) (C_A)) -> 248 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_E _,C_F _)) _) -> 249 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 250 
  C_C ((C_E C_D,C_E (C_E _))) (C_C _ _) -> 251 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 252 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C _ (C_B _ _)) -> 253 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_E _,C_D)) _) -> 254 
  C_C ((C_E _,C_E (C_E _))) (C_B C_D _) -> 255 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 256 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_E _,C_F _)) (C_A)) -> 257 
  C_C ((C_E _,C_E _)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 258 
  C_C ((C_E C_D,C_E _)) (C_C ((C_F _,C_E _)) _) -> 259 
  C_C ((C_E C_D,C_D)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 260 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_D,C_D)) (C_A)) -> 261 
  C_C ((C_E _,C_E (C_F _))) (C_A) -> 262 
  C_C ((C_D,C_F ((_,_)))) (C_B (C_E _) _) -> 263 
  C_C ((C_D,C_E C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 264 
  C_C ((C_F _,C_E _)) (C_C ((C_D,C_D)) (C_B _ _)) -> 265 
  C_C ((C_E _,C_F ((_,_)))) (C_C _ (C_A)) -> 266 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C _ (C_B _ _)) -> 267 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_A)) -> 268 
  C_C ((C_E C_D,C_E _)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 269 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_A)) -> 270 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_D,C_D)) _) -> 271 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 272 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_E _,C_F _)) _) -> 273 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 274 
  C_C ((C_F _,C_E _)) (C_C ((C_F _,C_D)) (C_A)) -> 275 
  C_C ((C_D,C_E C_D)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 276 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 277 
  C_C _ (C_B _ _) -> 278 
  C_C ((C_F _,C_E C_D)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 279 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_E _,C_D)) _) -> 280 
  C_C ((C_D,C_E _)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 281 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 282 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_A)) -> 283 
  C_C ((C_F _,C_F _)) (C_C ((C_F _,C_E _)) (C_A)) -> 284 
  C_C ((C_F _,C_E (C_E _))) (C_C _ (C_B _ _)) -> 285 
  C_C ((C_E _,C_E _)) (C_C _ (C_B _ _)) -> 286 
  C_C ((C_E _,C_F ((_,_)))) (C_C _ (C_B _ _)) -> 287 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 288 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_F _,C_D)) (C_A)) -> 289 
  C_C ((C_D,C_F _)) (C_C ((C_E _,C_E _)) _) -> 290 
  C_C ((C_E C_D,C_E _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 291 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 292 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_E _,C_F _)) _) -> 293 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_A)) -> 294 
  C_C ((C_E C_D,C_F _)) (C_C ((C_E _,C_D)) (C_A)) -> 295 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_E _,C_E _)) _) -> 296 
  C_C ((C_F _,C_E _)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 297 
  C_C ((C_E _,C_F _)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 298 
  C_C ((C_F _,C_F _)) (C_C ((C_F _,C_F _)) (C_A)) -> 299 
  C_C ((C_D,C_E C_D)) (C_C ((C_D,C_D)) (C_A)) -> 300 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 301 
  C_C ((C_D,C_E _)) (C_C _ (C_C _ _)) -> 302 
  C_C ((C_D,C_E C_D)) (C_C ((C_E _,C_F _)) _) -> 303 
  C_C ((C_E (C_E _),C_E _)) (C_B C_D _) -> 304 
  C_C ((C_E C_D,C_E C_D)) (C_C _ _) -> 305 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 306 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 307 
  C_C ((C_E _,C_F _)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 308 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_E _,C_E _)) _) -> 309 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 310 
  C_C ((C_D,C_E C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 311 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_D,C_F _)) (C_A)) -> 312 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_F _,C_F _)) _) -> 313 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 314 
  C_C ((C_D,C_E _)) (C_C ((C_E _,C_E _)) _) -> 315 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 316 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_A)) -> 317 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 318 
  C_C ((C_E C_D,C_F _)) (C_C ((C_E _,C_E _)) _) -> 319 
  C_C ((C_D,C_F _)) (C_A) -> 320 
  C_C ((C_D,C_E (C_F _))) (C_A) -> 321 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 322 
  C_C ((C_F _,C_E _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 323 
  C_C ((C_D,C_E _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 324 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_A)) -> 325 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_D,C_D)) (C_A)) -> 326 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 327 
  C_C ((C_D,C_D)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 328 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 329 
  C_C ((C_E C_D,C_F _)) (C_C ((C_F _,C_F _)) _) -> 330 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 331 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_F _,C_E _)) _) -> 332 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 333 
  C_C ((C_E (C_E _),C_F _)) (C_B _ _) -> 334 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 335 
  C_C ((C_D,C_E C_D)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 336 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 337 
  C_C ((C_F _,C_F _)) (C_C ((C_E _,C_E _)) _) -> 338 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 339 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 340 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_E _,C_E _)) _) -> 341 
  C_C ((C_E C_D,C_D)) (C_C ((C_E _,C_D)) (C_A)) -> 342 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 343 
  C_C ((C_F _,C_E (C_E _))) (C_A) -> 344 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_D,C_D)) (C_B _ _)) -> 345 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_A)) -> 346 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_D,C_E _)) _) -> 347 
  C_C ((C_E _,C_E C_D)) (C_C _ _) -> 348 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_D,C_D)) _) -> 349 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_E _,C_D)) (C_A)) -> 350 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_B _ _) -> 351 
  C_C ((C_F ((_,_)),C_E C_D)) (C_B C_D _) -> 352 
  C_C ((C_E C_D,C_F _)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 353 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 354 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 355 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_F _,C_D)) _) -> 356 
  C_C ((C_E (C_E _),C_D)) (C_C _ (C_A)) -> 357 
  C_C ((C_E C_D,C_E (C_F _))) (C_B _ _) -> 358 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_E _,C_E _)) (C_A)) -> 359 
  C_C ((C_F _,C_F _)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 360 
  C_C ((C_F _,C_F ((_,_)))) (C_B (C_F _) _) -> 361 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_A)) -> 362 
  C_C ((C_F ((_,_)),C_E _)) _ -> 363 
  C_C ((C_D,C_F _)) (C_C ((C_D,C_D)) (C_A)) -> 364 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 365 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_D,C_D)) (C_B _ _)) -> 366 
  C_C ((C_E C_D,C_D)) (C_B (C_E _) _) -> 367 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_A)) -> 368 
  C_C ((C_F _,C_E _)) (C_C _ (C_A)) -> 369 
  C_C ((C_E C_D,C_D)) (C_C ((C_F _,C_F _)) _) -> 370 
  C_C ((C_E (C_E _),C_D)) (C_C _ _) -> 371 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_D,C_E _)) (C_A)) -> 372 
  C_C ((C_E C_D,C_F _)) (C_C ((C_D,C_E _)) (C_A)) -> 373 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 374 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_D,C_E _)) _) -> 375 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 376 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_D,C_D)) _) -> 377 
  C_C ((C_D,C_E _)) (C_C ((C_D,C_F _)) _) -> 378 
  C_C ((C_E (C_F _),C_F _)) (C_C _ (C_C _ _)) -> 379 
  C_C ((C_E _,C_E C_D)) (C_B _ _) -> 380 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 381 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 382 
  C_C ((C_F _,C_E _)) (C_C ((C_D,C_E _)) _) -> 383 
  C_C ((C_E C_D,C_F _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 384 
  C_C ((C_E C_D,C_F ((_,_)))) (C_B C_D _) -> 385 
  C_C ((C_F _,C_E C_D)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 386 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_F _,C_D)) _) -> 387 
  C_C ((C_E _,C_E (C_F _))) (C_C _ (C_B _ _)) -> 388 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 389 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C _ (C_A)) -> 390 
  C_C ((C_E (C_F _),C_E C_D)) (C_C _ (C_C _ _)) -> 391 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 392 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 393 
  C_C ((C_E _,C_E C_D)) (C_C ((C_D,C_E _)) _) -> 394 
  C_C ((C_E C_D,C_F _)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 395 
  C_C ((C_D,C_E C_D)) (C_C ((C_E _,C_D)) (C_A)) -> 396 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 397 
  C_C ((C_F _,C_D)) (C_C ((C_D,C_F _)) _) -> 398 
  C_C ((C_F _,C_E C_D)) (C_C ((C_F _,C_D)) (C_A)) -> 399 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 400 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_F _,C_F _)) (C_A)) -> 401 
  C_C ((C_E _,C_F _)) (C_C ((C_D,C_D)) (C_C _ _)) -> 402 
  C_C ((C_F _,C_E _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 403 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_E _,C_E _)) _) -> 404 
  C_C ((C_E (C_F _),C_E _)) (C_B C_D _) -> 405 
  C_C ((C_E (C_E _),C_E C_D)) (C_C _ _) -> 406 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 407 
  C_C ((C_E C_D,C_F _)) (C_C ((C_E _,C_F _)) (C_A)) -> 408 
  C_C ((C_E C_D,C_F _)) (C_C ((C_D,C_D)) (C_A)) -> 409 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_A)) -> 410 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 411 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_F _,C_E _)) _) -> 412 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_D,C_D)) _) -> 413 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_B (C_E _) _) -> 414 
  C_C ((C_E _,C_D)) (C_C ((C_F _,C_E _)) _) -> 415 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 416 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 417 
  C_C ((C_E (C_E _),C_E C_D)) (C_B C_D _) -> 418 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_F _,C_D)) (C_A)) -> 419 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 420 
  C_C ((C_E _,C_F _)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 421 
  C_C ((C_E _,C_D)) (C_C ((C_D,C_F _)) (C_A)) -> 422 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 423 
  C_C ((C_E _,C_E C_D)) (C_C ((C_D,C_F _)) (C_A)) -> 424 
  C_C ((C_E C_D,C_E C_D)) (C_A) -> 425 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 426 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 427 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 428 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_D,C_D)) (C_A)) -> 429 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C _ (C_B _ _)) -> 430 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_D,C_D)) (C_C _ _)) -> 431 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 432 
  C_C ((C_E _,C_F _)) (C_A) -> 433 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_A)) -> 434 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C _ (C_A)) -> 435 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 436 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 437 
  C_C ((C_E C_D,C_E _)) (C_C ((C_E _,C_E _)) _) -> 438 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 439 
  C_C ((C_D,C_E (C_F _))) (C_B C_D _) -> 440 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_D,C_F _)) _) -> 441 
  C_C ((C_E (C_E _),C_E (C_E _))) _ -> 442 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_B (C_F _) _) -> 443 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 444 
  C_C ((C_F _,C_F _)) (C_C ((C_F _,C_D)) (C_A)) -> 445 
  C_C ((C_F _,C_E C_D)) (C_C _ (C_A)) -> 446 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_D,C_E _)) _) -> 447 
  C_C ((C_F _,C_F _)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 448 
  C_C ((C_D,C_F ((_,_)))) (C_B C_D _) -> 449 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_F _,C_D)) (C_A)) -> 450 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 451 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_F _,C_E _)) _) -> 452 
  C_C ((C_E C_D,C_E _)) (C_B _ _) -> 453 
  C_C _ (C_C ((C_F _,C_F _)) _) -> 454 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_A)) -> 455 
  C_C ((C_E C_D,C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 456 
  C_C ((C_D,C_E C_D)) (C_C ((C_F _,C_D)) (C_A)) -> 457 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_E _,C_F _)) _) -> 458 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_E _,C_D)) (C_A)) -> 459 
  C_C ((C_D,C_E _)) (C_C ((C_D,C_E _)) _) -> 460 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_A)) -> 461 
  C_C _ (C_C ((C_E _,C_E _)) (C_C _ _)) -> 462 
  C_C ((C_E _,C_F ((_,_)))) (C_B (C_F _) _) -> 463 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_A)) -> 464 
  C_C ((C_E C_D,C_E _)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 465 
  C_C ((C_E _,C_F _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 466 
  C_C ((C_E C_D,C_D)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 467 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_E _,C_D)) (C_A)) -> 468 
  C_C ((C_D,C_D)) (C_C ((C_D,C_D)) (C_C _ _)) -> 469 
  C_C ((C_E _,C_D)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 470 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 471 
  C_C ((C_D,C_E _)) (C_C ((C_E _,C_F _)) _) -> 472 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 473 
  C_C _ (C_C _ _) -> 474 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C _ (C_A)) -> 475 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_B C_D _) -> 476 
  C_C ((C_F _,C_E _)) (C_C ((C_D,C_F _)) (C_A)) -> 477 
  C_C ((C_E _,C_F _)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 478 
  C_C ((C_F _,C_D)) (C_C ((C_E _,C_D)) (C_A)) -> 479 
  C_C ((C_E (C_F _),C_D)) _ -> 480 
  C_C ((C_D,C_E _)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 481 
  C_C ((C_D,C_D)) (C_B C_D _) -> 482 
  C_C ((C_F _,C_F _)) (C_C ((C_D,C_E _)) _) -> 483 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_D,C_D)) (C_B _ _)) -> 484 
  C_C ((C_E (C_E _),C_F _)) (C_C _ _) -> 485 
  C_C ((C_D,C_D)) (C_C _ (C_B _ _)) -> 486 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 487 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 488 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 489 
  C_C ((C_F _,C_F _)) (C_C _ (C_B _ _)) -> 490 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 491 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_F _,C_D)) _) -> 492 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_F _,C_F _)) _) -> 493 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_F _,C_D)) _) -> 494 
  C_C ((C_E C_D,C_E _)) (C_C ((C_D,C_D)) (C_A)) -> 495 
  C_C ((C_E C_D,C_D)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 496 
  C_C ((C_E _,C_E _)) (C_C ((C_E _,C_F _)) _) -> 497 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_E _,C_F _)) _) -> 498 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_D,C_F _)) _) -> 499 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_A)) -> 500 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 501 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_D,C_D)) (C_C _ _)) -> 502 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 503 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_E _,C_F _)) _) -> 504 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 505 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 506 
  C_C ((C_E _,C_E (C_E _))) (C_A) -> 507 
  C_C ((C_F _,C_E C_D)) (C_C ((C_D,C_E _)) (C_A)) -> 508 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 509 
  C_C ((C_E _,C_E (C_E _))) (C_C _ _) -> 510 
  C_C ((C_E _,C_E C_D)) (C_C ((C_E _,C_D)) (C_A)) -> 511 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 512 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_D,C_E _)) _) -> 513 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 514 
  C_C _ (C_C ((C_D,C_F _)) (C_C _ _)) -> 515 
  C_C ((C_D,C_F _)) (C_C ((C_D,C_E _)) (C_A)) -> 516 
  C_C ((C_F ((_,_)),C_D)) (C_C _ (C_B _ _)) -> 517 
  C_C ((C_E C_D,C_E _)) (C_C ((C_E _,C_D)) _) -> 518 
  C_C ((C_F _,C_E _)) (C_C ((C_F _,C_E _)) (C_A)) -> 519 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C _ (C_C _ _)) -> 520 
  C_C ((C_E _,C_F _)) (C_B (C_E _) _) -> 521 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 522 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 523 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_A)) -> 524 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_F _,C_E _)) (C_A)) -> 525 
  C_C ((C_E _,C_E C_D)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 526 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_A)) -> 527 
  C_C ((C_F _,C_F _)) (C_C _ (C_C _ _)) -> 528 
  C_C ((C_D,C_F ((_,_)))) (C_B _ _) -> 529 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_D,C_D)) (C_C _ _)) -> 530 
  C_C ((C_F ((_,_)),C_E _)) (C_A) -> 531 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_D,C_D)) (C_A)) -> 532 
  C_C ((C_E C_D,C_E _)) (C_B (C_F _) _) -> 533 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_D,C_E _)) _) -> 534 
  C_C ((C_F _,C_E C_D)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 535 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 536 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 537 
  C_C ((C_E _,C_E _)) (C_C ((C_D,C_E _)) _) -> 538 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C _ (C_C _ _)) -> 539 
  C_C ((C_E _,C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 540 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_E _,C_D)) _) -> 541 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_F _,C_F _)) _) -> 542 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_A)) -> 543 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 544 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C _ (C_B _ _)) -> 545 
  C_C ((C_E C_D,C_E _)) (C_C ((C_D,C_F _)) (C_A)) -> 546 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_E _,C_E _)) _) -> 547 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_D,C_F _)) _) -> 548 
  C_C ((C_F _,C_E C_D)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 549 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_D,C_D)) (C_A)) -> 550 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_F _,C_E _)) _) -> 551 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_A)) -> 552 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_E _,C_F _)) _) -> 553 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 554 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_D,C_F _)) _) -> 555 
  C_C ((C_D,C_D)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 556 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 557 
  C_C ((C_D,C_E _)) (C_B _ _) -> 558 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_F _,C_D)) _) -> 559 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_E _,C_D)) (C_A)) -> 560 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_A)) -> 561 
  C_C ((C_F _,C_F _)) (C_C ((C_E _,C_D)) _) -> 562 
  C_C _ (C_C ((C_D,C_D)) (C_B _ _)) -> 563 
  C_C ((C_F _,C_D)) (C_B C_D _) -> 564 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_A)) -> 565 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_F _,C_E _)) _) -> 566 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 567 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 568 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_E _,C_E _)) _) -> 569 
  C_C ((C_E _,C_E _)) (C_C ((C_E _,C_E _)) _) -> 570 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_D,C_D)) (C_B _ _)) -> 571 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_E _,C_D)) (C_A)) -> 572 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_E _,C_F _)) _) -> 573 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 574 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_F _,C_D)) (C_A)) -> 575 
  C_C ((C_D,C_D)) (C_A) -> 576 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 577 
  C_C _ (C_C ((C_D,C_E _)) (C_C _ _)) -> 578 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_B (C_E _) _) -> 579 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 580 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_E _,C_D)) (C_A)) -> 581 
  C_C ((C_E C_D,C_E _)) (C_C ((C_D,C_D)) (C_C _ _)) -> 582 
  C_C ((C_E _,C_D)) (C_C _ (C_B _ _)) -> 583 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 584 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_A)) -> 585 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_A) -> 586 
  C_C ((C_E _,C_F _)) _ -> 587 
  C_C ((C_D,C_F _)) (C_C ((C_E _,C_D)) (C_A)) -> 588 
  C_C ((C_F _,C_F ((_,_)))) (C_A) -> 589 
  C_C ((C_E C_D,C_F _)) (C_C ((C_F _,C_E _)) (C_A)) -> 590 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 591 
  C_C ((C_E (C_F _),C_D)) (C_A) -> 592 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_A)) -> 593 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_F _,C_D)) _) -> 594 
  C_C ((C_E _,C_E _)) (C_C _ _) -> 595 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C _ (C_C _ _)) -> 596 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 597 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_F _,C_D)) (C_A)) -> 598 
  C_C ((C_E C_D,C_E _)) (C_C ((C_D,C_F _)) _) -> 599 
  C_C ((C_D,C_E C_D)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 600 
  C_C _ _ -> 601 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 602 
  C_C ((C_E C_D,C_D)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 603 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_F _,C_D)) (C_A)) -> 604 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 605 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_F _,C_E _)) (C_A)) -> 606 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_D,C_F _)) (C_A)) -> 607 
  C_C ((C_F ((_,_)),C_E _)) (C_B C_D _) -> 608 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_D,C_D)) (C_C _ _)) -> 609 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_D,C_E _)) _) -> 610 
  C_C ((C_F ((_,_)),C_E C_D)) (C_B (C_E _) _) -> 611 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 612 
  C_C ((C_F _,C_D)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 613 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 614 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 615 
  C_C ((C_E (C_E _),C_E _)) _ -> 616 
  C_C ((C_F _,C_F _)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 617 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 618 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 619 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_D,C_D)) _) -> 620 
  C_C ((C_D,C_E _)) (C_A) -> 621 
  C_C ((C_F _,C_E _)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 622 
  C_C ((C_F _,C_E _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 623 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_D,C_D)) (C_C _ _)) -> 624 
  C_C ((C_E (C_E _),C_F _)) (C_A) -> 625 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 626 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_D,C_D)) (C_B _ _)) -> 627 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_E _,C_D)) (C_A)) -> 628 
  C_C ((C_F _,C_D)) (C_C ((C_E _,C_D)) _) -> 629 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 630 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 631 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 632 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_A)) -> 633 
  C_C ((C_F _,C_F _)) (C_C ((C_D,C_D)) (C_B _ _)) -> 634 
  C_C ((C_E C_D,C_E _)) (C_C ((C_F _,C_E _)) (C_A)) -> 635 
  C_C ((C_F _,C_E _)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 636 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 637 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_D,C_D)) _) -> 638 
  C_C ((C_E _,C_E _)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 639 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_A)) -> 640 
  C_C ((C_F _,C_F _)) (C_C _ _) -> 641 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 642 
  C_C ((C_E _,C_D)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 643 
  C_C ((C_E _,C_D)) (C_B (C_F _) _) -> 644 
  C_C ((C_E _,C_E C_D)) (C_C ((C_F _,C_D)) (C_A)) -> 645 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_A)) -> 646 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 647 
  C_C ((C_F _,C_E C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 648 
  C_C ((C_F ((_,_)),C_D)) (C_B (C_F _) _) -> 649 
  C_C ((C_E C_D,C_E _)) (C_B (C_E _) _) -> 650 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 651 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_D,C_F _)) (C_A)) -> 652 
  C_C ((C_E _,C_F _)) (C_C ((C_D,C_F _)) (C_A)) -> 653 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 654 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 655 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_E _,C_D)) _) -> 656 
  C_C ((C_F _,C_E _)) (C_C ((C_D,C_D)) _) -> 657 
  C_C ((C_E _,C_E _)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 658 
  C_C ((C_D,C_F _)) (C_C ((C_F _,C_E _)) _) -> 659 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_D,C_D)) (C_C _ _)) -> 660 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_E _,C_F _)) _) -> 661 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C _ _) -> 662 
  C_C ((C_E C_D,C_E _)) (C_C ((C_D,C_D)) _) -> 663 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 664 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_A)) -> 665 
  C_C ((C_E _,C_E _)) (C_C ((C_F _,C_F _)) _) -> 666 
  C_C ((C_D,C_E (C_E _))) (C_A) -> 667 
  C_C ((C_D,C_D)) (C_C _ (C_C _ _)) -> 668 
  C_C ((C_D,C_E C_D)) (C_C ((C_D,C_D)) (C_C _ _)) -> 669 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_F _,C_F _)) (C_A)) -> 670 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 671 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_E _,C_D)) _) -> 672 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 673 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_F _,C_E _)) _) -> 674 
  C_C ((C_D,C_E _)) (C_C ((C_D,C_D)) (C_B _ _)) -> 675 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 676 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_A)) -> 677 
  C_C ((C_E _,C_D)) (C_C ((C_D,C_F _)) _) -> 678 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_E _,C_E _)) _) -> 679 
  C_C ((C_F _,C_E C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 680 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 681 
  C_C ((C_F _,C_D)) (C_B (C_F _) _) -> 682 
  C_C ((C_D,C_E _)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 683 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 684 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 685 
  C_C ((C_E _,C_F _)) (C_C ((C_E _,C_F _)) _) -> 686 
  C_C ((C_E (C_E _),C_E _)) (C_A) -> 687 
  C_C ((C_F _,C_D)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 688 
  C_C ((C_F _,C_E _)) (C_B C_D _) -> 689 
  C_C ((C_F ((_,_)),C_F _)) (C_B (C_E _) _) -> 690 
  C_C ((C_D,C_D)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 691 
  C_C ((C_E _,C_E _)) (C_A) -> 692 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_E _,C_E _)) (C_A)) -> 693 
  C_C ((C_E _,C_E _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 694 
  C_C ((C_D,C_D)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 695 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_E _,C_E _)) _) -> 696 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_D,C_F _)) (C_A)) -> 697 
  C_C ((C_D,C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 698 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 699 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 700 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_D,C_D)) _) -> 701 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 702 
  C_C _ (C_C ((C_F _,C_E _)) (C_A)) -> 703 
  C_C ((C_E _,C_F _)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 704 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 705 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_D,C_D)) (C_B _ _)) -> 706 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_A) -> 707 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_D,C_D)) _) -> 708 
  C_C ((C_E _,C_F _)) (C_C _ (C_B _ _)) -> 709 
  C_C ((C_E C_D,C_D)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 710 
  C_C ((C_E C_D,C_D)) (C_B C_D _) -> 711 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 712 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 713 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_D,C_E _)) (C_A)) -> 714 
  C_C ((C_F _,C_E _)) (C_C _ _) -> 715 
  C_C ((C_E C_D,C_E _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 716 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_D,C_D)) (C_C _ _)) -> 717 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 718 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 719 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_F _,C_F _)) _) -> 720 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 721 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_E _,C_E _)) _) -> 722 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_D,C_D)) (C_A)) -> 723 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_F _,C_D)) _) -> 724 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_E _,C_D)) (C_A)) -> 725 
  C_C ((C_F _,C_D)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 726 
  C_C ((C_E _,C_E C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 727 
  C_C ((C_E C_D,C_E _)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 728 
  C_C ((C_D,C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 729 
  C_C ((C_E _,C_E (C_F _))) (C_B C_D _) -> 730 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 731 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 732 
  C_C ((C_E _,C_F _)) (C_B C_D _) -> 733 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_A)) -> 734 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_D,C_D)) _) -> 735 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 736 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C _ (C_C _ _)) -> 737 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_D,C_E _)) _) -> 738 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_D,C_D)) (C_B _ _)) -> 739 
  C_C ((C_F _,C_F _)) (C_C ((C_D,C_F _)) (C_A)) -> 740 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 741 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 742 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_E _,C_D)) (C_A)) -> 743 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_D,C_F _)) (C_A)) -> 744 
  C_C ((C_E _,C_F _)) (C_C ((C_D,C_E _)) (C_A)) -> 745 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_D,C_E _)) _) -> 746 
  C_C ((C_E _,C_E _)) (C_C ((C_D,C_D)) (C_B _ _)) -> 747 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_E _,C_F _)) _) -> 748 
  C_C ((C_E C_D,C_F _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 749 
  C_C ((C_D,C_D)) (C_C ((C_D,C_D)) (C_B _ _)) -> 750 
  C_C _ (C_C ((C_D,C_F _)) (C_A)) -> 751 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_E _,C_E _)) _) -> 752 
  C_C ((C_F ((_,_)),C_D)) (C_C _ _) -> 753 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_E _,C_E _)) _) -> 754 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_D,C_D)) (C_A)) -> 755 
  C_C ((C_E _,C_F _)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 756 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C _ (C_A)) -> 757 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 758 
  C_C ((C_F ((_,_)),C_D)) (C_C _ (C_C _ _)) -> 759 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_E _,C_D)) _) -> 760 
  C_C ((C_E (C_E _),C_D)) (C_C _ (C_B _ _)) -> 761 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_A) -> 762 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 763 
  C_C ((C_E _,C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 764 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 765 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_E _,C_E _)) _) -> 766 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_F _,C_E _)) _) -> 767 
  C_C ((C_E _,C_E _)) (C_C ((C_D,C_E _)) (C_A)) -> 768 
  C_C ((C_E C_D,C_D)) (C_B (C_F _) _) -> 769 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 770 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_D,C_D)) (C_C _ _)) -> 771 
  C_C ((C_E _,C_F _)) (C_C _ _) -> 772 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_D,C_F _)) _) -> 773 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_D,C_D)) (C_A)) -> 774 
  C_C ((C_D,C_D)) (C_C ((C_D,C_F _)) _) -> 775 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 776 
  C_C ((C_D,C_D)) (C_C ((C_D,C_D)) _) -> 777 
  C_C ((C_F _,C_F _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 778 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 779 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_F _,C_D)) _) -> 780 
  C_C _ (C_C _ (C_A)) -> 781 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_A)) -> 782 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_E _,C_F _)) _) -> 783 
  C_C ((C_F _,C_E (C_E _))) (C_C _ (C_C _ _)) -> 784 
  C_C ((C_E _,C_E _)) (C_C ((C_D,C_D)) (C_C _ _)) -> 785 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_A)) -> 786 
  C_C ((C_F _,C_F _)) (C_C ((C_F _,C_D)) _) -> 787 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_D,C_E _)) (C_A)) -> 788 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 789 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_E _,C_F _)) (C_A)) -> 790 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 791 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_F _,C_F _)) _) -> 792 
  C_C ((C_E C_D,C_D)) (C_C ((C_D,C_F _)) (C_A)) -> 793 
  C_C ((C_E C_D,C_E _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 794 
  C_C ((C_F _,C_E _)) (C_B (C_E _) _) -> 795 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 796 
  C_C ((C_E _,C_F _)) (C_C ((C_E _,C_D)) (C_A)) -> 797 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 798 
  C_C ((C_D,C_E _)) (C_C ((C_D,C_D)) (C_A)) -> 799 
  C_C ((C_E C_D,C_F _)) (C_C ((C_E _,C_D)) _) -> 800 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_A)) -> 801 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 802 
  C_C ((C_E C_D,C_E _)) (C_C ((C_F _,C_F _)) (C_A)) -> 803 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 804 
  C_C ((C_E _,C_E (C_E _))) (C_B _ _) -> 805 
  C_C ((C_D,C_E _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 806 
  C_C ((C_F _,C_F ((_,_)))) (C_B (C_E _) _) -> 807 
  C_C ((C_E C_D,C_F _)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 808 
  C_C ((C_E _,C_E _)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 809 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_A) -> 810 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 811 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 812 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 813 
  C_C ((C_F _,C_E _)) (C_C ((C_E _,C_E _)) _) -> 814 
  C_C ((C_F _,C_D)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 815 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_B (C_E _) _) -> 816 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 817 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 818 
  C_C ((C_E C_D,C_D)) (C_C ((C_D,C_D)) (C_C _ _)) -> 819 
  C_C ((C_D,C_F _)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 820 
  C_C ((C_E C_D,C_F _)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 821 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 822 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 823 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C _ (C_C _ _)) -> 824 
  C_C ((C_D,C_E C_D)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 825 
  C_C ((C_D,C_E (C_F _))) (C_B (C_F _) _) -> 826 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C _ (C_A)) -> 827 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 828 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 829 
  C_C ((C_E C_D,C_E _)) (C_C ((C_F _,C_F _)) _) -> 830 
  C_C ((C_E C_D,C_F _)) (C_C ((C_F _,C_D)) _) -> 831 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C _ (C_C _ _)) -> 832 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_F _,C_F _)) _) -> 833 
  C_C ((C_F _,C_E (C_E _))) (C_B C_D _) -> 834 
  C_C _ (C_C ((C_D,C_E _)) (C_A)) -> 835 
  C_C ((C_E C_D,C_E (C_F _))) (C_B C_D _) -> 836 
  C_C ((C_F _,C_F ((_,_)))) (C_C _ _) -> 837 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C _ (C_A)) -> 838 
  C_C ((C_F _,C_E _)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 839 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_A)) -> 840 
  C_C ((C_E _,C_D)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 841 
  C_C ((C_E C_D,C_F ((_,_)))) (C_B (C_E _) _) -> 842 
  C_C ((C_E C_D,C_E (C_E _))) (C_B (C_E _) _) -> 843 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 844 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_A)) -> 845 
  C_C ((C_D,C_F _)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 846 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_D,C_F _)) _) -> 847 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 848 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_F _,C_E _)) _) -> 849 
  C_C ((C_E C_D,C_E _)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 850 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_A)) -> 851 
  C_C ((C_F _,C_E _)) (C_C ((C_D,C_E _)) (C_A)) -> 852 
  C_C ((C_F _,C_E (C_E _))) (C_B _ _) -> 853 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 854 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 855 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 856 
  C_C ((C_E _,C_E _)) (C_C ((C_F _,C_D)) _) -> 857 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_F _,C_F _)) _) -> 858 
  C_C _ (C_C ((C_F _,C_F _)) (C_C _ _)) -> 859 
  C_C ((C_E C_D,C_E (C_F _))) (C_B (C_E _) _) -> 860 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_D,C_E _)) (C_A)) -> 861 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 862 
  C_C ((C_F _,C_E _)) (C_C ((C_E _,C_D)) (C_A)) -> 863 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_E _,C_F _)) _) -> 864 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_D,C_E _)) _) -> 865 
  C_C ((C_E _,C_D)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 866 
  C_C ((C_E (C_F _),C_D)) (C_B _ _) -> 867 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_F _,C_D)) _) -> 868 
  C_C ((C_F _,C_E C_D)) (C_C ((C_F _,C_F _)) _) -> 869 
  C_C ((C_E (C_F _),C_E (C_E _))) _ -> 870 
  C_C ((C_E _,C_E (C_F _))) (C_B (C_E _) _) -> 871 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_B (C_F _) _) -> 872 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_F _,C_E _)) _) -> 873 
  C_C ((C_E C_D,C_F _)) (C_C ((C_F _,C_D)) (C_A)) -> 874 
  C_C ((C_F _,C_E _)) (C_B (C_F _) _) -> 875 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 876 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 877 
  C_C ((C_E (C_E _),C_E _)) (C_B (C_F _) _) -> 878 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 879 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_D,C_D)) (C_A)) -> 880 
  C_C ((C_F _,C_F _)) (C_C ((C_D,C_D)) (C_A)) -> 881 
  C_C ((C_F _,C_F _)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 882 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 883 
  C_C ((C_F _,C_D)) (C_C _ (C_B _ _)) -> 884 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_D,C_F _)) _) -> 885 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_E _,C_F _)) _) -> 886 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_D,C_D)) (C_B _ _)) -> 887 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_D,C_F _)) (C_A)) -> 888 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_E _,C_D)) _) -> 889 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C _ (C_B _ _)) -> 890 
  C_C ((C_E _,C_D)) (C_C ((C_D,C_D)) _) -> 891 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 892 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 893 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 894 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 895 
  C_C _ (C_C ((C_D,C_F _)) _) -> 896 
  C_C ((C_D,C_D)) (C_B _ _) -> 897 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 898 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_F _,C_F _)) _) -> 899 
  C_C ((C_F _,C_E (C_F _))) (C_B _ _) -> 900 
  C_C ((C_E (C_E _),C_F _)) _ -> 901 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 902 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_D,C_E _)) (C_A)) -> 903 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 904 
  C_C ((C_D,C_E _)) (C_C _ (C_B _ _)) -> 905 
  C_C ((C_E C_D,C_F _)) (C_C _ (C_B _ _)) -> 906 
  C_C ((C_E _,C_E _)) (C_C ((C_F _,C_E _)) _) -> 907 
  C_C ((C_F _,C_E _)) (C_C ((C_E _,C_D)) _) -> 908 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 909 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_F _,C_D)) (C_A)) -> 910 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_A)) -> 911 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_F _,C_E _)) _) -> 912 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 913 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_D,C_D)) (C_A)) -> 914 
  C_C ((C_D,C_F _)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 915 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_F _,C_E _)) _) -> 916 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_A)) -> 917 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 918 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_D,C_D)) (C_B _ _)) -> 919 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 920 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 921 
  C_C _ (C_C ((C_E _,C_E _)) _) -> 922 
  C_C ((C_E _,C_E (C_F _))) (C_C _ (C_A)) -> 923 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_A)) -> 924 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 925 
  C_C ((C_F _,C_F _)) (C_A) -> 926 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 927 
  C_C ((C_E _,C_F _)) (C_C _ (C_C _ _)) -> 928 
  C_C ((C_E C_D,C_F _)) (C_B (C_E _) _) -> 929 
  C_C ((C_D,C_E _)) (C_C ((C_E _,C_D)) (C_A)) -> 930 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_F _,C_F _)) _) -> 931 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_A)) -> 932 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_D,C_F _)) (C_A)) -> 933 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 934 
  C_C ((C_E C_D,C_E _)) (C_C ((C_E _,C_E _)) (C_A)) -> 935 
  C_C ((C_E (C_E _),C_D)) (C_A) -> 936 
  C_C ((C_F _,C_F _)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 937 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 938 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 939 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 940 
  C_C ((C_D,C_E (C_F _))) (C_C _ _) -> 941 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 942 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_D,C_E _)) _) -> 943 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C _ (C_A)) -> 944 
  C_C ((C_E C_D,C_E (C_E _))) (C_B (C_F _) _) -> 945 
  C_C ((C_E C_D,C_D)) (C_C ((C_D,C_D)) (C_A)) -> 946 
  C_C ((C_E C_D,C_E _)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 947 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_D,C_D)) (C_C _ _)) -> 948 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_D,C_E _)) _) -> 949 
  C_C ((C_E _,C_E C_D)) (C_C _ (C_C _ _)) -> 950 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 951 
  C_C ((C_D,C_E (C_F _))) _ -> 952 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_E _,C_D)) (C_A)) -> 953 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_B _ _) -> 954 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 955 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_D,C_E _)) (C_A)) -> 956 
  C_C ((C_D,C_D)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 957 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 958 
  C_C ((C_D,C_F _)) (C_C ((C_D,C_D)) _) -> 959 
  C_C ((C_E (C_F _),C_E C_D)) (C_B _ _) -> 960 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 961 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 962 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 963 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 964 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_F _,C_E _)) (C_A)) -> 965 
  C_C _ (C_C ((C_D,C_D)) (C_A)) -> 966 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 967 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_A) -> 968 
  C_C ((C_E _,C_F ((_,_)))) (C_B (C_E _) _) -> 969 
  C_C ((C_F ((_,_)),C_E _)) (C_B (C_F _) _) -> 970 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_F _,C_F _)) _) -> 971 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_D,C_D)) (C_A)) -> 972 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_E _,C_E _)) _) -> 973 
  C_C ((C_E (C_F _),C_E _)) _ -> 974 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 975 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_D,C_D)) (C_C _ _)) -> 976 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_A)) -> 977 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 978 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 979 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_F _,C_D)) _) -> 980 
  C_C ((C_F _,C_D)) (C_C ((C_D,C_D)) _) -> 981 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_E _,C_D)) _) -> 982 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 983 
  C_C ((C_E C_D,C_D)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 984 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 985 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_D,C_D)) (C_A)) -> 986 
  C_C ((C_E C_D,C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 987 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_D,C_D)) (C_A)) -> 988 
  C_C ((C_E _,C_E _)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 989 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C _ (C_C _ _)) -> 990 
  C_C ((C_F _,C_E _)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 991 
  C_C ((C_F _,C_F _)) (C_B (C_F _) _) -> 992 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_E _,C_D)) (C_A)) -> 993 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 994 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_F _,C_D)) _) -> 995 
  C_C _ (C_C ((C_E _,C_E _)) (C_A)) -> 996 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 997 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_E _,C_F _)) _) -> 998 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 999 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_F _,C_F _)) _) -> 1000 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 1001 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_E _,C_F _)) (C_A)) -> 1002 
  C_C ((C_E C_D,C_F _)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 1003 
  C_C ((C_E C_D,C_E (C_F _))) (C_A) -> 1004 
  C_C ((C_E _,C_E _)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 1005 
  C_C ((C_E C_D,C_F _)) (C_C ((C_D,C_D)) _) -> 1006 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_F _,C_F _)) _) -> 1007 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_D,C_D)) _) -> 1008 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 1009 
