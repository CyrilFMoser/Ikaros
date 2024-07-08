module Program_29 () where 

 main = print $ show v_b
data B_C = C_E | C_F ((B_A,Bool)) | C_G
data B_A = C_A | C_B B_A ((B_A,(Bool,Char)))
data B_B a b = C_C | C_D (B_B a a) (B_D b)
data B_D c = C_H Int | C_I (B_B c c)

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B C_A _ -> 1 
