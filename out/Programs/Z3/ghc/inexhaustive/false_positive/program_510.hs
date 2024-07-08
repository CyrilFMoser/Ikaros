module Program_30 () where 

main = print $ show v_b
data B_A a = C_A (B_A a) | C_B | C_C (((Bool,Int),Bool)) (B_A a) | C_D (B_A a) (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_C (((_,_),_)) _) -> 0 
  C_A (C_D (C_D _ _) (C_B)) -> 1 
  C_C _ (C_C (((_,_),_)) (C_B)) -> 2 
  C_C (((_,_),_)) (C_D (C_A _) (C_D _ _)) -> 3 
  C_C (((_,_),_)) (C_D (C_A _) (C_A _)) -> 4 
  C_C _ (C_D (C_A _) (C_D _ _)) -> 5 
  C_C (((_,_),_)) (C_A _) -> 6 
  C_C _ (C_A (C_C _ _)) -> 7 
  C_C (((_,_),_)) (C_D _ (C_C _ _)) -> 8 
  C_C (((_,_),_)) _ -> 9 
  C_C _ (C_C (((_,_),_)) (C_D _ _)) -> 10 
  C_C (((_,_),_)) (C_D (C_C _ _) (C_C _ _)) -> 11 
  C_C _ (C_D (C_D _ _) (C_C _ _)) -> 12 
  C_C _ (C_D (C_A _) (C_A _)) -> 13 
  C_C (((_,_),_)) (C_B) -> 14 
  C_C (((_,_),_)) (C_D (C_A _) (C_C _ _)) -> 15 
  C_D (C_C (((_,_),_)) (C_B)) (C_D _ (C_B)) -> 16 
  C_D (C_D (C_C _ _) (C_A _)) (C_C _ _) -> 17 
  C_D (C_D _ (C_B)) (C_D (C_D _ _) (C_B)) -> 18 
  C_D (C_C (((_,_),_)) (C_A _)) (C_A (C_B)) -> 19 
  C_D (C_D _ (C_B)) (C_D (C_C _ _) (C_B)) -> 20 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D _ (C_D _ _)) -> 21 
  C_D (C_C _ (C_D _ _)) (C_D _ (C_B)) -> 22 
  C_D (C_C _ _) (C_D _ (C_D _ _)) -> 23 
  C_D (C_C _ (C_D _ _)) (C_A _) -> 24 
  C_D (C_C _ (C_A _)) (C_D (C_D _ _) (C_A _)) -> 25 
  C_D (C_D (C_A _) (C_A _)) (C_C (((_,_),_)) _) -> 26 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_D _ _) _) -> 27 
  C_D (C_A (C_A _)) (C_D (C_B) (C_D _ _)) -> 28 
  C_D (C_D (C_C _ _) (C_A _)) (C_C _ (C_D _ _)) -> 29 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_B) (C_C _ _)) -> 30 
  C_D (C_A _) (C_D (C_B) (C_A _)) -> 31 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_B) _) -> 32 
  C_D (C_D (C_A _) _) (C_A (C_B)) -> 33 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_D (C_D _ _) (C_A _)) -> 34 
  C_D (C_A (C_B)) (C_D _ _) -> 35 
  C_D (C_D _ (C_C _ _)) (C_D (C_C _ _) _) -> 36 
  C_D (C_D _ (C_B)) (C_B) -> 37 
  C_D (C_D (C_B) (C_D _ _)) (C_C _ (C_D _ _)) -> 38 
  C_D (C_C _ (C_C _ _)) (C_C _ (C_A _)) -> 39 
  C_D (C_C (((_,_),_)) (C_D _ _)) (C_C (((_,_),_)) _) -> 40 
  C_D (C_B) (C_C (((_,_),_)) (C_D _ _)) -> 41 
  C_D (C_C (((_,_),_)) (C_B)) (C_D (C_A _) (C_B)) -> 42 
  C_D (C_D (C_B) (C_A _)) (C_D (C_A _) _) -> 43 
  C_D (C_C _ (C_B)) (C_D _ _) -> 44 
  C_D (C_D _ _) (C_C _ (C_B)) -> 45 
  C_D (C_D _ (C_C _ _)) (C_D (C_C _ _) (C_B)) -> 46 
  C_D (C_D (C_B) (C_D _ _)) (C_C _ (C_B)) -> 47 
  C_D (C_A (C_B)) (C_D (C_A _) (C_B)) -> 48 
  C_D (C_D (C_C _ _) (C_A _)) (C_A (C_A _)) -> 49 
  C_D (C_D (C_A _) _) (C_B) -> 50 
  C_D (C_D (C_A _) _) (C_D (C_D _ _) _) -> 51 
  C_D (C_D (C_B) (C_A _)) (C_C (((_,_),_)) (C_D _ _)) -> 52 
  C_D (C_D (C_C _ _) _) (C_C _ (C_D _ _)) -> 53 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_A _) (C_A _)) -> 54 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_D _ _) (C_C _ _)) -> 55 
  C_D (C_A _) (C_D _ (C_A _)) -> 56 
  C_D (C_C _ (C_B)) (C_D (C_A _) (C_B)) -> 57 
  C_D _ (C_D (C_C _ _) (C_C _ _)) -> 58 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_A _) _) -> 59 
  C_D _ (C_D (C_A _) (C_C _ _)) -> 60 
  C_D (C_D (C_D _ _) _) (C_D (C_D _ _) (C_C _ _)) -> 61 
  C_D (C_A (C_D _ _)) (C_C (((_,_),_)) (C_A _)) -> 62 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_C _ _) (C_C _ _)) -> 63 
  C_D (C_C (((_,_),_)) (C_B)) (C_C (((_,_),_)) (C_D _ _)) -> 64 
  C_D (C_D (C_B) (C_A _)) (C_A (C_A _)) -> 65 
  C_D (C_D (C_C _ _) (C_A _)) (C_C (((_,_),_)) (C_D _ _)) -> 66 
  C_D (C_B) (C_D (C_D _ _) (C_D _ _)) -> 67 
  C_D (C_D (C_B) (C_B)) (C_D (C_A _) _) -> 68 
  C_D _ (C_A (C_A _)) -> 69 
  C_D (C_C _ (C_C _ _)) (C_A (C_A _)) -> 70 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_C _ _) -> 71 
  C_D (C_D (C_C _ _) (C_A _)) (C_D _ (C_C _ _)) -> 72 
  C_D (C_B) (C_C (((_,_),_)) _) -> 73 
  C_D (C_D (C_A _) (C_B)) (C_D (C_D _ _) (C_B)) -> 74 
  C_D (C_D _ (C_D _ _)) (C_C _ (C_C _ _)) -> 75 
  C_D (C_D (C_C _ _) _) (C_D (C_A _) (C_D _ _)) -> 76 
  C_D (C_A _) (C_D (C_A _) (C_D _ _)) -> 77 
  C_D (C_D (C_A _) (C_B)) (C_D (C_C _ _) _) -> 78 
  C_D (C_D (C_B) _) (C_D (C_A _) (C_A _)) -> 79 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_D _ _) (C_A _)) -> 80 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_C _ (C_B)) -> 81 
  C_D (C_D (C_B) (C_A _)) (C_D _ _) -> 82 
  C_D (C_A (C_D _ _)) (C_A (C_C _ _)) -> 83 
  C_D (C_D (C_D _ _) (C_A _)) (C_D (C_B) (C_A _)) -> 84 
  C_D (C_C (((_,_),_)) (C_A _)) (C_D _ (C_C _ _)) -> 85 
  C_D (C_A (C_D _ _)) (C_D (C_A _) (C_B)) -> 86 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_B) (C_B)) -> 87 
  C_D (C_D _ (C_D _ _)) (C_D (C_C _ _) (C_C _ _)) -> 88 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_C (((_,_),_)) (C_B)) -> 89 
  C_D (C_D (C_A _) (C_C _ _)) (C_D (C_A _) (C_A _)) -> 90 
  C_D (C_C _ (C_C _ _)) (C_D (C_A _) _) -> 91 
  C_D (C_D (C_B) (C_A _)) (C_B) -> 92 
  C_D (C_D (C_B) (C_B)) (C_C _ (C_D _ _)) -> 93 
  C_D (C_D (C_A _) (C_D _ _)) (C_D (C_C _ _) (C_C _ _)) -> 94 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_A (C_D _ _)) -> 95 
  C_D (C_D (C_A _) (C_D _ _)) (C_A (C_A _)) -> 96 
  C_D (C_C _ (C_C _ _)) (C_C (((_,_),_)) (C_A _)) -> 97 
  C_D (C_D (C_A _) (C_D _ _)) (C_D (C_A _) (C_D _ _)) -> 98 
  C_D (C_C (((_,_),_)) (C_D _ _)) (C_D (C_A _) (C_D _ _)) -> 99 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_C (((_,_),_)) (C_D _ _)) -> 100 
  C_D (C_A (C_C _ _)) (C_C (((_,_),_)) (C_A _)) -> 101 
  C_D (C_C (((_,_),_)) _) (C_D (C_B) (C_C _ _)) -> 102 
  C_D (C_D (C_B) (C_B)) (C_D (C_D _ _) (C_C _ _)) -> 103 
  C_D (C_C _ (C_B)) (C_C _ _) -> 104 
  C_D (C_D (C_D _ _) (C_A _)) (C_D (C_A _) _) -> 105 
  C_D (C_C _ _) (C_A (C_D _ _)) -> 106 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_D (C_C _ _) _) -> 107 
  C_D (C_D (C_B) (C_C _ _)) (C_D _ (C_D _ _)) -> 108 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_B) (C_D _ _)) -> 109 
  C_D (C_A (C_D _ _)) (C_D (C_C _ _) (C_D _ _)) -> 110 
  C_D (C_C (((_,_),_)) (C_B)) (C_A _) -> 111 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_A (C_B)) -> 112 
  C_D (C_C (((_,_),_)) (C_B)) (C_D (C_D _ _) (C_D _ _)) -> 113 
  C_D (C_D _ _) (C_D (C_A _) (C_C _ _)) -> 114 
  C_D (C_D _ (C_A _)) (C_D (C_D _ _) _) -> 115 
  C_D (C_D _ _) (C_C _ (C_A _)) -> 116 
  C_D (C_D _ _) (C_A (C_A _)) -> 117 
  C_D (C_C _ _) (C_D _ (C_B)) -> 118 
  C_D (C_C (((_,_),_)) (C_A _)) (C_C _ (C_A _)) -> 119 
  C_D (C_D _ (C_D _ _)) (C_D (C_B) _) -> 120 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_C _ _) (C_A _)) -> 121 
  C_D (C_A (C_B)) (C_A (C_A _)) -> 122 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_C _ _) (C_A _)) -> 123 
  C_D (C_D _ (C_C _ _)) (C_C _ (C_B)) -> 124 
  C_D (C_D _ (C_A _)) (C_D _ (C_C _ _)) -> 125 
  C_D (C_D _ (C_B)) (C_D (C_D _ _) (C_C _ _)) -> 126 
  C_D (C_C (((_,_),_)) _) (C_D _ (C_A _)) -> 127 
  C_D (C_D _ (C_A _)) (C_D (C_B) (C_A _)) -> 128 
  C_D (C_D (C_D _ _) (C_A _)) (C_D (C_C _ _) (C_D _ _)) -> 129 
  C_D (C_D (C_B) (C_B)) (C_D (C_B) (C_A _)) -> 130 
  C_D (C_C _ _) (C_D (C_B) (C_C _ _)) -> 131 
  C_D _ (C_C _ (C_D _ _)) -> 132 
  C_D (C_D (C_B) _) (C_D (C_A _) (C_C _ _)) -> 133 
  C_D (C_C _ (C_A _)) (C_D (C_D _ _) _) -> 134 
  C_D (C_A (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 135 
  C_D (C_A _) (C_D (C_C _ _) (C_A _)) -> 136 
  C_D (C_C (((_,_),_)) (C_D _ _)) (C_C (((_,_),_)) (C_A _)) -> 137 
  C_D (C_D _ (C_C _ _)) (C_D (C_B) (C_B)) -> 138 
  C_D (C_A (C_A _)) (C_D (C_D _ _) (C_B)) -> 139 
  C_D (C_C _ (C_D _ _)) (C_D (C_A _) (C_A _)) -> 140 
  C_D (C_D (C_D _ _) _) (C_D (C_D _ _) (C_D _ _)) -> 141 
  C_D (C_D _ _) (C_D _ (C_B)) -> 142 
  C_D _ (C_D (C_A _) (C_A _)) -> 143 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_A (C_C _ _)) -> 144 
  C_D (C_B) (C_C _ _) -> 145 
  C_D (C_D _ (C_D _ _)) (C_C _ _) -> 146 
  C_D (C_D (C_D _ _) _) (C_D _ (C_C _ _)) -> 147 
  C_D (C_A (C_C _ _)) (C_D (C_A _) (C_B)) -> 148 
  C_D (C_D _ _) (C_D (C_B) (C_D _ _)) -> 149 
  C_D (C_C _ (C_A _)) (C_D (C_C _ _) (C_C _ _)) -> 150 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_C _ _) _) -> 151 
  C_D (C_D _ (C_C _ _)) (C_D _ (C_D _ _)) -> 152 
  C_D (C_B) (C_C (((_,_),_)) (C_A _)) -> 153 
  C_D (C_D (C_A _) _) (C_D (C_A _) (C_C _ _)) -> 154 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D _ (C_C _ _)) -> 155 
  C_D (C_D (C_A _) (C_D _ _)) (C_C (((_,_),_)) (C_A _)) -> 156 
  C_D (C_D (C_C _ _) _) (C_D _ (C_C _ _)) -> 157 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_A _) -> 158 
  C_D (C_C _ _) (C_D (C_B) _) -> 159 
  C_D _ (C_A (C_B)) -> 160 
  C_D (C_C _ (C_A _)) (C_C _ (C_A _)) -> 161 
  C_D (C_D _ (C_D _ _)) (C_A (C_A _)) -> 162 
  C_D (C_D _ (C_A _)) (C_A (C_B)) -> 163 
  C_D (C_D (C_C _ _) (C_A _)) (C_A (C_C _ _)) -> 164 
  C_D (C_D (C_B) _) (C_D (C_C _ _) _) -> 165 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_D _ _) (C_A _)) -> 166 
  C_D (C_C _ (C_A _)) (C_D (C_C _ _) _) -> 167 
  C_D (C_B) (C_C (((_,_),_)) (C_B)) -> 168 
  C_D (C_D (C_A _) (C_D _ _)) (C_D (C_C _ _) (C_A _)) -> 169 
  C_D (C_C (((_,_),_)) _) (C_A (C_A _)) -> 170 
  C_D (C_D _ (C_D _ _)) (C_D (C_A _) _) -> 171 
  C_D (C_B) (C_D (C_D _ _) (C_A _)) -> 172 
  C_D (C_C (((_,_),_)) _) (C_D _ (C_B)) -> 173 
  C_D (C_D (C_A _) (C_A _)) (C_D (C_C _ _) (C_D _ _)) -> 174 
  C_D (C_A _) (C_C _ _) -> 175 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_D _ _) (C_A _)) -> 176 
  C_D (C_D (C_B) _) (C_C _ (C_C _ _)) -> 177 
  C_D _ (C_B) -> 178 
  C_D (C_C _ (C_D _ _)) (C_D (C_A _) (C_C _ _)) -> 179 
  C_D (C_D (C_C _ _) _) (C_D (C_B) (C_B)) -> 180 
  C_D (C_D (C_D _ _) (C_A _)) (C_C _ (C_A _)) -> 181 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_C _ _) (C_B)) -> 182 
  C_D (C_C _ (C_A _)) (C_D (C_B) (C_D _ _)) -> 183 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_D (C_A _) (C_A _)) -> 184 
  C_D (C_D (C_D _ _) _) (C_C _ (C_C _ _)) -> 185 
  C_D (C_D (C_C _ _) _) (C_D (C_A _) (C_C _ _)) -> 186 
  C_D (C_D (C_A _) _) (C_D (C_A _) _) -> 187 
  C_D (C_C _ (C_D _ _)) (C_C _ (C_A _)) -> 188 
  C_D (C_C (((_,_),_)) (C_D _ _)) (C_D (C_A _) (C_B)) -> 189 
  C_D (C_D (C_A _) _) (C_C _ _) -> 190 
  C_D (C_D (C_D _ _) (C_A _)) (C_C (((_,_),_)) _) -> 191 
  C_D (C_D _ (C_A _)) (C_C _ (C_A _)) -> 192 
  C_D (C_D (C_C _ _) _) (C_D (C_A _) _) -> 193 
  C_D (C_D _ (C_D _ _)) (C_D _ (C_D _ _)) -> 194 
  C_D (C_C _ (C_D _ _)) (C_D (C_D _ _) _) -> 195 
  C_D (C_A (C_D _ _)) (C_D (C_D _ _) (C_D _ _)) -> 196 
  C_D (C_D (C_A _) _) (C_C _ (C_A _)) -> 197 
  C_D (C_D (C_D _ _) _) (C_C (((_,_),_)) (C_D _ _)) -> 198 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_D _ _) (C_B)) -> 199 
  C_D (C_C _ _) (C_A _) -> 200 
  C_D (C_C _ _) (C_D (C_B) (C_D _ _)) -> 201 
  C_D (C_D _ (C_C _ _)) (C_D (C_C _ _) (C_A _)) -> 202 
  C_D (C_D _ (C_D _ _)) (C_D _ (C_A _)) -> 203 
  C_D (C_A (C_D _ _)) (C_A (C_D _ _)) -> 204 
  C_D (C_D (C_A _) (C_A _)) (C_D _ (C_D _ _)) -> 205 
  C_D (C_D (C_A _) (C_A _)) (C_D (C_B) (C_A _)) -> 206 
  C_D (C_A (C_C _ _)) (C_D (C_D _ _) _) -> 207 
  C_D (C_D (C_A _) (C_C _ _)) (C_D _ (C_B)) -> 208 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_D (C_C _ _) (C_D _ _)) -> 209 
  C_D (C_D _ (C_B)) (C_D _ _) -> 210 
  C_D (C_D (C_D _ _) _) (C_D _ (C_A _)) -> 211 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_D (C_B) (C_D _ _)) -> 212 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_D _ _) (C_D _ _)) -> 213 
  C_D (C_D _ (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 214 
  C_D (C_C (((_,_),_)) (C_D _ _)) (C_A (C_C _ _)) -> 215 
  C_D (C_D (C_A _) _) (C_A (C_A _)) -> 216 
  C_D (C_D _ _) (C_D (C_A _) (C_D _ _)) -> 217 
  C_D (C_D (C_A _) (C_D _ _)) (C_C (((_,_),_)) (C_B)) -> 218 
  C_D (C_C _ (C_A _)) (C_C (((_,_),_)) _) -> 219 
  C_D (C_A (C_B)) (C_D _ (C_D _ _)) -> 220 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_D _ _) (C_B)) -> 221 
  C_D (C_D (C_D _ _) (C_A _)) (C_D (C_A _) (C_A _)) -> 222 
  C_D (C_D _ (C_A _)) (C_D (C_D _ _) (C_C _ _)) -> 223 
  C_D (C_C _ (C_A _)) (C_D (C_A _) (C_D _ _)) -> 224 
  C_D (C_D _ (C_C _ _)) (C_C _ (C_A _)) -> 225 
  C_D (C_A (C_B)) (C_C (((_,_),_)) _) -> 226 
  C_D (C_D (C_A _) (C_A _)) (C_D (C_B) (C_B)) -> 227 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_D (C_B) (C_A _)) -> 228 
  C_D (C_C _ (C_C _ _)) (C_D _ (C_D _ _)) -> 229 
  C_D _ (C_D (C_B) (C_D _ _)) -> 230 
  C_D (C_A (C_A _)) (C_C _ _) -> 231 
  C_D (C_C _ (C_D _ _)) (C_C _ _) -> 232 
  C_D (C_C _ (C_C _ _)) (C_C _ (C_B)) -> 233 
  C_D (C_D _ (C_A _)) (C_D (C_C _ _) (C_A _)) -> 234 
  C_D (C_D (C_D _ _) (C_D _ _)) _ -> 235 
  C_D (C_C _ (C_D _ _)) (C_C (((_,_),_)) (C_C _ _)) -> 236 
  C_D (C_D _ (C_D _ _)) (C_D (C_A _) (C_B)) -> 237 
  C_D (C_D (C_A _) (C_A _)) (C_C _ (C_D _ _)) -> 238 
  C_D (C_D (C_A _) _) (C_D (C_B) (C_C _ _)) -> 239 
  C_D (C_C _ (C_C _ _)) (C_D _ (C_A _)) -> 240 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_C (((_,_),_)) _) -> 241 
  C_D (C_C _ (C_B)) (C_D (C_C _ _) (C_D _ _)) -> 242 
  C_D (C_C _ (C_C _ _)) (C_C (((_,_),_)) (C_B)) -> 243 
  C_D (C_D (C_A _) (C_B)) (C_C _ (C_C _ _)) -> 244 
  C_D (C_C _ (C_B)) (C_D (C_D _ _) (C_B)) -> 245 
  C_D (C_C _ (C_D _ _)) (C_D (C_B) (C_A _)) -> 246 
  C_D (C_C _ (C_A _)) (C_D (C_A _) (C_B)) -> 247 
  C_D (C_C _ (C_A _)) (C_C (((_,_),_)) (C_C _ _)) -> 248 
  C_D (C_D (C_D _ _) (C_B)) (C_C _ _) -> 249 
  C_D (C_D (C_C _ _) (C_B)) (C_D (C_B) (C_B)) -> 250 
  C_D (C_D (C_D _ _) (C_A _)) (C_D (C_D _ _) (C_B)) -> 251 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_C (((_,_),_)) (C_B)) -> 252 
  C_D (C_C _ (C_B)) (C_A (C_B)) -> 253 
  C_D (C_A (C_D _ _)) (C_D (C_A _) (C_A _)) -> 254 
  C_D (C_D (C_B) (C_B)) (C_C _ (C_A _)) -> 255 
  C_D (C_D (C_D _ _) _) (C_D (C_C _ _) _) -> 256 
  C_D (C_B) (C_A _) -> 257 
  C_D (C_D (C_D _ _) _) (C_D (C_C _ _) (C_A _)) -> 258 
  C_D (C_C (((_,_),_)) (C_D _ _)) (C_D (C_D _ _) (C_B)) -> 259 
  C_D (C_D _ (C_C _ _)) (C_D (C_B) (C_D _ _)) -> 260 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_C _ _) _) -> 261 
  C_D (C_C _ (C_B)) (C_A _) -> 262 
  C_D (C_C _ (C_B)) (C_C (((_,_),_)) (C_B)) -> 263 
  C_D (C_D (C_B) (C_C _ _)) (C_D _ _) -> 264 
  C_D (C_C _ (C_D _ _)) (C_D (C_D _ _) (C_B)) -> 265 
  C_D (C_A (C_B)) (C_D (C_C _ _) _) -> 266 
  C_D (C_B) (C_D (C_A _) (C_A _)) -> 267 
  C_D (C_B) (C_D _ _) -> 268 
  C_D (C_A (C_B)) (C_C _ (C_C _ _)) -> 269 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_C _ _) (C_B)) -> 270 
  C_D (C_C _ _) (C_D (C_D _ _) (C_A _)) -> 271 
  C_D (C_D (C_A _) _) (C_D (C_D _ _) (C_A _)) -> 272 
  C_D (C_A (C_B)) (C_C _ _) -> 273 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_A (C_A _)) -> 274 
  C_D (C_D (C_B) (C_D _ _)) (C_C (((_,_),_)) (C_C _ _)) -> 275 
  C_D (C_D (C_A _) _) (C_D _ (C_A _)) -> 276 
  C_D (C_C (((_,_),_)) (C_A _)) (C_D (C_C _ _) (C_D _ _)) -> 277 
  C_D (C_C _ (C_B)) (C_D (C_C _ _) (C_A _)) -> 278 
  C_D (C_D (C_C _ _) _) (C_D (C_C _ _) (C_C _ _)) -> 279 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_D _ _) _) -> 280 
  C_D (C_D (C_A _) (C_C _ _)) (C_D (C_C _ _) _) -> 281 
  C_D (C_C (((_,_),_)) (C_D _ _)) (C_D (C_B) _) -> 282 
  C_D (C_C _ (C_B)) (C_C _ (C_C _ _)) -> 283 
  C_D (C_D (C_C _ _) (C_B)) (C_A _) -> 284 
  C_D (C_B) _ -> 285 
  C_D (C_D (C_A _) (C_B)) (C_A (C_B)) -> 286 
  C_D (C_A _) (C_D (C_B) (C_B)) -> 287 
  C_D (C_B) (C_D (C_C _ _) _) -> 288 
  C_D (C_A _) (C_D (C_A _) _) -> 289 
  C_D (C_D _ _) (C_D (C_D _ _) (C_D _ _)) -> 290 
  C_D (C_A (C_D _ _)) (C_C (((_,_),_)) (C_B)) -> 291 
  C_D (C_D _ (C_C _ _)) (C_D (C_C _ _) (C_C _ _)) -> 292 
  C_D (C_C _ _) (C_D (C_B) (C_B)) -> 293 
  C_D (C_D (C_A _) (C_C _ _)) (C_D (C_C _ _) (C_A _)) -> 294 
  C_D (C_A (C_C _ _)) (C_C _ _) -> 295 
  C_D (C_D _ (C_B)) (C_D _ (C_B)) -> 296 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_A _) -> 297 
  C_D (C_C (((_,_),_)) (C_A _)) (C_D (C_A _) (C_A _)) -> 298 
  C_D (C_C _ (C_A _)) (C_D (C_B) (C_C _ _)) -> 299 
