package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[C, Char]
case class CC_B(a: T_A[CC_A[Boolean], T_A[Byte, Char]], b: T_A[(Int,Int), Char]) extends T_A[T_A[T_A[Int, Boolean], Char], Char]
case class CC_C[D]() extends T_A[D, Char]

val v_a: T_A[T_A[T_A[Int, Boolean], Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_B(_, CC_C()) => 2 
  case CC_C() => 3 
}
}