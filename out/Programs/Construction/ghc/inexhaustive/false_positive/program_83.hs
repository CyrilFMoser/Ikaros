module Program_26 () where 

 main = print $ show v_b
data B_D c d = C_K d | C_L | C_M (B_A c d)
data B_A a b = C_A (B_A a b) | C_B
data B_B = C_C (B_A B_B B_C) ((B_B,B_C)) | C_D B_B | C_E (B_D Bool B_C)
data B_C = C_F B_B B_B | C_G B_C B_B | C_H ((Char,Char)) B_B | C_I (B_A B_B B_B) | C_J

v_a :: B_D Int B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_L -> 0 
  C_M (C_A _) -> 1 
  C_M (C_B) -> 2 
