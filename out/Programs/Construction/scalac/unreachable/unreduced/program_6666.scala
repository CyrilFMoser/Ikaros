package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Boolean], T_A[Boolean, Char]]) extends T_A[T_A[T_A[Char, Char], T_A[Char, Byte]], T_A[Char, Int]]
case class CC_B[C](a: CC_A, b: Int, c: CC_A) extends T_A[T_A[T_A[Char, Char], T_A[Char, Byte]], T_A[Char, Int]]
case class CC_C() extends T_A[T_A[T_A[Char, Char], T_A[Char, Byte]], T_A[Char, Int]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Char, Byte]], T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}