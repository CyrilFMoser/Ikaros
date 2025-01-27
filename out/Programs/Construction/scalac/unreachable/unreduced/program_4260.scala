package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_A[T_B[Boolean, (Boolean,Char)]]]
case class CC_B(a: T_A[T_A[(Int,Int)]], b: Boolean, c: T_A[Char]) extends T_A[T_A[T_B[Boolean, (Boolean,Char)]]]
case class CC_C[E, D](a: T_B[D, E], b: D, c: CC_A) extends T_B[E, D]
case class CC_D[F, G](a: T_A[F], b: Boolean) extends T_B[G, F]
case class CC_E[H, I]() extends T_B[I, H]

val v_a: T_B[CC_A, Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, CC_A(_), _), _, CC_A(_)) => 0 
  case CC_C(CC_D(_, _), _, CC_A(_)) => 1 
  case CC_D(_, _) => 2 
  case CC_E() => 3 
}
}
// This is not matched: CC_C(CC_E(), _, CC_A(_))