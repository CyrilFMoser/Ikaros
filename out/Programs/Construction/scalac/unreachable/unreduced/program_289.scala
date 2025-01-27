package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[T_A[Char, Boolean], Byte]]
case class CC_B(a: T_A[CC_A[Byte], CC_A[Char]]) extends T_A[CC_A[(Int,Boolean)], T_A[T_A[Char, Boolean], Byte]]
case class CC_C() extends T_A[CC_A[(Int,Boolean)], T_A[T_A[Char, Boolean], Byte]]

val v_a: T_A[CC_A[(Int,Boolean)], T_A[T_A[Char, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}