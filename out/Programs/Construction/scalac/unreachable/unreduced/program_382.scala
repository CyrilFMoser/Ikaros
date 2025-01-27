package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Boolean, (Int,(Int,Char))], b: T_B[T_A[Boolean], T_A[Int]], c: (T_B[Int, Int],Char)) extends T_A[T_B[T_B[Byte, Byte], T_A[Int]]]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: Char, b: CC_A, c: T_A[E]) extends T_B[E, CC_A]
case class CC_D() extends T_B[Char, CC_A]
case class CC_E(a: T_A[T_A[Char]], b: CC_D, c: Boolean) extends T_B[T_B[Int, CC_A], CC_A]

val v_a: T_B[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, _), CC_B()) => 0 
  case CC_D() => 1 
}
}