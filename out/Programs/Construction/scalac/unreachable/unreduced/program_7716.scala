package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: T_A[T_A[Boolean]], c: (T_A[Char],T_A[Boolean])) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A, b: ((Char,CC_A),(CC_A,CC_A))) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_B, b: T_A[T_A[CC_A]], c: T_A[(CC_B,CC_B)]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, ((_,_),(_,_))) => 1 
}
}
// This is not matched: CC_C(_, _, _)