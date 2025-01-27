package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[G](a: (Char,Byte)) extends T_A[T_B[G], G]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: (CC_C (T_A (T_B Boolean Byte)))