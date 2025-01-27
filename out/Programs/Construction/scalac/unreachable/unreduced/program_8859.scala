package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: (Boolean,T_B[(Boolean,Byte), Char]), b: T_A[E, E]) extends T_A[E, F]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C[I](a: T_A[I, I]) extends T_B[I, T_A[CC_B[Int, Byte], Int]]
case class CC_D[J]() extends T_B[J, T_A[CC_B[Int, Byte], Int]]
case class CC_E(a: Byte, b: Int) extends T_B[Int, T_A[CC_B[Int, Byte], Int]]

val v_a: T_B[T_B[Int, T_A[CC_B[Int, Byte], Int]], T_A[CC_B[Int, Byte], Int]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A((_,_), _)) => 0 
  case CC_C(CC_B()) => 1 
  case CC_D() => 2 
}
}