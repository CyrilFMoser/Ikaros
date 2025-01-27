module Program_18 () where 

main = print $ show v_b
data B_A a = C_A (B_B a a) (B_B a a) a | C_B (B_A a) Int | C_C Char Bool
data B_B b c = C_D c (B_A b) | C_E (B_A c) (B_A c) | C_F (B_B (B_A (B_A b)) b)

v_a :: B_B Bool Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ _ -> 0 
  C_E (C_A _ _ _) (C_A (C_D _ _) (C_D _ _) _) -> 1 
  C_E (C_B (C_A _ _ _) _) (C_A (C_D _ _) (C_D _ _) _) -> 2 
  C_E (C_B (C_B _ _) _) (C_A (C_D _ _) (C_D _ _) _) -> 3 
  C_E (C_B (C_C _ _) _) (C_A (C_D _ _) (C_D _ _) _) -> 4 
  C_E (C_C _ _) (C_A (C_D _ _) (C_D _ _) _) -> 5 
  C_E (C_A _ _ _) (C_A (C_E _ _) (C_D _ _) _) -> 6 
  C_E (C_B (C_A _ _ _) _) (C_A (C_E _ _) (C_D _ _) _) -> 7 
  C_E (C_B (C_B _ _) _) (C_A (C_E _ _) (C_D _ _) _) -> 8 
  C_E (C_B (C_C _ _) _) (C_A (C_E _ _) (C_D _ _) _) -> 9 
  C_E (C_C _ _) (C_A (C_E _ _) (C_D _ _) _) -> 10 
  C_E (C_A _ _ _) (C_A (C_F _) (C_D _ _) _) -> 11 
  C_E (C_B (C_A _ _ _) _) (C_A (C_F _) (C_D _ _) _) -> 12 
  C_E (C_B (C_B _ _) _) (C_A (C_F _) (C_D _ _) _) -> 13 
  C_E (C_B (C_C _ _) _) (C_A (C_F _) (C_D _ _) _) -> 14 
  C_E (C_C _ _) (C_A (C_F _) (C_D _ _) _) -> 15 
  C_E (C_A _ _ _) (C_A (C_D _ _) (C_E _ _) _) -> 16 
  C_E (C_B (C_A _ _ _) _) (C_A (C_D _ _) (C_E _ _) _) -> 17 
  C_E (C_B (C_B _ _) _) (C_A (C_D _ _) (C_E _ _) _) -> 18 
  C_E (C_B (C_C _ _) _) (C_A (C_D _ _) (C_E _ _) _) -> 19 
  C_E (C_C _ _) (C_A (C_D _ _) (C_E _ _) _) -> 20 
  C_E (C_A _ _ _) (C_A (C_E _ _) (C_E _ _) _) -> 21 
  C_E (C_B (C_A _ _ _) _) (C_A (C_E _ _) (C_E _ _) _) -> 22 
  C_E (C_B (C_B _ _) _) (C_A (C_E _ _) (C_E _ _) _) -> 23 
  C_E (C_B (C_C _ _) _) (C_A (C_E _ _) (C_E _ _) _) -> 24 
  C_E (C_C _ _) (C_A (C_E _ _) (C_E _ _) _) -> 25 
  C_E (C_A _ _ _) (C_A (C_F _) (C_E _ _) _) -> 26 
  C_E (C_B (C_A _ _ _) _) (C_A (C_F _) (C_E _ _) _) -> 27 
  C_E (C_B (C_B _ _) _) (C_A (C_F _) (C_E _ _) _) -> 28 
  C_E (C_B (C_C _ _) _) (C_A (C_F _) (C_E _ _) _) -> 29 
  C_E (C_C _ _) (C_A (C_F _) (C_E _ _) _) -> 30 
  C_E (C_A _ _ _) (C_A (C_D _ _) (C_F _) _) -> 31 
  C_E (C_B (C_A _ _ _) _) (C_A (C_D _ _) (C_F _) _) -> 32 
  C_E (C_B (C_B _ _) _) (C_A (C_D _ _) (C_F _) _) -> 33 
  C_E (C_B (C_C _ _) _) (C_A (C_D _ _) (C_F _) _) -> 34 
  C_E (C_C _ _) (C_A (C_D _ _) (C_F _) _) -> 35 
  C_E (C_A _ _ _) (C_A (C_E _ _) (C_F _) _) -> 36 
  C_E (C_B (C_A _ _ _) _) (C_A (C_E _ _) (C_F _) _) -> 37 
  C_E (C_B (C_B _ _) _) (C_A (C_E _ _) (C_F _) _) -> 38 
  C_E (C_B (C_C _ _) _) (C_A (C_E _ _) (C_F _) _) -> 39 
  C_E (C_C _ _) (C_A (C_E _ _) (C_F _) _) -> 40 
  C_E (C_A _ _ _) (C_A (C_F _) (C_F _) _) -> 41 
  C_E (C_B (C_A _ _ _) _) (C_A (C_F _) (C_F _) _) -> 42 
  C_E (C_B (C_B _ _) _) (C_A (C_F _) (C_F _) _) -> 43 
  C_E (C_B (C_C _ _) _) (C_A (C_F _) (C_F _) _) -> 44 
  C_E (C_C _ _) (C_A (C_F _) (C_F _) _) -> 45 
  C_E (C_A _ _ _) (C_B _ _) -> 46 
  C_E (C_B (C_A _ _ _) _) (C_B _ _) -> 47 
  C_E (C_B (C_B _ _) _) (C_B _ _) -> 48 
  C_E (C_B (C_C _ _) _) (C_B _ _) -> 49 
  C_E (C_C _ _) (C_B _ _) -> 50 
  C_E (C_A _ _ _) (C_C _ _) -> 51 
  C_E (C_B (C_A _ _ _) _) (C_C _ _) -> 52 
  C_E (C_B (C_B _ _) _) (C_C _ _) -> 53 
  C_E (C_B (C_C _ _) _) (C_C _ _) -> 54 
  C_E (C_C _ _) (C_C _ _) -> 55 
  C_F (C_D _ (C_A _ _ _)) -> 56 
  C_F (C_D _ (C_B _ _)) -> 57 
  C_F (C_D _ (C_C _ _)) -> 58 
  C_F (C_E _ _) -> 59 
  C_F (C_F (C_D _ _)) -> 60 
  C_F (C_F (C_F _)) -> 61 

--  This is not matched: C_F (C_F (C_E _ _))