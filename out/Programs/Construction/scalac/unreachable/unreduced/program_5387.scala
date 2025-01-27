package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_B[D]) extends T_A[D]
case class CC_C[E](a: E) extends T_A[E]
case class CC_D(a: CC_C[CC_A[Byte]]) extends T_B[CC_B[T_A[(Byte,Byte)]]]
case class CC_E(a: T_B[CC_C[Int]], b: CC_D) extends T_B[CC_C[Int]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _)) => 1 
  case CC_A(CC_C(_)) => 2 
  case CC_B(_, _) => 3 
  case CC_C(_) => 4 
}
}