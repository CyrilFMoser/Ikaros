module Program_37 () where 

main = print $ show v_b
data B_B b = C_C (B_A b) (B_A b) b | C_D Int (B_A b)
data B_A a = C_A a (B_B a) | C_B (B_B a) (B_A a) (B_A a)

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_A _ (C_C _ _ _)) (C_A _ (C_C _ _ _)) _ -> 0 
  C_C (C_A _ (C_D _ _)) (C_A _ (C_C _ _ _)) _ -> 1 
  C_C (C_B _ (C_A _ _) (C_A _ _)) (C_A _ (C_C _ _ _)) _ -> 2 
  C_C (C_B _ (C_B _ _ _) (C_A _ _)) (C_A _ (C_C _ _ _)) _ -> 3 
  C_C (C_B _ (C_A _ _) (C_B _ _ _)) (C_A _ (C_C _ _ _)) _ -> 4 
  C_C (C_B _ (C_B _ _ _) (C_B _ _ _)) (C_A _ (C_C _ _ _)) _ -> 5 
  C_C (C_A _ (C_C _ _ _)) (C_A _ (C_D _ _)) _ -> 6 
  C_C (C_A _ (C_D _ _)) (C_A _ (C_D _ _)) _ -> 7 
  C_C (C_B _ (C_A _ _) (C_A _ _)) (C_A _ (C_D _ _)) _ -> 8 
  C_C (C_B _ (C_B _ _ _) (C_A _ _)) (C_A _ (C_D _ _)) _ -> 9 
  C_C (C_B _ (C_A _ _) (C_B _ _ _)) (C_A _ (C_D _ _)) _ -> 10 
  C_C (C_B _ (C_B _ _ _) (C_B _ _ _)) (C_A _ (C_D _ _)) _ -> 11 
  C_C (C_A _ (C_C _ _ _)) (C_B _ (C_A _ _) _) _ -> 12 
  C_C (C_A _ (C_D _ _)) (C_B _ (C_A _ _) _) _ -> 13 
  C_C (C_B _ (C_A _ _) (C_A _ _)) (C_B _ (C_A _ _) _) _ -> 14 
  C_C (C_B _ (C_B _ _ _) (C_A _ _)) (C_B _ (C_A _ _) _) _ -> 15 
  C_C (C_B _ (C_A _ _) (C_B _ _ _)) (C_B _ (C_A _ _) _) _ -> 16 
  C_C (C_B _ (C_B _ _ _) (C_B _ _ _)) (C_B _ (C_A _ _) _) _ -> 17 
  C_C (C_A _ (C_C _ _ _)) (C_B _ (C_B _ _ _) _) _ -> 18 
  C_C (C_A _ (C_D _ _)) (C_B _ (C_B _ _ _) _) _ -> 19 
  C_C (C_B _ (C_A _ _) (C_A _ _)) (C_B _ (C_B _ _ _) _) _ -> 20 
  C_C (C_B _ (C_B _ _ _) (C_A _ _)) (C_B _ (C_B _ _ _) _) _ -> 21 
  C_C (C_B _ (C_B _ _ _) (C_B _ _ _)) (C_B _ (C_B _ _ _) _) _ -> 22 
  C_D _ _ -> 23 

--  This is not matched: C_B _ _ (C_A)