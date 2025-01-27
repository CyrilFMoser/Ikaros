package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_B[C], c: C) extends T_A[C]
case class CC_B[D](a: T_A[D]) extends T_A[D]
case class CC_C[E](a: CC_B[E], b: T_A[E]) extends T_A[E]
case class CC_D(a: T_A[T_A[Boolean]], b: CC_C[T_A[Int]], c: T_A[T_A[(Int,Char)]]) extends T_B[T_A[(Byte,Byte)]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), CC_B(CC_A(_, _, _))) => 2 
  case CC_C(CC_B(_), CC_B(CC_B(_))) => 3 
  case CC_C(CC_B(_), CC_B(CC_C(_, _))) => 4 
  case CC_C(CC_B(_), CC_C(_, _)) => 5 
}
}
// This is not matched: CC_C(CC_B(_), CC_A(_, _, _))