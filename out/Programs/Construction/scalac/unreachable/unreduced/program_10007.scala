package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, T_A[T_B, T_A[T_B, T_B]]]
case class CC_B[D](a: D, b: T_A[D, D], c: T_A[D, D]) extends T_A[D, T_A[T_B, T_A[T_B, T_B]]]
case class CC_C(a: CC_B[CC_A[T_B]], b: CC_A[Int], c: ((T_B,Byte),CC_B[T_B])) extends T_B
case class CC_D(a: Boolean, b: T_B, c: CC_B[T_A[(Char,Byte), Char]]) extends T_B

val v_a: T_A[CC_D, T_A[T_B, T_A[T_B, T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(true, _, _)) => 0 
  case CC_A(CC_D(false, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}