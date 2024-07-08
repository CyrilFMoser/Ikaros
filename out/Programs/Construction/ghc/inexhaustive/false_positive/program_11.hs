module Program_19 () where 

 main = print $ show v_b
data B_B c = C_F
data B_A a b = C_A (B_B Char) | C_B Bool (B_B b) | C_C Char | C_D | C_E a

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_C _ -> 1 
  C_D -> 2 
  C_E _ -> 3 
