module Program_6 () where 

main = print $ show v_b
data B_A a = C_A B_B (B_A a) | C_B
data B_B = C_C (B_A Int) Char | C_D B_B B_B B_B | C_E Bool ((B_B,B_B))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_B) _ -> 0 
  C_C (C_B) 'x' -> 1 
  C_C (C_A _ _) _ -> 2 
  C_E _ ((C_E _ _,C_D _ _ _)) -> 3 
  C_E _ ((C_E _ _,C_E _ _)) -> 4 
  C_E _ ((C_E _ _,C_C _ _)) -> 5 
  C_E _ _ -> 6 
  C_E _ ((C_D _ _ _,C_E _ _)) -> 7 
  C_E _ ((C_C _ _,C_E _ _)) -> 8 
  C_E _ ((C_D _ _ _,C_C _ _)) -> 9 
  C_E _ ((C_D _ _ _,C_D _ _ _)) -> 10 
  C_E _ ((C_C _ _,C_C _ _)) -> 11 
  C_D (C_E _ _) _ (C_C _ _) -> 12 
  C_D (C_C _ _) _ (C_C _ _) -> 13 
  C_D (C_C _ _) _ _ -> 14 
  C_D (C_D _ _ _) (C_E _ _) (C_C _ _) -> 15 
  C_D (C_D _ _ _) (C_D _ _ _) (C_D _ _ _) -> 16 
  C_D (C_C _ _) (C_C _ _) (C_D _ _ _) -> 17 
  C_D (C_D _ _ _) _ (C_C _ _) -> 18 
  C_D (C_D _ _ _) (C_D _ _ _) _ -> 19 
  C_D _ _ _ -> 20 
  C_D (C_D _ _ _) (C_C _ _) _ -> 21 
  C_D (C_E _ _) (C_E _ _) _ -> 22 
  C_D (C_D _ _ _) (C_C _ _) (C_E _ _) -> 23 
  C_D (C_E _ _) (C_D _ _ _) _ -> 24 
  C_D _ (C_C _ _) (C_E _ _) -> 25 
  C_D _ (C_C _ _) (C_C _ _) -> 26 
  C_D (C_E _ _) (C_C _ _) (C_D _ _ _) -> 27 
  C_D (C_C _ _) (C_C _ _) _ -> 28 
  C_D _ (C_D _ _ _) _ -> 29 
  C_D (C_C _ _) (C_D _ _ _) _ -> 30 
  C_D _ (C_D _ _ _) (C_D _ _ _) -> 31 
  C_D (C_D _ _ _) (C_D _ _ _) (C_C _ _) -> 32 
  C_D (C_D _ _ _) _ (C_D _ _ _) -> 33 
  C_D (C_D _ _ _) (C_D _ _ _) (C_E _ _) -> 34 
  C_D (C_C _ _) (C_C _ _) (C_C _ _) -> 35 
  C_D (C_C _ _) (C_D _ _ _) (C_D _ _ _) -> 36 
  C_D (C_D _ _ _) (C_C _ _) (C_C _ _) -> 37 
  C_D (C_E _ _) (C_E _ _) (C_D _ _ _) -> 38 
  C_D (C_E _ _) _ (C_E _ _) -> 39 
  C_D (C_D _ _ _) (C_E _ _) _ -> 40 
  C_D (C_E _ _) (C_C _ _) _ -> 41 
  C_D (C_E _ _) (C_E _ _) (C_C _ _) -> 42 
  C_D (C_C _ _) _ (C_E _ _) -> 43 
  C_D (C_C _ _) (C_D _ _ _) (C_C _ _) -> 44 
  C_D (C_E _ _) (C_D _ _ _) (C_D _ _ _) -> 45 
  C_D (C_E _ _) (C_D _ _ _) (C_C _ _) -> 46 
  C_D _ _ (C_D _ _ _) -> 47 
  C_D (C_C _ _) (C_E _ _) _ -> 48 
  C_D (C_E _ _) (C_D _ _ _) (C_E _ _) -> 49 
  C_D (C_C _ _) _ (C_D _ _ _) -> 50 
  C_D (C_C _ _) (C_D _ _ _) (C_E _ _) -> 51 
  C_D _ (C_C _ _) (C_D _ _ _) -> 52 
  C_D _ _ (C_C _ _) -> 53 
  C_D (C_C _ _) (C_E _ _) (C_D _ _ _) -> 54 
  C_D _ (C_E _ _) (C_D _ _ _) -> 55 
  C_D (C_D _ _ _) (C_E _ _) (C_D _ _ _) -> 56 
  C_D (C_E _ _) (C_E _ _) (C_E _ _) -> 57 
  C_D (C_D _ _ _) (C_E _ _) (C_E _ _) -> 58 
  C_D (C_E _ _) (C_C _ _) (C_C _ _) -> 59 
  C_D (C_C _ _) (C_C _ _) (C_E _ _) -> 60 
  C_D (C_C _ _) (C_E _ _) (C_E _ _) -> 61 
  C_D _ (C_E _ _) (C_E _ _) -> 62 
  C_D _ (C_E _ _) (C_C _ _) -> 63 
  C_D (C_E _ _) _ _ -> 64 
  C_D _ _ (C_E _ _) -> 65 
  C_D (C_C _ _) (C_E _ _) (C_C _ _) -> 66 
  C_D (C_D _ _ _) _ _ -> 67 
  C_D _ (C_C _ _) _ -> 68 
  C_D (C_E _ _) (C_C _ _) (C_E _ _) -> 69 
  C_D (C_D _ _ _) (C_C _ _) (C_D _ _ _) -> 70 
  C_D _ (C_E _ _) _ -> 71 
  C_D _ (C_D _ _ _) (C_E _ _) -> 72 
  C_D _ (C_D _ _ _) (C_C _ _) -> 73 
  C_D (C_D _ _ _) _ (C_E _ _) -> 74 
