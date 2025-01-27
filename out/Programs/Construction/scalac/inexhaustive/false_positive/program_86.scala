package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Char, b: Int, c: T_A[D, C]) extends T_A[D, C]
case class CC_C[H, G]() extends T_A[G, H]

val v_a: CC_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: CC_C(_, CC_B(_), CC_A(CC_D(_, _, _)))