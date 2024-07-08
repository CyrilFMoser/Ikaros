module Program_7 () where 

 main = print $ show v_b
data B_C a = C_H Bool | C_I ((B_A,(Bool,Bool))) | C_J a
data B_B = C_C (B_C B_B) ((Bool,B_B)) | C_D | C_E B_A | C_F (((Char,Bool),(Char,Int))) | C_G Bool ((Char,B_A))
data B_D b = C_K | C_L b | C_M b | C_N
data B_A = C_A | C_B

v_a :: B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_H _ -> 0 
  C_I ((C_A,(_,_))) -> 1 
  C_I ((C_B,(_,_))) -> 2 
  C_J _ -> 3 
