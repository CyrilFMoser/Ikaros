package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, (Int,Byte)], c: E) extends T_A[E, (Int,Byte)]
case class CC_B[F](a: (T_B[Int, Byte],CC_A[Byte]), b: CC_A[F], c: T_A[F, (Int,Byte)]) extends T_B[(Byte,T_A[Boolean, Boolean]), F]
case class CC_C(a: CC_A[T_A[Char, Int]], b: T_A[CC_A[(Boolean,Byte)], Boolean], c: (CC_B[Char],Byte)) extends T_B[(Byte,T_A[Boolean, Boolean]), T_A[CC_B[Int], (Int,Byte)]]
case class CC_D[G, H](a: CC_A[H], b: CC_C, c: CC_B[G]) extends T_B[H, G]

val v_a: T_B[(Byte,T_A[Boolean, Boolean]), CC_C] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _), _) => 0 
  case CC_D(_, CC_C(_, _, _), _) => 1 
}
}