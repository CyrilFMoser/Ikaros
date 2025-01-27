package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, F]) extends T_A[E, (T_A[Byte, Int],T_A[Int, Byte])]
case class CC_B(a: T_A[T_A[Int, Byte], Char]) extends T_A[T_B[CC_A[Int, Boolean], T_A[Char, (Boolean,Char)]], (T_A[Byte, Int],T_A[Int, Byte])]
case class CC_C[G](a: Char) extends T_B[T_A[T_A[CC_B, Char], (Boolean,CC_B)], G]
case class CC_D[H](a: T_B[H, Int], b: CC_B) extends T_B[T_A[T_A[CC_B, Char], (Boolean,CC_B)], H]

val v_a: T_B[T_A[T_A[CC_B, Char], (Boolean,CC_B)], Int] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, CC_B(_)) => 1 
}
}