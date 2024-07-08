module Program_5 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (((Bool,Int),Bool)) | C_C (B_A b b) (B_A b b) | C_D

v_a :: B_A Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
  C_C (C_C _ _) (C_C (C_A) _) -> 1 
  C_C (C_C (C_C _ _) (C_D)) (C_C _ (C_A)) -> 2 
  C_C (C_C _ _) (C_C (C_D) (C_C _ _)) -> 3 
  C_C (C_C (C_B _) (C_B _)) (C_C _ (C_C _ _)) -> 4 
  C_C (C_C (C_B _) (C_C _ _)) (C_B _) -> 5 
  C_C (C_C (C_A) _) (C_B _) -> 6 
  C_C (C_C (C_A) _) (C_C (C_C _ _) (C_B _)) -> 7 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_B _) (C_B _)) -> 8 
  C_C (C_C (C_A) (C_D)) (C_C (C_A) (C_A)) -> 9 
  C_C (C_C _ (C_D)) (C_C (C_B _) _) -> 10 
  C_C (C_C _ (C_C _ _)) (C_C (C_A) (C_A)) -> 11 
  C_C (C_C (C_A) (C_A)) (C_C (C_B _) (C_D)) -> 12 
  C_C (C_A) (C_C (C_B _) (C_C _ _)) -> 13 
  C_C (C_C (C_D) _) (C_C (C_D) (C_C _ _)) -> 14 
  C_C (C_C (C_A) (C_C _ _)) (C_C _ (C_A)) -> 15 
  C_C _ (C_C (C_A) (C_C _ _)) -> 16 
  C_C _ (C_B (((_,_),_))) -> 17 
  C_C (C_C (C_B _) (C_C _ _)) (C_C (C_A) (C_A)) -> 18 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_B _) (C_C _ _)) -> 19 
  C_C (C_C (C_B _) (C_C _ _)) (C_C (C_B _) _) -> 20 
  C_C (C_C (C_A) (C_A)) (C_C (C_D) (C_C _ _)) -> 21 
  C_C (C_C (C_D) (C_A)) (C_C (C_D) (C_D)) -> 22 
  C_C (C_C (C_B _) (C_A)) (C_C (C_C _ _) (C_A)) -> 23 
  C_C (C_C (C_A) (C_B _)) (C_C (C_D) _) -> 24 
  C_C (C_C _ (C_C _ _)) (C_C (C_A) (C_B _)) -> 25 
  C_C (C_A) (C_C _ (C_D)) -> 26 
  C_C (C_A) (C_C (C_D) _) -> 27 
  C_C (C_C (C_A) (C_B _)) (C_C (C_C _ _) (C_C _ _)) -> 28 
  C_C (C_C (C_B _) _) (C_C (C_B _) _) -> 29 
  C_C (C_C (C_D) _) (C_C _ (C_B _)) -> 30 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_A) (C_A)) -> 31 
  C_C (C_C _ (C_D)) (C_C (C_B _) (C_D)) -> 32 
  C_C (C_C (C_C _ _) (C_D)) (C_C _ (C_D)) -> 33 
  C_C (C_C (C_B _) (C_D)) (C_B _) -> 34 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_C _ _) (C_D)) -> 35 
  C_C (C_C (C_D) (C_A)) (C_C _ _) -> 36 
  C_C (C_C (C_A) (C_C _ _)) (C_C _ (C_B _)) -> 37 
  C_C (C_C (C_B _) (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 38 
  C_C (C_C (C_B _) _) (C_C _ _) -> 39 
  C_C (C_C _ (C_D)) (C_C _ (C_D)) -> 40 
  C_C (C_C (C_D) (C_D)) (C_C (C_D) (C_D)) -> 41 
  C_C (C_C _ _) (C_C (C_A) (C_A)) -> 42 
  C_C (C_C (C_D) _) (C_C (C_B _) (C_A)) -> 43 
  C_C (C_C _ (C_A)) (C_C (C_A) (C_C _ _)) -> 44 
  C_C (C_C _ (C_C _ _)) (C_C (C_B _) (C_B _)) -> 45 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_B _) (C_A)) -> 46 
  C_C (C_C (C_D) (C_B _)) (C_C _ (C_B _)) -> 47 
  C_C (C_C (C_A) (C_D)) (C_C _ (C_C _ _)) -> 48 
  C_C (C_C (C_B _) (C_D)) (C_C (C_D) (C_B _)) -> 49 
  C_C (C_C (C_D) (C_C _ _)) (C_C (C_D) (C_A)) -> 50 
  C_C (C_C (C_C _ _) _) (C_C _ (C_D)) -> 51 
  C_C (C_C _ (C_C _ _)) (C_C (C_B _) (C_A)) -> 52 
  C_C (C_C (C_D) (C_B _)) (C_C (C_C _ _) _) -> 53 
  C_C (C_C (C_A) (C_B _)) (C_C _ (C_D)) -> 54 
  C_C (C_D) (C_C (C_C _ _) (C_A)) -> 55 
  C_C (C_A) (C_B _) -> 56 
  C_C (C_B (((_,_),_))) (C_C (C_C _ _) _) -> 57 
  C_C (C_C (C_D) (C_D)) (C_C (C_D) (C_C _ _)) -> 58 
  C_C (C_C (C_A) _) (C_C (C_A) (C_D)) -> 59 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_B _) (C_C _ _)) -> 60 
  C_C (C_C (C_D) (C_A)) (C_C (C_C _ _) (C_A)) -> 61 
  C_C (C_C (C_D) (C_A)) (C_C (C_D) (C_B _)) -> 62 
  C_C (C_C (C_B _) (C_B _)) (C_C _ _) -> 63 
  C_C (C_C (C_D) (C_A)) (C_C (C_B _) _) -> 64 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_B _) (C_D)) -> 65 
  C_C (C_B (((_,_),_))) (C_C (C_A) (C_D)) -> 66 
  C_C (C_C (C_D) (C_B _)) (C_C (C_D) (C_B _)) -> 67 
  C_C (C_C (C_B _) (C_A)) (C_C (C_C _ _) (C_C _ _)) -> 68 
  C_C (C_A) (C_C (C_C _ _) (C_A)) -> 69 
  C_C (C_C (C_A) (C_C _ _)) (C_B (((_,_),_))) -> 70 
  C_C (C_C (C_D) (C_D)) (C_C (C_B _) (C_A)) -> 71 
  C_C (C_C (C_C _ _) _) (C_C (C_D) (C_B _)) -> 72 
  C_C _ (C_C (C_D) _) -> 73 
  C_C (C_C _ (C_D)) (C_C (C_C _ _) (C_B _)) -> 74 
  C_C (C_D) (C_C (C_A) (C_A)) -> 75 
  C_C (C_C (C_D) _) (C_C (C_C _ _) _) -> 76 
  C_C _ (C_C _ (C_B _)) -> 77 
  C_C (C_C (C_B _) (C_A)) (C_C (C_A) (C_C _ _)) -> 78 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_A) (C_D)) -> 79 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_A) (C_B _)) -> 80 
  C_C (C_C (C_A) _) (C_C (C_D) _) -> 81 
  C_C (C_C _ (C_B _)) (C_C (C_B _) (C_B _)) -> 82 
  C_C (C_C (C_D) (C_B _)) (C_A) -> 83 
  C_C (C_C _ (C_D)) (C_C (C_A) (C_A)) -> 84 
  C_C (C_B (((_,_),_))) (C_C (C_B _) (C_B _)) -> 85 
  C_C (C_B _) (C_C (C_B _) (C_D)) -> 86 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_C _ _) (C_A)) -> 87 
  C_C (C_C (C_A) (C_B _)) (C_C (C_C _ _) _) -> 88 
  C_C (C_C _ (C_B _)) _ -> 89 
  C_C (C_C (C_B _) (C_B _)) _ -> 90 
  C_C (C_C _ (C_C _ _)) (C_C (C_B _) (C_C _ _)) -> 91 
  C_C (C_C _ _) (C_C (C_D) (C_B _)) -> 92 
  C_C (C_C _ (C_B _)) (C_C _ (C_D)) -> 93 
  C_C (C_C (C_C _ _) (C_D)) _ -> 94 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_A) (C_C _ _)) -> 95 
  C_C (C_C (C_C _ _) (C_D)) (C_B _) -> 96 
  C_C (C_C (C_D) (C_C _ _)) (C_C (C_D) (C_B _)) -> 97 
  C_C (C_C (C_A) (C_D)) (C_C (C_A) (C_B _)) -> 98 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_D) (C_C _ _)) -> 99 
  C_C (C_C _ (C_D)) (C_C (C_A) _) -> 100 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_A) (C_B _)) -> 101 
  C_C (C_C (C_B _) (C_D)) (C_C (C_C _ _) _) -> 102 
  C_C (C_C (C_C _ _) (C_A)) (C_C _ (C_A)) -> 103 
  C_C (C_C (C_D) (C_B _)) _ -> 104 
  C_C (C_C (C_B _) (C_D)) _ -> 105 
  C_C (C_D) (C_C (C_B _) _) -> 106 
  C_C (C_C (C_D) _) (C_C _ (C_D)) -> 107 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_A) (C_B _)) -> 108 
  C_C (C_C (C_B _) (C_A)) (C_C (C_B _) _) -> 109 
  C_C _ (C_C (C_D) (C_A)) -> 110 
  C_C (C_C _ (C_C _ _)) (C_C (C_C _ _) (C_B _)) -> 111 
  C_C (C_C _ (C_B _)) (C_C (C_C _ _) _) -> 112 
  C_C (C_C (C_D) _) (C_C (C_B _) (C_B _)) -> 113 
  C_C (C_C (C_D) (C_D)) _ -> 114 
  C_C (C_C (C_D) (C_B _)) (C_C _ (C_A)) -> 115 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_B _) (C_D)) -> 116 
  C_C (C_B (((_,_),_))) (C_C (C_A) (C_A)) -> 117 
  C_C (C_C (C_C _ _) _) (C_D) -> 118 
  C_C (C_C _ _) (C_C _ (C_B _)) -> 119 
  C_C (C_C (C_A) (C_C _ _)) (C_B _) -> 120 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_C _ _) (C_B _)) -> 121 
  C_C (C_B (((_,_),_))) (C_C (C_C _ _) (C_B _)) -> 122 
  C_C (C_C (C_B _) _) _ -> 123 
  C_C (C_C (C_B _) (C_D)) (C_C _ (C_A)) -> 124 
  C_C (C_B _) (C_C (C_D) (C_B _)) -> 125 
  C_C (C_C _ (C_A)) (C_C _ (C_A)) -> 126 
  C_C (C_C _ _) (C_C (C_A) (C_D)) -> 127 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_C _ _) _) -> 128 
  C_C (C_C _ _) (C_C (C_B _) (C_D)) -> 129 
  C_C (C_C (C_A) _) (C_C (C_B _) _) -> 130 
  C_C (C_C (C_A) _) (C_C _ (C_C _ _)) -> 131 
  C_C (C_C (C_B _) (C_D)) (C_C (C_B _) (C_C _ _)) -> 132 
  C_C (C_B (((_,_),_))) (C_C (C_B _) _) -> 133 
  C_C (C_C _ (C_A)) (C_C (C_D) (C_C _ _)) -> 134 
  C_C (C_C (C_D) (C_C _ _)) _ -> 135 
  C_C (C_C (C_D) (C_B _)) (C_C (C_B _) (C_A)) -> 136 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_A) (C_B _)) -> 137 
  C_C (C_D) (C_C _ (C_B _)) -> 138 
  C_C (C_C (C_B _) _) (C_C (C_D) (C_B _)) -> 139 
  C_C (C_C (C_D) (C_D)) (C_C (C_A) (C_B _)) -> 140 
  C_C (C_C (C_B _) (C_A)) (C_C (C_D) (C_D)) -> 141 
  C_C _ (C_C _ (C_A)) -> 142 
  C_C (C_C (C_C _ _) (C_D)) (C_C _ (C_B _)) -> 143 
  C_C (C_C (C_C _ _) (C_D)) (C_C (C_B _) (C_B _)) -> 144 
  C_C (C_C (C_A) _) (C_B (((_,_),_))) -> 145 
  C_C (C_C (C_B _) (C_A)) (C_A) -> 146 
  C_C (C_C (C_B _) (C_D)) (C_C (C_C _ _) (C_D)) -> 147 
  C_C (C_C _ _) (C_C (C_C _ _) (C_C _ _)) -> 148 
  C_C (C_C (C_A) (C_B _)) (C_C (C_B _) (C_A)) -> 149 
  C_C (C_C (C_A) (C_A)) (C_C (C_D) (C_B _)) -> 150 
  C_C (C_C (C_A) (C_D)) (C_C (C_A) _) -> 151 
  C_C (C_D) (C_A) -> 152 
  C_C (C_C (C_D) (C_D)) (C_C (C_B _) (C_B _)) -> 153 
  C_C (C_C (C_A) (C_A)) (C_B _) -> 154 
  C_C (C_C (C_B _) (C_B _)) (C_C _ (C_D)) -> 155 
  C_C (C_C (C_A) (C_D)) _ -> 156 
  C_C (C_C (C_D) _) (C_C (C_D) (C_D)) -> 157 
  C_C (C_B _) (C_C (C_A) _) -> 158 
  C_C (C_C (C_B _) (C_A)) (C_C (C_C _ _) (C_B _)) -> 159 
  C_C (C_C (C_B _) (C_D)) (C_C _ (C_D)) -> 160 
  C_C (C_C _ (C_C _ _)) (C_B (((_,_),_))) -> 161 
  C_C (C_C (C_C _ _) (C_D)) (C_C (C_D) _) -> 162 
  C_C (C_C (C_B _) _) (C_C (C_A) (C_D)) -> 163 
  C_C (C_C (C_A) _) (C_C (C_B _) (C_D)) -> 164 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 165 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) (C_D)) -> 166 
  C_C (C_C (C_B _) (C_B _)) (C_C _ (C_B _)) -> 167 
  C_C (C_C (C_C _ _) (C_D)) (C_C (C_C _ _) (C_A)) -> 168 
  C_C (C_C (C_A) (C_B _)) (C_C (C_B _) (C_B _)) -> 169 
  C_C (C_C (C_A) (C_D)) (C_B _) -> 170 
  C_C (C_C (C_C _ _) _) (C_C (C_D) (C_D)) -> 171 
  C_C (C_C (C_B _) (C_D)) (C_C (C_A) (C_A)) -> 172 
  C_C (C_B _) (C_C _ (C_D)) -> 173 
  C_C (C_C _ (C_B _)) (C_C (C_B _) (C_C _ _)) -> 174 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_D) (C_C _ _)) -> 175 
  C_C (C_C (C_B _) _) (C_C (C_D) _) -> 176 
  C_C (C_C (C_D) (C_D)) (C_C _ (C_B _)) -> 177 
  C_C (C_C _ (C_C _ _)) (C_C (C_B _) _) -> 178 
  C_C (C_C _ _) (C_C (C_C _ _) (C_B _)) -> 179 
  C_C (C_C (C_C _ _) _) (C_B _) -> 180 
  C_C (C_C (C_A) _) (C_C (C_D) (C_D)) -> 181 
  C_C (C_C (C_A) (C_B _)) (C_D) -> 182 
  C_C (C_C (C_B _) (C_C _ _)) (C_A) -> 183 
  C_C (C_C (C_B _) _) (C_A) -> 184 
  C_C (C_C (C_B _) (C_A)) (C_C (C_A) (C_B _)) -> 185 
  C_C (C_C (C_A) (C_D)) (C_C (C_C _ _) (C_C _ _)) -> 186 
  C_C (C_C _ (C_A)) (C_C _ (C_C _ _)) -> 187 
  C_C (C_C _ (C_A)) (C_C (C_D) (C_A)) -> 188 
  C_C (C_C (C_B _) _) (C_C (C_B _) (C_D)) -> 189 
  C_C (C_C (C_C _ _) _) (C_C (C_D) _) -> 190 
  C_C (C_C (C_A) _) (C_C _ (C_A)) -> 191 
  C_C (C_C _ (C_B _)) (C_B (((_,_),_))) -> 192 
  C_C (C_C (C_D) (C_C _ _)) (C_C (C_D) (C_C _ _)) -> 193 
  C_C (C_D) (C_C _ (C_D)) -> 194 
  C_C (C_C (C_C _ _) _) (C_C (C_D) (C_A)) -> 195 
  C_C (C_C (C_D) (C_A)) (C_C (C_C _ _) (C_D)) -> 196 
  C_C (C_C _ (C_C _ _)) (C_C (C_C _ _) (C_A)) -> 197 
  C_C (C_C (C_D) (C_A)) _ -> 198 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_C _ _) (C_B _)) -> 199 
  C_C (C_B (((_,_),_))) (C_C (C_D) (C_C _ _)) -> 200 
  C_C (C_D) (C_C (C_A) (C_C _ _)) -> 201 
  C_C (C_C _ (C_C _ _)) (C_D) -> 202 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ (C_A)) -> 203 
  C_C (C_C (C_D) (C_B _)) (C_C _ (C_D)) -> 204 
  C_C (C_C (C_C _ _) (C_B _)) (C_A) -> 205 
  C_C _ (C_C (C_C _ _) (C_D)) -> 206 
  C_C (C_B (((_,_),_))) (C_D) -> 207 
  C_C (C_C (C_A) (C_D)) (C_C (C_D) (C_B _)) -> 208 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_B _) _) -> 209 
  C_C (C_C (C_D) _) (C_C (C_A) (C_A)) -> 210 
  C_C (C_C (C_D) (C_B _)) (C_C (C_C _ _) (C_D)) -> 211 
  C_C (C_C (C_D) _) (C_C (C_C _ _) (C_D)) -> 212 
  C_C (C_C _ (C_A)) (C_B _) -> 213 
  C_C (C_C _ (C_D)) (C_B (((_,_),_))) -> 214 
  C_C (C_C _ (C_A)) (C_C _ (C_B _)) -> 215 
  C_C (C_C _ (C_A)) (C_C (C_C _ _) (C_B _)) -> 216 
  C_C (C_C _ (C_D)) (C_C (C_B _) (C_C _ _)) -> 217 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_C _ _) _) -> 218 
  C_C (C_C (C_D) (C_A)) (C_C (C_A) (C_D)) -> 219 
  C_C (C_C (C_D) (C_A)) (C_C (C_B _) (C_B _)) -> 220 
  C_C (C_C _ (C_B _)) (C_C (C_C _ _) (C_B _)) -> 221 
  C_C (C_C (C_A) (C_A)) (C_D) -> 222 
  C_C _ (C_C (C_C _ _) (C_A)) -> 223 
  C_C (C_C (C_A) _) (C_C _ (C_D)) -> 224 
  C_C (C_C (C_B _) (C_C _ _)) (C_C (C_D) (C_C _ _)) -> 225 
  C_C (C_C _ (C_A)) (C_B (((_,_),_))) -> 226 
  C_C (C_C (C_D) (C_D)) (C_C _ (C_D)) -> 227 
  C_C (C_C (C_D) (C_D)) (C_C (C_C _ _) (C_A)) -> 228 
  C_C (C_C (C_D) (C_A)) (C_C (C_D) _) -> 229 
  C_C (C_C _ (C_B _)) (C_C (C_D) (C_A)) -> 230 
  C_C (C_C (C_A) (C_A)) (C_C (C_B _) (C_C _ _)) -> 231 
  C_C (C_C (C_B _) (C_A)) (C_C (C_C _ _) _) -> 232 
  C_C (C_C _ (C_B _)) (C_C (C_A) _) -> 233 
  C_C (C_C (C_D) (C_B _)) (C_C (C_A) (C_D)) -> 234 
