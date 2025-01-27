package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Char], T_A[Byte, Int]]) extends T_A[T_A[Char, Int], Boolean]
case class CC_B() extends T_A[T_A[Char, Int], Boolean]
case class CC_C[C](a: CC_A, b: CC_A) extends T_A[T_A[Char, Int], Boolean]

val v_a: T_A[T_A[Char, Int], Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(_)) => 1 
}
}
// This is not matched: CC_A(_)