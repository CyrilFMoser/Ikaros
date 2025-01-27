package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: (T_B[Boolean, Char],T_B[(Int,Char), Boolean]), c: Byte) extends T_A[D]
case class CC_B(a: CC_A[T_A[Int]], b: T_B[Boolean, T_A[Char]]) extends T_A[T_A[CC_A[Char]]]
case class CC_C[E](a: E, b: T_A[E]) extends T_A[E]
case class CC_D[F](a: F, b: CC_C[F]) extends T_B[CC_C[F], F]
case class CC_E(a: CC_D[(CC_B,(Byte,Char))], b: CC_D[T_A[CC_B]], c: T_B[(CC_B,CC_B), CC_C[CC_B]]) extends T_B[CC_C[T_B[(CC_B,Byte), T_B[CC_B, Int]]], T_B[(CC_B,Byte), T_B[CC_B, Int]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_C(_, CC_A(_, _, _)) => 1 
  case CC_C(_, CC_C(_, CC_A(_, _, _))) => 2 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 3 
}
}