package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, Int]) extends T_A
case class CC_C[D, C]() extends T_B[C, D]
case class CC_D[E, F]() extends T_B[E, F]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D()) => 0 
}
}
// This is not matched: Pattern match is empty without constants