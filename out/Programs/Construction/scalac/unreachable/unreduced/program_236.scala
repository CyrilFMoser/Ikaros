package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: Byte) extends T_A[C, T_A[T_A[Boolean, Boolean], T_A[Int, Boolean]]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_A[T_A[Boolean, Boolean], T_A[Int, Boolean]]]
case class CC_C() extends T_A[T_A[T_A[Int, Char], Char], T_A[T_A[Boolean, Boolean], T_A[Int, Boolean]]]

val v_a: T_A[T_A[T_A[Int, Char], Char], T_A[T_A[Boolean, Boolean], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 0) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(CC_A(_, _, _)) => 2 
  case CC_C() => 3 
}
}