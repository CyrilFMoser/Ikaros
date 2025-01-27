package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_B[T_A[Byte]], c: T_A[T_B[Byte]]) extends T_A[T_B[T_A[Char]]]
case class CC_B(a: CC_A) extends T_A[T_B[T_A[Char]]]
case class CC_C(a: Int, b: Int, c: T_B[T_A[CC_A]]) extends T_A[T_B[T_A[Char]]]
case class CC_D[C, D](a: Byte) extends T_B[C]
case class CC_E(a: CC_A) extends T_B[Int]
case class CC_F(a: CC_B, b: (Int,T_A[CC_B])) extends T_B[(T_A[CC_A],CC_C)]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(0), _) => 0 
  case CC_A(_, CC_D(_), _) => 1 
  case CC_B(_) => 2 
  case CC_C(12, _, CC_D(_)) => 3 
  case CC_C(_, _, CC_D(_)) => 4 
}
}