module Program_6 () where 

 main = print $ show v_b
data B_A = C_A B_D | C_B
data B_C a b = C_H | C_I | C_J (B_C a a) | C_K | C_L (B_C b B_A) B_D
data B_D = C_M | C_N B_B Char | C_O | C_P (B_C ((Char,Char)) Bool)
data B_B = C_C | C_D ((B_B,B_B)) (B_C B_D B_D) | C_E B_B | C_F B_B | C_G B_A

v_a :: B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_M -> 0 
  C_N _ 'x' -> 1 
  C_N _ _ -> 2 
  C_O -> 3 
  C_P (C_I) -> 4 
  C_P (C_J _) -> 5 
  C_P (C_K) -> 6 
  C_P (C_L _ _) -> 7 
