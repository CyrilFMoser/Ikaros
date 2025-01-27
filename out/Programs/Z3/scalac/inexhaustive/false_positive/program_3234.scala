package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[F]() extends T_A[F, T_A[Int, Int]]
case class CC_C(a: Int) extends T_A[CC_B[Boolean], T_A[Int, Int]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A Int
//      Int
//      Wildcard
//      Wildcard
//      (CC_B Int
//            Int
//            (CC_A Int Int Wildcard Char Wildcard (T_A Int Int))
//            Int
//            Byte
//            (T_A Int Int))
//      (T_A Int Int))