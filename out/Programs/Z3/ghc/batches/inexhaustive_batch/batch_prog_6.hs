module Program_6 () where 

main = print $ show v_b
data B_A a b = C_A | C_B | C_C (B_A b b) (B_A a a)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C (C_C (C_A) (C_B)) (C_C _ (C_A)) -> 1 
  C_C (C_C _ (C_B)) (C_C (C_B) _) -> 2 
  C_C (C_C (C_C _ _) _) (C_C _ _) -> 3 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_C _ _) _) -> 4 
  C_C (C_C (C_B) (C_A)) (C_C (C_A) (C_A)) -> 5 
  C_C (C_C _ (C_B)) (C_C (C_A) (C_C _ _)) -> 6 
  C_C (C_C (C_B) (C_A)) (C_C (C_C _ _) (C_C _ _)) -> 7 
  C_C (C_A) (C_C (C_A) (C_C _ _)) -> 8 
  C_C (C_A) (C_C (C_C _ _) _) -> 9 
  C_C (C_A) (C_C (C_A) (C_A)) -> 10 
  C_C _ (C_C _ (C_A)) -> 11 
  C_C (C_C _ _) (C_C (C_B) (C_B)) -> 12 
  C_C (C_C (C_B) (C_A)) (C_C (C_C _ _) (C_A)) -> 13 
  C_C (C_C _ _) (C_C _ (C_C _ _)) -> 14 
  C_C (C_A) (C_C (C_B) _) -> 15 
  C_C (C_C (C_C _ _) (C_A)) (C_C _ (C_A)) -> 16 
  C_C (C_C _ (C_B)) (C_C (C_C _ _) (C_A)) -> 17 
  C_C (C_C _ (C_C _ _)) (C_C (C_C _ _) (C_A)) -> 18 
  C_C _ (C_B) -> 19 
  C_C (C_C _ _) (C_C (C_C _ _) (C_C _ _)) -> 20 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_C _ _) (C_B)) -> 21 
  C_C (C_C _ (C_C _ _)) (C_C (C_B) (C_A)) -> 22 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_A) (C_C _ _)) -> 23 
  C_C (C_C _ (C_B)) (C_C _ (C_C _ _)) -> 24 
  C_C (C_C (C_B) _) (C_C (C_A) (C_A)) -> 25 
  C_C (C_C _ (C_B)) (C_C _ (C_A)) -> 26 
  C_C (C_C (C_A) _) (C_C _ (C_B)) -> 27 
  C_C (C_C (C_A) (C_B)) (C_C (C_B) (C_B)) -> 28 
  C_C (C_C (C_B) _) (C_C (C_A) _) -> 29 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_C _ _) (C_B)) -> 30 
  C_C _ (C_C (C_B) (C_B)) -> 31 
  C_C (C_C (C_B) (C_B)) (C_C (C_A) (C_A)) -> 32 
  C_C (C_A) (C_C _ (C_B)) -> 33 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_A) _) -> 34 
  C_C (C_C _ (C_B)) (C_C _ _) -> 35 
  C_C (C_C _ (C_A)) (C_C (C_A) (C_C _ _)) -> 36 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_B) (C_C _ _)) -> 37 
  C_C (C_A) (C_C _ (C_A)) -> 38 
  C_C (C_C (C_C _ _) (C_B)) (C_C _ (C_B)) -> 39 
  C_C _ (C_C (C_C _ _) (C_B)) -> 40 
  C_C (C_C (C_A) _) (C_C (C_B) _) -> 41 
  C_C (C_C (C_B) (C_A)) (C_C _ (C_A)) -> 42 
  C_C (C_C (C_B) _) (C_C (C_C _ _) _) -> 43 
  C_C (C_C (C_B) (C_A)) (C_C (C_C _ _) (C_B)) -> 44 
  C_C (C_C (C_B) (C_B)) (C_C (C_C _ _) (C_B)) -> 45 
  C_C (C_C (C_B) (C_B)) (C_C _ (C_A)) -> 46 
  C_C (C_C (C_B) (C_B)) (C_C (C_C _ _) (C_A)) -> 47 
  C_C (C_C (C_A) (C_A)) (C_A) -> 48 
  C_C (C_C _ _) (C_A) -> 49 
  C_C (C_C (C_C _ _) _) (C_C (C_A) _) -> 50 
  C_C (C_B) (C_A) -> 51 
  C_C (C_C (C_A) (C_B)) (C_C _ (C_B)) -> 52 
  C_C _ (C_C (C_B) (C_A)) -> 53 
  C_C _ (C_C (C_A) _) -> 54 
  C_C (C_C _ _) (C_C _ _) -> 55 
  C_C (C_B) (C_C (C_A) _) -> 56 
  C_C (C_C (C_A) _) (C_C (C_A) (C_B)) -> 57 
  C_C (C_C (C_B) (C_C _ _)) (C_C _ (C_B)) -> 58 
  C_C (C_B) (C_C (C_B) (C_A)) -> 59 
  C_C (C_C (C_C _ _) _) (C_C (C_B) _) -> 60 
  C_C (C_A) (C_C (C_C _ _) (C_C _ _)) -> 61 
  C_C (C_C _ (C_C _ _)) (C_B) -> 62 
  C_C (C_C (C_B) (C_A)) (C_A) -> 63 
  C_C (C_C (C_A) _) (C_C (C_A) (C_C _ _)) -> 64 
  C_C (C_C (C_B) (C_A)) _ -> 65 
  C_C (C_C _ (C_B)) (C_C (C_A) (C_B)) -> 66 
  C_C (C_C (C_B) (C_A)) (C_C (C_A) _) -> 67 
  C_C (C_C (C_B) (C_B)) (C_C _ (C_C _ _)) -> 68 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_B) _) -> 69 
  C_C (C_C (C_A) (C_B)) (C_C (C_A) (C_B)) -> 70 
  C_C (C_C (C_B) (C_C _ _)) (C_C _ (C_A)) -> 71 
  C_C (C_C (C_B) (C_B)) (C_C (C_B) (C_B)) -> 72 
  C_C (C_C (C_A) _) (C_C (C_A) (C_A)) -> 73 
  C_C (C_C _ (C_A)) (C_C (C_C _ _) _) -> 74 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_B) (C_C _ _)) -> 75 
  C_C (C_C _ _) (C_C (C_A) (C_A)) -> 76 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_A) (C_B)) -> 77 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) _) -> 78 
  C_C (C_C _ _) (C_C _ (C_A)) -> 79 
  C_C (C_C (C_C _ _) _) (C_C _ (C_A)) -> 80 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 81 
  C_C (C_C (C_A) (C_B)) (C_C (C_C _ _) (C_B)) -> 82 
  C_C (C_C _ (C_B)) (C_C (C_A) _) -> 83 
  C_C (C_B) (C_C (C_A) (C_A)) -> 84 
  C_C (C_B) (C_B) -> 85 
  C_C (C_A) (C_A) -> 86 
  C_C (C_C (C_A) (C_A)) (C_C _ (C_A)) -> 87 
  C_C (C_C _ _) (C_C (C_B) (C_C _ _)) -> 88 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_A) _) -> 89 
  C_C (C_C (C_A) _) _ -> 90 
  C_C (C_C (C_A) (C_C _ _)) (C_B) -> 91 
  C_C _ (C_C (C_B) (C_C _ _)) -> 92 
  C_C (C_B) (C_C (C_B) _) -> 93 
  C_C (C_C (C_B) (C_C _ _)) (C_B) -> 94 
  C_C (C_C (C_A) _) (C_C (C_C _ _) (C_A)) -> 95 
  C_C (C_C _ (C_B)) (C_C (C_C _ _) (C_C _ _)) -> 96 
  C_C (C_C _ _) (C_C (C_B) (C_A)) -> 97 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) (C_A)) -> 98 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_B) _) -> 99 
  C_C (C_C _ _) _ -> 100 
  C_C (C_C (C_B) _) (C_A) -> 101 
  C_C (C_C _ (C_C _ _)) (C_C (C_C _ _) (C_C _ _)) -> 102 
  C_C (C_C _ (C_C _ _)) _ -> 103 
  C_C (C_C _ (C_A)) (C_C _ (C_B)) -> 104 
  C_C (C_C (C_A) (C_B)) (C_C (C_B) (C_C _ _)) -> 105 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ (C_B)) -> 106 
  C_C (C_C (C_C _ _) _) (C_C (C_B) (C_A)) -> 107 
  C_C (C_C _ (C_A)) (C_C (C_C _ _) (C_B)) -> 108 
  C_C (C_C _ _) (C_C (C_C _ _) (C_A)) -> 109 
  C_C (C_C _ (C_C _ _)) (C_A) -> 110 
  C_C (C_B) (C_C (C_A) (C_B)) -> 111 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 112 
  C_C (C_C (C_A) (C_C _ _)) (C_C _ (C_B)) -> 113 
  C_C (C_C _ (C_C _ _)) (C_C (C_C _ _) (C_B)) -> 114 
  C_C (C_C (C_A) (C_A)) (C_C (C_A) _) -> 115 
  C_C (C_C (C_B) (C_B)) (C_C (C_A) _) -> 116 
  C_C (C_C (C_A) _) (C_C (C_C _ _) _) -> 117 
  C_C (C_C _ _) (C_B) -> 118 
  C_C (C_C (C_A) (C_A)) (C_C _ (C_C _ _)) -> 119 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_C _ _) (C_A)) -> 120 
  C_C (C_C (C_B) (C_A)) (C_C (C_B) (C_B)) -> 121 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_C _ _) _) -> 122 
  C_C (C_C _ (C_C _ _)) (C_C _ (C_C _ _)) -> 123 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_A) _) -> 124 
  C_C (C_C (C_A) _) (C_C (C_C _ _) (C_C _ _)) -> 125 
