package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Byte)) extends T_A[C, T_A[(Char,Byte), (Char,Byte)]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_B (T_A (CC_A (Tuple Boolean Char) Boolean Boolean)))