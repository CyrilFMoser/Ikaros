module Program_15 () where 

 main = print $ show v_b
data B_B b c = C_C | C_D | C_E (B_B b c) ((Bool,Int)) | C_F
data B_A a = C_A | C_B (B_A Int) (B_A a)

v_a :: B_B Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_D -> 1 
  C_F -> 2 
