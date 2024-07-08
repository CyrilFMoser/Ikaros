module Program_23 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A b b) (((Char,Bool),Int)) | C_B | C_C (B_A a a) Char | C_D Int a

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_A (C_C _ _) _) _ -> 0 
  C_C _ _ -> 1 
  C_C (C_D _ _) _ -> 2 
  C_C (C_C _ _) _ -> 3 
  C_C (C_C (C_B) _) _ -> 4 
  C_C (C_C (C_C _ _) _) _ -> 5 
  C_A (C_A (C_D _ _) _) _ -> 6 
  C_A (C_A (C_C _ _) _) _ -> 7 
  C_A (C_A (C_A _ _) (((_,_),_))) _ -> 8 
