module Program_0 () where 

 main = print $ show v_b
data B_A a = C_A Bool a
data B_B b = C_B ((Bool,Bool)) | C_C (B_B b)

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C _) -> 0 
  C_C (C_C (C_B _)) -> 1 
