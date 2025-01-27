module Program_28 () where 

main = print $ show v_b
data B_A a b = C_A | C_B | C_C (B_A a b) a Int
data B_B = C_D (B_A B_B B_B) | C_E (B_A B_B (B_A B_B B_B)) B_B B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_A) -> 0 
  C_D (C_B) -> 1 
  C_D (C_C _ (C_D _) _) -> 2 
  C_D (C_C _ (C_E _ _ _) _) -> 3 
  C_E (C_A) (C_D (C_A)) _ -> 4 
  C_E (C_A) (C_D (C_B)) _ -> 5 
  C_E (C_A) (C_D (C_C _ _ _)) _ -> 6 
  C_E (C_A) (C_E _ (C_D _) _) _ -> 7 
  C_E (C_A) (C_E _ (C_E _ _ _) _) _ -> 8 
  C_E (C_B) (C_D (C_A)) _ -> 9 
  C_E (C_B) (C_D (C_B)) _ -> 10 
  C_E (C_B) (C_D (C_C _ _ _)) _ -> 11 
  C_E (C_B) (C_E _ (C_D _) _) _ -> 12 
  C_E (C_B) (C_E _ (C_E _ _ _) _) _ -> 13 
  C_E (C_C (C_A) _ _) (C_D (C_A)) _ -> 14 
  C_E (C_C (C_A) _ _) (C_D (C_B)) _ -> 15 
  C_E (C_C (C_A) _ _) (C_D (C_C _ _ _)) _ -> 16 
  C_E (C_C (C_A) _ _) (C_E _ (C_D _) _) _ -> 17 
  C_E (C_C (C_A) _ _) (C_E _ (C_E _ _ _) _) _ -> 18 
  C_E (C_C (C_B) _ _) (C_D (C_A)) _ -> 19 
  C_E (C_C (C_B) _ _) (C_D (C_B)) _ -> 20 
  C_E (C_C (C_B) _ _) (C_D (C_C _ _ _)) _ -> 21 
  C_E (C_C (C_B) _ _) (C_E _ (C_D _) _) _ -> 22 
  C_E (C_C (C_B) _ _) (C_E _ (C_E _ _ _) _) _ -> 23 
  C_E (C_C (C_C _ _ _) _ _) (C_D (C_B)) _ -> 24 
  C_E (C_C (C_C _ _ _) _ _) (C_D (C_C _ _ _)) _ -> 25 
  C_E (C_C (C_C _ _ _) _ _) (C_E _ (C_D _) _) _ -> 26 
  C_E (C_C (C_C _ _ _) _ _) (C_E _ (C_E _ _ _) _) _ -> 27 

--  This is not matched: C_B _ _ (C_A)