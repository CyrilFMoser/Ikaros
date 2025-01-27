package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_A[D, D]]
case class CC_B(a: CC_A[T_B[(Int,Int)]], b: T_A[CC_A[Boolean], CC_A[Boolean]], c: T_A[(Char,Byte), T_A[Char, Boolean]]) extends T_B[CC_A[T_B[Int]]]
case class CC_C[E](a: Byte, b: (CC_B,T_A[CC_B, (Int,Char)]), c: CC_B) extends T_B[E]
case class CC_D() extends T_B[CC_A[T_B[Int]]]

val v_a: T_B[CC_A[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_D()