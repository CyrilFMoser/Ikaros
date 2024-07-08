module Program_16 () where 

 main = print $ show v_b
data B_B a b = C_F Bool | C_G (B_D a a) B_A | C_H (B_B b b) | C_I (B_B a b)
data B_C c = C_J (((Bool,Int),B_A))
data B_A = C_A (((Char,Int),B_A)) (B_C ((Bool,Int))) | C_B (B_B ((Char,Char)) B_A) | C_C (B_C B_A) | C_D | C_E (B_D B_A B_A)
data B_D d e = C_K | C_L | C_M

v_a :: B_C Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_J _ -> 0 
