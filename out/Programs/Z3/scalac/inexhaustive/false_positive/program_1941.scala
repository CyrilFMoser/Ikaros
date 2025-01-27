package Program_31 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: (T_A,Char)) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C[C, D]() extends T_B[C, T_A]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C (CC_A T_A T_A (T_B T_A T_A)) T_A (T_B (CC_A T_A T_A (T_B T_A T_A)) T_A))
// This is not matched: (CC_C (CC_C (CC_C (CC_B Byte (CC_A (CC_B Wildcard Wildcard T_A) T_A) T_A) T_A)
//            T_A)
//      T_A)