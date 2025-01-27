package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: Boolean, c: T_A[T_B[Boolean]]) extends T_A[T_B[T_A[Byte]]]
case class CC_B(a: CC_A, b: T_B[T_B[(Char,Char)]], c: (CC_A,T_A[CC_A])) extends T_A[T_B[T_A[Byte]]]
case class CC_C[C](a: T_B[C], b: CC_B) extends T_B[C]
case class CC_D[D]() extends T_B[D]

val v_a: T_A[T_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_C(CC_C(_, _), CC_B(_, _, _)), _) => 1 
  case CC_B(_, CC_C(CC_D(), CC_B(_, _, _)), _) => 2 
}
}
// This is not matched: CC_B(_, CC_D(), _)