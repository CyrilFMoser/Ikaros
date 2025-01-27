package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[CC_A, T_A], b: T_B[T_A, T_B[CC_A, CC_A]]) extends T_A
case class CC_C[C](a: C) extends T_B[C, CC_B]
case class CC_D[D](a: T_B[CC_C[CC_A], CC_B], b: CC_B) extends T_B[D, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_B(_, _)) => 2 
  case CC_B(_, _) => 3 
}
}