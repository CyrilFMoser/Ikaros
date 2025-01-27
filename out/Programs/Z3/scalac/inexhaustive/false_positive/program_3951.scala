package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[F, E](a: T_A[F, E], b: (Byte,T_B)) extends T_A[E, F]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_B[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,CC_D())) => 0 
}
}
// This is not matched: (CC_C Char (T_A Char))