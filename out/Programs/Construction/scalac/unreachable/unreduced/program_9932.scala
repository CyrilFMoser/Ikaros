package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[T_A[Int, D], D], b: E, c: T_A[D, Boolean]) extends T_A[D, E]
case class CC_B(a: (Int,Char), b: T_A[(Boolean,Boolean), T_A[Boolean, Boolean]]) extends T_B[CC_A[T_A[Byte, (Char,Boolean)], T_B[Boolean]]]
case class CC_C(a: T_A[T_B[Byte], T_B[CC_B]], b: T_A[T_A[Char, CC_B], CC_A[CC_B, Byte]], c: T_A[T_B[CC_B], CC_A[(Boolean,Int), CC_B]]) extends T_B[CC_A[T_A[Byte, (Char,Boolean)], T_B[Boolean]]]
case class CC_D() extends T_B[CC_A[T_A[Byte, (Char,Boolean)], T_B[Boolean]]]

val v_a: T_B[CC_A[T_A[Byte, (Char,Boolean)], T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B((12,_), _) => 0 
  case CC_C(CC_A(_, _, _), CC_A(_, _, CC_A(_, _, _)), _) => 1 
  case CC_D() => 2 
}
}
// This is not matched: CC_B((_,_), _)