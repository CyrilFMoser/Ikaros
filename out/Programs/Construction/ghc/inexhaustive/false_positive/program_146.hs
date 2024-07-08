module Program_25 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B Int (((Bool,Bool),Bool)) | C_C b (B_A Int Int) | C_D | C_E (B_B a b) a
data B_B c d = C_F d Char | C_G (B_B c d) | C_H ((Bool,(Char,Int))) | C_I

v_a :: B_B Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G (C_F True _) -> 0 
  C_G (C_F False _) -> 1 
  C_G (C_G _) -> 2 
  C_G (C_H _) -> 3 
  C_G (C_I) -> 4 
  C_H _ -> 5 
  C_I -> 6 
