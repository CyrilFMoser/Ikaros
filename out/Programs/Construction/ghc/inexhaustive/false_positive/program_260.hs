module Program_12 () where 

 main = print $ show v_b
data B_B a b = C_D b (B_B a a) | C_E ((B_C,B_C))
data B_C = C_F | C_G | C_H (B_B Bool ((Int,Bool)))
data B_A = C_A (B_B B_C B_A) B_C | C_B (B_B B_A B_C) B_C | C_C Bool

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
  C_H _ -> 1 
