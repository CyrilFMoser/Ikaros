package Program_31 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[Boolean]
case class CC_B[B](a: (T_B,T_B), b: Int, c: Int) extends T_A[B]
case class CC_C[C](a: T_A[C]) extends T_B
case class CC_D(a: CC_C[Byte], b: (T_B,CC_A)) extends T_B
case class CC_E(a: T_A[Byte], b: T_A[CC_D], c: (Boolean,T_B)) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(_, CC_B(_, _, _), (_,CC_E(_, _, _))) => 0 
  case CC_E(CC_B(_, _, _), CC_B(_, _, _), (_,CC_C(_))) => 1 
  case CC_E(CC_B(_, _, _), _, (_,CC_C(_))) => 2 
  case CC_E(_, _, (_,CC_D(_, _))) => 3 
}
}
// This is not matched: (CC_E Wildcard
//      (CC_B (CC_D T_B T_B T_B)
//            (Tuple Wildcard Wildcard)
//            Int
//            Wildcard
//            (T_A (CC_D T_B T_B T_B)))
//      (Tuple Wildcard (CC_C T_B Wildcard T_B))
//      T_B)
// This is not matched: (CC_A (Tuple (CC_A Wildcard (CC_C Wildcard Wildcard T_B) Wildcard T_A)
//             (CC_B Wildcard Wildcard Wildcard T_A))
//      Wildcard
//      Wildcard
//      T_A)