package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Int]
case class CC_C() extends T_B
case class CC_D(a: (CC_A,T_B)) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((_,CC_C())) => 0 
}
}
// This is not matched: (CC_D (Tuple Wildcard (CC_C T_B)) T_B)