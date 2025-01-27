package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Byte, Boolean]]) extends T_A[Byte, T_A[(Int,Boolean), T_A[Boolean, Byte]]]
case class CC_B() extends T_A[Byte, T_A[(Int,Boolean), T_A[Boolean, Byte]]]
case class CC_C(a: T_A[(CC_A,CC_B), (CC_B,(Int,Int))], b: T_A[(Int,CC_B), CC_B]) extends T_A[Byte, T_A[(Int,Boolean), T_A[Boolean, Byte]]]

val v_a: T_A[Byte, T_A[(Int,Boolean), T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()