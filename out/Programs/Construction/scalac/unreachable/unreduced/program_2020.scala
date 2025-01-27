package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C], c: C) extends T_A[C, Int]
case class CC_B[D](a: (T_A[T_B, Int],T_B)) extends T_A[D, Int]
case class CC_C[E](a: CC_A[E], b: T_A[E, Int]) extends T_A[E, Byte]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_, _, _),_)) => 0 
  case CC_B((CC_B(_),_)) => 1 
}
}