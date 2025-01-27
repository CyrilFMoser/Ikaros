package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B() extends T_A[CC_A[(Char,Int), Int], T_B[Byte, Boolean]]
case class CC_C[G](a: G) extends T_A[G, CC_B]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_E (T_A Char Int)
//      (CC_A Int Char Char (T_A Char Int))
//      (CC_B (T_A Char Int)
//            (T_A Char Int)
//            Wildcard
//            (CC_C Wildcard (T_B (T_A Char Int)))
//            Wildcard
//            (T_A (T_A Char Int) (T_A Char Int)))
//      (T_B (T_A Char Int)))