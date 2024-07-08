module Program_6 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a B_B) | C_B B_B | C_C
data B_B = C_D Char | C_E Bool | C_F Bool | C_G (B_A Bool B_B) (B_C B_B)
data B_C c = C_H | C_I | C_J Int | C_K Bool

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ -> 0 
  C_F _ -> 1 
  C_G _ _ -> 2 
