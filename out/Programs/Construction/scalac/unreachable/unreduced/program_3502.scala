package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_A[(Int,Char), Char], (Char,Boolean)], (T_B[Boolean, Char],T_A[Boolean, Boolean])]
case class CC_B(a: T_A[(CC_A,CC_A), T_B[CC_A, Char]]) extends T_A[T_B[T_A[(Int,Char), Char], (Char,Boolean)], (T_B[Boolean, Char],T_A[Boolean, Boolean])]
case class CC_C[E](a: T_B[E, E]) extends T_A[T_A[T_B[CC_B, CC_A], Byte], E]
case class CC_D(a: Byte, b: CC_B) extends T_B[T_B[CC_A, CC_A], CC_A]

val v_a: T_A[T_B[T_A[(Int,Char), Char], (Char,Boolean)], (T_B[Boolean, Char],T_A[Boolean, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}