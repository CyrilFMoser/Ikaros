package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: C, b: T_A, c: (Int,Byte)) extends T_B[C, Boolean]
case class CC_C[D](a: Byte) extends T_B[D, Boolean]
case class CC_D[E](a: CC_C[E], b: E, c: T_B[E, E]) extends T_B[E, Boolean]

val v_a: T_B[T_A, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D(CC_C(_), CC_A(), _) => 1 
}
}
// This is not matched: CC_C(_)