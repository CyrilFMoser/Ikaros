package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[E, F](a: Char, b: T_B[F]) extends T_A[E, F]
case class CC_E() extends T_B[(Int,Byte)]
case class CC_F() extends T_B[(Int,Byte)]

val v_a: T_A[CC_E, CC_F] = null
val v_b: Int = v_a match{
  case CC_B('x', _) => 0 
}
}
// This is not matched: (CC_C (CC_A Boolean (T_A Byte)) (T_A Byte))