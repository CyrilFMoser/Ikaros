package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: (Char,T_A[Boolean, Boolean]), b: T_A[T_B[Byte, Byte], Char]) extends T_A[(T_A[Byte, Int],T_A[(Int,Int), Char]), T_B[T_B[Int, (Boolean,Int)], T_A[Byte, Boolean]]]
case class CC_B(a: T_B[T_B[CC_A, Byte], Int], b: T_A[CC_A, CC_A]) extends T_A[(T_A[Byte, Int],T_A[(Int,Int), Char]), T_B[T_B[Int, (Boolean,Int)], T_A[Byte, Boolean]]]
case class CC_C(a: Boolean, b: (T_A[CC_B, CC_B],CC_A), c: Byte) extends T_A[(T_A[Byte, Int],T_A[(Int,Int), Char]), T_B[T_B[Int, (Boolean,Int)], T_A[Byte, Boolean]]]
case class CC_D[E, F](a: F, b: CC_A) extends T_B[F, E]

val v_a: T_A[(T_A[Byte, Int],T_A[(Int,Int), Char]), T_B[T_B[Int, (Boolean,Int)], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_D(_, _), _) => 1 
  case CC_C(_, _, _) => 2 
}
}