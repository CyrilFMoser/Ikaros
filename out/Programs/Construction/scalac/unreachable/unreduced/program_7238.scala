package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: (T_A[Int],T_B[Byte]), c: C) extends T_A[C]
case class CC_B[D](a: T_A[D]) extends T_A[D]
case class CC_C(a: T_A[T_A[Char]], b: CC_B[T_A[Boolean]], c: T_A[T_B[Byte]]) extends T_B[T_A[CC_B[Int]]]
case class CC_D(a: T_A[Boolean], b: T_A[T_A[Char]], c: Boolean) extends T_B[T_A[CC_B[Int]]]
case class CC_E(a: T_A[T_B[CC_D]], b: T_A[Char]) extends T_B[T_A[CC_B[Int]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_), _)) => 0 
  case CC_B(CC_B(CC_A(_, _, _))) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
}
}
// This is not matched: CC_A(_, _, _)