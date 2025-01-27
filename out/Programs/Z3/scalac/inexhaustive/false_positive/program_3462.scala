package Program_15 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, (Char,Byte)]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: C) extends T_B[T_A, C]
case class CC_E[D]() extends T_B[T_A, D]
case class CC_F[E, F]() extends T_B[T_A, E]

val v_a: T_B[T_A, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E() => 1 
  case CC_F() => 2 
}
}
// This is not matched: (CC_F (CC_C (T_B (T_B T_A T_A) T_A))
//      T_A
//      (T_B T_A (CC_C (T_B (T_B T_A T_A) T_A))))
// This is not matched: Pattern match is empty without constants