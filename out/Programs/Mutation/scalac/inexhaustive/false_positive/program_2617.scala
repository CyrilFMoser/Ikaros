package Program_9 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: (CC_B (T_A (T_A (Tuple Byte Boolean) (Tuple Byte Boolean)) (Tuple Byte Boolean))
//      (T_A (T_A (T_A (T_A (Tuple Byte Boolean) (Tuple Byte Boolean))
//                     (Tuple Byte Boolean))
//                (T_A (T_A (Tuple Byte Boolean) (Tuple Byte Boolean))
//                     (Tuple Byte Boolean)))
//           (T_A (T_A (Tuple Byte Boolean) (Tuple Byte Boolean))
//                (Tuple Byte Boolean))))