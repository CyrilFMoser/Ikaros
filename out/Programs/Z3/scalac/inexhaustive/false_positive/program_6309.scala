package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char, b: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Int (T_A Int))