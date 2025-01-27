package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[T_A[T_B[Boolean]]], b: T_B[T_A[C]], c: T_A[C]) extends T_A[C]
case class CC_B[E, F]() extends T_A[E]
case class CC_C(a: Char, b: Byte, c: CC_A[T_A[Int]]) extends T_B[CC_B[CC_B[(Byte,Int), Boolean], T_A[Int]]]
case class CC_D(a: CC_B[CC_C, CC_B[CC_C, CC_C]]) extends T_B[CC_B[CC_B[(Byte,Int), Boolean], T_A[Int]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_B(), _, CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), _, CC_B()) => 2 
  case CC_A(CC_B(), _, CC_B()) => 3 
  case CC_B() => 4 
}
}