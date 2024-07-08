module Program_31 () where 

main = print $ show v_b
data B_A a = C_A (B_A a) | C_B | C_C (((Bool,Int),Bool)) (B_A a) | C_D (B_A a) (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_C _ (C_C _ _)) -> 0 
  C_A (C_C (((_,_),_)) (C_B)) -> 1 
  C_A (C_D (C_D _ _) (C_C _ _)) -> 2 
  C_A (C_B) -> 3 
  C_A (C_D (C_D _ _) (C_A _)) -> 4 
  C_A (C_D (C_C _ _) (C_B)) -> 5 
  C_A (C_D _ _) -> 6 
  C_A (C_A (C_C _ _)) -> 7 
  C_A (C_D (C_D _ _) _) -> 8 
  C_A (C_D (C_B) _) -> 9 
  C_A (C_D _ (C_C _ _)) -> 10 
  C_A (C_D (C_C _ _) (C_D _ _)) -> 11 
  C_A (C_D (C_B) (C_A _)) -> 12 
  C_A (C_D (C_C _ _) (C_A _)) -> 13 
  C_A (C_D (C_A _) (C_C _ _)) -> 14 
  C_A (C_D (C_C _ _) _) -> 15 
  C_A (C_D (C_A _) (C_A _)) -> 16 
  C_A (C_D (C_A _) (C_D _ _)) -> 17 
  C_A (C_D (C_B) (C_B)) -> 18 
  C_A (C_C (((_,_),_)) (C_C _ _)) -> 19 
  C_A (C_D _ (C_A _)) -> 20 
  C_A (C_A (C_B)) -> 21 
  C_A (C_A (C_D _ _)) -> 22 
  C_A (C_C _ (C_D _ _)) -> 23 
  C_A (C_C _ (C_A _)) -> 24 
  C_A (C_C _ _) -> 25 
  C_C (((_,_),_)) (C_C (((_,_),_)) _) -> 26 
  C_C _ (C_D _ (C_A _)) -> 27 
  C_C (((_,_),_)) (C_D (C_B) (C_C _ _)) -> 28 
  C_C (((_,_),_)) (C_C (((_,_),_)) (C_A _)) -> 29 
  C_D (C_C (((_,_),_)) (C_A _)) (C_D (C_D _ _) (C_A _)) -> 30 
  C_D (C_C (((_,_),_)) _) (C_D (C_A _) (C_B)) -> 31 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_C _ (C_C _ _)) -> 32 
  C_D (C_D _ _) (C_C (((_,_),_)) _) -> 33 
  C_D (C_A _) (C_D (C_D _ _) (C_C _ _)) -> 34 
  C_D (C_D (C_A _) (C_A _)) (C_D (C_D _ _) _) -> 35 
  C_D _ (C_D (C_D _ _) (C_C _ _)) -> 36 
  C_D (C_C (((_,_),_)) (C_B)) (C_D (C_A _) (C_A _)) -> 37 
  C_D (C_D (C_A _) _) (C_D (C_A _) (C_A _)) -> 38 
  C_D (C_D (C_A _) (C_D _ _)) (C_D (C_D _ _) (C_A _)) -> 39 
  C_D (C_A (C_B)) (C_D (C_A _) (C_C _ _)) -> 40 
  C_D (C_C _ _) (C_D (C_A _) (C_C _ _)) -> 41 
  C_D (C_C _ (C_B)) (C_D (C_B) (C_C _ _)) -> 42 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_C (((_,_),_)) _) -> 43 
  C_D (C_C (((_,_),_)) _) (C_D (C_B) (C_A _)) -> 44 
  C_D (C_C _ (C_C _ _)) (C_D (C_B) (C_A _)) -> 45 
  C_D (C_D _ (C_D _ _)) (C_C (((_,_),_)) (C_C _ _)) -> 46 
  C_D (C_D (C_C _ _) (C_A _)) (C_C (((_,_),_)) (C_A _)) -> 47 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_A _) (C_D _ _)) -> 48 
  C_D (C_A (C_B)) (C_A _) -> 49 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_D _ (C_D _ _)) -> 50 
  C_D _ (C_A (C_D _ _)) -> 51 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_C (((_,_),_)) (C_C _ _)) -> 52 
  C_D (C_C _ (C_A _)) (C_D (C_C _ _) (C_A _)) -> 53 
  C_D (C_D (C_C _ _) (C_B)) _ -> 54 
  C_D (C_D (C_A _) (C_D _ _)) _ -> 55 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_C _ _) _) -> 56 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_C _ _) (C_C _ _)) -> 57 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_A (C_D _ _)) -> 58 
  C_D (C_D (C_C _ _) (C_A _)) (C_B) -> 59 
  C_D (C_D (C_B) (C_B)) (C_D (C_A _) (C_C _ _)) -> 60 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_C _ (C_A _)) -> 61 
  C_D (C_D (C_A _) (C_A _)) (C_C (((_,_),_)) (C_C _ _)) -> 62 
  C_D (C_D (C_B) (C_C _ _)) (C_C _ _) -> 63 
  C_D (C_D (C_D _ _) (C_A _)) (C_D (C_C _ _) _) -> 64 
  C_D (C_C _ (C_D _ _)) (C_D _ (C_C _ _)) -> 65 
  C_D (C_C _ (C_D _ _)) (C_C _ (C_B)) -> 66 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_A _) (C_B)) -> 67 
  C_D (C_A (C_C _ _)) (C_D (C_B) (C_A _)) -> 68 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_D _ _) (C_C _ _)) -> 69 
  C_D (C_A (C_B)) (C_D (C_A _) _) -> 70 
  C_D (C_D _ _) (C_D _ (C_A _)) -> 71 
  C_D (C_A _) (C_D (C_C _ _) (C_B)) -> 72 
  C_D (C_D _ _) (C_D (C_B) (C_B)) -> 73 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_C _ (C_B)) -> 74 
  C_D _ (C_D _ (C_C _ _)) -> 75 
  C_D (C_D (C_C _ _) (C_B)) (C_A (C_C _ _)) -> 76 
  C_D (C_D _ (C_B)) (C_C (((_,_),_)) (C_A _)) -> 77 
  C_D (C_D (C_C _ _) _) (C_D (C_C _ _) (C_A _)) -> 78 
  C_D (C_C _ (C_B)) (C_D (C_D _ _) (C_D _ _)) -> 79 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D _ (C_D _ _)) -> 80 
  C_D (C_D (C_A _) _) (C_D (C_A _) (C_D _ _)) -> 81 
  C_D (C_C _ _) (C_D (C_D _ _) _) -> 82 
  C_D (C_D (C_C _ _) (C_B)) (C_C _ (C_D _ _)) -> 83 
  C_D (C_C (((_,_),_)) (C_D _ _)) (C_B) -> 84 
  C_D (C_C (((_,_),_)) (C_A _)) (C_D (C_D _ _) (C_D _ _)) -> 85 
  C_D (C_D (C_A _) (C_C _ _)) (C_C (((_,_),_)) (C_D _ _)) -> 86 
  C_D (C_D (C_C _ _) _) (C_D (C_B) (C_C _ _)) -> 87 
  C_D (C_A (C_A _)) (C_D _ (C_C _ _)) -> 88 
  C_D (C_D (C_A _) _) (C_D (C_A _) (C_B)) -> 89 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_A _) _) -> 90 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D _ _) -> 91 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_A _) -> 92 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_C _ _) _) -> 93 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_A _) (C_B)) -> 94 
  C_D (C_C (((_,_),_)) (C_D _ _)) (C_D (C_C _ _) (C_D _ _)) -> 95 
  C_D (C_D (C_A _) (C_A _)) (C_D _ (C_A _)) -> 96 
  C_D (C_A (C_D _ _)) (C_D (C_A _) (C_D _ _)) -> 97 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_A _) (C_A _)) -> 98 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_D _ (C_A _)) -> 99 
  C_D (C_D _ (C_D _ _)) (C_C (((_,_),_)) (C_A _)) -> 100 
  C_D (C_D _ (C_B)) (C_C _ (C_C _ _)) -> 101 
  C_D (C_B) (C_D (C_C _ _) (C_A _)) -> 102 
  C_D (C_D _ (C_D _ _)) (C_D (C_C _ _) _) -> 103 
  C_D (C_A (C_B)) (C_C _ (C_D _ _)) -> 104 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 105 
  C_D (C_C _ (C_B)) (C_D (C_B) _) -> 106 
  C_D (C_D (C_D _ _) _) (C_D (C_B) (C_C _ _)) -> 107 
  C_D (C_D (C_B) _) (C_D (C_A _) (C_B)) -> 108 
  C_D (C_D _ (C_C _ _)) (C_D (C_A _) (C_D _ _)) -> 109 
  C_D _ (C_D (C_C _ _) (C_B)) -> 110 
  C_D (C_A (C_B)) (C_D (C_D _ _) (C_A _)) -> 111 
  C_D (C_D (C_A _) (C_A _)) (C_D (C_D _ _) (C_A _)) -> 112 
  C_D (C_D (C_D _ _) (C_B)) (C_C (((_,_),_)) (C_D _ _)) -> 113 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_C _ _) (C_B)) -> 114 
  C_D (C_D (C_A _) (C_C _ _)) (C_C _ (C_A _)) -> 115 
  C_D (C_D (C_A _) (C_C _ _)) (C_D (C_D _ _) (C_B)) -> 116 
  C_D (C_D (C_C _ _) (C_B)) (C_C (((_,_),_)) _) -> 117 
  C_D (C_A _) (C_D (C_B) (C_D _ _)) -> 118 
  C_D (C_D (C_A _) _) (C_C _ (C_B)) -> 119 
  C_D (C_C (((_,_),_)) (C_B)) (C_D (C_B) (C_D _ _)) -> 120 
  C_D (C_D _ (C_A _)) (C_D (C_A _) _) -> 121 
  C_D (C_D (C_B) (C_A _)) (C_D (C_B) (C_A _)) -> 122 
  C_D (C_C (((_,_),_)) (C_A _)) (C_D (C_A _) (C_B)) -> 123 
  C_D (C_C _ (C_A _)) (C_D (C_C _ _) (C_D _ _)) -> 124 
  C_D (C_D (C_C _ _) (C_B)) (C_C (((_,_),_)) (C_A _)) -> 125 
  C_D (C_C (((_,_),_)) _) (C_A _) -> 126 
  C_D (C_D (C_D _ _) _) (C_A _) -> 127 
  C_D (C_D (C_C _ _) _) (C_C _ (C_C _ _)) -> 128 
  C_D (C_D (C_A _) _) (C_C (((_,_),_)) (C_A _)) -> 129 
  C_D (C_D (C_B) (C_B)) (C_C (((_,_),_)) (C_B)) -> 130 
  C_D (C_A _) (C_D _ (C_D _ _)) -> 131 
  C_D (C_D _ (C_C _ _)) (C_D _ (C_B)) -> 132 
  C_D (C_A (C_B)) (C_D (C_B) (C_D _ _)) -> 133 
  C_D (C_C (((_,_),_)) (C_B)) (C_B) -> 134 
  C_D (C_D _ (C_D _ _)) (C_D _ _) -> 135 
  C_D (C_D _ (C_B)) (C_D _ (C_A _)) -> 136 
  C_D (C_C _ (C_D _ _)) (C_D (C_C _ _) (C_A _)) -> 137 
  C_D (C_D (C_B) (C_B)) (C_D (C_B) _) -> 138 
  C_D (C_C _ (C_C _ _)) (C_D (C_B) _) -> 139 
  C_D (C_D (C_C _ _) _) (C_D (C_B) (C_D _ _)) -> 140 
  C_D (C_C (((_,_),_)) _) (C_D _ (C_D _ _)) -> 141 
  C_D (C_D (C_D _ _) (C_C _ _)) (C_D _ (C_B)) -> 142 
  C_D (C_D (C_D _ _) (C_A _)) (C_B) -> 143 
  C_D (C_A (C_C _ _)) (C_D _ _) -> 144 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_D (C_C _ _) (C_A _)) -> 145 
  C_D (C_C _ (C_A _)) (C_D (C_C _ _) (C_B)) -> 146 
  C_D (C_D (C_B) (C_B)) (C_D _ (C_C _ _)) -> 147 
  C_D (C_D _ (C_B)) (C_D _ (C_C _ _)) -> 148 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_A _) _) -> 149 
  C_D (C_D _ (C_C _ _)) (C_C (((_,_),_)) (C_A _)) -> 150 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_C _ (C_A _)) -> 151 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_D _ _) (C_A _)) -> 152 
  C_D (C_A (C_C _ _)) _ -> 153 
  C_D (C_C (((_,_),_)) (C_D _ _)) (C_D (C_D _ _) (C_C _ _)) -> 154 
  C_D (C_D (C_D _ _) _) _ -> 155 
  C_D (C_C _ (C_C _ _)) (C_D (C_C _ _) (C_C _ _)) -> 156 
  C_D (C_D (C_B) (C_B)) (C_D (C_A _) (C_B)) -> 157 
  C_D (C_D (C_C _ _) (C_B)) (C_D _ (C_A _)) -> 158 
  C_D (C_D _ _) (C_A (C_B)) -> 159 
  C_D (C_A (C_D _ _)) (C_D (C_D _ _) (C_B)) -> 160 
  C_D (C_A (C_D _ _)) (C_D _ (C_B)) -> 161 
  C_D (C_D (C_B) (C_A _)) (C_A _) -> 162 
  C_D (C_A (C_C _ _)) (C_A (C_B)) -> 163 
  C_D (C_C (((_,_),_)) (C_A _)) (C_D (C_A _) (C_C _ _)) -> 164 
  C_D (C_A (C_A _)) (C_D (C_A _) (C_C _ _)) -> 165 
  C_D (C_D (C_B) (C_D _ _)) (C_D _ _) -> 166 
  C_D (C_D (C_A _) (C_C _ _)) (C_C _ (C_D _ _)) -> 167 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_C _ _) -> 168 
  C_D (C_C _ (C_C _ _)) (C_D (C_A _) (C_B)) -> 169 
  C_D (C_D (C_D _ _) _) (C_D (C_B) (C_B)) -> 170 
  C_D (C_D _ (C_C _ _)) (C_D _ (C_C _ _)) -> 171 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D (C_A _) _) -> 172 
  C_D (C_A (C_D _ _)) (C_C _ (C_B)) -> 173 
  C_D (C_A (C_C _ _)) (C_D (C_D _ _) (C_A _)) -> 174 
  C_D (C_D _ _) (C_A _) -> 175 
  C_D (C_D _ _) (C_D (C_D _ _) (C_C _ _)) -> 176 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_D (C_A _) (C_B)) -> 177 
  C_D (C_D (C_A _) (C_C _ _)) (C_D (C_B) (C_D _ _)) -> 178 
  C_D (C_B) (C_D (C_C _ _) (C_C _ _)) -> 179 
  C_D (C_C (((_,_),_)) _) (C_C _ (C_A _)) -> 180 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_C _ _) (C_D _ _)) -> 181 
  C_D (C_D (C_D _ _) (C_A _)) (C_D (C_B) (C_D _ _)) -> 182 
  C_D (C_D (C_A _) (C_D _ _)) (C_B) -> 183 
  C_D (C_D (C_D _ _) (C_A _)) (C_D (C_B) (C_C _ _)) -> 184 
  C_D (C_D (C_B) (C_B)) (C_D (C_A _) (C_D _ _)) -> 185 
  C_D (C_C (((_,_),_)) (C_B)) (C_C _ (C_A _)) -> 186 
  C_D (C_A (C_A _)) (C_D (C_A _) (C_B)) -> 187 
  C_D (C_D _ (C_C _ _)) (C_C _ (C_C _ _)) -> 188 
  C_D (C_D (C_A _) (C_D _ _)) (C_D (C_B) (C_D _ _)) -> 189 
  C_D (C_C (((_,_),_)) (C_B)) (C_D (C_A _) (C_D _ _)) -> 190 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_C _ (C_B)) -> 191 
  C_D (C_D (C_C _ _) (C_A _)) (C_D _ (C_A _)) -> 192 
  C_D (C_D (C_C _ _) _) (C_C (((_,_),_)) _) -> 193 
  C_D (C_D _ (C_D _ _)) (C_C _ (C_A _)) -> 194 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_C (((_,_),_)) (C_B)) -> 195 
  C_D (C_D _ (C_A _)) (C_C (((_,_),_)) _) -> 196 
  C_D (C_D (C_A _) (C_C _ _)) (C_D (C_A _) (C_C _ _)) -> 197 
  C_D (C_D (C_B) (C_B)) (C_D (C_C _ _) (C_D _ _)) -> 198 
  C_D (C_C _ _) (C_C (((_,_),_)) (C_B)) -> 199 
  C_D (C_D (C_A _) (C_A _)) (C_C _ (C_C _ _)) -> 200 
  C_D (C_D (C_D _ _) (C_A _)) (C_D (C_B) _) -> 201 
  C_D (C_C (((_,_),_)) (C_A _)) (C_B) -> 202 
  C_D (C_D (C_B) (C_D _ _)) (C_D _ (C_D _ _)) -> 203 
  C_D (C_A _) (C_A (C_C _ _)) -> 204 
  C_D (C_C _ (C_B)) (C_D (C_C _ _) (C_C _ _)) -> 205 
  C_D (C_A (C_B)) (C_D (C_C _ _) (C_C _ _)) -> 206 
  C_D (C_D (C_A _) (C_C _ _)) (C_C (((_,_),_)) (C_B)) -> 207 
  C_D (C_D _ (C_A _)) (C_C _ (C_B)) -> 208 
  C_D (C_A (C_A _)) (C_D (C_D _ _) _) -> 209 
  C_D (C_D (C_B) (C_D _ _)) (C_D (C_B) (C_B)) -> 210 
  C_D (C_D (C_A _) _) (C_C _ (C_D _ _)) -> 211 
  C_D (C_D _ (C_B)) (C_D (C_D _ _) (C_D _ _)) -> 212 
  C_D (C_C (((_,_),_)) (C_A _)) (C_D (C_D _ _) (C_B)) -> 213 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_A (C_D _ _)) -> 214 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_D _ _) (C_C _ _)) -> 215 
  C_D (C_D (C_D _ _) (C_B)) (C_C (((_,_),_)) (C_C _ _)) -> 216 
  C_D (C_D (C_D _ _) _) (C_A (C_A _)) -> 217 
  C_D (C_D (C_A _) (C_C _ _)) (C_C (((_,_),_)) (C_C _ _)) -> 218 
  C_D (C_D _ (C_C _ _)) (C_D (C_A _) (C_C _ _)) -> 219 
  C_D (C_D _ (C_B)) (C_C (((_,_),_)) (C_D _ _)) -> 220 
  C_D _ (C_D (C_B) (C_C _ _)) -> 221 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_B) (C_B)) -> 222 
  C_D (C_D (C_B) (C_B)) (C_D (C_C _ _) (C_B)) -> 223 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_C _ _) (C_D _ _)) -> 224 
  C_D (C_C _ _) (C_A (C_B)) -> 225 
  C_D (C_D (C_C _ _) (C_A _)) (C_D _ (C_D _ _)) -> 226 
  C_D (C_D (C_A _) (C_B)) (C_C (((_,_),_)) (C_C _ _)) -> 227 
  C_D (C_C _ (C_D _ _)) (C_B) -> 228 
  C_D (C_C _ (C_A _)) _ -> 229 
  C_D (C_C (((_,_),_)) _) (C_D (C_D _ _) (C_B)) -> 230 
  C_D (C_A _) (C_C (((_,_),_)) (C_D _ _)) -> 231 
  C_D (C_D _ (C_A _)) (C_B) -> 232 
  C_D (C_D (C_A _) _) (C_D (C_C _ _) (C_C _ _)) -> 233 
  C_D (C_D (C_A _) (C_C _ _)) (C_D (C_B) (C_B)) -> 234 
  C_D (C_D (C_A _) (C_D _ _)) (C_C (((_,_),_)) _) -> 235 
  C_D (C_A (C_A _)) (C_C (((_,_),_)) (C_C _ _)) -> 236 
  C_D (C_D _ (C_B)) (C_A (C_B)) -> 237 
  C_D (C_D (C_D _ _) (C_A _)) (C_D _ (C_C _ _)) -> 238 
  C_D (C_D (C_C _ _) _) (C_D (C_D _ _) (C_C _ _)) -> 239 
  C_D (C_C (((_,_),_)) (C_B)) (C_A (C_C _ _)) -> 240 
  C_D (C_B) (C_C _ (C_A _)) -> 241 
  C_D (C_D (C_B) (C_D _ _)) (C_A (C_C _ _)) -> 242 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_A (C_A _)) -> 243 
  C_D (C_C (((_,_),_)) (C_B)) (C_D (C_A _) _) -> 244 
  C_D (C_D (C_A _) (C_C _ _)) (C_C (((_,_),_)) _) -> 245 
  C_D (C_C (((_,_),_)) (C_A _)) (C_C (((_,_),_)) (C_D _ _)) -> 246 
  C_D (C_C _ (C_D _ _)) (C_D (C_D _ _) (C_A _)) -> 247 
  C_D (C_C _ (C_C _ _)) (C_A (C_B)) -> 248 
  C_D (C_C _ (C_B)) _ -> 249 
  C_D (C_D (C_C _ _) (C_A _)) (C_D (C_B) (C_C _ _)) -> 250 
  C_D (C_C (((_,_),_)) (C_D _ _)) (C_D _ (C_D _ _)) -> 251 
  C_D (C_D (C_B) _) (C_D (C_C _ _) (C_D _ _)) -> 252 
  C_D (C_A (C_C _ _)) (C_D (C_D _ _) (C_C _ _)) -> 253 
  C_D (C_C (((_,_),_)) _) (C_C (((_,_),_)) (C_B)) -> 254 
  C_D (C_D (C_A _) (C_A _)) (C_C _ (C_A _)) -> 255 
  C_D (C_C (((_,_),_)) (C_A _)) (C_A (C_D _ _)) -> 256 
  C_D (C_C _ (C_C _ _)) (C_D (C_B) (C_C _ _)) -> 257 
  C_D (C_D _ _) (C_B) -> 258 
  C_D (C_C (((_,_),_)) (C_A _)) (C_D (C_B) (C_D _ _)) -> 259 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_D _ _) (C_A _)) -> 260 
  C_D (C_A (C_D _ _)) (C_D (C_C _ _) (C_C _ _)) -> 261 
  C_D (C_D _ (C_D _ _)) (C_D (C_A _) (C_C _ _)) -> 262 
  C_D (C_C (((_,_),_)) (C_A _)) (C_A _) -> 263 
  C_D (C_D _ (C_C _ _)) (C_C (((_,_),_)) (C_C _ _)) -> 264 
  C_D (C_A (C_A _)) (C_A (C_C _ _)) -> 265 
  C_D (C_C (((_,_),_)) (C_A _)) (C_A (C_A _)) -> 266 
  C_D (C_C _ (C_C _ _)) (C_A _) -> 267 
  C_D (C_C _ _) (C_C _ (C_A _)) -> 268 
  C_D (C_D (C_B) _) (C_D (C_A _) (C_D _ _)) -> 269 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_A (C_C _ _)) -> 270 
  C_D (C_A (C_B)) (C_D (C_D _ _) (C_C _ _)) -> 271 
  C_D (C_C _ (C_C _ _)) (C_D (C_C _ _) (C_B)) -> 272 
  C_D (C_C (((_,_),_)) (C_B)) (C_D (C_D _ _) (C_A _)) -> 273 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_D _ _) (C_C _ _)) -> 274 
  C_D (C_D (C_D _ _) (C_A _)) (C_D (C_C _ _) (C_A _)) -> 275 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D _ _) -> 276 
  C_D (C_D (C_D _ _) (C_B)) (C_A (C_B)) -> 277 
  C_D (C_D (C_C _ _) (C_A _)) (C_C _ (C_B)) -> 278 
  C_D (C_C (((_,_),_)) _) (C_C (((_,_),_)) (C_D _ _)) -> 279 
  C_D (C_A _) (C_D _ _) -> 280 
  C_D (C_A (C_B)) (C_D (C_B) (C_C _ _)) -> 281 
  C_D (C_A (C_B)) (C_D (C_D _ _) _) -> 282 
  C_D (C_D (C_B) (C_A _)) (C_D (C_C _ _) _) -> 283 
  C_D (C_D (C_A _) (C_A _)) (C_D (C_A _) (C_D _ _)) -> 284 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_A _) (C_A _)) -> 285 
  C_D (C_D (C_A _) (C_D _ _)) (C_D _ (C_A _)) -> 286 
  C_D (C_C (((_,_),_)) (C_C _ _)) (C_D (C_B) (C_C _ _)) -> 287 
  C_D (C_D _ _) (C_D (C_D _ _) (C_B)) -> 288 
  C_D (C_C _ (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 289 
  C_D (C_C _ (C_D _ _)) _ -> 290 
  C_D (C_D (C_D _ _) (C_B)) (C_D (C_B) (C_A _)) -> 291 
  C_D (C_D (C_D _ _) _) (C_D (C_B) (C_A _)) -> 292 
  C_D (C_A (C_B)) (C_D (C_D _ _) (C_D _ _)) -> 293 
  C_D (C_D (C_A _) _) (C_D (C_B) _) -> 294 
  C_D (C_D (C_B) (C_B)) (C_D (C_B) (C_B)) -> 295 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_A (C_B)) -> 296 
  C_D (C_D (C_B) _) (C_A (C_C _ _)) -> 297 
  C_D (C_D (C_A _) (C_C _ _)) (C_D _ _) -> 298 
  C_D (C_D _ _) (C_C (((_,_),_)) (C_B)) -> 299 
  C_D (C_D (C_A _) (C_D _ _)) (C_A _) -> 300 
  C_D (C_D _ (C_A _)) (C_D (C_B) (C_D _ _)) -> 301 
  C_D (C_A (C_A _)) (C_D (C_C _ _) (C_C _ _)) -> 302 
  C_D (C_A (C_B)) (C_C (((_,_),_)) (C_A _)) -> 303 
  C_D (C_D (C_B) (C_C _ _)) (C_C _ (C_B)) -> 304 
  C_D (C_D _ (C_B)) (C_D (C_A _) (C_B)) -> 305 
  C_D (C_C _ (C_D _ _)) (C_D (C_C _ _) _) -> 306 
  C_D (C_C (((_,_),_)) _) _ -> 307 
  C_D (C_D (C_B) (C_A _)) (C_D (C_D _ _) (C_A _)) -> 308 
  C_D (C_D _ (C_D _ _)) (C_D (C_D _ _) (C_C _ _)) -> 309 
  C_D (C_A _) (C_A _) -> 310 
  C_D (C_D (C_B) (C_B)) (C_D _ _) -> 311 
