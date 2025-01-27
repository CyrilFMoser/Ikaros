package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: T_B, c: T_B) extends T_A[B]
case class CC_B[C, D]() extends T_A[C]
case class CC_C() extends T_B

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_C(), CC_C()) => 1 
  case CC_A(CC_B(), CC_C(), _) => 2 
  case CC_A(_, _, _) => 3 
}
}
// This is not matched: (CC_B Byte T_B (T_A Byte))
// This is not matched: (CC_B (T_B (Tuple Boolean Boolean) Char)
//      Byte
//      (T_B (T_B (Tuple Boolean Boolean) Char) Byte))