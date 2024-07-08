module Program_10 () where 

 main = print $ show v_b
data B_C = C_G Char | C_H (B_D B_C) | C_I ((B_C,B_C)) (B_B B_C ((Int,Bool))) | C_J | C_K B_C
data B_D e = C_L B_C (B_D e) | C_M e e
data B_A a b = C_A ((B_C,(Bool,Int))) a | C_B | C_C (B_D b)
data B_B c d = C_D (B_A B_C c) | C_E B_C d | C_F

v_a :: B_A B_C Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_C _ -> 1 
