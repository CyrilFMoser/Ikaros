module Program_10 () where 

 main = print $ show v_b
data B_A = C_A B_A | C_B B_A B_A | C_C B_A | C_D Int

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_B _ (C_C _)) -> 0 
