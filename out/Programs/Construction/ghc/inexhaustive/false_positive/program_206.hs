module Program_21 () where 

 main = print $ show v_b
data B_A a = C_A ((B_B,B_B)) | C_B B_B Bool | C_C (B_A a) (B_A a) | C_D B_B | C_E (B_A a) a
data B_B = C_F

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B C_F _ -> 1 
  C_C _ _ -> 2 
  C_D C_F -> 3 
  C_E (C_A _) _ -> 4 
  C_E (C_B _ _) _ -> 5 
  C_E (C_C (C_A _) _) _ -> 6 
  C_E (C_C (C_B _ _) _) _ -> 7 
  C_E (C_C (C_C _ _) _) _ -> 8 
  C_E (C_C (C_D _) _) _ -> 9 
  C_E (C_C (C_E _ _) _) _ -> 10 
  C_E (C_D _) _ -> 11 
