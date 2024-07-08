module Program_23 () where 

 main = print $ show v_b
data B_A a = C_A (B_A Bool) ((Char,Int)) | C_B (B_A a) | C_C ((Bool,(Int,Int))) a

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_C ((_,(_,_))) _ -> 1 
