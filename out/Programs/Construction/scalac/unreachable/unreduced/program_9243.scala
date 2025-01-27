package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: CC_B[E], b: T_B[E]) extends T_A[E]
case class CC_D(a: (CC_B[Byte],T_A[Boolean]), b: T_A[T_A[Byte]], c: T_A[T_A[Byte]]) extends T_B[T_B[CC_A[Char]]]
case class CC_E(a: CC_C[CC_C[(Char,Int)]], b: T_A[T_A[CC_D]]) extends T_B[T_B[CC_A[Char]]]

val v_a: T_B[T_B[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_C(_, _), CC_B()) => 1 
  case CC_E(CC_C(_, _), CC_C(_, _)) => 2 
}
}
// This is not matched: CC_E(CC_C(_, _), CC_A())