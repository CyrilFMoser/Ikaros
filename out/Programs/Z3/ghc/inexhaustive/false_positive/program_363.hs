module Program_19 () where 

 main = print $ show v_b
data B_A a b = C_A Char | C_B | C_C
data B_B c = C_D ((Bool,Bool)) | C_E c Bool | C_F

v_a :: B_A Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
