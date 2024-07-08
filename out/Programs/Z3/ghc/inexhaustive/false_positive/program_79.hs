module Program_22 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B B_B b | C_C ((B_B,B_B)) (B_A B_B b)
data B_B = C_D | C_E B_B | C_F ((B_B,B_B))

v_a :: B_A Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B (C_E C_D) _ -> 1 
  C_B (C_E (C_E _)) _ -> 2 
  C_B (C_F ((C_F _,C_D))) _ -> 3 
  C_B (C_F ((C_D,C_E _))) _ -> 4 
  C_B (C_F ((C_F _,C_F _))) _ -> 5 
  C_B (C_F ((C_E _,C_F _))) _ -> 6 
  C_C ((C_E (C_F _),C_E _)) (C_C _ _) -> 7 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_A)) -> 8 
  C_C ((C_E (C_F _),C_E C_D)) (C_C _ (C_B _ _)) -> 9 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_F _,C_F _)) _) -> 10 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 11 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_A)) -> 12 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C _ (C_C _ _)) -> 13 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 14 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_E _,C_D)) (C_A)) -> 15 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_F _,C_D)) _) -> 16 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 17 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 18 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 19 
  C_C ((C_F _,C_D)) (C_C ((C_E _,C_E _)) (C_A)) -> 20 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 21 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 22 
  C_C ((C_F _,C_F _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 23 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 24 
  C_C ((C_E _,C_F _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 25 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 26 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 27 
  C_C ((C_E C_D,C_E (C_F _))) (C_C _ _) -> 28 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 29 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 30 
  C_C ((C_E (C_E _),C_E C_D)) (C_C _ (C_A)) -> 31 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_D,C_D)) (C_C _ _)) -> 32 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_E _,C_E _)) _) -> 33 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_A)) -> 34 
  C_C ((C_D,C_F _)) (C_C ((C_D,C_E _)) _) -> 35 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 36 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 37 
  C_C ((C_E C_D,C_D)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 38 
  C_C ((C_F _,C_E _)) (C_C ((C_F _,C_E _)) _) -> 39 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 40 
  C_C ((C_E (C_E _),C_E C_D)) (C_B (C_E _) _) -> 41 
  C_C ((C_E _,C_D)) (C_C ((C_E _,C_E _)) _) -> 42 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 43 
  C_C ((C_D,C_E _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 44 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_F _,C_D)) _) -> 45 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_D,C_E _)) (C_A)) -> 46 
  C_C ((C_E _,C_E _)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 47 
  C_C ((C_E C_D,C_F ((_,_)))) (C_B (C_F _) _) -> 48 
  C_C ((C_F _,C_D)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 49 
  C_C ((C_E (C_F _),C_E C_D)) (C_C _ (C_A)) -> 50 
  C_C ((C_E (C_F _),C_D)) (C_B (C_E _) _) -> 51 
  C_C ((C_E (C_F _),C_F _)) (C_B (C_F _) _) -> 52 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 53 
  C_C ((C_F _,C_E C_D)) (C_B _ _) -> 54 
  C_C ((C_E (C_F _),C_F _)) (C_C _ _) -> 55 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_A)) -> 56 
  C_C ((C_E _,C_E C_D)) (C_C ((C_D,C_D)) (C_A)) -> 57 
  C_C ((C_E C_D,C_E C_D)) _ -> 58 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 59 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 60 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 61 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 62 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C _ (C_A)) -> 63 
  C_C ((C_E (C_E _),C_E C_D)) (C_B _ _) -> 64 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_F _,C_D)) _) -> 65 
  C_C ((C_E (C_E _),C_E _)) (C_B (C_E _) _) -> 66 
  C_C ((C_E (C_E _),C_E _)) (C_C _ (C_C _ _)) -> 67 
  C_C ((C_F ((_,_)),C_F _)) (C_B C_D _) -> 68 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 69 
  C_C ((C_F _,C_E C_D)) (C_B (C_F _) _) -> 70 
  C_C ((C_E _,C_E C_D)) (C_C ((C_E _,C_E _)) _) -> 71 
  C_C ((C_E _,C_E C_D)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 72 
  C_C ((C_E _,C_D)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 73 
  C_C ((C_D,C_F _)) (C_C ((C_D,C_D)) (C_B _ _)) -> 74 
  C_C ((C_E _,C_F _)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 75 
  C_C ((C_E C_D,C_D)) (C_C ((C_E _,C_E _)) _) -> 76 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_E _,C_F _)) (C_A)) -> 77 
  C_C ((C_E C_D,C_F _)) (C_A) -> 78 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_D,C_D)) _) -> 79 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 80 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 81 
  C_C ((C_F _,C_E C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 82 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 83 
  C_C ((C_E (C_E _),C_F _)) (C_C _ (C_A)) -> 84 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_E _,C_F _)) _) -> 85 
  C_C ((C_D,C_E _)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 86 
  C_C ((C_D,C_D)) (C_C ((C_D,C_D)) (C_A)) -> 87 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 88 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 89 
  C_C ((C_E C_D,C_E C_D)) (C_B (C_E _) _) -> 90 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_D,C_F _)) _) -> 91 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 92 
  C_C ((C_E _,C_E (C_E _))) (C_C _ (C_C _ _)) -> 93 
  C_C ((C_E C_D,C_E _)) (C_A) -> 94 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 95 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_A)) -> 96 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_E _,C_D)) (C_A)) -> 97 
  C_C ((C_D,C_F _)) (C_B _ _) -> 98 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 99 
  C_C ((C_E C_D,C_E _)) (C_C ((C_D,C_E _)) (C_A)) -> 100 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 101 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_E _,C_F _)) _) -> 102 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 103 
  C_C ((C_F ((_,_)),C_F ((_,_)))) _ -> 104 
  C_C ((C_E _,C_D)) (C_C ((C_E _,C_D)) (C_A)) -> 105 
  C_C ((C_F _,C_F ((_,_)))) (C_B C_D _) -> 106 
  C_C ((C_E _,C_E _)) (C_C ((C_E _,C_E _)) (C_A)) -> 107 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 108 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_E _,C_D)) _) -> 109 
  C_C ((C_E _,C_E C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 110 
  C_C ((C_E _,C_E C_D)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 111 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_E _,C_E _)) _) -> 112 
  C_C ((C_F _,C_D)) (C_C _ (C_A)) -> 113 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 114 
  C_C ((C_F ((_,_)),C_F _)) (C_C _ (C_B _ _)) -> 115 
  C_C ((C_E C_D,C_D)) (C_C ((C_F _,C_E _)) _) -> 116 
  C_C ((C_F _,C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 117 
  C_C ((C_D,C_E (C_E _))) (C_C _ (C_A)) -> 118 
  C_C ((C_F ((_,_)),C_F _)) (C_B _ _) -> 119 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_A)) -> 120 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_D,C_D)) (C_A)) -> 121 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_D,C_E _)) (C_A)) -> 122 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 123 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_E _,C_D)) _) -> 124 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 125 
  C_C ((C_F ((_,_)),C_E _)) (C_B (C_E _) _) -> 126 
  C_C ((C_E _,C_E (C_E _))) (C_C _ (C_B _ _)) -> 127 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 128 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 129 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_E _,C_E _)) _) -> 130 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C _ (C_A)) -> 131 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 132 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 133 
  C_C ((C_E _,C_D)) (C_C _ (C_A)) -> 134 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_E _,C_D)) (C_A)) -> 135 
  C_C _ (C_C _ (C_B _ _)) -> 136 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 137 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 138 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 139 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_A)) -> 140 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 141 
  C_C ((C_F _,C_F ((_,_)))) (C_C _ (C_C _ _)) -> 142 
  C_C ((C_E C_D,C_E (C_F _))) (C_C _ (C_A)) -> 143 
  C_C ((C_D,C_E _)) (C_B C_D _) -> 144 
  C_C ((C_E _,C_E (C_F _))) _ -> 145 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_E _,C_D)) (C_A)) -> 146 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 147 
  C_C ((C_D,C_E _)) (C_C ((C_D,C_F _)) (C_A)) -> 148 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 149 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_D,C_D)) (C_A)) -> 150 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_E _,C_F _)) _) -> 151 
  C_C ((C_D,C_E _)) (C_C ((C_D,C_D)) _) -> 152 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_D,C_D)) (C_B _ _)) -> 153 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 154 
  C_C ((C_D,C_F _)) (C_C _ (C_A)) -> 155 
  C_C ((C_E _,C_F _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 156 
  C_C ((C_E C_D,C_E (C_E _))) _ -> 157 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_D,C_D)) (C_B _ _)) -> 158 
  C_C ((C_D,C_E C_D)) (C_C ((C_F _,C_F _)) _) -> 159 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 160 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_B C_D _) -> 161 
  C_C ((C_E _,C_E C_D)) (C_C ((C_D,C_D)) (C_C _ _)) -> 162 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 163 
  C_C ((C_D,C_F _)) (C_C ((C_F _,C_D)) _) -> 164 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_E _,C_E _)) _) -> 165 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_F _,C_F _)) _) -> 166 
  C_C ((C_E _,C_E C_D)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 167 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 168 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_E _,C_F _)) (C_A)) -> 169 
  C_C ((C_F ((_,_)),C_F _)) (C_B (C_F _) _) -> 170 
  C_C ((C_D,C_E _)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 171 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_B C_D _) -> 172 
  C_C ((C_E _,C_D)) (C_C ((C_D,C_D)) (C_B _ _)) -> 173 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_F _,C_F _)) _) -> 174 
  C_C ((C_D,C_D)) (C_C ((C_E _,C_E _)) (C_A)) -> 175 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 176 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 177 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 178 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_F _,C_E _)) _) -> 179 
  C_C ((C_F _,C_E _)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 180 
  C_C ((C_E _,C_E C_D)) (C_C _ (C_B _ _)) -> 181 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_D,C_D)) _) -> 182 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_D,C_D)) (C_A)) -> 183 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 184 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_D,C_F _)) (C_A)) -> 185 
  C_C ((C_F _,C_E C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 186 
  C_C ((C_D,C_F _)) (C_B (C_E _) _) -> 187 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_D,C_F _)) (C_A)) -> 188 
  C_C ((C_E _,C_F _)) (C_C ((C_E _,C_F _)) (C_A)) -> 189 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 190 
  C_C _ (C_C ((C_F _,C_F _)) (C_B _ _)) -> 191 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_F _,C_E _)) _) -> 192 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 193 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_D,C_F _)) _) -> 194 
  C_C ((C_E _,C_E C_D)) (C_C ((C_F _,C_F _)) _) -> 195 
  C_C ((C_E _,C_F _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 196 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_D,C_D)) (C_B _ _)) -> 197 
  C_C ((C_F _,C_E C_D)) (C_C ((C_D,C_E _)) _) -> 198 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 199 
  C_C ((C_E C_D,C_E _)) (C_C ((C_F _,C_D)) _) -> 200 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 201 
  C_C ((C_E C_D,C_F _)) (C_C ((C_F _,C_E _)) _) -> 202 
  C_C ((C_F ((_,_)),C_F _)) (C_C _ (C_C _ _)) -> 203 
  C_C ((C_E C_D,C_E _)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 204 
  C_C ((C_F _,C_E C_D)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 205 
  C_C ((C_E C_D,C_F _)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 206 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 207 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 208 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_D,C_D)) (C_C _ _)) -> 209 
  C_C ((C_E _,C_E _)) (C_B C_D _) -> 210 
  C_C ((C_F _,C_D)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 211 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 212 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_E _,C_D)) (C_A)) -> 213 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_E _,C_E _)) _) -> 214 
  C_C ((C_D,C_F _)) (C_C _ (C_C _ _)) -> 215 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_F _,C_D)) (C_A)) -> 216 
  C_C ((C_E (C_F _),C_F _)) _ -> 217 
  C_C ((C_E _,C_D)) (C_C ((C_F _,C_D)) (C_A)) -> 218 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 219 
  C_C ((C_E C_D,C_D)) (C_C ((C_D,C_E _)) _) -> 220 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_D,C_D)) (C_C _ _)) -> 221 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 222 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_D,C_D)) (C_A)) -> 223 
  C_C ((C_E _,C_E C_D)) (C_C ((C_E _,C_D)) _) -> 224 
  C_C ((C_D,C_D)) (C_C ((C_E _,C_D)) (C_A)) -> 225 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 226 
  C_C ((C_E _,C_E C_D)) (C_C ((C_F _,C_E _)) _) -> 227 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 228 
  C_C ((C_E C_D,C_F ((_,_)))) (C_A) -> 229 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 230 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 231 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 232 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_E _,C_D)) (C_A)) -> 233 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 234 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_F _,C_E _)) _) -> 235 
  C_C ((C_E _,C_D)) _ -> 236 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_E _,C_D)) _) -> 237 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 238 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_F _,C_D)) _) -> 239 
  C_C ((C_D,C_D)) (C_B (C_F _) _) -> 240 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_E _,C_F _)) _) -> 241 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_F _,C_D)) _) -> 242 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 243 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_B C_D _) -> 244 
  C_C ((C_E _,C_E (C_F _))) (C_C _ _) -> 245 
  C_C ((C_F _,C_D)) (C_C ((C_E _,C_F _)) (C_A)) -> 246 
  C_C ((C_E C_D,C_D)) (C_B _ _) -> 247 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 248 
  C_C ((C_E C_D,C_E _)) (C_C ((C_D,C_D)) (C_B _ _)) -> 249 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_E _,C_F _)) (C_A)) -> 250 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_E _,C_F _)) _) -> 251 
  C_C ((C_E C_D,C_E _)) (C_C ((C_E _,C_F _)) (C_A)) -> 252 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 253 
  C_C _ (C_C ((C_E _,C_F _)) _) -> 254 
  C_C ((C_E (C_F _),C_D)) (C_B C_D _) -> 255 
  C_C ((C_E C_D,C_F _)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 256 
  C_C ((C_F _,C_E (C_F _))) (C_A) -> 257 
  C_C ((C_E (C_E _),C_E C_D)) (C_A) -> 258 
  C_C ((C_E _,C_F _)) (C_C ((C_D,C_D)) (C_A)) -> 259 
  C_C ((C_D,C_D)) _ -> 260 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 261 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_E _,C_D)) _) -> 262 
  C_C ((C_F _,C_D)) (C_C ((C_F _,C_F _)) _) -> 263 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_D,C_F _)) (C_A)) -> 264 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_E _,C_E _)) (C_A)) -> 265 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 266 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 267 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 268 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_F _,C_D)) _) -> 269 
  C_C ((C_E _,C_F _)) (C_B (C_F _) _) -> 270 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 271 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 272 
  C_C ((C_E C_D,C_F ((_,_)))) _ -> 273 
  C_C ((C_F _,C_F _)) (C_C ((C_F _,C_E _)) _) -> 274 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_F _,C_D)) _) -> 275 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_E _,C_E _)) (C_A)) -> 276 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_F _,C_F _)) (C_A)) -> 277 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_D,C_F _)) (C_A)) -> 278 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_D,C_E _)) (C_A)) -> 279 
  C_C _ (C_C ((C_E _,C_D)) (C_A)) -> 280 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_E _,C_F _)) _) -> 281 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 282 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_D,C_E _)) _) -> 283 
  C_C ((C_F ((_,_)),C_F _)) (C_C _ _) -> 284 
  C_C ((C_D,C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 285 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_A)) -> 286 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 287 
  C_C ((C_E (C_E _),C_E _)) (C_C _ _) -> 288 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 289 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 290 
  C_C ((C_E (C_E _),C_E _)) (C_C _ (C_A)) -> 291 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_F _,C_D)) (C_A)) -> 292 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_D,C_F _)) _) -> 293 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_F _,C_E _)) _) -> 294 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_F _,C_E _)) _) -> 295 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_D,C_D)) _) -> 296 
  C_C ((C_E (C_F _),C_D)) (C_C _ (C_C _ _)) -> 297 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 298 
  C_C ((C_F _,C_E (C_E _))) (C_B (C_E _) _) -> 299 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_B (C_F _) _) -> 300 
  C_C ((C_F _,C_F _)) (C_C ((C_D,C_D)) _) -> 301 
  C_C ((C_F _,C_E _)) (C_C ((C_E _,C_E _)) (C_A)) -> 302 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 303 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 304 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 305 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_F _,C_E _)) _) -> 306 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 307 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_D,C_F _)) _) -> 308 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_D,C_D)) _) -> 309 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 310 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 311 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_E _,C_F _)) _) -> 312 
  C_C ((C_E C_D,C_E (C_F _))) _ -> 313 
  C_C ((C_D,C_D)) (C_C ((C_E _,C_F _)) _) -> 314 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C _ _) -> 315 
  C_C ((C_D,C_E _)) (C_C ((C_F _,C_D)) (C_A)) -> 316 
  C_C ((C_D,C_E C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 317 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_D,C_F _)) (C_A)) -> 318 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_E _,C_D)) (C_A)) -> 319 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 320 
  C_C ((C_E _,C_E _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 321 
  C_C _ (C_C ((C_E _,C_F _)) (C_C _ _)) -> 322 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 323 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_E _,C_D)) _) -> 324 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_D,C_D)) _) -> 325 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_B (C_E _) _) -> 326 
  C_C ((C_D,C_E (C_E _))) (C_B (C_E _) _) -> 327 
  C_C ((C_F _,C_F _)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 328 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 329 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_F _,C_E _)) _) -> 330 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 331 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 332 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 333 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_A)) -> 334 
  C_C ((C_E _,C_D)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 335 
  C_C ((C_E (C_F _),C_D)) (C_C _ (C_B _ _)) -> 336 
  C_C ((C_F _,C_E (C_F _))) (C_C _ (C_A)) -> 337 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_E _,C_D)) (C_A)) -> 338 
  C_C ((C_E (C_F _),C_E (C_F _))) _ -> 339 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 340 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_F _,C_D)) _) -> 341 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_D,C_D)) (C_C _ _)) -> 342 
  C_C ((C_E _,C_F _)) (C_C ((C_F _,C_D)) (C_A)) -> 343 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 344 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C _ (C_B _ _)) -> 345 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_F _,C_F _)) _) -> 346 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 347 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 348 
  C_C ((C_E _,C_F _)) (C_C ((C_E _,C_E _)) (C_A)) -> 349 
  C_C ((C_F ((_,_)),C_E (C_E _))) _ -> 350 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 351 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 352 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 353 
  C_C ((C_E _,C_F _)) (C_C ((C_E _,C_E _)) _) -> 354 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_E _,C_D)) (C_A)) -> 355 
  C_C ((C_E _,C_E (C_F _))) (C_B _ _) -> 356 
  C_C ((C_F _,C_F _)) (C_C ((C_D,C_F _)) _) -> 357 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_D,C_D)) (C_A)) -> 358 
  C_C ((C_F ((_,_)),C_E _)) (C_C _ (C_C _ _)) -> 359 
  C_C ((C_D,C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 360 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_D,C_F _)) (C_A)) -> 361 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_A)) -> 362 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_F _,C_E _)) _) -> 363 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_D,C_F _)) _) -> 364 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 365 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 366 
  C_C ((C_F _,C_F _)) (C_C ((C_E _,C_F _)) _) -> 367 
  C_C ((C_E C_D,C_D)) (C_C _ (C_C _ _)) -> 368 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_F _,C_F _)) _) -> 369 
  C_C _ (C_B (C_E _) _) -> 370 
  C_C ((C_F _,C_E C_D)) (C_C ((C_D,C_F _)) (C_A)) -> 371 
  C_C ((C_E _,C_E C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 372 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 373 
  C_C ((C_D,C_D)) (C_C ((C_D,C_E _)) (C_A)) -> 374 
  C_C ((C_D,C_E C_D)) (C_C ((C_F _,C_E _)) _) -> 375 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 376 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_D,C_D)) (C_C _ _)) -> 377 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_E _,C_E _)) (C_A)) -> 378 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_A)) -> 379 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 380 
  C_C ((C_D,C_F ((_,_)))) (C_A) -> 381 
  C_C ((C_F _,C_F _)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 382 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_D,C_E _)) _) -> 383 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 384 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_F _,C_E _)) (C_A)) -> 385 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_E _,C_F _)) _) -> 386 
  C_C ((C_D,C_F _)) (C_C ((C_F _,C_E _)) (C_A)) -> 387 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_E _,C_D)) _) -> 388 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_E _,C_E _)) _) -> 389 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_D,C_D)) (C_B _ _)) -> 390 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_D,C_F _)) (C_A)) -> 391 
  C_C ((C_E _,C_F _)) (C_C ((C_D,C_F _)) _) -> 392 
  C_C ((C_F _,C_E C_D)) (C_C ((C_F _,C_D)) _) -> 393 
  C_C ((C_D,C_E (C_E _))) (C_B (C_F _) _) -> 394 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 395 
  C_C ((C_D,C_E C_D)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 396 
  C_C ((C_F _,C_E C_D)) (C_C ((C_E _,C_F _)) _) -> 397 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 398 
  C_C ((C_E C_D,C_F _)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 399 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_A)) -> 400 
  C_C ((C_E _,C_D)) (C_C ((C_D,C_D)) (C_A)) -> 401 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_E _,C_E _)) _) -> 402 
  C_C ((C_E C_D,C_F _)) (C_C _ (C_C _ _)) -> 403 
  C_C ((C_F _,C_F _)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 404 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 405 
  C_C ((C_D,C_E C_D)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 406 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 407 
  C_C ((C_E C_D,C_E _)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 408 
  C_C ((C_E _,C_E _)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 409 
  C_C ((C_E C_D,C_F _)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 410 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 411 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_F _,C_E _)) _) -> 412 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 413 
  C_C ((C_F _,C_E (C_F _))) (C_C _ (C_B _ _)) -> 414 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_A)) -> 415 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 416 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_F _,C_F _)) (C_A)) -> 417 
  C_C ((C_D,C_E (C_E _))) (C_C _ (C_B _ _)) -> 418 
  C_C ((C_E C_D,C_D)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 419 
  C_C ((C_D,C_E C_D)) (C_B _ _) -> 420 
  C_C ((C_E C_D,C_D)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 421 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_D,C_E _)) (C_A)) -> 422 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_D,C_E _)) (C_A)) -> 423 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 424 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_D,C_E _)) _) -> 425 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 426 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_E _,C_F _)) _) -> 427 
  C_C ((C_F _,C_E (C_F _))) (C_B (C_E _) _) -> 428 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 429 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_D,C_E _)) _) -> 430 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_D,C_D)) (C_A)) -> 431 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_D,C_E _)) (C_A)) -> 432 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_E _,C_D)) _) -> 433 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_D,C_D)) (C_C _ _)) -> 434 
  C_C _ (C_C _ (C_C _ _)) -> 435 
  C_C ((C_E C_D,C_F _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 436 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_A)) -> 437 
  C_C ((C_D,C_F _)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 438 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 439 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_D,C_E _)) (C_A)) -> 440 
  C_C ((C_E (C_E _),C_F _)) (C_C _ (C_C _ _)) -> 441 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C _ _) -> 442 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 443 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 444 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 445 
  C_C ((C_F _,C_D)) (C_C _ (C_C _ _)) -> 446 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 447 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 448 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_D,C_E _)) (C_A)) -> 449 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_A)) -> 450 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 451 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_F _,C_D)) _) -> 452 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_D,C_D)) _) -> 453 
  C_C ((C_E C_D,C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 454 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_A)) -> 455 
  C_C ((C_D,C_F _)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 456 
  C_C ((C_E _,C_E (C_F _))) (C_B (C_F _) _) -> 457 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 458 
  C_C ((C_E C_D,C_E C_D)) (C_B _ _) -> 459 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_B C_D _) -> 460 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_D,C_E _)) _) -> 461 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 462 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_E _,C_E _)) _) -> 463 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_B C_D _) -> 464 
  C_C _ (C_C ((C_F _,C_D)) _) -> 465 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 466 
  C_C ((C_E C_D,C_E (C_E _))) (C_C _ (C_B _ _)) -> 467 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_D,C_D)) _) -> 468 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_B (C_E _) _) -> 469 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 470 
  C_C ((C_F _,C_F _)) _ -> 471 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 472 
  C_C ((C_E _,C_E _)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 473 
  C_C ((C_E C_D,C_D)) (C_C ((C_F _,C_D)) _) -> 474 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 475 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 476 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_E _,C_D)) _) -> 477 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 478 
  C_C ((C_D,C_F _)) (C_C ((C_E _,C_E _)) (C_A)) -> 479 
  C_C ((C_E _,C_F ((_,_)))) (C_B C_D _) -> 480 
  C_C ((C_F _,C_D)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 481 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 482 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_A)) -> 483 
  C_C ((C_F _,C_E _)) (C_C ((C_D,C_D)) (C_A)) -> 484 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 485 
  C_C ((C_E C_D,C_E _)) (C_C ((C_E _,C_F _)) _) -> 486 
  C_C ((C_E _,C_E _)) (C_C ((C_D,C_D)) (C_A)) -> 487 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_D,C_D)) (C_C _ _)) -> 488 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_F _,C_D)) _) -> 489 
  C_C ((C_E C_D,C_E _)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 490 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_F _,C_F _)) _) -> 491 
  C_C ((C_E _,C_E C_D)) (C_B C_D _) -> 492 
  C_C ((C_F _,C_E C_D)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 493 
  C_C ((C_D,C_F ((_,_)))) (C_C _ _) -> 494 
  C_C ((C_F _,C_E C_D)) (C_C ((C_D,C_D)) (C_C _ _)) -> 495 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_D,C_F _)) _) -> 496 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 497 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 498 
  C_C ((C_D,C_E _)) _ -> 499 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_D,C_E _)) (C_A)) -> 500 
  C_C ((C_E _,C_D)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 501 
  C_C ((C_F _,C_E C_D)) (C_C _ _) -> 502 
  C_C ((C_E (C_F _),C_F _)) (C_C _ (C_A)) -> 503 
  C_C ((C_E C_D,C_E _)) (C_C ((C_E _,C_D)) (C_A)) -> 504 
  C_C ((C_E (C_E _),C_E _)) (C_C _ (C_B _ _)) -> 505 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 506 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_B (C_E _) _) -> 507 
  C_C ((C_D,C_E _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 508 
  C_C ((C_D,C_D)) (C_C ((C_F _,C_F _)) _) -> 509 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 510 
  C_C ((C_F _,C_F _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 511 
  C_C ((C_E C_D,C_D)) (C_C _ _) -> 512 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_D,C_F _)) (C_A)) -> 513 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_D,C_D)) _) -> 514 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_B (C_F _) _) -> 515 
  C_C ((C_F _,C_E _)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 516 
  C_C ((C_E (C_E _),C_F _)) (C_B (C_F _) _) -> 517 
  C_C ((C_E _,C_E C_D)) (C_B (C_F _) _) -> 518 
  C_C ((C_E C_D,C_E _)) (C_C ((C_F _,C_D)) (C_A)) -> 519 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 520 
  C_C ((C_E (C_E _),C_F _)) (C_B C_D _) -> 521 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_F _,C_D)) (C_A)) -> 522 
  C_C ((C_E _,C_F _)) (C_C ((C_D,C_D)) (C_B _ _)) -> 523 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 524 
  C_C ((C_E _,C_D)) (C_C _ (C_C _ _)) -> 525 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 526 
  C_C ((C_E _,C_F ((_,_)))) _ -> 527 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 528 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_A)) -> 529 
  C_C ((C_E _,C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 530 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 531 
  C_C ((C_E C_D,C_F _)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 532 
  C_C ((C_E _,C_D)) (C_C ((C_D,C_D)) (C_C _ _)) -> 533 
  C_C ((C_F _,C_E _)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 534 
  C_C ((C_E _,C_F _)) (C_C ((C_F _,C_E _)) (C_A)) -> 535 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_A)) -> 536 
  C_C ((C_D,C_F _)) (C_B C_D _) -> 537 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_D,C_F _)) (C_A)) -> 538 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_B _ _) -> 539 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_D,C_D)) (C_C _ _)) -> 540 
  C_C ((C_E (C_F _),C_E _)) (C_B _ _) -> 541 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 542 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_E _,C_D)) _) -> 543 
  C_C ((C_D,C_E C_D)) (C_C ((C_E _,C_D)) _) -> 544 
  C_C ((C_F _,C_F ((_,_)))) (C_C _ (C_B _ _)) -> 545 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_E _,C_D)) (C_A)) -> 546 
  C_C ((C_F _,C_E C_D)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 547 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_F _,C_D)) _) -> 548 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C _ _) -> 549 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_F _,C_F _)) _) -> 550 
  C_C ((C_E (C_E _),C_F _)) (C_C _ (C_B _ _)) -> 551 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_D,C_F _)) (C_A)) -> 552 
  C_C ((C_F _,C_F _)) (C_C ((C_E _,C_E _)) (C_A)) -> 553 
  C_C ((C_E _,C_E C_D)) (C_C ((C_D,C_E _)) (C_A)) -> 554 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C _ (C_C _ _)) -> 555 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_D,C_D)) (C_C _ _)) -> 556 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_D,C_F _)) _) -> 557 
  C_C ((C_D,C_E _)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 558 
  C_C ((C_E _,C_E _)) (C_C ((C_D,C_F _)) _) -> 559 
  C_C ((C_E (C_E _),C_E C_D)) (C_B (C_F _) _) -> 560 
  C_C ((C_F _,C_E _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 561 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 562 
  C_C ((C_F _,C_F _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 563 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_A)) -> 564 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 565 
  C_C ((C_F _,C_E (C_F _))) (C_C _ _) -> 566 
  C_C ((C_D,C_D)) (C_C ((C_D,C_E _)) _) -> 567 
  C_C ((C_E C_D,C_D)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 568 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 569 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_D,C_D)) (C_A)) -> 570 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 571 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_E _,C_F _)) (C_A)) -> 572 
  C_C ((C_E (C_F _),C_F _)) (C_B (C_E _) _) -> 573 
  C_C ((C_F _,C_D)) (C_C ((C_F _,C_E _)) _) -> 574 
  C_C ((C_E C_D,C_D)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 575 
  C_C ((C_E _,C_E _)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 576 
  C_C ((C_E (C_F _),C_F _)) (C_A) -> 577 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_A)) -> 578 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_D,C_E _)) _) -> 579 
  C_C ((C_F _,C_D)) (C_C ((C_D,C_E _)) (C_A)) -> 580 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_A)) -> 581 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 582 
  C_C ((C_F _,C_F _)) (C_C ((C_F _,C_F _)) _) -> 583 
  C_C _ (C_C ((C_F _,C_E _)) (C_C _ _)) -> 584 
  C_C ((C_D,C_D)) (C_C _ (C_A)) -> 585 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 586 
  C_C ((C_D,C_E C_D)) (C_C ((C_D,C_D)) (C_B _ _)) -> 587 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_E _,C_E _)) _) -> 588 
  C_C ((C_E (C_F _),C_D)) (C_B (C_F _) _) -> 589 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_F _,C_D)) (C_A)) -> 590 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 591 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_F _,C_F _)) (C_A)) -> 592 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 593 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_F _,C_F _)) _) -> 594 
  C_C ((C_F ((_,_)),C_D)) _ -> 595 
  C_C ((C_F _,C_E C_D)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 596 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_D,C_F _)) _) -> 597 
  C_C ((C_F _,C_E _)) (C_C _ (C_B _ _)) -> 598 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_A)) -> 599 
  C_C ((C_E C_D,C_E (C_F _))) (C_B (C_F _) _) -> 600 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_F _,C_D)) _) -> 601 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 602 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_F _,C_D)) (C_A)) -> 603 
  C_C ((C_F _,C_F _)) (C_B (C_E _) _) -> 604 
  C_C ((C_D,C_E C_D)) (C_C ((C_E _,C_E _)) _) -> 605 
  C_C ((C_E _,C_F _)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 606 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_A)) -> 607 
  C_C ((C_E _,C_E C_D)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 608 
  C_C ((C_F _,C_E C_D)) (C_C _ (C_B _ _)) -> 609 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_A)) -> 610 
  C_C ((C_E _,C_F _)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 611 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 612 
  C_C ((C_E _,C_D)) (C_C ((C_D,C_E _)) _) -> 613 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 614 
  C_C ((C_E (C_E _),C_D)) (C_B (C_E _) _) -> 615 
  C_C ((C_F _,C_E _)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 616 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_F _,C_F _)) _) -> 617 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 618 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 619 
  C_C ((C_E _,C_E C_D)) (C_C ((C_E _,C_F _)) _) -> 620 
  C_C ((C_D,C_E C_D)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 621 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_E _,C_D)) _) -> 622 
  C_C ((C_E C_D,C_E _)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 623 
  C_C ((C_E _,C_E _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 624 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_E _,C_E _)) _) -> 625 
  C_C ((C_F _,C_E _)) (C_B _ _) -> 626 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 627 
  C_C ((C_E _,C_E (C_E _))) (C_B (C_E _) _) -> 628 
  C_C ((C_D,C_E C_D)) (C_B (C_F _) _) -> 629 
  C_C _ (C_C ((C_D,C_F _)) (C_B _ _)) -> 630 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 631 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 632 
  C_C ((C_D,C_F ((_,_)))) (C_C _ (C_A)) -> 633 
  C_C ((C_E C_D,C_D)) (C_A) -> 634 
  C_C ((C_E C_D,C_D)) (C_C ((C_E _,C_F _)) (C_A)) -> 635 
  C_C ((C_F _,C_F _)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 636 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_D,C_F _)) _) -> 637 
  C_C ((C_D,C_E C_D)) (C_C ((C_F _,C_D)) _) -> 638 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_E _,C_D)) _) -> 639 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 640 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_D,C_D)) (C_C _ _)) -> 641 
  C_C ((C_E C_D,C_D)) (C_C _ (C_B _ _)) -> 642 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 643 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_E _,C_E _)) (C_A)) -> 644 
  C_C ((C_F _,C_D)) (C_C ((C_E _,C_F _)) _) -> 645 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 646 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_A)) -> 647 
  C_C ((C_D,C_F _)) (C_C ((C_D,C_F _)) _) -> 648 
  C_C ((C_F _,C_E _)) (C_C ((C_F _,C_D)) _) -> 649 
  C_C ((C_D,C_E C_D)) (C_C ((C_E _,C_F _)) (C_A)) -> 650 
  C_C ((C_E C_D,C_D)) (C_C _ (C_A)) -> 651 
  C_C ((C_E _,C_E C_D)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 652 
  C_C ((C_D,C_F _)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 653 
  C_C ((C_E C_D,C_E (C_E _))) (C_C _ (C_C _ _)) -> 654 
  C_C ((C_E C_D,C_D)) (C_C ((C_F _,C_D)) (C_A)) -> 655 
  C_C ((C_E (C_E _),C_E C_D)) _ -> 656 
  C_C ((C_E (C_F _),C_E C_D)) (C_C _ _) -> 657 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_A)) -> 658 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_D,C_E _)) (C_A)) -> 659 
  C_C ((C_D,C_E _)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 660 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 661 
  C_C ((C_F _,C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 662 
  C_C ((C_D,C_E _)) (C_C ((C_F _,C_F _)) _) -> 663 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_D,C_E _)) _) -> 664 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 665 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 666 
  C_C ((C_E _,C_D)) (C_C ((C_E _,C_D)) _) -> 667 
  C_C ((C_E _,C_F _)) (C_C ((C_F _,C_D)) _) -> 668 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_D,C_E _)) (C_A)) -> 669 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_A)) -> 670 
  C_C ((C_F ((_,_)),C_D)) (C_B C_D _) -> 671 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_A)) -> 672 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 673 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 674 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 675 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_D,C_F _)) (C_A)) -> 676 
  C_C ((C_F _,C_F _)) (C_B C_D _) -> 677 
  C_C ((C_F _,C_D)) (C_C ((C_D,C_D)) (C_A)) -> 678 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 679 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_F _,C_D)) (C_A)) -> 680 
  C_C ((C_D,C_E _)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 681 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_D,C_E _)) (C_A)) -> 682 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 683 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_A) -> 684 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_D,C_D)) (C_A)) -> 685 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_A)) -> 686 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_E _,C_E _)) _) -> 687 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_B (C_E _) _) -> 688 
  C_C ((C_F _,C_F _)) (C_C ((C_E _,C_D)) (C_A)) -> 689 
  C_C ((C_D,C_F _)) _ -> 690 
  C_C ((C_D,C_E C_D)) (C_C ((C_D,C_E _)) (C_A)) -> 691 
  C_C ((C_D,C_D)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 692 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_B _ _) -> 693 
  C_C ((C_E _,C_E C_D)) (C_C ((C_F _,C_D)) _) -> 694 
  C_C ((C_E _,C_E C_D)) (C_C ((C_E _,C_E _)) (C_A)) -> 695 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_E _,C_D)) _) -> 696 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_D,C_F _)) _) -> 697 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 698 
  C_C _ (C_C ((C_D,C_D)) (C_C _ _)) -> 699 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_D,C_E _)) _) -> 700 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_D,C_D)) (C_A)) -> 701 
  C_C ((C_E _,C_F _)) (C_C ((C_E _,C_D)) _) -> 702 
  C_C ((C_D,C_E _)) (C_C ((C_D,C_D)) (C_C _ _)) -> 703 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_D,C_E _)) _) -> 704 
  C_C ((C_E (C_F _),C_F ((_,_)))) _ -> 705 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_D,C_F _)) _) -> 706 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_F _,C_F _)) _) -> 707 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_E _,C_D)) (C_A)) -> 708 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_A)) -> 709 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 710 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_D,C_E _)) (C_A)) -> 711 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_F _,C_E _)) _) -> 712 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_A)) -> 713 
  C_C ((C_D,C_D)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 714 
  C_C ((C_E C_D,C_F _)) (C_C ((C_F _,C_F _)) (C_A)) -> 715 
  C_C ((C_E (C_F _),C_E C_D)) (C_B (C_E _) _) -> 716 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 717 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 718 
  C_C ((C_F _,C_E C_D)) (C_C ((C_D,C_D)) (C_A)) -> 719 
  C_C ((C_F _,C_E C_D)) (C_C ((C_D,C_F _)) _) -> 720 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_F _,C_F _)) _) -> 721 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_D,C_D)) _) -> 722 
  C_C ((C_D,C_E C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 723 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 724 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 725 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 726 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_F _,C_E _)) _) -> 727 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 728 
  C_C ((C_E (C_F _),C_F _)) (C_C _ (C_B _ _)) -> 729 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_D,C_D)) _) -> 730 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 731 
  C_C ((C_E _,C_E (C_E _))) (C_C _ (C_A)) -> 732 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 733 
  C_C ((C_E _,C_D)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 734 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 735 
  C_C ((C_E _,C_D)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 736 
  C_C ((C_F _,C_D)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 737 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 738 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_F _,C_D)) (C_A)) -> 739 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_D,C_E _)) _) -> 740 
  C_C ((C_D,C_F _)) (C_C ((C_D,C_D)) (C_C _ _)) -> 741 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_E _,C_D)) (C_A)) -> 742 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_D,C_F _)) _) -> 743 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_D,C_F _)) (C_A)) -> 744 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 745 
  C_C ((C_E (C_F _),C_E C_D)) _ -> 746 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_B (C_E _) _) -> 747 
  C_C ((C_F _,C_D)) (C_C ((C_E _,C_E _)) _) -> 748 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 749 
  C_C ((C_F _,C_F _)) (C_C ((C_E _,C_F _)) (C_A)) -> 750 
  C_C ((C_D,C_F _)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 751 
  C_C ((C_F _,C_F _)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 752 
  C_C ((C_F _,C_D)) (C_C ((C_D,C_F _)) (C_A)) -> 753 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 754 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 755 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_F _,C_E _)) _) -> 756 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_A)) -> 757 
  C_C ((C_E (C_E _),C_D)) (C_B (C_F _) _) -> 758 
  C_C ((C_E _,C_D)) (C_C ((C_F _,C_D)) _) -> 759 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 760 
  C_C ((C_E _,C_E C_D)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 761 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_E _,C_E _)) (C_A)) -> 762 
  C_C ((C_E C_D,C_F ((_,_)))) (C_B _ _) -> 763 
  C_C ((C_D,C_D)) (C_C ((C_F _,C_E _)) _) -> 764 
  C_C ((C_D,C_F _)) (C_C ((C_E _,C_F _)) _) -> 765 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 766 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_F _,C_F _)) _) -> 767 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_A)) -> 768 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_D,C_E _)) _) -> 769 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_D,C_E _)) _) -> 770 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 771 
  C_C ((C_E (C_F _),C_E _)) (C_B (C_F _) _) -> 772 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 773 
  C_C ((C_E C_D,C_F _)) (C_B C_D _) -> 774 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 775 
  C_C ((C_E (C_E _),C_D)) (C_B C_D _) -> 776 
  C_C _ (C_C ((C_D,C_E _)) _) -> 777 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 778 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 779 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 780 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 781 
  C_C ((C_F _,C_D)) _ -> 782 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_A)) -> 783 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 784 
  C_C ((C_E C_D,C_E C_D)) (C_B C_D _) -> 785 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 786 
  C_C ((C_F _,C_F _)) (C_C _ (C_A)) -> 787 
  C_C ((C_E _,C_E C_D)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 788 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 789 
  C_C ((C_E _,C_F ((_,_)))) (C_A) -> 790 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 791 
  C_C ((C_E _,C_D)) (C_C ((C_F _,C_E _)) (C_A)) -> 792 
  C_C ((C_E _,C_E _)) (C_C _ (C_C _ _)) -> 793 
  C_C ((C_E C_D,C_F _)) (C_C ((C_D,C_D)) (C_C _ _)) -> 794 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_E _,C_E _)) (C_A)) -> 795 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_F _,C_E _)) _) -> 796 
  C_C ((C_E C_D,C_E C_D)) (C_B (C_F _) _) -> 797 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 798 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 799 
  C_C ((C_F _,C_F _)) (C_C ((C_D,C_D)) (C_C _ _)) -> 800 
  C_C ((C_D,C_F _)) (C_C ((C_E _,C_F _)) (C_A)) -> 801 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_F _,C_D)) (C_A)) -> 802 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_E _,C_D)) (C_A)) -> 803 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_E _,C_D)) _) -> 804 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_F _,C_F _)) _) -> 805 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_D,C_E _)) (C_A)) -> 806 
  C_C ((C_D,C_E _)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 807 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_D,C_D)) _) -> 808 
  C_C ((C_E _,C_E C_D)) (C_C ((C_F _,C_F _)) (C_A)) -> 809 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_F _,C_D)) _) -> 810 
  C_C ((C_E _,C_E C_D)) (C_C ((C_E _,C_F _)) (C_A)) -> 811 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 812 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_D,C_D)) (C_C _ _)) -> 813 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 814 
  C_C ((C_D,C_F _)) (C_C ((C_E _,C_D)) _) -> 815 
  C_C ((C_F ((_,_)),C_F _)) _ -> 816 
  C_C ((C_D,C_D)) (C_B (C_E _) _) -> 817 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_F _,C_D)) (C_A)) -> 818 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 819 
  C_C ((C_D,C_E (C_F _))) (C_C _ (C_A)) -> 820 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_E _,C_F _)) (C_A)) -> 821 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 822 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 823 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_D,C_E _)) (C_A)) -> 824 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 825 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 826 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_A)) -> 827 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_E _,C_F _)) _) -> 828 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_B (C_F _) _) -> 829 
  C_C ((C_D,C_E _)) (C_C ((C_F _,C_F _)) (C_A)) -> 830 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_D,C_D)) (C_C _ _)) -> 831 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 832 
  C_C ((C_D,C_E _)) (C_C ((C_D,C_E _)) (C_A)) -> 833 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C _ _) -> 834 
  C_C ((C_E _,C_E C_D)) (C_C ((C_D,C_D)) _) -> 835 
  C_C ((C_D,C_D)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 836 
  C_C ((C_F _,C_D)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 837 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 838 
  C_C ((C_E _,C_E _)) (C_B _ _) -> 839 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_D,C_E _)) _) -> 840 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_D,C_D)) (C_C _ _)) -> 841 
  C_C ((C_F _,C_E C_D)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 842 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_E _,C_D)) _) -> 843 
  C_C ((C_D,C_E _)) (C_C ((C_E _,C_E _)) (C_A)) -> 844 
  C_C ((C_D,C_D)) (C_C _ _) -> 845 
  C_C ((C_E _,C_D)) (C_C ((C_F _,C_F _)) _) -> 846 
  C_C ((C_D,C_E (C_F _))) (C_B _ _) -> 847 
  C_C ((C_E (C_F _),C_E C_D)) (C_B (C_F _) _) -> 848 
  C_C ((C_E (C_F _),C_E _)) (C_C _ (C_C _ _)) -> 849 
  C_C ((C_D,C_E _)) (C_C _ _) -> 850 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_D,C_E _)) _) -> 851 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 852 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_A)) -> 853 
  C_C ((C_D,C_D)) (C_C ((C_F _,C_D)) _) -> 854 
  C_C ((C_E (C_F _),C_E _)) (C_C _ (C_A)) -> 855 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_E _,C_D)) _) -> 856 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C _ _) -> 857 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C _ _) -> 858 
  C_C ((C_F _,C_D)) (C_A) -> 859 
  C_C ((C_D,C_E _)) (C_C ((C_F _,C_E _)) (C_A)) -> 860 
  C_C ((C_E (C_F _),C_E C_D)) (C_A) -> 861 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_E _,C_D)) _) -> 862 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 863 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_E _,C_D)) _) -> 864 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_E _,C_D)) _) -> 865 
  C_C ((C_F ((_,_)),C_D)) (C_A) -> 866 
  C_C ((C_E C_D,C_D)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 867 
  C_C ((C_D,C_E C_D)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 868 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C _ _) -> 869 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_D,C_F _)) (C_A)) -> 870 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_E _,C_D)) _) -> 871 
  C_C ((C_E C_D,C_F _)) (C_C _ _) -> 872 
  C_C ((C_F ((_,_)),C_E _)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 873 
  C_C ((C_F _,C_D)) (C_C ((C_D,C_E _)) _) -> 874 
  C_C ((C_F _,C_E _)) (C_C _ (C_C _ _)) -> 875 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_D,C_D)) (C_B _ _)) -> 876 
  C_C ((C_F _,C_D)) (C_B _ _) -> 877 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_A)) -> 878 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 879 
  C_C ((C_E _,C_E C_D)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 880 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C _ _) -> 881 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_D,C_E _)) (C_A)) -> 882 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_D,C_D)) (C_A)) -> 883 
  C_C ((C_D,C_E C_D)) (C_C ((C_D,C_E _)) _) -> 884 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C _ (C_B _ _)) -> 885 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_E _,C_F _)) _) -> 886 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_A)) -> 887 
  C_C ((C_E C_D,C_E (C_F _))) (C_C ((C_F _,C_E _)) _) -> 888 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_F _,C_E _)) _) -> 889 
  C_C ((C_E _,C_F _)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 890 
  C_C ((C_E (C_E _),C_E C_D)) (C_C _ (C_C _ _)) -> 891 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 892 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_D,C_D)) (C_C _ _)) -> 893 
  C_C ((C_D,C_E C_D)) (C_C ((C_D,C_F _)) (C_B _ _)) -> 894 
  C_C ((C_D,C_F _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 895 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_E _,C_F _)) _) -> 896 
  C_C ((C_E _,C_E C_D)) (C_C _ (C_A)) -> 897 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_F _,C_D)) (C_A)) -> 898 
  C_C ((C_D,C_E (C_E _))) (C_B _ _) -> 899 
  C_C ((C_F _,C_E _)) (C_C ((C_E _,C_F _)) _) -> 900 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_F _,C_D)) _) -> 901 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_E _,C_D)) (C_A)) -> 902 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 903 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_A)) -> 904 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_D,C_E _)) _) -> 905 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_F _,C_D)) (C_A)) -> 906 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_D,C_E _)) (C_B _ _)) -> 907 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_D,C_F _)) _) -> 908 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_D,C_F _)) (C_A)) -> 909 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_E _,C_E _)) _) -> 910 
  C_C ((C_F _,C_E _)) (C_C ((C_E _,C_F _)) (C_A)) -> 911 
  C_C ((C_E (C_F _),C_F _)) (C_B C_D _) -> 912 
  C_C ((C_D,C_F _)) (C_B (C_F _) _) -> 913 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 914 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 915 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 916 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 917 
  C_C ((C_D,C_E _)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 918 
  C_C ((C_D,C_E C_D)) (C_B (C_E _) _) -> 919 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_D,C_F _)) _) -> 920 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 921 
  C_C ((C_D,C_E C_D)) (C_C ((C_D,C_D)) _) -> 922 
  C_C ((C_F _,C_E C_D)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 923 
  C_C ((C_D,C_F _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 924 
  C_C ((C_F ((_,_)),C_E C_D)) (C_C ((C_E _,C_E _)) _) -> 925 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 926 
  C_C ((C_F _,C_F ((_,_)))) (C_C _ (C_A)) -> 927 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_A)) -> 928 
  C_C ((C_E (C_F _),C_F _)) (C_C ((C_F _,C_D)) (C_C _ _)) -> 929 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 930 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 931 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_F _,C_D)) (C_C _ _)) -> 932 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 933 
  C_C ((C_E C_D,C_D)) (C_C ((C_E _,C_D)) _) -> 934 
  C_C ((C_E C_D,C_E (C_E _))) (C_B _ _) -> 935 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 936 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_E _,C_E _)) _) -> 937 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_F _,C_E _)) _) -> 938 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 939 
  C_C ((C_E _,C_E _)) (C_C ((C_D,C_F _)) (C_A)) -> 940 
  C_C ((C_E C_D,C_E _)) (C_C _ _) -> 941 
  C_C ((C_D,C_E C_D)) (C_C ((C_E _,C_E _)) (C_A)) -> 942 
  C_C ((C_F _,C_D)) (C_C ((C_D,C_D)) (C_C _ _)) -> 943 
  C_C ((C_E C_D,C_F _)) (C_B (C_F _) _) -> 944 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_F _,C_D)) (C_A)) -> 945 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 946 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_F _,C_D)) _) -> 947 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_A)) -> 948 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_F _,C_D)) (C_A)) -> 949 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_B _ _) -> 950 
  C_C ((C_E _,C_E _)) (C_C ((C_F _,C_E _)) (C_A)) -> 951 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C _ (C_C _ _)) -> 952 
  C_C ((C_F _,C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 953 
  C_C ((C_F _,C_F _)) (C_C ((C_D,C_E _)) (C_A)) -> 954 
  C_C _ (C_C ((C_D,C_E _)) (C_B _ _)) -> 955 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 956 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_F _,C_E _)) _) -> 957 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 958 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_D,C_D)) (C_A)) -> 959 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 960 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_E _,C_E _)) (C_A)) -> 961 
  C_C ((C_E _,C_E _)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 962 
  C_C ((C_F _,C_E (C_E _))) (C_C _ (C_A)) -> 963 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 964 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 965 
  C_C ((C_E (C_F _),C_E C_D)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 966 
  C_C ((C_E C_D,C_F _)) (C_C ((C_E _,C_F _)) _) -> 967 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 968 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_D,C_F _)) (C_C _ _)) -> 969 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_D,C_D)) (C_A)) -> 970 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 971 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_E _,C_E _)) (C_A)) -> 972 
  C_C ((C_F ((_,_)),C_D)) (C_C _ (C_A)) -> 973 
  C_C ((C_E C_D,C_D)) (C_C ((C_E _,C_E _)) (C_A)) -> 974 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_F _,C_F _)) _) -> 975 
