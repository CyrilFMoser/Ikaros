package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Byte]], b: T_A[T_B[Int], T_B[Int]]) extends T_A[(T_B[Int],T_A[Byte, Char]), T_A[T_A[(Byte,Char), Boolean], T_A[Boolean, Byte]]]
case class CC_B(a: T_A[CC_A, Byte]) extends T_B[T_A[(CC_A,CC_A), Int]]
case class CC_C[D](a: CC_B, b: T_B[D]) extends T_B[D]
case class CC_D[E](a: T_B[E], b: E) extends T_B[E]

val v_a: T_B[T_A[(CC_A,CC_A), Int]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_)) => 0 
  case CC_C(_, CC_C(_, _)) => 1 
  case CC_C(_, CC_D(_, _)) => 2 
  case CC_D(CC_B(_), _) => 3 
  case CC_D(CC_C(_, _), _) => 4 
  case CC_D(CC_D(_, _), _) => 5 
}
}
// This is not matched: CC_B(_)