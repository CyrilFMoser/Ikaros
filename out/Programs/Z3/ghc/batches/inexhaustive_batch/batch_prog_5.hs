module Program_5 () where 

main = print $ show v_b
data B_A a b = C_A | C_B | C_C (B_A b b) (B_A a a)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C (C_A) _) (C_B) -> 0 
  C_C (C_C (C_C _ _) (C_A)) (C_C _ _) -> 1 
  C_C (C_C _ (C_C _ _)) (C_C (C_B) _) -> 2 
  C_C (C_C _ _) (C_C (C_A) (C_B)) -> 3 
  C_C (C_C (C_A) (C_A)) (C_C (C_C _ _) (C_A)) -> 4 
  C_C (C_C (C_B) _) (C_C _ _) -> 5 
  C_C _ (C_C (C_A) (C_B)) -> 6 
  C_C (C_C (C_A) (C_C _ _)) (C_C _ (C_C _ _)) -> 7 
  C_C (C_C (C_A) (C_B)) (C_C (C_B) (C_A)) -> 8 
  C_C (C_C (C_B) (C_A)) (C_C (C_B) (C_C _ _)) -> 9 
  C_C (C_A) (C_C (C_B) (C_A)) -> 10 
  C_C (C_C (C_A) (C_B)) (C_C (C_B) _) -> 11 
  C_C (C_C (C_A) (C_C _ _)) (C_C _ _) -> 12 
  C_C (C_C _ (C_A)) (C_B) -> 13 
  C_C (C_C _ (C_A)) _ -> 14 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_A) (C_A)) -> 15 
  C_C (C_C (C_A) (C_B)) (C_C (C_A) _) -> 16 
  C_C (C_C (C_B) (C_C _ _)) (C_C _ _) -> 17 
  C_C (C_C (C_B) (C_C _ _)) (C_C _ (C_C _ _)) -> 18 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_A) (C_A)) -> 19 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_B) (C_C _ _)) -> 20 
  C_C (C_C _ _) (C_C (C_A) _) -> 21 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_B) (C_B)) -> 22 
  C_C (C_C (C_A) (C_A)) (C_C (C_C _ _) (C_B)) -> 23 
  C_C _ (C_C _ (C_B)) -> 24 
  C_C (C_C _ (C_B)) (C_C _ (C_B)) -> 25 
  C_C (C_C (C_B) (C_A)) (C_C (C_B) _) -> 26 
  C_C (C_C (C_B) _) (C_C _ (C_B)) -> 27 
  C_C (C_C (C_A) (C_A)) (C_C (C_B) (C_B)) -> 28 
  C_C (C_C _ (C_A)) (C_C (C_A) (C_B)) -> 29 
  C_C (C_C (C_B) (C_B)) (C_C (C_A) (C_C _ _)) -> 30 
  C_C (C_C (C_B) (C_B)) (C_C (C_C _ _) _) -> 31 
  C_C (C_C (C_A) _) (C_C _ _) -> 32 
  C_C (C_C _ (C_A)) (C_C (C_B) _) -> 33 
  C_C (C_C (C_C _ _) (C_A)) (C_A) -> 34 
  C_C (C_C (C_A) (C_A)) (C_C (C_C _ _) _) -> 35 
  C_C (C_C (C_C _ _) (C_A)) (C_B) -> 36 
  C_C (C_A) (C_C (C_B) (C_C _ _)) -> 37 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_A) (C_B)) -> 38 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 39 
  C_C (C_B) (C_C (C_C _ _) (C_C _ _)) -> 40 
  C_C (C_C (C_A) (C_B)) (C_C (C_A) (C_A)) -> 41 
  C_C (C_C _ (C_A)) (C_C _ (C_A)) -> 42 
  C_C (C_B) (C_C _ (C_B)) -> 43 
  C_C (C_C _ (C_A)) (C_C _ (C_C _ _)) -> 44 
  C_C (C_C _ (C_B)) _ -> 45 
  C_C (C_C (C_B) _) (C_C (C_B) (C_B)) -> 46 
  C_C (C_C (C_A) (C_A)) (C_C (C_A) (C_A)) -> 47 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_A) (C_B)) -> 48 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ (C_C _ _)) -> 49 
  C_C (C_A) (C_C (C_B) (C_B)) -> 50 
  C_C (C_C (C_C _ _) _) (C_B) -> 51 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_C _ _) (C_C _ _)) -> 52 
  C_C (C_C (C_C _ _) (C_A)) _ -> 53 
  C_C (C_C (C_C _ _) _) (C_C (C_A) (C_C _ _)) -> 54 
  C_C (C_C (C_A) (C_B)) (C_C (C_C _ _) _) -> 55 
  C_C (C_C _ _) (C_C (C_C _ _) _) -> 56 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_C _ _) (C_B)) -> 57 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_C _ _) (C_C _ _)) -> 58 
  C_C (C_C _ (C_A)) (C_A) -> 59 
  C_C (C_C (C_A) (C_A)) _ -> 60 
  C_C (C_C (C_A) _) (C_C (C_B) (C_A)) -> 61 
  C_C (C_C (C_B) (C_B)) (C_C (C_B) (C_A)) -> 62 
  C_C (C_C (C_C _ _) (C_A)) (C_C _ (C_C _ _)) -> 63 
  C_C (C_C _ (C_B)) (C_C (C_C _ _) _) -> 64 
  C_C (C_C (C_A) (C_C _ _)) _ -> 65 
  C_C _ (C_A) -> 66 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_C _ _) (C_A)) -> 67 
  C_C (C_C (C_A) (C_A)) (C_C (C_C _ _) (C_C _ _)) -> 68 
  C_C (C_C (C_B) _) (C_C _ (C_A)) -> 69 
  C_C (C_B) _ -> 70 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_C _ _) _) -> 71 
  C_C (C_C (C_C _ _) _) _ -> 72 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_B) (C_A)) -> 73 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 74 
  C_C (C_C (C_B) _) (C_C (C_C _ _) (C_B)) -> 75 
  C_C (C_C (C_C _ _) (C_B)) (C_C _ _) -> 76 
  C_C (C_B) (C_C _ (C_C _ _)) -> 77 
  C_C (C_B) (C_C (C_B) (C_B)) -> 78 
  C_C _ (C_C (C_C _ _) (C_A)) -> 79 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_A) (C_C _ _)) -> 80 
  C_C (C_C _ (C_B)) (C_C (C_A) (C_A)) -> 81 
  C_C (C_C (C_B) _) (C_B) -> 82 
  C_C (C_C _ _) (C_C (C_B) _) -> 83 
  C_C (C_C (C_A) (C_B)) (C_C _ (C_C _ _)) -> 84 
  C_C (C_B) (C_C _ _) -> 85 
  C_C (C_C (C_C _ _) (C_B)) (C_B) -> 86 
  C_C (C_C (C_B) (C_A)) (C_B) -> 87 
  C_C (C_C (C_B) (C_A)) (C_C _ _) -> 88 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_A) (C_B)) -> 89 
  C_C (C_A) (C_C (C_C _ _) (C_B)) -> 90 
  C_C (C_C _ (C_B)) (C_C (C_B) (C_A)) -> 91 
  C_C _ (C_C (C_A) (C_A)) -> 92 
  C_C (C_C (C_A) _) (C_C (C_B) (C_B)) -> 93 
  C_C (C_C (C_B) (C_A)) (C_C (C_A) (C_C _ _)) -> 94 
  C_C (C_C (C_C _ _) (C_C _ _)) _ -> 95 
  C_C (C_C (C_C _ _) _) (C_A) -> 96 
  C_C (C_C _ (C_C _ _)) (C_C (C_B) (C_B)) -> 97 
  C_C (C_C _ (C_C _ _)) (C_C (C_A) (C_A)) -> 98 
  C_C (C_C _ (C_A)) (C_C (C_B) (C_A)) -> 99 
  C_C (C_C (C_A) (C_C _ _)) (C_C _ (C_A)) -> 100 
  C_C (C_C (C_A) (C_B)) (C_B) -> 101 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ _) -> 102 
  C_C (C_C (C_C _ _) _) (C_C _ (C_C _ _)) -> 103 
  C_C (C_B) (C_C (C_C _ _) (C_B)) -> 104 
  C_C (C_A) _ -> 105 
  C_C (C_C (C_A) (C_A)) (C_C _ _) -> 106 
  C_C (C_C (C_B) _) (C_C _ (C_C _ _)) -> 107 
  C_C (C_C (C_B) (C_C _ _)) (C_A) -> 108 
  C_C (C_C (C_B) _) (C_C (C_C _ _) (C_A)) -> 109 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_A) (C_C _ _)) -> 110 
  C_C (C_C (C_A) _) (C_C _ (C_C _ _)) -> 111 
  C_C (C_C (C_B) _) (C_C (C_B) (C_C _ _)) -> 112 
  C_C (C_C (C_C _ _) _) (C_C (C_B) (C_B)) -> 113 
  C_C (C_C (C_B) (C_A)) (C_C (C_A) (C_B)) -> 114 
  C_C (C_C (C_A) (C_A)) (C_C (C_A) (C_C _ _)) -> 115 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_B) (C_C _ _)) -> 116 
  C_C (C_C (C_B) _) (C_C (C_A) (C_B)) -> 117 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_B) (C_B)) -> 118 
  C_C (C_C (C_B) (C_B)) (C_B) -> 119 
  C_C (C_C _ (C_C _ _)) (C_C (C_A) (C_B)) -> 120 
  C_C (C_C (C_B) (C_B)) (C_A) -> 121 
  C_C (C_C (C_A) _) (C_C (C_C _ _) (C_B)) -> 122 
  C_C (C_C (C_B) (C_B)) (C_C (C_B) _) -> 123 
  C_C (C_C (C_A) (C_A)) (C_C (C_B) (C_A)) -> 124 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) (C_B)) -> 125 
  C_C (C_C _ (C_A)) (C_C (C_A) _) -> 126 
  C_C (C_C (C_A) _) (C_A) -> 127 
  C_C (C_C (C_B) (C_A)) (C_C _ (C_B)) -> 128 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_B) (C_C _ _)) -> 129 
  C_C (C_C _ (C_A)) (C_C (C_B) (C_B)) -> 130 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_C _ _) _) -> 131 
  C_C (C_C (C_B) _) _ -> 132 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_B) -> 133 
  C_C (C_C (C_B) _) (C_C (C_B) (C_A)) -> 134 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_C _ _) (C_A)) -> 135 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_B) _) -> 136 
  C_C (C_C (C_A) (C_A)) (C_B) -> 137 
  C_C (C_B) (C_C _ (C_A)) -> 138 
  C_C (C_C _ (C_A)) (C_C (C_A) (C_A)) -> 139 
  C_C (C_C (C_B) _) (C_C (C_A) (C_C _ _)) -> 140 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_C _ _) (C_A)) -> 141 
  C_C (C_C (C_B) (C_B)) (C_C (C_B) (C_C _ _)) -> 142 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_C _ _) (C_B)) -> 143 
  C_C (C_C (C_B) (C_B)) (C_C (C_A) (C_B)) -> 144 
  C_C (C_B) (C_C (C_B) (C_C _ _)) -> 145 
  C_C (C_C (C_C _ _) (C_B)) (C_A) -> 146 
  C_C (C_C (C_C _ _) (C_B)) _ -> 147 
  C_C (C_C (C_A) (C_A)) (C_C (C_B) (C_C _ _)) -> 148 
  C_C (C_A) (C_B) -> 149 
  C_C (C_C (C_C _ _) _) (C_C _ (C_B)) -> 150 
  C_C (C_C (C_A) (C_A)) (C_C (C_B) _) -> 151 
  C_C (C_C (C_A) (C_C _ _)) (C_A) -> 152 
  C_C (C_A) (C_C _ (C_C _ _)) -> 153 
  C_C (C_C _ (C_B)) (C_C (C_B) (C_B)) -> 154 
  C_C (C_C (C_A) _) (C_C (C_B) (C_C _ _)) -> 155 
  C_C (C_A) (C_C (C_C _ _) (C_A)) -> 156 
  C_C _ (C_C (C_C _ _) _) -> 157 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_A) (C_B)) -> 158 
  C_C (C_C (C_B) (C_B)) _ -> 159 
  C_C (C_C _ (C_A)) (C_C _ _) -> 160 
  C_C (C_C (C_B) (C_B)) (C_C (C_C _ _) (C_C _ _)) -> 161 
  C_C (C_C (C_C _ _) _) (C_C (C_A) (C_A)) -> 162 
  C_C (C_C _ (C_B)) (C_C (C_C _ _) (C_B)) -> 163 
  C_C (C_C _ (C_B)) (C_C (C_B) (C_C _ _)) -> 164 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_A) -> 165 
  C_C (C_C (C_B) (C_A)) (C_C (C_B) (C_A)) -> 166 
  C_C (C_C (C_A) (C_A)) (C_C (C_A) (C_B)) -> 167 
  C_C (C_C (C_A) _) (C_C (C_A) _) -> 168 
  C_C (C_C (C_C _ _) _) (C_C (C_A) (C_B)) -> 169 
