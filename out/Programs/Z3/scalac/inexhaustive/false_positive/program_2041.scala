package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[(Boolean,Boolean)]
case class CC_B() extends T_A[(Boolean,Boolean)]
case class CC_D[C](a: C, b: T_A[C]) extends T_B[C]

val v_a: T_B[T_A[(Boolean,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _) => 0 
}
}
// This is not matched: (CC_E (T_A (Tuple Boolean Boolean))
//      Wildcard
//      Byte
//      (T_B (T_A (Tuple Boolean Boolean))))