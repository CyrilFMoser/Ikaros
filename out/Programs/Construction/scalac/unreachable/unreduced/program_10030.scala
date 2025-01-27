package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], (Int,T_A)]) extends T_A
case class CC_B(a: T_A, b: T_B[CC_A, Char]) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: C) extends T_B[C, CC_C]
case class CC_E[D](a: CC_A, b: (CC_A,CC_B), c: CC_B) extends T_B[(CC_A,(CC_A,CC_B)), D]
case class CC_F[E](a: T_B[E, E], b: (T_B[CC_C, T_A],CC_D[Byte]), c: E) extends T_B[E, Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_B(CC_B(CC_A(_), _), _) => 2 
  case CC_B(CC_B(CC_B(_, _), _), _) => 3 
  case CC_B(CC_C(), _) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_B(CC_B(CC_C(), _), _)