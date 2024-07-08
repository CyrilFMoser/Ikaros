module Program_25 () where 

 main = print $ show v_b
data B_A a b = C_A ((Bool,Char)) | C_B (B_A b b) (B_A b b)

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
