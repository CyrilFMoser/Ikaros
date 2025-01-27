package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B, c: (Byte,T_B)) extends T_A[T_A[Char, T_A[Int, T_B]], C]
case class CC_B[D](a: CC_A[D]) extends T_A[T_A[Char, T_A[Int, T_B]], D]
case class CC_C(a: T_A[CC_B[T_B], CC_A[T_B]], b: CC_B[CC_B[T_B]], c: CC_A[Byte]) extends T_B
case class CC_D(a: ((T_B,T_B),CC_C), b: Byte) extends T_B
case class CC_E(a: CC_A[CC_A[CC_D]], b: T_B, c: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_), CC_A(_, _, _)) => 0 
  case CC_D((_,_), _) => 1 
  case CC_E(_, _, _) => 2 
}
}