module Program_0 () where 

 main = print $ show v_b
data B_B = C_D ((B_B,(Char,Bool))) B_B
data B_A = C_A B_B B_B | C_B B_B | C_C B_B

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
  C_C (C_D _ (C_D _ _)) -> 1 
