module Program_29 () where 

 main = print $ show v_b
data B_A = C_A (B_B B_A) | C_B ((B_A,(Int,Bool)))
data B_B a = C_C | C_D a (((Int,Int),B_A)) | C_E Bool B_A | C_F B_A

v_a :: B_B Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_F (C_A (C_F _)) -> 1 
  C_E _ (C_A (C_D _ _)) -> 2 
  C_E _ (C_B _) -> 3 
  C_E _ (C_A (C_E _ _)) -> 4 
