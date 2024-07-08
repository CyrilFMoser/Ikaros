module Program_14 () where 

 main = print $ show v_b
data B_C = C_J (B_B B_C) (B_B B_C) | C_K | C_L | C_M (B_B B_C) (B_A B_C) | C_N
data B_A a = C_A (B_B a) ((B_C,B_C)) | C_B | C_C | C_D a (B_A B_C) | C_E
data B_B b = C_F Bool | C_G Bool (B_B b) | C_H Char (B_A b) | C_I ((B_C,B_C))

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
  C_C -> 2 
  C_D _ (C_A _ _) -> 3 
  C_D _ (C_B) -> 4 
  C_D _ (C_C) -> 5 
  C_D _ (C_D _ _) -> 6 
  C_E -> 7 
