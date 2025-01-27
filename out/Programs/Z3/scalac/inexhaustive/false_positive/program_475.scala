package Program_31 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: Boolean, b: T_A[(Boolean,Byte), E]) extends T_A[C, D]
case class CC_B[G, F](a: G, b: G) extends T_A[F, G]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(12, 12) => 0 
  case CC_B(_, _) => 1 
  case CC_B(_, 12) => 2 
  case CC_B(12, _) => 3 
  case CC_A(_, CC_A(_, _)) => 4 
  case CC_A(_, CC_B(_, _)) => 5 
}
}
// This is not matched: (CC_A Int Int Boolean Wildcard Wildcard (T_A Int Int))
// This is not matched: (CC_A T_A)