package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_E[M](a: M) extends T_B[M, (Boolean,Int)]
case class CC_F() extends T_B[T_A[(Byte,Char), Int], (Boolean,Int)]

val v_a: CC_E[T_B[T_A[(Byte,Char), Int], (Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_E(CC_E(_)) => 0 
}
}
// This is not matched: (CC_E (T_B (T_A (Tuple Byte Char) Int) (Tuple Boolean Int))
//      (CC_D (Tuple Boolean Int)
//            (T_A (Tuple Byte Char) Int)
//            Wildcard
//            Wildcard
//            Wildcard
//            (T_B (T_A (Tuple Byte Char) Int) (Tuple Boolean Int)))
//      (T_B (T_B (T_A (Tuple Byte Char) Int) (Tuple Boolean Int))
//           (Tuple Boolean Int)))