module Program_12 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B b | C_C ((Int,Int)) a | C_D Int

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
  C_C _ _ -> 1 
  C_D _ -> 2 
