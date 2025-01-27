package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Int
//      (CC_A Int (T_A Int (T_A Byte Boolean)))
//      (CC_A Int (T_A Int (T_A Byte Boolean)))
//      Wildcard
//      (T_A Int (T_A Byte Boolean)))