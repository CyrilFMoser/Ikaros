package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D, E](a: T_A[E], b: T_B[E], c: T_A[E]) extends T_A[D]
case class CC_C(a: (Byte,T_A[Boolean]), b: T_A[CC_A[(Byte,Boolean)]]) extends T_B[T_A[CC_B[Char, Byte]]]
case class CC_D(a: ((Byte,CC_C),CC_A[CC_C]), b: T_B[T_A[Char]], c: Boolean) extends T_B[T_B[CC_C]]
case class CC_E(a: T_B[T_B[CC_C]], b: CC_B[Byte, CC_C], c: CC_D) extends T_B[T_A[CC_B[Char, Byte]]]

val v_a: T_B[T_A[CC_B[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, _, _)) => 0 
  case CC_E(CC_D(_, _, _), _, CC_D((_,_), _, _)) => 1 
}
}
// This is not matched: CC_C(_, CC_A())