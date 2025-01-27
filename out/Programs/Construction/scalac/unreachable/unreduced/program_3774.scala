package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F], b: T_A[E, E]) extends T_A[F, E]
case class CC_B[H, G](a: T_B[H, H]) extends T_A[H, G]
case class CC_C(a: CC_A[T_A[Char, Char], T_A[Boolean, Int]]) extends T_A[T_B[((Boolean,Int),Byte), T_A[Int, Boolean]], T_A[Boolean, T_B[(Boolean,Boolean), Boolean]]]
case class CC_D[I](a: I, b: T_A[I, I], c: T_B[CC_B[I, I], I]) extends T_B[I, CC_A[I, I]]
case class CC_E() extends T_B[T_A[(CC_C,CC_C), CC_B[Int, Boolean]], CC_A[T_A[(CC_C,CC_C), CC_B[Int, Boolean]], T_A[(CC_C,CC_C), CC_B[Int, Boolean]]]]

val v_a: T_B[T_A[(CC_C,CC_C), CC_B[Int, Boolean]], CC_A[T_A[(CC_C,CC_C), CC_B[Int, Boolean]], T_A[(CC_C,CC_C), CC_B[Int, Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, CC_A(_, _)), _, _) => 0 
  case CC_D(CC_A(_, CC_B(_)), _, _) => 1 
  case CC_D(CC_B(_), _, _) => 2 
  case CC_E() => 3 
}
}