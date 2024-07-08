module Program_23 () where 

 main = print $ show v_b
data B_A a b = C_A b Int | C_B | C_C | C_D B_B B_B
data B_B = C_E B_B Int | C_F (B_A B_B B_B) Bool

v_a :: B_A Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
  C_D (C_F _ _) _ -> 2 
  C_D (C_E (C_E _ _) _) (C_E (C_F _ _) _) -> 3 
  C_D (C_F (C_D _ _) _) (C_F (C_C) _) -> 4 
  C_D (C_F (C_C) _) (C_E (C_F _ _) _) -> 5 
  C_D (C_F (C_D _ _) _) (C_F _ _) -> 6 
  C_D (C_F (C_B) _) _ -> 7 
  C_D (C_F (C_A _ _) _) _ -> 8 
  C_D (C_F _ _) (C_E _ _) -> 9 
  C_D (C_E (C_F _ _) _) (C_F (C_D _ _) _) -> 10 
  C_D (C_F (C_A _ _) _) (C_F (C_D _ _) _) -> 11 
  C_D _ (C_F (C_B) _) -> 12 
  C_D (C_E _ _) (C_F _ _) -> 13 
  C_D (C_F (C_D _ _) _) (C_E (C_F _ _) _) -> 14 
  C_D (C_E (C_E _ _) _) (C_F (C_A _ _) _) -> 15 
  C_D (C_F (C_B) _) (C_F (C_D _ _) _) -> 16 
  C_D (C_F (C_A _ _) _) (C_F _ _) -> 17 
  C_D (C_F _ _) (C_F _ _) -> 18 
  C_D (C_F (C_B) _) (C_E _ _) -> 19 
  C_D (C_F (C_A _ _) _) (C_F (C_B) _) -> 20 
  C_D _ (C_F (C_C) _) -> 21 
  C_D (C_E (C_F _ _) _) (C_F _ _) -> 22 
  C_D _ _ -> 23 
  C_D (C_F (C_C) _) _ -> 24 
  C_D (C_F _ _) (C_E (C_F _ _) _) -> 25 
  C_D (C_F _ _) (C_F (C_B) _) -> 26 
  C_D (C_F (C_C) _) (C_F (C_D _ _) _) -> 27 
  C_D (C_F (C_B) _) (C_E (C_F _ _) _) -> 28 
  C_D _ (C_F (C_A _ _) _) -> 29 
  C_D (C_F (C_D _ _) _) (C_F (C_A _ _) _) -> 30 
  C_D (C_E _ _) (C_E (C_F _ _) _) -> 31 
  C_D (C_E _ _) (C_F (C_B) _) -> 32 
  C_D (C_E (C_F _ _) _) (C_E (C_E _ _) _) -> 33 
  C_D (C_F (C_A _ _) _) (C_E (C_F _ _) _) -> 34 
  C_D (C_F (C_A _ _) _) (C_E _ _) -> 35 
  C_D (C_E _ _) _ -> 36 
  C_D (C_F (C_B) _) (C_F (C_B) _) -> 37 
  C_D (C_E _ _) (C_F (C_D _ _) _) -> 38 
  C_D (C_F _ _) (C_F (C_A _ _) _) -> 39 
  C_D (C_F (C_C) _) (C_E _ _) -> 40 
  C_D (C_F (C_C) _) (C_F _ _) -> 41 
  C_D (C_E (C_F _ _) _) _ -> 42 
  C_D (C_F (C_A _ _) _) (C_E (C_E _ _) _) -> 43 
  C_D (C_E _ _) (C_F (C_A _ _) _) -> 44 
  C_D (C_F _ _) (C_E (C_E _ _) _) -> 45 
  C_D (C_F _ _) (C_F (C_C) _) -> 46 
  C_D (C_E (C_E _ _) _) (C_F (C_C) _) -> 47 
  C_D (C_F (C_D _ _) _) (C_E (C_E _ _) _) -> 48 
  C_D (C_E (C_E _ _) _) (C_F (C_D _ _) _) -> 49 
  C_D (C_F (C_B) _) (C_F (C_A _ _) _) -> 50 
  C_D (C_F (C_D _ _) _) (C_E _ _) -> 51 
  C_D (C_E (C_E _ _) _) (C_F _ _) -> 52 
