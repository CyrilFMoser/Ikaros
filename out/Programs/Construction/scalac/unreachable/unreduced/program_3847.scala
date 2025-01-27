package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, Char]], b: T_A[C, C], c: Boolean) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Byte]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Byte]], D]
case class CC_C(a: CC_B[T_A[Int, Int]], b: CC_B[Boolean]) extends T_A[CC_A[Char], Boolean]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Char, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}