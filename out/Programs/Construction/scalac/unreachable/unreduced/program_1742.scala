package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Char, b: E) extends T_A[T_B[T_B[Int, Byte], T_B[Int, Int]], E]
case class CC_B[F, G]() extends T_B[F, G]
case class CC_C(a: CC_B[Char, T_B[Int, (Char,Boolean)]], b: T_A[CC_B[Char, Boolean], Byte], c: T_A[T_A[(Boolean,Byte), Char], T_B[Int, Char]]) extends T_B[CC_A[T_B[Boolean, Char]], T_A[T_A[Byte, Char], CC_A[(Byte,Byte)]]]

val v_a: T_B[CC_A[T_B[Boolean, Char]], T_A[T_A[Byte, Char], CC_A[(Byte,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}