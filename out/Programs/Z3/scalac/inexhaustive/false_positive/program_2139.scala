package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B, T_B], T_A[Char, T_B]]
case class CC_B(a: CC_A, b: T_A[(Byte,Char), T_B], c: T_B) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(_, _, CC_C()) => 1 
}
}
// This is not matched: (CC_A Int Wildcard (T_A Int))