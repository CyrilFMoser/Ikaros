module Program_30 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B
data B_B = C_C | C_D ((Bool,B_B)) B_B
data B_C c d = C_E (B_C d d) | C_F (B_A d c) (B_A c c) | C_G c | C_H (B_A c d) | C_I

v_a :: B_C Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ -> 0 
  C_F (C_A) (C_A) -> 1 
  C_F (C_B) (C_A) -> 2 
  C_F (C_A) (C_B) -> 3 
  C_F (C_B) (C_B) -> 4 
  C_H (C_A) -> 5 
  C_H (C_B) -> 6 
  C_I -> 7 
