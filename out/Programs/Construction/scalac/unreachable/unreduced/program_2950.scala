package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Char, Int], Int], T_A[Int, Char]]
case class CC_B(a: T_A[T_A[Boolean, Boolean], Char], b: CC_A[CC_A[Boolean]], c: CC_A[T_A[Boolean, Byte]]) extends T_A[T_A[T_A[Char, Int], Int], T_A[Int, Char]]
case class CC_C() extends T_A[T_A[T_A[Char, Int], Int], T_A[Int, Char]]

val v_a: T_A[T_A[T_A[Char, Int], Int], T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_C() => 2 
}
}