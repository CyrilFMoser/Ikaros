module Program_20 () where 

 main = print $ show v_b
data B_B b c = C_E (B_C b) | C_F
data B_A a = C_A (B_C a) ((Bool,Int)) | C_B Char (B_B a ((Char,Int))) | C_C Bool | C_D
data B_C d = C_G Int (B_B d Char)

v_a :: B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ _ -> 0 
