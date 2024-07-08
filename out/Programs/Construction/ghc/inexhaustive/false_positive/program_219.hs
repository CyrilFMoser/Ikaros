module Program_5 () where 

 main = print $ show v_b
data B_A = C_A B_A | C_B B_A B_A | C_C B_A
data B_B a = C_D Bool a | C_E Bool

v_a :: B_B B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ -> 0 
