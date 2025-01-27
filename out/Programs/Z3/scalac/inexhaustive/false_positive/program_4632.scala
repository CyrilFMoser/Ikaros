package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_B(a: Int) extends T_A[T_B[Char, Boolean]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Int
//      (T_A Boolean Char)
//      (CC_A (CC_B Char
//                  Boolean
//                  (CC_A (CC_B Char Boolean Wildcard (T_A Char Boolean))
//                        Wildcard
//                        (T_A Int (T_A Boolean Char)))
//                  (T_A Char Boolean))
//            Wildcard
//            (T_A Int (T_A Boolean Char)))
//      (T_A Int (T_A Boolean Char)))