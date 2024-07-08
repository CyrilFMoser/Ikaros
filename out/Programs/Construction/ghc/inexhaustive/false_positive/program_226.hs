module Program_10 () where 

 main = print $ show v_b
data B_A a b = C_A (B_B b) (B_A a b)
data B_D e = C_I (B_A e e) | C_J
data B_B c = C_B | C_C (B_D c) (((Bool,Char),Char)) | C_D | C_E (B_A c c) | C_F
data B_C d = C_G d (B_D d) | C_H

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C _ _ -> 1 
  C_D -> 2 
  C_E (C_A (C_B) _) -> 3 
  C_E (C_A (C_C _ _) _) -> 4 
  C_E (C_A (C_D) _) -> 5 
  C_E (C_A (C_E _) _) -> 6 
  C_F -> 7 
