package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B[C](a: T_B, b: T_B, c: (T_B,T_B)) extends T_A[C]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, (_,CC_D())) => 0 
}
}
// This is not matched: (CC_B Char
//      (CC_E Wildcard (CC_A T_B Wildcard (T_A T_B)) T_B)
//      (CC_F T_B)
//      (Tuple (CC_F T_B)
//             (CC_D (CC_C T_B
//                         Wildcard
//                         (CC_B T_B (CC_F T_B) (CC_F T_B) Wildcard (T_A T_B))
//                         (T_A T_B))
//                   T_B))
//      (T_A Char))