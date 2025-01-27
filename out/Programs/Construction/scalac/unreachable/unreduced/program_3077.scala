package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char, b: T_B[T_B[Int, Byte], T_A[Char]], c: T_A[T_A[(Boolean,Byte)]]) extends T_A[T_B[T_B[Byte, Boolean], T_B[Boolean, Boolean]]]
case class CC_B[D](a: Boolean) extends T_B[D, T_B[D, D]]
case class CC_C[E](a: CC_A) extends T_B[E, T_B[E, E]]

val v_a: T_B[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(_, _, _)) => 1 
}
}