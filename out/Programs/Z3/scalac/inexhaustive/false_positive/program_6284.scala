package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_E (T_B (T_A (Tuple Byte Char) Int) (Tuple Boolean Int))
//      (CC_D (Tuple Boolean Int)
//            (T_A (Tuple Byte Char) Int)
//            Wildcard
//            Wildcard
//            Wildcard
//            (T_B (T_A (Tuple Byte Char) Int) (Tuple Boolean Int)))
//      (T_B (T_B (T_A (Tuple Byte Char) Int) (Tuple Boolean Int))
//           (Tuple Boolean Int)))