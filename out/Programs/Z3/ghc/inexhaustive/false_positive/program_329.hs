module Program_17 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B Int | C_C b | C_D Int

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ -> 0 
