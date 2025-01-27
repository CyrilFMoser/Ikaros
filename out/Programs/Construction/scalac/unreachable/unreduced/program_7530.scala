package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[T_B, T_B],((Int,Byte),T_B))) extends T_A[T_A[T_A[T_B, T_B], T_A[Int, (Byte,Char)]], C]
case class CC_B[D](a: T_B, b: T_B, c: T_B) extends T_A[T_A[T_A[T_B, T_B], T_A[Int, (Byte,Char)]], D]
case class CC_C[E](a: E) extends T_A[T_A[T_A[T_B, T_B], T_A[Int, (Byte,Char)]], E]
case class CC_D(a: T_B, b: T_A[CC_B[T_B], Boolean], c: Byte) extends T_B

val v_a: T_A[T_A[T_A[T_B, T_B], T_A[Int, (Byte,Char)]], CC_D] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D(CC_D(_, _, _), _, _), _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A((_,(_,_)))