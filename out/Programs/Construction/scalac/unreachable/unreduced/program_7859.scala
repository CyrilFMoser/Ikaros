package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[T_A[Boolean, Boolean], (Char,Char)], Int]
case class CC_B[E]() extends T_A[T_A[T_A[Boolean, Boolean], (Char,Char)], Int]
case class CC_C(a: T_B[Int, Int], b: T_A[T_B[(Byte,Boolean), CC_A], CC_B[CC_A]], c: T_B[T_A[CC_A, (Char,Boolean)], CC_A]) extends T_A[T_A[T_A[Boolean, Boolean], (Char,Char)], Int]

val v_a: T_A[T_A[T_A[Boolean, Boolean], (Char,Char)], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B()