package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, Boolean]
case class CC_B(a: (T_A[Int, Boolean],CC_A[Int]), b: T_A[Byte, Boolean], c: T_A[T_A[Char, Char], Boolean]) extends T_A[Int, Boolean]

val v_a: CC_A[T_A[Int, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(12)) => 0 
  case CC_A(CC_A(_)) => 1 
  case CC_A(CC_B(_, _, CC_A(_))) => 2 
}
}