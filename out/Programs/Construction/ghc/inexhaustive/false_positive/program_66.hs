module Program_10 () where 

 main = print $ show v_b
data B_B a b = C_D B_A b | C_E (B_B b b) | C_F B_A b | C_G ((Bool,Char)) | C_H (B_B a a)
data B_A = C_A Bool B_A | C_B B_A B_A | C_C (B_B B_A B_A) (B_B Bool ((Int,Char)))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B _ _ -> 1 
  C_C (C_D _ (C_A _ _)) _ -> 2 
  C_C (C_D _ (C_B _ _)) _ -> 3 
  C_C (C_D _ (C_C _ _)) _ -> 4 
  C_C (C_E (C_D _ _)) _ -> 5 
  C_C (C_E (C_E _)) _ -> 6 
  C_C (C_E (C_G _)) _ -> 7 
  C_C (C_E (C_H _)) _ -> 8 
  C_C (C_F _ _) _ -> 9 
  C_C (C_G _) _ -> 10 
  C_C (C_H _) _ -> 11 
