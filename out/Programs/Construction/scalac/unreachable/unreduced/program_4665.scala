package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (T_B[Boolean],T_B[(Char,Byte)])) extends T_A[Boolean, T_B[T_A[Boolean, Int]]]
case class CC_B(a: CC_A, b: (Byte,T_B[Boolean])) extends T_A[Boolean, T_B[T_A[Boolean, Int]]]
case class CC_C(a: T_A[CC_A, T_A[(Byte,Byte), Boolean]]) extends T_A[Boolean, T_B[T_A[Boolean, Int]]]

val v_a: T_A[Boolean, T_B[T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _)