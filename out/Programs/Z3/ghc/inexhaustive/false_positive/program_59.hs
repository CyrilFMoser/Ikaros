module Program_5 () where 

 main = print $ show v_b
data B_B = C_D | C_E (B_A B_B B_B) Char | C_F B_B | C_G
data B_A a b = C_A Bool Bool | C_B Int ((Bool,Int)) | C_C Bool Int

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_B _ _) _ -> 0 
