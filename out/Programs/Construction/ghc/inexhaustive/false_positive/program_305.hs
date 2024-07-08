module Program_24 () where 

 main = print $ show v_b
data B_A = C_A B_A B_A | C_B Char (((Bool,Int),(Bool,Int)))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
