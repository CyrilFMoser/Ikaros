module Program_13 () where 

 main = print $ show v_b
data B_B b c = C_D Bool (B_B c c) | C_E (B_A c) | C_F (B_A c) | C_G
data B_A a = C_A | C_B (B_B a a) | C_C
data B_C d = C_H Int | C_I | C_J (B_B d d) d

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B (C_D _ _) -> 1 
  C_B (C_E (C_A)) -> 2 
  C_B (C_E (C_B _)) -> 3 
  C_B (C_E (C_C)) -> 4 
  C_B (C_F (C_A)) -> 5 
  C_B (C_F (C_C)) -> 6 
  C_B (C_G) -> 7 
  C_C -> 8 
