package Program_15 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A, c: T_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
}
}
// This is not matched: (CC_D (CC_B (CC_A (Tuple Byte Boolean) (T_A (Tuple Byte Boolean)))
//            Wildcard
//            (T_A Int))
//      (T_B (T_A Int)))