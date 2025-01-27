package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte) extends T_A
case class CC_B(a: CC_A, b: T_A, c: T_B[Boolean, T_A]) extends T_A
case class CC_C[C](a: (CC_A,CC_B)) extends T_B[C, CC_B]
case class CC_D(a: T_A) extends T_B[Char, CC_B]
case class CC_E(a: Int) extends T_B[CC_C[T_A], CC_B]

val v_a: T_B[Char, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_B(CC_A(_), CC_A(_), _)) => 1 
  case CC_D(CC_B(CC_A(_), CC_B(_, _, _), _)) => 2 
}
}
// This is not matched: CC_D(CC_A(_))