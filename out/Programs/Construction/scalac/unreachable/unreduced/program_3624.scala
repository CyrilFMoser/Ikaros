package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_B[T_B[T_A, Boolean], T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: C) extends T_A
case class CC_D[D](a: (CC_C[CC_B],CC_B), b: T_A) extends T_B[D, CC_C[D]]
case class CC_E[E](a: ((Boolean,Int),CC_D[CC_B]), b: T_A) extends T_B[E, CC_C[E]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_)