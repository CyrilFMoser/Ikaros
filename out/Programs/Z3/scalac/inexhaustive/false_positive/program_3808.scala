package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Boolean,Byte)) extends T_A[T_A[Int]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_E (CC_A T_B Wildcard (T_A T_B)) T_B)