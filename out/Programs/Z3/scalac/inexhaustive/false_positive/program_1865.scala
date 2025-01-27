package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Byte,Boolean), b: T_B[T_A, Byte]) extends T_A
case class CC_B[C]() extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((0,_), _) => 0 
}
}
// This is not matched: (CC_B Int Byte (T_A Int Byte))