package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Byte]]) extends T_A[(T_B[Int],T_A[Char])]
case class CC_B(a: T_A[CC_A], b: T_A[T_B[Int]]) extends T_A[(T_B[Int],T_A[Char])]
case class CC_C[C](a: CC_A, b: C) extends T_B[C]
case class CC_D[D](a: T_B[D], b: CC_C[D], c: Boolean) extends T_B[D]

val v_a: T_A[(T_B[Int],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_A(_), CC_C(_, _))) => 0 
  case CC_A(CC_C(CC_A(_), CC_D(_, _, _))) => 1 
  case CC_A(CC_D(CC_C(_, _), CC_C(_, _), _)) => 2 
  case CC_A(CC_D(CC_D(_, _, _), CC_C(_, _), _)) => 3 
  case CC_B(_, _) => 4 
}
}