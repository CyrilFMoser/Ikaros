package Program_30 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: (T_A[Char],((Boolean,Char),Boolean))) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C(a: T_A[CC_B[Byte]]) extends T_A[(Byte,CC_B[Byte])]
case class CC_D[F]() extends T_B[(CC_C,Byte), T_A[T_A[CC_C]]]
case class CC_E[G](a: CC_A[G], b: Byte, c: CC_B[G]) extends T_B[(CC_C,Byte), T_A[T_A[CC_C]]]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_B(_),(_,_))) => 0 
}
}
// This is not matched: CC_A(_, (CC_A(_, _),(_,_)))
// This is not matched: CC_A(CC_C(_, _, _), CC_B(_, _))