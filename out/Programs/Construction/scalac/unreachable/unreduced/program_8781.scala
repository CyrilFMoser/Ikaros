package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Char, Char], T_A[Int, Int]], T_A[T_A[Char, Boolean], Byte]]
case class CC_B(a: CC_A, b: T_A[(CC_A,Int), T_A[CC_A, CC_A]]) extends T_A[T_A[T_A[Char, Char], T_A[Int, Int]], T_A[T_A[Char, Boolean], Byte]]
case class CC_C() extends T_A[T_A[T_A[Char, Char], T_A[Int, Int]], T_A[T_A[Char, Boolean], Byte]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Int, Int]], T_A[T_A[Char, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_C() => 2 
}
}