package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Boolean]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A, b: T_B[Byte], c: (CC_A,CC_A)) extends T_A[T_A[T_A[Char]]]
case class CC_C[C](a: Char, b: Char) extends T_B[C]
case class CC_D(a: T_B[Boolean], b: T_B[T_B[CC_B]], c: T_A[CC_C[Int]]) extends T_B[T_A[(CC_B,Boolean)]]
case class CC_E(a: CC_C[CC_D], b: (CC_B,Char)) extends T_B[T_A[(CC_B,Boolean)]]

val v_a: T_B[T_A[(CC_B,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(_, 'x'), _) => 0 
  case CC_D(_, CC_C(_, _), _) => 1 
  case CC_E(_, (CC_B(_, _, _),_)) => 2 
}
}
// This is not matched: CC_C(_, _)