package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, E], E]
case class CC_B(a: CC_A[CC_A[(Char,Int)]], b: T_A[T_B[CC_A[Char], CC_A[Char]], CC_A[Char]], c: T_B[T_B[Byte, Boolean], CC_A[Char]]) extends T_B[T_A[T_B[Boolean, Boolean], Boolean], Char]
case class CC_C() extends T_B[T_A[T_B[Boolean, Boolean], Boolean], Char]
case class CC_D(a: Char, b: CC_A[Boolean], c: T_B[CC_A[Byte], Boolean]) extends T_B[T_A[T_B[Boolean, Boolean], Boolean], Char]

val v_a: T_B[T_A[T_B[Boolean, Boolean], Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_A(), _) => 0 
  case CC_C() => 1 
  case CC_D(_, CC_A(), _) => 2 
}
}