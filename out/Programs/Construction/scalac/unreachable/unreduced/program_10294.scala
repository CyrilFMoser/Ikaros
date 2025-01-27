package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[((Char,Char),T_A[Boolean, Boolean]), Int]
case class CC_B() extends T_A[((Char,Char),T_A[Boolean, Boolean]), Int]
case class CC_C(a: T_B[T_B[CC_B, Boolean], CC_A], b: T_B[T_A[CC_B, CC_A], T_A[CC_A, CC_B]]) extends T_A[((Char,Char),T_A[Boolean, Boolean]), Int]
case class CC_D[E]() extends T_B[Boolean, E]

val v_a: T_A[((Char,Char),T_A[Boolean, Boolean]), Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()