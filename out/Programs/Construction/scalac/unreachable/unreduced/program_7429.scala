package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: Int) extends T_A[T_B, T_A[(T_B,T_B), T_A[Byte, Char]]]
case class CC_B() extends T_A[T_B, T_A[(T_B,T_B), T_A[Byte, Char]]]
case class CC_C(a: T_A[Int, CC_B]) extends T_A[T_B, T_A[(T_B,T_B), T_A[Byte, Char]]]
case class CC_D(a: T_B, b: CC_B, c: T_B) extends T_B

val v_a: T_A[T_B, T_A[(T_B,T_B), T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(CC_D(CC_D(_, _, _), _, CC_D(_, _, _)), CC_D(CC_D(_, _, _), CC_B(), CC_D(_, _, _)), _)