package Program_14 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A, (Boolean,Byte)], b: T_A) extends T_A
case class CC_C[C, D]() extends T_B[Char, C]
case class CC_D[E](a: T_B[Char, E]) extends T_B[Char, E]

val v_a: CC_D[T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_C()) => 0 
  case CC_D(CC_D(_)) => 1 
}
}
// This is not matched: (CC_D T_A (CC_C T_A T_A (T_B Char T_A)) (T_B Char T_A))
// This is not matched: (CC_E T_B)