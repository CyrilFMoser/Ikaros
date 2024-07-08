module Program_13 () where 

 main = print $ show v_b
data B_B a = C_C a (((Char,Int),Bool)) | C_D B_A | C_E (B_B a) (B_B a) | C_F
data B_A = C_A | C_B B_A

v_a :: B_B B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_B _) -> 0 
  C_C _ (((_,_),_)) -> 1 
  C_C C_A _ -> 2 
  C_C _ _ -> 3 
  C_C (C_B C_A) (((_,_),_)) -> 4 
  C_C (C_B (C_B _)) (((_,_),_)) -> 5 
  C_E (C_E _ _) (C_E (C_D _) _) -> 6 
  C_E (C_E _ (C_E _ _)) (C_E (C_F) _) -> 7 
  C_E (C_E _ (C_E _ _)) (C_E (C_C _ _) (C_C _ _)) -> 8 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_E (C_F) _) -> 9 
  C_E (C_E _ (C_F)) (C_E _ (C_D _)) -> 10 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_E _ _) (C_C _ _)) -> 11 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_F) -> 12 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_E _ _) -> 13 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_E _ _) _) -> 14 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_E _ (C_D _)) -> 15 
  C_E (C_E (C_D _) (C_C _ _)) (C_E (C_D _) (C_D _)) -> 16 
  C_E (C_E (C_C _ _) (C_D _)) (C_E (C_D _) (C_E _ _)) -> 17 
  C_E (C_E (C_C _ _) _) (C_E (C_C _ _) _) -> 18 
  C_E (C_E _ (C_F)) (C_E _ (C_C _ _)) -> 19 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E _ (C_D _)) -> 20 
  C_E (C_E (C_E _ _) (C_F)) (C_E (C_C _ _) (C_C _ _)) -> 21 
  C_E (C_D (C_B _)) (C_E (C_F) (C_C _ _)) -> 22 
  C_E (C_E _ (C_F)) (C_E (C_F) _) -> 23 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_E _ _) _) -> 24 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_C _ (((_,_),_))) -> 25 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_D _) (C_D _)) -> 26 
  C_E (C_E _ (C_C _ _)) (C_C _ (((_,_),_))) -> 27 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_F) (C_D _)) -> 28 
  C_E (C_E (C_C _ _) _) (C_F) -> 29 
  C_E (C_D _) (C_C (C_B _) (((_,_),_))) -> 30 
  C_E (C_C _ (((_,_),_))) (C_C _ _) -> 31 
  C_E (C_E (C_D _) (C_C _ _)) (C_E (C_C _ _) (C_F)) -> 32 
  C_E (C_D (C_B _)) (C_E (C_D _) (C_D _)) -> 33 
  C_E (C_C C_A (((_,_),_))) (C_E _ _) -> 34 
  C_E (C_C (C_B _) _) (C_E (C_C _ _) _) -> 35 
  C_E (C_E (C_F) (C_E _ _)) (C_E (C_F) (C_F)) -> 36 
  C_E (C_D _) (C_E (C_C _ _) (C_C _ _)) -> 37 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_D (C_B _)) -> 38 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_E (C_E _ _) _) -> 39 
  C_E (C_E (C_D _) (C_F)) (C_C _ _) -> 40 
  C_E (C_E _ (C_E _ _)) (C_E (C_C _ _) (C_D _)) -> 41 
  C_E (C_D C_A) (C_E _ (C_D _)) -> 42 
  C_E (C_C _ _) (C_E (C_E _ _) _) -> 43 
  C_E (C_C C_A _) (C_E (C_F) (C_E _ _)) -> 44 
  C_E (C_E (C_E _ _) (C_F)) (C_E (C_F) (C_D _)) -> 45 
  C_E (C_E (C_D _) (C_E _ _)) (C_C _ _) -> 46 
  C_E (C_C C_A (((_,_),_))) (C_C (C_B _) _) -> 47 
  C_E (C_E (C_F) (C_E _ _)) (C_D C_A) -> 48 
  C_E (C_E (C_D _) (C_E _ _)) (C_D C_A) -> 49 
  C_E (C_E (C_F) (C_C _ _)) (C_E (C_E _ _) (C_F)) -> 50 
  C_E (C_C (C_B _) (((_,_),_))) (C_E (C_E _ _) (C_E _ _)) -> 51 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E (C_E _ _) (C_C _ _)) -> 52 
  C_E (C_C _ _) (C_E _ (C_E _ _)) -> 53 
  C_E (C_D _) (C_D _) -> 54 
  C_E (C_F) (C_E (C_D _) (C_F)) -> 55 
  C_E (C_E (C_D _) (C_F)) (C_C _ (((_,_),_))) -> 56 
  C_E (C_E (C_D _) (C_F)) (C_E _ (C_D _)) -> 57 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_F) (C_C _ _)) -> 58 
  C_E (C_E (C_E _ _) (C_C _ _)) _ -> 59 
  C_E (C_C C_A _) _ -> 60 
  C_E (C_C C_A _) (C_E (C_E _ _) _) -> 61 
  C_E (C_E _ (C_E _ _)) (C_C _ (((_,_),_))) -> 62 
  C_E (C_D (C_B _)) (C_E (C_F) (C_F)) -> 63 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_E _ (C_C _ _)) -> 64 
  C_E (C_C C_A (((_,_),_))) (C_E (C_E _ _) (C_D _)) -> 65 
  C_E (C_E _ (C_D _)) (C_E (C_D _) (C_C _ _)) -> 66 
  C_E (C_E (C_C _ _) _) (C_E (C_E _ _) (C_D _)) -> 67 
  C_E (C_E (C_F) (C_D _)) (C_E (C_D _) (C_F)) -> 68 
  C_E (C_D C_A) (C_E (C_F) (C_D _)) -> 69 
  C_E (C_C C_A _) (C_F) -> 70 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E _ (C_F)) -> 71 
  C_E (C_E (C_D _) _) (C_E (C_F) (C_D _)) -> 72 
  C_E (C_E _ (C_D _)) (C_E _ (C_F)) -> 73 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_F) -> 74 
  C_E (C_C C_A (((_,_),_))) (C_E (C_E _ _) (C_C _ _)) -> 75 
  C_E (C_E (C_F) (C_F)) (C_E (C_E _ _) (C_D _)) -> 76 
  C_E _ (C_E (C_E _ _) (C_C _ _)) -> 77 
  C_E (C_E (C_F) _) (C_E (C_E _ _) (C_F)) -> 78 
  C_E (C_E (C_F) (C_E _ _)) (C_E _ (C_D _)) -> 79 
  C_E (C_C _ _) (C_D (C_B _)) -> 80 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_F) -> 81 
  C_E (C_E (C_D _) (C_C _ _)) (C_E (C_F) (C_E _ _)) -> 82 
  C_E (C_E (C_F) (C_E _ _)) (C_E (C_D _) (C_E _ _)) -> 83 
  C_E (C_E (C_F) (C_C _ _)) (C_E (C_F) (C_F)) -> 84 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_C C_A _) -> 85 
  C_E (C_C _ (((_,_),_))) (C_E (C_E _ _) (C_C _ _)) -> 86 
  C_E (C_E (C_F) (C_D _)) (C_D (C_B _)) -> 87 
  C_E (C_C _ (((_,_),_))) (C_E (C_D _) (C_F)) -> 88 
  C_E (C_C _ _) (C_E _ (C_C _ _)) -> 89 
  C_E (C_E _ (C_F)) (C_E (C_E _ _) (C_C _ _)) -> 90 
  C_E (C_E _ _) (C_E _ (C_D _)) -> 91 
  C_E (C_E _ _) (C_E _ (C_E _ _)) -> 92 
  C_E (C_E (C_E _ _) (C_F)) (C_E (C_E _ _) (C_F)) -> 93 
  C_E (C_E (C_C _ _) (C_D _)) (C_E (C_F) (C_C _ _)) -> 94 
  C_E (C_E (C_F) (C_C _ _)) (C_E (C_D _) _) -> 95 
  C_E (C_C _ (((_,_),_))) _ -> 96 
  C_E (C_F) (C_E (C_F) (C_F)) -> 97 
  C_E (C_E (C_F) (C_D _)) (C_E (C_E _ _) (C_D _)) -> 98 
  C_E (C_C (C_B _) _) (C_E (C_F) _) -> 99 
  C_E _ (C_E (C_F) _) -> 100 
  C_E (C_E _ (C_F)) (C_C C_A (((_,_),_))) -> 101 
  C_E (C_E (C_F) (C_C _ _)) (C_E (C_C _ _) (C_F)) -> 102 
  C_E (C_E (C_F) (C_F)) (C_E (C_E _ _) (C_E _ _)) -> 103 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_F) (C_D _)) -> 104 
  C_E (C_E _ (C_C _ _)) (C_D C_A) -> 105 
  C_E (C_E (C_F) (C_D _)) (C_E (C_F) (C_C _ _)) -> 106 
  C_E (C_E _ (C_F)) (C_E (C_F) (C_D _)) -> 107 
  C_E (C_D (C_B _)) (C_E (C_F) (C_D _)) -> 108 
  C_E (C_E (C_F) (C_F)) (C_E (C_D _) (C_C _ _)) -> 109 
  C_E (C_E (C_C _ _) (C_D _)) (C_E (C_C _ _) (C_D _)) -> 110 
  C_E (C_E (C_D _) (C_D _)) (C_D _) -> 111 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E (C_E _ _) (C_E _ _)) -> 112 
  C_E (C_E (C_F) _) (C_E (C_C _ _) (C_F)) -> 113 
  C_E (C_C C_A _) (C_C _ (((_,_),_))) -> 114 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E (C_D _) (C_F)) -> 115 
  C_E (C_E _ (C_C _ _)) (C_E (C_F) _) -> 116 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E (C_E _ _) _) -> 117 
  C_E (C_C _ _) (C_C _ (((_,_),_))) -> 118 
  C_E (C_E (C_D _) (C_E _ _)) (C_E _ _) -> 119 
  C_E (C_F) (C_C _ (((_,_),_))) -> 120 
  C_E (C_E (C_D _) (C_C _ _)) (C_E (C_C _ _) (C_C _ _)) -> 121 
  C_E (C_E (C_D _) _) (C_E (C_F) (C_E _ _)) -> 122 
  C_E (C_E (C_D _) (C_F)) (C_E (C_E _ _) (C_C _ _)) -> 123 
  C_E (C_E _ _) (C_C C_A _) -> 124 
  C_E (C_E (C_C _ _) (C_F)) (C_E _ (C_D _)) -> 125 
  C_E (C_D (C_B _)) (C_E (C_C _ _) (C_C _ _)) -> 126 
  C_E (C_C (C_B _) _) (C_E (C_C _ _) (C_E _ _)) -> 127 
  C_E (C_E (C_E _ _) (C_D _)) (C_E _ (C_C _ _)) -> 128 
  C_E (C_E _ (C_D _)) (C_E (C_D _) (C_F)) -> 129 
  C_E (C_E (C_F) _) (C_E (C_F) _) -> 130 
  C_E (C_E (C_D _) (C_C _ _)) (C_E _ (C_C _ _)) -> 131 
  C_E (C_E _ (C_D _)) (C_E (C_C _ _) _) -> 132 
  C_E (C_E (C_D _) (C_C _ _)) (C_E (C_E _ _) (C_C _ _)) -> 133 
  C_E (C_E (C_F) _) (C_E (C_C _ _) (C_E _ _)) -> 134 
  C_E (C_E (C_F) (C_F)) (C_E (C_E _ _) (C_F)) -> 135 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E (C_C _ _) (C_C _ _)) -> 136 
  C_E (C_E (C_C _ _) (C_D _)) (C_E (C_F) (C_E _ _)) -> 137 
  C_E (C_C C_A (((_,_),_))) (C_E (C_F) (C_C _ _)) -> 138 
  C_E (C_E (C_F) (C_D _)) (C_E _ (C_C _ _)) -> 139 
  C_E (C_E (C_D _) _) (C_E (C_D _) _) -> 140 
  C_E (C_E _ _) (C_C _ _) -> 141 
  C_E (C_E _ (C_C _ _)) (C_E (C_D _) (C_E _ _)) -> 142 
  C_E (C_C C_A _) (C_E (C_D _) (C_F)) -> 143 
  C_E (C_E (C_F) (C_E _ _)) (C_E (C_E _ _) (C_D _)) -> 144 
  C_E (C_F) (C_E (C_C _ _) _) -> 145 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_C _ _) (C_F)) -> 146 
  C_E (C_E (C_F) (C_E _ _)) (C_E (C_E _ _) _) -> 147 
  C_E (C_E (C_C _ _) (C_F)) (C_E _ _) -> 148 
  C_E (C_E _ (C_D _)) (C_D C_A) -> 149 
  C_E (C_E (C_C _ _) (C_F)) (C_E _ (C_C _ _)) -> 150 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_E (C_F) (C_C _ _)) -> 151 
  C_E (C_F) (C_E (C_C _ _) (C_D _)) -> 152 
  C_E (C_D (C_B _)) (C_E _ (C_E _ _)) -> 153 
  C_E _ (C_E (C_C _ _) (C_F)) -> 154 
  C_E _ (C_E (C_C _ _) (C_E _ _)) -> 155 
  C_E (C_E (C_C _ _) _) _ -> 156 
  C_E (C_C (C_B _) _) (C_C _ _) -> 157 
  C_E (C_E (C_C _ _) (C_D _)) (C_C C_A (((_,_),_))) -> 158 
  C_E (C_C _ _) (C_C C_A _) -> 159 
  C_E (C_E (C_E _ _) (C_F)) (C_E (C_F) _) -> 160 
  C_E (C_E (C_D _) (C_F)) (C_C (C_B _) (((_,_),_))) -> 161 
  C_E (C_E (C_C _ _) (C_F)) (C_E (C_C _ _) (C_E _ _)) -> 162 
  C_E (C_E (C_C _ _) _) (C_E (C_D _) (C_E _ _)) -> 163 
  C_E (C_E (C_F) (C_F)) (C_E (C_E _ _) _) -> 164 
  C_E (C_D (C_B _)) (C_E _ (C_D _)) -> 165 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E _ _) -> 166 
  C_E (C_E (C_D _) (C_D _)) (C_F) -> 167 
  C_E (C_C (C_B _) (((_,_),_))) (C_C C_A _) -> 168 
  C_E (C_F) (C_E _ _) -> 169 
  C_E (C_E (C_D _) (C_F)) (C_E (C_E _ _) (C_D _)) -> 170 
  C_E (C_E (C_F) (C_D _)) (C_E (C_C _ _) (C_D _)) -> 171 
  C_E (C_F) (C_E (C_E _ _) (C_C _ _)) -> 172 
  C_E (C_E (C_E _ _) _) (C_C C_A (((_,_),_))) -> 173 
  C_E (C_E (C_E _ _) (C_E _ _)) _ -> 174 
  C_E _ (C_E (C_F) (C_D _)) -> 175 
  C_E (C_E (C_D _) (C_D _)) (C_C C_A (((_,_),_))) -> 176 
  C_E (C_E _ (C_C _ _)) (C_E _ (C_F)) -> 177 
  C_E (C_E (C_E _ _) _) (C_E _ (C_F)) -> 178 
  C_E (C_C (C_B _) (((_,_),_))) _ -> 179 
  C_E (C_F) (C_D (C_B _)) -> 180 
  C_E (C_E _ (C_D _)) (C_E (C_E _ _) (C_E _ _)) -> 181 
  C_E (C_E (C_F) (C_E _ _)) (C_D _) -> 182 
  C_E (C_E _ (C_E _ _)) (C_E _ (C_E _ _)) -> 183 
  C_E (C_E (C_E _ _) (C_D _)) (C_C C_A (((_,_),_))) -> 184 
  C_E (C_E _ (C_D _)) (C_E (C_D _) (C_D _)) -> 185 
  C_E (C_D _) (C_C C_A (((_,_),_))) -> 186 
  C_E (C_E (C_C _ _) _) (C_E (C_D _) (C_C _ _)) -> 187 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_E _ _) _) -> 188 
  C_E (C_D C_A) (C_E (C_E _ _) (C_D _)) -> 189 
  C_E (C_E (C_D _) (C_F)) (C_E (C_C _ _) (C_F)) -> 190 
  C_E (C_E (C_D _) (C_C _ _)) (C_E (C_C _ _) (C_E _ _)) -> 191 
  C_E (C_C (C_B _) (((_,_),_))) (C_E (C_D _) _) -> 192 
  C_E (C_E (C_D _) (C_F)) (C_E (C_E _ _) (C_E _ _)) -> 193 
  C_E (C_E (C_F) _) (C_C (C_B _) (((_,_),_))) -> 194 
  C_E (C_E _ (C_F)) _ -> 195 
  C_E (C_F) (C_E (C_C _ _) (C_C _ _)) -> 196 
  C_E (C_C _ (((_,_),_))) (C_C C_A (((_,_),_))) -> 197 
  C_E (C_E (C_C _ _) (C_D _)) (C_C _ _) -> 198 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_E (C_F) _) -> 199 
  C_E (C_E _ (C_F)) (C_E (C_F) (C_C _ _)) -> 200 
  C_E (C_C (C_B _) _) (C_E _ (C_C _ _)) -> 201 
  C_E (C_E (C_C _ _) _) (C_E (C_E _ _) (C_F)) -> 202 
  C_E (C_C _ (((_,_),_))) (C_E (C_C _ _) _) -> 203 
  C_E (C_E (C_F) (C_F)) (C_E _ (C_D _)) -> 204 
  C_E (C_E (C_D _) (C_C _ _)) (C_F) -> 205 
  C_E (C_E _ (C_D _)) (C_E (C_F) (C_D _)) -> 206 
  C_E (C_E (C_C _ _) (C_F)) (C_D C_A) -> 207 
  C_E (C_E _ (C_C _ _)) (C_C C_A _) -> 208 
  C_E (C_E (C_F) (C_E _ _)) (C_E (C_D _) _) -> 209 
  C_E (C_E (C_D _) _) (C_E (C_E _ _) (C_D _)) -> 210 
  C_E (C_E (C_D _) _) (C_E _ (C_F)) -> 211 
  C_E (C_E _ (C_F)) (C_E (C_D _) (C_F)) -> 212 
  C_E _ (C_C (C_B _) (((_,_),_))) -> 213 
  C_E (C_E (C_D _) (C_D _)) (C_D C_A) -> 214 
  C_E (C_E _ (C_F)) (C_E _ _) -> 215 
  C_E (C_E (C_F) (C_E _ _)) (C_C (C_B _) (((_,_),_))) -> 216 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_C (C_B _) _) -> 217 
  C_E (C_E (C_D _) _) (C_D C_A) -> 218 
  C_E (C_C C_A (((_,_),_))) (C_D _) -> 219 
  C_E (C_E (C_D _) _) (C_C (C_B _) _) -> 220 
  C_E (C_C C_A _) (C_E (C_D _) (C_E _ _)) -> 221 
  C_E (C_E (C_C _ _) _) (C_C C_A (((_,_),_))) -> 222 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_F) (C_C _ _)) -> 223 
  C_E (C_E _ (C_F)) (C_F) -> 224 
  C_E (C_F) (C_C C_A _) -> 225 
  C_E (C_E (C_C _ _) _) (C_C C_A _) -> 226 
  C_E (C_E _ (C_E _ _)) (C_F) -> 227 
  C_E (C_E (C_D _) (C_D _)) (C_C _ (((_,_),_))) -> 228 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_C _ _) _) -> 229 
  C_E (C_E (C_F) _) (C_E (C_D _) (C_C _ _)) -> 230 
  C_E (C_C _ (((_,_),_))) (C_E (C_C _ _) (C_E _ _)) -> 231 
  C_E (C_D _) (C_E (C_F) _) -> 232 
  C_E (C_D C_A) (C_E (C_D _) (C_F)) -> 233 
  C_E (C_E (C_D _) (C_C _ _)) (C_D C_A) -> 234 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_D C_A) -> 235 
  C_E (C_E _ (C_C _ _)) (C_E (C_E _ _) (C_D _)) -> 236 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_E (C_C _ _) _) -> 237 
  C_E (C_E (C_F) (C_C _ _)) (C_E (C_D _) (C_E _ _)) -> 238 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_E _ (C_F)) -> 239 
  C_E (C_E (C_D _) _) (C_E (C_F) (C_F)) -> 240 
  C_E (C_E (C_D _) (C_C _ _)) (C_C C_A _) -> 241 
  C_E (C_F) (C_C _ _) -> 242 
  C_E (C_D _) (C_E _ _) -> 243 
  C_E (C_E (C_F) (C_C _ _)) (C_E (C_E _ _) (C_C _ _)) -> 244 
  C_E (C_E (C_E _ _) (C_F)) (C_E (C_D _) _) -> 245 
  C_E (C_F) (C_C (C_B _) (((_,_),_))) -> 246 
  C_E (C_E (C_D _) _) (C_E (C_F) _) -> 247 
  C_E (C_E (C_C _ _) (C_F)) (C_E (C_C _ _) (C_F)) -> 248 
  C_E (C_E _ _) (C_E (C_F) (C_E _ _)) -> 249 
  C_E (C_E (C_D _) (C_F)) (C_E (C_E _ _) (C_F)) -> 250 
  C_E _ (C_C _ (((_,_),_))) -> 251 
  C_E (C_E (C_F) (C_C _ _)) (C_E (C_F) (C_D _)) -> 252 
  C_E (C_E (C_F) (C_F)) (C_E (C_D _) (C_D _)) -> 253 
  C_E (C_C (C_B _) (((_,_),_))) (C_E (C_C _ _) (C_E _ _)) -> 254 
  C_E (C_E _ (C_E _ _)) (C_E (C_F) (C_E _ _)) -> 255 
  C_E (C_E (C_F) _) (C_E _ (C_E _ _)) -> 256 
  C_E (C_C _ (((_,_),_))) (C_E (C_F) (C_E _ _)) -> 257 
  C_E (C_C (C_B _) (((_,_),_))) (C_E (C_F) _) -> 258 
  C_E (C_D C_A) (C_C (C_B _) _) -> 259 
  C_E (C_C (C_B _) _) (C_E (C_D _) (C_F)) -> 260 
  C_E (C_E (C_F) _) (C_E (C_F) (C_C _ _)) -> 261 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_C C_A _) -> 262 
  C_E (C_D C_A) (C_E (C_D _) (C_E _ _)) -> 263 
  C_E (C_C C_A (((_,_),_))) (C_E (C_D _) (C_C _ _)) -> 264 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E _ (C_F)) -> 265 
  C_E (C_E (C_C _ _) (C_D _)) (C_D _) -> 266 
  C_E (C_E (C_F) (C_D _)) (C_F) -> 267 
  C_E (C_E (C_E _ _) (C_F)) (C_E (C_E _ _) (C_E _ _)) -> 268 
  C_E (C_E (C_F) (C_F)) (C_D (C_B _)) -> 269 
  C_E (C_E (C_C _ _) _) (C_E (C_F) _) -> 270 
  C_E (C_C (C_B _) (((_,_),_))) (C_E (C_F) (C_E _ _)) -> 271 
  C_E _ (C_E (C_E _ _) (C_D _)) -> 272 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E (C_F) _) -> 273 
  C_E (C_E _ (C_F)) (C_E (C_C _ _) (C_E _ _)) -> 274 
  C_E (C_C _ (((_,_),_))) (C_E _ (C_E _ _)) -> 275 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_D _) (C_E _ _)) -> 276 
  C_E (C_C C_A _) (C_C _ _) -> 277 
  C_E (C_E _ _) (C_E _ (C_C _ _)) -> 278 
  C_E (C_C _ (((_,_),_))) (C_E (C_D _) (C_C _ _)) -> 279 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_C C_A (((_,_),_))) -> 280 
  C_E (C_E (C_F) (C_F)) (C_E _ (C_C _ _)) -> 281 
  C_E (C_E (C_F) (C_E _ _)) (C_E (C_C _ _) (C_D _)) -> 282 
  C_E (C_E (C_D _) (C_C _ _)) (C_C _ (((_,_),_))) -> 283 
  C_E (C_E (C_D _) (C_F)) (C_C C_A _) -> 284 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_C _ _) (C_F)) -> 285 
  C_E (C_E _ (C_C _ _)) (C_E (C_D _) (C_D _)) -> 286 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_E _ _) (C_F)) -> 287 
  C_E (C_E (C_F) _) (C_E (C_C _ _) (C_D _)) -> 288 
  C_E (C_E (C_C _ _) (C_D _)) (C_E (C_C _ _) (C_C _ _)) -> 289 
  C_E (C_E (C_D _) (C_D _)) (C_E _ (C_D _)) -> 290 
  C_E (C_E (C_F) (C_D _)) (C_C C_A _) -> 291 
  C_E (C_E (C_D _) (C_C _ _)) (C_C (C_B _) _) -> 292 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_E _ _) (C_E _ _)) -> 293 
  C_E (C_E (C_C _ _) _) (C_E (C_C _ _) (C_E _ _)) -> 294 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E _ (C_D _)) -> 295 
  C_E (C_C C_A _) (C_D (C_B _)) -> 296 
  C_E (C_E (C_C _ _) _) (C_E _ (C_E _ _)) -> 297 
  C_E (C_D _) (C_E _ (C_C _ _)) -> 298 
  C_E (C_E (C_D _) (C_C _ _)) (C_E (C_E _ _) (C_E _ _)) -> 299 
  C_E (C_E _ _) (C_C _ (((_,_),_))) -> 300 
  C_E (C_D (C_B _)) (C_E (C_E _ _) (C_C _ _)) -> 301 
  C_E (C_E (C_D _) (C_E _ _)) (C_C C_A (((_,_),_))) -> 302 
  C_E (C_E (C_F) (C_F)) (C_E (C_C _ _) (C_C _ _)) -> 303 
  C_E (C_E (C_E _ _) (C_F)) (C_E (C_E _ _) (C_D _)) -> 304 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_C _ _) (C_E _ _)) -> 305 
  C_E (C_E (C_C _ _) _) (C_E _ (C_C _ _)) -> 306 
  C_E (C_E (C_F) _) (C_D C_A) -> 307 
  C_E (C_C (C_B _) _) (C_D (C_B _)) -> 308 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_C _ _) (C_C _ _)) -> 309 
  C_E (C_C C_A _) (C_E (C_F) (C_C _ _)) -> 310 
  C_E (C_E (C_F) (C_C _ _)) (C_E _ _) -> 311 
  C_E (C_E (C_C _ _) _) (C_E (C_F) (C_E _ _)) -> 312 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_E (C_F) (C_F)) -> 313 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_E _ _) (C_C _ _)) -> 314 
