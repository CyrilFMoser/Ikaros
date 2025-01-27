package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Int], b: (T_A[Int],T_A[Int])) extends T_A[Int]
case class CC_B(a: T_A[T_B[CC_A]], b: Int) extends T_A[Int]
case class CC_C[C]() extends T_B[C]
case class CC_D[D]() extends T_B[D]
case class CC_E[E](a: T_B[E], b: E, c: (T_B[CC_A],T_B[CC_B])) extends T_B[E]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),CC_A(_, _))) => 0 
  case CC_A(_, (CC_A(_, _),CC_B(_, _))) => 1 
  case CC_A(_, (CC_B(_, _),CC_A(_, _))) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: CC_A(_, (CC_B(_, _),CC_B(_, _)))