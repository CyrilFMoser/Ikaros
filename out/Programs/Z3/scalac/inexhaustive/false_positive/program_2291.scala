package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Byte,Boolean)) extends T_A[T_A[C, C], C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (0,_)) => 0 
}
}
// This is not matched: (CC_E T_A (CC_C T_A) Wildcard (CC_C T_A) (T_B T_A T_A))