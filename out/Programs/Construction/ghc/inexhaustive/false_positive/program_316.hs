module Program_6 () where 

 main = print $ show v_b
data B_A a = C_A a (((Bool,Bool),Char)) | C_B a (B_B a a) | C_C | C_D a (B_A a)
data B_B b c = C_E Char Int
data B_C d = C_F (((Char,Bool),Char)) (B_C d) | C_G | C_H | C_I ((Bool,Char))

v_a :: B_C Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
  C_H -> 1 
  C_I _ -> 2 
