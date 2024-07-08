module Program_16 () where 

 main = print $ show v_b
data B_B = C_C
data B_C a b = C_D B_B | C_E b (B_C a a) | C_F B_B (B_C b B_A) | C_G | C_H b
data B_A = C_A B_B B_B | C_B B_B (B_C B_A ((Char,Bool)))

v_a :: B_C Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ -> 0 
  C_E _ (C_D _) -> 1 
  C_E _ (C_E _ (C_E _ _)) -> 2 
  C_E _ (C_E _ (C_F _ _)) -> 3 
  C_E _ (C_E _ (C_G)) -> 4 
  C_E _ (C_E _ (C_H _)) -> 5 
  C_E _ (C_F _ _) -> 6 
  C_E _ (C_G) -> 7 
  C_E _ (C_H _) -> 8 
  C_F C_C _ -> 9 
  C_G -> 10 
  C_H _ -> 11 
