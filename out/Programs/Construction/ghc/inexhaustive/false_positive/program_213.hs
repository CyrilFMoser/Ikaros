module Program_28 () where 

 main = print $ show v_b
data B_D c d = C_I | C_J B_A B_B | C_K B_B (B_C c c)
data B_B = C_D B_B Bool
data B_A = C_A B_A | C_B B_B | C_C B_A B_A
data B_C a b = C_E a Int | C_F | C_G (B_C b b) Bool | C_H B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B (C_D _ _) -> 1 
