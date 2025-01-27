package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[F, E]() extends T_A[E, F]
case class CC_C(a: T_A[(T_B,T_B), CC_B[T_B, T_B]], b: T_B) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(CC_A(), _)) => 0 
}
}
// This is not matched: CC_B((_,CC_B(_)))