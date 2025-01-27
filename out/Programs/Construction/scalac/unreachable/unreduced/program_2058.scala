package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: D, b: T_A[D, D], c: T_A[D, E]) extends T_A[D, E]
case class CC_B(a: T_B[CC_A[Boolean, Byte]], b: Byte) extends T_B[T_A[T_B[Boolean], T_B[Char]]]
case class CC_C(a: T_A[CC_A[CC_B, (Char,Byte)], CC_B], b: T_A[Int, Int]) extends T_B[T_A[T_B[Boolean], T_B[Char]]]

val v_a: T_B[T_A[T_B[Boolean], T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}