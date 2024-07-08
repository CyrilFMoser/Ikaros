module Program_12 () where 

 main = print $ show v_b
data B_B a = C_C a (((Char,Int),Bool)) | C_D B_A | C_E (B_B a) (B_B a) | C_F
data B_A = C_A | C_B B_A

v_a :: B_B B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_C (C_B _) (((_,_),_)) -> 1 
  C_E (C_E (C_D _) (C_D _)) (C_C (C_B _) (((_,_),_))) -> 2 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_C _ _) (C_D _)) -> 3 
  C_E (C_E (C_E _ _) _) (C_E _ (C_D _)) -> 4 
  C_E (C_E (C_D _) (C_F)) (C_E (C_F) (C_C _ _)) -> 5 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E _ _) -> 6 
  C_E (C_D C_A) (C_E (C_F) (C_E _ _)) -> 7 
  C_E (C_E (C_C _ _) (C_F)) (C_E (C_D _) (C_E _ _)) -> 8 
  C_E (C_E (C_E _ _) (C_D _)) (C_D _) -> 9 
  C_E (C_C C_A _) (C_D _) -> 10 
  C_E (C_E (C_C _ _) _) (C_E (C_C _ _) (C_C _ _)) -> 11 
  C_E (C_E (C_D _) (C_F)) (C_E (C_F) (C_D _)) -> 12 
  C_E (C_C _ _) (C_E (C_F) (C_C _ _)) -> 13 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_E (C_E _ _) (C_F)) -> 14 
  C_E (C_C C_A _) (C_C (C_B _) _) -> 15 
  C_E (C_E _ (C_F)) (C_E (C_E _ _) _) -> 16 
  C_E (C_E _ (C_C _ _)) (C_E (C_D _) (C_F)) -> 17 
  C_E (C_E _ (C_E _ _)) (C_E (C_D _) (C_F)) -> 18 
  C_E (C_E _ (C_E _ _)) (C_C _ _) -> 19 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_D _) (C_F)) -> 20 
  C_E (C_C _ (((_,_),_))) (C_E (C_E _ _) _) -> 21 
  C_E (C_C (C_B _) (((_,_),_))) (C_E (C_C _ _) (C_D _)) -> 22 
  C_E (C_C C_A (((_,_),_))) (C_E (C_E _ _) _) -> 23 
  C_E (C_D _) (C_E (C_D _) _) -> 24 
  C_E (C_C (C_B _) _) (C_E (C_E _ _) (C_D _)) -> 25 
  C_E (C_E _ _) (C_E (C_E _ _) (C_C _ _)) -> 26 
  C_E (C_D C_A) _ -> 27 
  C_E _ (C_E (C_F) (C_F)) -> 28 
  C_E (C_E (C_D _) (C_E _ _)) (C_E _ (C_D _)) -> 29 
  C_E (C_E (C_D _) (C_D _)) (C_E _ (C_E _ _)) -> 30 
  C_E (C_D _) (C_C _ _) -> 31 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_E _ _) (C_D _)) -> 32 
  C_E (C_E _ (C_D _)) (C_E (C_F) _) -> 33 
  C_E (C_C C_A _) (C_E (C_F) (C_D _)) -> 34 
  C_E (C_E (C_E _ _) _) (C_E (C_D _) (C_D _)) -> 35 
  C_E _ (C_E _ (C_D _)) -> 36 
  C_E (C_E (C_E _ _) _) (C_E (C_E _ _) (C_E _ _)) -> 37 
  C_E (C_E (C_F) _) (C_E (C_F) (C_E _ _)) -> 38 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_D _) (C_D _)) -> 39 
  C_E (C_F) (C_E (C_F) _) -> 40 
  C_E (C_F) (C_E (C_D _) _) -> 41 
  C_E (C_C _ (((_,_),_))) (C_E (C_F) (C_D _)) -> 42 
  C_E (C_E (C_D _) _) (C_E _ _) -> 43 
  C_E (C_E (C_F) (C_E _ _)) (C_E (C_D _) (C_C _ _)) -> 44 
  C_E (C_D _) (C_C C_A _) -> 45 
  C_E (C_E (C_F) (C_D _)) (C_E (C_E _ _) (C_C _ _)) -> 46 
  C_E (C_E (C_C _ _) _) (C_E _ (C_D _)) -> 47 
  C_E (C_E (C_F) _) (C_E (C_D _) (C_F)) -> 48 
  C_E (C_C (C_B _) _) (C_D C_A) -> 49 
  C_E (C_E (C_F) (C_F)) (C_C C_A _) -> 50 
  C_E (C_E (C_E _ _) (C_F)) (C_C _ _) -> 51 
  C_E (C_C (C_B _) _) (C_E (C_E _ _) (C_C _ _)) -> 52 
  C_E (C_C _ _) (C_E (C_D _) _) -> 53 
  C_E (C_E _ (C_E _ _)) (C_E (C_F) (C_F)) -> 54 
  C_E (C_E (C_E _ _) _) (C_E _ (C_E _ _)) -> 55 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_E _ (C_E _ _)) -> 56 
  C_E (C_E (C_D _) (C_D _)) (C_D (C_B _)) -> 57 
  C_E (C_D (C_B _)) (C_E (C_D _) (C_F)) -> 58 
  C_E (C_C (C_B _) _) (C_E (C_E _ _) (C_E _ _)) -> 59 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E (C_D _) (C_C _ _)) -> 60 
  C_E _ (C_E (C_D _) (C_C _ _)) -> 61 
  C_E (C_E (C_F) (C_C _ _)) _ -> 62 
  C_E _ (C_E (C_D _) (C_D _)) -> 63 
  C_E (C_C C_A (((_,_),_))) (C_E (C_D _) _) -> 64 
  C_E _ (C_E (C_D _) (C_E _ _)) -> 65 
  C_E (C_F) _ -> 66 
  C_E (C_C (C_B _) _) (C_E (C_E _ _) (C_F)) -> 67 
  C_E (C_E (C_D _) _) _ -> 68 
  C_E (C_E _ (C_D _)) (C_E (C_F) (C_E _ _)) -> 69 
  C_E (C_E (C_F) (C_D _)) (C_C (C_B _) _) -> 70 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_D (C_B _)) -> 71 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_E _ _) (C_F)) -> 72 
  C_E (C_E _ _) (C_E (C_D _) (C_C _ _)) -> 73 
  C_E (C_E (C_E _ _) _) (C_E (C_E _ _) (C_C _ _)) -> 74 
  C_E (C_D _) (C_E (C_E _ _) (C_C _ _)) -> 75 
  C_E (C_E _ (C_C _ _)) (C_C _ _) -> 76 
  C_E (C_C C_A _) (C_E _ (C_F)) -> 77 
  C_E (C_D (C_B _)) (C_C _ (((_,_),_))) -> 78 
  C_E (C_E _ (C_D _)) (C_E (C_E _ _) (C_F)) -> 79 
  C_E (C_E (C_F) (C_C _ _)) (C_E _ (C_F)) -> 80 
  C_E (C_C (C_B _) _) (C_C _ (((_,_),_))) -> 81 
  C_E (C_E _ (C_E _ _)) (C_E (C_E _ _) (C_E _ _)) -> 82 
  C_E (C_E (C_F) (C_C _ _)) (C_E (C_F) _) -> 83 
  C_E (C_C _ (((_,_),_))) (C_E (C_E _ _) (C_F)) -> 84 
  C_E (C_C _ (((_,_),_))) (C_E _ (C_D _)) -> 85 
  C_E (C_E (C_E _ _) (C_F)) (C_E (C_C _ _) _) -> 86 
  C_E (C_F) (C_C C_A (((_,_),_))) -> 87 
  C_E _ _ -> 88 
  C_E (C_E (C_C _ _) _) (C_D C_A) -> 89 
  C_E (C_C C_A (((_,_),_))) (C_C (C_B _) (((_,_),_))) -> 90 
  C_E _ (C_C _ _) -> 91 
  C_E (C_E _ (C_C _ _)) (C_E (C_C _ _) (C_E _ _)) -> 92 
  C_E (C_E (C_F) _) (C_C (C_B _) _) -> 93 
  C_E (C_E (C_C _ _) (C_F)) (C_E (C_E _ _) (C_E _ _)) -> 94 
  C_E (C_E _ _) (C_C C_A (((_,_),_))) -> 95 
  C_E (C_E (C_E _ _) (C_F)) (C_E (C_E _ _) _) -> 96 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_D (C_B _)) -> 97 
  C_E (C_E (C_F) _) (C_E _ (C_D _)) -> 98 
  C_E (C_E _ (C_F)) (C_E (C_E _ _) (C_F)) -> 99 
  C_E (C_E (C_F) _) _ -> 100 
  C_E (C_C (C_B _) _) (C_C (C_B _) (((_,_),_))) -> 101 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_D _) -> 102 
  C_E (C_D C_A) (C_E _ _) -> 103 
  C_E (C_C _ (((_,_),_))) (C_E (C_C _ _) (C_F)) -> 104 
  C_E (C_E _ (C_D _)) (C_C _ (((_,_),_))) -> 105 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_C (C_B _) (((_,_),_))) -> 106 
  C_E (C_D C_A) (C_E (C_F) (C_F)) -> 107 
  C_E (C_F) (C_E (C_C _ _) (C_F)) -> 108 
  C_E (C_E (C_C _ _) (C_D _)) (C_E (C_F) (C_F)) -> 109 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_C C_A (((_,_),_))) -> 110 
  C_E (C_E _ _) _ -> 111 
  C_E (C_E (C_D _) _) (C_E (C_D _) (C_E _ _)) -> 112 
  C_E (C_E (C_D _) (C_E _ _)) (C_D _) -> 113 
  C_E (C_D _) (C_E (C_D _) (C_F)) -> 114 
  C_E (C_E _ (C_D _)) (C_E (C_E _ _) _) -> 115 
  C_E (C_C _ (((_,_),_))) (C_E (C_D _) _) -> 116 
  C_E (C_E (C_C _ _) (C_F)) (C_E (C_D _) (C_C _ _)) -> 117 
  C_E (C_C (C_B _) (((_,_),_))) (C_C C_A (((_,_),_))) -> 118 
  C_E (C_C (C_B _) (((_,_),_))) (C_E (C_D _) (C_C _ _)) -> 119 
  C_E (C_C C_A _) (C_E (C_C _ _) (C_D _)) -> 120 
  C_E (C_E (C_D _) (C_C _ _)) (C_E (C_D _) (C_C _ _)) -> 121 
  C_E (C_E (C_C _ _) _) (C_E (C_F) (C_F)) -> 122 
  C_E (C_C (C_B _) (((_,_),_))) (C_C (C_B _) (((_,_),_))) -> 123 
  C_E (C_C _ _) (C_F) -> 124 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_E (C_D _) _) -> 125 
  C_E (C_E (C_C _ _) (C_D _)) (C_E (C_E _ _) _) -> 126 
  C_E _ (C_E (C_F) (C_E _ _)) -> 127 
  C_E (C_C (C_B _) _) (C_C C_A (((_,_),_))) -> 128 
  C_E (C_C (C_B _) (((_,_),_))) (C_E _ (C_C _ _)) -> 129 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_E _ _) (C_D _)) -> 130 
  C_E (C_E (C_C _ _) (C_F)) (C_E (C_F) (C_D _)) -> 131 
  C_E (C_D _) (C_E (C_E _ _) _) -> 132 
  C_E (C_E (C_C _ _) _) (C_E (C_D _) (C_F)) -> 133 
  C_E (C_E _ (C_F)) (C_D C_A) -> 134 
  C_E (C_D (C_B _)) (C_E (C_E _ _) (C_D _)) -> 135 
  C_E (C_C (C_B _) (((_,_),_))) (C_E (C_D _) (C_E _ _)) -> 136 
  C_E (C_E (C_F) (C_C _ _)) (C_C C_A _) -> 137 
  C_E (C_E _ _) (C_D _) -> 138 
  C_E (C_E (C_D _) (C_C _ _)) (C_E (C_D _) (C_E _ _)) -> 139 
  C_E (C_E _ (C_C _ _)) (C_D _) -> 140 
  C_E (C_D C_A) (C_D (C_B _)) -> 141 
  C_E (C_E (C_E _ _) _) (C_F) -> 142 
  C_E (C_E (C_D _) _) (C_C _ (((_,_),_))) -> 143 
  C_E (C_E (C_F) (C_D _)) (C_E _ _) -> 144 
  C_E (C_D _) (C_E (C_C _ _) _) -> 145 
  C_E (C_E (C_E _ _) _) _ -> 146 
  C_E (C_F) (C_E _ (C_C _ _)) -> 147 
  C_E (C_E (C_F) (C_D _)) _ -> 148 
  C_E _ (C_D C_A) -> 149 
  C_E (C_E (C_C _ _) (C_F)) (C_E (C_E _ _) (C_D _)) -> 150 
  C_E (C_E (C_F) (C_F)) (C_F) -> 151 
  C_E (C_E (C_F) (C_D _)) (C_E (C_F) (C_E _ _)) -> 152 
  C_E (C_F) (C_E (C_F) (C_C _ _)) -> 153 
  C_E (C_E _ (C_D _)) _ -> 154 
  C_E (C_D (C_B _)) (C_D _) -> 155 
  C_E (C_D (C_B _)) _ -> 156 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_E (C_C _ _) _) -> 157 
  C_E (C_D _) (C_E (C_C _ _) (C_D _)) -> 158 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E _ (C_E _ _)) -> 159 
  C_E (C_C _ _) (C_E (C_D _) (C_C _ _)) -> 160 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_E _ _) -> 161 
  C_E (C_C C_A (((_,_),_))) (C_E (C_D _) (C_D _)) -> 162 
  C_E (C_E (C_D _) (C_F)) (C_E _ (C_F)) -> 163 
  C_E (C_F) (C_C (C_B _) _) -> 164 
  C_E (C_E (C_E _ _) _) (C_E (C_F) _) -> 165 
  C_E (C_C _ (((_,_),_))) (C_D _) -> 166 
  C_E (C_E (C_F) (C_C _ _)) (C_E (C_D _) (C_C _ _)) -> 167 
  C_E (C_E _ (C_C _ _)) (C_E (C_D _) _) -> 168 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E (C_C _ _) _) -> 169 
  C_E (C_E _ _) (C_C (C_B _) _) -> 170 
  C_E (C_C (C_B _) _) (C_E (C_D _) _) -> 171 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_D C_A) -> 172 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_F) (C_F)) -> 173 
  C_E (C_E (C_D _) (C_E _ _)) (C_C _ (((_,_),_))) -> 174 
  C_E (C_D C_A) (C_D C_A) -> 175 
  C_E (C_E _ (C_C _ _)) (C_E (C_E _ _) _) -> 176 
  C_E (C_E (C_C _ _) _) (C_E (C_E _ _) (C_E _ _)) -> 177 
  C_E (C_E (C_F) (C_E _ _)) (C_E (C_F) _) -> 178 
  C_E (C_F) (C_D C_A) -> 179 
  C_E (C_E _ (C_F)) (C_E _ (C_F)) -> 180 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_E _ _) (C_D _)) -> 181 
  C_E (C_C _ _) (C_E (C_C _ _) _) -> 182 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E (C_F) (C_D _)) -> 183 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_C C_A (((_,_),_))) -> 184 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_E (C_E _ _) (C_D _)) -> 185 
  C_E (C_C (C_B _) _) (C_E (C_F) (C_D _)) -> 186 
  C_E (C_E (C_F) (C_E _ _)) (C_C _ (((_,_),_))) -> 187 
  C_E (C_D C_A) (C_E (C_C _ _) (C_C _ _)) -> 188 
  C_E (C_E (C_E _ _) (C_F)) (C_E (C_F) (C_F)) -> 189 
  C_E (C_E (C_C _ _) (C_D _)) (C_E (C_C _ _) (C_E _ _)) -> 190 
  C_E (C_D C_A) (C_E (C_F) (C_C _ _)) -> 191 
  C_E (C_F) (C_E (C_E _ _) (C_E _ _)) -> 192 
  C_E (C_E (C_D _) (C_E _ _)) (C_F) -> 193 
  C_E (C_E (C_E _ _) (C_F)) (C_E (C_C _ _) (C_F)) -> 194 
  C_E (C_E (C_F) _) (C_C C_A (((_,_),_))) -> 195 
  C_E (C_E (C_C _ _) (C_F)) (C_E (C_F) _) -> 196 
  C_E (C_C _ _) (C_E (C_D _) (C_E _ _)) -> 197 
  C_E (C_E (C_E _ _) (C_D _)) (C_E _ (C_F)) -> 198 
  C_E (C_C _ _) (C_D _) -> 199 
  C_E (C_E (C_C _ _) (C_F)) (C_E (C_E _ _) (C_C _ _)) -> 200 
  C_E (C_E (C_D _) (C_F)) (C_E (C_C _ _) _) -> 201 
  C_E (C_E (C_D _) (C_F)) (C_E (C_C _ _) (C_C _ _)) -> 202 
  C_E (C_E (C_D _) _) (C_E (C_F) (C_C _ _)) -> 203 
  C_E (C_E (C_D _) (C_F)) (C_D _) -> 204 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_E (C_D _) (C_C _ _)) -> 205 
  C_E (C_C (C_B _) (((_,_),_))) (C_E _ _) -> 206 
  C_E (C_C C_A _) (C_E (C_C _ _) (C_C _ _)) -> 207 
  C_E (C_C C_A _) (C_E _ _) -> 208 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_E _ _) _) -> 209 
  C_E (C_E (C_F) (C_D _)) (C_C _ (((_,_),_))) -> 210 
  C_E (C_E (C_F) (C_F)) (C_E (C_F) (C_E _ _)) -> 211 
  C_E (C_C C_A (((_,_),_))) (C_E (C_F) (C_D _)) -> 212 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_E (C_D _) (C_E _ _)) -> 213 
  C_E (C_C (C_B _) _) (C_E (C_E _ _) _) -> 214 
  C_E (C_E (C_D _) (C_E _ _)) (C_C (C_B _) (((_,_),_))) -> 215 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_D _) (C_F)) -> 216 
  C_E (C_D _) (C_E _ (C_F)) -> 217 
  C_E (C_E _ (C_F)) (C_E (C_D _) (C_C _ _)) -> 218 
  C_E (C_E _ (C_D _)) (C_F) -> 219 
  C_E (C_D C_A) (C_E _ (C_F)) -> 220 
  C_E (C_C C_A _) (C_C C_A _) -> 221 
  C_E (C_E (C_E _ _) (C_F)) (C_E (C_F) (C_C _ _)) -> 222 
  C_E (C_E _ (C_C _ _)) (C_E _ (C_E _ _)) -> 223 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_E (C_F) (C_F)) -> 224 
  C_E (C_C _ _) (C_C C_A (((_,_),_))) -> 225 
  C_E _ (C_E (C_C _ _) (C_D _)) -> 226 
  C_E (C_E (C_F) _) (C_D _) -> 227 
  C_E (C_E (C_D _) _) (C_E _ (C_D _)) -> 228 
  C_E (C_C _ (((_,_),_))) (C_E (C_E _ _) (C_D _)) -> 229 
  C_E (C_E (C_D _) (C_D _)) (C_E _ _) -> 230 
  C_E (C_F) (C_E (C_F) (C_E _ _)) -> 231 
  C_E (C_E (C_D _) (C_F)) (C_F) -> 232 
  C_E (C_E (C_E _ _) (C_D _)) (C_D (C_B _)) -> 233 
  C_E (C_E (C_D _) (C_F)) (C_E (C_D _) (C_E _ _)) -> 234 
  C_E (C_E (C_D _) (C_F)) (C_C C_A (((_,_),_))) -> 235 
  C_E (C_D (C_B _)) (C_D (C_B _)) -> 236 
  C_E (C_E _ (C_C _ _)) (C_C (C_B _) _) -> 237 
  C_E (C_C C_A _) (C_E (C_E _ _) (C_E _ _)) -> 238 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_C _ _) (C_E _ _)) -> 239 
  C_E _ (C_E (C_C _ _) (C_C _ _)) -> 240 
  C_E (C_E (C_C _ _) (C_F)) (C_E (C_D _) _) -> 241 
  C_E (C_E _ _) (C_E (C_C _ _) (C_C _ _)) -> 242 
  C_E (C_E (C_D _) (C_D _)) (C_C (C_B _) _) -> 243 
  C_E (C_E (C_E _ _) (C_F)) (C_D _) -> 244 
  C_E (C_E (C_F) (C_E _ _)) (C_E (C_C _ _) (C_C _ _)) -> 245 
  C_E (C_E _ _) (C_D C_A) -> 246 
  C_E (C_C (C_B _) (((_,_),_))) (C_E (C_E _ _) (C_D _)) -> 247 
  C_E (C_E (C_F) _) (C_E _ (C_F)) -> 248 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_C _ _) _) -> 249 
  C_E (C_C C_A _) (C_E (C_C _ _) (C_E _ _)) -> 250 
  C_E (C_C (C_B _) (((_,_),_))) (C_E (C_C _ _) (C_C _ _)) -> 251 
  C_E (C_C (C_B _) _) _ -> 252 
  C_E (C_D (C_B _)) (C_E (C_D _) (C_C _ _)) -> 253 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_D _) (C_D _)) -> 254 
  C_E (C_D _) (C_E _ (C_E _ _)) -> 255 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_F) (C_F)) -> 256 
  C_E (C_E (C_E _ _) _) (C_E (C_E _ _) (C_F)) -> 257 
  C_E (C_C (C_B _) _) (C_E (C_D _) (C_D _)) -> 258 
