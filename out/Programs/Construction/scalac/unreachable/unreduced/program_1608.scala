package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A]) extends T_A
case class CC_B(a: (T_B[T_A, CC_A],CC_A)) extends T_A
case class CC_C(a: CC_A, b: T_A) extends T_A
case class CC_D[C]() extends T_B[C, T_B[C, CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(_), CC_A(_)) => 1 
  case CC_C(CC_A(_), CC_B(_)) => 2 
  case CC_C(CC_A(_), CC_C(_, _)) => 3 
}
}
// This is not matched: CC_A(_)