module Program_26 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_A a b) (B_A a b) | C_C (B_A a b) (B_A a b) | C_D (B_A Int b) Bool

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B (C_A) (C_A) -> 1 
  C_B (C_B _ _) (C_A) -> 2 
  C_B (C_C _ _) (C_A) -> 3 
  C_B (C_D _ _) (C_A) -> 4 
  C_B (C_A) (C_B (C_A) (C_A)) -> 5 
  C_B (C_B _ _) (C_B (C_A) (C_A)) -> 6 
  C_B (C_C _ _) (C_B (C_A) (C_A)) -> 7 
  C_B (C_D _ _) (C_B (C_A) (C_A)) -> 8 
  C_B (C_A) (C_B (C_A) (C_B _ _)) -> 9 
  C_B (C_B _ _) (C_B (C_A) (C_B _ _)) -> 10 
  C_B (C_C _ _) (C_B (C_A) (C_B _ _)) -> 11 
  C_B (C_D _ _) (C_B (C_A) (C_B _ _)) -> 12 
  C_B (C_A) (C_B (C_A) (C_C _ _)) -> 13 
  C_B (C_B _ _) (C_B (C_A) (C_C _ _)) -> 14 
  C_B (C_C _ _) (C_B (C_A) (C_C _ _)) -> 15 
  C_B (C_D _ _) (C_B (C_A) (C_C _ _)) -> 16 
  C_B (C_A) (C_B (C_A) (C_D _ _)) -> 17 
  C_B (C_B _ _) (C_B (C_A) (C_D _ _)) -> 18 
  C_B (C_C _ _) (C_B (C_A) (C_D _ _)) -> 19 
  C_B (C_D _ _) (C_B (C_A) (C_D _ _)) -> 20 
  C_B (C_A) (C_B (C_B _ _) (C_A)) -> 21 
  C_B (C_B _ _) (C_B (C_B _ _) (C_A)) -> 22 
  C_B (C_C _ _) (C_B (C_B _ _) (C_A)) -> 23 
  C_B (C_D _ _) (C_B (C_B _ _) (C_A)) -> 24 
  C_B (C_A) (C_B (C_B _ _) (C_B _ _)) -> 25 
  C_B (C_B _ _) (C_B (C_B _ _) (C_B _ _)) -> 26 
  C_B (C_C _ _) (C_B (C_B _ _) (C_B _ _)) -> 27 
  C_B (C_D _ _) (C_B (C_B _ _) (C_B _ _)) -> 28 
  C_B (C_A) (C_B (C_B _ _) (C_C _ _)) -> 29 
  C_B (C_B _ _) (C_B (C_B _ _) (C_C _ _)) -> 30 
  C_B (C_C _ _) (C_B (C_B _ _) (C_C _ _)) -> 31 
  C_B (C_D _ _) (C_B (C_B _ _) (C_C _ _)) -> 32 
  C_B (C_A) (C_B (C_B _ _) (C_D _ _)) -> 33 
  C_B (C_B _ _) (C_B (C_B _ _) (C_D _ _)) -> 34 
  C_B (C_C _ _) (C_B (C_B _ _) (C_D _ _)) -> 35 
  C_B (C_D _ _) (C_B (C_B _ _) (C_D _ _)) -> 36 
  C_B (C_A) (C_B (C_C _ _) (C_A)) -> 37 
  C_B (C_B _ _) (C_B (C_C _ _) (C_A)) -> 38 
  C_B (C_C _ _) (C_B (C_C _ _) (C_A)) -> 39 
  C_B (C_D _ _) (C_B (C_C _ _) (C_A)) -> 40 
  C_B (C_A) (C_B (C_C _ _) (C_B _ _)) -> 41 
  C_B (C_B _ _) (C_B (C_C _ _) (C_B _ _)) -> 42 
  C_B (C_C _ _) (C_B (C_C _ _) (C_B _ _)) -> 43 
  C_B (C_D _ _) (C_B (C_C _ _) (C_B _ _)) -> 44 
  C_B (C_A) (C_B (C_C _ _) (C_C _ _)) -> 45 
  C_B (C_B _ _) (C_B (C_C _ _) (C_C _ _)) -> 46 
  C_B (C_C _ _) (C_B (C_C _ _) (C_C _ _)) -> 47 
  C_B (C_D _ _) (C_B (C_C _ _) (C_C _ _)) -> 48 
  C_B (C_A) (C_B (C_C _ _) (C_D _ _)) -> 49 
  C_B (C_B _ _) (C_B (C_C _ _) (C_D _ _)) -> 50 
  C_B (C_C _ _) (C_B (C_C _ _) (C_D _ _)) -> 51 
  C_B (C_D _ _) (C_B (C_C _ _) (C_D _ _)) -> 52 
  C_B (C_B _ _) (C_B (C_D _ _) (C_A)) -> 53 
  C_B (C_C _ _) (C_B (C_D _ _) (C_A)) -> 54 
  C_B (C_D _ _) (C_B (C_D _ _) (C_A)) -> 55 
  C_B (C_A) (C_B (C_D _ _) (C_B _ _)) -> 56 
  C_B (C_B _ _) (C_B (C_D _ _) (C_B _ _)) -> 57 
  C_B (C_C _ _) (C_B (C_D _ _) (C_B _ _)) -> 58 
  C_B (C_D _ _) (C_B (C_D _ _) (C_B _ _)) -> 59 
  C_B (C_A) (C_B (C_D _ _) (C_C _ _)) -> 60 
  C_B (C_B _ _) (C_B (C_D _ _) (C_C _ _)) -> 61 
  C_B (C_C _ _) (C_B (C_D _ _) (C_C _ _)) -> 62 
  C_B (C_D _ _) (C_B (C_D _ _) (C_C _ _)) -> 63 
  C_B (C_A) (C_B (C_D _ _) (C_D _ _)) -> 64 
  C_B (C_B _ _) (C_B (C_D _ _) (C_D _ _)) -> 65 
  C_B (C_C _ _) (C_B (C_D _ _) (C_D _ _)) -> 66 
  C_B (C_D _ _) (C_B (C_D _ _) (C_D _ _)) -> 67 
  C_B (C_A) (C_C _ (C_A)) -> 68 
  C_B (C_B _ _) (C_C _ (C_A)) -> 69 
  C_B (C_C _ _) (C_C _ (C_A)) -> 70 
  C_B (C_D _ _) (C_C _ (C_A)) -> 71 
  C_B (C_A) (C_C _ (C_B _ _)) -> 72 
  C_B (C_B _ _) (C_C _ (C_B _ _)) -> 73 
  C_B (C_C _ _) (C_C _ (C_B _ _)) -> 74 
  C_B (C_D _ _) (C_C _ (C_B _ _)) -> 75 
  C_B (C_A) (C_C _ (C_C _ _)) -> 76 
  C_B (C_B _ _) (C_C _ (C_C _ _)) -> 77 
  C_B (C_C _ _) (C_C _ (C_C _ _)) -> 78 
  C_B (C_D _ _) (C_C _ (C_C _ _)) -> 79 
  C_B (C_A) (C_C _ (C_D _ _)) -> 80 
  C_B (C_B _ _) (C_C _ (C_D _ _)) -> 81 
  C_B (C_C _ _) (C_C _ (C_D _ _)) -> 82 
  C_B (C_D _ _) (C_C _ (C_D _ _)) -> 83 
  C_B (C_A) (C_D _ _) -> 84 
  C_B (C_B _ _) (C_D _ _) -> 85 
  C_B (C_C _ _) (C_D _ _) -> 86 
  C_B (C_D _ _) (C_D _ _) -> 87 
  C_C _ _ -> 88 
  C_D _ _ -> 89 
