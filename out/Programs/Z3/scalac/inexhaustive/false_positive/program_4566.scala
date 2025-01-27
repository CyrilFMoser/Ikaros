package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Char, c: T_A[T_B]) extends T_A[T_B]
case class CC_C() extends T_A[T_B]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A (CC_D T_B Wildcard T_B)
//      Wildcard
//      (CC_A (CC_D T_B (CC_C Char (CC_D T_B Wildcard T_B) (T_A T_B)) T_B)
//            Wildcard
//            Wildcard
//            (T_A T_B))
//      (T_A T_B))