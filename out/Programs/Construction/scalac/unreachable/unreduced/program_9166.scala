package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Boolean, Char], (T_A[Boolean, Byte],Byte)]
case class CC_B(a: Char, b: T_A[CC_A, Int], c: Boolean) extends T_A[T_A[Boolean, Char], (T_A[Boolean, Byte],Byte)]
case class CC_C[C](a: CC_B, b: CC_B) extends T_A[C, CC_A]

val v_a: T_A[T_A[Boolean, Char], (T_A[Boolean, Byte],Byte)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}