package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C(a: T_A[T_A[Char]]) extends T_A[CC_B[T_A[Int]]]
case class CC_D(a: (CC_B[CC_C],T_A[(Int,Char)])) extends T_B[T_A[(CC_C,CC_C)], T_B[T_B[CC_C, CC_C], CC_A[Byte]]]
case class CC_E(a: T_A[T_A[Byte]], b: T_A[T_A[Int]], c: T_A[CC_D]) extends T_B[T_A[(CC_C,CC_C)], T_B[T_B[CC_C, CC_C], CC_A[Byte]]]
case class CC_F(a: ((CC_D,CC_C),T_A[CC_D]), b: CC_D) extends T_B[T_A[(CC_C,CC_C)], T_B[T_B[CC_C, CC_C], CC_A[Byte]]]

val v_a: T_B[T_A[(CC_C,CC_C)], T_B[T_B[CC_C, CC_C], CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_D((CC_B(_),CC_A(_, _))) => 0 
  case CC_D((CC_B(_),CC_B(_))) => 1 
  case CC_E(_, _, CC_A(CC_D(_), _)) => 2 
  case CC_E(_, _, CC_B(CC_B(_))) => 3 
  case CC_F(((_,_),CC_A(_, _)), CC_D((_,_))) => 4 
  case CC_F(((_,_),CC_B(_)), CC_D((_,_))) => 5 
}
}
// This is not matched: CC_E(_, _, CC_B(CC_A(_, _)))