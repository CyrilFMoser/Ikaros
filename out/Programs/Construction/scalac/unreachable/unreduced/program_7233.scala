package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[(Char,T_A[Byte])]
case class CC_B(a: CC_A[CC_A[Byte]], b: T_A[T_A[Boolean]], c: CC_A[Char]) extends T_A[(Char,T_A[Byte])]
case class CC_C(a: Byte, b: CC_A[(Byte,CC_B)]) extends T_A[(Char,T_A[Byte])]

val v_a: T_A[(Char,T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, CC_A(_)) => 1 
  case CC_C(0, _) => 2 
  case CC_C(_, _) => 3 
}
}