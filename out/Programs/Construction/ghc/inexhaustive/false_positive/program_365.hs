module Program_20 () where 

 main = print $ show v_b
data B_B a b = C_C (B_D b) | C_D Bool | C_E | C_F a | C_G B_A Bool
data B_C c = C_H c ((B_A,Bool)) | C_I | C_J Char ((B_A,Int))
data B_D d = C_K d
data B_A = C_A ((Char,Char)) B_A | C_B

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
