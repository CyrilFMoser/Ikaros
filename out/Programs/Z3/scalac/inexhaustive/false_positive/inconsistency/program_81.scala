package Program_31 

object Test {
sealed trait T_A[A]
case class CC_B(a: T_A[Boolean], b: Byte) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
}
}
// This is not matched: (CC_D (CC_A Int
//            (CC_C Wildcard Wildcard)
//            Wildcard
//            (T_A Int (CC_C Wildcard Wildcard)))
//      T_B)