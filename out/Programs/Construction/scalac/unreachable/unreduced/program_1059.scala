package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char, b: T_A[T_B[Byte, Boolean]], c: T_B[T_A[Boolean], T_A[Char]]) extends T_A[T_A[T_B[Boolean, Byte]]]
case class CC_B(a: (T_A[CC_A],T_B[CC_A, CC_A])) extends T_A[T_A[T_B[Boolean, Byte]]]
case class CC_C(a: T_B[CC_A, Char], b: T_B[CC_B, (CC_B,Int)]) extends T_A[T_A[T_B[Boolean, Byte]]]

val v_a: T_A[T_A[T_B[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _, _)