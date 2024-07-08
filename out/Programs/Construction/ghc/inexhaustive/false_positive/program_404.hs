module Program_27 () where 

 main = print $ show v_b
data B_A = C_A B_B Int | C_B | C_C B_B Char
data B_B = C_D B_B B_A | C_E | C_F B_B | C_G Int Char | C_H Int

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
  C_C (C_D _ _) _ -> 2 
  C_C C_E _ -> 3 
  C_C (C_F C_E) _ -> 4 
  C_C (C_F (C_F _)) _ -> 5 
  C_C (C_F (C_G _ _)) _ -> 6 
  C_C (C_F (C_H _)) _ -> 7 
  C_C (C_G _ _) _ -> 8 
  C_C (C_H _) _ -> 9 
