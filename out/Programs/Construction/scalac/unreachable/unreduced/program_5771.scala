package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_A[T_B], c: Byte) extends T_A[T_B]
case class CC_B(a: CC_A, b: Char, c: (T_A[CC_A],T_B)) extends T_A[T_B]
case class CC_C(a: CC_A, b: CC_A, c: T_A[T_B]) extends T_B
case class CC_D(a: CC_A, b: (T_A[(Char,Char)],(Char,CC_C)), c: CC_A) extends T_B
case class CC_E(a: T_B, b: T_B, c: T_B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}