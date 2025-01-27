package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: (T_A[T_B, T_B],T_B), c: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: CC_A[D], b: T_A[T_A[Char, D], D]) extends T_A[T_A[Byte, CC_A[Char]], D]
case class CC_C() extends T_B
case class CC_D(a: CC_B[CC_A[Boolean]], b: CC_C, c: CC_A[Boolean]) extends T_B
case class CC_E(a: CC_C, b: T_A[CC_A[T_B], T_A[CC_A[T_B], CC_A[T_B]]], c: (CC_D,(CC_C,CC_D))) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_A(_, _, _), _), _, CC_A(_, _, _)) => 0 
  case CC_E(CC_C(), _, (CC_D(_, _, _),(_,_))) => 1 
}
}
// This is not matched: CC_C()