package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[(Byte,T_A[Boolean, Char]), T_A[T_A[Byte, (Char,Boolean)], Int]]
case class CC_B() extends T_A[(Byte,T_A[Boolean, Char]), T_A[T_A[Byte, (Char,Boolean)], Int]]
case class CC_C(a: T_A[T_A[CC_B, CC_B], ((Char,Boolean),CC_A)], b: Int, c: CC_B) extends T_A[(Byte,T_A[Boolean, Char]), T_A[T_A[Byte, (Char,Boolean)], Int]]

val v_a: T_A[(Byte,T_A[Boolean, Char]), T_A[T_A[Byte, (Char,Boolean)], Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B()