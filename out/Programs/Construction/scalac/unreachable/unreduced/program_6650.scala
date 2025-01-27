package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: C) extends T_A[C]
case class CC_B(a: T_A[T_A[Char]], b: (T_A[Boolean],Byte)) extends T_A[CC_A[Byte]]
case class CC_C[D](a: D, b: Int, c: CC_B) extends T_A[D]
case class CC_D() extends T_B[T_A[T_A[CC_B]]]
case class CC_E(a: CC_C[T_A[CC_D]], b: T_A[CC_A[Byte]], c: T_B[CC_C[CC_B]]) extends T_B[T_A[T_A[CC_B]]]
case class CC_F(a: CC_B, b: T_A[T_B[Char]]) extends T_B[T_A[T_A[CC_B]]]

val v_a: T_B[T_A[T_A[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_A(_, CC_A(_, _)), _) => 1 
  case CC_E(_, CC_B(_, _), _) => 2 
  case CC_E(_, CC_C(_, _, CC_B(_, _)), _) => 3 
  case CC_F(CC_B(CC_A(_, _), _), _) => 4 
  case CC_F(CC_B(CC_C(_, _, _), _), _) => 5 
}
}