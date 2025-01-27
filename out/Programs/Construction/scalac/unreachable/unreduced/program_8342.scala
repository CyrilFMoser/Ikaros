package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[(T_B[Char],T_A[Char])]
case class CC_B(a: T_A[T_B[CC_A]], b: T_B[CC_A], c: T_B[(CC_A,Int)]) extends T_A[(T_B[Char],T_A[Char])]
case class CC_C(a: CC_A, b: T_A[Int]) extends T_A[(T_B[Char],T_A[Char])]
case class CC_D[C](a: CC_B, b: C) extends T_B[C]

val v_a: T_A[(T_B[Char],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_D(CC_B(_, _, _), CC_A()), _) => 1 
  case CC_C(CC_A(), _) => 2 
}
}