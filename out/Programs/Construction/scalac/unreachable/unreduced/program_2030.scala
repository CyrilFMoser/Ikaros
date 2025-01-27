package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char, b: T_B[T_A[Byte], T_B[Char, Char]], c: T_A[Char]) extends T_A[T_B[Char, T_B[Boolean, Boolean]]]
case class CC_B[D](a: CC_A) extends T_B[D, Boolean]
case class CC_C[E](a: T_B[E, Boolean], b: (CC_B[CC_A],Char)) extends T_B[E, Boolean]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C(_, _) => 1 
}
}