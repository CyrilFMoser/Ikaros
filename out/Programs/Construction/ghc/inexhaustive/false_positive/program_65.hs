module Program_1 () where 

 main = print $ show v_b
data B_C b c = C_H | C_I B_B | C_J B_B
data B_B = C_F Bool Char | C_G
data B_A a = C_A (B_C a a) | C_B ((B_B,B_B)) (B_C a a) | C_C | C_D | C_E B_B Bool

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_C -> 1 
  C_D -> 2 
  C_E (C_F _ _) _ -> 3 
  C_E C_G _ -> 4 
