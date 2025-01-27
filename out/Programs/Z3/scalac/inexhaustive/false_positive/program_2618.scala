package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Int]
case class CC_C[F, G](a: (CC_A,Int), b: T_A[Char]) extends T_B[G, F]

val v_a: T_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_C((_,12), _) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Wildcard
//      Wildcard
//      (T_A (T_A (Tuple Byte Byte) Byte) (T_A Int Byte)))