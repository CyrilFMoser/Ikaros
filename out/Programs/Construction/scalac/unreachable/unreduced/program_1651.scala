package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C]) extends T_A[T_A[T_A[Int, Boolean], T_A[Boolean, Int]], T_A[T_A[Int, Boolean], (Char,Boolean)]]
case class CC_B(a: CC_A[T_A[Char, Boolean]]) extends T_A[T_A[T_A[Int, Boolean], T_A[Boolean, Int]], T_A[T_A[Int, Boolean], (Char,Boolean)]]
case class CC_C() extends T_A[T_A[T_A[Int, Boolean], T_A[Boolean, Int]], T_A[T_A[Int, Boolean], (Char,Boolean)]]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Boolean, Int]], T_A[T_A[Int, Boolean], (Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_C() => 2 
}
}