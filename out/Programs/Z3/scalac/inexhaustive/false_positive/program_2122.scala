package Program_31 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D) extends T_A[D]
case class CC_B[E, F](a: Int, b: (Int,(Byte,Char)), c: F) extends T_A[E]
case class CC_C[G](a: Char) extends T_A[G]
case class CC_D[H, I]() extends T_B[H, T_A[Int]]
case class CC_E[J](a: CC_B[J, Int], b: J) extends T_B[J, T_A[Int]]

val v_a: T_B[Int, T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _) => 1 
  case CC_E(CC_B(_, _, _), 12) => 2 
}
}
// This is not matched: (CC_D Int Boolean (T_B Int (T_A Int)))
// This is not matched: Pattern match is empty without constants