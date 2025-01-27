package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,Byte)) extends T_A[(Char,Char)]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_C (T_A (Tuple Byte Boolean)) (T_A (T_A (Tuple Byte Boolean))))