module Program_22 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a b) (B_A b b) | C_B | C_C (B_A b b) (B_A Int a) | C_D (B_A a a) b

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_C (C_C _ _) (C_C _ _)) _ -> 0 
  C_C (C_A (C_D _ _) _) (C_C (C_A _ _) _) -> 1 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_C (C_A _ _) (C_A _ _)) -> 2 
  C_C (C_D (C_A _ _) _) (C_C _ (C_D _ _)) -> 3 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_D (C_C _ _) _) -> 4 
  C_C (C_A (C_B) (C_A _ _)) (C_C (C_C _ _) (C_D _ _)) -> 5 
  C_C (C_C (C_A _ _) _) (C_C _ (C_D _ _)) -> 6 
  C_C (C_A _ (C_B)) (C_A _ (C_C _ _)) -> 7 
  C_C (C_A (C_D _ _) (C_B)) (C_A _ (C_B)) -> 8 
  C_C (C_C _ (C_A _ _)) (C_A (C_A _ _) (C_B)) -> 9 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_C (C_B) (C_D _ _)) -> 10 
  C_C _ (C_D (C_C _ _) _) -> 11 
  C_C (C_C (C_B) (C_B)) (C_A (C_A _ _) _) -> 12 
  C_C (C_C (C_D _ _) _) (C_A (C_D _ _) (C_D _ _)) -> 13 
  C_C (C_A (C_B) _) (C_A (C_A _ _) (C_B)) -> 14 
  C_C (C_A _ (C_B)) (C_A (C_B) _) -> 15 
  C_C (C_C (C_A _ _) _) (C_C (C_B) (C_A _ _)) -> 16 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_C (C_A _ _) (C_C _ _)) -> 17 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_A (C_B) (C_C _ _)) -> 18 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_A _ _) -> 19 
  C_C (C_A (C_B) (C_A _ _)) (C_A (C_B) (C_D _ _)) -> 20 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_C (C_D _ _) (C_B)) -> 21 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 22 
  C_C (C_C (C_A _ _) (C_B)) (C_A (C_B) (C_B)) -> 23 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_A _ (C_B)) -> 24 
  C_C (C_C _ (C_C _ _)) (C_C _ (C_B)) -> 25 
  C_C (C_C (C_B) (C_D _ _)) (C_A (C_D _ _) (C_C _ _)) -> 26 
  C_C (C_C _ (C_B)) (C_A _ _) -> 27 
  C_C (C_C (C_A _ _) (C_B)) (C_C (C_C _ _) (C_D _ _)) -> 28 
  C_C (C_D _ _) (C_C (C_C _ _) (C_A _ _)) -> 29 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_C (C_C _ _) (C_B)) -> 30 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_C (C_D _ _) (C_A _ _)) -> 31 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_A (C_C _ _) (C_A _ _)) -> 32 
  C_C (C_A (C_B) (C_A _ _)) (C_C (C_A _ _) (C_D _ _)) -> 33 
  C_C (C_A (C_D _ _) (C_B)) (C_C (C_D _ _) (C_A _ _)) -> 34 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_A (C_D _ _) (C_D _ _)) -> 35 
  C_C (C_D (C_A _ _) _) (C_C (C_D _ _) (C_D _ _)) -> 36 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_A (C_D _ _) (C_B)) -> 37 
  C_C (C_C _ (C_D _ _)) (C_D (C_C _ _) _) -> 38 
  C_C (C_C _ (C_A _ _)) (C_C _ (C_B)) -> 39 
  C_C (C_A (C_B) (C_D _ _)) (C_A _ (C_D _ _)) -> 40 
  C_C (C_C _ (C_B)) (C_D (C_A _ _) _) -> 41 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_C (C_B) (C_B)) -> 42 
  C_C (C_D (C_D _ _) _) (C_A (C_A _ _) _) -> 43 
  C_C (C_C (C_C _ _) _) (C_A (C_B) (C_C _ _)) -> 44 
  C_C (C_A (C_D _ _) (C_B)) (C_A (C_C _ _) (C_D _ _)) -> 45 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_A (C_A _ _) (C_C _ _)) -> 46 
  C_C (C_A (C_B) (C_A _ _)) (C_C (C_C _ _) (C_C _ _)) -> 47 
  C_C (C_A (C_C _ _) (C_D _ _)) (C_A (C_D _ _) (C_D _ _)) -> 48 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_A _ _) -> 49 
  C_C (C_C (C_D _ _) (C_B)) (C_A _ (C_A _ _)) -> 50 
  C_C _ (C_D (C_A _ _) _) -> 51 
  C_C (C_C (C_A _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 52 
  C_C (C_C (C_C _ _) _) (C_C _ (C_A _ _)) -> 53 
  C_C (C_A _ (C_D _ _)) (C_A (C_B) (C_D _ _)) -> 54 
  C_C (C_A (C_D _ _) (C_B)) (C_B) -> 55 
  C_C (C_C _ (C_A _ _)) (C_A (C_D _ _) _) -> 56 
  C_C (C_C (C_B) (C_D _ _)) (C_A (C_A _ _) _) -> 57 
  C_C (C_A (C_B) (C_B)) (C_C (C_D _ _) (C_C _ _)) -> 58 
  C_C (C_C _ (C_D _ _)) (C_A (C_B) (C_A _ _)) -> 59 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ (C_C _ _)) -> 60 
  C_C (C_A _ (C_A _ _)) (C_C (C_D _ _) (C_C _ _)) -> 61 
  C_C (C_A (C_B) (C_A _ _)) (C_A (C_C _ _) _) -> 62 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_C (C_D _ _) (C_B)) -> 63 
  C_C (C_A (C_A _ _) _) (C_C (C_A _ _) (C_D _ _)) -> 64 
  C_C (C_A (C_B) (C_A _ _)) (C_C _ (C_D _ _)) -> 65 
  C_C (C_C (C_B) _) (C_A (C_B) (C_A _ _)) -> 66 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_A (C_C _ _) (C_B)) -> 67 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_A _ (C_D _ _)) -> 68 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_C (C_A _ _) (C_C _ _)) -> 69 
  C_C (C_B) (C_A _ (C_D _ _)) -> 70 
  C_C (C_C (C_C _ _) _) (C_A (C_C _ _) (C_C _ _)) -> 71 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 72 
  C_C (C_A (C_B) (C_D _ _)) (C_D (C_D _ _) _) -> 73 
  C_C (C_C _ (C_D _ _)) (C_A _ _) -> 74 
  C_C (C_C (C_D _ _) _) (C_A (C_A _ _) (C_C _ _)) -> 75 
  C_C (C_D (C_B) _) (C_A (C_B) (C_B)) -> 76 
  C_C (C_A _ (C_A _ _)) (C_C _ (C_B)) -> 77 
  C_C (C_A (C_C _ _) (C_B)) (C_C (C_D _ _) (C_B)) -> 78 
  C_C (C_A _ (C_C _ _)) (C_D (C_A _ _) _) -> 79 
  C_C (C_A _ (C_B)) (C_D (C_D _ _) _) -> 80 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_D (C_A _ _) _) -> 81 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_C (C_A _ _) (C_B)) -> 82 
  C_C (C_C (C_C _ _) (C_B)) (C_A (C_A _ _) _) -> 83 
  C_C (C_C _ (C_C _ _)) (C_A _ (C_D _ _)) -> 84 
  C_C (C_C (C_A _ _) _) (C_C _ _) -> 85 
  C_C (C_A (C_C _ _) _) (C_C (C_B) (C_A _ _)) -> 86 
  C_C (C_C (C_B) (C_B)) (C_C (C_B) _) -> 87 
  C_C (C_C _ (C_C _ _)) (C_A (C_A _ _) (C_D _ _)) -> 88 
  C_C (C_A (C_B) (C_B)) (C_C (C_C _ _) (C_C _ _)) -> 89 
  C_C (C_C (C_D _ _) (C_B)) (C_C (C_C _ _) (C_A _ _)) -> 90 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_A (C_B) (C_D _ _)) -> 91 
  C_C (C_C (C_C _ _) (C_A _ _)) (C_A (C_C _ _) (C_B)) -> 92 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_C (C_A _ _) (C_D _ _)) -> 93 
  C_C (C_C (C_D _ _) (C_B)) (C_A (C_C _ _) (C_D _ _)) -> 94 
  C_C (C_D (C_C _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 95 
  C_C (C_A (C_B) (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 96 
  C_C (C_A (C_A _ _) (C_B)) (C_C (C_B) (C_D _ _)) -> 97 
  C_C _ (C_A (C_B) (C_B)) -> 98 
  C_C _ (C_C (C_B) _) -> 99 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_A _ _) -> 100 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_A (C_C _ _) (C_C _ _)) -> 101 
  C_C (C_A _ _) (C_A (C_B) (C_B)) -> 102 
  C_C (C_D (C_C _ _) _) (C_A _ (C_A _ _)) -> 103 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_A _ (C_C _ _)) -> 104 
  C_C (C_A (C_D _ _) _) (C_C (C_B) (C_B)) -> 105 
  C_C (C_A (C_C _ _) _) (C_C (C_A _ _) (C_D _ _)) -> 106 
  C_C (C_C (C_A _ _) (C_B)) (C_C (C_A _ _) (C_A _ _)) -> 107 
  C_C _ (C_A (C_B) _) -> 108 
  C_C (C_C (C_D _ _) _) (C_C (C_A _ _) _) -> 109 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_C (C_C _ _) (C_B)) -> 110 
  C_C (C_A (C_C _ _) (C_B)) (C_C _ _) -> 111 
  C_C (C_D (C_A _ _) _) (C_A (C_B) (C_B)) -> 112 
  C_C (C_C _ (C_D _ _)) (C_C (C_B) (C_B)) -> 113 
  C_C (C_A _ (C_A _ _)) (C_C (C_A _ _) (C_A _ _)) -> 114 
  C_C (C_D (C_B) _) (C_C _ (C_D _ _)) -> 115 
  C_C (C_A (C_C _ _) _) (C_C (C_B) _) -> 116 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_C _ (C_D _ _)) -> 117 
  C_C (C_A _ (C_A _ _)) (C_A _ _) -> 118 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_A (C_D _ _) (C_C _ _)) -> 119 
  C_C (C_C (C_D _ _) (C_B)) (C_C (C_C _ _) (C_D _ _)) -> 120 
  C_C (C_A (C_C _ _) (C_A _ _)) (C_A (C_D _ _) (C_D _ _)) -> 121 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_C (C_C _ _) (C_B)) -> 122 
  C_C (C_C _ _) (C_C (C_C _ _) (C_B)) -> 123 
  C_C (C_A (C_B) _) (C_C (C_A _ _) (C_A _ _)) -> 124 
  C_C (C_A (C_B) (C_A _ _)) (C_C (C_D _ _) (C_B)) -> 125 
  C_C (C_A (C_C _ _) (C_D _ _)) (C_C (C_A _ _) (C_C _ _)) -> 126 
  C_C (C_A (C_C _ _) (C_B)) (C_A (C_D _ _) (C_A _ _)) -> 127 
  C_C (C_A (C_D _ _) (C_D _ _)) _ -> 128 
  C_C (C_C (C_D _ _) (C_A _ _)) (C_A (C_C _ _) (C_D _ _)) -> 129 
  C_C (C_A _ (C_B)) (C_C (C_D _ _) (C_D _ _)) -> 130 
  C_C (C_C (C_A _ _) (C_B)) (C_A (C_B) (C_A _ _)) -> 131 
  C_C (C_C (C_D _ _) _) (C_C (C_D _ _) (C_C _ _)) -> 132 
  C_C (C_D (C_B) _) (C_C (C_B) _) -> 133 
  C_C (C_A (C_B) _) (C_C (C_C _ _) (C_D _ _)) -> 134 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_A (C_B) _) -> 135 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_A (C_A _ _) (C_C _ _)) -> 136 
  C_C (C_A (C_A _ _) _) (C_C (C_C _ _) (C_A _ _)) -> 137 
  C_C (C_A (C_C _ _) _) (C_B) -> 138 
  C_C (C_C _ (C_D _ _)) (C_B) -> 139 
  C_C (C_C (C_A _ _) (C_C _ _)) (C_A (C_B) (C_B)) -> 140 
  C_C _ (C_C (C_C _ _) (C_D _ _)) -> 141 
  C_C (C_A _ (C_B)) (C_C (C_C _ _) _) -> 142 
  C_C (C_C (C_B) (C_A _ _)) (C_C (C_C _ _) (C_A _ _)) -> 143 
  C_A _ (C_A (C_A _ _) (C_D _ _)) -> 144 
  C_A (C_C (C_A _ _) _) (C_C (C_D _ _) (C_B)) -> 145 
  C_A (C_C _ _) (C_C (C_A _ _) (C_C _ _)) -> 146 
  C_A (C_C (C_B) (C_A _ _)) (C_C (C_D _ _) (C_C _ _)) -> 147 
  C_A (C_A _ (C_D _ _)) (C_D (C_D _ _) _) -> 148 
