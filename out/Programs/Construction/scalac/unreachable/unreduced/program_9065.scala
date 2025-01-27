package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: (T_A[T_B, Byte],T_B)) extends T_A[C, Byte]
case class CC_B[D](a: T_A[T_B, D], b: Byte, c: CC_A[T_A[D, Byte]]) extends T_A[T_B, D]
case class CC_C[E](a: T_A[E, Byte], b: Int, c: Char) extends T_A[E, Byte]
case class CC_D(a: CC_A[CC_A[T_B]], b: Boolean, c: CC_B[CC_C[T_B]]) extends T_B
case class CC_E(a: T_A[T_A[CC_D, (Boolean,Int)], Byte], b: CC_A[(T_B,CC_D)], c: (CC_C[Int],(CC_D,Int))) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_B(CC_B(_, _, _), 0, _)) => 0 
  case CC_D(_, _, CC_B(CC_B(_, _, _), _, _)) => 1 
  case CC_E(CC_A(_, (_,_)), _, _) => 2 
  case CC_E(CC_C(_, _, _), _, _) => 3 
}
}