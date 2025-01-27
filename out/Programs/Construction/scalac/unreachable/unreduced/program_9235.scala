package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Byte], b: T_B[(Int,Int), T_B[Boolean, Int]]) extends T_A[T_B[T_A[Char], (Boolean,Boolean)]]
case class CC_B[D](a: CC_A, b: Char, c: T_A[T_B[Boolean, Boolean]]) extends T_A[D]
case class CC_C(a: T_A[CC_A]) extends T_A[T_B[T_A[Char], (Boolean,Boolean)]]
case class CC_D[F](a: T_A[F], b: T_A[F], c: F) extends T_B[F, Byte]
case class CC_E[G]() extends T_B[G, Byte]
case class CC_F[H]() extends T_B[H, Byte]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_A(_, _), 'x', CC_B(_, _, _)), CC_B(_, _, _), _) => 0 
  case CC_D(CC_B(CC_A(_, _), _, CC_B(_, _, _)), CC_B(_, _, _), _) => 1 
  case CC_F() => 2 
}
}
// This is not matched: CC_E()