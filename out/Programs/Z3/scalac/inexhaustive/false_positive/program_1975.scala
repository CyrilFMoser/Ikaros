package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[Byte]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_A (CC_C Boolean Boolean)
//      Wildcard
//      (T_A (T_A (CC_C Boolean Boolean) (CC_C Boolean Boolean))
//           (CC_C Boolean Boolean)))