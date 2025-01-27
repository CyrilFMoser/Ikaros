package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (Byte,(Int,Byte)), b: T_A[Byte]) extends T_A[T_B[Byte]]

val v_a: T_A[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A((0,_), _) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)