module Program_16 () where 

 main = print $ show v_b
data B_A a = C_A | C_B (B_C ((Bool,Char)) a) (((Char,Int),(Int,Int))) | C_C
data B_C d e = C_G | C_H (B_A d) | C_I
data B_B b c = C_D (B_C c c) c | C_E (B_A b) b | C_F ((Int,Char)) (B_C b c)

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B _ _ -> 1 
