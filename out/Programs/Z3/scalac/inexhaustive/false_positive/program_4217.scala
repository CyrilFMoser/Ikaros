package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,Int)) extends T_A[T_A[Byte]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_A (CC_B T_B Wildcard (CC_E T_B) (T_A T_B)) (T_A (T_A (Tuple Byte Char))))