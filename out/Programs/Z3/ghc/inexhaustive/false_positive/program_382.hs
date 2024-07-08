module Program_8 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (((Bool,Int),Bool)) | C_C (B_A b b) (B_A b b) | C_D

v_a :: B_A Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_D) (C_C _ _) -> 0 
  C_C (C_C (C_C _ _) _) (C_C (C_D) (C_C _ _)) -> 1 
  C_C (C_C (C_A) (C_B _)) (C_C _ _) -> 2 
