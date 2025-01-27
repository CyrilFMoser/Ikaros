package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Byte)) extends T_A[T_A[C, C], C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_B (CC_A T_A) T_A)