package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_A[Boolean, Char], T_A[Int, Int]], T_A[T_A[Boolean, (Int,Byte)], T_A[Int, Char]]]
case class CC_B[E, F](a: T_A[F, E]) extends T_B[F, E]
case class CC_C[G](a: T_B[G, G], b: CC_B[G, T_A[G, G]]) extends T_B[Int, G]
case class CC_D(a: CC_A, b: T_B[T_A[CC_A, (Boolean,Char)], (Boolean,CC_A)]) extends T_B[Int, CC_A]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, CC_B(_)) => 2 
}
}