package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[T_A[Int]], b: T_A[Int]) extends T_A[Int]
case class CC_C[C]() extends T_B[C]
case class CC_D[D](a: (T_B[CC_A],T_A[CC_A]), b: T_B[D], c: T_B[D]) extends T_B[D]
case class CC_E(a: T_B[T_B[CC_A]]) extends T_B[T_B[T_B[Char]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
}
}