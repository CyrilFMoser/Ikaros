package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_A[Int, Boolean], T_A[Byte, Int]], b: T_A[T_B[(Int,Char)], Char]) extends T_A[T_B[T_B[Boolean]], T_A[Byte, T_A[Int, Boolean]]]
case class CC_B(a: CC_A, b: T_B[T_B[CC_A]], c: Boolean) extends T_A[T_B[T_B[Boolean]], T_A[Byte, T_A[Int, Boolean]]]
case class CC_C[D](a: Boolean, b: Boolean, c: CC_A) extends T_B[D]
case class CC_D() extends T_B[Char]

val v_a: T_A[T_B[T_B[Boolean]], T_A[Byte, T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_C(_, _, _), true) => 1 
  case CC_B(_, CC_C(_, _, _), false) => 2 
}
}