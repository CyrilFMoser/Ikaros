module Program_14 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) | C_B (B_A a) a | C_C (((Char,Bool),(Int,Int))) (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_A (C_A _)) _ -> 0 
  C_B (C_A (C_B _ _)) _ -> 1 
  C_B (C_A (C_C _ _)) _ -> 2 
  C_B (C_B _ _) _ -> 3 
  C_B (C_C _ _) _ -> 4 
  C_C _ _ -> 5 
