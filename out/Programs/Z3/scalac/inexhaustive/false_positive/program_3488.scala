package Program_14 

object Test {
sealed trait T_B[C]
case class CC_B[E](a: Byte, b: T_B[E]) extends T_B[E]
case class CC_C[F]() extends T_B[F]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C()) => 0 
}
}
// This is not matched: (CC_C Int Int Int Int (T_A Int Int))