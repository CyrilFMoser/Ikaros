package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_C[G](a: G) extends T_B[G]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_C Int
//      Wildcard
//      Wildcard
//      (CC_C Int
//            (CC_A Int Int Wildcard Int Wildcard (T_A Int Int))
//            Int
//            Wildcard
//            (T_B Int))
//      (T_B Int))