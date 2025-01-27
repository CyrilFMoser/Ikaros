package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_B(a: T_B[Char], b: (Byte,Byte)) extends T_B[T_A[Boolean]]

val v_a: T_B[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,0)) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      Wildcard
//      (CC_B (CC_A Wildcard Wildcard (CC_A Wildcard Wildcard Wildcard T_A) T_A)
//            (CC_A Wildcard Wildcard Wildcard T_A)
//            T_A)
//      T_A)