package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Byte,Char)]) extends T_A[T_B[T_A[Char]]]
case class CC_B(a: Char, b: T_B[T_A[Boolean]], c: CC_A) extends T_A[T_B[T_A[Char]]]
case class CC_C[C](a: C, b: Byte, c: C) extends T_B[C]
case class CC_D[D](a: CC_B) extends T_B[D]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_C(_, _, _), _) => 1 
  case CC_B(_, CC_D(_), _) => 2 
}
}