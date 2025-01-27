package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A], b: Char) extends T_A
case class CC_B[C](a: Char) extends T_B[C, T_B[T_B[CC_A, Char], T_A]]
case class CC_C[D]() extends T_B[D, T_B[T_B[CC_A, Char], T_A]]
case class CC_D[E](a: T_A) extends T_B[E, T_B[T_B[CC_A, Char], T_A]]

val v_a: T_B[CC_A, T_B[T_B[CC_A, Char], T_A]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, _)) => 1 
}
}
// This is not matched: CC_B(_)