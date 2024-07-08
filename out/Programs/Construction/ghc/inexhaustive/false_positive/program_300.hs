module Program_2 () where 

 main = print $ show v_b
data B_A = C_A
data B_D c = C_H Int | C_I | C_J (B_B c c) B_C
data B_C = C_D (B_D B_C) (B_D B_A) | C_E B_A B_C | C_F Bool (B_B B_A B_C) | C_G Char
data B_B a b = C_B B_A | C_C ((B_A,B_A)) Char

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ _ -> 0 
  C_F True _ -> 1 
  C_F False _ -> 2 
  C_G _ -> 3 
