package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, (T_B,Byte)]
case class CC_B() extends T_A[(T_B,T_B), (T_B,Byte)]
case class CC_C[D](a: CC_A[D], b: (CC_B,T_B)) extends T_A[D, (T_B,Byte)]
case class CC_D(a: T_B, b: T_A[CC_B, CC_B]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[Int, (T_B,Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, (_,CC_E())) => 1 
  case CC_C(_, (_,CC_D(CC_E(), _))) => 2 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean Boolean))