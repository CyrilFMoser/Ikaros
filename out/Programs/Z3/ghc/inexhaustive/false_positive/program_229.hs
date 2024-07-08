module Program_13 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A | C_C B_A B_A | C_D B_A B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_C C_A C_A) -> 0 
  C_B (C_C (C_D _ _) _) -> 1 
  C_B (C_C (C_C _ _) (C_B _)) -> 2 
  C_B (C_D C_A (C_C _ _)) -> 3 
  C_B (C_D _ (C_C _ _)) -> 4 
  C_B (C_C (C_D _ _) C_A) -> 5 
  C_B (C_D C_A (C_B _)) -> 6 
  C_B (C_D (C_C _ _) (C_C _ _)) -> 7 
  C_B (C_B C_A) -> 8 
  C_B (C_D C_A (C_D _ _)) -> 9 
  C_B (C_C _ (C_C _ _)) -> 10 
  C_B (C_D _ _) -> 11 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_D C_A (C_D _ _)) -> 12 
  C_C (C_B (C_B _)) _ -> 13 
  C_C (C_D (C_B _) (C_B _)) (C_D (C_C _ _) (C_D _ _)) -> 14 
  C_C (C_C (C_B _) (C_C _ _)) (C_D C_A C_A) -> 15 
  C_C (C_D (C_C _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 16 
  C_C (C_C (C_C _ _) (C_B _)) (C_D (C_B _) _) -> 17 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_D _ (C_D _ _)) -> 18 
  C_C _ (C_B (C_D _ _)) -> 19 
  C_C (C_C (C_B _) _) (C_D (C_C _ _) (C_D _ _)) -> 20 
  C_C (C_C _ (C_B _)) (C_D (C_D _ _) (C_B _)) -> 21 
  C_C (C_D _ (C_B _)) (C_C (C_C _ _) _) -> 22 
  C_C (C_D _ (C_C _ _)) (C_B (C_B _)) -> 23 
  C_C (C_D (C_B _) (C_C _ _)) (C_C _ (C_B _)) -> 24 
  C_C (C_C (C_B _) (C_B _)) (C_D (C_C _ _) _) -> 25 
  C_C (C_D (C_D _ _) _) (C_D (C_C _ _) (C_C _ _)) -> 26 
  C_C (C_D _ (C_D _ _)) (C_C C_A C_A) -> 27 
  C_C (C_D (C_C _ _) C_A) (C_C (C_B _) (C_B _)) -> 28 
  C_C (C_D _ (C_B _)) (C_C (C_B _) _) -> 29 
  C_C (C_D _ (C_D _ _)) (C_C _ _) -> 30 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ (C_C _ _)) -> 31 
  C_C (C_B (C_D _ _)) (C_C (C_C _ _) (C_B _)) -> 32 
  C_C (C_C C_A (C_B _)) (C_D _ _) -> 33 
  C_C (C_B _) (C_D C_A (C_D _ _)) -> 34 
  C_C (C_C _ (C_C _ _)) (C_D (C_B _) (C_D _ _)) -> 35 
  C_C (C_D C_A (C_D _ _)) (C_D (C_C _ _) _) -> 36 
  C_C (C_B (C_B _)) (C_C C_A _) -> 37 
  C_C (C_C C_A (C_B _)) (C_C _ C_A) -> 38 
  C_C (C_B (C_C _ _)) (C_C (C_C _ _) (C_B _)) -> 39 
  C_C (C_D _ (C_D _ _)) (C_C _ (C_B _)) -> 40 
  C_C (C_D C_A (C_D _ _)) (C_D _ (C_B _)) -> 41 
  C_C (C_B (C_B _)) (C_B (C_B _)) -> 42 
  C_C (C_C C_A (C_D _ _)) (C_D C_A (C_D _ _)) -> 43 
  C_C (C_C (C_D _ _) _) (C_D (C_C _ _) (C_D _ _)) -> 44 
  C_C (C_D C_A C_A) (C_C _ C_A) -> 45 
  C_C (C_C (C_D _ _) C_A) (C_C _ (C_B _)) -> 46 
  C_C (C_D (C_B _) _) (C_B C_A) -> 47 
  C_C (C_C _ (C_B _)) (C_D (C_D _ _) _) -> 48 
  C_C (C_D _ (C_C _ _)) (C_D (C_C _ _) (C_B _)) -> 49 
  C_C (C_C (C_D _ _) _) (C_D C_A (C_D _ _)) -> 50 
  C_C (C_D _ (C_B _)) (C_C C_A (C_B _)) -> 51 
  C_C (C_C _ (C_D _ _)) (C_C (C_C _ _) (C_B _)) -> 52 
  C_C (C_D C_A (C_D _ _)) (C_D (C_B _) C_A) -> 53 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_B (C_D _ _)) -> 54 
  C_C (C_D (C_C _ _) (C_B _)) (C_D (C_D _ _) (C_D _ _)) -> 55 
  C_C (C_D C_A C_A) (C_D (C_B _) (C_B _)) -> 56 
  C_C (C_D (C_B _) _) (C_C (C_B _) _) -> 57 
  C_C (C_C (C_C _ _) C_A) (C_C C_A (C_C _ _)) -> 58 
  C_C (C_D (C_D _ _) _) (C_C (C_C _ _) C_A) -> 59 
  C_C (C_B (C_C _ _)) (C_C (C_C _ _) C_A) -> 60 
  C_C (C_D (C_C _ _) _) (C_D (C_C _ _) C_A) -> 61 
  C_C (C_C (C_D _ _) _) (C_D C_A (C_B _)) -> 62 
  C_C (C_C (C_D _ _) _) (C_D C_A (C_C _ _)) -> 63 
  C_C (C_D (C_B _) (C_B _)) (C_C (C_C _ _) (C_C _ _)) -> 64 
  C_C (C_D C_A (C_C _ _)) (C_D (C_B _) _) -> 65 
  C_C (C_C (C_B _) _) (C_C _ (C_D _ _)) -> 66 
  C_C (C_C _ (C_C _ _)) (C_C (C_B _) (C_C _ _)) -> 67 
  C_C (C_D (C_B _) (C_B _)) (C_C _ _) -> 68 
  C_C (C_D (C_D _ _) (C_D _ _)) (C_B C_A) -> 69 
  C_C (C_C C_A _) (C_C _ _) -> 70 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_C (C_D _ _) (C_C _ _)) -> 71 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_B _) -> 72 
  C_C (C_B (C_B _)) (C_D C_A _) -> 73 
  C_C (C_D (C_D _ _) (C_C _ _)) (C_C _ _) -> 74 
  C_C (C_B (C_D _ _)) (C_C (C_C _ _) (C_C _ _)) -> 75 
  C_C (C_C C_A (C_D _ _)) (C_D (C_C _ _) (C_B _)) -> 76 
  C_C (C_C C_A _) (C_C (C_B _) (C_C _ _)) -> 77 
  C_C (C_C C_A (C_D _ _)) (C_D _ _) -> 78 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_B _) -> 79 
  C_C (C_C _ (C_B _)) (C_C (C_D _ _) _) -> 80 
  C_C (C_B (C_B _)) (C_C (C_C _ _) C_A) -> 81 
  C_C (C_D (C_B _) _) (C_D C_A _) -> 82 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_C _ (C_B _)) -> 83 
  C_C (C_D (C_C _ _) _) (C_C (C_B _) C_A) -> 84 
  C_C (C_D (C_C _ _) (C_C _ _)) (C_D _ _) -> 85 
  C_C (C_C _ C_A) (C_D (C_D _ _) C_A) -> 86 
  C_C (C_D (C_D _ _) _) (C_D (C_B _) _) -> 87 
  C_C (C_C (C_D _ _) (C_B _)) (C_C (C_D _ _) C_A) -> 88 
  C_C (C_C _ C_A) (C_D _ (C_D _ _)) -> 89 
  C_C (C_C (C_C _ _) (C_B _)) (C_D C_A (C_B _)) -> 90 
  C_C (C_D _ (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 91 
  C_C (C_D (C_C _ _) (C_B _)) (C_C (C_C _ _) C_A) -> 92 
  C_C (C_C C_A (C_B _)) (C_C (C_D _ _) _) -> 93 
  C_C (C_D (C_C _ _) C_A) (C_D _ _) -> 94 
  C_C (C_C (C_C _ _) C_A) (C_D (C_B _) (C_D _ _)) -> 95 
  C_C (C_D C_A (C_D _ _)) (C_C (C_B _) (C_C _ _)) -> 96 
  C_C (C_D (C_D _ _) (C_C _ _)) (C_B (C_C _ _)) -> 97 
  C_C (C_C (C_C _ _) (C_B _)) (C_D (C_C _ _) (C_C _ _)) -> 98 
  C_C (C_D (C_B _) (C_B _)) (C_C (C_D _ _) _) -> 99 
  C_C (C_C _ _) (C_D (C_B _) C_A) -> 100 
  C_C C_A (C_D (C_C _ _) (C_B _)) -> 101 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_B (C_D _ _)) -> 102 
  C_C (C_D (C_D _ _) C_A) (C_B C_A) -> 103 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C (C_C _ _) C_A) -> 104 
  C_C (C_D (C_C _ _) C_A) (C_D (C_C _ _) (C_B _)) -> 105 
  C_C C_A (C_C (C_B _) (C_D _ _)) -> 106 
  C_C (C_B C_A) (C_C _ (C_C _ _)) -> 107 
  C_C (C_D C_A (C_D _ _)) (C_D (C_B _) (C_D _ _)) -> 108 
  C_C (C_D (C_C _ _) _) (C_D _ (C_C _ _)) -> 109 
  C_C (C_C (C_C _ _) C_A) (C_D (C_D _ _) (C_C _ _)) -> 110 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_D _ _) C_A) -> 111 
  C_C (C_C (C_B _) _) (C_D _ (C_D _ _)) -> 112 
  C_C (C_B C_A) (C_D (C_C _ _) (C_B _)) -> 113 
  C_C (C_C (C_B _) (C_B _)) (C_D C_A (C_D _ _)) -> 114 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_B _) (C_C _ _)) -> 115 
  C_C (C_B C_A) (C_D (C_C _ _) (C_D _ _)) -> 116 
  C_C (C_C (C_D _ _) _) C_A -> 117 
  C_C (C_C _ (C_B _)) (C_D (C_D _ _) (C_C _ _)) -> 118 
  C_C (C_D _ (C_D _ _)) (C_D (C_D _ _) (C_D _ _)) -> 119 
  C_C (C_D C_A (C_D _ _)) (C_D (C_C _ _) (C_B _)) -> 120 
  C_C (C_D C_A (C_B _)) (C_D (C_B _) (C_C _ _)) -> 121 
  C_C (C_C (C_B _) (C_D _ _)) (C_C (C_B _) _) -> 122 
  C_C (C_D _ (C_C _ _)) (C_C (C_D _ _) C_A) -> 123 
  C_C _ (C_C (C_D _ _) _) -> 124 
  C_C (C_C (C_D _ _) C_A) (C_D C_A (C_C _ _)) -> 125 
  C_C (C_C (C_B _) (C_B _)) _ -> 126 
  C_C (C_C (C_B _) C_A) (C_C C_A (C_B _)) -> 127 
  C_C (C_C (C_C _ _) (C_B _)) (C_C C_A _) -> 128 
  C_C (C_C (C_C _ _) _) (C_D (C_D _ _) (C_C _ _)) -> 129 
  C_C (C_C (C_B _) (C_D _ _)) (C_C (C_D _ _) C_A) -> 130 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_D _ _) (C_C _ _)) -> 131 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_C (C_B _) (C_D _ _)) -> 132 
  C_C (C_C (C_D _ _) C_A) (C_D (C_C _ _) (C_C _ _)) -> 133 
  C_C (C_C (C_D _ _) C_A) (C_D C_A _) -> 134 
  C_C (C_D (C_B _) (C_B _)) (C_C (C_B _) (C_C _ _)) -> 135 
  C_C (C_D C_A C_A) (C_D _ C_A) -> 136 
  C_C (C_C C_A C_A) (C_C (C_B _) C_A) -> 137 
  C_C (C_C (C_C _ _) _) (C_D (C_D _ _) C_A) -> 138 
  C_C (C_C (C_D _ _) C_A) _ -> 139 
  C_C (C_B (C_B _)) C_A -> 140 
  C_C (C_C (C_C _ _) _) (C_D _ (C_B _)) -> 141 
  C_C (C_B (C_C _ _)) (C_D _ _) -> 142 
  C_D (C_D _ (C_B _)) (C_C _ (C_B _)) -> 143 
  C_D (C_B _) (C_D (C_C _ _) (C_B _)) -> 144 
  C_D (C_C (C_B _) (C_B _)) (C_C (C_B _) (C_C _ _)) -> 145 
  C_D (C_D (C_B _) (C_C _ _)) (C_D _ (C_D _ _)) -> 146 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D _ (C_C _ _)) -> 147 
  C_D (C_C (C_B _) (C_C _ _)) C_A -> 148 
  C_D (C_D C_A (C_C _ _)) (C_D (C_B _) (C_B _)) -> 149 
  C_D (C_D _ (C_B _)) (C_D C_A (C_C _ _)) -> 150 
  C_D (C_D (C_D _ _) C_A) (C_D _ (C_B _)) -> 151 
  C_D (C_C _ _) (C_B (C_B _)) -> 152 
  C_D (C_C (C_B _) (C_B _)) (C_C (C_C _ _) C_A) -> 153 
  C_D (C_C C_A (C_C _ _)) (C_D (C_B _) _) -> 154 
  C_D (C_C (C_B _) C_A) (C_D (C_D _ _) _) -> 155 
  C_D (C_D C_A C_A) (C_D C_A _) -> 156 
  C_D (C_C C_A (C_D _ _)) (C_D C_A (C_B _)) -> 157 
  C_D (C_D C_A (C_B _)) (C_C C_A (C_D _ _)) -> 158 
  C_D (C_C C_A (C_D _ _)) (C_C (C_B _) (C_B _)) -> 159 
  C_D (C_D C_A (C_C _ _)) (C_C (C_D _ _) (C_D _ _)) -> 160 
  C_D (C_D (C_C _ _) _) (C_C (C_B _) C_A) -> 161 
  C_D (C_C (C_B _) (C_D _ _)) (C_D (C_D _ _) C_A) -> 162 
  C_D (C_C (C_D _ _) C_A) (C_C C_A _) -> 163 
  C_D (C_B (C_D _ _)) (C_D (C_C _ _) C_A) -> 164 
  C_D (C_C (C_C _ _) _) C_A -> 165 
  C_D (C_C _ C_A) (C_B (C_C _ _)) -> 166 
  C_D (C_C _ _) (C_C (C_D _ _) (C_D _ _)) -> 167 
  C_D (C_D C_A (C_B _)) (C_D C_A (C_B _)) -> 168 
  C_D (C_D _ _) (C_C C_A (C_B _)) -> 169 
  C_D (C_C _ C_A) (C_C (C_D _ _) (C_D _ _)) -> 170 
  C_D (C_C _ (C_C _ _)) (C_D (C_D _ _) C_A) -> 171 
  C_D (C_D (C_C _ _) _) (C_C (C_B _) (C_B _)) -> 172 
  C_D (C_D (C_C _ _) (C_D _ _)) (C_D (C_D _ _) (C_D _ _)) -> 173 
  C_D (C_D (C_D _ _) _) (C_C _ C_A) -> 174 
  C_D (C_D C_A (C_C _ _)) (C_D (C_D _ _) (C_D _ _)) -> 175 
  C_D (C_D (C_C _ _) C_A) (C_C _ C_A) -> 176 
  C_D (C_C (C_B _) (C_C _ _)) (C_D _ C_A) -> 177 
  C_D (C_C C_A (C_C _ _)) (C_C _ C_A) -> 178 
  C_D (C_C C_A _) (C_D (C_C _ _) C_A) -> 179 
  C_D (C_B (C_B _)) (C_C _ (C_C _ _)) -> 180 
  C_D (C_D (C_D _ _) C_A) (C_D (C_B _) _) -> 181 
  C_D (C_C C_A (C_C _ _)) (C_D _ (C_C _ _)) -> 182 
  C_D (C_D _ _) (C_C C_A (C_D _ _)) -> 183 
  C_D (C_B (C_C _ _)) (C_D (C_D _ _) _) -> 184 
