package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, F]) extends T_A[E, F]
case class CC_B() extends T_B[T_A[T_B[Char, Boolean], T_A[Byte, (Char,Int)]], CC_A[Boolean, T_B[Int, Boolean]]]
case class CC_C(a: CC_B, b: CC_A[CC_A[CC_B, CC_B], Int]) extends T_B[T_A[T_B[Char, Boolean], T_A[Byte, (Char,Int)]], CC_A[Boolean, T_B[Int, Boolean]]]
case class CC_D(a: T_B[Boolean, CC_B], b: T_A[T_B[CC_C, Boolean], T_B[CC_B, CC_C]]) extends T_B[T_A[T_B[Char, Boolean], T_A[Byte, (Char,Int)]], CC_A[Boolean, T_B[Int, Boolean]]]

val v_a: T_B[T_A[T_B[Char, Boolean], T_A[Byte, (Char,Int)]], CC_A[Boolean, T_B[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), CC_A(_)) => 1 
  case CC_D(_, CC_A(_)) => 2 
}
}