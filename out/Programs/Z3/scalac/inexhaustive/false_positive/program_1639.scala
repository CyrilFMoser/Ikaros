package Program_30 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Boolean,Byte), Boolean], b: (Boolean,Int)) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C[D, E](a: D) extends T_B[D, E]
case class CC_D[F, G, H](a: (CC_B,CC_A), b: T_A[Byte]) extends T_B[G, F]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, CC_B()) => 1 
  case CC_D((CC_B(),CC_A(_, _)), _) => 2 
  case CC_D((CC_B(),CC_A(_, _)), CC_B()) => 3 
}
}
// This is not matched: (CC_D Char
//      Boolean
//      Boolean
//      Wildcard
//      (CC_A (CC_D Boolean
//                  (Tuple Boolean Byte)
//                  Boolean
//                  Wildcard
//                  Wildcard
//                  (T_B (Tuple Boolean Byte) Boolean))
//            Wildcard
//            (T_A Byte))
//      (T_B Boolean Char))
// This is not matched: (CC_C Int Wildcard Wildcard (T_A (T_A (Tuple Boolean Int))))