package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[C, D]

val v_a: CC_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Int
//      Char
//      (CC_A Int
//            Int
//            (CC_A Int Int Wildcard Wildcard Int (T_A Int Int))
//            Wildcard
//            Wildcard
//            (T_A Int Int))
//      Wildcard
//      Wildcard
//      (T_A Int Char))