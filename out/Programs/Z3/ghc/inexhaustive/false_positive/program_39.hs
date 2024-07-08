module Program_15 () where 

 main = print $ show v_b
data B_B = C_D | C_E B_A B_B | C_F | C_G B_B
data B_A = C_A | C_B B_A B_A | C_C ((B_B,Bool)) B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_B _ (C_C _ _)) (C_E (C_B _ _) (C_G _)) -> 0 
