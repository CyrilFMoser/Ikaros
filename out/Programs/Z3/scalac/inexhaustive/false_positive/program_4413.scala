package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B() extends T_B
case class CC_C(a: CC_A[(Int,Boolean)], b: (CC_B,T_B), c: T_B) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
}
}
// This is not matched: (CC_B T_A)