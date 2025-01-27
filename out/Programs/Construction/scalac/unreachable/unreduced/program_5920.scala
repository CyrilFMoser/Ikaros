package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_B[F, F], b: T_B[F, F]) extends T_A[F, T_A[F, F]]
case class CC_C[H, G](a: T_B[H, H], b: T_B[H, H], c: T_A[G, T_A[G, G]]) extends T_B[H, G]
case class CC_D[I]() extends T_B[I, CC_C[CC_A[Boolean], T_B[(Boolean,Byte), Boolean]]]
case class CC_E() extends T_B[CC_A[T_A[(Boolean,Byte), (Int,Int)]], CC_C[CC_A[Boolean], T_B[(Boolean,Byte), Boolean]]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}