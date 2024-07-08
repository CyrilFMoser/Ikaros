module Program_30 () where 

main = print $ show v_b
data B_A a = C_A ((Char,Bool)) | C_B a

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
