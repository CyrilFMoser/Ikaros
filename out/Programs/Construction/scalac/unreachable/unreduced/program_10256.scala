package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: T_B[T_A[Byte], T_A[Int]], b: (T_B[(Int,Int), Int],T_A[(Boolean,Char)]), c: T_A[Boolean]) extends T_A[CC_A[T_A[(Int,Boolean)]]]
case class CC_C[E](a: E, b: T_A[E]) extends T_B[E, T_A[CC_B]]
case class CC_D[F]() extends T_B[F, T_A[CC_B]]

val v_a: T_B[T_A[CC_A[T_A[(Int,Boolean)]]], T_A[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
  case CC_C(CC_B(_, (_,_), _), _) => 1 
}
}
// This is not matched: CC_D()