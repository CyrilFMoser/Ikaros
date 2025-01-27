package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Boolean,T_A[Char])) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[T_A[Byte]], b: CC_A, c: (T_A[Char],Byte)) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: T_A[CC_A], b: (CC_A,CC_A), c: T_A[Char]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A((_,_)), (_,_)) => 1 
}
}
// This is not matched: CC_C(_, _, _)