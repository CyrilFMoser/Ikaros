package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[B](a: T_A, b: T_A) extends T_B[B]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A Int Int) (T_A Boolean (Tuple Char Char))))