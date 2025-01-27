package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, (T_A,Boolean)], b: T_B[T_B[T_A, (Byte,Int)], T_A]) extends T_A
case class CC_B(a: T_B[Int, (T_A,T_A)]) extends T_A
case class CC_C[C](a: T_A, b: CC_A, c: T_A) extends T_B[C, T_B[T_B[CC_B, CC_B], CC_B]]
case class CC_D(a: CC_B) extends T_B[CC_B, T_B[T_B[CC_B, CC_B], CC_B]]
case class CC_E[D](a: T_A, b: Int) extends T_B[D, T_B[T_B[CC_B, CC_B], CC_B]]

val v_a: T_B[CC_B, T_B[T_B[CC_B, CC_B], CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)) => 0 
  case CC_C(CC_A(_, _), CC_A(_, _), CC_B(_)) => 1 
  case CC_C(CC_B(_), CC_A(_, _), CC_B(_)) => 2 
  case CC_D(CC_B(_)) => 3 
  case CC_E(_, _) => 4 
}
}
// This is not matched: CC_C(CC_B(_), CC_A(_, _), CC_A(_, _))