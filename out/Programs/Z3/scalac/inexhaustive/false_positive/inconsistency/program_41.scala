package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[F, E](a: T_B[E], b: F) extends T_A[F, E]
case class CC_B[G]() extends T_B[CC_A[G, G]]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_A Byte (CC_B Byte Boolean (T_A Byte)) (T_A Byte))