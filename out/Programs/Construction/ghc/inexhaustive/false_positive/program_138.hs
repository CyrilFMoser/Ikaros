module Program_18 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a a) | C_B (B_A a a) (B_A a a) | C_C (B_A a a) | C_D (B_A a a) a

v_a :: B_A Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B (C_A (C_A _)) (C_A (C_A _)) -> 1 
  C_B (C_A (C_B _ _)) (C_A (C_A _)) -> 2 
  C_B (C_A (C_C _)) (C_A (C_A _)) -> 3 
  C_B (C_A (C_D _ _)) (C_A (C_A _)) -> 4 
  C_B (C_B (C_A _) _) (C_A (C_A _)) -> 5 
  C_B (C_B (C_B _ _) _) (C_A (C_A _)) -> 6 
  C_B (C_B (C_C _) _) (C_A (C_A _)) -> 7 
  C_B (C_B (C_D _ _) _) (C_A (C_A _)) -> 8 
  C_B (C_C (C_A _)) (C_A (C_A _)) -> 9 
  C_B (C_C (C_B _ _)) (C_A (C_A _)) -> 10 
  C_B (C_C (C_C _)) (C_A (C_A _)) -> 11 
  C_B (C_C (C_D _ _)) (C_A (C_A _)) -> 12 
  C_B (C_D _ _) (C_A (C_A _)) -> 13 
  C_B (C_A (C_A _)) (C_A (C_B _ _)) -> 14 
  C_B (C_A (C_B _ _)) (C_A (C_B _ _)) -> 15 
  C_B (C_A (C_C _)) (C_A (C_B _ _)) -> 16 
  C_B (C_A (C_D _ _)) (C_A (C_B _ _)) -> 17 
  C_B (C_B (C_A _) _) (C_A (C_B _ _)) -> 18 
  C_B (C_B (C_B _ _) _) (C_A (C_B _ _)) -> 19 
  C_B (C_B (C_C _) _) (C_A (C_B _ _)) -> 20 
  C_B (C_B (C_D _ _) _) (C_A (C_B _ _)) -> 21 
  C_B (C_C (C_A _)) (C_A (C_B _ _)) -> 22 
  C_B (C_C (C_B _ _)) (C_A (C_B _ _)) -> 23 
  C_B (C_C (C_C _)) (C_A (C_B _ _)) -> 24 
  C_B (C_C (C_D _ _)) (C_A (C_B _ _)) -> 25 
  C_B (C_D _ _) (C_A (C_B _ _)) -> 26 
  C_B (C_A (C_A _)) (C_A (C_C _)) -> 27 
  C_B (C_A (C_B _ _)) (C_A (C_C _)) -> 28 
  C_B (C_A (C_C _)) (C_A (C_C _)) -> 29 
  C_B (C_A (C_D _ _)) (C_A (C_C _)) -> 30 
  C_B (C_B (C_A _) _) (C_A (C_C _)) -> 31 
  C_B (C_B (C_B _ _) _) (C_A (C_C _)) -> 32 
  C_B (C_B (C_C _) _) (C_A (C_C _)) -> 33 
  C_B (C_B (C_D _ _) _) (C_A (C_C _)) -> 34 
  C_B (C_C (C_A _)) (C_A (C_C _)) -> 35 
  C_B (C_C (C_B _ _)) (C_A (C_C _)) -> 36 
  C_B (C_C (C_C _)) (C_A (C_C _)) -> 37 
  C_B (C_C (C_D _ _)) (C_A (C_C _)) -> 38 
  C_B (C_D _ _) (C_A (C_C _)) -> 39 
  C_B (C_A (C_A _)) (C_A (C_D _ _)) -> 40 
  C_B (C_A (C_B _ _)) (C_A (C_D _ _)) -> 41 
  C_B (C_A (C_D _ _)) (C_A (C_D _ _)) -> 42 
  C_B (C_B (C_A _) _) (C_A (C_D _ _)) -> 43 
  C_B (C_B (C_B _ _) _) (C_A (C_D _ _)) -> 44 
  C_B (C_B (C_C _) _) (C_A (C_D _ _)) -> 45 
  C_B (C_B (C_D _ _) _) (C_A (C_D _ _)) -> 46 
  C_B (C_C (C_A _)) (C_A (C_D _ _)) -> 47 
  C_B (C_C (C_B _ _)) (C_A (C_D _ _)) -> 48 
  C_B (C_C (C_C _)) (C_A (C_D _ _)) -> 49 
  C_B (C_C (C_D _ _)) (C_A (C_D _ _)) -> 50 
  C_B (C_D _ _) (C_A (C_D _ _)) -> 51 
  C_B (C_A (C_A _)) (C_B (C_A _) _) -> 52 
  C_B (C_A (C_B _ _)) (C_B (C_A _) _) -> 53 
  C_B (C_A (C_C _)) (C_B (C_A _) _) -> 54 
  C_B (C_A (C_D _ _)) (C_B (C_A _) _) -> 55 
  C_B (C_B (C_A _) _) (C_B (C_A _) _) -> 56 
  C_B (C_B (C_B _ _) _) (C_B (C_A _) _) -> 57 
  C_B (C_B (C_C _) _) (C_B (C_A _) _) -> 58 
  C_B (C_B (C_D _ _) _) (C_B (C_A _) _) -> 59 
  C_B (C_C (C_A _)) (C_B (C_A _) _) -> 60 
  C_B (C_C (C_B _ _)) (C_B (C_A _) _) -> 61 
  C_B (C_C (C_C _)) (C_B (C_A _) _) -> 62 
  C_B (C_C (C_D _ _)) (C_B (C_A _) _) -> 63 
  C_B (C_D _ _) (C_B (C_A _) _) -> 64 
  C_B (C_A (C_A _)) (C_B (C_B _ _) _) -> 65 
  C_B (C_A (C_B _ _)) (C_B (C_B _ _) _) -> 66 
  C_B (C_A (C_C _)) (C_B (C_B _ _) _) -> 67 
  C_B (C_A (C_D _ _)) (C_B (C_B _ _) _) -> 68 
  C_B (C_B (C_A _) _) (C_B (C_B _ _) _) -> 69 
  C_B (C_B (C_B _ _) _) (C_B (C_B _ _) _) -> 70 
  C_B (C_B (C_C _) _) (C_B (C_B _ _) _) -> 71 
  C_B (C_B (C_D _ _) _) (C_B (C_B _ _) _) -> 72 
  C_B (C_C (C_A _)) (C_B (C_B _ _) _) -> 73 
  C_B (C_C (C_B _ _)) (C_B (C_B _ _) _) -> 74 
  C_B (C_C (C_C _)) (C_B (C_B _ _) _) -> 75 
  C_B (C_C (C_D _ _)) (C_B (C_B _ _) _) -> 76 
  C_B (C_D _ _) (C_B (C_B _ _) _) -> 77 
  C_B (C_A (C_A _)) (C_B (C_C _) _) -> 78 
  C_B (C_A (C_B _ _)) (C_B (C_C _) _) -> 79 
  C_B (C_A (C_C _)) (C_B (C_C _) _) -> 80 
  C_B (C_A (C_D _ _)) (C_B (C_C _) _) -> 81 
  C_B (C_B (C_A _) _) (C_B (C_C _) _) -> 82 
  C_B (C_B (C_B _ _) _) (C_B (C_C _) _) -> 83 
  C_B (C_B (C_C _) _) (C_B (C_C _) _) -> 84 
  C_B (C_B (C_D _ _) _) (C_B (C_C _) _) -> 85 
  C_B (C_C (C_A _)) (C_B (C_C _) _) -> 86 
  C_B (C_C (C_B _ _)) (C_B (C_C _) _) -> 87 
  C_B (C_C (C_C _)) (C_B (C_C _) _) -> 88 
  C_B (C_C (C_D _ _)) (C_B (C_C _) _) -> 89 
  C_B (C_D _ _) (C_B (C_C _) _) -> 90 
  C_B (C_A (C_A _)) (C_B (C_D _ _) _) -> 91 
  C_B (C_A (C_B _ _)) (C_B (C_D _ _) _) -> 92 
  C_B (C_A (C_C _)) (C_B (C_D _ _) _) -> 93 
  C_B (C_A (C_D _ _)) (C_B (C_D _ _) _) -> 94 
  C_B (C_B (C_A _) _) (C_B (C_D _ _) _) -> 95 
  C_B (C_B (C_B _ _) _) (C_B (C_D _ _) _) -> 96 
  C_B (C_B (C_C _) _) (C_B (C_D _ _) _) -> 97 
  C_B (C_B (C_D _ _) _) (C_B (C_D _ _) _) -> 98 
  C_B (C_C (C_A _)) (C_B (C_D _ _) _) -> 99 
  C_B (C_C (C_B _ _)) (C_B (C_D _ _) _) -> 100 
  C_B (C_C (C_C _)) (C_B (C_D _ _) _) -> 101 
  C_B (C_C (C_D _ _)) (C_B (C_D _ _) _) -> 102 
  C_B (C_D _ _) (C_B (C_D _ _) _) -> 103 
  C_B (C_A (C_A _)) (C_C (C_A _)) -> 104 
  C_B (C_A (C_B _ _)) (C_C (C_A _)) -> 105 
  C_B (C_A (C_C _)) (C_C (C_A _)) -> 106 
  C_B (C_A (C_D _ _)) (C_C (C_A _)) -> 107 
  C_B (C_B (C_A _) _) (C_C (C_A _)) -> 108 
  C_B (C_B (C_B _ _) _) (C_C (C_A _)) -> 109 
  C_B (C_B (C_C _) _) (C_C (C_A _)) -> 110 
  C_B (C_B (C_D _ _) _) (C_C (C_A _)) -> 111 
  C_B (C_C (C_A _)) (C_C (C_A _)) -> 112 
  C_B (C_C (C_B _ _)) (C_C (C_A _)) -> 113 
  C_B (C_C (C_C _)) (C_C (C_A _)) -> 114 
  C_B (C_C (C_D _ _)) (C_C (C_A _)) -> 115 
  C_B (C_D _ _) (C_C (C_A _)) -> 116 
  C_B (C_A (C_A _)) (C_C (C_B _ _)) -> 117 
  C_B (C_A (C_B _ _)) (C_C (C_B _ _)) -> 118 
  C_B (C_A (C_C _)) (C_C (C_B _ _)) -> 119 
  C_B (C_A (C_D _ _)) (C_C (C_B _ _)) -> 120 
  C_B (C_B (C_A _) _) (C_C (C_B _ _)) -> 121 
  C_B (C_B (C_B _ _) _) (C_C (C_B _ _)) -> 122 
  C_B (C_B (C_C _) _) (C_C (C_B _ _)) -> 123 
  C_B (C_B (C_D _ _) _) (C_C (C_B _ _)) -> 124 
  C_B (C_C (C_A _)) (C_C (C_B _ _)) -> 125 
  C_B (C_C (C_B _ _)) (C_C (C_B _ _)) -> 126 
  C_B (C_C (C_C _)) (C_C (C_B _ _)) -> 127 
  C_B (C_C (C_D _ _)) (C_C (C_B _ _)) -> 128 
  C_B (C_D _ _) (C_C (C_B _ _)) -> 129 
  C_B (C_A (C_A _)) (C_C (C_C _)) -> 130 
  C_B (C_A (C_B _ _)) (C_C (C_C _)) -> 131 
  C_B (C_A (C_C _)) (C_C (C_C _)) -> 132 
  C_B (C_A (C_D _ _)) (C_C (C_C _)) -> 133 
  C_B (C_B (C_A _) _) (C_C (C_C _)) -> 134 
  C_B (C_B (C_B _ _) _) (C_C (C_C _)) -> 135 
  C_B (C_B (C_C _) _) (C_C (C_C _)) -> 136 
  C_B (C_B (C_D _ _) _) (C_C (C_C _)) -> 137 
  C_B (C_C (C_A _)) (C_C (C_C _)) -> 138 
  C_B (C_C (C_B _ _)) (C_C (C_C _)) -> 139 
  C_B (C_C (C_C _)) (C_C (C_C _)) -> 140 
  C_B (C_C (C_D _ _)) (C_C (C_C _)) -> 141 
  C_B (C_D _ _) (C_C (C_C _)) -> 142 
  C_B (C_A (C_A _)) (C_C (C_D _ _)) -> 143 
  C_B (C_A (C_B _ _)) (C_C (C_D _ _)) -> 144 
  C_B (C_A (C_C _)) (C_C (C_D _ _)) -> 145 
  C_B (C_A (C_D _ _)) (C_C (C_D _ _)) -> 146 
  C_B (C_B (C_A _) _) (C_C (C_D _ _)) -> 147 
  C_B (C_B (C_B _ _) _) (C_C (C_D _ _)) -> 148 
  C_B (C_B (C_C _) _) (C_C (C_D _ _)) -> 149 
  C_B (C_B (C_D _ _) _) (C_C (C_D _ _)) -> 150 
  C_B (C_C (C_A _)) (C_C (C_D _ _)) -> 151 
  C_B (C_C (C_B _ _)) (C_C (C_D _ _)) -> 152 
  C_B (C_C (C_C _)) (C_C (C_D _ _)) -> 153 
  C_B (C_C (C_D _ _)) (C_C (C_D _ _)) -> 154 
  C_B (C_D _ _) (C_C (C_D _ _)) -> 155 
  C_B (C_A (C_A _)) (C_D _ _) -> 156 
  C_B (C_A (C_B _ _)) (C_D _ _) -> 157 
  C_B (C_A (C_C _)) (C_D _ _) -> 158 
  C_B (C_A (C_D _ _)) (C_D _ _) -> 159 
  C_B (C_B (C_A _) _) (C_D _ _) -> 160 
  C_B (C_B (C_B _ _) _) (C_D _ _) -> 161 
  C_B (C_B (C_C _) _) (C_D _ _) -> 162 
  C_B (C_B (C_D _ _) _) (C_D _ _) -> 163 
  C_B (C_C (C_A _)) (C_D _ _) -> 164 
  C_B (C_C (C_B _ _)) (C_D _ _) -> 165 
  C_B (C_C (C_C _)) (C_D _ _) -> 166 
  C_B (C_C (C_D _ _)) (C_D _ _) -> 167 
  C_B (C_D _ _) (C_D _ _) -> 168 
  C_C (C_A _) -> 169 
  C_C (C_B _ _) -> 170 
  C_C (C_C (C_A _)) -> 171 
  C_C (C_C (C_B _ _)) -> 172 
  C_C (C_C (C_C _)) -> 173 
  C_C (C_C (C_D _ _)) -> 174 
  C_C (C_D _ _) -> 175 
  C_D _ _ -> 176 
