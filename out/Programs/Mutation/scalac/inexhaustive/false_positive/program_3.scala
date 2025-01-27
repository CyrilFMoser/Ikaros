package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,T_B), b: T_A[(Char,Int)]) extends T_A[(T_B,Boolean)]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: T_B, b: T_B) extends T_B

val v_a: T_A[(T_B,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A((CC_C(CC_B(_), CC_C(_, _)),CC_C(CC_B(_), CC_B(_))), _) => 0 
  case CC_A((CC_B(CC_B(_)),CC_C(_, CC_C(_, _))), _) => 1 
  case CC_A((CC_B(CC_C(_, _)),CC_B(CC_C(_, _))), _) => 2 
  case CC_A((CC_C(_, CC_B(_)),CC_B(CC_C(_, _))), _) => 3 
}
}
// This is not matched: (CC_A (Tuple (CC_C (CC_C Wildcard (CC_B Wildcard T_B) T_B) Wildcard T_B)
//             (CC_B (CC_B Wildcard T_B) T_B))
//      Wildcard
//      (T_A (Tuple T_B Boolean)))