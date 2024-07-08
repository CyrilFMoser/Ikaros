module Program_16 () where 

 main = print $ show v_b
data B_A a b = C_A B_B Char | C_B (B_A a a) | C_C a | C_D a ((B_B,B_B))
data B_D d = C_K B_B Bool | C_L (B_A d d) | C_M d ((B_B,Int))
data B_C c = C_F | C_G (B_A c c) c | C_H B_B ((B_B,(Bool,Int))) | C_I B_B | C_J c
data B_B = C_E

v_a :: B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_H _ _ -> 1 
  C_I C_E -> 2 
  C_J _ -> 3 
