package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A (CC_A (CC_A Wildcard Wildcard (CC_C T_A (T_B T_A)) T_A)
//            (CC_C Char (T_B Char))
//            (CC_C T_A (T_B T_A))
//            T_A)
//      Wildcard
//      Wildcard
//      T_A)