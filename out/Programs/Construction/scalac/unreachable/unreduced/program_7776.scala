package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_B[T_A[Int], T_A[Boolean]]]
case class CC_B(a: T_A[T_B[CC_A, Int]]) extends T_A[T_B[T_A[Int], T_A[Boolean]]]
case class CC_C[D, E](a: CC_B, b: T_A[D]) extends T_B[CC_B, D]
case class CC_D() extends T_B[CC_B, (Boolean,(CC_B,Boolean))]
case class CC_E[F](a: Int, b: CC_D, c: T_B[CC_B, F]) extends T_B[CC_B, F]

val v_a: T_B[CC_B, (Boolean,(CC_B,Boolean))] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D() => 1 
  case CC_E(_, _, CC_C(CC_B(_), _)) => 2 
  case CC_E(_, _, CC_D()) => 3 
  case CC_E(_, _, CC_E(12, CC_D(), CC_C(_, _))) => 4 
  case CC_E(_, _, CC_E(12, CC_D(), CC_D())) => 5 
  case CC_E(_, _, CC_E(12, CC_D(), CC_E(_, _, _))) => 6 
  case CC_E(_, _, CC_E(_, CC_D(), CC_D())) => 7 
  case CC_E(_, _, CC_E(_, CC_D(), CC_E(_, _, _))) => 8 
}
}
// This is not matched: CC_E(_, _, CC_E(_, CC_D(), CC_C(_, _)))