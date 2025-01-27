package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B(a: T_A[T_B[Int], T_B[Int]], b: T_B[(Char,Int)]) extends T_B[CC_A[T_B[Char], CC_A[Boolean, Boolean]]]
case class CC_C() extends T_B[CC_A[T_B[Char], CC_A[Boolean, Boolean]]]

val v_a: T_B[CC_A[T_B[Char], CC_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}