package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Int], b: T_A[Int]) extends T_A[Int]
case class CC_B(a: T_B[CC_A, Int], b: (T_B[Char, CC_A],T_A[(Byte,Byte)]), c: Boolean) extends T_A[Int]
case class CC_C(a: CC_B, b: (CC_A,CC_B), c: T_A[CC_B]) extends T_A[Int]
case class CC_D[D](a: D) extends T_B[D, T_A[D]]
case class CC_E(a: CC_A) extends T_B[T_A[Byte], T_A[T_A[Byte]]]

val v_a: T_B[T_A[Byte], T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_A(CC_A(_, _), _)) => 1 
  case CC_E(CC_A(CC_B(_, _, _), _)) => 2 
  case CC_E(CC_A(CC_C(_, _, _), _)) => 3 
}
}