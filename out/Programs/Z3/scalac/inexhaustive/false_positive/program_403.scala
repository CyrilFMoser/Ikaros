package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,(Char,Byte)), b: T_A[C, C]) extends T_A[T_B, C]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B, CC_D] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(),_), _) => 0 
}
}
// This is not matched: (CC_A Int Int (T_A Int Int))