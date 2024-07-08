module Program_5 () where 

 main = print $ show v_b
data B_B a = C_C B_A (((Bool,Char),B_A)) | C_D (((Char,Bool),B_A)) | C_E
data B_A = C_A (B_B Int) | C_B

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
