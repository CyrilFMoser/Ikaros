package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_D() extends T_B
case class CC_F() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
}
}
// This is not matched: (CC_A (CC_D T_B Wildcard T_B)
//      Wildcard
//      (CC_A (CC_D T_B (CC_C Char (CC_D T_B Wildcard T_B) (T_A T_B)) T_B)
//            Wildcard
//            Wildcard
//            (T_A T_B))
//      (T_A T_B))