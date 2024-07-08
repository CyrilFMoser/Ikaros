module Program_25 () where 

 main = print $ show v_b
data B_A = C_A | C_B ((B_A,(Bool,Bool))) | C_C Bool
data B_B = C_D Int | C_E B_A B_B

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B _ -> 1 
