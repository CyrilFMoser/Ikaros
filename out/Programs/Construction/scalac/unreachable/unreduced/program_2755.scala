package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: (Byte,Char), b: Int, c: T_A[Byte]) extends T_B
case class CC_C(a: (T_B,CC_A)) extends T_B
case class CC_D(a: Boolean, b: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C((CC_B(_, _, _),CC_A())) => 0 
  case CC_C((CC_C(_),CC_A())) => 1 
  case CC_C((CC_D(_, _),CC_A())) => 2 
  case CC_D(_, CC_A()) => 3 
}
}
// This is not matched: CC_B(_, _, _)