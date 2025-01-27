package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Char, c: T_A[T_A[T_B]]) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_C(a: CC_A, b: CC_B) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_D(a: CC_C, b: (Int,Int)) extends T_B
case class CC_E(a: CC_B, b: CC_A) extends T_B
case class CC_F(a: T_B, b: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_B(_), CC_A(CC_D(_, _), _, _)) => 1 
  case CC_E(CC_B(_), CC_A(CC_E(_, _), _, _)) => 2 
  case CC_E(CC_B(_), CC_A(CC_F(_, _), _, _)) => 3 
  case CC_F(_, CC_A(CC_D(_, _), _, _)) => 4 
  case CC_F(_, CC_A(CC_E(_, _), _, _)) => 5 
}
}
// This is not matched: CC_F(_, CC_A(CC_F(_, _), _, _))