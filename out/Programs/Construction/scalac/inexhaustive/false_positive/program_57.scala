package Program_63 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[E, D](a: T_A[D, E], b: (T_A[Boolean, Byte],T_B[Boolean])) extends T_A[D, E]
case class CC_B[F, G]() extends T_A[F, G]

val v_a: CC_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_B(),_)) => 0 
}
}
// This is not matched: CC_A(_, _)