package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: T_B[C, T_A], b: C, c: T_B[C, C]) extends T_B[C, T_A]
case class CC_C(a: CC_A) extends T_B[T_B[T_B[CC_A, T_A], T_A], T_A]
case class CC_D[D]() extends T_B[D, T_A]

val v_a: T_B[Char, T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_B(CC_D(), _, _)