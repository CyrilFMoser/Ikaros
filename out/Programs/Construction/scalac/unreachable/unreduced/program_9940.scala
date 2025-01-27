package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Boolean], Int], b: T_A[T_A[Char, Int], T_A[Byte, Boolean]], c: (T_A[Boolean, Char],T_A[Boolean, Byte])) extends T_A[Char, T_A[T_A[Char, Boolean], Int]]
case class CC_B(a: CC_A, b: T_A[CC_A, CC_A]) extends T_A[Char, T_A[T_A[Char, Boolean], Int]]
case class CC_C() extends T_A[Char, T_A[T_A[Char, Boolean], Int]]

val v_a: T_A[Char, T_A[T_A[Char, Boolean], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_C() => 2 
}
}