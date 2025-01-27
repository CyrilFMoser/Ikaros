package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E, F]() extends T_A[F, E]
case class CC_C(a: T_A[(Boolean,Int), Int]) extends T_A[CC_B[Int, Boolean], Byte]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_C (CC_A (Tuple Boolean Int)
//            Int
//            Wildcard
//            Wildcard
//            Wildcard
//            (T_A (Tuple Boolean Int) Int))
//      (CC_A Byte
//            Byte
//            Wildcard
//            Wildcard
//            (CC_B Byte Byte Byte (T_A Byte Byte))
//            (T_A Byte Byte))
//      (CC_B Boolean
//            (Tuple Boolean Char)
//            Wildcard
//            (T_A (Tuple Boolean Char) Boolean))
//      (T_A (CC_B Int Boolean Boolean Boolean) Byte))