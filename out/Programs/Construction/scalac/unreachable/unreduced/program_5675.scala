package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[T_A[T_A[Byte, Int], Char], C]
case class CC_B() extends T_A[T_A[T_A[Byte, Int], Char], (T_A[Char, Char],T_A[Int, Boolean])]
case class CC_C(a: T_A[CC_A[CC_B], Char], b: CC_A[CC_B]) extends T_A[T_A[T_A[Byte, Int], Char], (T_A[Char, Char],T_A[Int, Boolean])]

val v_a: T_A[T_A[T_A[Byte, Int], Char], (T_A[Char, Char],T_A[Int, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_)) => 2 
}
}